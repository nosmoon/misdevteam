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
import chosun.ciis.se.comm.dao.SE_COMM_1000DAO;
import chosun.ciis.se.comm.dm.SE_COMM_1005_SDM;
import chosun.ciis.se.comm.dm.SE_COMM_1010_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_1005_SDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_1010_LDataSet;
/**
 * 
 */

public class SE_COMM_1000WB extends BaseWB {

    /**
     * 1건 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
	public void se_comm_1005_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_COMM_1005_SDataSet ds = null;
		SE_COMM_1005_SDM dm = new SE_COMM_1005_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));

        try {
        	SE_COMM_1000DAO dao = new SE_COMM_1000DAO();
            ds = dao.se_comm_1005_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_COMM_1000EJBHome home = (SE_COMM_1000EJBHome)JNDIManager.getInstance().getHome("SE_COMM_1000EJB");
//			SE_COMM_1000EJB ejb = home.create();
//
//			ds = ejb.se_comm_1005_s(dm);
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
     * 담당자 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	SE_COMM_1010_LDataSet ds = null;

        // DM Setting
    	SE_COMM_1010_LDM dm = new SE_COMM_1010_LDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String dept_nm = Util.checkString(req.getParameter("dept_nm"));
        String flnm = Util.checkString(req.getParameter("flnm"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setDept_nm(dept_nm);
        dm.setFlnm(flnm);

        try {
        	SE_COMM_1000DAO dao = new SE_COMM_1000DAO();
            ds = dao.se_comm_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
        
//        SE_COMM_1000EJBHome home = (SE_COMM_1000EJBHome) JNDIManager.getInstance().getHome("SE_COMM_1000EJB");
//        try {
//        	SE_COMM_1000EJB ejb = home.create();
//            ds = ejb.se_comm_1010_l(dm);
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
