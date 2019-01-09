/***************************************************************************************************
* 파일명 : SE_COMM_2400WB.java
* 기능 :  수송업자 팝업
* 작성일자 : 2009.06.09
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
import chosun.ciis.se.comm.dao.SE_COMM_2400DAO;
import chosun.ciis.se.comm.dm.SE_COMM_2400_MDM;
import chosun.ciis.se.comm.dm.SE_COMM_2410_LDM;
import chosun.ciis.se.comm.ds.SE_COMM_2400_MDataSet;
import chosun.ciis.se.comm.ds.SE_COMM_2410_LDataSet;
/**
 * 
 */

public class SE_COMM_2400WB extends BaseWB{

    /**
     * 수송업자 팝업 초기화면 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_comm_2400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2400_MDataSet ds = null;

        // DM Setting
        SE_COMM_2400_MDM dm = new SE_COMM_2400_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "uid", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_COMM_2400DAO dao = new SE_COMM_2400DAO();
            ds = dao.se_comm_2400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2400EJBHome home = (SE_COMM_2400EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2400EJB");
//        try {
//        	SE_COMM_2400EJB ejb = home.create();
//            ds = ejb.se_comm_2400_m(dm);
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
     * 수송업자 팝업 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_comm_2410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_COMM_2410_LDataSet ds = null;

        // DM Setting
        SE_COMM_2410_LDM dm = new SE_COMM_2410_LDM();

        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "uid", true);
        String prt_plac_cd			= Util.checkString(req.getParameter("prt_plac_cd"			));
        String route_clsf			= Util.checkString(req.getParameter("route_clsf"			));
        String tran_uprc_cd			= Util.checkString(req.getParameter("tran_uprc_cd"			));
        String tran_uprc_route_nm	= Util.checkString(req.getParameter("tran_uprc_route_nm"	));
        String tran_uprc_clas		= Util.checkString(req.getParameter("tran_uprc_clas"		));
        String bgn_dt				= Util.checkString(req.getParameter("bgn_dt"				));
        String end_dt				= Util.checkString(req.getParameter("end_dt"				));
        
        dm.setCmpy_cd				(cmpy_cd			);
        dm.setIncmg_pers			(incmg_pers			);
        dm.setTran_uprc_cd			(tran_uprc_cd		);
        dm.setTran_uprc_route_nm	(tran_uprc_route_nm	);
        dm.setTran_uprc_clas		(tran_uprc_clas		);
        dm.setRoute_clsf			(route_clsf			);
        dm.setPrt_plac_cd			(prt_plac_cd		);
        dm.setBgn_dt				(bgn_dt				);
        dm.setEnd_dt				(end_dt				);
        
        try {
        	SE_COMM_2400DAO dao = new SE_COMM_2400DAO();
            ds = dao.se_comm_2410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_COMM_2400EJBHome home = (SE_COMM_2400EJBHome) JNDIManager.getInstance().getHome("SE_COMM_2400EJB");
//        try {
//        	SE_COMM_2400EJB ejb = home.create();
//            ds = ejb.se_comm_2410_l(dm);
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
