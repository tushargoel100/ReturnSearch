package xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.views;

import java.util.Date;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 20 15:28:44 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReturnSearchParamsVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Returnnumber,
        Orderref,
        Client,
        Webuserid,
        Status,
        Returntype,
        Returnreason,
        Paymentmethod,
        Reimbursmentmethod,
        Articlecode,
        Email,
        Loyaltycard,
        Rs,
        Fromdate,
        Todate,
        Ordertype,
        ClientId,
        OrderStatusVC,
        TransactionTypeLOV1,
        PaymentMethodVC,
        ReturnReasonVC,
        WebUserIdLOV1,
        ClientLOV1,
        RefundMethodVC,
        ClientEmailLOV1;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int RETURNNUMBER = AttributesEnum.Returnnumber.index();
    public static final int ORDERREF = AttributesEnum.Orderref.index();
    public static final int CLIENT = AttributesEnum.Client.index();
    public static final int WEBUSERID = AttributesEnum.Webuserid.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int RETURNTYPE = AttributesEnum.Returntype.index();
    public static final int RETURNREASON = AttributesEnum.Returnreason.index();
    public static final int PAYMENTMETHOD = AttributesEnum.Paymentmethod.index();
    public static final int REIMBURSMENTMETHOD = AttributesEnum.Reimbursmentmethod.index();
    public static final int ARTICLECODE = AttributesEnum.Articlecode.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int LOYALTYCARD = AttributesEnum.Loyaltycard.index();
    public static final int RS = AttributesEnum.Rs.index();
    public static final int FROMDATE = AttributesEnum.Fromdate.index();
    public static final int TODATE = AttributesEnum.Todate.index();
    public static final int ORDERTYPE = AttributesEnum.Ordertype.index();
    public static final int CLIENTID = AttributesEnum.ClientId.index();
    public static final int ORDERSTATUSVC = AttributesEnum.OrderStatusVC.index();
    public static final int TRANSACTIONTYPELOV1 = AttributesEnum.TransactionTypeLOV1.index();
    public static final int PAYMENTMETHODVC = AttributesEnum.PaymentMethodVC.index();
    public static final int RETURNREASONVC = AttributesEnum.ReturnReasonVC.index();
    public static final int WEBUSERIDLOV1 = AttributesEnum.WebUserIdLOV1.index();
    public static final int CLIENTLOV1 = AttributesEnum.ClientLOV1.index();
    public static final int REFUNDMETHODVC = AttributesEnum.RefundMethodVC.index();
    public static final int CLIENTEMAILLOV1 = AttributesEnum.ClientEmailLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ReturnSearchParamsVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Returnnumber.
     * @return the Returnnumber
     */
    public Number getReturnnumber() {
        return (Number) getAttributeInternal(RETURNNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Returnnumber.
     * @param value value to set the  Returnnumber
     */
    public void setReturnnumber(Number value) {
        setAttributeInternal(RETURNNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Orderref.
     * @return the Orderref
     */
    public String getOrderref() {
        return (String) getAttributeInternal(ORDERREF);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Orderref.
     * @param value value to set the  Orderref
     */
    public void setOrderref(String value) {
        setAttributeInternal(ORDERREF, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Client.
     * @return the Client
     */
    public String getClient() {
        return (String) getAttributeInternal(CLIENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Client.
     * @param value value to set the  Client
     */
    public void setClient(String value) {
        setAttributeInternal(CLIENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Webuserid.
     * @return the Webuserid
     */
    public String getWebuserid() {
        return (String) getAttributeInternal(WEBUSERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Webuserid.
     * @param value value to set the  Webuserid
     */
    public void setWebuserid(String value) {
        setAttributeInternal(WEBUSERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Status.
     * @return the Status
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Status.
     * @param value value to set the  Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Returntype.
     * @return the Returntype
     */
    public String getReturntype() {
        return (String) getAttributeInternal(RETURNTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Returntype.
     * @param value value to set the  Returntype
     */
    public void setReturntype(String value) {
        setAttributeInternal(RETURNTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Returnreason.
     * @return the Returnreason
     */
    public String getReturnreason() {
        return (String) getAttributeInternal(RETURNREASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Returnreason.
     * @param value value to set the  Returnreason
     */
    public void setReturnreason(String value) {
        setAttributeInternal(RETURNREASON, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Paymentmethod.
     * @return the Paymentmethod
     */
    public String getPaymentmethod() {
        return (String) getAttributeInternal(PAYMENTMETHOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Paymentmethod.
     * @param value value to set the  Paymentmethod
     */
    public void setPaymentmethod(String value) {
        setAttributeInternal(PAYMENTMETHOD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Reimbursmentmethod.
     * @return the Reimbursmentmethod
     */
    public String getReimbursmentmethod() {
        return (String) getAttributeInternal(REIMBURSMENTMETHOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Reimbursmentmethod.
     * @param value value to set the  Reimbursmentmethod
     */
    public void setReimbursmentmethod(String value) {
        setAttributeInternal(REIMBURSMENTMETHOD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Articlecode.
     * @return the Articlecode
     */
    public String getArticlecode() {
        return (String) getAttributeInternal(ARTICLECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Articlecode.
     * @param value value to set the  Articlecode
     */
    public void setArticlecode(String value) {
        setAttributeInternal(ARTICLECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Email.
     * @return the Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Email.
     * @param value value to set the  Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Loyaltycard.
     * @return the Loyaltycard
     */
    public String getLoyaltycard() {
        return (String) getAttributeInternal(LOYALTYCARD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Loyaltycard.
     * @param value value to set the  Loyaltycard
     */
    public void setLoyaltycard(String value) {
        setAttributeInternal(LOYALTYCARD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Rs.
     * @return the Rs
     */
    public String getRs() {
        return (String) getAttributeInternal(RS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Rs.
     * @param value value to set the  Rs
     */
    public void setRs(String value) {
        setAttributeInternal(RS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Fromdate.
     * @return the Fromdate
     */
    public Date getFromdate() {
        return (Date) getAttributeInternal(FROMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Fromdate.
     * @param value value to set the  Fromdate
     */
    public void setFromdate(Date value) {
        setAttributeInternal(FROMDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Todate.
     * @return the Todate
     */
    public Date getTodate() {
        return (Date) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Todate.
     * @param value value to set the  Todate
     */
    public void setTodate(Date value) {
        setAttributeInternal(TODATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Ordertype.
     * @return the Ordertype
     */
    public String getOrdertype() {
        return (String) getAttributeInternal(ORDERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Ordertype.
     * @param value value to set the  Ordertype
     */
    public void setOrdertype(String value) {
        setAttributeInternal(ORDERTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ClientId.
     * @return the ClientId
     */
    public String getClientId() {
        return (String) getAttributeInternal(CLIENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ClientId.
     * @param value value to set the  ClientId
     */
    public void setClientId(String value) {
        setAttributeInternal(CLIENTID, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OrderStatusVC.
     */
    public RowSet getOrderStatusVC() {
        return (RowSet) getAttributeInternal(ORDERSTATUSVC);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TransactionTypeLOV1.
     */
    public RowSet getTransactionTypeLOV1() {
        return (RowSet) getAttributeInternal(TRANSACTIONTYPELOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PaymentMethodVC.
     */
    public RowSet getPaymentMethodVC() {
        return (RowSet) getAttributeInternal(PAYMENTMETHODVC);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReturnReasonVC.
     */
    public RowSet getReturnReasonVC() {
        return (RowSet) getAttributeInternal(RETURNREASONVC);
    }

    /**
     * Gets the view accessor <code>RowSet</code> WebUserIdLOV1.
     */
    public RowSet getWebUserIdLOV1() {
        return (RowSet) getAttributeInternal(WEBUSERIDLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ClientLOV1.
     */
    public RowSet getClientLOV1() {
        return (RowSet) getAttributeInternal(CLIENTLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RefundMethodVC.
     */
    public RowSet getRefundMethodVC() {
        return (RowSet) getAttributeInternal(REFUNDMETHODVC);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ClientEmailLOV1.
     */
    public RowSet getClientEmailLOV1() {
        return (RowSet) getAttributeInternal(CLIENTEMAILLOV1);
    }
}

