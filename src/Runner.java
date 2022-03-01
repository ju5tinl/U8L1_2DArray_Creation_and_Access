import java.util.Arrays;
public class Runner {
    public static void main(String[] args) {
        //a
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"},
                                   {"Brian", "Elenor", "Harry", "Lenny"},
                                   {"Cathy", "Fred", "Jill", "Matt"}};
        //b
        seatingChart[1][2] = "Paul";
        //c
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        //d
        String[] row0 = seatingChart[0];
        String[] row1 = seatingChart[1];
        seatingChart[0] = row1;
        seatingChart[1] = row0;
        //e
        for(String[] print : seatingChart){
            System.out.println(Arrays.toString(print));
        }
        //2a
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        //2b
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;
        for(int[] print : arr1){
            System.out.println(Arrays.toString(print));
        }
        //2c
        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;
        for(int[] print : arr2){
            System.out.println(Arrays.toString(print));
        }

    }
}
