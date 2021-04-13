package week1.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
		
		int[]arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

	/*	 for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]); 
	}}*/
	Set<Integer> uniquenumber = new HashSet<Integer>();
	boolean isDuplicateExist = false;
	for(int i=0;i<arr.length;i++) {
		if(uniquenumber.contains(arr[i])) {
			isDuplicateExist = true;
			System.out.println("duplicate value is" + arr[i]);
		}else {
		uniquenumber.add(arr[i]);
		}}
	 }}