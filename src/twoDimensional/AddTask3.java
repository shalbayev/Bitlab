package twoDimensional;

public class AddTask3 {
    public static void main(String[] args) {
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1},
        };
        //0 0  0 1  0 2  0 3
        //1 0  1 1  1 2  1 3
        //2 0  2 1  2 2  2 3
        //3 0  3 1  3 2  3 3
        int n = magicSquare.length;
        boolean check = false;
        int sum = 0;
        int sum2 = 0;
        int count = 0;
        int magicConstant = n * (n * n + 1) / 2;
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < magicSquare.length; i++) {

            for (int j = 0; j < magicSquare[i].length; j++) {
                sum+=magicSquare[i][j];
            }
            for (int j = 0; j < magicSquare[i].length; j++) {
                sum+=magicSquare[j][i];
                check=true;
            }
            for (int j = 0; j < magicSquare[i].length; j++) {
                sum+=magicSquare[j][j];
            }
            if(sum==magicConstant*6){
                count++;
            }
            else if(sum!=magicConstant*6){
                break;
            }
        }
        int k = 0;
        for (int i = magicSquare.length-1; i >= 0; i--) {
            sum+=magicSquare[k][i];
            k++;
        }
        System.out.println("Sum: " + sum);

        System.out.println(count);



    }
}

