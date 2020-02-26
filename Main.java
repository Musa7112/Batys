package com.company;

import java.util.Arrays;
import java.util.Random;
import com.sun.source.tree.CompilationUnitTree;

public class Main
{

    public static void quikSort(int[] array)
    {
        quikSortRecursively(array,0,array.length-1);
    }

    private static void quikSortRecursively(int[] array, int low , int high)
    {
        if(low == high)
        {
            int p = partition(array,low,p-1);
            quikSortRecursively(array,low,p-1);
            quikSortRecursively(array,p+1,high);
        }
    }

    private static void swap(int[] array, int idx1 , int idx2)
    {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    private static int getPivot(int low,int high)
    {
        Random rand = new Random();
        return rand.nextInt((high-low)+1)+low;
    }

    private static void partition(int[] array,int low,int high)
    {
        swap(array,low,getPivot(low,high));
        int border = low + 1;
        for (int i = border; i <= high;i++)
        {
            if (array[] < array[low])
            {
                swap(array,,border++);
            }
        }
        swap(array,low,border-1);
        return border-1;
    }

    public static void main(String[] args)
    {
        int[] array = {5,12,1,7,3,5,87,-2,9};
        quikSort(array);
        for (int number:array)
        {
            System.out.println(array);
        }
    }

    /*public static void mergeSort(int[] a, int n)
    {
        if (n < 2)
        {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
        {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++)
        {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right)
    {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
        {
            if (l[i] <= r[j])
            {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left)
        {
            a[k++] = l[i++];
        }
        while (j < right)
        {
            a[k++] = r[j++];
        }
    }
    public static void main(String[] args)
    {
                int[] array ={3,1,2,8,4,9,5,15,7};
                mergeSort(array,array.length);
                for(int number:array)
                {
                    System.out.println(number);
                }
    }*/
}
