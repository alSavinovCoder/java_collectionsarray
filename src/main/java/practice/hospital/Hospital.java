package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float minTemp = 32.0f;
        float maxTemp = 40.0f;
        float[] temperatureData = new float[patientsCount];

        for (int i = 0; i < patientsCount; i++) {
            float randomTemp = (float) ((float) Math.ceil(((Math.random() * (maxTemp - minTemp)) + minTemp) *
                    Math.pow(10, 1)) / Math.pow(10, 1));
            temperatureData[i] = randomTemp;
            }

        return temperatureData;
    }

    public static String getReport(float[] temperatureData) {
        float sumTemp = 0;
        int healthyPatient = 0;
        StringBuilder allTemps = new StringBuilder();

        for (int i = 0; i < temperatureData.length; i++) {
            sumTemp = sumTemp + temperatureData[i];
            allTemps.append(" " + temperatureData[i]);
            if (temperatureData[i] >= 36.1 && temperatureData[i] <= 37.0 ) {
                healthyPatient = healthyPatient + 1;
            }
        }

        float averageTemp = (float) (Math.round(sumTemp/temperatureData.length *
                Math.pow(10, 2)) / Math.pow(10, 2));
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        String report =
            "Температуры пациентов:" + allTemps +
            "\nСредняя температура: " + averageTemp +
            "\nКоличество здоровых: " + healthyPatient;

        return report;
    }
}
