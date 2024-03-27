////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        int [][] irregulerArray={
//                {1,2,3},
//                {4,5},
//                {6,7,8},
//        };
//        for(int i=0;i<irregulerArray.length;i++){
//            for(int j=0;j<irregulerArray[i].length;j++){
//                System.out.print(irregulerArray[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//
//        }
//    }

public class Main {
    public static void main(String[] args) {
        // Declare an irregular 2D array with a specified size
        int[][] irregularArray = new int[3][];

        // Specify the size of each row individually
        irregularArray[0] = new int[3];
        irregularArray[1] = new int[2];
        irregularArray[2] = new int[4];

        // Initialize the array
        int count = 1;
        for (int i = 0; i < irregularArray.length; i++) {
            for (int j = 0; j < irregularArray[i].length; j++) {
                irregularArray[i][j] = count++;
            }
        }

        // Print the irregular 2D array
        for (int i = 0; i < irregularArray.length; i++) {
            for (int j = 0; j < irregularArray[i].length; j++) {
                System.out.print(irregularArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
