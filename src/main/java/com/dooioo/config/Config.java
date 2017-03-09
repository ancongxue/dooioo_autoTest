package com.dooioo.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

/**
 * 应用程序配置
 * 
 * 获取测试环境、登陆工号等
 * @author ancongxue
 * @since 17/03/04
 */
public class Config {

	private static Properties  p = new Properties();
	
	static{
		InputStream in = Config.class.getClassLoader().getResourceAsStream("application.properties");

		try {
			p.load(in);
		} catch (IOException e) {
			System.out.println("读入配置文件发生错误" +e);
		}
	}
	//获得交易url
	public static String getJiaoyiUrl(){
		
		return p.getProperty("jiaoyi.url");
		
	}
	
	//获得登陆url
	public static String getLoginUrl(){
		return p.getProperty("login.url");
	}
	
	//获得ChromeDriver
	public static String getChromeDriver(){
		
		return p.getProperty("chrome.driver");
	}
	
	//获取房源url
	public static String getFangUrl(){
		return p.getProperty("fang.url");
	}
	
	//获取客源url
	public static String getKyUrl(){
		return p.getProperty("ky.url");
	}
	
	//获取案源编号
	public static String getCaseNo(){
		return p.getProperty("caseNo");
	}
	
	//获取登陆工号
	public static String getUserCode(){
		return p.getProperty("login.userCode");
	}
	
	//获取产证地址
	public static String getCertificateAddress(){
		return p.getProperty("certificateAddress");
	}
	
	//获取上传附件exe
	public static String getUploadFileExe(){
		return p.getProperty("uploadfile.exe");
	}
	
	//获取组织id 上海/苏州
	public static String getOrgId(){
		return p.getProperty("orgId");
	}
	
	//获取存放测试环境cookie的文件夹地址
	public static String getNetCookieFolder(){
		return p.getProperty("net.cookie.folder");
	}

	//获取存放集成环境cookie的文件夹地址
	public static String getOrgCookieFolder(){
		return p.getProperty("org.cookie.folder");
	}
	
	 public static void main(String[] args) {
		 
		Iterator<String> i= p.stringPropertyNames().iterator();
		while(i.hasNext()){
		String key=	i.next();
		System.out.println(key+"="+p.getProperty(key));
		}
		
		
	 }
	
}
