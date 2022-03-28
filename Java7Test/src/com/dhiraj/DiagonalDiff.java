package com.dhiraj;

import java.util.ArrayList;
import java.util.List;
// DiagonalDiff of elements
public class DiagonalDiff {
    /**
     * complete the diagonal di
     * @param arr
     * @return
     */
	static int diagonalDifference(List<List<Integer>> arr)
	{    
		int size= arr.size();
		int add1= 0;
		int add2=0;
		for (int i = 0; i < arr.size(); i++) {
			add1= add1 + arr.get(i).get(i);
			add2= add2 + arr.get(i).get(size-i-1);
		}
		int absoluteValue= Math.abs(add1-add2);
		return absoluteValue;
	}
	/**
	 * @Test
	 * @param args
	 */
    public static void main(String[] args) {
    	DiagonalDiff ddf= new DiagonalDiff();
    	List al= new ArrayList<>();
    	al.add("Manish");
    	al.add("kumar");
    	al.add("verma");
        System.out.println(ddf.diagonalDifference(al));
        System.out.println("Manish Kumar Verma.....");
        System.out.println("Please let me know what is the use of total money which will be not continuous");
	}
}
