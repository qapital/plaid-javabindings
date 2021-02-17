/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.5.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The &#x60;inflow_model&#x60; allows you to model a test account that receives regular income or make regular payments on a loan. Any transactions generated by the &#x60;inflow_model&#x60; will appear in addition to randomly generated test data or transactions specified by &#x60;override_accounts&#x60;.
 */
@ApiModel(description = "The `inflow_model` allows you to model a test account that receives regular income or make regular payments on a loan. Any transactions generated by the `inflow_model` will appear in addition to randomly generated test data or transactions specified by `override_accounts`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T09:01:17.357Z[GMT]")
public class InflowModel {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_INCOME_AMOUNT = "income_amount";
  @SerializedName(SERIALIZED_NAME_INCOME_AMOUNT)
  private Double incomeAmount;

  public static final String SERIALIZED_NAME_PAYMENT_DAY_OF_MONTH = "payment_day_of_month";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DAY_OF_MONTH)
  private Double paymentDayOfMonth;

  public static final String SERIALIZED_NAME_TRANSACTION_NAME = "transaction_name";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_NAME)
  private String transactionName;

  public static final String SERIALIZED_NAME_STATEMENT_DAY_OF_MONTH = "statement_day_of_month";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DAY_OF_MONTH)
  private String statementDayOfMonth;


  public InflowModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Inflow model. One of the following:  &#x60;none&#x60;: No income &#x60;monthly-income&#x60;: Income occurs once per month &#x60;monthly-balance-payment&#x60;: Pays off the balance on a liability account at the given statement day of month &#x60;monthly-interest-only-payment&#x60;: Makes an interest-only payment on a liability account at the given statement day of month. Note that account types supported by Liabilities will accrue interest in the Sandbox. The types are account type &#x60;credit&#x60; with subtype &#x60;credit&#x60; or &#x60;paypal&#x60;, and account type &#x60;loan&#x60; with subtype &#x60;student&#x60; or &#x60;mortgage&#x60;.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Inflow model. One of the following:  `none`: No income `monthly-income`: Income occurs once per month `monthly-balance-payment`: Pays off the balance on a liability account at the given statement day of month `monthly-interest-only-payment`: Makes an interest-only payment on a liability account at the given statement day of month. Note that account types supported by Liabilities will accrue interest in the Sandbox. The types are account type `credit` with subtype `credit` or `paypal`, and account type `loan` with subtype `student` or `mortgage`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public InflowModel incomeAmount(Double incomeAmount) {
    
    this.incomeAmount = incomeAmount;
    return this;
  }

   /**
   * Amount of income per month. This value is required if &#x60;type&#x60; is &#x60;monthly-income&#x60;.
   * @return incomeAmount
  **/
  @ApiModelProperty(required = true, value = "Amount of income per month. This value is required if `type` is `monthly-income`.")

  public Double getIncomeAmount() {
    return incomeAmount;
  }


  public void setIncomeAmount(Double incomeAmount) {
    this.incomeAmount = incomeAmount;
  }


  public InflowModel paymentDayOfMonth(Double paymentDayOfMonth) {
    
    this.paymentDayOfMonth = paymentDayOfMonth;
    return this;
  }

   /**
   * Number between 1 and 28, or &#x60;last&#x60; meaning the last day of the month. The day of the month on which the income transaction will appear. The name of the income transaction. This field is required if &#x60;type&#x60; is &#x60;monthly-income&#x60;, &#x60;monthly-balance-payment&#x60; or &#x60;monthly-interest-only-payment&#x60;.
   * @return paymentDayOfMonth
  **/
  @ApiModelProperty(required = true, value = "Number between 1 and 28, or `last` meaning the last day of the month. The day of the month on which the income transaction will appear. The name of the income transaction. This field is required if `type` is `monthly-income`, `monthly-balance-payment` or `monthly-interest-only-payment`.")

  public Double getPaymentDayOfMonth() {
    return paymentDayOfMonth;
  }


  public void setPaymentDayOfMonth(Double paymentDayOfMonth) {
    this.paymentDayOfMonth = paymentDayOfMonth;
  }


  public InflowModel transactionName(String transactionName) {
    
    this.transactionName = transactionName;
    return this;
  }

   /**
   * The name of the income transaction. This field is required if &#x60;type&#x60; is &#x60;monthly-income&#x60;, &#x60;monthly-balance-payment&#x60; or &#x60;monthly-interest-only-payment&#x60;.
   * @return transactionName
  **/
  @ApiModelProperty(required = true, value = "The name of the income transaction. This field is required if `type` is `monthly-income`, `monthly-balance-payment` or `monthly-interest-only-payment`.")

  public String getTransactionName() {
    return transactionName;
  }


  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }


  public InflowModel statementDayOfMonth(String statementDayOfMonth) {
    
    this.statementDayOfMonth = statementDayOfMonth;
    return this;
  }

   /**
   * Number between 1 and 28, or &#x60;last&#x60; meaning the last day of the month. The day of the month on which the balance is calculated for the next payment. The name of the income transaction. This field is required if &#x60;type&#x60; is &#x60;monthly-balance-payment&#x60; or &#x60;monthly-interest-only-payment&#x60;.
   * @return statementDayOfMonth
  **/
  @ApiModelProperty(required = true, value = "Number between 1 and 28, or `last` meaning the last day of the month. The day of the month on which the balance is calculated for the next payment. The name of the income transaction. This field is required if `type` is `monthly-balance-payment` or `monthly-interest-only-payment`.")

  public String getStatementDayOfMonth() {
    return statementDayOfMonth;
  }


  public void setStatementDayOfMonth(String statementDayOfMonth) {
    this.statementDayOfMonth = statementDayOfMonth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InflowModel inflowModel = (InflowModel) o;
    return Objects.equals(this.type, inflowModel.type) &&
        Objects.equals(this.incomeAmount, inflowModel.incomeAmount) &&
        Objects.equals(this.paymentDayOfMonth, inflowModel.paymentDayOfMonth) &&
        Objects.equals(this.transactionName, inflowModel.transactionName) &&
        Objects.equals(this.statementDayOfMonth, inflowModel.statementDayOfMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, incomeAmount, paymentDayOfMonth, transactionName, statementDayOfMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InflowModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    incomeAmount: ").append(toIndentedString(incomeAmount)).append("\n");
    sb.append("    paymentDayOfMonth: ").append(toIndentedString(paymentDayOfMonth)).append("\n");
    sb.append("    transactionName: ").append(toIndentedString(transactionName)).append("\n");
    sb.append("    statementDayOfMonth: ").append(toIndentedString(statementDayOfMonth)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

