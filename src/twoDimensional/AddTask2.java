package twoDimensional;

public class AddTask2 {
    public static void main(String[] args) {
        int[][] nums = new int[10][10];
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
                for (int j = 0; j < nums[i].length; j++) {
                    nums[i][j] = k;
                    k++;
                }
            }
            else             for (int j = nums[i].length-1; j>=0; j--) {
                nums[i][j] = k;
                k++;
            }


        }
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
