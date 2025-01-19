package Part4.City;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class GenericParser {
    public static <T> List<T> parse(String filePath, Class<T> clazz) {
        List<T> result = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.skip(1); // ѕропускаем первую строку (заголовок)
            String[] line;
            Constructor<T> constructor = (Constructor<T>) clazz.getDeclaredConstructors()[0];
            while ((line = reader.readNext()) != null) {
                Object[] args = new Object[line.length];
                for (int i = 0; i < line.length; i++) {
                    Class<?> paramType = constructor.getParameterTypes()[i];
                    if (paramType == int.class) {
                        args[i] = Integer.parseInt(line[i]);
                    } else if (paramType == boolean.class) {
                        args[i] = Boolean.parseBoolean(line[i]);
                    } else {
                        args[i] = line[i];
                    }
                }
                result.add(constructor.newInstance(args));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

