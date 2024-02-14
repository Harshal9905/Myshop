package com.strbuffer;

import com.myshop.Appliances;

public class StringBffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("-pune");
		sb.append("-Satara");
		sb.append(false);
		sb.append(10);//Autoboxing
		
		StringBuffer sb1 = new StringBuffer();
		//sb1.append("mumbai");
		
		sb.append(sb1);
		System.out.println(sb);
		
		Appliances ap = new Appliances();
		
		ap.setName("Mobile");
		ap.setPrice(20000);
		ap.setGst(ap.getPrice()*1.8);
		ap.setProductID(45);
		ap.setStock(10);
		sb.append(ap);
		System.out.println(sb);
	}
}
