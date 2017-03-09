package com.dooioo.helper;

import java.util.Random;

/**
 * 随机产生电话号码的工具类
 * @author ancongxue
 * 
 */

public class TelNumGenerator {

    	private static String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153,181,185,186,187".split(",");      
        public static String getTel() {  
		StringBuilder str = new StringBuilder();
		Random random = new Random();
		str.append(telFirst[random.nextInt(23)]);
		for (int i =0; i<8 ;i++){
			str.append(random.nextInt(10));			
		}		
    	return str.toString();
    	}
    
    }
