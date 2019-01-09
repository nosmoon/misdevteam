/***************************************************************************************************
* 파일명 : SE_SND_2600WB.java
* 기능 : 판매-발송관리-수송단가조회
* 작성일자 : 2009-02-23
* 작성자 : 김대준
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
import chosun.ciis.se.snd.dao.SE_SND_2600DAO;
import chosun.ciis.se.snd.dm.SE_SND_2600_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2610_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2620_LDM;
import chosun.ciis.se.snd.ds.SE_SND_2600_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2610_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2620_LDataSet;
/**
 * 
 */

public class SE_SND_2600WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2600_MDataSet ds = null;

        // DM Setting
        SE_SND_2600_MDM dm 		= new SE_SND_2600_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_2600DAO dao = new SE_SND_2600DAO();
            ds = dao.se_snd_2600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2600EJBHome home = (SE_SND_2600EJBHome) JNDIManager.getInstance().getHome("SE_SND_2600EJB");
//        
//        try {
//        	SE_SND_2600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2600_m(dm);
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
     * 라이트 그리드 컬럼수 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
     public void se_snd_2610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2610_LDataSet ds = null;

        // DM Setting
        SE_SND_2610_LDM dm 		= new SE_SND_2610_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_SND_2600DAO dao = new SE_SND_2600DAO();
            ds = dao.se_snd_2610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("cmpy_cd	=" + dm.getCmpy_cd());
//        
//        SE_SND_2600EJBHome home = (SE_SND_2600EJBHome) JNDIManager.getInstance().getHome("SE_SND_2600EJB");
//        
//        try {
//        	SE_SND_2600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2610_l(dm);
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
     * 수송단가 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
     public void se_snd_2620_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
     	
         SE_SND_2620_LDataSet ds 	= null;

         // DM Setting
         SE_SND_2620_LDM dm 		= new SE_SND_2620_LDM();

         String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd"	, true);
         String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no"		, true);
         String route_cd			= Util.checkString(req.getParameter("route_cd"		));
         String prt_plac_cd			= Util.checkString(req.getParameter("prt_plac_cd"	));
         String route_clsf			= Util.checkString(req.getParameter("route_clsf"	));
         String aply_dt				= Util.checkString(req.getParameter("aply_dt"		));
         
         dm.setCmpy_cd(cmpy_cd);
         dm.setIncmg_pers(incmg_pers);
         dm.setRoute_cd(route_cd);
         dm.setPrt_plac_cd(prt_plac_cd);
         dm.setRoute_clsf(route_clsf);
         dm.setAply_dt(aply_dt);
         
        try {
        	SE_SND_2600DAO dao = new SE_SND_2600DAO();
            ds = dao.se_snd_2620_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//         dm.print();
         
//         SE_SND_2600EJBHome home = (SE_SND_2600EJBHome) JNDIManager.getInstance().getHome("SE_SND_2600EJB");
//         
//         try {
//         	SE_SND_2600EJB ejb = home.create();
//             System.out.println("1111111111111111111111::::::::::");
//             ds = ejb.se_snd_2620_l(dm);
//             System.out.println("2222222222222222222222::::::::::");
//             req.setAttribute("ds", ds);
//         }
//         catch (CreateException e) {
//             SysException se = new SysException(e);
//             System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//             LogManager.getInstance().log(se);
//             throw se;
//         }
//         catch (RemoteException e) {
//             SysException se = new SysException(e);
//             System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//             LogManager.getInstance().log(se);
//             throw se;
//         }
     }
}
