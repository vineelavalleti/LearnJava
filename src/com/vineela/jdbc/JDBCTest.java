package com.vineela.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JDBCTest {

	public static void main(String[] args) {
		BufferedReader reader;
		
	

		try {
			reader = new BufferedReader(new FileReader("sample.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}


}
}