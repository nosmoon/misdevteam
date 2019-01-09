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

import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

public class TN_DNS_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

  
    
	public void tn_dns_3010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3010_LDataSet ds = null;
		
		TN_DNS_3010_LDM dm = new TN_DNS_3010_LDM();

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.fundtype = Util.checkString(req.getParameter("fundtype"));
		dm.issuedate_fr = Util.checkString(req.getParameter("issuedate_fr"));
		dm.issuedate_to = Util.checkString(req.getParameter("issuedate_to"));
		dm.name = Util.checkString(req.getParameter("name"));
		dm.receiptcode_fr = Util.checkString(req.getParameter("receiptcode_fr"));
		dm.receiptcode_to = Util.checkString(req.getParameter("receiptcode_to"));
		dm.isdeleted = Util.checkString(req.getParameter("isdeleted"));

		
		
		dm.print();

		ds = (TN_DNS_3010_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void tn_dns_3030_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3030_ADataSet ds = null;
		
		TN_DNS_3030_ADM dm = new TN_DNS_3030_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
		String receiptidx = "";
		if(!multiUpdateData.equals("")){
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			dm.check = (String)hash.get("check");
			receiptidx = (String)hash.get("receiptidx");
		}else{
			receiptidx = Util.checkString(req.getParameter("receiptidx"));
		}

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.accflag = Util.checkString(req.getParameter("accflag"));
        
		dm.setReceiptidx(receiptidx);
		dm.print();

		ds = (TN_DNS_3030_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	public void tn_dns_3060_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3060_LDataSet ds = null;
		TN_DNS_3060_LDM dm = new TN_DNS_3060_LDM();
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.receiptidx = Util.checkString(req.getParameter("receiptidx"));
		dm.receiptcode = Util.checkString(req.getParameter("receiptcode"));

		dm.print();

		ds = (TN_DNS_3060_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);

	}
	
	public void tn_dns_3110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3110_LDataSet ds = null;
		
		TN_DNS_3110_LDM dm = new TN_DNS_3110_LDM();

		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));

		
		
		dm.print();

		ds = (TN_DNS_3110_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	public void tn_dns_3120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3120_LDataSet ds = null;
		TN_DNS_3120_LDM dm = new TN_DNS_3120_LDM();
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.receiptbulkissueidx = Util.checkString(req.getParameter("receiptbulkissueidx"));

		dm.print();

		ds = (TN_DNS_3120_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);

	}
	public void tn_dns_3130_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3130_LDataSet ds = null;
		TN_DNS_3130_LDM dm = new TN_DNS_3130_LDM();
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.startpaydate = Util.checkString(req.getParameter("startpaydate"));
		dm.endpaydate = Util.checkString(req.getParameter("endpaydate"));
		dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.includeissued = Util.checkString(req.getParameter("includeissued"));
		
 
		dm.print();

		ds = (TN_DNS_3130_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);

	}
	
	public void tn_dns_3140_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3140_ADataSet ds = null;
		
		TN_DNS_3140_ADM dm = new TN_DNS_3140_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
																	
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

		dm.receiptcode = (String)hash.get("receiptcode")+"#"+(String)hash2.get("receiptcode"); 
		dm.price = (String)hash.get("price")+"#"+(String)hash2.get("price");
		dm.memberidx = (String)hash.get("memberidx")+"#"+(String)hash2.get("memberidx");
		dm.receiptidx = (String)hash.get("receiptidx")+"#"+(String)hash2.get("receiptidx");
	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.accflag = Util.checkString(req.getParameter("accflag"));
        dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.startpaydate = Util.checkString(req.getParameter("startpaydate"));
		dm.endpaydate = Util.checkString(req.getParameter("endpaydate"));
		dm.issuedate = Util.checkString(req.getParameter("issuedate"));
		dm.issuedeptidx = Util.checkString(req.getParameter("issuedeptidx"));
		dm.includeissued = Util.checkString(req.getParameter("includeissued"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		
		dm.print();

		ds = (TN_DNS_3140_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void tn_dns_3150_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3150_ADataSet ds = null;
		
		TN_DNS_3150_ADM dm = new TN_DNS_3150_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData3"));
																	
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.receiptcode = (String)hash.get("receiptcode"); 
		dm.price = (String)hash.get("price");
		dm.memberidx = (String)hash.get("memberidx");
		dm.receiptidx = (String)hash.get("receiptidx");
	
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.accflag = Util.checkString(req.getParameter("accflag"));
        dm.deptidx = Util.checkString(req.getParameter("deptidx"));
		dm.startpaydate = Util.checkString(req.getParameter("startpaydate"));
		dm.endpaydate = Util.checkString(req.getParameter("endpaydate"));
		dm.issuedate = Util.checkString(req.getParameter("issuedate"));
		dm.issuedeptidx = Util.checkString(req.getParameter("issuedeptidx"));
		dm.includeissued = Util.checkString(req.getParameter("includeissued"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.receiptbulkissueidx = Util.checkString(req.getParameter("receiptbulkissueidx"));
		
		dm.print();

		ds = (TN_DNS_3150_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	public void tn_dns_3160_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3160_LDataSet ds = null;
		TN_DNS_3160_LDM dm = new TN_DNS_3160_LDM();
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.receiptbulkissueidx = Util.checkString(req.getParameter("receiptbulkissueidx"));

		dm.print();

		ds = (TN_DNS_3160_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);

	}
	
	public void tn_dns_3170_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3170_LDataSet ds = null;
		TN_DNS_3170_LDM dm = new TN_DNS_3170_LDM();
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.receiptbulkissueidx = Util.checkString(req.getParameter("receiptbulkissueidx"));

		dm.print();

		ds = (TN_DNS_3170_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);

	}
}