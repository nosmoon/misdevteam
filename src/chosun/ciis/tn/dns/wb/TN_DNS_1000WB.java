package chosun.ciis.tn.dns.wb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.rmi.*;
import java.sql.SQLException;
import java.util.*;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;

import somo.framework.expt.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.tn.dns.dao.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.lnk.dao.TnLnk1100DAO;
import chosun.ciis.tn.lnk.dm.TN_LNK_1154_ADM;
import chosun.ciis.tn.lnk.ds.TN_LNK_1154_ADataSet;

public class TN_DNS_1000WB extends chosun.ciis.co.base.wb.BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

  
	
    TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
    
	public void tn_dns_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_1000_MDataSet ds = null;
		TN_DNS_1000_MDM dm = new TN_DNS_1000_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		 try { 
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
	            ds = dao.tn_dns_1000_m(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
	
	public void tn_dns_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_1010_LDataSet ds = null;
		TN_DNS_1010_LDM dm = new TN_DNS_1010_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.name = Util.checkString(req.getParameter("name"));
		dm.print();

		 try { 
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
	            ds = dao.tn_dns_1010_l(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
	
	public void tn_dns_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_1020_LDataSet ds = null;
		TN_DNS_1020_LDM dm = new TN_DNS_1020_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));
		dm.membercode = Util.checkString(req.getParameter("membercode"));
		dm.print();

		 try { 
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
	            ds = dao.tn_dns_1020_l(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
	
	public void tn_dns_1030_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_1030_ADataSet ds = null;
		TN_DNS_1030_ADM dm = new TN_DNS_1030_ADM();
		
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.membertype = Util.checkString(req.getParameter("membertype"));
		dm.membercode = Util.checkString(req.getParameter("membercode"));
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));
		dm.mbr_name = Util.checkString(req.getParameter("mbr_name"));
		dm.isanonymous = Util.checkString(req.getParameter("isanonymous"));
		dm.mbr_regno = Util.checkString(req.getParameter("mbr_regno"));
		dm.isforeigner = Util.checkString(req.getParameter("isforeigner"));
		dm.unknownregno = Util.checkString(req.getParameter("unknownregno"));
		dm.president = Util.checkString(req.getParameter("president"));
		dm.businessno = Util.checkString(req.getParameter("businessno"));
		dm.birthdayorigin = Util.checkString(req.getParameter("birthdayorigin"));
		dm.birthday = Util.checkString(req.getParameter("birthday"));
		dm.birthdaytype = Util.checkString(req.getParameter("birthdaytype"));
		dm.membercategorycode = Util.checkString(req.getParameter("membercategorycode"));
		dm.partycode = Util.checkString(req.getParameter("partycode"));
		dm.writedate = Util.checkString(req.getParameter("writedate"));
		dm.memo = Util.checkString(req.getParameter("memo"));
		dm.adrs_name = Util.checkString(req.getParameter("adrs_name"));
		dm.dept = Util.checkString(req.getParameter("dept"));
		dm.title = Util.checkString(req.getParameter("title"));
		dm.email = Util.checkString(req.getParameter("email"));
		dm.phone1 = Util.checkString(req.getParameter("phone1"));
		dm.cellphone = Util.checkString(req.getParameter("cellphone"));
		dm.fax = Util.checkString(req.getParameter("fax"));
		dm.zipcode1 = Util.checkString(req.getParameter("zipcode1"));
		dm.address1 = Util.checkString(req.getParameter("address1"));
		dm.addressdetail1 = Util.checkString(req.getParameter("addressdetail1"));
		dm.zipcode2 = Util.checkString(req.getParameter("zipcode2"));
		dm.address2 = Util.checkString(req.getParameter("address2"));
		dm.addressdetail2 = Util.checkString(req.getParameter("addressdetail2"));
		dm.postaddress = Util.checkString(req.getParameter("postaddress"));
		dm.useaddress = Util.checkString(req.getParameter("useaddress"));
		dm.password = Util.checkString(req.getParameter("password"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.donatorcategory = Util.checkString(req.getParameter("donatorcategory"));
		dm.receiptcategory = Util.checkString(req.getParameter("receiptcategory"));
		dm.rcp_name = Util.checkString(req.getParameter("rcp_name"));
		dm.rcp_regno = Util.checkString(req.getParameter("rcp_regno"));
		dm.relation = Util.checkString(req.getParameter("relation"));
		dm.zipcode = Util.checkString(req.getParameter("zipcode"));
		dm.address = Util.checkString(req.getParameter("address"));
		dm.addressdetail = Util.checkString(req.getParameter("addressdetail"));
		dm.receiptconfigmemo = Util.checkString(req.getParameter("receiptconfigmemo"));
		
		dm.print();

		 try { 
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
	            ds = dao.tn_dns_1030_a(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
	
	public void tn_dns_1040_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_1040_ADataSet ds = null;
		TN_DNS_1040_ADM dm = new TN_DNS_1040_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));
		dm.promiseidx = Util.checkString(req.getParameter("promiseidx"));
		dm.promisedate = Util.checkString(req.getParameter("promisedate"));
		dm.promiseprice = Util.checkString(req.getParameter("promiseprice"));
		dm.paystopped = Util.checkString(req.getParameter("paystopped"));
		dm.contributormemo = Util.checkString(req.getParameter("contributormemo"));
		dm.promisememo = Util.checkString(req.getParameter("promisememo"));
		dm.fundidx = Util.checkString(req.getParameter("fundidx"));
		dm.supportidx = Util.checkString(req.getParameter("supportidx"));
		dm.useoriginal = Util.checkString(req.getParameter("useoriginal"));
		dm.purposememo = Util.checkString(req.getParameter("purposememo"));
		dm.paymethod = Util.checkString(req.getParameter("paymethod"));
		dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
		dm.bankaccoutcode = Util.checkString(req.getParameter("bankaccoutcode"));
		dm.bankownerclsf = Util.checkString(req.getParameter("bankownerclsf"));
		dm.bankowneridentity = Util.checkString(req.getParameter("bankowneridentity"));
		dm.bankcode = Util.checkString(req.getParameter("bankcode"));
		dm.bankaccount = Util.checkString(req.getParameter("bankaccount"));
		dm.bankaccountowner = Util.checkString(req.getParameter("bankaccountowner"));
		dm.filename = Util.checkString(req.getParameter("filename"));
		dm.partitiontype = Util.checkString(req.getParameter("partitiontype"));
		dm.monthlypayday = Util.checkString(req.getParameter("monthlypayday"));
		dm.monthlypayprice = Util.checkString(req.getParameter("monthlypayprice"));
		dm.partitioncount = Util.checkString(req.getParameter("partitioncount"));
		dm.paystartdate = Util.checkString(req.getParameter("paystartdate"));
		dm.payenddate = Util.checkString(req.getParameter("payenddate"));
		dm.excludenopay = Util.checkString(req.getParameter("excludenopay"));
		dm.stopdate = Util.checkString(req.getParameter("stopdate"));
		dm.stopresn = Util.checkString(req.getParameter("stopresn"));
		dm.itemname = Util.checkString(req.getParameter("itemname"));
		dm.itemqty = Util.checkString(req.getParameter("itemqty"));
		dm.itemprice = Util.checkString(req.getParameter("itemprice"));
		dm.itemremk = Util.checkString(req.getParameter("itemremk"));
		dm.cardcmpy = Util.checkString(req.getParameter("cardcmpy"));
		dm.cardnumber = Util.checkString(req.getParameter("cardnumber"));
		dm.cardyymm = Util.checkString(req.getParameter("cardyymm"));
		dm.mobiaprvname = Util.checkString(req.getParameter("mobiaprvname"));
		dm.mobiaprvcmpy = Util.checkString(req.getParameter("mobiaprvcmpy"));
		dm.mobiaprvnumber = Util.checkString(req.getParameter("mobiaprvnumber"));
		dm.mobiaprvprn = Util.checkString(req.getParameter("mobiaprvprn"));
		dm.cmsstopped = Util.checkString(req.getParameter("cmsstopped"));
		dm.cmsstopdate = Util.checkString(req.getParameter("cmsstopdate"));
		dm.cmsstatus = Util.checkString(req.getParameter("cmsstatus"));
		dm.cmsupdatedate = Util.checkString(req.getParameter("cmsupdatedate"));
		dm.cardidentity = Util.checkString(req.getParameter("cardidentity"));
		dm.cardowner = Util.checkString(req.getParameter("cardowner"));

		dm.print();

		 try { 
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
	            ds = dao.tn_dns_1040_a(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
	
	public void tn_dns_1041_u(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
		TN_DNS_1041_UDataSet ds = null;
		TN_DNS_1041_UDM dm = new TN_DNS_1041_UDM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.promiseidx = Util.checkString(req.getParameter("promiseidx"));		
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));	
		dm.cmsstopdate = Util.checkString(req.getParameter("cmsstopdate"));	
		dm.print();

		try {
			TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
            ds = dao.tn_dns_1041_u(dm); 
            req.setAttribute("ds", ds);
		}
		catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
	public void tn_dns_1045_u(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
		TN_DNS_1045_UDataSet ds = null;
		TN_DNS_1045_UDM dm = new TN_DNS_1045_UDM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.promiseidx = Util.checkString(req.getParameter("promiseidx"));		
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));	
		dm.cmsstopdate = Util.checkString(req.getParameter("cmsstopdate"));	
		dm.stopdate = Util.checkString(req.getParameter("stopdate"));	
		dm.stopresn = Util.checkString(req.getParameter("stopresn"));	
		dm.print();

		try {
			TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
            ds = dao.tn_dns_1045_u(dm); 
            req.setAttribute("ds", ds);
		}
		catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}

	
	public void tn_dns_1050_a(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
		TN_DNS_1050_ADataSet ds = null;
		TN_DNS_1050_ADM dm = new TN_DNS_1050_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.promiseidx = Util.checkString(req.getParameter("promiseidx"));		
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));			
		dm.paydate = Util.checkString(req.getParameter("paydate"));		
		dm.payprice = Util.checkString(req.getParameter("payprice"));		
		dm.receiptissue =Util.checkString(req.getParameter("receiptissue"));		
		dm.paymentmemo =Util.checkString(req.getParameter("paymentmemo"));		
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.g1_rcpm_dt = Util.checkString(req.getParameter("g1_rcpm_dt"));
		dm.g1_rcpm_amt = Util.checkString(req.getParameter("g1_rcpm_amt"));
		dm.g1_rcpm_pers_nm = Util.checkString(req.getParameter("g1_rcpm_pers_nm"));
		dm.biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
		dm.bank_id = Util.checkString(req.getParameter("bank_id"));
		dm.acct_num = Util.checkString(req.getParameter("acct_num"));
		dm.tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));

		String paymentidx = "";
		//if(!multiUpdateData.equals("")){
		//	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		//	paymentidx = (String) hash.get("paymentidx");
		//}else{
		//	paymentidx = Util.checkString(req.getParameter("paymentidx"));
		//}
		if(dm.mode.equals("D")){
			System.out.println(">>>>>>>MultiUpate>>>>>"+paymentidx);
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			paymentidx = (String) hash.get("paymentidx");
		}else{
			System.out.println(">>>>>>>paymentidx>>>>>>"+paymentidx);
			paymentidx = Util.checkString(req.getParameter("paymentidx"));
		}
		dm.setPaymentidx(paymentidx);
		
		dm.print();

		try {
			TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
            ds = dao.tn_dns_1050_a(dm); 
            req.setAttribute("ds", ds);
		}
		catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}

	
	public void tn_dns_1060_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_1060_LDataSet ds = null;
		TN_DNS_1060_LDM dm = new TN_DNS_1060_LDM();

		dm.promiseidx = Util.checkString(req.getParameter("promiseidx"));
		dm.print();

		 try { 
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();	        	
	            ds = dao.tn_dns_1060_l(dm); 
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}

	public void tn_dns_1070_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException, SQLException {
		
		Hashtable ht = new Hashtable();		
		byte[] proofdata = new byte[10485760]; //10Mb	
		String file_name = "";
		String file_size = "";
		int cnt = 0;
		
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB   
		TN_DNS_1070_ADataSet ds = null;
		TN_DNS_1070_ADM dm = new TN_DNS_1070_ADM();
		Part part; 		
			
		while ((part = mp.readNextPart()) != null) {
		    String name  = part.getName();
			if (part.isParam()) {
				ht.put(part.getName(), ((ParamPart)part).getStringValue());						
		    }else if (part.isFile()) {		
		        FilePart filePart = (FilePart) part;
		        file_name = filePart.getFileName();
		        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		        ((FilePart)part).writeTo(byteArrayOutputStream);					      				        	
				proofdata = byteArrayOutputStream.toByteArray();
				dm.proofdata = proofdata; 
				file_size = String.valueOf(proofdata.length);
				dm.proofsize = file_size;  
				System.out.println("proofsize = "+dm.proofsize);		 
		    }	
		}		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.accflag = Util.checkString(ht.get("accflag").toString());
		dm.promiseidx = Util.checkString(ht.get("promiseidx").toString());
		dm.prooftype = Util.checkString(ht.get("prooftype").toString());
		dm.cmsidx = Util.checkString(ht.get("cmsidx").toString());
		dm.proofname = Util.checkString(ht.get("proofname").toString());
		dm.proofpath = Util.checkString(ht.get("proofpath").toString());
		dm.extension = Util.checkString(ht.get("extension").toString());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		DBManager manager = new DBManager("MISTNN");
		ds = (TN_DNS_1070_ADataSet)manager.executeCall(dm);
			if(!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}else{
				//System.out.println("bb");
				// BLOB 구하기
				//manager.m_conn.setAutoCommit(false);	
				if(file_name != ""){					
					try {
						if(!dm.accflag.equals("D")){
							if(!dm.proofsize.equals("0")){
								manager.getConnection();
								manager.m_conn.setAutoCommit(false);
								Statement stmt = manager.m_conn.createStatement();
								String blobQuery = "SELECT PROOFDATA FROM PROMISE_PROOF WHERE PROMISEIDX      = '" + dm.promiseidx + "' AND PROOFTYPE      = '" + dm.prooftype + "' FOR UPDATE";											
								OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);							
								if (rset.next()) {             								
				          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);										
									OutputStream os = oracle_blob.getBinaryOutputStream();
									// 파일로부터 읽어서 BLOB 에 WRITE 한다.
									for(int i=0; i<proofdata.length; i++){
										os.write(proofdata[i]);
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
	
	  public void tn_dns_1075_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

	    	TN_DNS_1075_ADataSet ds = null;

	    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
	    	String proofidx = Util.checkString(req.getParameter("proofidx"));
	   	
	        // DM Setting
	    	TN_DNS_1075_ADM dm = new TN_DNS_1075_ADM();
	    	dm.setCmpy_cd(cmpy_cd);
	    	dm.setProofidx(proofidx);
	    	
	    	dm.print();
	    	
	        try {
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();
	            ds = dao.tn_dns_1075_a(dm);
	            req.setAttribute("ds", ds);
		        req.setAttribute("proofdata", ds.proofdata); // request에 결과값을 담는다.
		        req.setAttribute("proofname", ds.proofname); // request에 결과값을 담는다.            
	        }  
	        catch (AppException e) {
	            throw e;
	        }   	
	    }  
	
	public void tn_dns_1080_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_1080_LDataSet ds = null;
		TN_DNS_1080_LDM dm = new TN_DNS_1080_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.regno = Util.checkString(req.getParameter("regno"));
		dm.print();

		 try { 
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();	        	
	            ds = dao.tn_dns_1080_l(dm); 
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
	
	public void tn_dns_3040_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_3040_ADataSet ds = null;
		TN_DNS_3040_ADM dm = new TN_DNS_3040_ADM();
		
		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.receiptidx = Util.checkString(req.getParameter("receiptidx"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.receiptcode = Util.checkString(req.getParameter("receiptcode"));
		dm.donatorcategory = Util.checkString(req.getParameter("donatorcategory"));
		dm.receiptcategory = Util.checkString(req.getParameter("receiptcategory"));
		dm.issuecategory = Util.checkString(req.getParameter("issuecategory"));
		dm.receiptyear = Util.checkString(req.getParameter("receiptyear"));
		dm.issuedate = Util.checkString(req.getParameter("issuedate"));
		dm.name = Util.checkString(req.getParameter("name"));
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));
		dm.regno = Util.checkString(req.getParameter("regno"));
		dm.addresstype = Util.checkString(req.getParameter("addresstype"));
		dm.zipcode = Util.checkString(req.getParameter("zipcode"));
		dm.address = Util.checkString(req.getParameter("address"));
		dm.addressdetail = Util.checkString(req.getParameter("addressdetail"));
		dm.memo = Util.checkString(req.getParameter("memo"));
		dm.adminidx = Util.checkString(req.getParameter("adminidx"));
		dm.price = Util.checkString(req.getParameter("price"));
		dm.issuecount = Util.checkString(req.getParameter("issuecount"));
		dm.issuedatecategory = Util.checkString(req.getParameter("issuedatecategory"));
		dm.receiptdocument = Util.checkString(req.getParameter("receiptdocument"));
		
		dm.paymentidx = (String) hash.get("paymentidx");

		dm.print();

		 try { 
	        	TN_DNS_1000DAO dao = new TN_DNS_1000DAO();	        	
	            ds = dao.tn_dns_3040_a(dm); 
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
}
