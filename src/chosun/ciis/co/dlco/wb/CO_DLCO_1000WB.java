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

package chosun.ciis.co.dlco.wb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.*;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import com.oreilly.servlet.multipart.*;


import chosun.ciis.co.base.util.StreamUtil;
import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.dlco.dao.CO_DLCO_1000DAO;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.ds.*;
//import chosun.ciis.co.dlco.ejb.CO_DLCO_1000EJB;
//import chosun.ciis.co.dlco.ejb.CO_DLCO_1000EJBHome;


import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

import com.oreilly.servlet.multipart.*;

/**
 * 
 */

public class CO_DLCO_1000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|"; 
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * ����ŷ�ó ����Ʈ ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_dlco_1000(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DLCO_1000_LDataSet ds = null;

        // DM Setting
        CO_DLCO_1000_LDM dm = new CO_DLCO_1000_LDM();
        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setSearch_clsf(Util.checkString(req.getParameter("search_clsf")));
        dm.setSearch_key_1(Util.checkString(req.getParameter("search_key_1")));
        dm.setSearch_key_2(Util.checkString(req.getParameter("search_key_2")));
        dm.print();

        ds = (CO_DLCO_1000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
   
    /**
     * �ý��۱��� �����ڵ� �޺� ����Ʈ ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_dlco_1001(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	System.out.println("wb start!");
    	DBManager manager = new DBManager("MISCOM");
    	CO_DLCO_1001_LDataSet ds = null;

        // DM Setting
        CO_DLCO_1001_LDM dm = new CO_DLCO_1001_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        //dm.emp_no	= Util.getSessionParameterValue(req, "emp_no", true);
        dm.emp_no	= Util.getSessionParameterValue(req, "uid", true);
        dm.print();

        ds = (CO_DLCO_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**
     * ����ŷ�ó ���
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_dlco_1002(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	CO_DLCO_1002_ADataSet ds = null;

        // DM Setting
        CO_DLCO_1002_ADM dm = new CO_DLCO_1002_ADM();
        dm.setMode(Util.checkString(req.getParameter("mode")));
        dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
        dm.setDlco_nm(Util.checkString(req.getParameter("dlco_nm")));
        dm.setDlco_abrv_nm(Util.checkString(req.getParameter("dlco_abrv_nm")));
        dm.setErn(Util.checkString(req.getParameter("ern")));
        dm.setSys_clsf_cd(Util.checkString(req.getParameter("sys_clsf_cd")));
        dm.setZip_1(Util.checkString(req.getParameter("zip_1")));
        dm.setZip_2(Util.checkString(req.getParameter("zip_2")));
        dm.setAddr(Util.checkString(req.getParameter("addr")));
        dm.setDtls_addr(Util.checkString(req.getParameter("dtls_addr")));
        dm.setNatn_cd(Util.checkString(req.getParameter("natn_cd")));
        dm.setFrnc_pers_yn(Util.checkString(req.getParameter("frnc_pers_yn")));
        dm.setFrnc_addr(Util.checkString(req.getParameter("frnc_addr")));
        dm.setNatn_tel_no(Util.checkString(req.getParameter("natn_tel_no")));
        dm.setTel_no(Util.checkString(req.getParameter("tel_no")));
        dm.setFax_no(Util.checkString(req.getParameter("fax_no")));
        dm.setPresi_nm(Util.checkString(req.getParameter("presi_nm")));
        dm.setPresi_prn(Util.checkString(req.getParameter("presi_prn")));
        dm.setPresi_zip_1(Util.checkString(req.getParameter("presi_zip_1")));
        dm.setPresi_zip_2(Util.checkString(req.getParameter("presi_zip_2")));
        dm.setPresi_addr(Util.checkString(req.getParameter("presi_addr")));
        dm.setPresi_dtls_addr(Util.checkString(req.getParameter("presi_dtls_addr")));
        dm.setPresi_tel_no(Util.checkString(req.getParameter("presi_tel_no")));
        dm.setBizcond(Util.checkString(req.getParameter("bizcond")));
        dm.setItem(Util.checkString(req.getParameter("item")));
        dm.setSetl_bank(Util.checkString(req.getParameter("setl_bank")));
        dm.setAcct_no(Util.checkString(req.getParameter("acct_no")));
        dm.setRcpm_main_nm(Util.checkString(req.getParameter("rcpm_main_nm")));
        dm.setEmail(Util.checkString(req.getParameter("email")));
        dm.setElec_tax_stmt_yn(Util.checkString(req.getParameter("elec_tax_stmt_yn")));
        dm.setCorp_clsf(Util.checkString(req.getParameter("corp_clsf")));
        dm.setErr_eps_no_aprv_yn(Util.checkString(req.getParameter("err_eps_no_aprv_yn")));
        dm.setTxn_clsf(Util.checkString(req.getParameter("txn_clsf")));	
        //dm.setIncmg_pers_cmpy_cd(Util.checkString(req.getParameter("incmg_pers_cmpy_cd")));
        dm.incmg_pers_cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setIncmg_pers_ipadd(req.getRemoteAddr());
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.chg_pers_cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();


       	DBManager manager        = null; //ERP
       	DBManager managerBis     = null; //BIS
       	CallableStatement cstmt  = null;
       	CallableStatement cstmt1 = null;
       	String    jobStep        = "A:�۾�����";
       	
       	try {
           	manager = new DBManager("MISCOM");
           	manager.getConnection();
           	manager.m_conn.setAutoCommit(false);
           	cstmt = manager.m_conn.prepareCall(dm.getSQL());
           	// �Ķ���� ����
           	dm.setParams(cstmt,dm);

	       	// ����
	       	cstmt.execute();
	       	// ���
	       	ds = (CO_DLCO_1002_ADataSet) dm.createDataSetObject();
	       	ds.getValues(cstmt);
	       	cstmt.close();
	        if (!"".equals(ds.errcode)) {
		        	manager.rollback();
		            throw new AppException(ds.errcode, ds.errmsg);
		           
	        }
        	jobStep        = "B:ERP �����Ϸ�";
	               	
	        if ("Y".equals(ds.bis_dlco_yn)){          	
		        // DM Setting
		    	CO_DLCO_1007_ADM dm1 = new CO_DLCO_1007_ADM();
		    	dm1.setMode(Util.checkString(req.getParameter("mode")));
		    	dm1.setCd_cust(ds.dlco_no);
		    	dm1.setNm_cust(Util.checkString(req.getParameter("dlco_abrv_nm")));
		    	dm1.setNo_tax(Util.checkString(req.getParameter("ern")));
		    	dm1.setNm_president(Util.checkString(req.getParameter("presi_nm")));
		    	dm1.setNm_businesscond(Util.checkString(req.getParameter("bizcond")));
		    	dm1.setNm_item(Util.checkString(req.getParameter("item")));
		    	dm1.setNo_post(Util.checkString(req.getParameter("zip_1")) + Util.checkString(req.getParameter("zip_2")));
		    	dm1.setNm_address(Util.checkString(req.getParameter("addr")));
		    	dm1.setNm_addrdtl(Util.checkString(req.getParameter("dtls_addr")));
		    	dm1.setNm_cust_full(Util.checkString(req.getParameter("dlco_nm")));
		    	dm1.setUse_yn("Y");
		    	dm1.setCustype(ds.advcs_agn_flag);
		    	dm1.setIncmg_pers_ipadd(req.getRemoteAddr());
		    	dm1.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		    	dm1.setIncmg_pers_cmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true)); 
		    	
		    			    		
	           	managerBis = new DBManager("MISTV");
	           	managerBis.getConnection();
	           	managerBis.m_conn.setAutoCommit(false);
	           	cstmt1 = managerBis.m_conn.prepareCall(dm1.getSQL());
	           	// �Ķ���� ����
	           	dm1.setParams(cstmt1,dm1);
	           	/*
				cstmt1.registerOutParameter(1, Types.VARCHAR);
				cstmt1.registerOutParameter(2, Types.VARCHAR);
				cstmt1.setString(3, dm1.mode);
				cstmt1.setString(4, dm1.cd_cust);
				cstmt1.setString(5, dm1.nm_cust);
				cstmt1.setString(6, dm1.no_tax);
				cstmt1.setString(7, dm1.nm_president);
				cstmt1.setString(8, dm1.nm_businesscond);
				cstmt1.setString(9, dm1.nm_item);
				cstmt1.setString(10, dm1.no_post);
				cstmt1.setString(11, dm1.nm_address);
				cstmt1.setString(12, dm1.nm_addrdtl);
				cstmt1.setString(13, dm1.nm_cust_full);
				cstmt1.setString(14, dm1.use_yn);
				cstmt1.setString(15, dm1.custype);
				cstmt1.setString(16, dm1.incmg_pers_ipadd);
				cstmt1.setString(17, dm1.incmg_pers);
				cstmt1.setString(18, dm1.incmg_pers_cmpy_cd);
		    	
		    	*/

		       	// ����
		       	cstmt1.execute();
		       	// ���
		       	CO_DLCO_1007_ADataSet ds1 = (CO_DLCO_1007_ADataSet) dm1.createDataSetObject();
		       	ds1.getValues(cstmt1);
		       	cstmt.close();	    	
		        if (!"".equals(ds1.errcode)) {
		        	manager.rollback();
		        	managerBis.rollback();		        	
		            throw new AppException(ds1.errcode, ds1.errmsg);
		        }	    		    	
		    	
		    	managerBis.commit();
		    	jobStep        = "C:BIS �����Ϸ�";
 	
	        }
 
 		    manager.commit();     
 		    
			jobStep        = "D:ERP,BIS �����Ϸ�";
			
	    }catch (AppException e){
		      if (manager != null){		    	  
		          manager.rollback();	
		      }		 		      
		      if (managerBis != null){		    	  
		          managerBis.rollback(); 		   		          
		      }			      
              throw e; 
        }catch (SQLException e) {          	
		      if (managerBis != null)
		          managerBis.rollback();	
		      if (manager != null)
		          manager.rollback();	
		      if ("B:ERP �����Ϸ�".equals(jobStep)){
		         throw new AppException("���ӿ���", "BIS DBMS ����/ó�� ������ �߻��Ͽ����ϴ�. �ý��۴���ڿ��� �����ٶ��ϴ�.");
		      }else{		               
		    	  throw new SysException(e);
		      }
        }catch (Exception e) {
	    	System.out.println("Exception");	         	
		      if (managerBis != null)
		          managerBis.rollback();	
		      if (manager != null)
		          manager.rollback();	
		      if ("B:ERP �����Ϸ�".equals(jobStep)){
			         throw new AppException("���ӿ���", "BIS DBMS ����/ó�� ������ �߻��Ͽ����ϴ�. �ý��۴���ڿ��� �����ٶ��ϴ�.");
			      }else{		               
			    	  throw new SysException(e);
			      }	          
	    } finally {	    	
		    if (managerBis != null) 	    	
		    	managerBis.disConnection();
		    
		    if (manager != null)	
		    	manager.disConnection();
	        System.out.println(jobStep);
	    }
 
        req.setAttribute("ds", ds);
        
    }
    
    /**
     * ����ŷ�ó �ߺ�üũ ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_dlco_1003(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DLCO_1003_LDataSet ds = null;

        // DM Setting
        CO_DLCO_1003_LDM dm = new CO_DLCO_1003_LDM();
        dm.setErn(Util.checkString(req.getParameter("ern")));
        dm.setDlco_nm(Util.checkString(req.getParameter("dlco_nm")));
        dm.setDlco_abrv_nm(Util.checkString(req.getParameter("dlco_abrv_nm")));
        dm.setPresi_nm(Util.checkString(req.getParameter("presi_nm")));
        dm.setZip_1(Util.checkString(req.getParameter("zip_1")));
        dm.setZip_2(Util.checkString(req.getParameter("zip_2")));
        dm.print();

        ds = (CO_DLCO_1003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**
     * ����ŷ�ó Ÿ�ý��� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_dlco_1004(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DLCO_1004_LDataSet ds = null;

        // DM Setting
        CO_DLCO_1004_LDM dm = new CO_DLCO_1004_LDM();
        dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
        dm.print();

        ds = (CO_DLCO_1004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    /**
     * ����ŷ�ó �ֹλ���ڹ�ȣ ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_dlco_1005(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DLCO_1005_LDataSet ds = null;

        // DM Setting
        CO_DLCO_1005_LDM dm = new CO_DLCO_1005_LDM();
        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setErn(Util.checkString(req.getParameter("ern")));
        dm.print();

        ds = (CO_DLCO_1005_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**
     * ����ŷ�ó ȸ���ڵ�(�߰�), �ŷ�ó��ȣ ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_dlco_1006(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DLCO_1006_LDataSet ds = null;
        // DM Setting
        CO_DLCO_1006_LDM dm = new CO_DLCO_1006_LDM();
        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
        dm.print();

        ds = (CO_DLCO_1006_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    /**
     * ����ŷ�ó �˾� �˻� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_dlco_1100(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DLCO_1100_LDataSet ds = null;

        // DM Setting
        CO_DLCO_1100_LDM dm = new CO_DLCO_1100_LDM();
        dm.setDlco_nm(Util.checkString(req.getParameter("dlco_nm")));
        dm.setDlco_abrv_nm(Util.checkString(req.getParameter("dlco_abrv_nm")));
        dm.setErn(Util.checkString(req.getParameter("ern")));
        dm.setPresi_nm(Util.checkString(req.getParameter("presi_nm")));

        ds = (CO_DLCO_1100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
    public void co_dlco_1008(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	DBManager manager = new DBManager("MISCOM");
    	CO_DLCO_1008_ADataSet ds = null;
        // DM Setting
        CO_DLCO_1008_ADM dm = new CO_DLCO_1008_ADM();
        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));       
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        
        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode   		 	= Util.checkString((String)hash.get("m"));
    	String ern    			= Util.checkString((String)hash.get("ern"));
    	String dlco_nm    		= Util.checkString((String)hash.get("dlco_nm"));
    	String dlco_abrv_nm    	= Util.checkString((String)hash.get("dlco_abrv_nm"));
    	String tel_no     		= Util.checkString((String)hash.get("tel_no"));
    	String setl_bank    	= Util.checkString((String)hash.get("setl_bank"));
    	String acct_no    		= Util.checkString((String)hash.get("acct_no"));
    	String rcpm_main_nm    	= Util.checkString((String)hash.get("rcpm_main_nm"));
       
    	dm.setMode(mode);
    	dm.setErn(ern);
    	dm.setDlco_nm(dlco_nm);
    	dm.setDlco_abrv_nm(dlco_abrv_nm);
    	dm.setTel_no(tel_no);
    	dm.setSetl_bank(setl_bank);
    	dm.setAcct_no(acct_no);
    	dm.setRcpm_main_nm(rcpm_main_nm);
    	dm.print();
    	
        ds = (CO_DLCO_1008_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
	public void co_dlco_1009(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
		
		Hashtable ht = new Hashtable();		
		byte[] seal_phot = new byte[10485760]; //10Mb	
		byte[] ern_phot = new byte[10485760]; //10Mb	
		byte[] acct_aplc_frm = new byte[10485760]; //10Mb	
		byte[] psbk_copy = new byte[10485760]; //10Mb	
		byte[] use_seal = new byte[10485760]; //10Mb	
		String file_name = "";
		String file_size = "";
		int cnt = 0;
		
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB   
		CO_DLCO_1009_ADataSet ds = null;
		CO_DLCO_1009_ADM dm = new CO_DLCO_1009_ADM();
		
			Part part; 		
			
				while ((part = mp.readNextPart()) != null) {
				    String name  = part.getName();
					if (part.isParam()) {
						ht.put(part.getName(), ((ParamPart)part).getStringValue());						
				    }else if (part.isFile()) {		
				    	cnt = cnt+1;
					    System.out.println("cnt::::::::::::"+cnt);
					        FilePart filePart = (FilePart) part;
					        file_name = filePart.getFileName();
					        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
					        ((FilePart)part).writeTo(byteArrayOutputStream);
					        if(cnt == 2){					        	
								seal_phot = byteArrayOutputStream.toByteArray();
								dm.seal_phot = seal_phot;
								file_size = String.valueOf(seal_phot.length);
								dm.seal_file_size = file_size;  
								System.out.println("seal_file_size = "+dm.seal_file_size);
					        }else if (cnt == 1){
								ern_phot = byteArrayOutputStream.toByteArray();
								dm.ern_phot = ern_phot;
								file_size = String.valueOf(ern_phot.length);
								dm.ern_file_size = file_size;  
								System.out.println("ern_file_size = "+file_size);
					        }else if (cnt == 3){
					        	acct_aplc_frm = byteArrayOutputStream.toByteArray();
								dm.acct_aplc_frm = acct_aplc_frm;
								file_size = String.valueOf(acct_aplc_frm.length);
								dm.acct_aplc_frm_file_size = file_size;  
								System.out.println("acct_aplc_frm_file_size = "+file_size);
					        }else if (cnt == 4){
								psbk_copy = byteArrayOutputStream.toByteArray();
								dm.psbk_copy = psbk_copy;
								file_size = String.valueOf(psbk_copy.length);
								dm.psbk_copy_file_size = file_size;  
								System.out.println("psbk_copy_file_size = "+file_size);
					        }else if (cnt == 5){
								use_seal = byteArrayOutputStream.toByteArray();
								dm.use_seal = use_seal;
								file_size = String.valueOf(use_seal.length);
								dm.use_seal_file_size = file_size;  
								System.out.println("use_seal_file_size = "+file_size);
					        }
				    }
				}			
			dm.accflag = Util.checkString(ht.get("accflag").toString());
			dm.dlco_no = Util.checkString(ht.get("dlco_no").toString());
			dm.clsf = Util.checkString(ht.get("clsf").toString());
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = req.getRemoteAddr();		
			dm.print();
			DBManager manager = new DBManager("MISCOM");
			ds = (CO_DLCO_1009_ADataSet)manager.executeCall(dm);
			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}else{
				//System.out.println("bb");
				// BLOB ���ϱ�
				//manager.m_conn.setAutoCommit(false);		
				if(file_name != ""){					
					try {
						if(!dm.accflag.equals("D")){
							if(!dm.seal_file_size.equals("0")){
								manager.getConnection();
								manager.m_conn.setAutoCommit(false);
								Statement stmt = manager.m_conn.createStatement();
								String blobQuery = "SELECT SEAL_PHOT FROM TACOM_PHOT WHERE DLCO_NO      = '" + dm.dlco_no + "' FOR UPDATE";			
								
								OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
								
								if (rset.next()) {             
								
//									weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
//									BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
				          	   		//������(ep1)
				          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
									
									OutputStream os = oracle_blob.getBinaryOutputStream();
									// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
									for(int i=0; i<seal_phot.length; i++){
										os.write(seal_phot[i]);
									}
									os.close();
								}
								stmt.close();
								manager.m_conn.commit();
								manager.disConnection();
							}
							if(!dm.ern_file_size.equals("0")){
								manager.getConnection();
								manager.m_conn.setAutoCommit(false);
								Statement stmt = manager.m_conn.createStatement();
								String blobQuery = "SELECT ERN_PHOT FROM TACOM_PHOT WHERE DLCO_NO      = '" + dm.dlco_no + "' FOR UPDATE";			
								
								OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
								
								if (rset.next()) {             
//									weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
//									BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
				          	   		//������(ep1)
				          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
									
									OutputStream os = oracle_blob.getBinaryOutputStream();
									
									// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
									for(int i=0; i<ern_phot.length; i++){
										os.write(ern_phot[i]);
									}
									os.close();
								}
								stmt.close();
								manager.m_conn.commit();
								manager.disConnection();
							}
							if(!dm.acct_aplc_frm_file_size.equals("0")){
								manager.getConnection();
								manager.m_conn.setAutoCommit(false);
								Statement stmt = manager.m_conn.createStatement();
								String blobQuery = "SELECT ACCT_APLC_FRM FROM TACOM_PHOT WHERE DLCO_NO      = '" + dm.dlco_no + "' FOR UPDATE";			
								
								OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
								
								if (rset.next()) {             
//									weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
//									BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
				          	   		//������(ep1)
				          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
									
									OutputStream os = oracle_blob.getBinaryOutputStream();
									
									// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
									for(int i=0; i<acct_aplc_frm.length; i++){
										os.write(acct_aplc_frm[i]);
									}
									os.close();
								}
								stmt.close();
								manager.m_conn.commit();
								manager.disConnection();
							}
							if(!dm.psbk_copy_file_size.equals("0")){
								manager.getConnection();
								manager.m_conn.setAutoCommit(false);
								Statement stmt = manager.m_conn.createStatement();
								String blobQuery = "SELECT PSBK_COPY FROM TACOM_PHOT WHERE DLCO_NO      = '" + dm.dlco_no + "' FOR UPDATE";			
								
								OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
								
								if (rset.next()) {             
//									weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
//									BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
				          	   		//������(ep1)
				          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);										
									OutputStream os = oracle_blob.getBinaryOutputStream();
									
									// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
									for(int i=0; i<psbk_copy.length; i++){
										os.write(psbk_copy[i]);
									}
									os.close();
								}
								stmt.close();
								manager.m_conn.commit();
								manager.disConnection();
							}
							if(!dm.use_seal_file_size.equals("0")){
								manager.getConnection();
								manager.m_conn.setAutoCommit(false);
								Statement stmt = manager.m_conn.createStatement();
								String blobQuery = "SELECT USE_SEAL FROM TACOM_PHOT WHERE DLCO_NO      = '" + dm.dlco_no + "' FOR UPDATE";			
								
								OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
								
								if (rset.next()) {             
//									weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
//									BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
				          	   		//������(ep1)
				          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);										
									OutputStream os = oracle_blob.getBinaryOutputStream();
									
									// ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
									for(int i=0; i<use_seal.length; i++){
										os.write(use_seal[i]);
									}
									os.close();
								}
									stmt.close();
									manager.m_conn.commit();
									manager.disConnection();
								}
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						try{
							manager.m_conn.rollback();
							manager.disConnection();
						}catch(SQLException co){
							manager.disConnection();
							throw new SysException(co);
						}
						manager.disConnection();
						throw new SysException(e);
					}
				}
			}
			req.setAttribute("ds", ds);  
			
		} 	
	
	   public void co_dlco_1010(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
			DBManager manager = new DBManager("MISCOM");
			CO_DLCO_1010_SDataSet ds = null;
			CO_DLCO_1010_SDM dm = new CO_DLCO_1010_SDM();
			
			dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
			ds = (CO_DLCO_1010_SDataSet)manager.executeCall(dm);
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}
	   public void co_dlco_1011(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
			DBManager manager = new DBManager("MISCOM");
			CO_DLCO_1011_LDataSet ds = null; 
			CO_DLCO_1011_LDM dm = new CO_DLCO_1011_LDM();
			
			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
			dm.today = Util.checkString(req.getParameter("today"));
			ds = (CO_DLCO_1011_LDataSet)manager.executeCall(dm);
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}
	   
	   public void co_dlco_1012(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
			DBManager manager = new DBManager("MISCOM");
			CO_DLCO_1012_ADataSet ds = null; 
			CO_DLCO_1012_ADM dm = new CO_DLCO_1012_ADM();
			
			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    	dm.setIncmg_pers_ipadd(req.getRemoteAddr());
	    	dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
			
	    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));	    	
	    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);      
	    	
	    	dm.acct_stat =  Util.checkString((String)hash.get("acct_stat"));
			dm.dlco_no =  Util.checkString((String)hash.get("dlco_no"));
			dm.setl_bank =  Util.checkString((String)hash.get("setl_bank"));
			dm.acct_no =  Util.checkString((String)hash.get("acct_no"));
			
			dm.print();
			
			ds = (CO_DLCO_1012_ADataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}
	   
	   public void co_dlco_1013(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
			DBManager manager = new DBManager("MISCOM");
			CO_DLCO_1013_ADataSet ds = null; 
			CO_DLCO_1013_ADM dm = new CO_DLCO_1013_ADM();
			
			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    	dm.setIncmg_pers_ipadd(req.getRemoteAddr());
	    	dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
	    	dm.setDlco_no(Util.checkString(req.getParameter("dlco_no")));
	    	dm.setSetl_bank(Util.checkString(req.getParameter("setl_bank")));
	    	dm.setAcct_no(Util.checkString(req.getParameter("acct_no")));
	    	dm.setAcct_stat(Util.checkString(req.getParameter("acct_stat")));
						
			dm.print();
			
			ds = (CO_DLCO_1013_ADataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}
	   
		public void co_dlco_1015(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
			CO_DLCO_1015_LDataSet ds = null;
			CO_DLCO_1015_LDM dm = new CO_DLCO_1015_LDM();

			dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
			dm.clsf = Util.checkString(req.getParameter("clsf"));
//			dm.print();

			/* EJB ������ ���� */
			DBManager manager = new DBManager("MISCOM");
			ds = (CO_DLCO_1015_LDataSet)manager.executeCall(dm);

			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);
		}
}

