/***************************************************************************************************
* 파일명 : SE_BOI_11000WB.java _센터정보관리_모바일용
* 기능 :
 * 작성일자 : 2016-12-01
 * 작성자 :  장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.boi.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_11000DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1000_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1020_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1030_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1040_SDM;
import chosun.ciis.se.boi.dm.SE_MO_BOI_1010_LDM;
import chosun.ciis.se.boi.dm.SE_MO_BOI_1020_SDM;
import chosun.ciis.se.boi.ds.SE_BOI_1000_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1020_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1030_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1040_SDataSet;
import chosun.ciis.se.boi.ds.SE_MO_BOI_1010_LDataSet;
import chosun.ciis.se.boi.ds.SE_MO_BOI_1020_SDataSet;
/**
 *
 */

public class SE_BOI_11000WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException { //모바일용

        SE_BOI_1000_MDataSet ds = null;

        // DM Setting
        SE_BOI_1000_MDM dm = new SE_BOI_1000_MDM();

//        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
//        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.checkString(req.getParameter("cmpycd"));
        String incmg_pers =Util.checkString(req.getParameter("emp_no"));
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        dm.print();

        try {
        	SE_BOI_11000DAO dao = new SE_BOI_11000DAO();
            ds = dao.mo_se_boi_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }

    /**
     * 지국 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException { //모바일용

        SE_MO_BOI_1010_LDataSet ds = null;

        // DM Setting
        SE_MO_BOI_1010_LDM dm = new SE_MO_BOI_1010_LDM();

//		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
//		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpycd"));
		dm.incmg_pers = Util.checkString(req.getParameter("emp_no"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
		dm.bo_reg_clsf = Util.checkString(req.getParameter("bo_reg_clsf"));
		dm.bo_cntr_dt_fr = Util.checkString(req.getParameter("bo_cntr_dt_fr"));
		dm.bo_cntr_dt_to = Util.checkString(req.getParameter("bo_cntr_dt_to"));

		dm.print();


        try {
        	SE_BOI_11000DAO dao = new SE_BOI_11000DAO();
            ds = dao.mo_se_boi_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }

    /**
     * 지국 상세조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1020_s(HttpServletRequest req, HttpServletResponse res) throws   AppException { //모바일용

        SE_MO_BOI_1020_SDataSet ds = null;

        // DM Setting
        SE_MO_BOI_1020_SDM dm = new SE_MO_BOI_1020_SDM();

        String bo_cd = Util.checkString(req.getParameter("bo_cd"));
        String bo_seq = Util.checkString(req.getParameter("bo_seq"));
        String cmpy_cd = Util.checkString(req.getParameter("cmpycd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setBo_seq(bo_seq);

        dm.print();

        try {
        	SE_BOI_11000DAO dao = new SE_BOI_11000DAO();
            ds = dao.mo_se_boi_1020_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }

    /**
     * 지국장 상세조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1030_s(HttpServletRequest req, HttpServletResponse res) throws   AppException { //모바일용
        SE_BOI_1030_SDataSet ds = null;
        // DM Setting
        SE_BOI_1030_SDM dm = new SE_BOI_1030_SDM();

        String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
//        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String cmpy_cd = Util.checkString(req.getParameter("cmpycd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_head_prn(bo_head_prn);

        dm.print();

        try {
        	SE_BOI_11000DAO dao = new SE_BOI_11000DAO();
            ds = dao.mo_se_boi_1030_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }


    /**
     * 지국기타정보 상세조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1040_s(HttpServletRequest req, HttpServletResponse res) throws   AppException { //모바일용

        SE_BOI_1040_SDataSet ds = null;

        // DM Setting
        SE_BOI_1040_SDM dm = new SE_BOI_1040_SDM();

        String bo_cd = Util.checkString(req.getParameter("bo_cd"));
        String bo_seq = Util.checkString(req.getParameter("bo_seq"));
//        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String cmpy_cd = Util.checkString(req.getParameter("cmpycd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setBo_seq(bo_seq);

        dm.print();

        try {
        	SE_BOI_11000DAO dao = new SE_BOI_11000DAO();
            ds = dao.mo_se_boi_1040_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }


}
