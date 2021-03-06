package com.plaid.client.integration;	

import com.plaid.client.PlaidClient;	
import com.plaid.client.response.paymentinitiation.PaymentCreateResponse;	
import com.plaid.client.request.paymentinitiation.PaymentTokenCreateRequest;	
import com.plaid.client.response.paymentinitiation.PaymentTokenCreateResponse;	
import org.junit.Test;	
import retrofit2.Response;	

import static org.junit.Assert.assertNotNull;	

public class PaymentTokenCreateTest extends AbstractIntegrationTest {	

  @Test	
  public void testPaymentTokenCreateSuccess() throws Exception {	
    Response<PaymentCreateResponse> createPaymentResponse = PaymentCreateTest.createSingleImmediatePayment(client());	
    String paymentId = createPaymentResponse.body().getPaymentId();	
    assertNotNull(paymentId);	

    Response<PaymentTokenCreateResponse> createPaymentTokenResponse =	
      client().service().paymentTokenCreate(new PaymentTokenCreateRequest(paymentId)).execute();	
    assertSuccessResponse(createPaymentTokenResponse);	
    assertNotNull(createPaymentTokenResponse.body().getPaymentToken());	
    assertNotNull(createPaymentTokenResponse.body().getPaymentTokenExpirationTime());	
  }	
}
