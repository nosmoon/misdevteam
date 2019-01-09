/***************************************************************************************************
* 파일명 : SE_SND_3600WB.java
* 기능 : 판매 - 노선관리 - 노선인쇄처 변경
 * 작성일자 : 2009.06.24
 * 작성자 :   이근탁
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
import chosun.ciis.se.snd.dao.SE_SND_3600DAO;
import chosun.ciis.se.snd.dm.SE_SND_3600_MDM;
import chosun.ciis.se.snd.dm.SE_SND_3610_LDM;
import chosun.ciis.se.snd.dm.SE_SND_3620_ADM;
import chosun.ciis.se.snd.ds.SE_SND_3600_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3610_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3620_ADataSet;
/**
 * 
 */

public class SE_SND_3600WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_3600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_3600_MDataSet ds = null;

        // DM Setting
        SE_SND_3600_MDM dm = new SE_SND_3600_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_3600DAO dao = new SE_SND_3600DAO();
            ds = dao.se_snd_3600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3600EJBHome home = (SE_SND_3600EJBHome) JNDIManager.getInstance().getHome("SE_SND_3600EJB");
//        
//        try {
//        	SE_SND_3600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3600_m(dm);
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
    public void se_snd_3610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_3610_LDataSet ds = null;

        // DM Setting
        SE_SND_3610_LDM dm = new SE_SND_3610_LDM();

        
        String prt_plac_cd 		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"	));        
        String medi_cd	 		= Util.checkString(req.getParameter("medi_cd"		));
        String qty_yn	 		= Util.checkString(req.getParameter("qty_yn"		));
        
        
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setRoute_clsf(route_clsf);
        
        dm.setMedi_cd(medi_cd);
        dm.setQty_yn(qty_yn);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_3600DAO dao = new SE_SND_3600DAO();
            ds = dao.se_snd_3610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3600EJBHome home = (SE_SND_3600EJBHome) JNDIManager.getInstance().getHome("SE_SND_3600EJB");
//        
//        try {
//        	SE_SND_3600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3610_l(dm);
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
    
     
    public void se_snd_3620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_3620_ADataSet ds = null;
    	
    	//DM Setting
        SE_SND_3620_ADM dm = new SE_SND_3620_ADM();

    	
    	//노선 정보 그리드
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdate1=" + multiUpdateData);
    	
    	Hashtable hash 				= getHashMultiUpdateData(multiUpdateData);
    	//노선 정보    	
    	String route_clsf 			= (String)hash.get("rptv_route_clsf");
    	String rptv_route_cd 		= (String)hash.get("rptv_route_cd");
    	String route_cd 			= (String)hash.get("route_cd");
    	String medi_cd 				= Util.checkString(req.getParameter("medi_cd"));
    	String prt_plac_cd_ch 		= Util.checkString(req.getParameter("prt_plac_cd_ch"));
    	
    	
    	
    	String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "uid", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
    	

        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setRptv_route_cd(rptv_route_cd);
        dm.setRoute_cd(route_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPrt_plac_cd_ch(prt_plac_cd_ch);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);

        try {
        	SE_SND_3600DAO dao = new SE_SND_3600DAO();
            ds = dao.se_snd_3620_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_3600EJBHome home = (SE_SND_3600EJBHome) JNDIManager.getInstance().getHome("SE_SND_3600EJB");
//        
//        try {
//        	SE_SND_3600EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_3620_a(dm);
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
