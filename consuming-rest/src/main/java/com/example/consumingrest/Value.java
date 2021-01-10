package com.example.consumingrest;

public class Value {

    private Long id;
    private String quote;

    public Long getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override 
    public String toString() {
        return "Value{" +
            "id=" + id +
            ", quote='" + quote + '\'' +
            '}';
    }

   

}
