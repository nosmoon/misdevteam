/***************************************************************************************************
 * 파일명 : SE_RCP_4200WB.java
 * 기능 : 스포츠일입금현황
 * 작성일자 : 2009-05-11
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
import chosun.ciis.se.rcp.dao.SE_RCP_4200DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_4200_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_4210_LDM;
import chosun.ciis.se.rcp.ds.SE_RCP_4200_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_4210_LDataSet;
/**
 * 
 */

public class SE_RCP_4200WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_4200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4200_MDataSet ds = null;
		SE_RCP_4200_MDM dm = new SE_RCP_4200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_RCP_4200DAO dao = new SE_RCP_4200DAO();
            ds = dao.se_rcp_4200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_4200EJBHome home = (SE_RCP_4200EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4200EJB");
//			SE_RCP_4200EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4200_m(dm);
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
	public void se_rcp_4210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_4210_LDataSet ds = null;
		SE_RCP_4210_LDM dm = new SE_RCP_4210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.rcpm_dt1 = Util.checkString(req.getParameter("rcpm_dt1"));
		dm.rcpm_dt2 = Util.checkString(req.getParameter("rcpm_dt2"));

        try {
        	SE_RCP_4200DAO dao = new SE_RCP_4200DAO();
            ds = dao.se_rcp_4210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_RCP_4200EJBHome home = (SE_RCP_4200EJBHome)JNDIManager.getInstance().getHome("SE_RCP_4200EJB");
//			SE_RCP_4200EJB ejb = home.create();
//
//			ds = ejb.se_rcp_4210_l(dm);
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
