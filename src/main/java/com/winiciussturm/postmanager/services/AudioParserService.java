package com.winiciussturm.postmanager.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AudioParserService
{

	public static void listSongData() 
	{
	
		String fileLocation = "C:/Users/winicius/Desktop/Personal/03. Livin' On A Prayer.mp3";
		
		try 
		{
			InputStream input = new FileInputStream(new File(fileLocation));
			ContentHandler handler = new DefaultHandler();
			Metadata metadata = new Metadata();
			Parser parser = new Mp3Parser();
			ParseContext parseCtx = new ParseContext();
			parser.parse(input, handler, metadata, parseCtx);
			input.close();
			
			String[] metadataNames = metadata.names();
			
			for (String name : metadataNames)
			{
				System.out.println(name + ": " + metadata.get(name));
			}
			
			System.out.println("-------------------------------");
			System.out.println("Title: " + metadata.get("title"));
			System.out.println("Artists: " + metadata.get("xmpDM:artist"));
			System.out.println("Genre: " + metadata.get("xmpDM:genre"));
			System.out.println("Album: " + metadata.get("xmpDM:album"));
			
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (SAXException e)
		{
			e.printStackTrace();
		}
		catch (TikaException e)
		{
			e.printStackTrace();
		}
		
	}
}
