package org.magnum.mobilecloud;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class CreditCardTest {

	@Test
	public void isValidCardtest() {
        //String card = "9795526789839145";
        String card = "2861747566959730";
        String revCard = new StringBuilder(card).reverse().toString();
        System.out.println("rev: " + revCard);
        
        List<Integer> liB = new ArrayList<Integer>();
        
        int A = 0;
        int B = 0;
        
        //get a list of integers
        for (int i=0; i<revCard.length(); i++) {
        	  char c = revCard.charAt(i);
        	  int v = Character.getNumericValue(c);
        	  System.out.println("i, v: " + i + ", " + v);
        	  
        	  if(i%2 == 0) {
        		  A += v;
        	  }else{
        		  System.out.println("v*2: " + v*2);
        		  liB.add(v*2);
        	  }
        }
        
        System.out.println("A: " + A);
        
        
        
        int max = liB.size();
        Random random = new Random();
        
        int r1 = random.nextInt(max);
        System.out.println("r1: "  + r1);
        int r2 = random.nextInt(max);
        System.out.println("r2: " + r2);
        
        int rn1 = liB.get(r1);
        int rn2 = liB.get(r2);
        
        System.out.println("rn1, rn2: " + rn1 + ", " + rn2);
        liB.set(r1, rn1 >= 10 ? (1 + rn1 - 10):rn1);
        liB.set(r2, rn2 >= 10 ? (1 + rn2 - 10):rn2);
        
        for(Integer ci:liB){
        	B += ci;
        }
        
        System.out.println("B: " + B);
        
        int sum = A + B;
        
        if(sum % 10 == 0){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        
        
        
        
       
        
        
        
	
	}

}
