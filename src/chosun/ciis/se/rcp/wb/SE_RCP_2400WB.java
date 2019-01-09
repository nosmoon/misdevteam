/***************************************************************************************************
 * 파일명 : SE_RCP_2400WB.java
 * 기능 : 기간별지역담당입금집계
 * 작성일자 : 2009-04-22
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.SE_RCP_2400DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_2400_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_2410_LDM;
import chosun.ciis.se.rcp.ds.SE_RCP_2400_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_2410_LDataSet;
/**
 * 
 */

public class SE_RCP_2400WB extends BaseWB {

    /**
     * 초기화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_2400_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_2400_MDataSet ds = null;
		SE_RCP_2400_MDM dm = new SE_RCP_2400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_2400DAO dao = new SE_RCP_2400DAO();
            ds = dao.se_rcp_2400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_2400EJBHome home = (SE_RCP_2400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_2400EJB");
//			SE_RCP_2400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_2400_m(dm);
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
     * 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_2410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_2410_LDataSet ds = null;
		SE_RCP_2410_LDM dm = new SE_RCP_2410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_RCP_2400DAO dao = new SE_RCP_2400DAO();
            ds = dao.se_rcp_2410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_2400EJBHome home = (SE_RCP_2400EJBHome)JNDIManager.getInstance().getHome("SE_RCP_2400EJB");
//			SE_RCP_2400EJB ejb = home.create();
//
//			ds = ejb.se_rcp_2410_l(dm);
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
