/***************************************************************************************************
* ���ϸ� : AdPub3000WB.java
* ��� : �������м�
* �ۼ����� : 2010.09.10
* �ۼ��� : KBS
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ad.pub.wb;

import java.sql.CallableStatement;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub3000DAO;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.cocd.dm.CO_COCD_1650_ADM;
import chosun.ciis.co.cocd.ds.CO_COCD_1640_LDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1650_ADataSet;
import chosun.ciis.co.dlco.ds.CO_DLCO_1002_ADataSet;

import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;
/**
 * 
 */

public class AdPub3000WB extends BaseWB {

	 /** 
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3000_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3000_MDataSet ds = null;

        // DM Setting
    	AD_PUB_3000_MDM dm = new AD_PUB_3000_MDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setEmp_no(emp_no);
        
        //dm.print();

        try {
        	AdPub3000DAO	dao = new AdPub3000DAO();
            ds = dao.ad_pub_3000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2100EJBHome home = (AdPub2100EJBHome) JNDIManager.getInstance().getHome("AdPub2100EJB");
//        try {
//        	AdPub2100EJB ejb = home.create();
//            ds = ejb.ad_pub_2100_m(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3010_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3010_LDataSet ds = null;

        // DM Setting
    	AD_PUB_3010_LDM dm = new AD_PUB_3010_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));
    	
    	String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
    	String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
    	String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
    	
    	String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
    	String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
    	String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
    	String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
    	String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
    	
    	String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
    	
    	String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
    	
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
    	dm.setLine_advt_yn(line_advt_yn);
    	dm.setNwsp_advt_yn(nwsp_advt_yn);
    	dm.setSelf_advt_yn(self_advt_yn);
    	
    	dm.setGrp_cmpy(grp_cmpy);
    	dm.setIndt_clsf_1(indt_clsf_1);
    	dm.setIndt_clsf_2(indt_clsf_2);
    	dm.setType_clsf_1(type_clsf_1);
    	dm.setType_clsf_2(type_clsf_2);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setEmp_no(emp_no);
    	dm.setIlbo_total(ilbo_total);
    	
    	//dm.print();
        try {
        	AdPub3000DAO	dao = new AdPub3000DAO();
            ds = dao.ad_pub_3010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    public void ad_pub_3011_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3011_LDataSet ds = null;

        // DM Setting
    	AD_PUB_3011_LDM dm = new AD_PUB_3011_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));
    	
    	String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
    	String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
    	String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
    	
    	String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
    	String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
    	String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
    	String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
    	String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
    	
    	String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
    	
    	String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
    	
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
    	dm.setLine_advt_yn(line_advt_yn);
    	dm.setNwsp_advt_yn(nwsp_advt_yn);
    	dm.setSelf_advt_yn(self_advt_yn);
    	
    	dm.setGrp_cmpy(grp_cmpy);
    	dm.setIndt_clsf_1(indt_clsf_1);
    	dm.setIndt_clsf_2(indt_clsf_2);
    	dm.setType_clsf_1(type_clsf_1);
    	dm.setType_clsf_2(type_clsf_2);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setEmp_no(emp_no);
    	dm.setIlbo_total(ilbo_total);  
    	
    	//dm.print();
        try {
        	AdPub3000DAO	dao = new AdPub3000DAO();
            ds = dao.ad_pub_3011_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }

    public void ad_pub_3012_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
	
		AD_PUB_3012_LDataSet ds = null;
	
	    // DM Setting
		AD_PUB_3012_LDM dm = new AD_PUB_3012_LDM();
		
		String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
		String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
		String frdt       = Util.checkString(req.getParameter("frdt"));
		String todt       = Util.checkString(req.getParameter("todt"));
		
		String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
		String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
		String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
		
		String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
		String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
		String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
		String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
		String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
		
		String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
		String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
		
		String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
		String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
		
		String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
		String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		
		dm.setLine_advt_yn(line_advt_yn);
		dm.setNwsp_advt_yn(nwsp_advt_yn);
		dm.setSelf_advt_yn(self_advt_yn);
		
		dm.setGrp_cmpy(grp_cmpy);
		dm.setIndt_clsf_1(indt_clsf_1);
		dm.setIndt_clsf_2(indt_clsf_2);
		dm.setType_clsf_1(type_clsf_1);
		dm.setType_clsf_2(type_clsf_2);
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_no(dlco_no);
		dm.setSlcrg_pers(slcrg_pers);
		dm.setMchrg_pers(mchrg_pers);
		dm.setEmp_no(emp_no);
		dm.setIlbo_total(ilbo_total); 
		
		//dm.print();
	    try {
	    	AdPub3000DAO	dao = new AdPub3000DAO();
	        ds = dao.ad_pub_3012_l(dm);
	        req.setAttribute("ds", ds);  
	    }
	    catch (AppException e) {
	        throw e;
	    }
	}

    public void ad_pub_3013_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
	
		AD_PUB_3013_LDataSet ds = null;
	
	    // DM Setting
		AD_PUB_3013_LDM dm = new AD_PUB_3013_LDM();
		
		String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
		String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
		String frdt       = Util.checkString(req.getParameter("frdt"));
		String todt       = Util.checkString(req.getParameter("todt"));
		
		String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
		String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
		String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
		
		String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
		String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
		String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
		String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
		String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
		
		String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
		String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
		
		String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
		String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
		
		String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
		String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		
		dm.setLine_advt_yn(line_advt_yn);
		dm.setNwsp_advt_yn(nwsp_advt_yn);
		dm.setSelf_advt_yn(self_advt_yn);
		
		dm.setGrp_cmpy(grp_cmpy);
		dm.setIndt_clsf_1(indt_clsf_1);
		dm.setIndt_clsf_2(indt_clsf_2);
		dm.setType_clsf_1(type_clsf_1);
		dm.setType_clsf_2(type_clsf_2);
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_no(dlco_no);
		dm.setSlcrg_pers(slcrg_pers);
		dm.setMchrg_pers(mchrg_pers);
		dm.setEmp_no(emp_no);
		dm.setIlbo_total(ilbo_total); 
		
		//dm.print();
	    try {
	    	AdPub3000DAO	dao = new AdPub3000DAO();
	        ds = dao.ad_pub_3013_l(dm);
	        req.setAttribute("ds", ds);  
	    }
	    catch (AppException e) {
	        throw e;
	    }
	}

    public void ad_pub_3014_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
	
		AD_PUB_3014_LDataSet ds = null;
	
	    // DM Setting
		AD_PUB_3014_LDM dm = new AD_PUB_3014_LDM();
		
		String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
		String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
		String frdt       = Util.checkString(req.getParameter("frdt"));
		String todt       = Util.checkString(req.getParameter("todt"));
		
		String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
		String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
		String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
		
		String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
		String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
		String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
		String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
		String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
		
		String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
		String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
		
		String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
		String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
		
		String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
		String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		
		dm.setLine_advt_yn(line_advt_yn);
		dm.setNwsp_advt_yn(nwsp_advt_yn);
		dm.setSelf_advt_yn(self_advt_yn);
		
		dm.setGrp_cmpy(grp_cmpy);
		dm.setIndt_clsf_1(indt_clsf_1);
		dm.setIndt_clsf_2(indt_clsf_2);
		dm.setType_clsf_1(type_clsf_1);
		dm.setType_clsf_2(type_clsf_2);
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_no(dlco_no);
		dm.setSlcrg_pers(slcrg_pers);
		dm.setMchrg_pers(mchrg_pers);
		dm.setEmp_no(emp_no);
		dm.setIlbo_total(ilbo_total); 
		//dm.print();
	    try {
	    	AdPub3000DAO	dao = new AdPub3000DAO();
	        ds = dao.ad_pub_3014_l(dm);
	        req.setAttribute("ds", ds);  
	    }
	    catch (AppException e) {
	        throw e;
	    }
	}

	public void ad_pub_3015_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		
		AD_PUB_3015_LDataSet ds = null;
	
	    // DM Setting
		AD_PUB_3015_LDM dm = new AD_PUB_3015_LDM();
		
		String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
		String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
		String frdt       = Util.checkString(req.getParameter("frdt"));
		String todt       = Util.checkString(req.getParameter("todt"));
		
		String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
		String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
		String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
		
		String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
		String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
		String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
		String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
		String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
		
		String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
		String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
		
		String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
		String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
		
		String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
		String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		
		dm.setLine_advt_yn(line_advt_yn);
		dm.setNwsp_advt_yn(nwsp_advt_yn);
		dm.setSelf_advt_yn(self_advt_yn);
		
		dm.setGrp_cmpy(grp_cmpy);
		dm.setIndt_clsf_1(indt_clsf_1);
		dm.setIndt_clsf_2(indt_clsf_2);
		dm.setType_clsf_1(type_clsf_1);
		dm.setType_clsf_2(type_clsf_2);
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_no(dlco_no);
		dm.setSlcrg_pers(slcrg_pers);
		dm.setMchrg_pers(mchrg_pers);
		dm.setEmp_no(emp_no);
		dm.setIlbo_total(ilbo_total); 
		//dm.print();
	    try {
	    	AdPub3000DAO	dao = new AdPub3000DAO();
	        ds = dao.ad_pub_3015_l(dm);
	        req.setAttribute("ds", ds);  
	    }
	    catch (AppException e) {
	        throw e;
	    }
	
	}

	public void ad_pub_3016_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		
		AD_PUB_3016_LDataSet ds = null;
	
	    // DM Setting
		AD_PUB_3016_LDM dm = new AD_PUB_3016_LDM();
		
		String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
		String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
		String frdt       = Util.checkString(req.getParameter("frdt"));
		String todt       = Util.checkString(req.getParameter("todt"));
		
		String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
		String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
		String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
		
		String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
		String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
		String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
		String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
		String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
		
		String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
		String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
		
		String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
		String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
		
		String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
		String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		
		dm.setLine_advt_yn(line_advt_yn);
		dm.setNwsp_advt_yn(nwsp_advt_yn);
		dm.setSelf_advt_yn(self_advt_yn);
		
		dm.setGrp_cmpy(grp_cmpy);
		dm.setIndt_clsf_1(indt_clsf_1);
		dm.setIndt_clsf_2(indt_clsf_2);
		dm.setType_clsf_1(type_clsf_1);
		dm.setType_clsf_2(type_clsf_2);
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_no(dlco_no);
		dm.setSlcrg_pers(slcrg_pers);
		dm.setMchrg_pers(mchrg_pers);
		dm.setEmp_no(emp_no);
		dm.setIlbo_total(ilbo_total);  
		dm.print();
	    try {
	    	AdPub3000DAO	dao = new AdPub3000DAO();
	        ds = dao.ad_pub_3016_l(dm);
	        req.setAttribute("ds", ds);  
	    }
	    catch (AppException e) {
	        throw e;
	    }
	}
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3017_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3017_LDataSet ds = null;

        // DM Setting
    	AD_PUB_3017_LDM dm = new AD_PUB_3017_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));
    	
    	String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
    	String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
    	String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
    	
    	String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
    	String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
    	String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
    	String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
    	String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
    	
    	String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
    	
    	String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
    	
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
    	dm.setLine_advt_yn(line_advt_yn);
    	dm.setNwsp_advt_yn(nwsp_advt_yn);
    	dm.setSelf_advt_yn(self_advt_yn);
    	
    	dm.setGrp_cmpy(grp_cmpy);
    	dm.setIndt_clsf_1(indt_clsf_1);
    	dm.setIndt_clsf_2(indt_clsf_2);
    	dm.setType_clsf_1(type_clsf_1);
    	dm.setType_clsf_2(type_clsf_2);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setEmp_no(emp_no);
    	dm.setIlbo_total(ilbo_total);  
    	//dm.print();
        try {
        	AdPub3000DAO	dao = new AdPub3000DAO();
            ds = dao.ad_pub_3017_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    } 

	public void ad_pub_3018_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		
		AD_PUB_3018_LDataSet ds = null;
	
	    // DM Setting
		AD_PUB_3018_LDM dm = new AD_PUB_3018_LDM();
		
		String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
		String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
		String frdt       = Util.checkString(req.getParameter("frdt"));
		String todt       = Util.checkString(req.getParameter("todt"));
		
		String line_advt_yn	= Util.checkString(req.getParameter("line_advt_yn"));
		String nwsp_advt_yn	= Util.checkString(req.getParameter("nwsp_advt_yn"));
		String self_advt_yn	= Util.checkString(req.getParameter("self_advt_yn"));
		
		String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
		String indt_clsf_1	= Util.checkString(req.getParameter("indt_clsf_1"));
		String indt_clsf_2	= Util.checkString(req.getParameter("indt_clsf_2"));
		String type_clsf_1	= Util.checkString(req.getParameter("type_clsf_1"));
		String type_clsf_2	= Util.checkString(req.getParameter("type_clsf_2"));
		
		String dlco_clsf  	= Util.checkString(req.getParameter("hndl_clsf"));
		String dlco_no  	= Util.checkString(req.getParameter("dlco_no"));
		
		String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
		String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
		
		String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
		String ilbo_total	= Util.checkString(req.getParameter("ilbo_total"));
		String cslcrg_pers	= Util.checkString(req.getParameter("cslcrg_pers"));
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		
		dm.setLine_advt_yn(line_advt_yn);
		dm.setNwsp_advt_yn(nwsp_advt_yn);
		dm.setSelf_advt_yn(self_advt_yn);
		
		dm.setGrp_cmpy(grp_cmpy);
		dm.setIndt_clsf_1(indt_clsf_1);
		dm.setIndt_clsf_2(indt_clsf_2);
		dm.setType_clsf_1(type_clsf_1);
		dm.setType_clsf_2(type_clsf_2);
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_no(dlco_no);
		dm.setSlcrg_pers(slcrg_pers);
		dm.setMchrg_pers(mchrg_pers);
		dm.setEmp_no(emp_no);
		dm.setIlbo_total(ilbo_total); 
		dm.setCslcrg_pers(cslcrg_pers);
		//dm.print();
	    try {
	    	AdPub3000DAO	dao = new AdPub3000DAO();
	        ds = dao.ad_pub_3018_l(dm);
	        req.setAttribute("ds", ds);  
	    }
	    catch (AppException e) {
	        throw e;
	    }
	
	}
	
	public void ad_pub_3020_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		
		AD_PUB_3020_MDataSet ds = null;
	
	    // DM Setting
		AD_PUB_3020_MDM dm = new AD_PUB_3020_MDM();
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		if("550".equals(cmpy_cd)){
			dm.cmpy_cd = "500";
		}else{
			dm.cmpy_cd = cmpy_cd;
		}		
		dm.clos_yymm = Util.checkString(req.getParameter("clos_yymm")).substring(0,6);
		
		dm.print();
	    try {
	    	AdPub3000DAO	dao = new AdPub3000DAO();
	        ds = dao.ad_pub_3020_m(dm);
	        req.setAttribute("ds", ds);  
	    }
	    catch (AppException e) {
	        throw e;
	    }
	}
	/** ������Ÿ��� (I): TV��������ڷ� ��ȸ, ����TB���, ���⸶����&����� ����, ������� �۾��̷� ���
	 *  ������Ÿ������(D): ������� �۾��̷� ����, ���⸶����&����� ����
	 * @param req
	 * @param pub
	 * @throws AppException
	 * @throws SQLException 
	 */
	public void ad_pub_3021_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		
		DBManager manager        = null; //ERP
       	DBManager managerBis     = null; //BIS
       	CallableStatement cstmt1 = null;
       	CallableStatement cstmt2 = null;
       	CallableStatement cstmt3 = null;
       	CallableStatement cstmt4 = null;	
       	
        //������ŵ����Ͱ�����_����
		AD_PUB_3021_ADataSet ds1 = null;
		AD_PUB_3021_ADM dm1 = new AD_PUB_3021_ADM();
		
		AD_PUB_3022_LDataSet ds2 = null;
		AD_PUB_3022_LDM dm2 = new AD_PUB_3022_LDM();
				
		AD_PUB_3023_ADataSet ds3 = null;
		AD_PUB_3023_ADM dm3 = new AD_PUB_3023_ADM();

		AD_PUB_3024_ADataSet ds4 = null;
		AD_PUB_3024_ADM dm4 = new AD_PUB_3024_ADM();

		AD_PUB_3025_ADataSet ds5 = null;
		AD_PUB_3025_ADM dm5 = new AD_PUB_3025_ADM();
		
		String mode = Util.checkString(req.getParameter("mode"));
		
		if(mode.equals("I")){
			 try {
			    	//0.DB����
			    	manager = new DBManager("MISADV");
		           	manager.getConnection();
		           	manager.m_conn.setAutoCommit(false);
		           	
			       	managerBis = new DBManager("MISTV");
			       	managerBis.getConnection();
			       	managerBis.m_conn.setAutoCommit(false);

			    	//3.������ŵ��:�۾����̺� ���
					dm1.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
					dm1.setMode(Util.checkString(req.getParameter("mode")));
					dm1.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
					dm1.setIncmg_pers_ip(req.getRemoteAddr());     
					dm1.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
					dm1.print();
					
		           	cstmt1 = manager.m_conn.prepareCall(dm1.getSQL());
		           	// �Ķ���� ����
		           	dm1.setParams(cstmt1,dm1);
			       	// ����
			       	cstmt1.execute();	       	
		       	
			       	// ���
			       	ds1 = (AD_PUB_3021_ADataSet) dm1.createDataSetObject();
			       	ds1.getValues(cstmt1);
			       	cstmt1.close();
			       	if (!"".equals(ds1.errcode)) {
				            throw new AppException(ds1.errcode, ds1.errmsg);
			        }  			       	

		  	        //1.TV��������ڷ� ���� ����ڷ�  
					dm2.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
					dm2.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
					dm2.print();
					
			       	cstmt2 = managerBis.m_conn.prepareCall(dm2.getSQL());
			       	// �Ķ���� ����
			       	dm2.setParams(cstmt2,dm2);
			        
			        // ����
			       	cstmt2.execute();
			       	
			        // ���
			       	ds2 = (AD_PUB_3022_LDataSet) dm2.createDataSetObject();
			       	ds2.getValues(cstmt2);
			       	cstmt2.close();
			       	if (!"".equals(ds2.errcode)) {
				            throw new AppException(ds2.errcode, ds2.errmsg);
			        }
		 
			       	if (ds2.curlist.size()==0) {
			            throw new AppException("ad_pub_3022_l", "������ �ڷᰡ �������� �ʽ��ϴ�.");
		            }
			       	
					for(int i = 0; i < ds2.curlist.size(); i++) {
						//�������̺�  INSERT
						AD_PUB_3022_LCURLISTRecord rec = (AD_PUB_3022_LCURLISTRecord)ds2.curlist.get(i);
						
						dm3.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
						dm3.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
						dm3.setChgcode(rec.chgcode);
						dm3.setCuscode(rec.cuscode);   
						dm3.setBlndcode(rec.blndcode);                                        
						dm3.setOrgcode(rec.orgcode);                                          
						dm3.setFrdate(rec.frdate);                                            
						dm3.setTodate(rec.todate);                                            
						dm3.setRcvgrp(rec.rcvgrp);                                            
						dm3.setChgcode(rec.chgcode);                                          
						dm3.setStdmonth(rec.stdmonth);                                        
						dm3.setRcvamt(Integer.parseInt(rec.rcvamt));                          
						dm3.setVatcode(rec.vatcode);                                          
						dm3.setAgentcode(rec.agentcode);                                      
						dm3.setAgentfee(Integer.parseInt(rec.agentfee));                      
						dm3.setSalecode(rec.salecode);                                        
						dm3.setSaleemp(rec.saleemp);                                          
						dm3.setDeptcode(rec.deptcode);                                        
						dm3.setDeptname(rec.deptname);                                        
						dm3.setZpcode(rec.zpcode);                                            
						dm3.setZpname(rec.zpname);                                            
						dm3.setStdamt(Integer.parseInt(rec.stdamt));                          
						dm3.setDivamt(Integer.parseInt(rec.divamt)); 
						dm3.setDivvatamt(Integer.parseInt(rec.divvatamt)); 
						dm3.setAgentstdamt(Integer.parseInt(rec.agentstdamt));                
						dm3.setAgentdivamt(Integer.parseInt(rec.agentdivamt)); 
						dm3.setAgentdivvatamt(Integer.parseInt(rec.agentdivvatamt)); 
						dm3.setPubc_occr_dt(rec.pubc_occr_dt);                                
						dm3.setIncmg_pers_ip(req.getRemoteAddr());                            
						dm3.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
						
				       	cstmt3 = manager.m_conn.prepareCall(dm3.getSQL());
				       	// �Ķ���� ����
				       	dm3.setParams(cstmt3,dm3);
				        // ����
				       	cstmt3.execute();
				       	
				       	ds3 = (AD_PUB_3023_ADataSet) dm3.createDataSetObject();
				       	ds3.getValues(cstmt3);
				       	
				       	cstmt3.close();
				       	if (!"".equals(ds3.errcode)) {
					            throw new AppException(ds3.errcode, ds3.errmsg);
				        }		       	
						
						//���⸶����,����� ���Ż���üũ  UPDATE	
						dm4.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
						dm4.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
						dm4.setChcode(rec.chcode);
						dm4.setChgcode(rec.chgcode);
						dm4.setCuscode(rec.cuscode);   
						dm4.setBlndcode(rec.blndcode);                                        
						dm4.setOrgcode(rec.orgcode);                                          
						dm4.setFrdate(rec.frdate);                                            
						dm4.setTodate(rec.todate);                                            
						dm4.setRcvgrp(rec.rcvgrp);                                            
						dm4.setChgcode(rec.chgcode);
						dm4.setDtlseq(rec.dtlseq); 
						dm4.setMst_yn(rec.dtl_num); 
						dm4.setAcct_trn_cnfm(rec.acct_trn_cnfm); 
						dm4.setMedi_cd(ds3.medi_cd); 
						dm4.setPubc_occr_seq(ds3.pubc_occr_seq); 
						dm4.setPubc_occr_dt(ds3.pubc_occr_dt);                                
						dm4.setIncmg_pers_ip(req.getRemoteAddr());                            
						dm4.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));		       	
				       	dm4.print();
				       	
				       	cstmt4 = managerBis.m_conn.prepareCall(dm4.getSQL());
				       	// �Ķ���� ����
				       	dm4.setParams(cstmt4,dm4);
				        // ����
				       	cstmt4.execute();
				       	ds4 = (AD_PUB_3024_ADataSet) dm4.createDataSetObject();
				       	ds4.getValues(cstmt4);
				       	cstmt4.close();
				       	if (!"".equals(ds4.errcode)) {
					            throw new AppException(ds4.errcode, ds4.errmsg);
				        }	
		 
					}
		     
		       	
			       	manager.commit();	
			       	managerBis.commit();
			    }
			    catch (AppException e) {
			    	  if (managerBis != null)
				          managerBis.rollback();
				      if (manager != null)
				          manager.rollback();	
		             throw e;   
				}catch (SQLException e) {
					if (managerBis != null)
				          managerBis.rollback();	
				    if (manager != null)
				          manager.rollback();	
			    	  throw new SysException(e);
				}catch (Exception e) {
				      if (managerBis != null)
				          managerBis.rollback();		
				      if (manager != null)
				          manager.rollback();	
			    	  throw new SysException(e);
			    } finally {	    	
				    if (managerBis != null)	    	
				    	managerBis.disConnection();
				    if (manager != null)	
				    	manager.disConnection();
			    }
			
		}else if(mode.equals("D")){
			 try {
			    	//0.DB����
			    	manager = new DBManager("MISADV");
		           	manager.getConnection();
		           	manager.m_conn.setAutoCommit(false);
		           	
			       	managerBis = new DBManager("MISTV");
			       	managerBis.getConnection();
			       	managerBis.m_conn.setAutoCommit(false);
			       	

			       	dm1.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
					dm1.setMode(Util.checkString(req.getParameter("mode")));
					dm1.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
					dm1.setIncmg_pers_ip(req.getRemoteAddr());     
					dm1.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
					dm1.print();
					
			       	cstmt1 = manager.m_conn.prepareCall(dm1.getSQL());
			       	// �Ķ���� ����
			       	dm1.setParams(cstmt1,dm1);
			        
			        // ����
			       	cstmt1.execute();
			       	
			        // ���
			       	ds1 = (AD_PUB_3021_ADataSet) dm1.createDataSetObject();
			       	ds1.getValues(cstmt1);
			       	
			       	cstmt1.close();
			       	if (!"".equals(ds1.errcode)) {
				            throw new AppException(ds1.errcode, ds1.errmsg);
			        }
			       	
			       	dm5.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
					dm5.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
					dm5.setIncmg_pers_ip(req.getRemoteAddr());                            
					dm5.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
					dm5.print();
			       	
					cstmt2 = managerBis.m_conn.prepareCall(dm5.getSQL());
			       	// �Ķ���� ����
			       	dm5.setParams(cstmt2,dm5);
			        
			        // ����
			       	cstmt2.execute();
			       	
			        // ���
			       	ds5 = (AD_PUB_3025_ADataSet) dm5.createDataSetObject();
			       	ds5.getValues(cstmt2);
			       	cstmt2.close();
			       	if (!"".equals(ds5.errcode)) {
				            throw new AppException(ds5.errcode, ds5.errmsg);
			        }
		       	
			       	manager.commit();	
			       	managerBis.commit();
			    }
			    catch (AppException e) {
			    	  if (managerBis != null)
				          managerBis.rollback();
				      if (manager != null)
				          manager.rollback();	
		             throw e;   
				}catch (SQLException e) {
					if (managerBis != null)
				          managerBis.rollback();	
				    if (manager != null)
				          manager.rollback();	
			    	  throw new SysException(e);
				}catch (Exception e) {
				      if (managerBis != null)
				          managerBis.rollback();		
				      if (manager != null)
				          manager.rollback();	
			    	  throw new SysException(e);
			    } finally {	    	
				    if (managerBis != null)	    	
				    	managerBis.disConnection();
				    if (manager != null)	
				    	manager.disConnection();
			    }
		}
		req.setAttribute("ds", ds1);
	}
	/**���縶�� 
	 * @param req
	 * @param pub
	 * @throws AppException
	 */
	public void ad_pub_3026_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		DBManager manager        = null; //ERP
       	DBManager managerBis     = null; //BIS
       	CallableStatement cstmt1 = null;
       	CallableStatement cstmt2 = null;

		AD_PUB_3026_ADataSet ds1 = null;
		AD_PUB_3026_ADM dm1 = new AD_PUB_3026_ADM();
		
		AD_PUB_3028_ADataSet ds2 = null;
		AD_PUB_3028_ADM dm2 = new AD_PUB_3028_ADM();
		
		try {
			//0.DB����
	    	manager = new DBManager("MISADV");
           	manager.getConnection();
           	manager.m_conn.setAutoCommit(false);
           	
	       	managerBis = new DBManager("MISTV");
	       	managerBis.getConnection();
	       	managerBis.m_conn.setAutoCommit(false);
			
	       	//1.���縶��
	       	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			if("550".equals(cmpy_cd)){
				dm1.setCmpy_cd("500");
			}else{
				dm1.setCmpy_cd(cmpy_cd);
			}
			dm1.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
			dm1.setIncmg_dept_cd(Util.getSessionParameterValue(req, "deptcd", true));    
			dm1.setIncmg_pers_ip(req.getRemoteAddr());   
			dm1.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
			dm1.print();
			
			cstmt1 = manager.m_conn.prepareCall(dm1.getSQL());
           	// �Ķ���� ����
           	dm1.setParams(cstmt1,dm1);
	       	// ����
	       	cstmt1.execute();
	       	
	    	// ���
	       	ds1 = (AD_PUB_3026_ADataSet) dm1.createDataSetObject();
	       	ds1.getValues(cstmt1);
	       	cstmt1.close();
	       	if (!"".equals(ds1.errcode)) {
		            throw new AppException(ds1.errcode, ds1.errmsg);
	        }  
	       	
	        //1.MISTV���� ���縶�� �������� ���
	       	dm2.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       	dm2.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
	       	dm2.setIncmg_pers_ip(req.getRemoteAddr());   
			dm2.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
			dm2.print();
			
			cstmt2 = managerBis.m_conn.prepareCall(dm2.getSQL());
	       	// �Ķ���� ����
	       	dm2.setParams(cstmt2,dm2);
	        
	        // ����
	       	cstmt2.execute();
	       	
	        // ���
	       	ds2 = (AD_PUB_3028_ADataSet) dm2.createDataSetObject();
	       	ds2.getValues(cstmt2);
	       	cstmt2.close();
	       	if (!"".equals(ds2.errcode)) {
		            throw new AppException(ds2.errcode, ds2.errmsg);
	        }
			
	       	manager.commit();	
	       	managerBis.commit();
		 }
	    catch (AppException e) {
	    	  if (managerBis != null)
		          managerBis.rollback();
		      if (manager != null)
		          manager.rollback();	
             throw e;   
		}catch (SQLException e) {
			if (managerBis != null)
		          managerBis.rollback();	
		    if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (managerBis != null)
		          managerBis.rollback();		
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (managerBis != null)	    	
		    	managerBis.disConnection();
		    if (manager != null)	
		    	manager.disConnection();
	    }
	    req.setAttribute("ds", ds1);
			
	}
	/**���縶����� 
	 * @param req
	 * @param pub
	 * @throws AppException
	 */
	public void ad_pub_3027_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		DBManager manager        = null; //ERP
       	DBManager managerBis     = null; //BIS
       	CallableStatement cstmt1 = null;
       	CallableStatement cstmt2 = null;
		
		AD_PUB_3027_ADataSet ds1 = null;
		AD_PUB_3027_ADM dm1 = new AD_PUB_3027_ADM();
		
		AD_PUB_3028_ADataSet ds2 = null;
		AD_PUB_3028_ADM dm2 = new AD_PUB_3028_ADM();
		
		try {
			//0.DB����
	    	manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	managerBis = new DBManager("MISTV");
	       	managerBis.getConnection();
	       	managerBis.m_conn.setAutoCommit(false);
	       	
	       	//1.���縶��
	       	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			if("550".equals(cmpy_cd)){
				dm1.setCmpy_cd("500");
			}else{
				dm1.setCmpy_cd(cmpy_cd);
			}	       	
			dm1.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
			dm1.setIncmg_pers_ip(req.getRemoteAddr());   
			dm1.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
			dm1.print();
	       	
			cstmt1 = manager.m_conn.prepareCall(dm1.getSQL());
	       	// �Ķ���� ����
	       	dm1.setParams(cstmt1,dm1);
	       	// ����
	       	cstmt1.execute();	       	
	   	
	       	// ���
	       	ds1 = (AD_PUB_3027_ADataSet) dm1.createDataSetObject();
	       	ds1.getValues(cstmt1);
	       	cstmt1.close();
	       	if (!"".equals(ds1.errcode)) {
		            throw new AppException(ds1.errcode, ds1.errmsg);
	        } 
	       	
	        //1.MISTV���� ���縶�� ������������ ���
	       	dm2.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       	dm2.setClos_dt(ds1.getMax_clos_dt()); //������������
	       	dm2.setIncmg_pers_ip(req.getRemoteAddr());   
			dm2.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
			dm2.print();
	       	
			cstmt2 = managerBis.m_conn.prepareCall(dm2.getSQL());
	       	// �Ķ���� ����
	       	dm2.setParams(cstmt2,dm2);
	        
	        // ����
	       	cstmt2.execute();
	       	
	        // ���
	       	ds2 = (AD_PUB_3028_ADataSet) dm2.createDataSetObject();
	       	ds2.getValues(cstmt2);
	       	cstmt2.close();
	       	if (!"".equals(ds2.errcode)) {
		            throw new AppException(ds2.errcode, ds2.errmsg);
	        }
			
	       	manager.commit();	
	       	managerBis.commit();
		}
	    catch (AppException e) {
	    	  if (managerBis != null)
		          managerBis.rollback();
		      if (manager != null)
		          manager.rollback();	
             throw e;   
		}catch (SQLException e) {
			if (managerBis != null)
		          managerBis.rollback();	
		    if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (managerBis != null)
		          managerBis.rollback();		
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (managerBis != null)	    	
		    	managerBis.disConnection();
		    if (manager != null)	
		    	manager.disConnection();
	    }
	    req.setAttribute("ds", ds1);
		
	}
	
	//������ �׷�� ���⳻����ȸ
    public void ad_pub_3051_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3051_LDataSet ds = null;

        // DM Setting
    	AD_PUB_3051_LDM dm = new AD_PUB_3051_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));

    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFr_dt(frdt);
    	dm.setTo_dt(todt);
    	
    	dm.print();
        try {
        	AdPub3000DAO	dao = new AdPub3000DAO();
            ds = dao.ad_pub_3051_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }
	
	//������ ���� �׷�� ���⳻����ȸ
    public void ad_pub_3052_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3052_LDataSet ds = null;

        // DM Setting
    	AD_PUB_3052_LDM dm = new AD_PUB_3052_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));

    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFr_dt(frdt);
    	dm.setTo_dt(todt);
    	
    	dm.print();
        try {
        	AdPub3000DAO	dao = new AdPub3000DAO();
            ds = dao.ad_pub_3052_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }
    
	
	//������ ���ɱ�� ���⳻����ȸ
    public void ad_pub_3053_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_3053_LDataSet ds = null;

        // DM Setting
    	AD_PUB_3053_LDM dm = new AD_PUB_3053_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));

    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFr_dt(frdt);
    	dm.setTo_dt(todt);
    	
    	dm.print();
        try {
        	AdPub3000DAO	dao = new AdPub3000DAO();
            ds = dao.ad_pub_3053_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }
    
	 public void ad_pub_3100_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
	    	
	    	AD_PUB_3100_MDataSet ds = null;

	        // DM Setting
	    	AD_PUB_3100_MDM dm = new AD_PUB_3100_MDM();
	    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
	        
	        dm.setCmpy_cd(cmpy_cd);
	        
	        dm.print();

	        try {
	        	AdPub3000DAO	dao = new AdPub3000DAO();
	        	ds = dao.ad_pub_3100_m(dm);
	            req.setAttribute("ds", ds);  
	        }
	        catch (AppException e) {
	            throw e;
	        } 
//	        
//	        AdPub2100EJBHome home = (AdPub2100EJBHome) JNDIManager.getInstance().getHome("AdPub2100EJB");
//	        try {
//	        	AdPub2100EJB ejb = home.create();
//	            ds = ejb.ad_pub_2100_m(dm);
//	            req.setAttribute("ds", ds);
//	        }
//	        catch (CreateException e) {
//	            SysException se = new SysException(e);
//	            LogManager.getInstance().log(se);
//	            throw se;
//	        }
//	        catch (RemoteException e) {
//	            SysException se = new SysException(e);
//	            LogManager.getInstance().log(se);
//	            throw se;
//	        }
	    }
	 public void ad_pub_3110_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
	    	
	    	AD_PUB_3110_LDataSet ds = null;

	        // DM Setting
	    	AD_PUB_3110_LDM dm = new AD_PUB_3110_LDM();
	    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    	dm.chcode = Util.checkString(req.getParameter("chcode"));
	    	dm.stdmonth = Util.checkString(req.getParameter("stdmonth"));
			dm.pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
			dm.cuscode = Util.checkString(req.getParameter("dlco_no"));
			dm.agentcode = Util.checkString(req.getParameter("agn"));
			dm.acct_trn_cnfm = Util.checkString(req.getParameter("acct_trn_cnfm"));
			dm.salecode = Util.checkString(req.getParameter("salecode"));
			dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	        
	        dm.print();

	        try {
	        	AdPub3000DAO	dao = new AdPub3000DAO();
	        	ds = dao.ad_pub_3110_l(dm);
	            req.setAttribute("ds", ds);  
	        }
	        catch (AppException e) {
	            throw e;
	        } 
//	        
//	        AdPub2100EJBHome home = (AdPub2100EJBHome) JNDIManager.getInstance().getHome("AdPub2100EJB");
//	        try {
//	        	AdPub2100EJB ejb = home.create();
//	            ds = ejb.ad_pub_2100_m(dm);
//	            req.setAttribute("ds", ds);
//	        }
//	        catch (CreateException e) {
//	            SysException se = new SysException(e);
//	            LogManager.getInstance().log(se);
//	            throw se;
//	        }
//	        catch (RemoteException e) {
//	            SysException se = new SysException(e);
//	            LogManager.getInstance().log(se);
//	            throw se;
//	        }
	    }
	 public void ad_pub_3120_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
	    	
	    	AD_PUB_3120_LDataSet ds = null;

	        // DM Setting
	    	AD_PUB_3120_LDM dm = new AD_PUB_3120_LDM();
	    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	    	
	    	dm.chcode = Util.checkString(req.getParameter("chcode"));
			dm.cuscode = Util.checkString(req.getParameter("cuscode"));
			dm.blndcode = Util.checkString(req.getParameter("blndcode"));
			dm.orgcode = Util.checkString(req.getParameter("orgcode"));
			dm.frdate = Util.checkString(req.getParameter("frdate"));
			dm.todate = Util.checkString(req.getParameter("todate"));
			dm.rcvgrp = Util.checkString(req.getParameter("rcvgrp"));
			dm.chgcode = Util.checkString(req.getParameter("chgcode"));
			dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

			dm.print();

	        try {
	        	AdPub3000DAO	dao = new AdPub3000DAO();
	        	ds = dao.ad_pub_3120_l(dm);
	            req.setAttribute("ds", ds);  
	        }
	        catch (AppException e) {
	            throw e;
	        } 
//	        
//	        AdPub2100EJBHome home = (AdPub2100EJBHome) JNDIManager.getInstance().getHome("AdPub2100EJB");
//	        try {
//	        	AdPub2100EJB ejb = home.create();
//	            ds = ejb.ad_pub_2100_m(dm);
//	            req.setAttribute("ds", ds);
//	        }
//	        catch (CreateException e) {
//	            SysException se = new SysException(e);
//	            LogManager.getInstance().log(se);
//	            throw se;
//	        }
//	        catch (RemoteException e) {
//	            SysException se = new SysException(e);
//	            LogManager.getInstance().log(se);
//	            throw se;
//	        }
	    }
	 /**������� 
	 * @param req
	 * @param pub
	 * @throws AppException
	 */
	 /*SP_AD_PUB_3110_L,SP_AD_PUB_3120_L,SP_AD_PUB_3135_L���ν����� JDBC DRIVER classes12.jar�� ojdbc14.jar�� ���׷��̵��Ͽ� ��밡���ϸ� BIS�� ��ġ��Ű�� �ƴϸ� MISADV�� ��ġ��Ų��.*/ 
	public void ad_pub_3130_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		DBManager manager        = null; //ERP
       	DBManager managerBis     = null; //BIS
       	CallableStatement cstmt1 = null;
       	CallableStatement cstmt2 = null;
       	CallableStatement cstmt3 = null;
       	
		AD_PUB_3135_LDataSet ds1 = null;
		AD_PUB_3135_LDM dm1 = new AD_PUB_3135_LDM();
		
		AD_PUB_3130_ADataSet ds2 = null;
		AD_PUB_3130_ADM dm2 = new AD_PUB_3130_ADM();

		AD_PUB_3140_ADataSet ds3 = null;
		AD_PUB_3140_ADM dm3 = new AD_PUB_3140_ADM();
		
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);  
    	

    	String[]  chcode     =  Util.checkString((String)hash.get("chcode"  )).split("#" );  //ä���ڵ�    (���߰�) 	
    	String[]  cuscode    =  Util.checkString((String)hash.get("cuscode" )).split("#" );  //�ŷ�ó�ڵ�  
    	String[]  blndcode   =  Util.checkString((String)hash.get("blndcode")).split("#" );  //�귣���ڵ�  
    	String[]  orgcode    =  Util.checkString((String)hash.get("orgcode" )).split("#" );  //����ȹ�ȣ  
    	String[]  frdate     =  Util.checkString((String)hash.get("frdate"  )).split("#" );  //���������  
    	String[]  todate     =  Util.checkString((String)hash.get("todate"  )).split("#" );  //����������  
    	String[]  rcvgrp     =  Util.checkString((String)hash.get("rcvgrp"  )).split("#" );  //����׷��ڵ�
    	String[]  chgcode    =  Util.checkString((String)hash.get("chgcode" )).split("#" );  //�����ȣ 
    	//�̵� ���࿩��,��Ź��,��Ź������ ���⼭
    	String[]  medialeb_yn =  Util.checkString((String)hash.get("medialeb_yn" )).split("#" );  //�̵� ���࿩�� 
    	String[]  xchngadvt_yn =  Util.checkString((String)hash.get("xchngadvt_yn" )).split("#" );  //��ȯ������
    	String[]  event_cd =  Util.checkString((String)hash.get("event_cd" )).split("#" );  //����ڵ�
    	String[]  trst_rate   =  Util.checkString((String)hash.get("trst_rate" )).split("#" );  //��Ź����
    	String[]  trst_fee    =  Util.checkString((String)hash.get("trst_fee" )).split("#" );  //��Ź��
    	String[]  trst_vat    =  Util.checkString((String)hash.get("trst_vat" )).split("#" );  //��Ź��ΰ���
    	String[]  rslt_dept   =  Util.checkString((String)hash.get("rslt_dept" )).split("#" );  //�����μ�

		//System.out.println("����cuscode:::::::::::::::::>>"+Util.checkString(req.getParameter("cuscode" )));
		
		try {
			//0.DB����
	    	manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	managerBis = new DBManager("MISTV");
	       	managerBis.getConnection();
	       	managerBis.m_conn.setAutoCommit(false);
       	
	       	for( int row=0; row<chcode.length; row++){
	       		
	       		dm1.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       		dm1.setChcode(chcode[row])    ;   //ä���ڵ�    
	       		dm1.setCuscode(cuscode[row])  ;   //�ŷ�ó�ڵ�  
	       		dm1.setBlndcode(blndcode[row]);   //�귣���ڵ�  
	       		dm1.setOrgcode(orgcode[row])  ;   //����ȹ�ȣ  
	       		dm1.setFrdate(frdate[row])    ;   //���������  
	       		dm1.setTodate(todate[row])    ;   //����������  
	       		dm1.setRcvgrp(rcvgrp[row])    ;   //����׷��ڵ�
	       		dm1.setChgcode(chgcode[row])  ;   //�����ȣ   
	       		dm1.print();
	       		
				cstmt1 = managerBis.m_conn.prepareCall(dm1.getSQL());
		       	// �Ķ���� ����
		       	dm1.setParams(cstmt1,dm1);
		       	// ����
		       	cstmt1.execute();		       		

		        // ���
		       	ds1 = (AD_PUB_3135_LDataSet) dm1.createDataSetObject();
		       	ds1.getValues(cstmt1);
		       	cstmt1.close();
		       	if (!"".equals(ds1.errcode)) {
			            throw new AppException(ds1.errcode, ds1.errmsg);
		        }
		    	System.out.println("AD_PUB_3135_L����Ϸ�");		 
		       	if (ds1.curlist.size()==0) {
		            throw new AppException("ad_pub_3135_l", "������ �ڷᰡ �������� �ʽ��ϴ�.");
	            }
		    	//���������� ��ȯ�� ���� ����
		       	int trstRate = Integer.parseInt(trst_rate[row]);//������ ��Ź����
		       	long trstFee = Long.parseLong(trst_fee[row]);//������ ��Ź��
		       	long trstVat = Long.parseLong(trst_vat[row]);//������ ��Ź��ΰ���
		       	long totTrstFee = trstFee + trstVat;
//		       	long totTrstFee = (long)Math.round(Long.parseLong(trst_fee[row]) * 1.1);//��Ź��+�ΰ���
		       	//long trstVat    = totTrstFee - trstFee;
		       	long cumltFeeEx = 0;//������Ź��
		       	long cumltVat = 0;//������Ź��
		       	long cumltFee = 0;//������Ź��
		       	long diffFeeEx = 0;//����
		       	long diffVat = 0;//����
		       	long diffFee = 0;//����
		       	
		       	String medialebYn = medialeb_yn[row];//�̵� ���࿩��
		       	String xchngadvtYn = xchngadvt_yn[row];//��ȯ������
		       	//�ΰ� ���ν����� �������� ��ȸ�ϰ� ����
		       	String eventCd2 = event_cd[row];//�̺�Ʈ�ڵ�
		       	String eventCd  = "";
		       	String rsltDept2 = rslt_dept[row];//�����μ�
		       	String rsltDept = "";
		       	if("N".equals(eventCd2)){
		       		eventCd = "";//��ȯ������
		       	}else{
		       		eventCd = event_cd[row];//�̺�Ʈ�ڵ�
		       	}
		       	if("N".equals(rsltDept2)){
		       		rsltDept = "";
		       	}else{
		       		rsltDept = rslt_dept[row];//�����μ�
		       	}
		       	//bis������ ������ǥ�� �̵� ������ǥ ���� ǥ����
		       	String mst_medi_cd = "";
		       	String mst_occr_dt = "";
		       	String mst_occr_seq = "";
		       	String mst_slip_no = "";
//				���Ҽ�Ź�� ���� �ʱ�ȭ
				cumltFeeEx  = 0;
				cumltVat    = 0;
				cumltFee    = 0;
//				������ ������ǥ �ʱ�ȭ
				mst_medi_cd = "";
				mst_occr_dt = "";
				mst_occr_seq = "";
				mst_slip_no = "";
				
				for(int i = 0; i < ds1.curlist.size(); i++) {
					long divTrstFee = 0;//���Ҽ�Ź��
					long divTrstFeeEx = 0;//���Ҽ�Ź��(vat����)
					long divTrstVat = 0;//���Ҽ�Ź��ΰ���					
					AD_PUB_3135_LCURLISTRecord rec = (AD_PUB_3135_LCURLISTRecord)ds1.curlist.get(i);
					
					if("Y".equals(rec.acct_trn_cnfm)){
						
						throw new AppException("ad_pub_3135_l", "�̹� ���� �� �ڷ��Դϴ�. [" + rec.chcode + "-" + rec.cuscode+ "-" + rec.blndcode+ "-" + rec.orgcode+ "-" + rec.frdate + "-" + rec.todate + "-" + rec.rcvgrp + "-" + rec.chgcode+ "-" + rec.dtlseq+ "]:["+ "-" + rec.medi_cd + "-" + rec.pubc_occr_dt + "-" + rec.pubc_occr_seq + "] " );
					}
					
					//�������̺�  INSERT
					String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
					if("550".equals(cmpy_cd)){
						dm2.setCmpy_cd("500");
					}else{
						dm2.setCmpy_cd(cmpy_cd);
					}
					
					dm2.setClos_dt(Util.checkString(req.getParameter("pubc_occr_dt")));
					dm2.setChcode           (rec.chcode           );  
					dm2.setCuscode          (rec.cuscode          );      
					dm2.setBlndcode         (rec.blndcode         );      
					dm2.setOrgcode          (rec.orgcode          );      
					dm2.setFrdate           (rec.frdate           );      
					dm2.setTodate           (rec.todate           );      
					dm2.setRcvgrp           (rec.rcvgrp           );      
					dm2.setChgcode          (rec.chgcode          );      
					dm2.setStdmonth         (rec.stdmonth         );      
					dm2.setDtlseq           (rec.dtlseq           );      
					dm2.setRcvamt           (rec.rcvamt           );      
					dm2.setVatcode          (rec.vatcode          );       
					dm2.setAgentcode        (rec.agentcode        );      
					dm2.setAgentfee         (rec.agentfee         );      
					dm2.setAgentcode2       (rec.agentcode2       );      
					dm2.setAgentfee2        (rec.agentfee2        );
					dm2.setSalecode         (rec.salecode         );      
					dm2.setSaleemp          (rec.saleemp          );      
					dm2.setDeptcode         (rec.deptcode         );      
					dm2.setDeptname         (rec.deptname         );      
					dm2.setZpcode           (rec.zpcode           );      
					dm2.setZpname           (rec.zpname           );
					dm2.setStdamt           (rec.stdamt           );
					dm2.setDivamt           (rec.divamt           );      
					dm2.setDivvatamt        (rec.divvatamt        );
					dm2.setAgentstdamt      (rec.agentstdamt      );
					dm2.setAgentdivamt      (rec.agentdivamt      );
					dm2.setAgentdivvatamt   (rec.agentdivvatamt   );
					dm2.setAgentstdamt2     (rec.agentstdamt2     );
					dm2.setAgentdivamt2     (rec.agentdivamt2     );
					dm2.setAgentdivvatamt2  (rec.agentdivvatamt2  );
					dm2.setPre_medi_cd      (rec.pre_medi_cd      );
					dm2.setPre_pubc_occr_dt (rec.pre_pubc_occr_dt );
					dm2.setPre_pubc_occr_seq(rec.pre_pubc_occr_seq);   
					dm2.setAcct_yn_1        (rec.acct_yn_1);
					dm2.setAgent_branch_yn  (rec.agent_branch_yn);
					dm2.setIncmg_pers_ip(req.getRemoteAddr());                            
					dm2.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
					
					dm2.setMedialeb_yn (medialebYn);//�̵� ���࿩��
					dm2.setXchngadvt_yn (xchngadvtYn);//�̵� ���࿩��
					dm2.setEvent_cd (eventCd);//�̵� ���࿩��
					dm2.setRslt_dept (rsltDept);//�����μ��ڵ�
					dm2.setTrst_rate(trstRate);//��Ź��������
					dm2.setTrst_fee     (trstFee);//��Ź������
					dm2.setTrst_vat     (trstVat);//��Ź������ �ΰ���
					long divamt = (long)rec.divamt;
					long divvatamt = (long)rec.divvatamt;

					//�Ѽ�Ź��� ���Ҽ�Ź�� ��
					//������ ���ڵ尡 �ϳ��ΰ�� SIZE() �� �׽�Ʈ
					System.out.println("I::"+i);
					System.out.println(ds1.curlist.size()-1);
					int chk_i = ds1.curlist.size()-1;
					System.out.println("chk_i::"+Integer.toString(chk_i));
					if(Integer.toString(chk_i).equals("0")){
						//��row�� 1���� ���� ������ ��Ź�����Ḧ ���Ҽ�Ź������� �ѱ�
						divTrstFeeEx = trstFee;
						divTrstVat = trstVat;
						divTrstFee = totTrstFee;	 					
						
						dm2.setMst_medi_cd  (mst_medi_cd );
						dm2.setMst_occr_dt  (mst_occr_dt );
						dm2.setMst_occr_seq (mst_occr_seq);
						dm2.setMst_slip_no  (mst_slip_no);	
						//misadv ���������̺� �Է¿���='y'(3130_a���ν��� �ȿ��� ����)
						dm2.setMst_yn("Y");						
					}else{
//						���Ҽ�Ź����
						divTrstFeeEx = (long)Math.round((divamt * trstRate)/100);
						divTrstVat = (long)Math.round((divvatamt * trstRate)/100);
						divTrstFee = divTrstFeeEx + divTrstVat;
						
						//���Ҽ�Ź�� ����
						cumltFeeEx  = cumltFeeEx  + divTrstFeeEx;
						cumltVat    = cumltVat    + divTrstVat;
						cumltFee    = cumltFee    + divTrstFee;		
						
						if(Integer.toString(i).equals(Integer.toString(chk_i))){//������row�϶�
//						if(i == ds1.curlist.size()-1){//������row�϶�
							//System.out.println("LAST ROW !!!!!!!!");
							//System.out.println("trstFee::"+Long.toString(trstFee));
							//System.out.println("cumltFeeEx::"+Long.toString(cumltFeeEx));
							diffFeeEx = trstFee-cumltFeeEx;
							divTrstFeeEx = divTrstFeeEx + diffFeeEx;
							//System.out.println("diffFeeEx::"+Long.toString(diffFeeEx));
							//System.out.println("divTrstFeeEx::"+Long.toString(divTrstFeeEx));
							diffVat = trstVat - cumltVat;
							divTrstVat = divTrstVat + diffVat;
	
							diffFee = totTrstFee - cumltFee;
							divTrstFee = divTrstFee + diffFee;
							
							dm2.setMst_medi_cd  (mst_medi_cd );
							dm2.setMst_occr_dt  (mst_occr_dt );
							dm2.setMst_occr_seq (mst_occr_seq);
							dm2.setMst_slip_no  (mst_slip_no);	
							//misadv ���������̺� �Է¿���='y'(3130_a���ν��� �ȿ��� ����)
							dm2.setMst_yn("Y");
						}else{
							dm2.setMst_medi_cd  ("" );
							dm2.setMst_occr_dt  ("" );
							dm2.setMst_occr_seq ("");
							dm2.setMst_slip_no  ("");							
							//misadv ���������̺� �Է¿���='n'(3130_a���ν��� �ȿ��� ����)
							dm2.setMst_yn("N");
						}
					}					
					dm2.setDiv_trst_fee_ex    (divTrstFeeEx);//���Ҽ�Ź��(vat����)
					dm2.setDiv_trst_vat    (divTrstVat);//���Ҽ�Ź��ΰ���
					dm2.setDiv_trst_fee    (divTrstFee);//���Ҽ�Ź��
					//misadv ���������̺� �Է¿���(3130_a���ν��� �ȿ��� ����)
					dm2.setDtl_yn("Y"); 
					
					dm2.print();
					
			       	cstmt2 = manager.m_conn.prepareCall(dm2.getSQL());
			       	// �Ķ���� ����
			       	dm2.setParams(cstmt2,dm2); 
			        // ����
			       	cstmt2.execute();
			       	
			       	ds2 = (AD_PUB_3130_ADataSet) dm2.createDataSetObject();
			       	ds2.getValues(cstmt2);
			       	
			       	cstmt2.close();
			       	if (!"".equals(ds2.errcode)) {
				            throw new AppException(ds2.errcode, ds2.errmsg);
			        }		       	
			       	System.out.println("AD_PUB_3130_A����Ϸ�");	
					//ù���� ��츸 �����ڵ� �����Ŵ
					if(i == 0 ){
						mst_medi_cd = ds2.medi_cd;
						mst_occr_dt = ds2.pubc_occr_dt;
						mst_occr_seq = ds2.pubc_occr_seq;
						mst_slip_no = ds2.pubc_slip_no;
					}
					//���⸶����,����� ���Ż���üũ  UPDATE	
			       	if ("".equals(ds2.errcode)) {
						dm3.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
						dm3.setClos_dt(Util.checkString(req.getParameter("pubc_occr_dt")));
						dm3.setChcode(rec.chcode);
						dm3.setChgcode(rec.chgcode);
						dm3.setCuscode(rec.cuscode);   
						dm3.setBlndcode(rec.blndcode);                                        
						dm3.setOrgcode(rec.orgcode);                                          
						dm3.setFrdate(rec.frdate);                                            
						dm3.setTodate(rec.todate);                                            
						dm3.setRcvgrp(rec.rcvgrp);                                            
						dm3.setChgcode(rec.chgcode);
						dm3.setDtlseq(rec.dtlseq); 
						dm3.setDtlrownum(rec.dtl_num); 
						dm3.setAcct_trn_cnfm(rec.acct_trn_cnfm); 
						dm3.setMedi_cd(ds2.medi_cd); 
						dm3.setPubc_occr_seq(ds2.pubc_occr_seq); 
						dm3.setPubc_occr_dt(ds2.pubc_occr_dt);    
						dm3.setPubc_slip_no(ds2.pubc_slip_no);
						dm3.setIncmg_pers_ip(req.getRemoteAddr());                            
						dm3.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
						
						dm3.setMedialeb_yn (medialebYn);//�̵� ���࿩��
						dm3.setXchngadvt_yn (xchngadvtYn);//�̵� ���࿩��
						dm3.setEvent_cd (eventCd);//�̵� ���࿩��
						dm3.setRslt_dept (rsltDept);//�����μ��ڵ�
						dm3.setTrst_rate(trstRate);//��Ź��������
						dm3.setTrst_fee     (trstFee);//��Ź������
						dm3.setDiv_trst_fee_ex    (divTrstFeeEx);//���Ҽ�Ź��(vat����)
						dm3.setDiv_trst_vat    (divTrstVat);//���Ҽ�Ź��ΰ���
						dm3.setDiv_trst_fee    (divTrstFee);//���Ҽ�Ź��
				
				       	dm3.print();
				       	
				       	cstmt3 = managerBis.m_conn.prepareCall(dm3.getSQL());
				       	// �Ķ���� ����
				       	dm3.setParams(cstmt3,dm3);
				        // ����
				       	cstmt3.execute();
				       	ds3 = (AD_PUB_3140_ADataSet) dm3.createDataSetObject();
				       	ds3.getValues(cstmt3);
				       	cstmt3.close();
				       	if (!"".equals(ds3.errcode)) {
					            throw new AppException(ds3.errcode, ds3.errmsg);
				        }	
						System.out.println("AD_PUB_3140_A����Ϸ�");
			       	}
				}
	     
				System.out.println("loop:"+row);	       	
		       	manager.commit();	
		       	managerBis.commit();
		    }
 	
		}
	    catch (AppException e) {
//	    	  if (managerBis != null)
//		          managerBis.rollback();
//		      if (manager != null)
//		          manager.rollback();
		      if (manager != null || managerBis != null){
		          manager.rollback();
		      	  managerBis.rollback();
		      }
             throw e;   
		}catch (SQLException e) {
			if (managerBis != null)
		          managerBis.rollback();	
		    if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (managerBis != null)
		          managerBis.rollback();		
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (managerBis != null)	    	
		    	managerBis.disConnection();
		    if (manager != null)	
		    	manager.disConnection();
	    }
	    req.setAttribute("ds", ds2);
		
	}	
	
 
	/**������� ���
	 * @param req
	 * @param pub
	 * @throws AppException
	 */
	public void ad_pub_3150_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
		DBManager manager        = null; //ERP
       	DBManager managerBis     = null; //BIS
       	CallableStatement cstmt1 = null;
       	CallableStatement cstmt2 = null;
       	CallableStatement cstmt3 = null;
       	
		AD_PUB_3135_LDataSet ds1 = null;
		AD_PUB_3135_LDM dm1 = new AD_PUB_3135_LDM();
		
		AD_PUB_3150_ADataSet ds2 = null;
		AD_PUB_3150_ADM dm2 = new AD_PUB_3150_ADM();

		AD_PUB_3160_ADataSet ds3 = null;
		AD_PUB_3160_ADM dm3 = new AD_PUB_3160_ADM();
		
		String cncl_clsf = Util.checkString(req.getParameter("cncl_clsf"));
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);  

    	String[]  chcode     =  Util.checkString((String)hash.get("chcode"  )).split("#" );  //ä���ڵ�    (���߰�) 	
    	String[]  cuscode    =  Util.checkString((String)hash.get("cuscode" )).split("#" );  //�ŷ�ó�ڵ�  
    	String[]  blndcode   =  Util.checkString((String)hash.get("blndcode")).split("#" );  //�귣���ڵ�  
    	String[]  orgcode    =  Util.checkString((String)hash.get("orgcode" )).split("#" );  //����ȹ�ȣ  
    	String[]  frdate     =  Util.checkString((String)hash.get("frdate"  )).split("#" );  //���������  
    	String[]  todate     =  Util.checkString((String)hash.get("todate"  )).split("#" );  //����������  
    	String[]  rcvgrp     =  Util.checkString((String)hash.get("rcvgrp"  )).split("#" );  //����׷��ڵ�
    	String[]  chgcode    =  Util.checkString((String)hash.get("chgcode" )).split("#" );  //�����ȣ 
    	
    	//System.out.println("�������cuscode:::::::::::::::::>>"+Util.checkString(req.getParameter("cuscode" )));
		
		try {
			//0.DB����
	    	manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	managerBis = new DBManager("MISTV");
	       	managerBis.getConnection();
	       	managerBis.m_conn.setAutoCommit(false);
	       	
	       	for( int row=0; row<chcode.length; row++){

			    // �������ȸ   	       		
	       		dm1.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       		dm1.setChcode(chcode[row])    ;   //ä���ڵ�    
	       		dm1.setCuscode(cuscode[row])  ;   //�ŷ�ó�ڵ�  
	       		dm1.setBlndcode(blndcode[row]);   //�귣���ڵ�  
	       		dm1.setOrgcode(orgcode[row])  ;   //����ȹ�ȣ  
	       		dm1.setFrdate(frdate[row])    ;   //���������  
	       		dm1.setTodate(todate[row])    ;   //����������  
	       		dm1.setRcvgrp(rcvgrp[row])    ;   //����׷��ڵ�
	       		dm1.setChgcode(chgcode[row])  ;   //�����ȣ   
	       		dm1.print();
	       		
				cstmt1 = managerBis.m_conn.prepareCall(dm1.getSQL());
		       	// �Ķ���� ����
		       	dm1.setParams(cstmt1,dm1);
		       	// ����
		       	cstmt1.execute();		       		

			    //System.out.println("AD_PUB_3135 ������");		       	
		        // ���
		       	ds1 = (AD_PUB_3135_LDataSet) dm1.createDataSetObject();
		       	ds1.getValues(cstmt1);
		       	cstmt1.close();
		       	if (!"".equals(ds1.errcode)) {
			            throw new AppException(ds1.errcode, ds1.errmsg);
		        }
	 
		       	if (ds1.curlist.size()==0) {
		            throw new AppException("ad_pub_3135_l", "��������� �ڷᰡ �������� �ʽ��ϴ�.");
	            }
			    //System.out.println("AD_PUB_3135 �Ϸ�");	
		       	
		       	//20180412 ������Ű����� �������Ű����� Ȯ���ʿ�
		       	int pubc_cnt = 0;
		       	int bis_cnt = ds1.curlist.size();
		       	String recv_clsf = "";//1=�������,2=��������
		       	
		       	for(int i = 0; i < ds1.curlist.size(); i++) {
		       		AD_PUB_3135_LCURLISTRecord rec = (AD_PUB_3135_LCURLISTRecord)ds1.curlist.get(i);
		       		if(!"".equals(rec.pubc_occr_seq) ){
		       			pubc_cnt = pubc_cnt+1;
		       		}
		       	}
		       	//��ü ������� ���� ����� ������ ���� ����,������ �������
		       	if(bis_cnt == pubc_cnt) {
		       		recv_clsf = "1";
		       	}else {
		       		recv_clsf = "2";
		       	}
		       	//�����������(cncl_clsf == 2)�� ���, ��������̸� exception,���� �����̸� �״�� ����
		       	if("2".equals(cncl_clsf)) {
		       		if("1".equals(recv_clsf)){
		       			throw new AppException("ad_pub_3135_l", "������ŵ� ������ ��������� �� �����ϴ�.������ҹ�ư�� ����ϼ���");
		       		}
		       	}else {//����������Ұ� �ƴ� ���(����������),���� �����̸� exception,��������̸� �״�� ����
		       		if("2".equals(recv_clsf)){
		       			throw new AppException("ad_pub_3135_l", "�������ŵ� ������ ��������� �� �����ϴ�.������ҹ�ư�� ����ϼ���");
		       		}		       		
		       	}
		       	//�����Ͽ� ������ǥ��ȣ�� ���� �ȵ� ��� �Ʒ� for���� �ּ�ó���ؼ� ȭ�鿡�� ��������ϰ� �ּ������� 
		       	if(!"2".equals(cncl_clsf)){
		       		//tv���� �̵� ���ŵ����� ����
					for(int i = 0; i < ds1.curlist.size(); i++) {
						
						AD_PUB_3135_LCURLISTRecord rec = (AD_PUB_3135_LCURLISTRecord)ds1.curlist.get(i);
	 
						if("N".equals(rec.acct_trn_cnfm) ){
							throw new AppException("ad_pub_3135_l", "���ŵ� �ڷᰡ �ƴմϴ�. [" + rec.chcode + "-" + rec.cuscode+ "-" + rec.blndcode+ "-" + rec.orgcode+ "-" + rec.frdate + "-" + rec.todate + "-" + rec.rcvgrp + "-" + rec.chgcode+ "-" + rec.dtlseq+ "]:["+ "-" + rec.medi_cd + "-" + rec.pubc_occr_dt + "-" + rec.pubc_occr_seq + "] " );
						}
	 
						//�������̺�  DELETE
						String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
						if("550".equals(cmpy_cd)){
							dm3.setCmpy_cd("500");
						}else{
							dm3.setCmpy_cd(cmpy_cd);
						}						
						dm3.setChcode       (rec.chcode       );  
						dm3.setCuscode      (rec.cuscode      );      
						dm3.setBlndcode     (rec.blndcode     );      
						dm3.setOrgcode      (rec.orgcode      );      
						dm3.setFrdate       (rec.frdate       );      
						dm3.setTodate       (rec.todate       );      
						dm3.setRcvgrp       (rec.rcvgrp       );      
						dm3.setChgcode      (rec.chgcode      );      
						dm3.setDtlseq       (rec.dtlseq       );         
						dm3.setAcct_trn_cnfm(rec.acct_trn_cnfm);      
						dm3.setMedi_cd      (rec.medi_cd      );       
						dm3.setPubc_occr_dt (rec.pubc_occr_dt );      
						dm3.setPubc_occr_seq(rec.pubc_occr_seq);                                 
						dm3.setIncmg_pers_ip(req.getRemoteAddr());                            
						dm3.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
						//dm3.print();
						
				       	cstmt3 = manager.m_conn.prepareCall(dm3.getSQL());
				       	// �Ķ���� ����
				       	dm3.setParams(cstmt3,dm3);
				        // ����
				       	cstmt3.execute();
				       	
				       	ds3 = (AD_PUB_3160_ADataSet) dm3.createDataSetObject();
				       	ds3.getValues(cstmt3);
				       	
				       	cstmt3.close();
				       	if (!"".equals(ds3.errcode)) {
					            throw new AppException(ds3.errcode, ds3.errmsg);
				        }		       	
					    //System.out.println("AD_PUB_3160 �Ϸ�");	
					}//for
		       	}//if
				//���⸶����,����� ���Ż��� = "N"  UPDATE	
				dm2.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       		dm2.setChcode(chcode[row])    ;   //ä���ڵ�    
	       		dm2.setCuscode(cuscode[row])  ;   //�ŷ�ó�ڵ�  
	       		dm2.setBlndcode(blndcode[row]);   //�귣���ڵ�  
	       		dm2.setOrgcode(orgcode[row])  ;   //����ȹ�ȣ  
	       		dm2.setFrdate(frdate[row])    ;   //���������  
	       		dm2.setTodate(todate[row])    ;   //����������  
	       		dm2.setRcvgrp(rcvgrp[row])    ;   //����׷��ڵ�
	       		dm2.setChgcode(chgcode[row])  ;   //�����ȣ                              
				dm2.setIncmg_pers_ip(req.getRemoteAddr());                            
				dm2.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));		       	
		       	dm2.print();
		       	
		       	cstmt2 = managerBis.m_conn.prepareCall(dm2.getSQL());
		       	// �Ķ���� ����
		       	dm2.setParams(cstmt2,dm2);
		        // ����
		       	//System.out.println("AD_PUB_3150 ������");
		       	cstmt2.execute();
		       	ds2 = (AD_PUB_3150_ADataSet) dm2.createDataSetObject();
		       	ds2.getValues(cstmt2);
		       	cstmt2.close();
		       	if (!"".equals(ds2.errcode)) {
			            throw new AppException(ds2.errcode, ds2.errmsg);
		        }	
			   //System.out.println("AD_PUB_3150 �Ϸ�");
		       	
		       	
				//System.out.println("loop:"+row);
		       	manager.commit();	
		       	managerBis.commit();
		    }
		       	
		}
	    catch (AppException e) {
	    	  if (managerBis != null)
		          managerBis.rollback();
		      if (manager != null)
		          manager.rollback();	
             throw e;   
		}catch (SQLException e) {
			if (managerBis != null)
		          managerBis.rollback();	
		    if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (managerBis != null)
		          managerBis.rollback();		
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (managerBis != null)	    	
		    	managerBis.disConnection();
		    if (manager != null)	
		    	manager.disConnection();
	    }
	    
	    req.setAttribute("ds", ds2);
		
	}
	
}