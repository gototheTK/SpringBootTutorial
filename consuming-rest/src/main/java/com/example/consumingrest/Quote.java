package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote{

    private String type;
    private Value value;

    public Quote() {

    }

    public String getTy() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Qoute{" +
            "type='" + type + '\'' +
            ", value=" + value +
            '}';
    }


}