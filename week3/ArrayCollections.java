package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayCollections {
	public static void main(String[] args) {
		String[] companies = {"HCL", "Wipro", "Aspire","Systems", "CTS"};
		
		List<String> companyList = new ArrayList<>();
       
		
		Collections.addAll(companyList, companies);
		 Collections.sort(companyList);
		 System.out.println(companyList);
		 
	
	}
	}


