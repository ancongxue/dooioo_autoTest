package com.dooioo.helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

/**
 * 操作cookie的工具类
 * @author ancongxue
 * @since 17/3/4
 *
 */

public class CookieUtil {

	private WebDriver driver;

	public CookieUtil(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 获取登陆的cookie，并存储到cookieFile中
	 * 
	 * @param cookieFile
	 * @throws IOException
	 */
	public void storeLoginCookie(File cookieFile) throws IOException {
		FileWriter out = new FileWriter(cookieFile);
		BufferedWriter bw = new BufferedWriter(out);
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {

			if (cookie.getName().contains("login")) {
				String str = cookie.getName() + ";" + cookie.getValue() + ";" + cookie.getDomain() + ";"
						+ cookie.getPath();
				bw.write(str);
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		out.close();
	}

	/**
	 * 获取cookieFile中的cookie信息，将其添加到网页中
	 * 
	 * @param cookieFile
	 * @throws IOException
	 */
	public void addLoginCookie(File cookieFile) throws IOException {
		FileReader in = new FileReader(cookieFile);
		BufferedReader br = new BufferedReader(in);

		String[] str3 = new String[200];
		String str2 = null;
		while ((str2 = br.readLine()) != null) {
			str3 = str2.split(";");
			Cookie ck = new Cookie(str3[0], str3[1], str3[2], str3[3], null);
			driver.manage().addCookie(ck);
		}
		br.close();
	}

}
