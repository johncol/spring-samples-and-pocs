package com.colpatria.cuentacero.services;

import com.colpatria.cuentacero.services.models.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteServiceImpl implements QuoteService {

  private static final String REST_ENDPOINT = "https://gturnquist-quoters.cfapps.io/api/random";
  private static final String SOAP_ENDPOINT = "";

  private static final Logger log = LoggerFactory.getLogger(QuoteServiceImpl.class);

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public Quote restQuote() {
    Quote quote = restTemplate.getForObject(REST_ENDPOINT, Quote.class);
    log.info(quote.toString());
    return quote;
  }

  @Override
  public Quote soapQuote() {
    return null;
  }
}
