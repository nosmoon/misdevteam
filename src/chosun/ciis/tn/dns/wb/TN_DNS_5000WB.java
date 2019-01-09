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

public class TN_DNS_5000WB extends chosun.ciis.co.base.wb.BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

  
	
    TN_DNS_5000DAO dao = new TN_DNS_5000DAO();
    
	public void tn_dns_5010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		TN_DNS_5010_LDataSet ds = null;
		TN_DNS_5010_LDM dm = new TN_DNS_5010_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy =  Util.checkString(req.getParameter("yy"));
		dm.event_cd = Util.checkString(req.getParameter("event_cd"));
		dm.print();

		 try { 
	        	TN_DNS_5000DAO dao = new TN_DNS_5000DAO();
	            ds = dao.tn_dns_5010_l(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }
	}
	
}
