package com.nit.CollectionFramework;

import java.util.Arrays;
import java.util.List;

public class OnlineApplicationPortal {

	public static void main(String[] args) {
		List<String> requiredDocs = Arrays.asList("PAN", "Aadhar");
		List<String> uploadedDocs = Arrays.asList("PAN", "Aadhar", "Photo");
		
		System.out.println(uploadedDocs.containsAll(requiredDocs));
		
	}

}
