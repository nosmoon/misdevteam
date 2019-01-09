/***************************************************************************************************
* ���ϸ� : 
* ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.co.decid.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.io.*;
import java.net.*;
import javax.servlet.http.*;

import javax.xml.parsers.*;
import javax.xml.transform.sax.*;
import org.w3c.dom.*;
import org.xml.sax.*;
//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.*;
import com.oreilly.servlet.multipart.Part;

import chosun.ciis.co.base.util.*;
import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.decid.dm.*;
import chosun.ciis.co.decid.ds.*;
//import chosun.ciis.co.decid.ejb.CO_DECID_1000EJB;
//import chosun.ciis.co.decid.ejb.CO_DECID_1000EJBHome;
import chosun.ciis.co.decid.servlet.CODecidWBMapping;
/**
 * 
 */

public class CO_DECID_1000WB extends BaseWB {

	/**
	 * ��Ƽ���ڵ�ó�� row ������
	 */
	public final String ROW_SEPARATOR = "|";
	/**
	 * ��Ƽ���ڵ�ó�� column ������
	 */
	public final String COL_SEPARATOR = "#";

	/**
     * ���ڰ��� ���
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void co_decid_1000(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DECID_1000_IDataSet ds	= null;      
        // DM Setting
        CO_DECID_1000_IDM dm		= new CO_DECID_1000_IDM();
        //CO_DECID_1000EJBHome home	= (CO_DECID_1000EJBHome) JNDIManager.getInstance().getHome("CO_DECID_1000EJB");

        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setDecid_job_cd(Util.checkString(req.getParameter("decid_job_cd")));
        dm.setDoc_titl(Util.checkString(req.getParameter("doc_titl")));
        dm.setDoc_stat_cd(Util.checkString(req.getParameter("doc_stat_cd")));
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
        
        ds = (CO_DECID_1000_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

	/**
	 * ���ڰ��� ���°� ���� ����
	 *
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void co_decid_1001(HttpServletRequest req, HttpServletResponse res) throws   AppException, ParserConfigurationException, IOException, SQLException {
		DBManager manager = new DBManager("MISCOM");
		BaseDataSet ds				= null;

		// DM Setting
		CO_DECID_1001_UDM dm		= new CO_DECID_1001_UDM();
		String strDocument			= req.getParameter("Document");
		String strDoc_stat			= "";
		String strRecipient			= "";
		String strdocID				= Util.checkString(req.getParameter("docID"));
		String strprotID			= Util.checkString(req.getParameter("protID"));
		
		System.out.println("document=" + strDocument);
		
		try {

			if (strDocument == null){
				strDoc_stat = req.getParameter("protID");
			} else {
				DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
				dbfactory.setNamespaceAware(true);
				DocumentBuilder builder = dbfactory.newDocumentBuilder();
				StringReader sr = new StringReader(strDocument);
				InputSource is = new InputSource(sr);
	
				Document doc = builder.parse(is);
	        	
				Element root = doc.getDocumentElement();
				NodeList list = root.getElementsByTagName("documentStatus");
				strDoc_stat = (String) list.item(0).getFirstChild().getNodeValue();
				
				list = root.getElementsByTagName("recipient");
				strRecipient = (String) list.item(0).getFirstChild().getNodeValue();
				
				System.out.println("prev emp_no=" + strRecipient);
				if (strRecipient.substring(0,1).equals("c")){
					strRecipient = strRecipient.substring(1, strRecipient.length());
				}
				
				System.out.println("conv emp_no=" + strRecipient);
			}
			String doc_stat_cd = "";
			
			System.out.println("strDoc_stat=" + strDoc_stat);
			System.out.println("strdocID=" + strdocID);
			System.out.println("Decid_key=" + strdocID.substring(4, strdocID.length()));
			
			if (strDoc_stat.equals("createDoc")){
				doc_stat_cd = "10";
			} else if (strDoc_stat.equals("accepted")){
				doc_stat_cd = "30";
			} else if (strDoc_stat.equals("updated")){
				doc_stat_cd = "40";
			} else if (strDoc_stat.equals("processed")){
				doc_stat_cd = "50";
			} else if (strDoc_stat.equals("returned")){
				doc_stat_cd = "60";
			} else if (strDoc_stat.equals("deleteDoc")){
				doc_stat_cd = "70";
			} else {
				doc_stat_cd = "10";
			}
			
			dm.setCmpy_cd(strdocID.substring(0,3));
			dm.setDecid_key(strdocID.substring(4, strdocID.length()));
			dm.setDoc_stat_cd(doc_stat_cd);
			dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
			dm.setChg_pers(strRecipient);
			dm.print();
            
			ds = (BaseDataSet) manager.executeCall(dm);
	        if (!"".equals(ds.getErrcode())) {
	            throw new AppException(ds.getErrcode(), ds.getErrmsg());
	        }

			req.setAttribute("ds", ds);
		}
		catch (ParserConfigurationException e) {
			e.printStackTrace();
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (IOException e) {
			e.printStackTrace();
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (SAXException e) {
			e.printStackTrace();
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
	}
    
    /**
     * ���ڰ��� ÷������ ���ε�
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_decid_2000(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DECID_2000_IDataSet ds	= null;
    	byte[] cont					= null;
    	String decid_key			= "";
    	String fileName				= "";
        int sizeLimit				= 100 * 1024 * 1024 ;
        MultipartParser mp			= new MultipartParser(req, sizeLimit, true, true, "UTF-8"); // 10MB 
        
        // DM Setting
        CO_DECID_2000_IDM dm		= new CO_DECID_2000_IDM();
        //CO_DECID_1000EJBHome home	= (CO_DECID_1000EJBHome) JNDIManager.getInstance().getHome("CO_DECID_1000EJB");

        try {
        	Part part; 
        	while ((part = mp.readNextPart()) != null) {

    			String name  = part.getName();

    			if (part.isParam()) {
    				if (name.equals("decid_key")){
    	        		ParamPart paramPart = (ParamPart) part; 
    	        		decid_key = new String(paramPart.getStringValue());
    	        	}
    			}else if (part.isFile()) {
    				
    				

    				FilePart filePart = (FilePart) part;
    				//byte[] filecont = (byte[]) filePart..getAttribute("filecont");
    				fileName = filePart.getFileName();

    				if ( fileName != null ) {
    					fileName			= filePart.getFileName();
    					InputStream in		= filePart.getInputStream();
    					cont				= StreamUtil.readFromStream(in);
    					in.close();
    				}
    			}
        	}
        	
        	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        	dm.setDecid_key(decid_key);
            dm.setAdd_file(cont);
            dm.setAdd_file_nm(fileName);
            dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
            dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
            dm.print();
            
            ds = (CO_DECID_2000_IDataSet) manager.executeCall(dm);
	        if (!"".equals(ds.getErrcode())) {
	            throw new AppException(ds.getErrcode(), ds.getErrmsg());
	        }

            req.setAttribute("ds", ds);
        }
        catch (RemoteException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (IOException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }
    
    /**
     * ���ڰ��� ÷������ �ٿ�ε�
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_decid_2001(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DECID_2001_LDataSet ds	= null;
    	String[] cont				= null;
    	String decid_key			= "";
    	String cmpy_cd				= "";
    	String fileName				= "";
    	HttpSession sess			= req.getSession();
    	
        // DM Setting
        CO_DECID_2001_LDM dm = new CO_DECID_2001_LDM();
        //CO_DECID_1000EJBHome home = (CO_DECID_1000EJBHome) JNDIManager.getInstance().getHome("CO_DECID_1000EJB");

        decid_key = Util.checkString(req.getParameter("docID"));
    	cont = decid_key.split("-");
    	cmpy_cd = cont[0];
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDocid(Util.checkString(req.getParameter("docID")));
    	dm.setSubseq(Util.checkString(req.getParameter("subseq")));
        dm.print();
        
        ds = (CO_DECID_2001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.getErrcode())) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }
    }
    
    /**
     * ���ڰ��� ����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_decid_3000(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
    	DBManager manager = new DBManager("MISCOM");
    	//CO_DECID_3000_DataSet ds	= new CO_DECID_3000_DataSet();
    	BaseDataSet ds				= null;
    	CO_DECID_1001_UDM dm		= new CO_DECID_1001_UDM();
    	String resultXml		= "";	
    	String userID			= "userID=";
    	String jobID			= "jobID=";
    	String docID			= "docID=";
    	String protID			= "protID=";
    	String document			= "";
    	String param			= "";
    	String strStatus		= "";
    	String strHeader		= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
    	//CO_DECID_1000EJBHome home = (CO_DECID_1000EJBHome) JNDIManager.getInstance().getHome("CO_DECID_1000EJB");
            
       try {
    		userID += Util.checkString(req.getParameter("userID"));
    		jobID += Util.checkString(req.getParameter("jobID"));
    		protID += Util.checkString(req.getParameter("protID"));
    		docID += Util.checkString(req.getParameter("docID"));
    		document = req.getParameter("document");
    		document = document.replaceAll("&lt;", "<");
    		document = document.replaceAll("&gt;", ">");
    		//document = document.replaceAll("&amp;", "&");
    		
    		document = strHeader + document;
    		
            
    		param = userID + "&" + jobID + "&" + protID + "&" + docID + "&Document=" + document;
    		System.out.println(param);
    		
    		resultXml = PostDataUtil.Post("http://eip.chosun.com/servlet/com.nanum.xf.servlet.job.XFJobServlet", param);
    		System.out.println("resultXml=" + resultXml);

    		strStatus = PostDataUtil.getXmlParsing(resultXml, "status");
    		
    		if (strStatus.equals("Success")){
    			dm.setCmpy_cd(docID.substring(0,3));
    			dm.setDecid_key(docID.substring(10, docID.length()));
    			dm.setDoc_stat_cd("20");
    			dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
    			dm.setChg_pers(Util.getSessionParameterValue(req, "emp_no", true));
    			dm.print();
    			
    			ds = (BaseDataSet) manager.executeCall(dm);
    	        if (!"".equals(ds.getErrcode())) {
    	            throw new AppException(ds.getErrcode(), ds.getErrmsg());
    	        }
    		} else {
    			ds.setErrcode("99");
    			ds.setErrmsg("���ڰ��������� �����߽��ϴ�.");
    		}
    		//ds.setStatus(strStatus);
    		
    		req.setAttribute("ds", ds);
    		System.out.println("CO.WB=" + strStatus);
        
       } catch (Exception e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
       }
    }
}
