
public class ArrayUtil {    
    
    public int[] removeEven(int[] arr){

        // Use to count the odd number amount
        int oddCount = 0;

        // Check each number in array with for loop
        for(int i = 0; i < arr.length; i++)
        {
            // add the counter while the number divide 2 not in 0
            if(arr[i] % 2 != 0)
            {
                oddCount++;
            }
        }

        // Create a new array called result and set oddCount as new array(result) length
        int[] result = new int[oddCount];

        // Use to count the number of length
        int index = 0;

        // Check each number in arr array with for loop
        for(int i = 0; i < arr.length; i++)
        {
            // copy the number in arr array to result array
            if(arr[i] % 2 != 0)
            {
                result[index] = arr[i];
                index++;
            }
        }

        // print the number in result array
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }

        // return to result array while using this function
        return result;
    }

    public static void main(String[] args){
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.removeEven(new int[] {0, 1, 2, 3, 4, 5, 6});
    }
}
