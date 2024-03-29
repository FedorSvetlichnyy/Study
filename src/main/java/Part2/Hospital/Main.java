package Part2.Hospital;

public class Main {
    public static void main(String[] args) {

        // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
        // значений для проверки и отладки
        final int PATIENTS_COUNT = 30;

        float[] temperatureData = Hospital.generatePatientsTemperatures(PATIENTS_COUNT);
        System.out.println(Hospital.getReport(temperatureData));

        //Пример вывода в консоль:
        //Температуры пациентов: 36.7 38.9 34.7
        //Средняя температура: 36.76
        //Количество здоровых: 1


    }
}
