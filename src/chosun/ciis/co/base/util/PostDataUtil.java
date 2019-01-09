package chosun.ciis.co.base.util;

import java.io.*;
import java.net.*;
import java.lang.*;
import javax.xml.parsers.*;
import javax.xml.transform.sax.*;
import org.w3c.dom.*;
import org.xml.sax.*;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.log.LogManager;

public class PostDataUtil {
	public static String Post(String strUrl, String strParam) {
		String retData			= "";
		URL url					= null;
		URLConnection httpConn	= null;
		BufferedReader in		= null;
		PrintWriter pout		= null;
		String resultStr		= "";
		StringBuffer buf		= new StringBuffer();
		
		try {
			url		= new URL(strUrl);
			httpConn = url.openConnection();
			
			httpConn.setDoOutput(true);
			httpConn.setUseCaches(false);
			pout = new PrintWriter (httpConn.getOutputStream());
			
			System.out.println(strParam);
			pout.print(strParam);
			pout.flush();
	
			InputStream is = httpConn.getInputStream();
			in = new BufferedReader(new InputStreamReader(is),8*1024);
	
			String line = null;
			while( (line=in.readLine())!= null ){
				System.out.println(line);
				resultStr += line;
				//result = "ok";
			}
			
			
			
		}catch(MalformedURLException e){
			System.out.println(e);
			resultStr = "Fail";
		}finally{
			System.out.println("[semuro.common.beans.DeedMng] sendMsg_chosun() Transmission result >> " + resultStr);			
			if ( pout != null )
				try {	pout.close(); }
				catch(Exception e) {}
				if ( in != null )
				try {in.close();}
				catch(Exception e){}
			return resultStr;
		}
	}
	
	public static String getXmlParsing(String strXML, String strTag) throws SysException {
		String strTagValue = "";

		try {
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		   	dbfactory.setNamespaceAware(true);
		   	DocumentBuilder builder = dbfactory.newDocumentBuilder();
		   	StringReader sr = new StringReader(strXML);
		   	InputSource iis = new InputSource(sr);
		
		   	System.out.println("PostDataUtil.strXML=" + strXML);
		   	Document doc = builder.parse(iis);
		   	
		   	Element root = doc.getDocumentElement();
		   	NodeList list = root.getElementsByTagName(strTag);
		   	strTagValue = (String) list.item(0).getFirstChild().getNodeValue();
	
		   	System.out.println(strTag + "=" + strTagValue);
		   	return strTagValue;
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			strTagValue = "";
			throw se;
		} catch (IOException e) {
			e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            strTagValue = "";
            throw se;
       } catch (SAXException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            strTagValue = "";
            throw se;
        } finally {
        	return strTagValue;
        }
	   	

	}
}
