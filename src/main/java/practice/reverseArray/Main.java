package practice.reverseArray;

public class Main {


    // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
    // значений для проверки и отладки
    public static void main(String[] args) {

        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] array = line.split(",?\\s+");
        String[] reverseArray = new String[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--, j++) {
                reverseArray[j] = array[i];
        }
        System.out.println(reverseArray);

    }
}
