import java.util.*;
public class Main
{
    int zero=0;
    public void correctzero(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0){
                arr[zero]=arr[i];
                zero++;
            }
        }
        while(zero<arr.length){
            arr[zero]=0;
            zero++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int arr[]={0,1,0,3,12};
        Main obj=new Main();
        obj.correctzero(arr);
    }
}