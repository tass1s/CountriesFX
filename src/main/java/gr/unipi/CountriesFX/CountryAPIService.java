package gr.unipi.CountriesFX;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class CountryAPIService {

    private static final String BASE_URL = "https://restcountries.com/v3.1/";

    public List<CountryInfo> getCountryByName(String name) throws CountriesAPIException {
        try {
            // Encode the country name to ensure it's correctly formatted for a URL
            String encodedName = URLEncoder.encode(name, StandardCharsets.UTF_8.toString());
            // Use the encoded name in the API request
            return getAPIData("name/" + encodedName, CountryInfo[].class);
        } catch (IOException e) {
            throw new CountriesAPIException("Error encoding the country name.", e);
        }
    }

    public List<CountryInfo> getCountriesByLanguage(String language) throws CountriesAPIException {
        return getAPIData("lang/" + language, CountryInfo[].class);
    }

    public List<CountryInfo> getCountriesByCurrency(String currency) throws CountriesAPIException {
        return getAPIData("currency/" + currency, CountryInfo[].class);
    }

    public List<CountryInfo> getCountriesByRegion(String region) throws CountriesAPIException {
        return getAPIData("region/" + region, CountryInfo[].class);
    }

    public List<CountryInfo> getAllCountries() throws CountriesAPIException {
        return getAPIData("all", CountryInfo[].class);
    }

    private <T> List<T> getAPIData(String path, Class<T[]> clazz) throws CountriesAPIException {
        try {
            HttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(BASE_URL + path);

            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();

            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new CountriesAPIException("Error occurred on API call: " + response.getStatusLine().getReasonPhrase());
            }

            ObjectMapper mapper = new ObjectMapper();
            return Arrays.asList(mapper.readValue(entity.getContent(), clazz));
        } catch (IOException e) {
            throw new CountriesAPIException("Error requesting data from the CountryDB API.", e);
        }
    }
}
