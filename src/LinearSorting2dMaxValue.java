public class LinearSorting2dMaxValue {
    public static void main(String[] args) throws Exception {
        int[][] arr = {
                {43,56,32,67},
                {23,12,65},
                {99,88,66}
        }; 
        int maxVal = max(arr);
        System.out.println(maxVal);
    }

    static int max(int[][] arr){
        int maxVal = Integer.MIN_VALUE;
        for(int[] values: arr){
            for(int val: values){
                if(val > maxVal){
                    maxVal = val;
                }
            }
        }
        return maxVal;
    }
}
