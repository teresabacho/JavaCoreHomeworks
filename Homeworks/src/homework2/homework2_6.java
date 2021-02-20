package homework2;

import java.util.Arrays;

import static java.lang.Math.*;

public class homework2_6 {
    public static void main(String[] args){
        int[] a = new int[10];
        int i;
        int max;
        int min;
        int index;

        for(i = 0; i < 10; i++){
            a[i] = (int) ((random()*(100+100))-100);
        }
        System.out.print(Arrays.toString(a) + " ");

        max = a[0];
        index = 0;
        for(i = 0; i<10; i++){
            if(max<a[i]){
                max = a[i];
                index = i + 1;
            }
        }
        System.out.print("Ваш максимум: " + max + " ,а його індекс: " + index + "  ");

        min = a[0];
        index = 0;
        for(i = 0; i<10; i++){
            if(min>a[i]){
                min = a[i];
                index = i + 1;
            }
        }
        System.out.print("Ваш мінімум: " + min + " ,а його індекс: " + index + "  ");

    }


}
