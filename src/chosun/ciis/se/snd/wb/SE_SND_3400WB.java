/***************************************************************************************************
* 파일명 : SE_SND_3400WB.java
* 기능 : 판매 - 발송관리 - 대표노선, 노선 설정
* 작성일자 : 2009-05-14
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_3400DAO;
import chosun.ciis.se.snd.dm.SE_SND_3400_MDM;
import chosun.ciis.se.snd.dm.SE_SND_3410_LDM;
import chosun.ciis.se.snd.dm.SE_SND_3420_LDM;
import chosun.ciis.se.snd.dm.SE_SND_3430_ADM;
import chosun.ciis.se.snd.ds.SE_SND_3400_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3410_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3420_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3430_ADataSet;
/**
 * 
 */

public class SE_SND_3400WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_3400_MDataSet ds = null;

        // DM Setting
        SE_SND_3400_MDM dm = new SE_SND_3400_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_3400DAO dao = new SE_SND_3400DAO();
            ds = dao.se_snd_3400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3400EJBHome home = (SE_SND_3400EJBHome) JNDIManager.getInstance().getHome("SE_SND_3400EJB");
//        
//        try {
//        	SE_SND_3400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3400_m(dm);
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
     * 대표노선 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_3410_LDataSet ds = null;

        // DM Setting
        SE_SND_3410_LDM dm = new SE_SND_3410_LDM();

        
        String prt_plac_cd 		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"	));
        String ecnt_cd	 		= Util.checkString(req.getParameter("ecnt_cd"		));
        String ledt_cd	 		= Util.checkString(req.getParameter("ledt_cd"		));
        String medi_cd	 		= Util.checkString(req.getParameter("medi_cd"		));
        
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setEcnt_cd(ecnt_cd);
        dm.setLedt_cd(ledt_cd);
        dm.setMedi_cd(medi_cd);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_3400DAO dao = new SE_SND_3400DAO();
            ds = dao.se_snd_3410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3400EJBHome home = (SE_SND_3400EJBHome) JNDIManager.getInstance().getHome("SE_SND_3400EJB");
//        
//        try {
//        	SE_SND_3400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3410_l(dm);
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
     * 대표노선 해당 비해당 노선 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_3420_LDataSet ds = null;

        // DM Setting
        SE_SND_3420_LDM dm = new SE_SND_3420_LDM();

        
        String rptv_route_clsf 	= Util.checkString(req.getParameter("rptv_route_clsf"	));
        String rptv_route_cd 	= Util.checkString(req.getParameter("rptv_route_cd"		));
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setRptv_route_clsf	(rptv_route_clsf);
        dm.setRptv_route_cd		(rptv_route_cd	);
        
        try {
        	SE_SND_3400DAO dao = new SE_SND_3400DAO();
            ds = dao.se_snd_3420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3400EJBHome home = (SE_SND_3400EJBHome) JNDIManager.getInstance().getHome("SE_SND_3400EJB");
//        
//        try {
//        	SE_SND_3400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3420_l(dm);
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
     *  대표노선, 노선 매핑 매핑해제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_3430_ADataSet ds = null;
    	
    	//DM Setting
        SE_SND_3430_ADM dm = new SE_SND_3430_ADM();

    	
    	//노선 정보 그리드
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpdate"));
    	System.out.println("multiUpdate1=" + multiUpdateData);
    	
    	Hashtable hash 				= getHashMultiUpdateData(multiUpdateData);
    	//노선 정보
    	String mode					= (String)hash.get("m"					);	//그리드 모드
    	String route_clsf			= (String)hash.get("route_clsf" 		);
    	String route_cd				= (String)hash.get("route_cd" 			);
    	
    	String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "uid", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
    	String rptv_route_cd		= Util.checkString(req.getParameter("rptv_route_cd"));
        
        dm.setCmpy_cd				(cmpy_cd			);
        dm.setMode					(mode.toUpperCase()	);
        dm.setRptv_route_cd			(rptv_route_cd		);
        dm.setRoute_clsf			(route_clsf			);
        dm.setRoute_cd				(route_cd			);
        dm.setIncmg_pers			(incmg_pers			);
        dm.setIncmg_pers_ip			(incmg_pers_ip		);
        
        try {
        	SE_SND_3400DAO dao = new SE_SND_3400DAO();
            ds = dao.se_snd_3430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3400EJBHome home = (SE_SND_3400EJBHome) JNDIManager.getInstance().getHome("SE_SND_3400EJB");
//        
//        try {
//        	SE_SND_3400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3430_a(dm);
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
