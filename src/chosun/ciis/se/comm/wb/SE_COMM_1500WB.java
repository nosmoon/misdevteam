/***************************************************************************************************
* 파일명 : SE_COMM_1500WB.java
* 기능 : 담당평가팝업
 * 작성일자 : 2009-04-08
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
import chosun.ciis.se.comm.dao.SE_COMM_1500DAO;
import chosun.ciis.se.comm.dm.SE_COMM_1510_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_1510_LDataSet;
/**
 * 
 */

public class SE_COMM_1500WB extends BaseWB {

    /**
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_comm_1510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_COMM_1510_LDataSet ds = null;
		SE_COMM_1510_LDM dm = new SE_COMM_1510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yy = Util.checkString(req.getParameter("yy"));

        try {
        	SE_COMM_1500DAO dao = new SE_COMM_1500DAO();
            ds = dao.se_comm_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_COMM_1500EJBHome home = (SE_COMM_1500EJBHome)JNDIManager.getInstance().getHome("SE_COMM_1500EJB");
//			SE_COMM_1500EJB ejb = home.create();
//
//			ds = ejb.se_comm_1510_l(dm);
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
