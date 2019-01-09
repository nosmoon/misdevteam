/***************************************************************************************************
* 파일명 : SE_SAL_2600WB.java
* 기능 : 판매 - 매출관리 - 단건계산서등록
* 작성일자 : 2009-07-20
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.etc.dao.SE_ETC_1300DAO;
import chosun.ciis.se.etc.dm.SE_ETC_1320_ADM;
import chosun.ciis.se.etc.ds.SE_ETC_1320_ADataSet;
import chosun.ciis.se.sal.dao.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */

public class SE_SAL_2700WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2700_MDataSet ds = null;
		SE_SAL_2700_MDM dm = new SE_SAL_2700_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
		dm.feat_clsf = Util.checkString(req.getParameter("feat_clsf"));

		
        try {
        	SE_SAL_2700DAO dao = new SE_SAL_2700DAO();
            ds = dao.se_sal_2700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}

    /**
     * 전표내역 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2710_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2710_LDataSet ds = null;
		SE_SAL_2710_LDM dm = new SE_SAL_2710_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.team = Util.checkString(req.getParameter("team"));
		dm.part = Util.checkString(req.getParameter("part"));
		dm.area = Util.checkString(req.getParameter("area"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		dm.bgn_mm = Util.checkString(req.getParameter("bgn_mm"));
		dm.end_mm = Util.checkString(req.getParameter("end_mm"));
		dm.widr_bgn_mm = Util.checkString(req.getParameter("widr_bgn_mm"));
		//dm.print();
        try {
        	SE_SAL_2700DAO dao = new SE_SAL_2700DAO();
            ds = dao.se_sal_2710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
	public void se_sal_2720_a(HttpServletRequest req, HttpServletResponse res) throws AppException {

		SE_SAL_2720_ADataSet ds = null;
		SE_SAL_2720_ADM dm = new SE_SAL_2720_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		
        String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
		
		dm.dept_cd = Util.checkString((String) hash.get("dept_cd"));
		dm.sub_dept_cd = Util.checkString((String) hash.get("sub_dept_cd"));
		dm.area_cd = Util.checkString((String) hash.get("area_cd"));
		dm.bo_cd = Util.checkString((String) hash.get("bo_cd"));
		dm.bo_seq = Util.checkString((String) hash.get("bo_seq"));
		dm.chrg_pers = Util.checkString((String) hash.get("chrg_pers"));
		dm.bgn_mm = Util.checkString((String) hash.get("bgn_mm"));
		dm.end_mm = Util.checkString((String) hash.get("end_mm"));
		dm.months = Util.checkString((String) hash.get("months"));
		dm.damt_decid_amt = Util.checkString((String) hash.get("damt_decid_amt"));
		dm.widr_yn = Util.checkString((String) hash.get("widr_yn"));
		dm.widr_bgn_mm = Util.checkString((String) hash.get("widr_bgn_mm"));
		dm.widr_amt = Util.checkString((String) hash.get("widr_amt"));		
		//dm.print();

        try {
        	SE_SAL_2700DAO dao = new SE_SAL_2700DAO();
            ds = dao.se_sal_2720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
    public void se_sal_2730_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_2730_ADataSet ds = null;

        // DM Setting
        SE_SAL_2730_ADM dm 		= new SE_SAL_2730_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
       
        String selldeptcd 		= Util.checkString(req.getParameter("selldeptcd"));
        String yymm 			= Util.checkString(req.getParameter("yymm"));
        String clos_yn 			= Util.checkString(req.getParameter("clos_yn"));
        String areagb 			= Util.checkString(req.getParameter("areagb"));
        String area_cd 			= Util.checkString(req.getParameter("area_cd"));
       
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setSelldeptcd(selldeptcd);
        dm.setYymm(yymm);
        dm.setClos_yn(clos_yn);
        dm.setAreagb(areagb);
        dm.setArea_cd(area_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	SE_SAL_2700DAO dao = new SE_SAL_2700DAO();
            ds = dao.se_sal_2730_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
      
 
}
