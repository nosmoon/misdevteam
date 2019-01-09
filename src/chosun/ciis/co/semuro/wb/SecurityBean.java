package chosun.ciis.co.semuro.wb;

import java.util.*;
import java.io.*;
import java.security.*;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class SecurityBean {


    public static BASE64Encoder encoder = null;
    public static BASE64Decoder decoder = null;


	public String encodeString(String value){

	  String result = "";

	  BASE64Encoder en = new BASE64Encoder();

	  result = en.encode(value.getBytes());

	  return result;
	}

	public String decodeString(String value){

		String result = "";
		try{
		BASE64Decoder decoder = new BASE64Decoder();

		byte[] b1 = decoder.decodeBuffer(value);

		result = new String(b1);

		}catch(IOException ex){
			System.out.println("error : " + ex.getMessage());
		}
		return result;
	}
}
