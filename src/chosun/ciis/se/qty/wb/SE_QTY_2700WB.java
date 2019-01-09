/***************************************************************************************************
* 파일명 : SE_QTY_2700WB.java
 * 기능 : 부수증감신청서출력
 * 작성일자 : 2009-06-01
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.qty.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_2700DAO;
import chosun.ciis.se.qty.dm.SE_QTY_2700_MDM;
import chosun.ciis.se.qty.ds.SE_QTY_2700_MDataSet;
/**
 * 
 */

public class SE_QTY_2700WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2700_MDataSet ds = null;
		SE_QTY_2700_MDM dm = new SE_QTY_2700_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_QTY_2700DAO dao = new SE_QTY_2700DAO();
            ds = dao.se_qty_2700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2700EJBHome home = (SE_QTY_2700EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2700EJB");
//			SE_QTY_2700EJB ejb = home.create();
//
//			ds = ejb.se_qty_2700_m(dm);
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
