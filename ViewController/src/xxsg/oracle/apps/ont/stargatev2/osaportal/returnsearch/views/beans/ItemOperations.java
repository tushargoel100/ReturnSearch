package xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.views.beans;

import javax.faces.event.ActionEvent;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.views.HeaderResultsVORowImpl;
import xxsg.oracle.apps.ont.stargatev2.utils.ADFUtils;

public class ItemOperations {
    
    private String param_header_id;
    
    public ItemOperations() {
        super();
    }

    public void setParam_header_id(String param_header_id) {
        this.param_header_id = param_header_id;
        System.out.println("LOG_INFO : passing header ID ->> " + param_header_id);
    }

    public String getParam_header_id() {
        return param_header_id;
    }
    
    private void setHeaderId(){
        String headerId = null;
        ViewObject vo = ADFUtils.findIterator("HeaderResultsVO1Iterator").getViewObject();
        Row[] filteredrows = vo.getFilteredRows("Selected", "true");
        for(int i = 0; i < filteredrows.length; i++){
            HeaderResultsVORowImpl row = (HeaderResultsVORowImpl) filteredrows[i];
            if(headerId == null)
                headerId = row.getAttribute("HeaderId").toString();
            else{
                headerId = headerId+","+row.getAttribute("HeaderId").toString();
            }
        }
        setParam_header_id(headerId);
    }

    public String cancelOrder(ActionEvent actionEvent) {
        setHeaderId();
        return "cancel";
    }
    
}
