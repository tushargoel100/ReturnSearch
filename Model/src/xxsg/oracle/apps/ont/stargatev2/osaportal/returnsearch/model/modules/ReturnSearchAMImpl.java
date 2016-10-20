package xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.modules;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.Session;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;


import oracle.jbo.server.ViewObjectImpl;

import xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.modules.common.ReturnSearchAM;
import xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.views.HeaderResultsVOImpl;
import xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.views.ReturnSearchParamsVOImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jul 12 12:10:56 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReturnSearchAMImpl extends ApplicationModuleImpl implements ReturnSearchAM {
    
    public static int NUMBER = Types.NUMERIC;
    private Number vRet;
    
    /**
     * This is the default constructor (do not remove).
     */
    public ReturnSearchAMImpl() {
    }   

    /**
     * Container's getter for ReturnSearchParams1.
     * @return ReturnSearchParams1
     */
    public ReturnSearchParamsVOImpl getReturnSearchParams1() {
        return (ReturnSearchParamsVOImpl) findViewObject("ReturnSearchParams1");
    }


    /**
     * Container's getter for HeaderResultsVO1.
     * @return HeaderResultsVO1
     */
    public HeaderResultsVOImpl getHeaderResultsVO1() {
        return (HeaderResultsVOImpl) findViewObject("HeaderResultsVO1");
    }

    /**
     * Container's getter for LineResultsVO1.
     * @return LineResultsVO1
     */
    public ViewObjectImpl getLineResultsVO1() {
        return (ViewObjectImpl) findViewObject("LineResultsVO1");
    }

    /**
     * Container's getter for HeaderLinesVL1.
     * @return HeaderLinesVL1
     */
    public ViewLinkImpl getHeaderLinesVL1() {
        return (ViewLinkImpl) findViewLink("HeaderLinesVL1");
    }
    
    @Override
    protected void prepareSession(Session session) {
        // TODO Implement this method
        super.prepareSession(session);
        authenticateUser(1);
        //        System.out.println("Call Prepare Session");

    }

    public Number authenticateUser(Number vAut) {
        Number fnRetValue = callStoredProcedure("begin  xxsg2_osa_login_pkg.set_context(?,?); end;", new Object[] {

                                                } );


        return fnRetValue;
    }
    
    public Number callStoredProcedure(String stmt, Object[] param) {
        CallableStatement st = null;
        try {

            // 1. Create the CallableStatement for the PL/SQL block
            st = getDBTransaction().createCallableStatement(stmt, 0);

            // 2. Register the positions and types of the OUT parameters
            st.registerOutParameter(2, NUMBER);
            // 3. Set the bind values of the IN parameters
            st.setObject(1, 1);

            // 4. Execute the statement
            st.executeUpdate();

            // 5. Create an array to hold the multiple return values

            //            String retStr[] =;

            vRet = (Number) st.getObject(2);

            System.out.println("obejct val4 " + st.getObject(2));


            // 7. Return the result
            return vRet;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new JboException(e);
        } finally {
            if (st != null) {
                try {
                    // 10. Close the JDBC CallableStatement
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void init(){
        System.out.println("init called");
        this.getReturnSearchParams1().clearCache();
        this.getHeaderResultsVO1().clearCache();
        this.getLineResultsVO1().clearCache();
        executeEmptyRowset();
    }
        
    public void executeEmptyRowset(){
        getHeaderResultsVO1().executeEmptyRowSet();
    }
    
    public void resetAction(){
        getReturnSearchParams1().executeQuery();
    }
    
    public void searchAction(){
        Row currentRow = getReturnSearchParams1().first();
        ViewObjectImpl resultVO = getHeaderResultsVO1();
         resultVO.setWhereClause(null);
        
//        resultVO.setApplyViewCriteriaName();
        resultVO.setNamedWhereClauseParam("p_return_number", currentRow.getAttribute(0));
        resultVO.setNamedWhereClauseParam("p_order_ref", currentRow.getAttribute(1));
        resultVO.setNamedWhereClauseParam("p_client", currentRow.getAttribute(16));
        resultVO.setNamedWhereClauseParam("p_web_user_id", currentRow.getAttribute(3));
        resultVO.setNamedWhereClauseParam("p_status", currentRow.getAttribute(4));
        resultVO.setNamedWhereClauseParam("p_return_type", currentRow.getAttribute(5));
        resultVO.setNamedWhereClauseParam("p_retrurn_reason", currentRow.getAttribute(6));
        //resultVO.setNamedWhereClauseParam("p_payment_method_code", currentRow.getAttribute(7));
        resultVO.setNamedWhereClauseParam("p_refund_method_code", currentRow.getAttribute(8));
        resultVO.setNamedWhereClauseParam("p_sku_number", currentRow.getAttribute(9));
        resultVO.setNamedWhereClauseParam("p_email", currentRow.getAttribute(10));
        resultVO.setNamedWhereClauseParam("p_loyalty_card", currentRow.getAttribute(11));
        resultVO.setNamedWhereClauseParam("p_service_request", currentRow.getAttribute(12));
        resultVO.setNamedWhereClauseParam("p_return_date_from", currentRow.getAttribute(13));
        resultVO.setNamedWhereClauseParam("p_return_date_to", currentRow.getAttribute(14));
      
        resultVO.executeQuery();
    }
    
    public void throwException(String message){
        throw new JboException(message);
    }

}

