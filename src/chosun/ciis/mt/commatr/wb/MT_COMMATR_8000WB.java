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

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.commatr.dao.MT_COMMATR_8000DAO;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;


/**
 * 
 */

public class MT_COMMATR_8000WB extends BaseWB{

    /**
     * 담당자 구분과 담당부서코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void mt_commatr_8101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_8101_LDataSet ds = null;
		MT_COMMATR_8101_LDM dm = new MT_COMMATR_8101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.list_gbn = Util.checkString(req.getParameter("list_gbn"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		try {
			MT_COMMATR_8000DAO dao = new MT_COMMATR_8000DAO();
        	ds = dao.mt_commatr_8101_l(dm);  
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
    
    public void mt_commatr_8102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_8102_LDataSet ds = null;
		MT_COMMATR_8102_LDM dm = new MT_COMMATR_8102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.list_gbn = Util.checkString(req.getParameter("list_gbn"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		try {
			MT_COMMATR_8000DAO dao = new MT_COMMATR_8000DAO();
        	ds = dao.mt_commatr_8102_l(dm);  
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
   
    public void mt_commatr_8103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_8103_LDataSet ds = null;
		MT_COMMATR_8103_LDM dm = new MT_COMMATR_8103_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		try {
			MT_COMMATR_8000DAO dao = new MT_COMMATR_8000DAO();
        	ds = dao.mt_commatr_8103_l(dm);  
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
 
    public void mt_commatr_8104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_8104_LDataSet ds = null;
		MT_COMMATR_8104_LDM dm = new MT_COMMATR_8104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_mm_fr = Util.checkString(req.getParameter("search_mm_fr"));
		dm.search_mm_to = Util.checkString(req.getParameter("search_mm_to"));
		dm.list_gbn = Util.checkString(req.getParameter("list_gbn"));
		dm.print();

		try {
			MT_COMMATR_8000DAO dao = new MT_COMMATR_8000DAO();
        	ds = dao.mt_commatr_8104_l(dm);  
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
}
