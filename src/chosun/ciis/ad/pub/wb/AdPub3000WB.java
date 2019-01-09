/***************************************************************************************************
* 파일명 : AdPub3000WB.java
* 기능 : 광고매출분석
* 작성일자 : 2010.09.10
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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
	/** 매출수신마감 (I): TV광고매출자료 조회, 게재TB등록, 매출마스터&매출상세 수정, 매출수신 작업이력 등록
	 *  매출수신마감취소(D): 매출수신 작업이력 삭제, 매출마스터&매출상세 수정
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
       	
        //매출수신데이터가져옴_시작
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
			    	//0.DB연결
			    	manager = new DBManager("MISADV");
		           	manager.getConnection();
		           	manager.m_conn.setAutoCommit(false);
		           	
			       	managerBis = new DBManager("MISTV");
			       	managerBis.getConnection();
			       	managerBis.m_conn.setAutoCommit(false);

			    	//3.매출수신등록:작업테이블에 등록
					dm1.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
					dm1.setMode(Util.checkString(req.getParameter("mode")));
					dm1.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
					dm1.setIncmg_pers_ip(req.getRemoteAddr());     
					dm1.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
					dm1.print();
					
		           	cstmt1 = manager.m_conn.prepareCall(dm1.getSQL());
		           	// 파라미터 설정
		           	dm1.setParams(cstmt1,dm1);
			       	// 실행
			       	cstmt1.execute();	       	
		       	
			       	// 결과
			       	ds1 = (AD_PUB_3021_ADataSet) dm1.createDataSetObject();
			       	ds1.getValues(cstmt1);
			       	cstmt1.close();
			       	if (!"".equals(ds1.errcode)) {
				            throw new AppException(ds1.errcode, ds1.errmsg);
			        }  			       	

		  	        //1.TV광고매출자료 수신 대상자료  
					dm2.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
					dm2.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
					dm2.print();
					
			       	cstmt2 = managerBis.m_conn.prepareCall(dm2.getSQL());
			       	// 파라미터 설정
			       	dm2.setParams(cstmt2,dm2);
			        
			        // 실행
			       	cstmt2.execute();
			       	
			        // 결과
			       	ds2 = (AD_PUB_3022_LDataSet) dm2.createDataSetObject();
			       	ds2.getValues(cstmt2);
			       	cstmt2.close();
			       	if (!"".equals(ds2.errcode)) {
				            throw new AppException(ds2.errcode, ds2.errmsg);
			        }
		 
			       	if (ds2.curlist.size()==0) {
			            throw new AppException("ad_pub_3022_l", "수신할 자료가 존재하지 않습니다.");
		            }
			       	
					for(int i = 0; i < ds2.curlist.size(); i++) {
						//게재테이블에  INSERT
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
				       	// 파라미터 설정
				       	dm3.setParams(cstmt3,dm3);
				        // 실행
				       	cstmt3.execute();
				       	
				       	ds3 = (AD_PUB_3023_ADataSet) dm3.createDataSetObject();
				       	ds3.getValues(cstmt3);
				       	
				       	cstmt3.close();
				       	if (!"".equals(ds3.errcode)) {
					            throw new AppException(ds3.errcode, ds3.errmsg);
				        }		       	
						
						//매출마스터,매출상세 수신상태체크  UPDATE	
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
				       	// 파라미터 설정
				       	dm4.setParams(cstmt4,dm4);
				        // 실행
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
			    	//0.DB연결
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
			       	// 파라미터 설정
			       	dm1.setParams(cstmt1,dm1);
			        
			        // 실행
			       	cstmt1.execute();
			       	
			        // 결과
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
			       	// 파라미터 설정
			       	dm5.setParams(cstmt2,dm5);
			        
			        // 실행
			       	cstmt2.execute();
			       	
			        // 결과
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
	/**게재마감 
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
			//0.DB연결
	    	manager = new DBManager("MISADV");
           	manager.getConnection();
           	manager.m_conn.setAutoCommit(false);
           	
	       	managerBis = new DBManager("MISTV");
	       	managerBis.getConnection();
	       	managerBis.m_conn.setAutoCommit(false);
			
	       	//1.게재마감
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
           	// 파라미터 설정
           	dm1.setParams(cstmt1,dm1);
	       	// 실행
	       	cstmt1.execute();
	       	
	    	// 결과
	       	ds1 = (AD_PUB_3026_ADataSet) dm1.createDataSetObject();
	       	ds1.getValues(cstmt1);
	       	cstmt1.close();
	       	if (!"".equals(ds1.errcode)) {
		            throw new AppException(ds1.errcode, ds1.errmsg);
	        }  
	       	
	        //1.MISTV광고 게재마감 마감일자 등록
	       	dm2.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       	dm2.setClos_dt(Util.checkString(req.getParameter("clos_dt")));
	       	dm2.setIncmg_pers_ip(req.getRemoteAddr());   
			dm2.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
			dm2.print();
			
			cstmt2 = managerBis.m_conn.prepareCall(dm2.getSQL());
	       	// 파라미터 설정
	       	dm2.setParams(cstmt2,dm2);
	        
	        // 실행
	       	cstmt2.execute();
	       	
	        // 결과
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
	/**게재마감취소 
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
			//0.DB연결
	    	manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	managerBis = new DBManager("MISTV");
	       	managerBis.getConnection();
	       	managerBis.m_conn.setAutoCommit(false);
	       	
	       	//1.게재마감
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
	       	// 파라미터 설정
	       	dm1.setParams(cstmt1,dm1);
	       	// 실행
	       	cstmt1.execute();	       	
	   	
	       	// 결과
	       	ds1 = (AD_PUB_3027_ADataSet) dm1.createDataSetObject();
	       	ds1.getValues(cstmt1);
	       	cstmt1.close();
	       	if (!"".equals(ds1.errcode)) {
		            throw new AppException(ds1.errcode, ds1.errmsg);
	        } 
	       	
	        //1.MISTV광고 게재마감 최종마감일자 등록
	       	dm2.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       	dm2.setClos_dt(ds1.getMax_clos_dt()); //최종마감일자
	       	dm2.setIncmg_pers_ip(req.getRemoteAddr());   
			dm2.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
			dm2.print();
	       	
			cstmt2 = managerBis.m_conn.prepareCall(dm2.getSQL());
	       	// 파라미터 설정
	       	dm2.setParams(cstmt2,dm2);
	        
	        // 실행
	       	cstmt2.execute();
	       	
	        // 결과
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
	
	//연도별 그룹사 매출내역조회
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
	
	//연도별 금융 그룹사 매출내역조회
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
    
	
	//연도별 관심기업 매출내역조회
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
	 /**매출수신 
	 * @param req
	 * @param pub
	 * @throws AppException
	 */
	 /*SP_AD_PUB_3110_L,SP_AD_PUB_3120_L,SP_AD_PUB_3135_L프로시져는 JDBC DRIVER classes12.jar를 ojdbc14.jar로 업그레이드하여 사용가능하면 BIS에 위치시키고 아니면 MISADV에 위치시킨다.*/ 
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
    	

    	String[]  chcode     =  Util.checkString((String)hash.get("chcode"  )).split("#" );  //채널코드    (다중값) 	
    	String[]  cuscode    =  Util.checkString((String)hash.get("cuscode" )).split("#" );  //거래처코드  
    	String[]  blndcode   =  Util.checkString((String)hash.get("blndcode")).split("#" );  //브랜드코드  
    	String[]  orgcode    =  Util.checkString((String)hash.get("orgcode" )).split("#" );  //운행안번호  
    	String[]  frdate     =  Util.checkString((String)hash.get("frdate"  )).split("#" );  //광고시작일  
    	String[]  todate     =  Util.checkString((String)hash.get("todate"  )).split("#" );  //광고종료일  
    	String[]  rcvgrp     =  Util.checkString((String)hash.get("rcvgrp"  )).split("#" );  //매출그룹코드
    	String[]  chgcode    =  Util.checkString((String)hash.get("chgcode" )).split("#" );  //변경번호 
    	//미디어렙 발행여부,수탁료,수탁료율은 여기서
    	String[]  medialeb_yn =  Util.checkString((String)hash.get("medialeb_yn" )).split("#" );  //미디어렙 발행여부 
    	String[]  xchngadvt_yn =  Util.checkString((String)hash.get("xchngadvt_yn" )).split("#" );  //교환광고여부
    	String[]  event_cd =  Util.checkString((String)hash.get("event_cd" )).split("#" );  //행사코드
    	String[]  trst_rate   =  Util.checkString((String)hash.get("trst_rate" )).split("#" );  //수탁요율
    	String[]  trst_fee    =  Util.checkString((String)hash.get("trst_fee" )).split("#" );  //수탁료
    	String[]  trst_vat    =  Util.checkString((String)hash.get("trst_vat" )).split("#" );  //수탁료부가세
    	String[]  rslt_dept   =  Util.checkString((String)hash.get("rslt_dept" )).split("#" );  //실적부서

		//System.out.println("수신cuscode:::::::::::::::::>>"+Util.checkString(req.getParameter("cuscode" )));
		
		try {
			//0.DB연결
	    	manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	managerBis = new DBManager("MISTV");
	       	managerBis.getConnection();
	       	managerBis.m_conn.setAutoCommit(false);
       	
	       	for( int row=0; row<chcode.length; row++){
	       		
	       		dm1.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       		dm1.setChcode(chcode[row])    ;   //채널코드    
	       		dm1.setCuscode(cuscode[row])  ;   //거래처코드  
	       		dm1.setBlndcode(blndcode[row]);   //브랜드코드  
	       		dm1.setOrgcode(orgcode[row])  ;   //운행안번호  
	       		dm1.setFrdate(frdate[row])    ;   //광고시작일  
	       		dm1.setTodate(todate[row])    ;   //광고종료일  
	       		dm1.setRcvgrp(rcvgrp[row])    ;   //매출그룹코드
	       		dm1.setChgcode(chgcode[row])  ;   //변경번호   
	       		dm1.print();
	       		
				cstmt1 = managerBis.m_conn.prepareCall(dm1.getSQL());
		       	// 파라미터 설정
		       	dm1.setParams(cstmt1,dm1);
		       	// 실행
		       	cstmt1.execute();		       		

		        // 결과
		       	ds1 = (AD_PUB_3135_LDataSet) dm1.createDataSetObject();
		       	ds1.getValues(cstmt1);
		       	cstmt1.close();
		       	if (!"".equals(ds1.errcode)) {
			            throw new AppException(ds1.errcode, ds1.errmsg);
		        }
		    	System.out.println("AD_PUB_3135_L실행완료");		 
		       	if (ds1.curlist.size()==0) {
		            throw new AppException("ad_pub_3135_l", "수신할 자료가 존재하지 않습니다.");
	            }
		    	//숫자형으로 변환및 변수 선언
		       	int trstRate = Integer.parseInt(trst_rate[row]);//숫자형 수탁료율
		       	long trstFee = Long.parseLong(trst_fee[row]);//숫자형 수탁료
		       	long trstVat = Long.parseLong(trst_vat[row]);//숫자형 수탁료부가세
		       	long totTrstFee = trstFee + trstVat;
//		       	long totTrstFee = (long)Math.round(Long.parseLong(trst_fee[row]) * 1.1);//수탁료+부가세
		       	//long trstVat    = totTrstFee - trstFee;
		       	long cumltFeeEx = 0;//누적수탁료
		       	long cumltVat = 0;//누적수탁료
		       	long cumltFee = 0;//누적수탁료
		       	long diffFeeEx = 0;//차액
		       	long diffVat = 0;//차액
		       	long diffFee = 0;//차액
		       	
		       	String medialebYn = medialeb_yn[row];//미디어렙 발행여부
		       	String xchngadvtYn = xchngadvt_yn[row];//교환광고여부
		       	//널값 미인식으로 에러나서 우회하게 만듬
		       	String eventCd2 = event_cd[row];//이벤트코드
		       	String eventCd  = "";
		       	String rsltDept2 = rslt_dept[row];//실적부서
		       	String rsltDept = "";
		       	if("N".equals(eventCd2)){
		       		eventCd = "";//교환광고여부
		       	}else{
		       		eventCd = event_cd[row];//이벤트코드
		       	}
		       	if("N".equals(rsltDept2)){
		       		rsltDept = "";
		       	}else{
		       		rsltDept = rslt_dept[row];//실적부서
		       	}
		       	//bis마스터 게재전표와 미디어렙 게재전표 같게 표시함
		       	String mst_medi_cd = "";
		       	String mst_occr_dt = "";
		       	String mst_occr_seq = "";
		       	String mst_slip_no = "";
//				분할수탁료 누적 초기화
				cumltFeeEx  = 0;
				cumltVat    = 0;
				cumltFee    = 0;
//				마스터 게재전표 초기화
				mst_medi_cd = "";
				mst_occr_dt = "";
				mst_occr_seq = "";
				mst_slip_no = "";
				
				for(int i = 0; i < ds1.curlist.size(); i++) {
					long divTrstFee = 0;//분할수탁료
					long divTrstFeeEx = 0;//분할수탁료(vat제외)
					long divTrstVat = 0;//분할수탁료부가세					
					AD_PUB_3135_LCURLISTRecord rec = (AD_PUB_3135_LCURLISTRecord)ds1.curlist.get(i);
					
					if("Y".equals(rec.acct_trn_cnfm)){
						
						throw new AppException("ad_pub_3135_l", "이미 수신 된 자료입니다. [" + rec.chcode + "-" + rec.cuscode+ "-" + rec.blndcode+ "-" + rec.orgcode+ "-" + rec.frdate + "-" + rec.todate + "-" + rec.rcvgrp + "-" + rec.chgcode+ "-" + rec.dtlseq+ "]:["+ "-" + rec.medi_cd + "-" + rec.pubc_occr_dt + "-" + rec.pubc_occr_seq + "] " );
					}
					
					//게재테이블에  INSERT
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
					
					dm2.setMedialeb_yn (medialebYn);//미디어렙 발행여부
					dm2.setXchngadvt_yn (xchngadvtYn);//미디어렙 발행여부
					dm2.setEvent_cd (eventCd);//미디어렙 발행여부
					dm2.setRslt_dept (rsltDept);//실적부서코드
					dm2.setTrst_rate(trstRate);//수탁수수료율
					dm2.setTrst_fee     (trstFee);//수탁수수료
					dm2.setTrst_vat     (trstVat);//수탁수수료 부가세
					long divamt = (long)rec.divamt;
					long divvatamt = (long)rec.divvatamt;

					//총수탁료와 분할수탁료 비교
					//디테일 레코드가 하나인경우 SIZE() 값 테스트
					System.out.println("I::"+i);
					System.out.println(ds1.curlist.size()-1);
					int chk_i = ds1.curlist.size()-1;
					System.out.println("chk_i::"+Integer.toString(chk_i));
					if(Integer.toString(chk_i).equals("0")){
						//상세row가 1건인 경우는 마스터 수탁수수료를 분할수탁수수료로 넘김
						divTrstFeeEx = trstFee;
						divTrstVat = trstVat;
						divTrstFee = totTrstFee;	 					
						
						dm2.setMst_medi_cd  (mst_medi_cd );
						dm2.setMst_occr_dt  (mst_occr_dt );
						dm2.setMst_occr_seq (mst_occr_seq);
						dm2.setMst_slip_no  (mst_slip_no);	
						//misadv 마스터테이블 입력여부='y'(3130_a프로시져 안에서 돌림)
						dm2.setMst_yn("Y");						
					}else{
//						분할수탁료계산
						divTrstFeeEx = (long)Math.round((divamt * trstRate)/100);
						divTrstVat = (long)Math.round((divvatamt * trstRate)/100);
						divTrstFee = divTrstFeeEx + divTrstVat;
						
						//분할수탁료 누적
						cumltFeeEx  = cumltFeeEx  + divTrstFeeEx;
						cumltVat    = cumltVat    + divTrstVat;
						cumltFee    = cumltFee    + divTrstFee;		
						
						if(Integer.toString(i).equals(Integer.toString(chk_i))){//마지막row일때
//						if(i == ds1.curlist.size()-1){//마지막row일때
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
							//misadv 마스터테이블 입력여부='y'(3130_a프로시져 안에서 돌림)
							dm2.setMst_yn("Y");
						}else{
							dm2.setMst_medi_cd  ("" );
							dm2.setMst_occr_dt  ("" );
							dm2.setMst_occr_seq ("");
							dm2.setMst_slip_no  ("");							
							//misadv 마스터테이블 입력여부='n'(3130_a프로시져 안에서 돌림)
							dm2.setMst_yn("N");
						}
					}					
					dm2.setDiv_trst_fee_ex    (divTrstFeeEx);//분할수탁료(vat제외)
					dm2.setDiv_trst_vat    (divTrstVat);//분할수탁료부가세
					dm2.setDiv_trst_fee    (divTrstFee);//분할수탁료
					//misadv 디테일테이블 입력여부(3130_a프로시져 안에서 돌림)
					dm2.setDtl_yn("Y"); 
					
					dm2.print();
					
			       	cstmt2 = manager.m_conn.prepareCall(dm2.getSQL());
			       	// 파라미터 설정
			       	dm2.setParams(cstmt2,dm2); 
			        // 실행
			       	cstmt2.execute();
			       	
			       	ds2 = (AD_PUB_3130_ADataSet) dm2.createDataSetObject();
			       	ds2.getValues(cstmt2);
			       	
			       	cstmt2.close();
			       	if (!"".equals(ds2.errcode)) {
				            throw new AppException(ds2.errcode, ds2.errmsg);
			        }		       	
			       	System.out.println("AD_PUB_3130_A실행완료");	
					//첫행인 경우만 게재코드 동기시킴
					if(i == 0 ){
						mst_medi_cd = ds2.medi_cd;
						mst_occr_dt = ds2.pubc_occr_dt;
						mst_occr_seq = ds2.pubc_occr_seq;
						mst_slip_no = ds2.pubc_slip_no;
					}
					//매출마스터,매출상세 수신상태체크  UPDATE	
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
						
						dm3.setMedialeb_yn (medialebYn);//미디어렙 발행여부
						dm3.setXchngadvt_yn (xchngadvtYn);//미디어렙 발행여부
						dm3.setEvent_cd (eventCd);//미디어렙 발행여부
						dm3.setRslt_dept (rsltDept);//실적부서코드
						dm3.setTrst_rate(trstRate);//수탁수수료율
						dm3.setTrst_fee     (trstFee);//수탁수수료
						dm3.setDiv_trst_fee_ex    (divTrstFeeEx);//분할수탁료(vat제외)
						dm3.setDiv_trst_vat    (divTrstVat);//분할수탁료부가세
						dm3.setDiv_trst_fee    (divTrstFee);//분할수탁료
				
				       	dm3.print();
				       	
				       	cstmt3 = managerBis.m_conn.prepareCall(dm3.getSQL());
				       	// 파라미터 설정
				       	dm3.setParams(cstmt3,dm3);
				        // 실행
				       	cstmt3.execute();
				       	ds3 = (AD_PUB_3140_ADataSet) dm3.createDataSetObject();
				       	ds3.getValues(cstmt3);
				       	cstmt3.close();
				       	if (!"".equals(ds3.errcode)) {
					            throw new AppException(ds3.errcode, ds3.errmsg);
				        }	
						System.out.println("AD_PUB_3140_A실행완료");
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
	
 
	/**매출수신 취소
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

    	String[]  chcode     =  Util.checkString((String)hash.get("chcode"  )).split("#" );  //채널코드    (다중값) 	
    	String[]  cuscode    =  Util.checkString((String)hash.get("cuscode" )).split("#" );  //거래처코드  
    	String[]  blndcode   =  Util.checkString((String)hash.get("blndcode")).split("#" );  //브랜드코드  
    	String[]  orgcode    =  Util.checkString((String)hash.get("orgcode" )).split("#" );  //운행안번호  
    	String[]  frdate     =  Util.checkString((String)hash.get("frdate"  )).split("#" );  //광고시작일  
    	String[]  todate     =  Util.checkString((String)hash.get("todate"  )).split("#" );  //광고종료일  
    	String[]  rcvgrp     =  Util.checkString((String)hash.get("rcvgrp"  )).split("#" );  //매출그룹코드
    	String[]  chgcode    =  Util.checkString((String)hash.get("chgcode" )).split("#" );  //변경번호 
    	
    	//System.out.println("수신취소cuscode:::::::::::::::::>>"+Util.checkString(req.getParameter("cuscode" )));
		
		try {
			//0.DB연결
	    	manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);
	       	
	       	managerBis = new DBManager("MISTV");
	       	managerBis.getConnection();
	       	managerBis.m_conn.setAutoCommit(false);
	       	
	       	for( int row=0; row<chcode.length; row++){

			    // 매출상세조회   	       		
	       		dm1.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       		dm1.setChcode(chcode[row])    ;   //채널코드    
	       		dm1.setCuscode(cuscode[row])  ;   //거래처코드  
	       		dm1.setBlndcode(blndcode[row]);   //브랜드코드  
	       		dm1.setOrgcode(orgcode[row])  ;   //운행안번호  
	       		dm1.setFrdate(frdate[row])    ;   //광고시작일  
	       		dm1.setTodate(todate[row])    ;   //광고종료일  
	       		dm1.setRcvgrp(rcvgrp[row])    ;   //매출그룹코드
	       		dm1.setChgcode(chgcode[row])  ;   //변경번호   
	       		dm1.print();
	       		
				cstmt1 = managerBis.m_conn.prepareCall(dm1.getSQL());
		       	// 파라미터 설정
		       	dm1.setParams(cstmt1,dm1);
		       	// 실행
		       	cstmt1.execute();		       		

			    //System.out.println("AD_PUB_3135 실행전");		       	
		        // 결과
		       	ds1 = (AD_PUB_3135_LDataSet) dm1.createDataSetObject();
		       	ds1.getValues(cstmt1);
		       	cstmt1.close();
		       	if (!"".equals(ds1.errcode)) {
			            throw new AppException(ds1.errcode, ds1.errmsg);
		        }
	 
		       	if (ds1.curlist.size()==0) {
		            throw new AppException("ad_pub_3135_l", "수신취소할 자료가 존재하지 않습니다.");
	            }
			    //System.out.println("AD_PUB_3135 완료");	
		       	
		       	//20180412 정상수신건인지 오류수신건인지 확인필요
		       	int pubc_cnt = 0;
		       	int bis_cnt = ds1.curlist.size();
		       	String recv_clsf = "";//1=정상수신,2=오류수신
		       	
		       	for(int i = 0; i < ds1.curlist.size(); i++) {
		       		AD_PUB_3135_LCURLISTRecord rec = (AD_PUB_3135_LCURLISTRecord)ds1.curlist.get(i);
		       		if(!"".equals(rec.pubc_occr_seq) ){
		       			pubc_cnt = pubc_cnt+1;
		       		}
		       	}
		       	//전체 사이즈보다 게재 사이즈가 작으면 오류 수신,같으면 정상수신
		       	if(bis_cnt == pubc_cnt) {
		       		recv_clsf = "1";
		       	}else {
		       		recv_clsf = "2";
		       	}
		       	//오류수신취소(cncl_clsf == 2)일 경우, 정상수신이면 exception,오류 수신이면 그대로 진행
		       	if("2".equals(cncl_clsf)) {
		       		if("1".equals(recv_clsf)){
		       			throw new AppException("ad_pub_3135_l", "정상수신된 매출은 오류취소할 수 없습니다.수신취소버튼을 사용하세요");
		       		}
		       	}else {//오류수신취소가 아닌 경우(매출수신취소),오류 수신이면 exception,정상수신이면 그대로 진행
		       		if("2".equals(recv_clsf)){
		       			throw new AppException("ad_pub_3135_l", "오류수신된 매출은 수신취소할 수 없습니다.오류취소버튼을 사용하세요");
		       		}		       		
		       	}
		       	//디테일에 게재전표번호가 생성 안된 경우 아래 for문을 주석처리해서 화면에서 수신취소하고 주석제거함 
		       	if(!"2".equals(cncl_clsf)){
		       		//tv조선 미디어렙 수신데이터 삭제
					for(int i = 0; i < ds1.curlist.size(); i++) {
						
						AD_PUB_3135_LCURLISTRecord rec = (AD_PUB_3135_LCURLISTRecord)ds1.curlist.get(i);
	 
						if("N".equals(rec.acct_trn_cnfm) ){
							throw new AppException("ad_pub_3135_l", "수신된 자료가 아닙니다. [" + rec.chcode + "-" + rec.cuscode+ "-" + rec.blndcode+ "-" + rec.orgcode+ "-" + rec.frdate + "-" + rec.todate + "-" + rec.rcvgrp + "-" + rec.chgcode+ "-" + rec.dtlseq+ "]:["+ "-" + rec.medi_cd + "-" + rec.pubc_occr_dt + "-" + rec.pubc_occr_seq + "] " );
						}
	 
						//게재테이블에  DELETE
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
				       	// 파라미터 설정
				       	dm3.setParams(cstmt3,dm3);
				        // 실행
				       	cstmt3.execute();
				       	
				       	ds3 = (AD_PUB_3160_ADataSet) dm3.createDataSetObject();
				       	ds3.getValues(cstmt3);
				       	
				       	cstmt3.close();
				       	if (!"".equals(ds3.errcode)) {
					            throw new AppException(ds3.errcode, ds3.errmsg);
				        }		       	
					    //System.out.println("AD_PUB_3160 완료");	
					}//for
		       	}//if
				//매출마스터,매출상세 수신상태 = "N"  UPDATE	
				dm2.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
	       		dm2.setChcode(chcode[row])    ;   //채널코드    
	       		dm2.setCuscode(cuscode[row])  ;   //거래처코드  
	       		dm2.setBlndcode(blndcode[row]);   //브랜드코드  
	       		dm2.setOrgcode(orgcode[row])  ;   //운행안번호  
	       		dm2.setFrdate(frdate[row])    ;   //광고시작일  
	       		dm2.setTodate(todate[row])    ;   //광고종료일  
	       		dm2.setRcvgrp(rcvgrp[row])    ;   //매출그룹코드
	       		dm2.setChgcode(chgcode[row])  ;   //변경번호                              
				dm2.setIncmg_pers_ip(req.getRemoteAddr());                            
				dm2.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));		       	
		       	dm2.print();
		       	
		       	cstmt2 = managerBis.m_conn.prepareCall(dm2.getSQL());
		       	// 파라미터 설정
		       	dm2.setParams(cstmt2,dm2);
		        // 실행
		       	//System.out.println("AD_PUB_3150 실행전");
		       	cstmt2.execute();
		       	ds2 = (AD_PUB_3150_ADataSet) dm2.createDataSetObject();
		       	ds2.getValues(cstmt2);
		       	cstmt2.close();
		       	if (!"".equals(ds2.errcode)) {
			            throw new AppException(ds2.errcode, ds2.errmsg);
		        }	
			   //System.out.println("AD_PUB_3150 완료");
		       	
		       	
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