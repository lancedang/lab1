package com.ppdai.tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * PPdai java tutorial
 * @author dangdang
 * @version 2017.5.20
 *
 */
public class Driver {

	public static void main(String[] args) throws IOException {
		System.out.println("hello world");
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String param = bufferedReader.readLine();
		Planning planning = new Planning(param);
		System.out.println(planning);
		bufferedReader.close();
	}

}
