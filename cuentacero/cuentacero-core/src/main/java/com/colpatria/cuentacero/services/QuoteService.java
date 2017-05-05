package com.colpatria.cuentacero.services;

import com.colpatria.cuentacero.services.models.Quote;

public interface QuoteService {
    Quote restQuote();
    Quote soapQuote();
}
