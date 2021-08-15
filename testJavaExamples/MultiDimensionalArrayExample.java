public class MultiDimensionalArrayExample {

    public static void main(String[]args) {
        int[][] twoDimArray = {{1, 2, 3, 4}, {2, 4, 6, 7}}; //initializing a multi dimensional array
        //System.out.println(twoDimArray[1][1]); //Note here the [1] -> 2nd array and next [1] -> 2nd index within the 2nd array
        //always note the array index starts from zero
        /*for (int[]i:twoDimArray) {
            System.out.println("Value of i at [0][4] is:"+i); //note here value of i wouldn't be returned.
        */
        for(int i=0; i<twoDimArray.length;i++){
            for(int j=0;j<twoDimArray[i].length;j++){
                System.out.println(twoDimArray[i][j]);
            }
        }
    }
}
