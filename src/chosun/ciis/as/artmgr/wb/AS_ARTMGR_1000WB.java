/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.as.artmgr.wb;

import java.util.*;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import java.io.OutputStream;


import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.as.artmgr.dm.*;
import chosun.ciis.as.artmgr.ds.*;
/**
 * 
 */

public class AS_ARTMGR_1000WB extends BaseWB {
	public void as_artmgr_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ARTMGR_1001_MDataSet ds = null;
		AS_ARTMGR_1001_MDM dm = new AS_ARTMGR_1001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ARTMGR_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*
		try {
			AS_ARTMGR_1000EJBHome home = (AS_ARTMGR_1000EJBHome)JNDIManager.getInstance().getHome("AS_ARTMGR_1000EJB");
			AS_ARTMGR_1000EJB ejb = home.create();

			ds = ejb.as_artmgr_1001_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/
	}

	public void as_artmgr_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ARTMGR_1002_LDataSet ds = null;
		AS_ARTMGR_1002_LDM dm = new AS_ARTMGR_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.art_prod_no = Util.checkString(req.getParameter("art_prod_no"));
		dm.art_cate_nm = Util.checkString(req.getParameter("art_cate_nm"));
		dm.author = Util.checkString(req.getParameter("author"));
		dm.art_prod_nm = Util.checkString(req.getParameter("art_prod_nm"));
		dm.get_dt_fr = Util.checkString(req.getParameter("get_dt_fr"));
		dm.get_dt_to = Util.checkString(req.getParameter("get_dt_to"));
		dm.dnt_clsf = Util.checkString(req.getParameter("dnt_clsf"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ARTMGR_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		/*
		try {
			AS_ARTMGR_1000EJBHome home = (AS_ARTMGR_1000EJBHome)JNDIManager.getInstance().getHome("AS_ARTMGR_1000EJB");
			AS_ARTMGR_1000EJB ejb = home.create();

			ds = ejb.as_artmgr_1002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.art_prod_no = (String)hash.get("art_prod_no");
		dm.art_cate_nm = (String)hash.get("art_cate_nm");
		dm.author = (String)hash.get("author");
		dm.art_prod_nm = (String)hash.get("art_prod_nm");
		dm.get_dt_fr = (String)hash.get("get_dt_fr");
		dm.get_dt_to = (String)hash.get("get_dt_to");
		dm.dnt_clsf = (String)hash.get("dnt_clsf");
		*******************************************************************************************/
	}
	
	public void as_artmgr_1003_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
		Hashtable ht = new Hashtable();
		byte[] up_phot_img = new byte[10 * 1024 * 1024];
		
    	String file_name = "";
    	String file_size = "";
    	
    	System.out.println("length=" + up_phot_img.length);
    	
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB 
        //MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "KSC5601"); // 10MB
        
        AS_ARTMGR_1003_ADataSet ds = null;
		AS_ARTMGR_1003_ADM dm = new AS_ARTMGR_1003_ADM();

        Part part; 
        
        while ((part = mp.readNextPart()) != null) {
            String name  = part.getName();
            //System.out.println("name:" + name);
            if (part.isParam()) {
    			ht.put(part.getName(), ((ParamPart)part).getStringValue());
            }else if (part.isFile()) {
                FilePart filePart = (FilePart) part;
                file_name = filePart.getFileName();
                System.out.print("sizeLimit:"+sizeLimit);
                if ( file_name != null ) {
                	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    				((FilePart)part).writeTo(byteArrayOutputStream);
    				 //System.out.print("11111112:"+filePart.getFilePath());
    				 
    				up_phot_img = byteArrayOutputStream.toByteArray();
    	    		//dm.up_phot_img = up_phot_img;
    	    		file_size = String.valueOf(up_phot_img.length);
    	    		//System.out.print("file_size:" + up_phot_img.length);
                }
                
            }
            
        }
        
       
        
        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.mode          = Util.checkString((String)ht.get("mode"));
		dm.art_prod_nm   = Util.checkString((String)ht.get("art_prod_nm"));
		dm.art_prod_no   = Util.checkString((String)ht.get("art_prod_no"));
		dm.author        = Util.checkString((String)ht.get("author"));
		dm.art_prod_size = Util.checkString((String)ht.get("art_prod_size"));
		dm.fram_size     = Util.checkString((String)ht.get("fram_size"));
		dm.fram_yn       = Util.checkString((String)ht.get("fram_yn"));
		dm.make_yymm     = Util.checkString((String)ht.get("make_yymm"));
		dm.get_dt        = Util.checkString((String)ht.get("get_dt"));
		dm.get_resn      = Util.checkString((String)ht.get("get_resn"));
		dm.ap_amt        = Util.checkString((String)ht.get("ap_amt"));
		dm.aset_no       = Util.checkString((String)ht.get("aset_no"));
		dm.dlco_nm       = Util.checkString((String)ht.get("dlco_nm"));
		dm.dlco_tel      = Util.checkString((String)ht.get("dlco_tel"));
		dm.keep_plac     = Util.checkString((String)ht.get("keep_plac"));
		dm.keep_dt       = Util.checkString((String)ht.get("keep_dt"));
		dm.art_prod_evlu = Util.checkString((String)ht.get("art_prod_evlu"));
		dm.last_chk_dt   = Util.checkString((String)ht.get("last_chk_dt"));
		dm.art_prod_remk = Util.checkString((String)ht.get("art_prod_remk"));
		dm.remk          = Util.checkString((String)ht.get("remk"));
		dm.dnt_clsf      = Util.checkString((String)ht.get("dnt_clsf"));
		dm.mode_tm       = Util.checkString((String)ht.get("mode_tm"));

		dm.up_phot_img = "1010".getBytes();
		dm.file_size = file_size;
		
		String multiUpdateData = Util.checkString((String)ht.get("multiUpDate"));
		//System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);
	
		int idx = 0;
		    
		//System.out.println("length=" + converted.length);
		String mode_tm				= converted[0];
		String chg_dt				= converted[2];
		String chg_remk				= converted[3];
		String art_prod_seq			= converted[5];

        dm.setMode_tm(mode_tm.toUpperCase());
        dm.setArt_prod_seq(art_prod_seq); 
        dm.setChg_dt(chg_dt); 
        dm.setChg_remk(chg_remk); 

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		//System.out.println("a");				
		ds = (AS_ARTMGR_1003_ADataSet)manager.executeCall(dm);
		//System.out.println("aa");
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}else{
			//System.out.println("bb");
			// BLOB 구하기
			//manager.m_conn.setAutoCommit(false);		
            System.out.println("file_name:" + file_name);
            System.out.println("file_size:" + file_size);
			if(file_name != ""){
				try {
					//System.out.println("update:::");
					manager.getConnection();
					manager.m_conn.setAutoCommit(false);
					//System.out.println("manager:"+manager);
					Statement stmt = manager.m_conn.createStatement();
					
					//System.out.println("stmt:"+stmt);
					String blobQuery = "SELECT PHOT_IMG FROM TAASM_PHOT WHERE CMPY_CD = '" + dm.cmpy_cd + "' AND JOB_CLSF='2' AND ASET_NO = '" + dm.art_prod_no + "' FOR UPDATE";			
					//String blobQuery = "SELECT BO_HEAD_PHOT FROM TASEM_BOHEADPHOT WHERE CMPY_CD = '"+dm.cmpy_cd+"' AND BO_HEAD_PRN = '"+dm.bo_head_prn+"' FOR UPDATE";
					//System.out.println("blobQuery:"+blobQuery);
					//System.out.println("up_phot_img.length:"+up_phot_img.length);
					
					OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
					//System.out.println("kkk");
					if (rset.next()) {             
						//weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
						//BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	           	   		//레진용(ep1)
	           	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
						
						OutputStream os = oracle_blob.getBinaryOutputStream();
						  
						// 파일로부터 읽어서 BLOB 에 WRITE 한다.
						for(int i=0; i<up_phot_img.length; i++){
							os.write(up_phot_img[i]);
						}
						os.close();
					}
					stmt.close();
					manager.m_conn.commit();
					manager.disConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					try{
						manager.m_conn.rollback();
						manager.disConnection();
					}catch(SQLException se){
						manager.disConnection();
						throw new SysException(se);
					}
					manager.disConnection();
					throw new SysException(e);
				}
			}
		}
		req.setAttribute("ds", ds);

		
		/* EJB 수정후 끝 */	
		
/*
		try {
			AS_ARTMGR_1000EJBHome home = (AS_ARTMGR_1000EJBHome)JNDIManager.getInstance().getHome("AS_ARTMGR_1000EJB");
			AS_ARTMGR_1000EJB ejb = home.create();

            Part part; 
            while ((part = mp.readNextPart()) != null) {
                String name  = part.getName();
                if (part.isParam()) {
        			ht.put(part.getName(), ((ParamPart)part).getStringValue());
                }else if (part.isFile()) {
                    FilePart filePart = (FilePart) part;
                    file_name = filePart.getFileName();

                    if ( file_name != null ) {
                    	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        				((FilePart)part).writeTo(byteArrayOutputStream);
        				up_phot_img = byteArrayOutputStream.toByteArray();
        	    		dm.up_phot_img = up_phot_img;
        	    		file_size = String.valueOf(up_phot_img.length);
                    }
                }
            }

            dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
    		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

    		dm.mode          = Util.checkString((String)ht.get("mode"));
    		dm.art_prod_nm   = Util.checkString((String)ht.get("art_prod_nm"));
    		dm.art_prod_no   = Util.checkString((String)ht.get("art_prod_no"));
    		dm.author        = Util.checkString((String)ht.get("author"));
    		dm.art_prod_size = Util.checkString((String)ht.get("art_prod_size"));
    		dm.fram_size     = Util.checkString((String)ht.get("fram_size"));
    		dm.fram_yn       = Util.checkString((String)ht.get("fram_yn"));
    		dm.make_yymm     = Util.checkString((String)ht.get("make_yymm"));
    		dm.get_dt        = Util.checkString((String)ht.get("get_dt"));
    		dm.get_resn      = Util.checkString((String)ht.get("get_resn"));
    		dm.ap_amt        = Util.checkString((String)ht.get("ap_amt"));
    		dm.aset_no       = Util.checkString((String)ht.get("aset_no"));
    		dm.dlco_nm       = Util.checkString((String)ht.get("dlco_nm"));
    		dm.dlco_tel      = Util.checkString((String)ht.get("dlco_tel"));
    		dm.keep_plac     = Util.checkString((String)ht.get("keep_plac"));
    		dm.keep_dt       = Util.checkString((String)ht.get("keep_dt"));
    		dm.art_prod_evlu = Util.checkString((String)ht.get("art_prod_evlu"));
    		dm.last_chk_dt   = Util.checkString((String)ht.get("last_chk_dt"));
    		dm.art_prod_remk = Util.checkString((String)ht.get("art_prod_remk"));
    		dm.remk          = Util.checkString((String)ht.get("remk"));
    		dm.dnt_clsf      = Util.checkString((String)ht.get("dnt_clsf"));
    		dm.mode_tm       = Util.checkString((String)ht.get("mode_tm"));

    		String multiUpdateData = Util.checkString((String)ht.get("multiUpDate"));
    		System.out.println("multiUpdateData=" + multiUpdateData );
    		String[] converted = convertMultiUpdateData(multiUpdateData);
		
			int idx = 0;
			    
			System.out.println("length=" + converted.length);
			String mode_tm				= converted[0];
			String chg_dt				= converted[2];
			String chg_remk				= converted[3];
			String art_prod_seq			= converted[5];
	
	        dm.setMode_tm(mode_tm.toUpperCase());
	        dm.setArt_prod_seq(art_prod_seq); 
	        dm.setChg_dt(chg_dt); 
	        dm.setChg_remk(chg_remk); 

//	        dm.print();

	        
			ds = ejb.as_artmgr_1003_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.art_prod_nm = (String)hash.get("art_prod_nm");
		dm.art_prod_no = (String)hash.get("art_prod_no");
		dm.author = (String)hash.get("author");
		dm.art_prod_size = (String)hash.get("art_prod_size");
		dm.fram_size = (String)hash.get("fram_size");
		dm.fram_yn = (String)hash.get("fram_yn");
		dm.make_yymm = (String)hash.get("make_yymm");
		dm.get_dt = (String)hash.get("get_dt");
		dm.get_resn = (String)hash.get("get_resn");
		dm.ap_amt = (String)hash.get("ap_amt");
		dm.aset_no = (String)hash.get("aset_no");
		dm.dlco_nm = (String)hash.get("dlco_nm");
		dm.dlco_tel = (String)hash.get("dlco_tel");
		dm.keep_plac = (String)hash.get("keep_plac");
		dm.keep_dt = (String)hash.get("keep_dt");
		dm.art_prod_evlu = (String)hash.get("art_prod_evlu");
		dm.last_chk_dt = (String)hash.get("last_chk_dt");
		dm.remk = (String)hash.get("remk");
		dm.dnt_clsf = (String)hash.get("dnt_clsf");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/
	}
	
	public void as_artmgr_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ARTMGR_1004_LDataSet ds = null;
		AS_ARTMGR_1004_LDM dm = new AS_ARTMGR_1004_LDM();

		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.art_prod_no = Util.checkString(req.getParameter("art_prod_no"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ARTMGR_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	

/*		
		try {
			AS_ARTMGR_1000EJBHome home = (AS_ARTMGR_1000EJBHome)JNDIManager.getInstance().getHome("AS_ARTMGR_1000EJB");
			AS_ARTMGR_1000EJB ejb = home.create();

			ds = ejb.as_artmgr_1004_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.art_prod_no = (String)hash.get("art_prod_no");
		*******************************************************************************************/
	}
    
	public void as_artmgr_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ARTMGR_1005_LDataSet ds = null;
		AS_ARTMGR_1005_LDM dm = new AS_ARTMGR_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.art_prod_no = Util.checkString(req.getParameter("art_prod_no"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ARTMGR_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*
		try {
			AS_ARTMGR_1000EJBHome home = (AS_ARTMGR_1000EJBHome)JNDIManager.getInstance().getHome("AS_ARTMGR_1000EJB");
			AS_ARTMGR_1000EJB ejb = home.create();

			ds = ejb.as_artmgr_1005_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.art_prod_no = (String)hash.get("art_prod_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.art_prod_no = Util.getSessionParameterValue(req,"art_prod_no",true);
		*******************************************************************************************/
	}

}
