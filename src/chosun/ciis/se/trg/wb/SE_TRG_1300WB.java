/***************************************************************************************************
 * 파일명 : SE_TRG_1300WB.java
 * 기능 : 월별확장및성장실적
 * 작성일자 : 2009-04-06
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.trg.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.trg.dao.SE_TRG_1300DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1300_MDM;
import chosun.ciis.se.trg.dm.SE_TRG_1310_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1320_ADM;
import chosun.ciis.se.trg.ds.SE_TRG_1300_MDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1310_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1320_ADataSet;
/**
 * 
 */

public class SE_TRG_1300WB extends BaseWB {

    /**
     * 실적내역 초기
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1300_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1300_MDataSet ds = null;
		SE_TRG_1300_MDM dm = new SE_TRG_1300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_TRG_1300DAO dao = new SE_TRG_1300DAO();
            ds = dao.se_trg_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	}

    /**
     * 실적내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1310_LDataSet ds = null;
		SE_TRG_1310_LDM dm = new SE_TRG_1310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.trgt_rate = Util.checkString(req.getParameter("trgt_rate"));

        try {
        	SE_TRG_1300DAO dao = new SE_TRG_1300DAO();
            ds = dao.se_trg_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1300EJBHome home = (SE_TRG_1300EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1300EJB");
//			SE_TRG_1300EJB ejb = home.create();
//
//			ds = ejb.se_trg_1310_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

    /**
     * 실적 업로드
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1320_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1320_ADataSet ds = null;
		SE_TRG_1320_ADM dm = new SE_TRG_1320_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yymm1 = Util.checkString(req.getParameter("yymm"));
		dm.yymm2 = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1300DAO dao = new SE_TRG_1300DAO();
            ds = dao.se_trg_1320_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1300EJBHome home = (SE_TRG_1300EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1300EJB");
//			SE_TRG_1300EJB ejb = home.create();
//
//			ds = ejb.se_trg_1320_a(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
	
}
