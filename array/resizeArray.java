public class resizeArray{

    public void resize(int[] array, int newSize){
        int[] newArray = new int[newSize];

        for(int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }
        array = newArray;
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
        int[] array = {0 ,1 ,2, 3, 4};

        resizeArray resizeArray = new resizeArray();
        resizeArray.resize(array, array.length * 2);
    }
}