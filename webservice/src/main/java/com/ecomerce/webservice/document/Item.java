package com.ecomerce.webservice.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {
    private Double descricao;
    private String detalhe;
    private String nome;
}
