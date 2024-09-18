// B 95. Write a program to implement Radix Sort using Array.

import java.util.*;
class RadixSort{
    static int arr[];

    public RadixSort(int length){
        arr = new int[length];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an Array:");
        int l = sc.nextInt();
        RadixSort sort = new RadixSort(l);

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element of index "+i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Original Array is,");
        sort.printArr(arr);

        System.out.println("Sorted Array is,");
        sort.radixSorting();
        sort.printArr(arr);
    }

    public int getMax(){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public void radixSorting(){
        int m = getMax();
        for(int place=1; (m/place)>0; place*=10){
            countSort(place);
        }
    }

    public void countSort(int place){
        int count[] = new int[10];
        int output[] = new int[arr.length];

        // for(int i=0;i<10;i++){      
        //     count[i] = 0;             not compalsaury
        // }

        for(int i=0; i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }

        for(int i=1;i<10;i++){
            count[i] = count[i] + count[i-1];
        }

        for(int i=arr.length-1; i>=0;i--){
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
    }

    public void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}