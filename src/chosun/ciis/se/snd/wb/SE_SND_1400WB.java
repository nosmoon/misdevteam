/***************************************************************************************************
* 파일명 : SE_SND_1400WB.java
* 기능 : 판매 - 발송관리 - 노선별부수집계
* 작성일자 : 2009.01.30
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_1400DAO;
import chosun.ciis.se.snd.dm.SE_SND_1400_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1410_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1420_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1400_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1410_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1420_LDataSet;
/**
 * 
 */

public class SE_SND_1400WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1400_MDataSet ds = null;

        // DM Setting
        SE_SND_1400_MDM dm 		= new SE_SND_1400_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1400DAO dao = new SE_SND_1400DAO();
            ds = dao.se_snd_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1400EJBHome home = (SE_SND_1400EJBHome) JNDIManager.getInstance().getHome("SE_SND_1400EJB");
//        
//        try {
//        	SE_SND_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1400_m(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   
    
    /**
     * 노선별 부수집계 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1410_LDataSet ds = null;

        // DM Setting
        SE_SND_1410_LDM dm = new SE_SND_1410_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String prt_plac_cd 		= Util.checkString(req.getParameter("prt_plac_cd"));
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"));
        String bgn_route_cd 	= Util.checkString(req.getParameter("bgn_route_cd"));
        String end_route_cd 	= Util.checkString(req.getParameter("end_route_cd"));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setPrt_plac_cd		(prt_plac_cd	);
        dm.setRoute_clsf		(route_clsf		);
        dm.setBgn_route_cd		(bgn_route_cd	);
        dm.setEnd_route_cd		(end_route_cd	);
        dm.setIncmg_pers		(incmg_pers		);
        
        try {
        	SE_SND_1400DAO dao = new SE_SND_1400DAO();
            ds = dao.se_snd_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1400EJBHome home = (SE_SND_1400EJBHome) JNDIManager.getInstance().getHome("SE_SND_1400EJB");
//        
//        try {
//        	SE_SND_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1410_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   
     
    /**
     * 노선별 컬럼 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1420_LDataSet ds = null;

        // DM Setting
        SE_SND_1420_LDM dm = new SE_SND_1420_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1400DAO dao = new SE_SND_1400DAO();
            ds = dao.se_snd_1420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1400EJBHome home = (SE_SND_1400EJBHome) JNDIManager.getInstance().getHome("SE_SND_1400EJB");
//        
//        try {
//        	SE_SND_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1420_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   
}
