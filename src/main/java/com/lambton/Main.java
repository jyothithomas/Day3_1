package com.lambton;

public class Main {
    public static void main(String[] args) {
        int a[];
        //int i, j = 0;
        int c[] = new int[5];
        c[0] = 10;
        c[1] = 20;
        c[2] = 11;
        c[3] = 15;
        c[4] = 10;
        // c[5]=60;
        a = new int[2];
        a[0] = 100;
        a[1] = 200;
        // System.out.println(a[1]);
        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(d.length);
        //using for(;;)
        //for(int i=0;i<d.length;i++){
        // System.out.println(d[i]);
        //}
        int[] x1, y1; //Both are array
        int x2, y2[]; // 1.int and 2. array
        int x3[], y3; // 1. array and 2. int
        int[] x4, y4[]; // 1.1D array 2. 2D array

        y4 = new int[3][3];
        //for compact
        for (int p : d) {
            System.out.println(p);

        }

        int i,j, max, min, sum;
        float avg;
        max = 0;
        min = 0;
        sum = 0;
        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Display Array values: ");
        for(i=0;i< ar.length ; i++)
            System.out.println(ar[i]);
        for(j=0;j< ar.length;j++)
        {
            sum+=j;
        }
        System.out.println("Sum: " + sum);
        avg = (float)sum/ar.length;
        System.out.println("Average : " + avg);
        for(i=0;i< ar.length; i++)
        {
            max= ar[0];
            if(max<ar[i])
                max=ar[i];    }
        System.out.println("Maximum value in array : " +max);
        for(i=0;i< ar.length; i++)
        {
            min= ar[0];
            if(min >ar[i])
                min =ar[i];}
        System.out.println("Minimum value in array : " +min);
        for(i=ar.length-1;i >=0; i--) {
           // System.out.println("");
            System.out.println(ar[i]+" ");
        }

    }
}
