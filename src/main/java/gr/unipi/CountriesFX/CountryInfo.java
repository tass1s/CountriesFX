package gr.unipi.CountriesFX;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import gr.unipi.CountriesFX.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryInfo {

	private Name name;
	private long population;
	private List<String> continents;
	private Map<String, Currencies> currencies;
	private List<String> capitals;

	// Getters and Setters
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public List<String> getCapital() {
		return capitals;
	}

	public void setCapital(List<String> capital) {
		this.capitals = capital;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public List<String> getContinents() {
		return continents;
	}

	public void setContinents(List<String> continents) {
		this.continents = continents;
	}

	public Map<String, Currencies> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Map<String, Currencies> currencies) {
		this.currencies = currencies;
	}

	public List<String> getCapitals() {
		return capitals;
	}

	public void setCapitals(List<String> capitals) {
		this.capitals = capitals;
	}

	@Override
	public String toString() {
		return "CountryInfo{" + "Name = " + name + "'\n" + ", Capital='" + capitals + "'\n" + "Currencies='"
				+ currencies + "'\n" + ", Population='" + population + "'\n" + ", Continent='" + continents + "'\n"
				+ '}';
	}
}
