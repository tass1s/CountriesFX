package gr.unipi.CountriesFX;

import java.util.List;

public class CountryApi {

	private CountryAPIService countryAPIService;

	public CountryApi() {
		this.countryAPIService = new CountryAPIService();
	}

	public List<CountryInfo> getAllCountries() throws CountriesAPIException {
		return countryAPIService.getAllCountries();
	}

	public CountryInfo getCountryByName(String name) throws CountriesAPIException {
		return countryAPIService.getCountryByName(name).stream().filter(country -> country.getName().getCommon().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
	}

	public List<CountryInfo> getCountriesByLanguage(String language) throws CountriesAPIException {
		return countryAPIService.getCountriesByLanguage(language);
	}

	public List<CountryInfo> getCountriesByCurrency(String currency) throws CountriesAPIException {
		return countryAPIService.getCountriesByCurrency(currency);
	}

	public List<CountryInfo> getCountriesByRegion(String region) throws CountriesAPIException {
		return countryAPIService.getCountriesByRegion(region);
	}
}
