package com.plaid.client.response.depositswitch;

import com.plaid.client.response.BaseResponse;

public final class DepositSwitchGetResponse extends BaseResponse {
  private String depositSwitchId;
  private String targetItemId;
  private String targetAccountId;
  private String state;
  private String dateCreated;
  private Boolean isAllocatedRemainder;
  private Boolean accountHasMultipleAllocations;
  private Float percentAllocated;
  private String dateCompleted;

  public String getDepositSwitchId() {
    return depositSwitchId;
  }

  public String getTargetItemId() {
    return targetItemId;
  }

  public String getTargetAccountId() {
    return targetAccountId;
  }

  public String getState() {
    return state;
  }

  public String getDateCreated() {
    return dateCreated;
  }

  public Boolean getIsAllocatedRemainder() {
    return isAllocatedRemainder;
  }

  public Boolean getAccounthasMultipleAllocations() {
    return accountHasMultipleAllocations;
  }

  public Float getPercentAllocated() {
    return percentAllocated;
  }

  public String getdateCompleted() {
    return dateCompleted;
  }
}
