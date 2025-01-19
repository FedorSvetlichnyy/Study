package Part4.City;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Part4.City.CsvParser.parseCities;
import static Part4.City.CsvParser.parseLanguages;

public class CityFull {
    private int ID;
    private String name;
    private String countryCode;
    private String district;
    private int population;
    private List<Language> languages;

    public CityFull(int ID, String name, String countryCode, String district, int population, List<Language> languages) {
        this.ID = ID;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
        this.languages = languages;
    }

    public CityFull() {
        }

/*    public static List<CityFull> createCityFullList(List<City> cities, List<Language> languages) {
        Map<String, List<Language>> languageMap = languages.stream()
                .collect(Collectors.groupingBy(Language::getCountryCode));
        List<City> citiesCVS = parseCities("src/main/resources/part4/city/city.csv");
        List<Language> languagesCVS = parseLanguages("src/main/resources/part4/city/countrylanguage.csv");

        return cities.stream()
                .map(city -> {
                    CityFull cityFull = new CityFull(citiesCVS, languagesCVS);
                    cityFull.setID(city.getID());
                    cityFull.setName(city.getName());
                    cityFull.setCountryCode(city.getCountryCode());
                    cityFull.setDistrict(city.getDistrict());
                    cityFull.setPopulation(city.getPopulation());
                    cityFull.setLanguages(languageMap.getOrDefault(city.getCountryCode(), List.of()));
                    return cityFull;
                })
                .collect(Collectors.toList());
    }*/


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }
}

