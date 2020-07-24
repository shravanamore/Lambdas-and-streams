package com.epam.Lambdas_and_streams;

import java.util.*;
import java.util.function.*;

public class FilterPalindromes 
{
	public List<String> palandromeStrings;
	FilterPalindromes()
	{
		this.palandromeStrings = new ArrayList<String>();
	}
	public static Boolean findPalandrome(String stringToBeChecked)
	{
		int i = 0, j = stringToBeChecked.length()-1;
		while(i < j)
		{
			if(stringToBeChecked.charAt(i)!=stringToBeChecked.charAt(j))
			{
				return false;
			}
			i = i+1;
			j = j-1;
		}
		return true;
	}
	public void filterPalandrome(List<String> listOfStringsToBeChecked,Predicate<String> predicate)
	{
		for(String str : listOfStringsToBeChecked)
		{
			if(predicate.test(str))
			{
				this.palandromeStrings.add(str);
				
			}
		}
	}
	public void display(Consumer<String> consumer)
	{
		for(String str : this.palandromeStrings)
		{
			consumer.accept(str);
		}
	}
}
