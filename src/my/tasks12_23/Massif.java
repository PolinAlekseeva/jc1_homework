package my.tasks12_23;

public class Massif {

    public static void main(String[] args) {

        int mas[] = {10,2,3,8,4,8,25,9,17,6};
        int indMax = 0;
        int indMin = 0;
        int max = mas[0];
        int min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                indMax = i;
            }
            else if(mas[i] < min) {
                min = mas[i];
                indMin = i;
            }
        }
        int sum = 0;
        for (int i = Math.min(indMin, indMax)+1; i < Math.max(indMin, indMax); i++) {
            sum += mas[i];
        }

        System.out.println("Сумма элементов между максимальным и минимальным значениями: " + sum);
    }
}

