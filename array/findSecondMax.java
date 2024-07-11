public class findSecondMax {

    public int findSecond(int[] array){
        int length = array.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < length; i++)
        {
            if(array[i] > max)
            {
                secondMax = max;
                max = array[i];
            }
            else if(array[i] > secondMax && array[i] != max)
            {
                secondMax = array[i];
            }
        }

        System.out.println("Biggest number:" + max +",Second Biggest number:" + secondMax);
        return secondMax;

    }

    public static void main(String[] args){
        int[] arrays = new int[]{10,5,40,20,15,40};

        findSecondMax array = new findSecondMax();
        array.findSecond(arrays);
    }
}
