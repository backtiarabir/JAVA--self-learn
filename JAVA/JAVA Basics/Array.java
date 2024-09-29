import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        int v = 100;
        int flag = 0;
        int arr[] = {10,1,100,20,30,5,6};
        for(int i=0;i<arr.length;i++)
        {
            if(v==arr[i])
            {
                System.out.println("Value found!");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Value not found");
        }
        
    }
    
}
