package gr.unipi.CountriesFX;


public class test {
    public static void main(String[] args) {
        testGetCountryByName();
    }

        private static CountryApi countryApi;


        public void setUp() {
            countryApi = new CountryApi();
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
