/***************************************************************************************************
 * 파일명 : SE_RCP_2600WB.java
 * 기능 : 월간지국입금현황
 * 작성일자 : 2009-04-24
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
import chosun.ciis.se.rcp.dao.SE_RCP_2600DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_2600_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_2610_LDM;
import chosun.ciis.se.rcp.ds.SE_RCP_2600_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_2610_LDataSet;
/**
 * 
 */

public class SE_RCP_2600WB extends BaseWB {

    /**
     * 초기화
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_rcp_2600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_2600_MDataSet ds = null;
		SE_RCP_2600_MDM dm = new SE_RCP_2600_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
        try {
        	SE_RCP_2600DAO dao = new SE_RCP_2600DAO();
            ds = dao.se_rcp_2600_m(dm);
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
	public void se_rcp_2610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_RCP_2610_LDataSet ds = null;
		SE_RCP_2610_LDM dm = new SE_RCP_2610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		String bo_cdseq = Util.checkString(req.getParameter("bo_cd"));
		
		dm.bo_cd = bo_cdseq.substring(0,5);
		dm.bo_seq = bo_cdseq.substring(5,8);

        try {
        	SE_RCP_2600DAO dao = new SE_RCP_2600DAO();
            ds = dao.se_rcp_2610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_RCP_2600EJBHome home = (SE_RCP_2600EJBHome)JNDIManager.getInstance().getHome("SE_RCP_2600EJB");
//			SE_RCP_2600EJB ejb = home.create();
//
//			ds = ejb.se_rcp_2610_l(dm);
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
