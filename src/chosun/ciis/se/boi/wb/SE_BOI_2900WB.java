/***************************************************************************************************
 * 파일명 : SE_BOI_2900WB.java
 * 기능 : 보증계약통보
 * 작성일자 : 2016-11-02
 * 작성자 : 심정보
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
import chosun.ciis.se.boi.dao.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;
/**
 * 
 */

public class SE_BOI_2900WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2900_m(HttpServletRequest req, HttpServletResponse res) throws AppException {

		SE_BOI_2900_MDataSet ds = null;
		SE_BOI_2900_MDM dm = new SE_BOI_2900_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_2900DAO dao = new SE_BOI_2900DAO();
            ds = dao.se_boi_2900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
    /**
     * 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2910_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2910_LDataSet ds = null;
		SE_BOI_2910_LDM dm = new SE_BOI_2910_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));		
		
		dm.print();

        try {
        	SE_BOI_2900DAO dao = new SE_BOI_2900DAO();
            ds = dao.se_boi_2910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
	
	public void se_boi_2920_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2920_SDataSet ds = null;
		SE_BOI_2920_SDM dm = new SE_BOI_2920_SDM();

		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		
		dm.print();

        try {
        	SE_BOI_2900DAO dao = new SE_BOI_2900DAO();
            ds = dao.se_boi_2920_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}
}
