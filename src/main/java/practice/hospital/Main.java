package practice.hospital;

public class Main {
    public static void main(String[] args) {

        float minTemp = 32.0f;
        float maxTemp = 40.0f;
        int patientCount = 5;
        float[] patientsTemps = new float[patientCount];
        float sumTemp = 0;
        int healthyPatient = 0;
        StringBuilder allTemps = new StringBuilder();

        for (int i = 0; i < patientCount; i++) {
            float randomTemp = (float) ((float) Math.ceil(((Math.random() *
                    (maxTemp - minTemp)) + minTemp) * Math.pow(10, 1)) / Math.pow(10, 1));
            patientsTemps[i] = randomTemp;
            System.out.println(i + " " + patientsTemps[i]);
        }

        for (int i = 0; i < patientCount; i++) {
            sumTemp = sumTemp + patientsTemps[i];
            allTemps.append(patientsTemps[i] + " ");
            if (patientsTemps[i] >=36.2 && patientsTemps[i] <= 36.9 ) {
                healthyPatient = healthyPatient + 1;
            }
        }

        float averageTemp = (float) (Math.ceil(sumTemp/patientCount *
                Math.pow(10, 2)) / Math.pow(10, 2));


        System.out.println("температуры пациентов: " + allTemps);
        System.out.println("средняя температура: " + averageTemp);
        System.out.println("здоровых пациентов: " + healthyPatient + "\n");



        // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
        // значений для проверки и отладки


        float[] temperatureData = Hospital.generatePatientsTemperatures(30);
        System.out.println(Hospital.getReport(temperatureData));


        //Пример вывода в консоль:
        //Температуры пациентов: 36.7 38.9 34.7
        //Средняя температура: 36.76
        //Количество здоровых: 1


    }
}
