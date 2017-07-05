package com.coderising.ood.srp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PromotionMail {

	public static void main(String[] args) throws Exception {

		File f = new File("H:/课件/编程提高相关/coding2017/students/315752375/ood-assignment/src/main/java/com/coderising/ood/srp/product_promotion.txt");
		boolean debug=false;
		PromotionMail pe = new PromotionMail(f,debug);

	}

	
	public PromotionMail(File file,boolean debug) throws Exception {
		
		//读取配置文件， 文件中只有一行用空格隔开， 例如 P8756 iPhone8
		MailConfiguration mConf=new MailConfiguration(debug);
		
		ProductConfiguration pConf=new ProductConfiguration(file);
		
		sendEMails(mConf, pConf); 

	}
	
	protected List loadMailingList(String productID){
		String sendMailQuery = "Select name from subscriptions "
				+ "where product_id= '" + productID +"' "
				+ "and send_mail=1 ";
		System.out.println("loadQuery set");
		return DBUtil.query(sendMailQuery);
	}
	
	
	protected void sendEMails(MailConfiguration mconf, ProductConfiguration pconf) throws IOException 
	{
		List mailingList=loadMailingList(pconf.getproductID());
		System.out.println("开始发送邮件");
		if (mailingList != null) {
			Iterator iter = mailingList.iterator();
			while (iter.hasNext()) {
				HashMap userInfo=(HashMap) iter.next();
				mconf.setToAddress(userInfo); 
				mconf.setMessage(userInfo,pconf.getproductDesc() );
				mconf.sendEmail();
			}
		} 
		else {
			System.out.println("没有邮件发送");
		}

	}
}
