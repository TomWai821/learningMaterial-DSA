public class findMissing {

    int findMissingNumber(int[] array)
    {
        int length = array.length; 
        int sum = length * (length + 1) / 2; 

        for(int num : array)
        {
            sum = sum - num;  
            System.out.print(sum+ " ");
        }
        System.out.println();
        System.out.println("Missing Number:"+sum);
        return sum;
    }

    public static void main(String[] args)
    {
        int[] array = { 0, 1, 2, 3, 4, 5 };

        findMissing missing = new findMissing();
        missing.findMissingNumber(array);
    }
}
