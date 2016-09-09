package com.math.sort;

import java.util.Arrays;

public class RandomArray {     
    int[] array;     
    public RandomArray(int arrayLength, int maxNum){  
        //数组长度和最大随机数以参数形式传入  
        array = new int[arrayLength];  
        for(int i=0;i<array.length;i++){       
            array[i] = (int)(Math.random()*maxNum);        
        }  
    }     
    
    public static void main(String[] args) {     
        RandomArray randomArray = new RandomArray(100,10000); 
        Arrays.sort(randomArray.array);
        for(int i=0;i<randomArray.array.length;i++){  
            
            System.out.print(randomArray.array[i]);    
            System.out.print(",");
        }     
    }    
}
