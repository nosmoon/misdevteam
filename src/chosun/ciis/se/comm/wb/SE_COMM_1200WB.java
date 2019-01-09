/***************************************************************************************************
* 파일명 : SE_COMM_1200WB.java
* 기능 :   노선구분코드 팝업
 * 작성일자 : 2009.01.22
 * 작성자 :   김대준
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
import chosun.ciis.se.comm.dao.SE_COMM_1200DAO;
import chosun.ciis.se.comm.dm.SE_COMM_1210_LDM;
import chosun.ciis.se.comm.dm.SE_COMM_1220_SDM;
import chosun.ciis.se.comm.ds.SE_COMM_1210_LDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_1220_SDataSet;
/**
 * 
 */

public class SE_COMM_1200WB extends BaseWB{

    /**
     * 노선구분코드 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_1210_LDataSet ds = null;

        // DM Setting
        SE_COMM_1210_LDM dm = new SE_COMM_1210_LDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String route_cd 	= Util.checkString(req.getParameter("route_cd"));
        String route_nm 	= Util.checkString(req.getParameter("route_nm"));
        String route_clsf 	= Util.checkString(req.getParameter("route_clsf"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_cd(route_cd);
        dm.setRoute_nm(route_nm);
        dm.setRoute_clsf(route_clsf);
        
        try {
        	SE_COMM_1200DAO dao = new SE_COMM_1200DAO();
            ds = dao.se_comm_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("cmpy_cd		=" + dm.getCmpy_cd());
//        System.out.println("route_cd	=" + dm.getRoute_cd());
//        System.out.println("route_nm	=" + dm.getRoute_nm());
//        System.out.println("route_clsf	=" + dm.getRoute_clsf());
//        
//        
//        SE_COMM_1200EJBHome home = (SE_COMM_1200EJBHome) JNDIManager.getInstance().getHome("SE_COMM_1200EJB");
//        try {
//        	SE_COMM_1200EJB ejb = home.create();
//            ds = ejb.se_comm_1210_l(dm);
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
    
    /**
     * 노선구분코드 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_1220_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_1220_SDataSet ds = null;

        // DM Setting
        SE_COMM_1220_SDM dm = new SE_COMM_1220_SDM();

        String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
        String route_cd 	= Util.checkString(req.getParameter("route_cd"	));
        String route_nm 	= Util.checkString(req.getParameter("route_nm"	));
        String route_clsf 	= Util.checkString(req.getParameter("route_clsf"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_cd(route_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setRoute_nm(route_nm);
        
        try {
        	SE_COMM_1200DAO dao = new SE_COMM_1200DAO();
            ds = dao.se_comm_1220_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("cmpy_cd		=" + dm.getCmpy_cd());
//        System.out.println("route_cd	=" + dm.getRoute_cd());
//        System.out.println("route_nm	=" + dm.getRoute_nm());
//        System.out.println("route_clsf	=" + dm.getRoute_clsf());
//        
//        
//        SE_COMM_1200EJBHome home = (SE_COMM_1200EJBHome) JNDIManager.getInstance().getHome("SE_COMM_1200EJB");
//        try {
//        	SE_COMM_1200EJB ejb = home.create();
//            ds = ejb.se_comm_1220_s(dm);
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
