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

/**
 * BankTransferMigrateAccountRequest defines the request schema for &#x60;/bank_transfer/migrate_account&#x60;
 */
@ApiModel(description = "BankTransferMigrateAccountRequest defines the request schema for `/bank_transfer/migrate_account`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T09:01:17.357Z[GMT]")
public class BankTransferMigrateAccountRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;


  public BankTransferMigrateAccountRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public BankTransferMigrateAccountRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public BankTransferMigrateAccountRequest accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The user&#39;s account number.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The user's account number.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public BankTransferMigrateAccountRequest routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * The user&#39;s routing number.
   * @return routingNumber
  **/
  @ApiModelProperty(required = true, value = "The user's routing number.")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public BankTransferMigrateAccountRequest accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The type of the bank account (&#x60;checking&#x60; or &#x60;savings&#x60;).
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "The type of the bank account (`checking` or `savings`).")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferMigrateAccountRequest bankTransferMigrateAccountRequest = (BankTransferMigrateAccountRequest) o;
    return Objects.equals(this.clientId, bankTransferMigrateAccountRequest.clientId) &&
        Objects.equals(this.secret, bankTransferMigrateAccountRequest.secret) &&
        Objects.equals(this.accountNumber, bankTransferMigrateAccountRequest.accountNumber) &&
        Objects.equals(this.routingNumber, bankTransferMigrateAccountRequest.routingNumber) &&
        Objects.equals(this.accountType, bankTransferMigrateAccountRequest.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accountNumber, routingNumber, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferMigrateAccountRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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

