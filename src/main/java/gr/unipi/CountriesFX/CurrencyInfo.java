
package gr.unipi.CountriesFX;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.*;
public class CurrencyInfo {

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Symbol: " + symbol;
    }
}

