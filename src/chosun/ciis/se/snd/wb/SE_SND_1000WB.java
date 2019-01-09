/***************************************************************************************************
* 파일명 : SE_SND_1000WB.java
* 기능 : 판매 - 발송관리 - 대표노선등록
 * 작성일자 : 2009.02.02
 * 작성자 :   김대준
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
import chosun.ciis.se.snd.dao.SE_SND_1000DAO;
import chosun.ciis.se.snd.dm.SE_SND_1000_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1010_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1020_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1030_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1040_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1000_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1010_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1020_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1030_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1040_LDataSet;
/**
 * 
 */

public class SE_SND_1000WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1000_MDataSet ds = null;

        // DM Setting
        SE_SND_1000_MDM dm = new SE_SND_1000_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1000DAO dao = new SE_SND_1000DAO();
            ds = dao.se_snd_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1000EJBHome home = (SE_SND_1000EJBHome) JNDIManager.getInstance().getHome("SE_SND_1000EJB");
//        
//        try {
//        	SE_SND_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1000_m(dm);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1010_LDataSet ds = null;

        // DM Setting
        SE_SND_1010_LDM dm = new SE_SND_1010_LDM();

        
        String prt_plac_cd 		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"	));
        String ecnt_cd	 		= Util.checkString(req.getParameter("ecnt_cd"		));
        String ledt_cd	 		= Util.checkString(req.getParameter("ledt_cd"		));
        String medi_cd	 		= Util.checkString(req.getParameter("medi_cd"		));
        String qty_yn	 		= Util.checkString(req.getParameter("qty_yn"		));
        
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setEcnt_cd(ecnt_cd);
        dm.setLedt_cd(ledt_cd);
        dm.setMedi_cd(medi_cd);
        dm.setQty_yn(qty_yn);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1000DAO dao = new SE_SND_1000DAO();
            ds = dao.se_snd_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1000EJBHome home = (SE_SND_1000EJBHome) JNDIManager.getInstance().getHome("SE_SND_1000EJB");
//        
//        try {
//        	SE_SND_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1010_l(dm);
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
     *  대표노선 등록, 수정, 삭제 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_1020_ADataSet ds = null;
    	
    	//DM Setting
        SE_SND_1020_ADM dm = new SE_SND_1020_ADM();

    	
    	//노선 정보 그리드
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdate1=" + multiUpdateData);
    	
    	Hashtable hash 				= getHashMultiUpdateData(multiUpdateData);
    	//노선 정보
    	String mode					= (String)hash.get("m"					);	//그리드 모드    	
    	String rptv_route_clsf		= (String)hash.get("rptv_route_clsf" 	);
    	String rptv_route_cd		= (String)hash.get("rptv_route_cd" 		);
    	String rptv_route_nm		= (String)hash.get("rptv_route_nm" 		);
    	String prt_plac_cd			= (String)hash.get("prt_plac_cd" 		);
    	String ecnt_cd				= (String)hash.get("ecnt_cd"	 		);
    	String ledt_cd				= (String)hash.get("ledt_cd"	 		);
    	String route_rank			= (String)hash.get("route_rank" 		);
    	String route_cd				= (String)hash.get("route_cd" 			);
    	String route_nm				= (String)hash.get("route_nm" 			);
    	String prt_plac_cd_key		= (String)hash.get("prt_plac_cd_key"		);
    	String rptv_route_clsf_key	= (String)hash.get("rptv_route_clsf_key"		);
    	String rptv_route_cd_key	= (String)hash.get("rptv_route_cd_key"		);
    	
    	String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "uid", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMode(mode.toUpperCase());       
        dm.setRptv_route_clsf(rptv_route_clsf);
        dm.setRptv_route_cd(rptv_route_cd);
        dm.setRptv_route_nm(rptv_route_nm);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setEcnt_cd(ecnt_cd);
        dm.setLedt_cd(ledt_cd);
        dm.setRoute_rank(route_rank);
        dm.setRoute_cd(route_cd);
        dm.setRoute_nm(route_nm);     
        dm.setPrt_plac_cd_key(prt_plac_cd_key	);
        dm.setRptv_route_clsf_key(rptv_route_clsf_key);
        dm.setRptv_route_cd_key(rptv_route_cd_key);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	SE_SND_1000DAO dao = new SE_SND_1000DAO();
            ds = dao.se_snd_1020_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1000EJBHome home = (SE_SND_1000EJBHome) JNDIManager.getInstance().getHome("SE_SND_1000EJB");
//        
//        try {
//        	SE_SND_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1020_a(dm);
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
     *  노선일치 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_1030_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_1030_ADM dm 			= new SE_SND_1030_ADM();
    	
        String route_clsf			= Util.checkString(req.getParameter("route_clsf"));
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1000DAO dao = new SE_SND_1000DAO();
            ds = dao.se_snd_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1000EJBHome home = (SE_SND_1000EJBHome) JNDIManager.getInstance().getHome("SE_SND_1000EJB");
//        
//        try {
//        	SE_SND_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1030_a(dm);
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
     *  노선일치 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1040_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_1040_LDataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_1040_LDM dm 			= new SE_SND_1040_LDM();
    	
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);       
        String rptv_route_cd 		= Util.checkString(req.getParameter("rptv_route_cd"));
        String rptv_route_nm 		= Util.checkString(req.getParameter("rptv_route_nm"));
        String rptv_route_clsf 		= Util.checkString(req.getParameter("rptv_route_clsf"));
       
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setRptv_route_cd(rptv_route_cd);
        dm.setRptv_route_nm(rptv_route_nm);
        dm.setRptv_route_clsf(rptv_route_clsf);
        
        try {
        	SE_SND_1000DAO dao = new SE_SND_1000DAO();
            ds = dao.se_snd_1040_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1000EJBHome home = (SE_SND_1000EJBHome) JNDIManager.getInstance().getHome("SE_SND_1000EJB");
//        
//        try {
//        	SE_SND_1000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1040_l(dm);
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
