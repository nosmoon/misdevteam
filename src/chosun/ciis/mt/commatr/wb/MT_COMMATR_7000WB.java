/***************************************************************************************************
* 파일명 : MT_REPORT_76000WB.java
* 기능 :  자재 - 장표 - 장표환경설정 
 * 작성일자 : 2012.06.20
 * 작성자 :   김성미
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.commatr.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.commatr.dao.MT_COMMATR_7000DAO;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.etccar.dm.MT_ETCCAR_9202_ADM;
import chosun.ciis.mt.etccar.ds.MT_ETCCAR_9202_ADataSet;

/**
 * 
 */

public class MT_COMMATR_7000WB extends BaseWB{

    /**
     * 담당자 구분과 담당부서코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_commatr_7000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        MT_COMMATR_7000_MDataSet ds = null;

        // DM Setting
        MT_COMMATR_7000_MDM dm = new MT_COMMATR_7000_MDM();
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);//Util.checkString(req.getParameter("team_cd"));
        String u_id = Util.getSessionParameterValue(req, "uid", true);
        String dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.setCmpy_cd(cmpy_cd);
        dm.setU_id(u_id);
        dm.setDept_cd(dept_cd);
        //dm.print();
        
        try { 
        	MT_COMMATR_7000DAO dao = new MT_COMMATR_7000DAO();
            ds = dao.mt_commatr_7000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
    public void mt_commatr_7010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_7010_LDataSet ds = null;
		MT_COMMATR_7010_LDM dm = new MT_COMMATR_7010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.list_gbn = Util.checkString(req.getParameter("list_gbn"));
		dm.gs_gbn = Util.checkString(req.getParameter("gs_gbn"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		try {
        	MT_COMMATR_7000DAO dao = new MT_COMMATR_7000DAO();
        	ds = dao.mt_commatr_7010_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_no = (String)hash.get("dept_no");
		dm.search_dt_fr = (String)hash.get("search_dt_fr");
		dm.search_dt_to = (String)hash.get("search_dt_to");
		dm.dlco_clsf = (String)hash.get("dlco_clsf");
		dm.patr_chrg_pers = (String)hash.get("patr_chrg_pers");
		dm.chrg_pers = (String)hash.get("chrg_pers");
		dm.search_wd = (String)hash.get("search_wd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_no = Util.getSessionParameterValue(req,"dept_no",true);
		dm.search_dt_fr = Util.getSessionParameterValue(req,"search_dt_fr",true);
		dm.search_dt_to = Util.getSessionParameterValue(req,"search_dt_to",true);
		dm.dlco_clsf = Util.getSessionParameterValue(req,"dlco_clsf",true);
		dm.patr_chrg_pers = Util.getSessionParameterValue(req,"patr_chrg_pers",true);
		dm.chrg_pers = Util.getSessionParameterValue(req,"chrg_pers",true);
		dm.search_wd = Util.getSessionParameterValue(req,"search_wd",true);
		*******************************************************************************************/
	}
    
    public void mt_commatr_7110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_7110_LDataSet ds = null;
		MT_COMMATR_7110_LDM dm = new MT_COMMATR_7110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.list_gbn = Util.checkString(req.getParameter("list_gbn"));
		dm.gbn_data = Util.checkString(req.getParameter("gbn_data"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.gs_gbn = Util.checkString(req.getParameter("gs_gbn"));
		dm.submatr_gbn = Util.checkString(req.getParameter("submatr_gbn"));
		dm.print();

		try {
			MT_COMMATR_7000DAO dao = new MT_COMMATR_7000DAO();
        	ds = dao.mt_commatr_7110_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		

	
	}
    
    public void mt_commatr_7210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_7210_LDataSet ds = null;
		MT_COMMATR_7210_LDM dm = new MT_COMMATR_7210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.print();
 
		try {
        	MT_COMMATR_7000DAO dao = new MT_COMMATR_7000DAO();
        	ds = dao.mt_commatr_7210_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_no = (String)hash.get("dept_no");
		dm.search_dt_fr = (String)hash.get("search_dt_fr");
		dm.search_dt_to = (String)hash.get("search_dt_to");
		dm.dlco_clsf = (String)hash.get("dlco_clsf");
		dm.patr_chrg_pers = (String)hash.get("patr_chrg_pers");
		dm.chrg_pers = (String)hash.get("chrg_pers");
		dm.search_wd = (String)hash.get("search_wd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_no = Util.getSessionParameterValue(req,"dept_no",true);
		dm.search_dt_fr = Util.getSessionParameterValue(req,"search_dt_fr",true);
		dm.search_dt_to = Util.getSessionParameterValue(req,"search_dt_to",true);
		dm.dlco_clsf = Util.getSessionParameterValue(req,"dlco_clsf",true);
		dm.patr_chrg_pers = Util.getSessionParameterValue(req,"patr_chrg_pers",true);
		dm.chrg_pers = Util.getSessionParameterValue(req,"chrg_pers",true);
		dm.search_wd = Util.getSessionParameterValue(req,"search_wd",true);
		*******************************************************************************************/
	}
    
    public void mt_commatr_7310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_7310_LDataSet ds = null;
		MT_COMMATR_7310_LDM dm = new MT_COMMATR_7310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.search_flag = Util.checkString(req.getParameter("search_flag"));
		
		dm.print();

		try {
        	MT_COMMATR_7000DAO dao = new MT_COMMATR_7000DAO();
        	ds = dao.mt_commatr_7310_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_no = (String)hash.get("dept_no");
		dm.search_dt_fr = (String)hash.get("search_dt_fr");
		dm.search_dt_to = (String)hash.get("search_dt_to");
		dm.dlco_clsf = (String)hash.get("dlco_clsf");
		dm.patr_chrg_pers = (String)hash.get("patr_chrg_pers");
		dm.chrg_pers = (String)hash.get("chrg_pers");
		dm.search_wd = (String)hash.get("search_wd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_no = Util.getSessionParameterValue(req,"dept_no",true);
		dm.search_dt_fr = Util.getSessionParameterValue(req,"search_dt_fr",true);
		dm.search_dt_to = Util.getSessionParameterValue(req,"search_dt_to",true);
		dm.dlco_clsf = Util.getSessionParameterValue(req,"dlco_clsf",true);
		dm.patr_chrg_pers = Util.getSessionParameterValue(req,"patr_chrg_pers",true);
		dm.chrg_pers = Util.getSessionParameterValue(req,"chrg_pers",true);
		dm.search_wd = Util.getSessionParameterValue(req,"search_wd",true);
		*******************************************************************************************/
	}
    public void mt_commatr_7320_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_7320_ADataSet ds = null;
		MT_COMMATR_7320_ADM dm = new MT_COMMATR_7320_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	        
		dm.issu_dt = Util.checkString((String)hash.get("issu_dt"));
		dm.pubc_amt = Util.checkString((String)hash.get("pubc_amt"));
		dm.uprc = Util.checkString((String)hash.get("uprc"));
		/*
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		String pubc_dt   	  = converted[1];	
		String pubc_amt   	  = converted[9];	
        String uprc   = converted[17];*/
           
       
        /*dm.setCmpy_cd(cmpy_cd);
		dm.setIssu_dt(pubc_dt);
		dm.setPubc_amt(pubc_amt);
		dm.setUprc(uprc);*/
		dm.setCmpy_cd(cmpy_cd);
		
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_COMMATR_7320_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
 
    public void mt_commatr_7330_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_7330_ADataSet ds = null;
		MT_COMMATR_7330_ADM dm = new MT_COMMATR_7330_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData1"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.gubun       = ((String)hash.get("m")).toUpperCase();    
		dm.issu_dt = Util.checkString((String)hash.get("issu_dt"));
		dm.pubc_amt = Util.checkString((String)hash.get("pubc_amt"));
		
		dm.setCmpy_cd(cmpy_cd);
		
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_COMMATR_7330_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_commatr_7410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_7410_LDataSet ds = null;
		MT_COMMATR_7410_LDM dm = new MT_COMMATR_7410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		
		dm.print();

		try {
        	MT_COMMATR_7000DAO dao = new MT_COMMATR_7000DAO();
        	ds = dao.mt_commatr_7410_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_no = (String)hash.get("dept_no");
		dm.search_dt_fr = (String)hash.get("search_dt_fr");
		dm.search_dt_to = (String)hash.get("search_dt_to");
		dm.dlco_clsf = (String)hash.get("dlco_clsf");
		dm.patr_chrg_pers = (String)hash.get("patr_chrg_pers");
		dm.chrg_pers = (String)hash.get("chrg_pers");
		dm.search_wd = (String)hash.get("search_wd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_no = Util.getSessionParameterValue(req,"dept_no",true);
		dm.search_dt_fr = Util.getSessionParameterValue(req,"search_dt_fr",true);
		dm.search_dt_to = Util.getSessionParameterValue(req,"search_dt_to",true);
		dm.dlco_clsf = Util.getSessionParameterValue(req,"dlco_clsf",true);
		dm.patr_chrg_pers = Util.getSessionParameterValue(req,"patr_chrg_pers",true);
		dm.chrg_pers = Util.getSessionParameterValue(req,"chrg_pers",true);
		dm.search_wd = Util.getSessionParameterValue(req,"search_wd",true);
		*******************************************************************************************/
	}
    

    public void mt_commatr_7510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_7510_LDataSet ds = null;
		MT_COMMATR_7510_LDM dm = new MT_COMMATR_7510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		
		dm.print();

		try {
        	MT_COMMATR_7000DAO dao = new MT_COMMATR_7000DAO();
        	ds = dao.mt_commatr_7510_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		
	}
    
    public void mt_commatr_7520_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_7520_ADataSet ds = null;
		MT_COMMATR_7520_ADM dm = new MT_COMMATR_7520_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	        
		dm.yymm =  Util.checkString(req.getParameter("yymm"));
		dm.jejisa = Util.checkString((String)hash.get("jejisa"));
		dm.std_rate = Util.checkString((String)hash.get("std_rate"));
		
		dm.setCmpy_cd(cmpy_cd);
		
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_COMMATR_7520_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
