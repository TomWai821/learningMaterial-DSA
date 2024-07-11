package queue;

import java.util.LinkedList;

public class GenerateBinaryNumber 
{

    private String[] GenerateBinary(int input)
    {
        String[] result = new String[input];
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("1");

        for(int i = 0; i < input; i++)
        {
            result[i] = queue.poll();

            String n1 = result[i] + "0";
            String n2 = result[i] + "1";

            queue.offer(n1);
            queue.offer(n2);
            System.out.print(result[i] + " ");
        }
        return result;
    }



    public static void main(String[] args)
    {
        GenerateBinaryNumber gbn = new GenerateBinaryNumber();
        gbn.GenerateBinary(5);
    }
}
