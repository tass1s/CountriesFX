package gr.unipi.CountriesFX;



import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "currencies",
    "capital",
    "population",
    "continents"
})

public class Example {

    @JsonProperty("name")
    private Name name;
    @JsonProperty("currencies")
    private Currencies currencies;
    @JsonProperty("capital")
    private List<String> capital;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("continents")
    private List<String> continents;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("currencies")
    public Currencies getCurrencies() {
        return currencies;
    }

    @JsonProperty("currencies")
    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }

    @JsonProperty("capital")
    public List<String> getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("continents")
    public List<String> getContinents() {
        return continents;
    }

    @JsonProperty("continents")
    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
