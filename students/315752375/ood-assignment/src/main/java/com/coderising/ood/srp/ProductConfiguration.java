package com.coderising.ood.srp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProductConfiguration {
	private String productID = null;
	private String productDesc = null;
	public ProductConfiguration(File file)throws Exception{
		readFile(file);
	}
	protected void setProductID(String productID) 
	{ 
		this.productID = productID; 
		
	} 

	protected String getproductID() 
	{
		return productID; 
	}
	protected void setProductDesc(String desc) {
		this.productDesc = desc;		
	}
	protected String getproductDesc() {
		return productDesc;
	}
	protected void readFile(File file) throws IOException // @02C
	{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String temp = br.readLine();
			String[] data = temp.split(" ");
			
			setProductID(data[0]); 
			setProductDesc(data[1]); 
			
			System.out.println("产品ID = " + data[0] + "\n");
			System.out.println("产品描述 = " + data[1] + "\n");

		} catch (IOException e) {
			throw new IOException(e.getMessage());
		} finally {
			br.close();
		}
	}
	
}
