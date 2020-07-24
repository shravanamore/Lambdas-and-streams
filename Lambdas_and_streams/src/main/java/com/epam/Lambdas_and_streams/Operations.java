package com.epam.Lambdas_and_streams;

import java.util.List;

public class Operations {
	
	public static int average(List<Integer> listofnumbers)
    {
    	int avg  =0;
    	for(Integer iterator : listofnumbers)
    	{
    		avg += iterator;
    	}
    	return avg/listofnumbers.size();
    }
}
