package chosun.ciis.tn.dns.wb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

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
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.tn.dns.dao.TN_DNS_1000DAO;
import chosun.ciis.tn.dns.dao.TN_DNS_2000DAO;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

public class TN_DNS_2000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

  
    public void tn_dns_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_2000_MDataSet ds = null;
		TN_DNS_2000_MDM dm = new TN_DNS_2000_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		 try { 
	        	TN_DNS_2000DAO dao = new TN_DNS_2000DAO();
	            ds = dao.tn_dns_2000_m(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
	public void tn_dns_2010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2010_LDataSet ds = null;
		
		TN_DNS_2010_LDM dm = new TN_DNS_2010_LDM();

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.membertype = Util.checkString(req.getParameter("membertype"));
		dm.name = Util.checkString(req.getParameter("name"));
		dm.isanonymous = Util.checkString(req.getParameter("isanonymous"));
		dm.isforeigner = Util.checkString(req.getParameter("isforeigner"));
		dm.membercode_to = Util.checkString(req.getParameter("membercode_to"));
		dm.membercode_fr = Util.checkString(req.getParameter("membercode_fr"));
		dm.regno1 = Util.checkString(req.getParameter("regno1"));
		dm.regno2 = Util.checkString(req.getParameter("regno2"));
		dm.telno = Util.checkString(req.getParameter("phone"));
		dm.businessno = Util.checkString(req.getParameter("businessno"));
		dm.promiseprice_fr = Util.checkString(req.getParameter("promiseprice_fr"));
		dm.promiseprice_to = Util.checkString(req.getParameter("promiseprice_to"));
		dm.promisecode_fr = Util.checkString(req.getParameter("promisecode_fr"));
		dm.promisecode_to = Util.checkString(req.getParameter("promisecode_to"));
		dm.paymentcode_fr = Util.checkString(req.getParameter("paymentcode_fr"));
		dm.paymentcode_to = Util.checkString(req.getParameter("paymentcode_to"));
		dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
		dm.payprice_fr = Util.checkString(req.getParameter("payprice_fr"));
		dm.payprice_to = Util.checkString(req.getParameter("payprice_to"));
		dm.fundtype = Util.checkString(req.getParameter("fundtype"));
		dm.bankaccountowner = Util.checkString(req.getParameter("bankaccountowner"));
		dm.memo = Util.checkString(req.getParameter("memo"));
		dm.print();

		ds = (TN_DNS_2010_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void tn_dns_2020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2020_ADataSet ds = null;
		
		TN_DNS_2020_ADM dm = new TN_DNS_2020_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
																	
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = (String)hash.get("m");
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.memberidx = (String)hash.get("memberidx");
        
		dm.print();
		
		ds = (TN_DNS_2020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void tn_dns_2030_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2030_LDataSet ds = null;
		
		TN_DNS_2030_LDM dm = new TN_DNS_2030_LDM();

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.membertype = Util.checkString(req.getParameter("membertype"));
		dm.name = Util.checkString(req.getParameter("name"));
		dm.print(); 

		ds = (TN_DNS_2030_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void tn_dns_2110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2110_LDataSet ds = null;
		
		TN_DNS_2110_LDM dm = new TN_DNS_2110_LDM();

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.print();

		ds = (TN_DNS_2110_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

}