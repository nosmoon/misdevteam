/***************************************************************************************************
* 파일명 : TnLnk1000WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김상훈
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.tn.lnk.wb;

import java.io.*;

import jxl.*;
import jxl.write.*;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.ArrayList;
import java.sql.*;
import java.util.*;
import java.text.*;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import com.oreilly.servlet.multipart.*;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.tn.lnk.dao.TnLnk1200DAO;
import chosun.ciis.tn.lnk.dao.TnLnk6000DAO;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class TnLnk1200WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void tn_lnk_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	System.out.println("1210wb!!!");
    	TN_LNK_1210_LDataSet ds = null;

        // DM Setting
    	TN_LNK_1210_LDM dm = new TN_LNK_1210_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String cret_dt    = Util.checkString(req.getParameter("cret_dt"));
        String cret_clsf  = Util.checkString(req.getParameter("cret_clsf"));
                
        dm.setCmpy_cd(cmpy_cd);
        dm.setCret_dt(cret_dt);
        dm.setCret_clsf(cret_clsf);
        
        dm.print();
        
        try {
        	TnLnk1200DAO dao = new TnLnk1200DAO();
            ds = dao.tn_lnk_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      

    } 
    
    public void tn_lnk_1220_d(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager        = null; //ERP
       	CallableStatement cstmt = null; 
    	TN_LNK_1220_DDataSet ds = null;

    	String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
    	String rcpt_rpt_idx     = Util.checkString(req.getParameter("rcpt_rpt_idx"));        
        if("".equals(rcpt_rpt_idx)){
        	String multiUpdateData	= Util.checkString(req.getParameter("multiUpdateData"));
        	Hashtable hash          = getHashMultiUpdateData(multiUpdateData);
        	rcpt_rpt_idx            = Util.checkString((String)hash.get("rcpt_rpt_idx"));        	
        }
        // DM Setting
    	TN_LNK_1220_DDM dm = new TN_LNK_1220_DDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRcpt_rpt_idx(rcpt_rpt_idx);
    	
    	dm.print();
    	
        try {
	        manager = new DBManager("MISTNN");
	        manager.getConnection();          	
        	//데이터 조회
           	cstmt = manager.m_conn.prepareCall(dm.getSQL());
           	// 파라미터 설정
           	dm.setParams(cstmt,dm);
            System.out.println("execute start");
            // 실행
           	cstmt.execute();
            // 결과
           	ds = (TN_LNK_1220_DDataSet) dm.createDataSetObject();
           	ds.getValues(cstmt);
           	cstmt.close();
           	if (!"".equals(ds.errcode)) {
    	            throw new AppException(ds.errcode, ds.errmsg);
            }

           	if (ds.curlist.size()==0) {
                throw new AppException("tn_lnk_1220_d", "소득공제자료를 삭제할 데이터가 없습니다.");
            } 
           	//엑셀파일 경로 
           	String svrRoot = req.getSession().getServletContext().getRealPath("/")+"download/receipt_xls";//로컬
           	//String svrRoot = "/webstore/pub/ciis/htdocs/download/receipt_xls";//개발
           	//String svrRoot = "/webstore/pub/ciis/webapps/download/receipt_xls";//운영
//           	for(int i = 0; i < ds.curlist.size(); i++) {
//           		TN_LNK_1220_DCURLISTRecord rec = (TN_LNK_1220_DCURLISTRecord)ds.curlist.get(i);
//           		
//           		if(!"".equals(rec.xls_nm)){
//           			File xlsfile = new File(svrRoot+"/receipt_report_"+rec.xls_nm+".xls");
//           			xlsfile.delete();
//           		}
//           	}
           	cstmt.close();
//        	TnLnk1200DAO dao = new TnLnk1200DAO();
//            ds = dao.tn_lnk_1220_d(dm);
//            req.setAttribute("ds", ds);           
        }
	    catch (AppException e) {
		      if (manager != null)
		          manager.rollback();
           throw e;   
		}catch (SQLException e) {
		    if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    }finally {	    	
		    if (manager != null)	
		    	manager.disConnection();
	    }
	    req.setAttribute("ds", ds);    	
    } 
    
    public void tn_lnk_1250_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	TN_LNK_1250_SDataSet ds = null;

        // DM Setting
    	TN_LNK_1250_SDM dm = new TN_LNK_1250_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String rcpt_rpt_idx  	 = Util.checkString(req.getParameter("rcpt_rpt_idx"));
                
        dm.setCmpy_cd(cmpy_cd);
        dm.setRcpt_rpt_idx(rcpt_rpt_idx);
        
        dm.print();
        
        try {
        	TnLnk1200DAO dao = new TnLnk1200DAO();
            ds = dao.tn_lnk_1250_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      

    }  
  
    public void tn_lnk_1251_l(HttpServletRequest req, HttpServletResponse res) throws   AppException,FileNotFoundException, IOException, WriteException {
		DBManager manager       = null; //ERP
       	CallableStatement cstmt = null;    	
    	TN_LNK_1251_LDataSet ds = null;

        // DM Setting
    	TN_LNK_1251_LDM dm = new TN_LNK_1251_LDM();
    	dm.cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dept_clsf  = Util.checkString(req.getParameter("dept_clsf"));
    	dm.cret_frdt  = Util.checkString(req.getParameter("cret_frdt"));
    	dm.cret_todt  = Util.checkString(req.getParameter("cret_todt"));
    	dm.cret_stnd  = Util.checkString(req.getParameter("cret_stnd"));
    	dm.mngr_nm    = Util.checkString(req.getParameter("mngr_nm"));
    	dm.mngr_phon1 = Util.checkString(req.getParameter("mngr_phon1"));
    	dm.mngr_phon2 = Util.checkString(req.getParameter("mngr_phon2"));
    	dm.mngr_phon3 = Util.checkString(req.getParameter("mngr_phon3"));
    	dm.rpt_dt     = Util.checkString(req.getParameter("rpt_dt"));
    	dm.cret_yn    = Util.checkString(req.getParameter("cret_yn"));
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
       
        try {        	
        	TnLnk1200DAO dao = new TnLnk1200DAO();
            ds = dao.tn_lnk_1251_l(dm);        

           	if (!"".equals(ds.errcode)) {
    	            throw new AppException(ds.errcode, ds.errmsg);
            }
           	
           	
           	String rcpt_rpt_idx = ds.rcpt_rpt_idx;           	
           	if (ds.curlist.size()==0) {
                throw new AppException("tn_lnk_1251_l", "소득공제자료를 생성할 데이터가 없습니다.");
            } 


        	//file download path 설정 
           	System.out.println("getRequestURL:"+req.getRequestURL());
           	//String svrRoot = req.getSession().getServletContext().getRealPath("/")+"download";//로컬
           	//String svrRoot = "/webstore/pub/ciis/htdocs/download";//개발
           	String svrRoot = "/webstore/pub/ciis/webapps/download";//운영
                        

           	String	tag = "\r\n";
           	//String filepath = svrRoot+"\\receipt_file\\";
           	String filepath = svrRoot+"/receipt_file/";
           	String filenm	= ds.filenm;
            File dir = new File(filepath);

            try {
            	System.out.println(filepath);
            	if(!dir.exists()) {
            		dir.mkdir();
            	}
            } catch(Exception e) {
            	e.printStackTrace();
            }            


           	BufferedWriter out = new BufferedWriter(new FileWriter(filepath+filenm));
           	//write B record
           	out.write( ds.rec_b.replaceAll("]", tag) );

           	for(int i = 0; i < ds.curlist.size(); i++) {
           		TN_LNK_1251_LCURLISTRecord rec = (TN_LNK_1251_LCURLISTRecord)ds.curlist.get(i);           		
           		//System.out.println("["+i+"] "+rec.filedata);
           		out.write( rec.filedata.replaceAll("]", tag) );
           	}           	           	
           	out.close();

           	
           	try {
                manager = new DBManager("MISTNN");
                manager.getConnection();                
	            File uploadfile = new File(filepath+filenm);
	            FileInputStream fis = new FileInputStream(filepath+filenm);	            	            
	            byte[] buff = new byte[(int)uploadfile.length()+1];	            

	            System.out.println("==================================");
	            System.out.println("readable: " + uploadfile.canRead());
	            System.out.println("available: " + fis.available());
	            System.out.println("idx: " + rcpt_rpt_idx);
	            System.out.println("filepath: " + filepath);
	            System.out.println("filenm: " + filenm);
	            System.out.println("length: " + uploadfile.length());
	            System.out.println("emp_no: " + Util.getSessionParameterValue(req, "emp_no", true));
	            System.out.println("==================================");
	            
	            ByteArrayOutputStream buffer = new ByteArrayOutputStream();	            

	            int nRead;
	            while ((nRead = fis.read(buff, 0, buff.length)) != -1) {
	              buffer.write(buff, 0, nRead);
	            }
	            
	            /*
	            PreparedStatement ps = manager.m_conn.prepareStatement("insert into RECEIPT_REPORT_FILE values (?,?,?,?,?,?,?)");
	            ps.setString(1, rcpt_rpt_idx);
	            ps.setString(2, filenm);	            
	            //ps.setBinaryStream(3, fis, (int)(uploadfile.length()));
	            ps.setBinaryStream(3, fis, (int)0);
	            ps.setString(4, Util.getSessionParameterValue(req, "emp_no", true));
	            ps.setString(5, "");
	            ps.setString(6, "");
	            ps.setString(7, "");
	            ps.executeUpdate();//쿼리 실행
	            ps.close();
	            */
	            manager.m_conn.setAutoCommit(false);
				Statement stmt = manager.m_conn.createStatement();
				String blobQuery = "SELECT ADD_FILE FROM RECEIPT_REPORT_FILE WHERE RECEIPTREPORTIDX = '" + rcpt_rpt_idx + "' FOR UPDATE";
				OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

				if (rset.next()) {
          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);
					OutputStream os = oracle_blob.getBinaryOutputStream();
					os.write(buff, 0, buff.length-1);
					os.close();
				}

				stmt.close();
				manager.m_conn.commit();
				
	            //성공시 - WAS서버에 있는 파일 삭제
				fis.close();
	            uploadfile.delete();	            

           	} catch(SQLException e) {
           		if (manager != null)
           			manager.rollback();	
           		throw new SysException(e);
           	} finally {
           		if (manager != null)	
    		    	manager.disConnection();
           	}

           	req.setAttribute("ds", ds);

        }catch (AppException e) {
           throw e;   
		}

        /*catch (SQLException e) {
		    if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    }finally {	    	
		    if (manager != null)	
		    	manager.disConnection();
	    }*/         

    } 
    
    
    public void tn_lnk_1252_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	TN_LNK_1252_ADataSet ds = null;

    	String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
    	String rcpt_rpt_idx     = Util.checkString(req.getParameter("rcpt_rpt_idx"));
    	String dept_clsf        = Util.checkString(req.getParameter("dept_clsf"));
    	String cret_frdt        = Util.checkString(req.getParameter("cret_frdt"));
    	String cret_todt        = Util.checkString(req.getParameter("cret_todt"));
    	String cret_stnd        = Util.checkString(req.getParameter("cret_stnd"));
    	String mngr_nm          = Util.checkString(req.getParameter("mngr_nm"));
    	String mngr_phon1       = Util.checkString(req.getParameter("mngr_phon1"));
    	String mngr_phon2       = Util.checkString(req.getParameter("mngr_phon2"));
    	String mngr_phon3       = Util.checkString(req.getParameter("mngr_phon3"));
    	String rpt_dt           = Util.checkString(req.getParameter("rpt_dt"));
    	String pay_frdt         = Util.checkString(req.getParameter("pay_frdt"));
    	String pay_todt         = Util.checkString(req.getParameter("pay_todt"));
    	String incmg_pers       = Util.getSessionParameterValue(req, "emp_no", true);

        // DM Setting
    	TN_LNK_1252_ADM dm = new TN_LNK_1252_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRcpt_rpt_idx(rcpt_rpt_idx);
    	dm.setDept_clsf(dept_clsf);
    	dm.setCret_frdt(cret_frdt);
    	dm.setCret_todt(cret_todt);
    	dm.setCret_stnd(cret_stnd);
    	dm.setMngr_nm(mngr_nm);
    	dm.setMngr_phon(mngr_phon1+"-"+mngr_phon2+"-"+mngr_phon3);
    	dm.setRpt_dt(rpt_dt);
    	dm.setPay_frdt(pay_frdt);
    	dm.setPay_todt(pay_todt);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();
    	
        try {
        	TnLnk1200DAO dao = new TnLnk1200DAO();
            ds = dao.tn_lnk_1252_a(dm);
            req.setAttribute("ds", ds);           
        }  
        catch (AppException e) {
            throw e;
        }   	
    }   
    
    public void tn_lnk_1253_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	TN_LNK_1253_ADataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String rcpt_rpt_idx = Util.checkString(req.getParameter("rcpt_rpt_idx"));
    	String full_pathnm  = Util.checkString(req.getParameter("full_pathnm"));
        // DM Setting
    	TN_LNK_1253_ADM dm = new TN_LNK_1253_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRcpt_rpt_idx(rcpt_rpt_idx);

    	dm.print();
    	System.out.println(full_pathnm);
        try {
        	TnLnk1200DAO dao = new TnLnk1200DAO();
            ds = dao.tn_lnk_1253_a(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("full_pathnm", full_pathnm);
	        req.setAttribute("add_file", 	ds.add_file); 		// request에 결과값을 담는다.
	        req.setAttribute("add_file_nm", ds.add_file_nm); 	// request에 결과값을 담는다.            
        }  
        catch (AppException e) {
            throw e;
        }   	
    }     
}






/*---------------------------------------------------------------------------------------------------------
 * EXCEL 생성용 BACKUP 2017.01.06 
 *---------------------------------------------------------------------------------------------------------
public void tn_lnk_1251_l(HttpServletRequest req, HttpServletResponse res) throws   AppException,FileNotFoundException, IOException, WriteException {
	DBManager manager        = null; //ERP
   	CallableStatement cstmt = null;    	
	TN_LNK_1251_LDataSet ds = null;

    // DM Setting
	TN_LNK_1251_LDM dm = new TN_LNK_1251_LDM();
	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    String dept_clsf    = Util.checkString(req.getParameter("dept_clsf"));
    String cret_frdt  = Util.checkString(req.getParameter("cret_frdt"));
    String cret_todt  = Util.checkString(req.getParameter("cret_todt"));
    String cret_stnd  = Util.checkString(req.getParameter("cret_stnd"));
            
    dm.setCmpy_cd(cmpy_cd);
    dm.setDept_clsf(dept_clsf);
    dm.setCret_frdt(cret_frdt);
    dm.setCret_todt(cret_todt);
    dm.setCret_stnd(cret_stnd);

    
    dm.print();
   
    try {
        manager = new DBManager("MISTNN");
        manager.getConnection();         
    	//데이터 조회
       	cstmt = manager.m_conn.prepareCall(dm.getSQL());
       	// 파라미터 설정
       	dm.setParams(cstmt,dm);
        System.out.println("execute start");
        // 실행
       	cstmt.execute();System.out.println("execute end");
        // 결과
       	ds = (TN_LNK_1251_LDataSet) dm.createDataSetObject();
       	ds.getValues(cstmt);
       	//cstmt.close();
       	if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
        }
       	String rcpt_rpt_idx = ds.rcpt_rpt_idx;
       	
       	if (ds.curlist.size()==0) {
            throw new AppException("tn_lnk_1251_l", "소득공제자료를 생성할 데이터가 없습니다.");
        } 

       	System.out.println("xls file");
    	//엑셀 불러오기 
       	System.out.println("getRequestURL:"+req.getRequestURL());
       	//String svrRoot = req.getSession().getServletContext().getRealPath("/")+"download";//로컬
       	//String svrRoot = "/webstore/pub/ciis/htdocs/download";//개발
       	String svrRoot = "/webstore/pub/ciis/webapps/download";//운영
        //선언부
        WritableSheet sheet10 = null;
        WritableSheet sheet20 = null;
        WritableSheet sheet30 = null;
        WritableSheet sheet31 = null;
        WritableSheet sheet40 = null;
        WritableSheet sheet41 = null;
        WritableSheet sheet42 = null;
        WritableSheet wsheet  = null;
        
        WritableCell readCell = null;
        WritableCell newCell = null;
        
        //CellFormat readFormat = null;
        WritableCellFormat newFormat = null;
        
        Label label0 = null;
        Label label1 = null;
        Label label2 = null;
        Label label3 = null;
        Label label4 = null;
        Label labelN = null;
        jxl.write.Number number5 = null;
        jxl.write.Number number6 = null;
        //샘플엑셀 불러오기
        System.out.println("svrRoot:"+svrRoot);
        File xlsfile = new File(svrRoot+"/receipt_report.xls");
        Workbook Rworkbook = Workbook.getWorkbook(xlsfile);
        System.out.println("xlsfile2");
        //엑셀카피
        //OutputStream out = 
        String xls_nm =  "receipt_report_"+cret_frdt+"_"+cret_todt+"_"+rcpt_rpt_idx+".xls";
        File Nxlsfile = new File(svrRoot+"/receipt_xls/"+xls_nm);
        WritableWorkbook workbook = Workbook.createWorkbook(Nxlsfile,Rworkbook);
        System.out.println("xls copy");
	        int j10 = 0;
	        int j20 = 0;
	        int j30 = 0;
	        int j31 = 0;
	        int j40 = 0;
	        int j41 = 0;
	        int j42 = 0;
	        
	        int j   = 0;
	        int chk = 60000;
	        int chk2= 59996;
	        String create_sheet = "false"; 
	        String sheetNm = "";
	        String sheetNm2 = "";
	        String chk_sheet_nm = "";
   		int sheet_num = 1;
   		int sheetNm_num = 1;
   		int sheet_row = 4;
   		
	        System.out.println("xls format");
        //셀서식 -숫자,라인
	        //숫자
        WritableCellFormat integerFormat = new WritableCellFormat(NumberFormats.THOUSANDS_INTEGER); // 번호 셀 포멧 생성
        integerFormat.setAlignment(Alignment.RIGHT);//수평정렬
        integerFormat.setBorder(Border.BOTTOM, BorderLineStyle.DOTTED);
        integerFormat.setBorder(Border.TOP, BorderLineStyle.DOTTED);
        integerFormat.setBorder(Border.RIGHT, BorderLineStyle.THIN);
        integerFormat.setBorder(Border.LEFT, BorderLineStyle.THIN);
        
        //문자
        WritableCellFormat lineFormat = new WritableCellFormat();
        lineFormat.setAlignment(Alignment.CENTRE);
        lineFormat.setBorder(Border.BOTTOM, BorderLineStyle.DOTTED);
        lineFormat.setBorder(Border.TOP, BorderLineStyle.DOTTED);
        lineFormat.setBorder(Border.RIGHT, BorderLineStyle.THIN);
        lineFormat.setBorder(Border.LEFT, BorderLineStyle.THIN);
        
        WritableCellFormat lineFormat2 = new WritableCellFormat();
        lineFormat2.setAlignment(Alignment.CENTRE);
        lineFormat2.setBorder(Border.BOTTOM, BorderLineStyle.THIN);
        lineFormat2.setBorder(Border.TOP, BorderLineStyle.THIN);
        lineFormat2.setBorder(Border.RIGHT, BorderLineStyle.THIN);
        lineFormat2.setBorder(Border.LEFT, BorderLineStyle.THIN);            
        System.out.println("for start");
       	//엑셀수정
       	for(int i = 0; i < ds.curlist.size(); i++) {
       		TN_LNK_1251_LCURLISTRecord rec = (TN_LNK_1251_LCURLISTRecord)ds.curlist.get(i);
       		
//       		if("10".equals(rec.pay_cd)){
//       			if("0".equals(Integer.toString(j10))){
//       	        	j10 = i + 4;
//       	        }else{
//       	        	j10 = j10 + 1;
//       	        }
//   	        	if(j10 > chk){
//   	        		create_sheet = "true";
//   	        		j = j10 - 5;
//   	        		sheetNm = "10 법정기부";
//   	        		sheetNm2 = "10 : 법정기부금";
//   	        	}else{
//           			sheet10 = workbook.getSheet(1);
//   	        		label0 = null;
//           	        label0 = new Label(0,j10,rec.regno,lineFormat);
//           	        sheet10.addCell(label0);
//           	        label1 = null;
//           	        label1 = new Label(1,j10,rec.name,lineFormat);
//           	        sheet10.addCell(label1);
//           	        label2 = null;
//           	        label2 = new Label(2,j10,rec.pay_methd_type,lineFormat);
//           	        sheet10.addCell(label2);
//           	        label3 = null;
//           	        label3 = new Label(3,j10,"",lineFormat);
//           	        sheet10.addCell(label3);           	        
//           	        label4 = null;
//           	        label4 = new Label(4,j10,rec.paydate,lineFormat);
//           	        sheet10.addCell(label4);
//           	        number5 = null;
//           	        number5 = new jxl.write.Number(5,j10,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet10.addCell(number5);
//           	        number6 = null;
//           	        number6 = new jxl.write.Number(6,j10,Integer.parseInt(rec.payprice),integerFormat);
//           	     sheet10.addCell(number6);	           	        
//   	        	}
//       		}
//       		
//       		if("20".equals(rec.pay_cd)){
//       			if("0".equals(Integer.toString(j20))){
//       	        	j20 = i + 4;
//       	        }else{
//       	        	j20 = j20 + 1;
//       	        }
//   	        	if(j20 > chk){
//   	        		create_sheet = "true";
//   	        		j = j20 - 5;
//   	        		sheetNm = "20 정치자금";
//   	        		sheetNm2 = "20 : 정치자금기부금";
//   	        	}else{
//           			sheet20 = workbook.getSheet(2);
//           	        label0 = null;
//           	        label0 = new Label(0,j20,rec.regno,lineFormat);
//           	        sheet20.addCell(label0);
//           	        label1 = null;
//           	        label1 = new Label(1,j20,rec.name,lineFormat);
//           	        sheet20.addCell(label1);
//           	        label2 = null;
//           	        label2 = new Label(2,j20,rec.pay_methd_type,lineFormat);
//           	        sheet20.addCell(label2);
//           	        label3 = null;
//           	        label3 = new Label(3,j20,"",lineFormat);
//           	        sheet20.addCell(label3);           	        
//           	        label4 = null;
//           	        label4 = new Label(4,j20,rec.paydate,lineFormat);
//           	        sheet20.addCell(label4);
//           	        number5 = null;
//           	        number5 = new jxl.write.Number(5,j20,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet20.addCell(number5);
//           	        number6 = null;
//           	        number6 = new jxl.write.Number(6,j20,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet20.addCell(number6);	
//   	        	}
//       		}       
//       		
//       		if("30".equals(rec.pay_cd)){
//       			if("0".equals(Integer.toString(j30))){
//       	        	j30 = i + 4;
//       	        }else{
//       	        	j30 = j30 + 1;
//       	        }
//   	        	if(j30 > chk){
//   	        		create_sheet = "true";
//   	        		j = j30 - 5;
//   	        		sheetNm = "30 특례";
//   	        		sheetNm2 = "30 : 특례";
//   	        	}else{
//           			sheet30 = workbook.getSheet(3);           			
//           	        label0 = null;
//           	        label0 = new Label(0,j30,rec.regno,lineFormat);
//           	        sheet30.addCell(label0);
//           	        label1 = null;
//           	        label1 = new Label(1,j30,rec.name,lineFormat);
//           	        sheet30.addCell(label1);
//           	        label2 = null;
//           	        label2 = new Label(2,j30,rec.pay_methd_type,lineFormat);
//           	        sheet30.addCell(label2);
//           	        label3 = null;
//           	        label3 = new Label(3,j30,"",lineFormat);
//           	        sheet30.addCell(label3);           	        
//           	        label4 = null;
//           	        label4 = new Label(4,j30,rec.paydate,lineFormat);
//           	        sheet30.addCell(label4);
//           	        number5 = null;
//           	        number5 = new jxl.write.Number(5,j30,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet30.addCell(number5);
//           	        number6 = null;
//           	        number6 = new jxl.write.Number(6,j30,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet30.addCell(number6);	
//       	        }
//       		}          
//       		
//       		if("31".equals(rec.pay_cd)){
//       			if("0".equals(Integer.toString(j31))){
//       	        	j31 = i + 4;
//       	        }else{
//       	        	j31 = j31 + 1;
//       	        }
//   	        	if(j31 > chk){
//   	        		create_sheet = "true";
//   	        		j = j31 - 5;
//   	        		sheetNm = "31 특례(공익)";
//   	        		sheetNm2 = "31 : 특례 (공익법인신탁기부금)";
//   	        	}else{
//           			sheet31 = workbook.getSheet(4);
//           	        label0 = null;
//           	        label0 = new Label(0,j31,rec.regno,lineFormat);
//           	        sheet31.addCell(label0);
//           	        label1 = null;
//           	        label1 = new Label(1,j31,rec.name,lineFormat);
//           	        sheet31.addCell(label1);
//           	        label2 = null;
//           	        label2 = new Label(2,j31,rec.pay_methd_type,lineFormat);
//           	        sheet31.addCell(label2);
//           	        label3 = null;
//           	        label3 = new Label(3,j31,"",lineFormat);
//           	        sheet31.addCell(label3);           	        
//           	        label4 = null;
//           	        label4 = new Label(4,j31,rec.paydate,lineFormat);
//           	        sheet31.addCell(label4);
//           	        number5 = null;
//           	        number5 = new jxl.write.Number(5,j31,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet31.addCell(number5);
//           	        number6 = null;
//           	        number6 = new jxl.write.Number(6,j31,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet31.addCell(number5);
//   	        	}
//       		}           
       		
       		if("40".equals(rec.pay_cd)){
	        		//sheet40 = workbook.getSheet(5);
       			//2016년 엑셀 포멧 변경으로 INDEX 변경함
       			sheet40 = workbook.getSheet(1);
       			if("0".equals(Integer.toString(j40))){
       	        	j40 = i + 4;
       	        }else{
       	        	j40 = j40 + 1;
       	        }
   	        	if(j40 >= chk){
   	        		create_sheet = "true";
   	        		j = j40 - 5;
   	        		sheetNm = "40 지정기부";
   	        		sheetNm2 = "40 : 지정기부금";
   	        	}else{
           	        label0 = null;
           	        label0 = new Label(0,j40,rec.regno,lineFormat);
           	        sheet40.addCell(label0);
           	        label1 = null;
           	        label1 = new Label(1,j40,rec.name,lineFormat);
           	        sheet40.addCell(label1);
           	        label2 = null;
           	        label2 = new Label(2,j40,rec.pay_methd_type,lineFormat);
           	        sheet40.addCell(label2);
           	        label3 = null;
           	        label3 = new Label(3,j40,"EBA",lineFormat);
           	        sheet40.addCell(label3);           	        
           	        label4 = null;
           	        label4 = new Label(4,j40,rec.paydate,lineFormat);
           	        sheet40.addCell(label4);
           	        number5 = null;
           	        number5 = new jxl.write.Number(5,j40,Integer.parseInt(rec.payprice),integerFormat);
           	        sheet40.addCell(number5);
           	        number6 = null;
           	        number6 = new jxl.write.Number(6,j40,Integer.parseInt(rec.payprice),integerFormat);
           	        sheet40.addCell(number6);
   	        	}
       		}           		

//       		if("41".equals(rec.pay_cd)){
//       			if("0".equals(Integer.toString(j41))){
//       	        	j41 = i + 4;
//       	        }else{
//       	        	j41 = j41 + 1;
//       	        }
//   	        	if(j41 > chk){
//   	        		create_sheet = "true";
//   	        		j = j41 - 5;
//   	        		sheetNm = "41 종교단체";
//   	        		sheetNm2 = "41 : 종교단체기부금";
//   	        	}else{
//           			sheet41 = workbook.getSheet(6);
//   	        		label0 = null;
//           	        label0 = new Label(0,j41,rec.regno,lineFormat);
//           	        sheet41.addCell(label0);
//           	        label1 = null;
//           	        label1 = new Label(1,j41,rec.name,lineFormat);
//           	        sheet41.addCell(label1);
//           	        label2 = null;
//           	        label2 = new Label(2,j41,rec.pay_methd_type,lineFormat);
//           	        sheet41.addCell(label2);
//           	        label3 = null;
//           	        label3 = new Label(3,j41,"",lineFormat);
//           	        sheet41.addCell(label3);           	        
//           	        label4 = null;
//           	        label4 = new Label(4,j41,rec.paydate,lineFormat);
//           	    	sheet41.addCell(label4);
//           	        number5 = null;
//           	        number5 = new jxl.write.Number(5,j41,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet41.addCell(number5);
//           	        number6 = null;
//           	        number6 = new jxl.write.Number(6,j41,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet41.addCell(number6);
//   	        	}
//       		}           		
//       		
//       		if("42".equals(rec.pay_cd)){
//       			sheet42 = workbook.getSheet(7);           			
//       			if("0".equals(Integer.toString(j42))){
//       	        	j42 = i + 4;
//       	        }else{
//       	        	j42 = j42 + 1;
//       	        }
//   	        	if(j42 > chk){
//   	        		create_sheet = "true";
//   	        		j = j42 - 5;
//   	        		sheetNm = "42 우리사주";
//   	        		sheetNm2 = "42 : 우리사주조합기부금";
//   	        	}else{
//           	        label0 = null;
//           	        label0 = new Label(0,j42,rec.regno,lineFormat);
//           	        sheet42.addCell(label0);
//           	        label1 = null;
//           	        label1 = new Label(1,j42,rec.name,lineFormat);
//           	        sheet42.addCell(label1);
//           	        label2 = null;
//           	        label2 = new Label(2,j42,rec.pay_methd_type,lineFormat);
//           	        sheet42.addCell(label2);
//           	        label3 = null;
//           	        label3 = new Label(3,j42,"",lineFormat);
//           	        sheet42.addCell(label3);           	        
//           	        label4 = null;
//           	        label4 = new Label(4,j42,rec.paydate,lineFormat);
//           	    	sheet42.addCell(label4);
//           	        number5 = null;
//           	        number5 = new jxl.write.Number(5,j42,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet42.addCell(number5);
//           	        number6 = null;
//           	        number6 = new jxl.write.Number(6,j42,Integer.parseInt(rec.payprice),integerFormat);
//           	        sheet42.addCell(number6);
//   	        	}
//       		} 
       		//6만건 이상은 신규시트 생성
       		if("true".equals(create_sheet)){
       			if("0".equals(Integer.toString(j%chk2))){
       				System.out.println("create_sheet start!!"+Integer.toString(j));
       				if(chk_sheet_nm.equals(sheetNm) || "".equals(chk_sheet_nm)){
       					sheetNm_num = sheetNm_num + 1;
       					sheet_num   = sheet_num + 1;
       				}else{
       					sheetNm_num = 2;
       					sheet_num++;
       				}
       				sheet_row = 4;
       				wsheet = workbook.createSheet(sheetNm+" ("+sheetNm_num+")", sheet_num);
   	        		//1~4행 복사          
	        			for(int k=0;k<6;k++){//열
	        				for(int l=0;l<4;l++){//행 
	        					//System.out.println("1k="+Integer.toString(k)+",l="+Integer.toString(l));
	        					readCell = workbook.getSheet(1).getWritableCell(k, l);//일단은 지정기부만되게세팅함 차후 다른 기부가 생길경우 수정해야할것 같음
	        					newCell = readCell.copyTo(k, l);
	        					newFormat = new WritableCellFormat(readCell.getCellFormat());
	        					newCell.setCellFormat(newFormat);
	        					wsheet.addCell(newCell); 
	        					//System.out.println("2k="+Integer.toString(k)+",l="+Integer.toString(l));
	        					//System.out.println("2readCell="+readCell.toString());
	        				}
	        			}
	        			//시트내 (1,0) 값변경
	           	        labelN = null;
	           	        labelN = new Label(1,0,sheetNm2,lineFormat2);
	           	        wsheet.addCell(labelN);   	        			
   	        	}else{
       				wsheet = workbook.getSheet(sheet_num);
       				sheet_row++;
       			}
       	        label0 = null;
       	        label0 = new Label(0,sheet_row,rec.regno,lineFormat);
       	        wsheet.addCell(label0);
       	        label1 = null;
       	        label1 = new Label(1,sheet_row,rec.name,lineFormat);
       	        wsheet.addCell(label1);
       	        label2 = null;
       	        label2 = new Label(2,sheet_row,rec.pay_methd_type,lineFormat);
       	        wsheet.addCell(label2);
       	        label3 = null;
       	        label3 = new Label(3,sheet_row,"EBA",lineFormat);
       	        wsheet.addCell(label3);           	        
       	        label4 = null;
       	        label4 = new Label(4,sheet_row,rec.paydate,lineFormat);
       	        wsheet.addCell(label4);
       	        number5 = null;
       	        number5 = new jxl.write.Number(5,sheet_row,Integer.parseInt(rec.payprice),integerFormat);
       	        wsheet.addCell(number5);
       	        number6 = null;
       	        number6 = new jxl.write.Number(6,sheet_row,Integer.parseInt(rec.payprice),integerFormat);
       	        wsheet.addCell(number6);           	        
       		}
       		//초기화
       		create_sheet = "false";
       		j = 0;
       		chk_sheet_nm = sheetNm;
       	}
       	System.out.println("for end");
       	//엑셀저장
        workbook.write();
        workbook.close();
        System.out.println("SAVE 4::web server gogo");
        //디비저장
        File Send_xls = new File(svrRoot+"/receipt_xls/"+xls_nm);
        FileInputStream fis = new FileInputStream(svrRoot+"/receipt_xls/"+xls_nm);
        System.out.println("FileInputStream");
        PreparedStatement ps = manager.m_conn.prepareStatement("insert into RECEIPT_REPORT_FILE values (?,?,?,?,?,?,?)");
        ps.setString(1, rcpt_rpt_idx);
        ps.setString(2, xls_nm);
        ps.setBinaryStream(3, fis, (int)(Send_xls.length()));
        ps.setString(4, Util.getSessionParameterValue(req, "emp_no", true));
        //java.util.Date dt = new java.util.Date();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss a"); 
        //ps.setString(5, sdf.format(dt).toString());
        ps.setString(5, "");
        ps.setString(6, "");
        ps.setString(7, "");
        System.out.println("set param");
        ps.executeUpdate();//쿼리 실행
        System.out.println("sql execute");
        ps.close();
        System.out.println("close");
        //성공시 - WAS서버에 있는 파일 삭제
        Send_xls.delete();
        System.out.println("XLS DELETE");
       	cstmt.close();
    }catch (AppException e) {
	      if (manager != null)
	          manager.rollback();
       throw e;   
	}catch (SQLException e) {
	    if (manager != null)
	          manager.rollback();	
    	  throw new SysException(e);
	}catch (Exception e) {
	      if (manager != null)
	          manager.rollback();	
    	  throw new SysException(e);
    }finally {	    	
	    if (manager != null)	
	    	manager.disConnection();
    }
    req.setAttribute("ds", ds);      

} 
---------------------------------------------------------------------------------------------------------*/    
