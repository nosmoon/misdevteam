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
import chosun.ciis.se.sal.dao.SE_SAL_2600DAO;
import chosun.ciis.se.sal.dm.SE_SAL_2600_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_2610_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_2620_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_2630_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_2600_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2610_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2620_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2630_ADataSet;

/**
 * 
 */

public class SE_SAL_2600WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2600_MDataSet ds = null;
		SE_SAL_2600_MDM dm = new SE_SAL_2600_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
		dm.feat_clsf = Util.checkString(req.getParameter("feat_clsf"));

		
        try {
        	SE_SAL_2600DAO dao = new SE_SAL_2600DAO();
            ds = dao.se_sal_2600_m(dm);
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
	public void se_sal_2610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2610_LDataSet ds = null;
		SE_SAL_2610_LDM dm = new SE_SAL_2610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.team = Util.checkString(req.getParameter("team"));
		dm.part = Util.checkString(req.getParameter("part"));
		dm.area = Util.checkString(req.getParameter("area"));

        try {
        	SE_SAL_2600DAO dao = new SE_SAL_2600DAO();
            ds = dao.se_sal_2610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
 
	public void se_sal_2620_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2620_ADataSet ds = null;
		SE_SAL_2620_ADM dm = new SE_SAL_2620_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.issu_dt = Util.checkString(req.getParameter("callgb"));
		dm.bo_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bank_cd"));
		dm.area_cd = Util.checkString(req.getParameter("acct_mang_no"));
		dm.bal = Util.checkString(req.getParameter("rmtt_dt"));
		dm.incmg_dt_tm = Util.checkString(req.getParameter("rmtt_plac"));
		dm.chg_pers = Util.checkString(req.getParameter("corp_clsf"));
		dm.chg_dt_tm = Util.checkString(req.getParameter("dlco_no"));

		dm.print();
		
        try {
        	SE_SAL_2600DAO dao = new SE_SAL_2600DAO();
            ds = dao.se_sal_2620_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
     
    /**
     * 입금,계산서 저장취소
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_sal_2630_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_SAL_2630_ADataSet ds = null;
		SE_SAL_2630_ADM dm = new SE_SAL_2630_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.selldeptcd = Util.checkString(req.getParameter("selldeptcd"));
		
   
        try {
        	SE_SAL_2600DAO dao = new SE_SAL_2600DAO();
            ds = dao.se_sal_2630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
     
	
}
