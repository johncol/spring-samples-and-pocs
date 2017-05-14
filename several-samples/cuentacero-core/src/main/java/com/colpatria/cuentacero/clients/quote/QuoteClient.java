package com.colpatria.cuentacero.clients.quote;

import com.colpatria.cuentacero.clients.wsdl.GetQuote;
import com.colpatria.cuentacero.clients.wsdl.GetQuoteResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class QuoteClient extends WebServiceGatewaySupport {

    private final static Logger logger = LoggerFactory.getLogger(QuoteClient.class);

    public GetQuoteResponse getQuote(String ticker) {
        GetQuote request = new GetQuote();
        request.setSymbol(ticker);
        logger.info("Requesting quote for " + ticker);
        SoapActionCallback requestCallback = new SoapActionCallback("http://www.webserviceX.NET/GetQuote");
        String uri = "http://www.webservicex.com/stockquote.asmx";
        GetQuoteResponse getQuoteResponse = (GetQuoteResponse) getWebServiceTemplate()
                .marshalSendAndReceive(uri, request, requestCallback);
        return getQuoteResponse;
    }

}
