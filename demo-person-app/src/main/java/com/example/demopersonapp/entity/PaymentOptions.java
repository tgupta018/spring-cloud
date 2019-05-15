package com.example.demopersonapp.entity;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NamedQueries({
        @NamedQuery(name = "PaymentOptions.findAll", query = "select o from PaymentOptions o")
})
@Table(name = "PAYMENT_OPTIONS")
public class PaymentOptions implements Serializable {
    @Column(name="ACCOUNT_NUMBER", nullable = false)
    private Long accountNumber;
    @Column(name="BILLING_ADDRESS_ID")
    private Long billingAddressId;
    @Column(name="CARD_TYPE_CODE", length = 30)
    private String cardTypeCode;
    @Column(name="CHECK_DIGITS")
    private Long checkDigits;
    @Column(name="CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="CUSTOMER_ID", nullable = false)
    private Long customerId;
    @Column(name="EXPIRE_DATE")
    private Timestamp expireDate;
    @Column(name="INSTITUTION_NAME", length = 120)
    private String institutionName;
    @Column(name="LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Column(name="OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="PAYMENT_OPTION_ID", nullable = false)
    private Long paymentOptionId;
    @Column(name="PAYMENT_TYPE_CODE", nullable = false, length = 30)
    private String paymentTypeCode;
    @Column(name="ROUTING_IDENTIFIER", length = 15)
    private String routingIdentifier;
    @Column(name="VALID_FROM_DATE")
    private Timestamp validFromDate;
    @Column(name="VALID_TO_DATE")
    private Timestamp validToDate;

    public PaymentOptions() {
    }

    public PaymentOptions(Long accountNumber, Long billingAddressId,
                          String cardTypeCode, Long checkDigits,
                          String createdBy, Timestamp creationDate,
                          Long customerId, Timestamp expireDate,
                          String institutionName, Timestamp lastUpdateDate,
                          String lastUpdatedBy, Long objectVersionId,
                          Long paymentOptionId, String paymentTypeCode,
                          String routingIdentifier, Timestamp validFromDate,
                          Timestamp validToDate) {
        this.accountNumber = accountNumber;
        this.billingAddressId = billingAddressId;
        this.cardTypeCode = cardTypeCode;
        this.checkDigits = checkDigits;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.customerId = customerId;
        this.expireDate = expireDate;
        this.institutionName = institutionName;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.paymentOptionId = paymentOptionId;
        this.paymentTypeCode = paymentTypeCode;
        this.routingIdentifier = routingIdentifier;
        this.validFromDate = validFromDate;
        this.validToDate = validToDate;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(Long billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public String getCardTypeCode() {
        return cardTypeCode;
    }

    public void setCardTypeCode(String cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
    }

    public Long getCheckDigits() {
        return checkDigits;
    }

    public void setCheckDigits(Long checkDigits) {
        this.checkDigits = checkDigits;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(Long objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    public Long getPaymentOptionId() {
        return paymentOptionId;
    }

    public void setPaymentOptionId(Long paymentOptionId) {
        this.paymentOptionId = paymentOptionId;
    }

    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    public void setPaymentTypeCode(String paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode;
    }

    public String getRoutingIdentifier() {
        return routingIdentifier;
    }

    public void setRoutingIdentifier(String routingIdentifier) {
        this.routingIdentifier = routingIdentifier;
    }

    public Timestamp getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(Timestamp validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Timestamp getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(Timestamp validToDate) {
        this.validToDate = validToDate;
    }
}
