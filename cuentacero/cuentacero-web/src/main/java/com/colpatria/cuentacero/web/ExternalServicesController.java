package com.colpatria.cuentacero.web;

import com.colpatria.cuentacero.services.QuoteService;
import com.colpatria.cuentacero.services.models.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/external/service/")
public class ExternalServicesController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/rest")
    public Quote restQuote() {
        return quoteService.restQuote();
    }

    @GetMapping("/soap")
    public Quote soapQuote() {
        return quoteService.soapQuote();
    }

}
