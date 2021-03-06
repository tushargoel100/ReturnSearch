package xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.views;

import java.math.BigDecimal;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 21 16:27:20 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HeaderResultsVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public HeaderResultsVOImpl() {
    }

    /**
     * Returns the variable value for p_web_user_id.
     * @return variable value for p_web_user_id
     */
    public String getp_web_user_id() {
        return (String) ensureVariableManager().getVariableValue("p_web_user_id");
    }

    /**
     * Sets <code>value</code> for variable p_web_user_id.
     * @param value value to bind as p_web_user_id
     */
    public void setp_web_user_id(String value) {
        ensureVariableManager().setVariableValue("p_web_user_id", value);
    }

    /**
     * Returns the variable value for p_retrurn_reason.
     * @return variable value for p_retrurn_reason
     */
    public String getp_retrurn_reason() {
        return (String) ensureVariableManager().getVariableValue("p_retrurn_reason");
    }

    /**
     * Sets <code>value</code> for variable p_retrurn_reason.
     * @param value value to bind as p_retrurn_reason
     */
    public void setp_retrurn_reason(String value) {
        ensureVariableManager().setVariableValue("p_retrurn_reason", value);
    }

    /**
     * Returns the variable value for p_return_date_from.
     * @return variable value for p_return_date_from
     */
    public Date getp_return_date_from() {
        return (Date) ensureVariableManager().getVariableValue("p_return_date_from");
    }

    /**
     * Sets <code>value</code> for variable p_return_date_from.
     * @param value value to bind as p_return_date_from
     */
    public void setp_return_date_from(Date value) {
        ensureVariableManager().setVariableValue("p_return_date_from", value);
    }

    /**
     * Returns the variable value for p_return_date_to.
     * @return variable value for p_return_date_to
     */
    public Date getp_return_date_to() {
        return (Date) ensureVariableManager().getVariableValue("p_return_date_to");
    }

    /**
     * Sets <code>value</code> for variable p_return_date_to.
     * @param value value to bind as p_return_date_to
     */
    public void setp_return_date_to(Date value) {
        ensureVariableManager().setVariableValue("p_return_date_to", value);
    }

    /**
     * Returns the variable value for p_return_number.
     * @return variable value for p_return_number
     */
    public BigDecimal getp_return_number() {
        return (BigDecimal) ensureVariableManager().getVariableValue("p_return_number");
    }

    /**
     * Sets <code>value</code> for variable p_return_number.
     * @param value value to bind as p_return_number
     */
    public void setp_return_number(BigDecimal value) {
        ensureVariableManager().setVariableValue("p_return_number", value);
    }

    /**
     * Returns the variable value for p_order_ref.
     * @return variable value for p_order_ref
     */
    public String getp_order_ref() {
        return (String) ensureVariableManager().getVariableValue("p_order_ref");
    }

    /**
     * Sets <code>value</code> for variable p_order_ref.
     * @param value value to bind as p_order_ref
     */
    public void setp_order_ref(String value) {
        ensureVariableManager().setVariableValue("p_order_ref", value);
    }

    /**
     * Returns the variable value for p_client.
     * @return variable value for p_client
     */
    public Long getp_client() {
        return (Long) ensureVariableManager().getVariableValue("p_client");
    }

    /**
     * Sets <code>value</code> for variable p_client.
     * @param value value to bind as p_client
     */
    public void setp_client(Long value) {
        ensureVariableManager().setVariableValue("p_client", value);
    }

    /**
     * Returns the variable value for p_status.
     * @return variable value for p_status
     */
    public String getp_status() {
        return (String) ensureVariableManager().getVariableValue("p_status");
    }

    /**
     * Sets <code>value</code> for variable p_status.
     * @param value value to bind as p_status
     */
    public void setp_status(String value) {
        ensureVariableManager().setVariableValue("p_status", value);
    }

    /**
     * Returns the variable value for p_return_type.
     * @return variable value for p_return_type
     */
    public String getp_return_type() {
        return (String) ensureVariableManager().getVariableValue("p_return_type");
    }

    /**
     * Sets <code>value</code> for variable p_return_type.
     * @param value value to bind as p_return_type
     */
    public void setp_return_type(String value) {
        ensureVariableManager().setVariableValue("p_return_type", value);
    }

    /**
     * Returns the variable value for p_payment_method_code.
     * @return variable value for p_payment_method_code
     */
    public String getp_payment_method_code() {
        return (String) ensureVariableManager().getVariableValue("p_payment_method_code");
    }

    /**
     * Sets <code>value</code> for variable p_payment_method_code.
     * @param value value to bind as p_payment_method_code
     */
    public void setp_payment_method_code(String value) {
        ensureVariableManager().setVariableValue("p_payment_method_code", value);
    }

    /**
     * Returns the variable value for p_refund_method_code.
     * @return variable value for p_refund_method_code
     */
    public String getp_refund_method_code() {
        return (String) ensureVariableManager().getVariableValue("p_refund_method_code");
    }

    /**
     * Sets <code>value</code> for variable p_refund_method_code.
     * @param value value to bind as p_refund_method_code
     */
    public void setp_refund_method_code(String value) {
        ensureVariableManager().setVariableValue("p_refund_method_code", value);
    }

    /**
     * Returns the variable value for p_sku_number.
     * @return variable value for p_sku_number
     */
    public Number getp_sku_number() {
        return (Number) ensureVariableManager().getVariableValue("p_sku_number");
    }

    /**
     * Sets <code>value</code> for variable p_sku_number.
     * @param value value to bind as p_sku_number
     */
    public void setp_sku_number(Number value) {
        ensureVariableManager().setVariableValue("p_sku_number", value);
    }

    /**
     * Returns the variable value for p_loyalty_card.
     * @return variable value for p_loyalty_card
     */
    public String getp_loyalty_card() {
        return (String) ensureVariableManager().getVariableValue("p_loyalty_card");
    }

    /**
     * Sets <code>value</code> for variable p_loyalty_card.
     * @param value value to bind as p_loyalty_card
     */
    public void setp_loyalty_card(String value) {
        ensureVariableManager().setVariableValue("p_loyalty_card", value);
    }

    /**
     * Returns the variable value for p_service_request.
     * @return variable value for p_service_request
     */
    public String getp_service_request() {
        return (String) ensureVariableManager().getVariableValue("p_service_request");
    }

    /**
     * Sets <code>value</code> for variable p_service_request.
     * @param value value to bind as p_service_request
     */
    public void setp_service_request(String value) {
        ensureVariableManager().setVariableValue("p_service_request", value);
    }

    /**
     * Returns the variable value for p_order_type.
     * @return variable value for p_order_type
     */
    public String getp_order_type() {
        return (String) ensureVariableManager().getVariableValue("p_order_type");
    }

    /**
     * Sets <code>value</code> for variable p_order_type.
     * @param value value to bind as p_order_type
     */
    public void setp_order_type(String value) {
        ensureVariableManager().setVariableValue("p_order_type", value);
    }

    /**
     * Returns the variable value for p_email.
     * @return variable value for p_email
     */
    public String getp_email() {
        return (String) ensureVariableManager().getVariableValue("p_email");
    }

    /**
     * Sets <code>value</code> for variable p_email.
     * @param value value to bind as p_email
     */
    public void setp_email(String value) {
        ensureVariableManager().setVariableValue("p_email", value);
    }
}

