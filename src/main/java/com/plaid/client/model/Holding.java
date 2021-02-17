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
 * A securities holding at an institution.
 */
@ApiModel(description = "A securities holding at an institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T09:01:17.357Z[GMT]")
public class Holding {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SECURITY_ID = "security_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_ID)
  private String securityId;

  public static final String SERIALIZED_NAME_INSTITUTION_PRICE = "institution_price";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_PRICE)
  private Double institutionPrice;

  public static final String SERIALIZED_NAME_INSTITUTION_PRICE_AS_OF = "institution_price_as_of";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_PRICE_AS_OF)
  private String institutionPriceAsOf;

  public static final String SERIALIZED_NAME_INSTITUTION_VALUE = "institution_value";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_VALUE)
  private Double institutionValue;

  public static final String SERIALIZED_NAME_COST_BASIS = "cost_basis";
  @SerializedName(SERIALIZED_NAME_COST_BASIS)
  private Double costBasis;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;


  public Holding accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; associated with the holding.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid `account_id` associated with the holding.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Holding securityId(String securityId) {
    
    this.securityId = securityId;
    return this;
  }

   /**
   * The Plaid &#x60;security_id&#x60; associated with the holding.
   * @return securityId
  **/
  @ApiModelProperty(required = true, value = "The Plaid `security_id` associated with the holding.")

  public String getSecurityId() {
    return securityId;
  }


  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }


  public Holding institutionPrice(Double institutionPrice) {
    
    this.institutionPrice = institutionPrice;
    return this;
  }

   /**
   * The last price given by the institution for this security.
   * @return institutionPrice
  **/
  @ApiModelProperty(required = true, value = "The last price given by the institution for this security.")

  public Double getInstitutionPrice() {
    return institutionPrice;
  }


  public void setInstitutionPrice(Double institutionPrice) {
    this.institutionPrice = institutionPrice;
  }


  public Holding institutionPriceAsOf(String institutionPriceAsOf) {
    
    this.institutionPriceAsOf = institutionPriceAsOf;
    return this;
  }

   /**
   * The date at which &#x60;institution_price&#x60; was current.
   * @return institutionPriceAsOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which `institution_price` was current.")

  public String getInstitutionPriceAsOf() {
    return institutionPriceAsOf;
  }


  public void setInstitutionPriceAsOf(String institutionPriceAsOf) {
    this.institutionPriceAsOf = institutionPriceAsOf;
  }


  public Holding institutionValue(Double institutionValue) {
    
    this.institutionValue = institutionValue;
    return this;
  }

   /**
   * The value of the holding, as reported by the institution.
   * @return institutionValue
  **/
  @ApiModelProperty(required = true, value = "The value of the holding, as reported by the institution.")

  public Double getInstitutionValue() {
    return institutionValue;
  }


  public void setInstitutionValue(Double institutionValue) {
    this.institutionValue = institutionValue;
  }


  public Holding costBasis(Double costBasis) {
    
    this.costBasis = costBasis;
    return this;
  }

   /**
   * The cost basis of the holding.
   * @return costBasis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cost basis of the holding.")

  public Double getCostBasis() {
    return costBasis;
  }


  public void setCostBasis(Double costBasis) {
    this.costBasis = costBasis;
  }


  public Holding quantity(Double quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The total quantity of the asset held, as reported by the financial institution.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The total quantity of the asset held, as reported by the financial institution.")

  public Double getQuantity() {
    return quantity;
  }


  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  public Holding isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the holding. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-&#x60;null&#x60;.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 currency code of the holding. Always `null` if `unofficial_currency_code` is non-`null`.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public Holding unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the holding. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s. 
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unofficial currency code associated with the holding. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s. ")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holding holding = (Holding) o;
    return Objects.equals(this.accountId, holding.accountId) &&
        Objects.equals(this.securityId, holding.securityId) &&
        Objects.equals(this.institutionPrice, holding.institutionPrice) &&
        Objects.equals(this.institutionPriceAsOf, holding.institutionPriceAsOf) &&
        Objects.equals(this.institutionValue, holding.institutionValue) &&
        Objects.equals(this.costBasis, holding.costBasis) &&
        Objects.equals(this.quantity, holding.quantity) &&
        Objects.equals(this.isoCurrencyCode, holding.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, holding.unofficialCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, securityId, institutionPrice, institutionPriceAsOf, institutionValue, costBasis, quantity, isoCurrencyCode, unofficialCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holding {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    institutionPrice: ").append(toIndentedString(institutionPrice)).append("\n");
    sb.append("    institutionPriceAsOf: ").append(toIndentedString(institutionPriceAsOf)).append("\n");
    sb.append("    institutionValue: ").append(toIndentedString(institutionValue)).append("\n");
    sb.append("    costBasis: ").append(toIndentedString(costBasis)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
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

