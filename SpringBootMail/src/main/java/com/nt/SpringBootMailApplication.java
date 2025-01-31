package com.nt;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IPurchaseOrder;

@SpringBootApplication
public class SpringBootMailApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(SpringBootMailApplication.class, args);
	IPurchaseOrder order=ctx.getBean("purchaseService",IPurchaseOrder.class);
	try
	{
		String msg=order.purchase(new String[] {"shirt", "trouser","watch"}, new double[] {5000,6000,7000},
				new String[] {"priyabratasatapathy2017@gmail.com","priyabratasatapathy00@gmail.com"});
		System.out.println(msg);
	}
	catch (Exception e) {
		
          e.printStackTrace();
	}
	((ConfigurableApplicationContext)ctx).close();
	}

}
