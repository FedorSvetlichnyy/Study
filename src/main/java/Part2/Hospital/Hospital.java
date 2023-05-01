package Part2.Hospital;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Hospital {
    public static final float MIN_TEMPERATURA_HEALTH_PATIENT = 36.2f;
    public static final float MAX_TEMPERATURA_HEALTH_PATIENT = 36.9f;
    public static final int MIN_TEMPERATURA_PATIENT = 32;
    public static final int MAX_TEMPERATURA_PATIENT = 40;

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperatures = new float[patientsCount];
        Random random = new Random();
        for (int i = 0; i < patientsCount; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(MIN_TEMPERATURA_PATIENT, MAX_TEMPERATURA_PATIENT);
            float floatRandom = random.nextFloat() + randomNum;
            patientsTemperatures[i] = floatRandom;
        }
        return patientsTemperatures;
    }
    public static String toString(float[] temperatureData) {
        String temperature = "";
        for (int i = 0; i < temperatureData.length; i++) {
            String floaToString = new DecimalFormat("#.0").format(temperatureData[i]);
            temperature = temperature + " " + floaToString;
        }
        return temperature;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        float temp = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            temp += temperatureData[i];
        }
        float averageTemperature = temp / temperatureData.length;

        int healthyPatient = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i] >= MIN_TEMPERATURA_HEALTH_PATIENT & temperatureData[i] <= MAX_TEMPERATURA_HEALTH_PATIENT) healthyPatient++;
        }

        String report =
                "Температуры пациентов: " + toString(temperatureData) +
                        "\nСредняя температура: " + String.format("%.2f", averageTemperature) +
                        "\nКоличество здоровых: " + healthyPatient;

        return report;
    }
}
