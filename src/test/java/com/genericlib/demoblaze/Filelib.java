package com.genericlib.demoblaze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;

public class Filelib {
	public String getDAtafrompropertyfile(String path,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
}
}