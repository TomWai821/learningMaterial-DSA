public class moveZerotoEnd {
    public void moveZero(int[] array){
        int length = array.length;
        int j = 0;

        for(int i = 0; i < length; i++){
            if(array[i] != 0 && array[j] == 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            if(array[j] != 0){
                j++;
            }
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
        int[] array = {0, 12, 0, 4, 1};

        moveZerotoEnd moveZerotoEnd = new moveZerotoEnd();
        moveZerotoEnd.moveZero(array);
    }
}
