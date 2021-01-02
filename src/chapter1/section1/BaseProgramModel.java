package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

/**
 * @ClassName BaseProgramModel
 * @Description TODO
 * @Author lichanghao
 * @Date 2020/12/30 22:53
 * @Version 1.0
 **/
public class BaseProgramModel {
    public static int binarySearch(int[] array,int target){
        int low=0;
        int high=array.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(array[mid]<target){
                low=mid+1;
            }else if(array[mid]>target){
                high=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] array,int target, int low,int high,int deep){
        deep++;
        for(int i =0;i<deep;i++)
            System.out.print("    ");
        System.out.println(low+","+high);
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(array[mid]>target){
            return binarySearch(array,target,low,mid-1,deep);
        }else if(array[mid]<target){
            return binarySearch(array,target,mid+1,high,deep);
        }else {
            return mid;
        }
    }

    @Test
    public void testBinarySearch(){
        int[] arr={11,23,44,65,78,344};
        int des = binarySearch(arr,46);
        int des2=binarySearch(arr,56,0,arr.length-1,0);
        System.out.println(des);
        System.out.println(des2);
        System.out.println(1+2+"3");
    }


}
