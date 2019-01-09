/***************************************************************************************************
* 파일명 : SE_SND_1500WB.java
* 기능 : 판매 - 발송관리 - 공장별부수
* 작성일자 : 2009.02.03
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
import chosun.ciis.se.snd.dao.SE_SND_1500DAO;
import chosun.ciis.se.snd.dm.SE_SND_1500_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1510_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1520_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1500_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1510_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1520_LDataSet;
/**
 * 
 */

public class SE_SND_1500WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1500_MDataSet ds = null;

        // DM Setting
        SE_SND_1500_MDM dm 		= new SE_SND_1500_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1500DAO dao = new SE_SND_1500DAO();
            ds = dao.se_snd_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1500EJBHome home = (SE_SND_1500EJBHome) JNDIManager.getInstance().getHome("SE_SND_1500EJB");
//        
//        try {
//        	SE_SND_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1500_m(dm);
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
     * 공장판별 부수
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1510_LDataSet ds = null;

        // DM Setting
        SE_SND_1510_LDM dm = new SE_SND_1510_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"));
        String medi_cd 			= Util.checkString(req.getParameter("medi_cd"	));
        String issu_dt		 	= Util.checkString(req.getParameter("issu_dt"	));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setMedi_cd(medi_cd);
        dm.setIssu_dt(issu_dt);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1500DAO dao = new SE_SND_1500DAO();
            ds = dao.se_snd_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1500EJBHome home = (SE_SND_1500EJBHome) JNDIManager.getInstance().getHome("SE_SND_1500EJB");
//        
//        try {
//        	SE_SND_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1510_l(dm);
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
     * 컬럼수 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1520_LDataSet ds = null;

        // DM Setting
        SE_SND_1520_LDM dm = new SE_SND_1520_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1500DAO dao = new SE_SND_1500DAO();
            ds = dao.se_snd_1520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1500EJBHome home = (SE_SND_1500EJBHome) JNDIManager.getInstance().getHome("SE_SND_1500EJB");
//        
//        try {
//        	SE_SND_1500EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1520_l(dm);
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
