/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estacionamientos.service;

import java.io.Serializable;

/**
 *
 * @author Nermil
 */
public class NermilResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String messageResponse;
    private Long codeResponse;

    public String getMessageResponse() {
        return messageResponse;
    }

    public void setMessageResponse(String messageResponse) {
        this.messageResponse = messageResponse;
    }

    public Long getCodeResponse() {
        return codeResponse;
    }

    public void setCodeResponse(Long codeResponse) {
        this.codeResponse = codeResponse;
    }

}
