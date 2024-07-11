public class ReverseArray {

    public void reverse(int[] array, int start, int end)
    {
        while(start < end){
            int temp = array[start];

            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        printArray(array);
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arrays = new int[]{0,1,2,3,4,5};

        ReverseArray array = new ReverseArray();
        array.reverse(arrays, 0, arrays.length - 1);
    }
}
