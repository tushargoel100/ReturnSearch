package xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.views.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.jbo.Row;

import xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.views.ReturnSearchParamsVORowImpl;
import xxsg.oracle.apps.ont.stargatev2.utils.ADFUtils;
import xxsg.oracle.apps.ont.stargatev2.utils.JSFUtils;

public class SearchResultsMB {
    
    private List<ValueFilter> searchParams;  
    private Boolean advanceEnable = false;
    private String msg;
    private Map<String, Object> returnSearchParamMap = new HashMap<String, Object>(); //For Calling OsaDetaol Page

    public SearchResultsMB() {
       System.out.println("Return search contructor");
        searchParams = new ArrayList<ValueFilter>();
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setSearchParams(List<ValueFilter> searchParams) {
        this.searchParams = searchParams;
    }

    public List<ValueFilter> getSearchParams() {
        return searchParams;
    }
    
    public Boolean getAdvanceEnable() {
        return advanceEnable;
    }
    
    public void setReturnSearchParamMap(Map<String, Object> returnSearchParamMap) {
        this.returnSearchParamMap = returnSearchParamMap;
    }

    public Map<String, Object> getReturnSearchParamMap() {
        return returnSearchParamMap;
    }
    
    private Object getAttrVal(String attr) throws ParseException {
            Object dateString = JSFUtils.resolveExpression("#{bindings." + attr + ".inputValue}");
            Date date;
            if(dateString != null && !dateString.equals("")){
                date = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy").parse(dateString.toString());
           
                //AdfFacesContext.getCurrentInstance().getPageFlowScope().put("param_call_mode", "EN"); 
                if (JSFUtils.resolveExpression("#{pageFlowScope.param_call_mode}") != null &&
                    JSFUtils.resolveExpression("#{pageFlowScope.param_call_mode}").equals("EN"))
                    return(new SimpleDateFormat("MM-dd-yy").format(date));
                else
                    return(new SimpleDateFormat("dd-MM-yy").format(date));
            }
            return null;
    }

    private Object getAttributeValue(String attr){
        if(attr.equals("Fromdate") || attr.equals("Todate")){
            try {
                return getAttrVal(attr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return JSFUtils.resolveExpression("#{bindings." + attr + ".inputValue}");
    }
    
    public void addSearchParams(){
        searchParams = new ArrayList<ValueFilter>();
        Row currentRow = ADFUtils.findIterator("ReturnSearchParams1Iterator").getCurrentRow();
        String[] attributes = currentRow.getAttributeNames();
    
        Object attrVal = null;
        Object attrBindingType;
        Object attrDisplayKey;
        
            for(String attr : attributes){
                if(attr.equals("ClientId"))
                    continue;
                
                attrVal = getAttributeValue(attr);
                    
                attrBindingType = JSFUtils.resolveExpression("#{bindings." + attr + ".selectedValue}");
                if (attrVal != null && attrVal.toString() != "") {

                    //get resource bundle key from custom property of attribute
                    attrDisplayKey =
                        JSFUtils.resolveExpression("#{bindings." + attr + ".attributeDef.properties.resource_hint}");

                    //get the display value instead of input value if the attribute is LOV
                    if (attrBindingType != null) {
            //                    searchParams.add(new ValueFilter(paramName, paramLabel, paramValue));
                        searchParams.add(new ValueFilter(attr,
                                                         JSFUtils.resolveExpression("#{bundle['" + attrDisplayKey +
                                                                                        "']}").toString(),
                                                         JSFUtils.resolveExpression("#{bindings." + attr +
                                                                                        ".selectedValue.attributeValues[1]}").toString()));

                    } else {
                        searchParams.add(new ValueFilter(attr,
                                                         JSFUtils.resolveExpression("#{bundle['" + attrDisplayKey +
                                                                                        "']}").toString(),
                                                             attrVal.toString()));
                    }
                }

            }
    }

    public void toggleAdvanceEnable(ActionEvent actionEvent) {
        if (this.advanceEnable == false)
            this.advanceEnable = true;
        else
            this.advanceEnable = false;
    }

    public void hideFilter(ActionEvent actionEvent) {
        Object attr = actionEvent.getComponent().getAttributes().get("field");
        Object object = actionEvent.getComponent().getAttributes().get("item");
        if(attr.equals("Fromdate") || attr.equals("Todate")){
            ADFUtils.findIterator("ReturnSearchParams1Iterator").getCurrentRow().setAttribute("Fromdate", null);
            ADFUtils.findIterator("ReturnSearchParams1Iterator").getCurrentRow().setAttribute("Todate", null);
        }else{
            ADFUtils.findIterator("ReturnSearchParams1Iterator").getCurrentRow().setAttribute(attr.toString(), null);
        }
        searchParams.remove(object);
        search(actionEvent);
    }
    
    public void clear(ActionEvent actionEvent){
        searchParams.clear();
        ADFUtils.findOperation("resetAction").execute();
        ADFUtils.findOperation("executeEmptyRowset").execute();
    }
    
    public void search(ActionEvent actionEvent){
        Row currRow = ADFUtils.findIterator("ReturnSearchParams1Iterator").getCurrentRow();
        if (currRow.getAttribute(0) == null && currRow.getAttribute(1) == null && currRow.getAttribute(2) == null &&
            currRow.getAttribute(3) == null && currRow.getAttribute(4) == null &&
            currRow.getAttribute(13) == null && currRow.getAttribute(14) == null) {
            setMsg(JSFUtils.resolveExpression("#{bundle['XXSG_OSA_CLIENT_MSG1_ERR']}").toString() + " " +
                JSFUtils.resolveExpression("#{bundle['XXSG_OSA_RETURN_NUMBER']}").toString() + ", " + 
                JSFUtils.resolveExpression("#{bundle['XXSG_OSA_ORDER_REF']}").toString() + ", " +
                JSFUtils.resolveExpression("#{bundle['XXSG_OSA_CLIENT']}").toString() + ", " +
                JSFUtils.resolveExpression("#{bundle['XXSG_OSA_WEB_USER_ID']}").toString() + ", " +
                JSFUtils.resolveExpression("#{bundle['XXSG_OSA_RETURN_SEARCH_FROM']}").toString() + " or " +
                JSFUtils.resolveExpression("#{bundle['XXSG_OSA_DATE_TO']}").toString() + ".");
            ADFUtils.findOperation("throwException").execute();
        }else if(((currRow.getAttribute(13) == null)) && (!(currRow.getAttribute(14) == null))){
            setMsg("Enter both dates " +
                JSFUtils.resolveExpression("#{bundle['XXSG_OSA_RETURN_SEARCH_FROM']}").toString() + " and " +
                JSFUtils.resolveExpression("#{bundle['XXSG_OSA_DATE_TO']}").toString() + ".");
            ADFUtils.findOperation("throwException").execute();
        } else {
            ADFUtils.findOperation("searchAction").execute();
            addSearchParams();
        }
    }

    public void callCustomerDetail(ActionEvent actionEvent) {
        Row curRowHS = ADFUtils.findIterator("HeaderResultsVO1Iterator").getCurrentRow();
        if (curRowHS != null) {
            if (curRowHS.getAttribute("CustAccountId") != null) {
                returnSearchParamMap.put("param_account_number", curRowHS.getAttribute("CustAccountId").toString());
            }
            navigation("callCust");
        }   
    }
    
    public void navigation(String navigation) {
        NavigationHandler nvHndlr = FacesContext.getCurrentInstance().getApplication().getNavigationHandler();
        nvHndlr.handleNavigation(FacesContext.getCurrentInstance(), null, navigation);
    }

    public void callRmaDetails(ActionEvent actionEvent) {
        Row curRowHS = ADFUtils.findIterator("HeaderResultsVO1Iterator").getCurrentRow();
        if (curRowHS != null) {
            if (curRowHS.getAttribute("Returnnumber") != null) {
                returnSearchParamMap.put("param_return_number", curRowHS.getAttribute("Returnnumber").toString());
            }
            navigation("callRMA");
        }
    }

    public void valueChange(ValueChangeEvent valueChangeEvent) {
        ReturnSearchParamsVORowImpl row = new ReturnSearchParamsVORowImpl();
        System.out.println("print order type order type" + row.getOrdertype());
    }
}
