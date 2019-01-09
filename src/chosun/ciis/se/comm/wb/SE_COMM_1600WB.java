/***************************************************************************************************
* 파일명 : SE_COMM_1600WB.java
 * 기능 : 예수전표조회 팝업
 * 작성일자 : 2009-04-29
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.comm.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.comm.dao.SE_COMM_1600DAO;
import chosun.ciis.se.comm.dm.SE_COMM_1610_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_1610_LDataSet;
/**
 * 
 */

public class SE_COMM_1600WB extends BaseWB {

    /**
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_comm_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_COMM_1610_LDataSet ds = null;
		SE_COMM_1610_LDM dm = new SE_COMM_1610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));

        try {
        	SE_COMM_1600DAO dao = new SE_COMM_1600DAO();
            ds = dao.se_comm_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_COMM_1600EJBHome home = (SE_COMM_1600EJBHome)JNDIManager.getInstance().getHome("SE_COMM_1600EJB");
//			SE_COMM_1600EJB ejb = home.create();
//
//			ds = ejb.se_comm_1610_l(dm);
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
