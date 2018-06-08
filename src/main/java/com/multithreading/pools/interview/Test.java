package com.multithreading.pools.interview;

/**
 * Created by RANGAREJ on 5/26/2018.
 */

/**
 * Given two sorted arrays of integers. Sort them in ascending order. Constraint: Without using any separate array.
 input: int A[]={0,2,5,8}, int[] B={1,6,7}
 output: A ={0,1,2,5}, B = {6,7,8}
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * aabbbbbcAAA  b-2,5
 */
public class Test {
    public static void main(String K[]) {
        Map<Character,CharInfo> indexMaxCountMap=new HashMap<>();
       /* int A[]={0,1,2,5};
        int[] B={8,6,7};
        for(int i=0;i<B.length;i++){

            for(int j=0;j<A.length;j++){
                if(B[i]>A[j]){
                    int temp=A[j];
                    A[j]=B[i];
                    B[i]=temp;
                }
                if(i>j){
                    int temp=A[j];
                    A[j]=B[i];
                    B[i]=temp;
                }
            }
        }
    }*/
       String s="aabbbbbcAAA";
       Character givenChar='A';
       char[] data= s.toCharArray();
       for(int i=0;i<s.length();i++){
         Character c=data[i];
         if(Objects.isNull(indexMaxCountMap.get(c))){
             indexMaxCountMap.put(c,new CharInfo(i,1));
         }else{
             CharInfo charInfo=indexMaxCountMap.get(c);
             charInfo.setCharCount(charInfo.getCharCount()+1);
             indexMaxCountMap.put(c, charInfo);
         }
       }
      CharInfo charInfo= indexMaxCountMap.get(givenChar);
      System.out.println("GivenCharacter: "+givenChar+" CharIndex,CharCount"+charInfo.getCharIndex()+","+charInfo.getCharCount());

    }

}
