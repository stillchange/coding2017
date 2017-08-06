package com.coderising.dp.decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	String content="原始邮件的内容";
	EmailImpl emailImpl;
	@Before
	public void setUp() throws Exception {
		emailImpl=new EmailImpl(content);
	}

	@Test
	public void test() {
		{
			System.out.println("test 1");
			System.out.println("original content:\n"+emailImpl.getContent());
			EmailStatement externalEmail=new EmailStatement(emailImpl);
			System.out.println("after adding a statement:\n"+externalEmail.getContent());
		}
		{
			System.out.println("\ntest 2");
			System.out.println("original content:\n"+emailImpl.getContent());
			EmailEncode emailEncode=new EmailEncode(emailImpl);
			System.out.println("after encoding:\n"+emailEncode.getContent());
		}
		{
			System.out.println("\ntest 3");
			System.out.println("original content:\n"+emailImpl.getContent());
			EmailStatement externalEmail=new EmailStatement(emailImpl);
			EmailEncode emailEncode=new EmailEncode(externalEmail);
			System.out.println("after adding a statement and encoding:\n"+emailEncode.getContent());
		}
		{
			System.out.println("\ntest 4");
			System.out.println("original content:\n"+emailImpl.getContent());
			EmailEncode emailEncode=new EmailEncode(emailImpl);
			EmailStatement externalEmail=new EmailStatement(emailEncode);
			System.out.println("after encoding and adding a statement:\n"+externalEmail.getContent());
		}
	}

}
