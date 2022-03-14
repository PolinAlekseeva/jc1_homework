package my.tasks12_23;

public class MassifThree {
    public static void main(String[] args) {

        int[][] mas = new int[5][];
        mas[0]= new int []{1, 1, 1, 1, 1} ;
        mas[1]= new int []{0, 1, 1, 1, 0} ;
        mas[2]= new int []{0, 0, 1, 0, 0} ;
        mas[3]= new int []{0, 1, 1, 1, 0} ;
        mas[4]= new int []{1, 1, 1, 1, 1} ;



        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                System.out.print(mas[i][j] + " ");

            }
            System.out.println();

        }
    }
}
