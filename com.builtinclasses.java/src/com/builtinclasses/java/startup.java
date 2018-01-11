package com.builtinclasses.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] the5Songs = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		StringBuilder sb = new StringBuilder();
		StringBuilder the5SongsSB = new StringBuilder();
		
		    for(int i = 0; i < the5Songs.length; i++){
		      sb.append(the5Songs[i]);
		      sb.append(",  ");
		    }
		    
		    FileWriter outputStream;
		    FileReader inputStream;
		    BufferedReader reader;
		    
	try

	{
		outputStream = new FileWriter("songs.txt");
		outputStream.write(sb.toString());
		outputStream.close();
		
		inputStream = new FileReader("songs.txt");
		reader = new BufferedReader(inputStream);
		String line;
		while((line = reader.readLine()) != null){
			the5SongsSB.append(line);
		}
		
	}

	catch(
	IOException e)
	{
		System.out.println("An error occured");
		e.printStackTrace();
	}finally
	{
		System.out.println(the5SongsSB.toString());
	}

	}
}
