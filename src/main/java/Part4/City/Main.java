package Part4.City;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Part4.City.CsvParser.parseCities;
import static Part4.City.CsvParser.parseLanguages;

public class Main {
    public static void main(String[] args) {
        List<City> citiesCVS = parseCities("src/main/resources/part4/city/city.csv");
        List<Language> languagesCVS = parseLanguages("src/main/resources/part4/city/countrylanguage.csv");
        System.out.println(createCityFullList(citiesCVS, languagesCVS));

        System.out.println(countCitiesWithUnofficialRussian(createCityFullList(citiesCVS, languagesCVS)));
        System.out.println(getCitiesWithMoreThanThreeOfficialLanguages(createCityFullList(citiesCVS, languagesCVS)));
    }
    public static List<CityFull> createCityFullList(List<City> cities, List<Language> languages) {
        Map<String, List<Language>> languageMap = languages.stream()
                .collect(Collectors.groupingBy(Language::getCountryCode));

        return cities.stream()
                .map(city -> {
                    CityFull cityFull = new CityFull();
                    cityFull.setID(city.getID());
                    cityFull.setName(city.getName());
                    cityFull.setCountryCode(city.getCountryCode());
                    cityFull.setDistrict(city.getDistrict());
                    cityFull.setPopulation(city.getPopulation());
                    cityFull.setLanguages(languageMap.getOrDefault(city.getCountryCode(), List.of()));
                    return cityFull;
                })
                .collect(Collectors.toList());
    }

    public static long countCitiesWithUnofficialRussian(List<CityFull> cities) {
        return cities.stream()
                .filter(city -> city.getLanguages().stream()
                        .anyMatch(lang -> "Russian".equals(lang.getLanguage()) && !lang.isOfficial()))
                .count();
    }

    public static List<String> getCitiesWithMoreThanThreeOfficialLanguages(List<CityFull> cities) {
        return cities.stream()
                .filter(city -> city.getLanguages().stream()
                        .filter(Language::isOfficial)
                        .count() > 3)
                .map(CityFull::getName)
                .collect(Collectors.toList());
    }
}
