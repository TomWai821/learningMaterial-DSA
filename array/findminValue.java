public class findminValue {

    public int minValue(int[] array){
        int min = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }

        System.out.println(min);
        return min;
    }

    public static void main(String[] args){
        int[] arrays = new int[]{40,10,25,33,15,20};

        findminValue array = new findminValue();
        array.minValue(arrays);
    }
}
