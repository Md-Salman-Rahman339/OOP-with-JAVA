class Main {
    public static void main(String[] args) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[0];  // No elements in the first row
        twoD[1] = new int[]{1, 2};  // Two elements in the second row
        twoD[2] = new int[]{3, 4, 5};  // Three elements in the third row
        twoD[3] = new int[]{6, 7, 8, 9};  // Four elements in the fourth row
        for(int i=0;i<twoD.length;i++){
            for(int j=0;j<twoD[i].length;j++){
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }

    }

}
