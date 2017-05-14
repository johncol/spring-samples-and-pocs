package com.colpatria.cuentacero.clients.quote;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class QuoteConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.colpatria.cuentacero.clients.wsdl");
        return jaxb2Marshaller;
    }

    @Bean
    public QuoteClient quoteClient(Jaxb2Marshaller marshaller) {
        QuoteClient quoteClient = new QuoteClient();
        quoteClient.setDefaultUri("http://www.webservicex.com/stockquote.asmx");
        quoteClient.setMarshaller(marshaller);
        quoteClient.setUnmarshaller(marshaller);
        return  quoteClient;
    }

}
