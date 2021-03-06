package com.test.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayRepaymentFail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.ID
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.STATUS
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_APPLY_TYPE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String repaymentApplyType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.PLATFORM_FLOW_NUMBER
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String platformFlowNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.AMOUNT
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_TYPE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String repaymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_METHOD
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String repaymentMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.LOAN_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String loanNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.PAY_SUCC_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String paySuccTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String paymentOderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_FEE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String paymentFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO_OLD
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String paymentOderNoOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.CREATE_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.UPDATE_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_RESULT
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String repaymentResult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.ERR_CODE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String errCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.ERR_MSG
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String errMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.RETRY_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private Short retryTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UCARD_PAY_REPAYMENT_FAIL.OUT_TRADE_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    private String outTradeNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.ID
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.ID
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.ID
     *
     * @param id the value for UCARD_PAY_REPAYMENT_FAIL.ID
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.STATUS
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.STATUS
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.STATUS
     *
     * @param status the value for UCARD_PAY_REPAYMENT_FAIL.STATUS
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_APPLY_TYPE
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_APPLY_TYPE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getRepaymentApplyType() {
        return repaymentApplyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_APPLY_TYPE
     *
     * @param repaymentApplyType the value for UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_APPLY_TYPE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setRepaymentApplyType(String repaymentApplyType) {
        this.repaymentApplyType = repaymentApplyType == null ? null : repaymentApplyType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.PLATFORM_FLOW_NUMBER
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.PLATFORM_FLOW_NUMBER
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getPlatformFlowNumber() {
        return platformFlowNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.PLATFORM_FLOW_NUMBER
     *
     * @param platformFlowNumber the value for UCARD_PAY_REPAYMENT_FAIL.PLATFORM_FLOW_NUMBER
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setPlatformFlowNumber(String platformFlowNumber) {
        this.platformFlowNumber = platformFlowNumber == null ? null : platformFlowNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.AMOUNT
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.AMOUNT
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.AMOUNT
     *
     * @param amount the value for UCARD_PAY_REPAYMENT_FAIL.AMOUNT
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_TYPE
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_TYPE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getRepaymentType() {
        return repaymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_TYPE
     *
     * @param repaymentType the value for UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_TYPE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType == null ? null : repaymentType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_METHOD
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_METHOD
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_METHOD
     *
     * @param repaymentMethod the value for UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_METHOD
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod == null ? null : repaymentMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.LOAN_NO
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.LOAN_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.LOAN_NO
     *
     * @param loanNo the value for UCARD_PAY_REPAYMENT_FAIL.LOAN_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.PAY_SUCC_TIME
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.PAY_SUCC_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getPaySuccTime() {
        return paySuccTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.PAY_SUCC_TIME
     *
     * @param paySuccTime the value for UCARD_PAY_REPAYMENT_FAIL.PAY_SUCC_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setPaySuccTime(String paySuccTime) {
        this.paySuccTime = paySuccTime == null ? null : paySuccTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getPaymentOderNo() {
        return paymentOderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO
     *
     * @param paymentOderNo the value for UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setPaymentOderNo(String paymentOderNo) {
        this.paymentOderNo = paymentOderNo == null ? null : paymentOderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_FEE
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.PAYMENT_FEE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getPaymentFee() {
        return paymentFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_FEE
     *
     * @param paymentFee the value for UCARD_PAY_REPAYMENT_FAIL.PAYMENT_FEE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setPaymentFee(String paymentFee) {
        this.paymentFee = paymentFee == null ? null : paymentFee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO_OLD
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO_OLD
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getPaymentOderNoOld() {
        return paymentOderNoOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO_OLD
     *
     * @param paymentOderNoOld the value for UCARD_PAY_REPAYMENT_FAIL.PAYMENT_ODER_NO_OLD
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setPaymentOderNoOld(String paymentOderNoOld) {
        this.paymentOderNoOld = paymentOderNoOld == null ? null : paymentOderNoOld.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.CREATE_TIME
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.CREATE_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.CREATE_TIME
     *
     * @param createTime the value for UCARD_PAY_REPAYMENT_FAIL.CREATE_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.UPDATE_TIME
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.UPDATE_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.UPDATE_TIME
     *
     * @param updateTime the value for UCARD_PAY_REPAYMENT_FAIL.UPDATE_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_RESULT
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_RESULT
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getRepaymentResult() {
        return repaymentResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_RESULT
     *
     * @param repaymentResult the value for UCARD_PAY_REPAYMENT_FAIL.REPAYMENT_RESULT
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setRepaymentResult(String repaymentResult) {
        this.repaymentResult = repaymentResult == null ? null : repaymentResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.ERR_CODE
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.ERR_CODE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.ERR_CODE
     *
     * @param errCode the value for UCARD_PAY_REPAYMENT_FAIL.ERR_CODE
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.ERR_MSG
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.ERR_MSG
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.ERR_MSG
     *
     * @param errMsg the value for UCARD_PAY_REPAYMENT_FAIL.ERR_MSG
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg == null ? null : errMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.RETRY_TIME
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.RETRY_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public Short getRetryTime() {
        return retryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.RETRY_TIME
     *
     * @param retryTime the value for UCARD_PAY_REPAYMENT_FAIL.RETRY_TIME
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setRetryTime(Short retryTime) {
        this.retryTime = retryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UCARD_PAY_REPAYMENT_FAIL.OUT_TRADE_NO
     *
     * @return the value of UCARD_PAY_REPAYMENT_FAIL.OUT_TRADE_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UCARD_PAY_REPAYMENT_FAIL.OUT_TRADE_NO
     *
     * @param outTradeNo the value for UCARD_PAY_REPAYMENT_FAIL.OUT_TRADE_NO
     *
     * @mbg.generated Mon May 21 16:25:25 CST 2018
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }
}