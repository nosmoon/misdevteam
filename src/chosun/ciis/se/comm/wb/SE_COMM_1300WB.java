/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
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
import chosun.ciis.se.comm.dao.SE_COMM_1300DAO;
import chosun.ciis.se.comm.dm.SE_COMM_1305_SDM;
import chosun.ciis.se.comm.dm.SE_COMM_1310_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_1305_SDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_1310_LDataSet;
/**
 * 
 */

public class SE_COMM_1300WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "##";

    /**
     * 1건 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_comm_1305_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_COMM_1305_SDataSet ds = null;
		SE_COMM_1305_SDM dm = new SE_COMM_1305_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
		dm.bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));

        try {
        	SE_COMM_1300DAO dao = new SE_COMM_1300DAO();
            ds = dao.se_comm_1305_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_COMM_1300EJBHome home = (SE_COMM_1300EJBHome)JNDIManager.getInstance().getHome("SE_COMM_1300EJB");
//			SE_COMM_1300EJB ejb = home.create();
//
//			ds = ejb.se_comm_1305_s(dm);
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
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_1310_LDataSet ds = null;

        // DM Setting
        SE_COMM_1310_LDM dm = new SE_COMM_1310_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String bo_nm = Util.checkString(req.getParameter("bo_nm"));
        String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_nm(bo_nm);
        dm.setBo_head_nm(bo_head_nm);

        try {
        	SE_COMM_1300DAO dao = new SE_COMM_1300DAO();
            ds = dao.se_comm_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
        
//        SE_COMM_1300EJBHome home = (SE_COMM_1300EJBHome) JNDIManager.getInstance().getHome("SE_COMM_1300EJB");
//        try {
//        	SE_COMM_1300EJB ejb = home.create();
//            ds = ejb.se_comm_1310_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    

}
