package methods;

public class Task8 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {4, 3, 2, 1},
                         {8, 7, 6, 5}};
        check(nums);
    }
//            1 2 3 4
//            5 6 7 8
//            4 3 2 1
//            8 7 6 5
    public static void check(int array[][]){
        for (int i = array.length-1; i > array.length-2; i--) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < array.length-1; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
