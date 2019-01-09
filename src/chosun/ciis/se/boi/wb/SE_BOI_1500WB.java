/***************************************************************************************************
* 파일명 : SE_BOI_1500WB.java
 * 기능 : 지국관리 - 지국주소관련발행
 * 작성일자 : 2009-03-27
 * 작성자 : 배창희
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
import chosun.ciis.se.boi.dao.SE_BOI_1500DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1500_MDM;
import chosun.ciis.se.boi.ds.SE_BOI_1500_MDataSet;
/**
 * 
 */

public class SE_BOI_1500WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1500_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1500_MDataSet ds = null;
		SE_BOI_1500_MDM dm = new SE_BOI_1500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_BOI_1500DAO dao = new SE_BOI_1500DAO();
            ds = dao.se_boi_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1500EJBHome home = (SE_BOI_1500EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1500EJB");
//			SE_BOI_1500EJB ejb = home.create();
//
//			ds = ejb.se_boi_1500_m(dm);
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
