package gr.unipi.CountriesFX;

public class CountriesApiTest {
    private static CountryApi countryApi = new CountryApi(); // Directly initialize it here

    public static void main(String[] args) {
        testGetCountryByName();
    }

    public static void testGetCountryByName() {
        try {
            CountryInfo country = countryApi.getCountryByName("Greece");
            System.out.println(country);
        } catch (CountriesAPIException e) {
            e.printStackTrace();
        }
    }
}
