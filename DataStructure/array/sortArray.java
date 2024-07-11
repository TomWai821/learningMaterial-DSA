public class sortArray {

    void sort(int[] array){

        int length = array.length - 1;

        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < length; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
                printArray(array);
            }
        }
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int[] array = {0, 3, 2, 1, 5, 4};

        sortArray sr = new sortArray();

        sr.sort(array);
    }
}
