package Part4.City;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public static List<City> parseCities(String filePath) {
        List<City> cities = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.skip(1); // ѕропускаем первую строку (заголовок)
            String[] line;
            while ((line = reader.readNext()) != null) {
                cities.add(new City(
                        Integer.parseInt(line[0]),
                        line[1],
                        line[2],
                        line[3],
                        Integer.parseInt(line[4])
                ));
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return cities;
    }

    public static List<Language> parseLanguages(String filePath) {
        List<Language> languages = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.skip(1); // ѕропускаем первую строку (заголовок)
            String[] line;
            while ((line = reader.readNext()) != null) {
                languages.add(new Language(
                        line[0],
                        line[1],
                        Boolean.parseBoolean(line[2])
                ));
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return languages;
    }

    public static void main(String[] args) throws IOException, CsvException {
        List<City> cities = parseCities("src/main/resources/part4/city/city.csv");
        List<Language> languages = parseLanguages("src/main/resources/part4/city/countrylanguage.csv");

        System.out.println(cities.size());
        System.out.println(languages.size());

        System.out.println(cities);
        System.out.println(languages);
    }
}

