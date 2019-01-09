/***************************************************************************************************
* 파일명   : AdBrn1800WB.java
* 기능     : Servlet에서 받은 parameter를 이용하여 dm을 set하고
*            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/

package chosun.ciis.ad.brn.wb;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.brn.dao.AdBrn1800DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1810_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1820_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1810_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1820_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 광고관리-광고지사 예약현황 WorkBean
 */

public class AdBrn1800WB extends BaseWB {


	public static final String PRENG_ADVT_BO = "00038160";
    /**
     * 예약현황 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	
    	AD_BRN_1810_LDataSet ds = null;
  
        //사용자 세션정보
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);

        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
        String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
        String bo_chrg_appv 	= Util.checkString(req.getParameter("bo_chrg_appv"));
        String frdt 			= Util.checkString(req.getParameter("frdt"));
        String todt 			= Util.checkString(req.getParameter("todt"));
        
        // DM Setting
        AD_BRN_1810_LDM dm = new AD_BRN_1810_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setPreng_advt_bo(preng_advt_bo);
        dm.setMedi_cd(medi_cd);
        dm.setBo_chrg_appv(bo_chrg_appv);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        
//    	//dm.print();


        try {
        	AdBrn1800DAO dao = new AdBrn1800DAO();
            ds = dao.ad_brn_1810_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1800EJBHome home = (AdBrn1800EJBHome) JNDIManager.getInstance().getHome("AdBrn1800EJB");
//        
//        try {
//       	    AdBrn1800EJB ejb = home.create();
//            ds = ejb.ad_brn_1810_l(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
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
     * 예약현황 승인처리
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException, IOException {
    	
    	AD_BRN_1820_ADataSet ds = null;
    	
        byte[] add_file = (byte[])req.getAttribute("add_file");

        // Request Parameter Processing
        String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);

        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
        String incmg_pers_ip = req.getRemoteAddr();
    	
        String multiUpdateData	=	Util.checkString(req.getParameter("multiUpdateData"));
        
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        String medi_cd 			= Util.checkString((String)hash.get("medi_cd"));
        String preng_occr_dt 	= Util.checkString((String)hash.get("preng_occr_dt"));
        String preng_occr_seq 	= Util.checkString((String)hash.get("preng_occr_seq"));
        String bo_chrg_aprv 	= Util.checkString((String)hash.get("bo_chrg_aprv"));

        // DM Setting
        AD_BRN_1820_ADM dm = new AD_BRN_1820_ADM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);
        dm.setBo_chrg_aprv(bo_chrg_aprv);
        dm.setIncmg_pers(preng_advt_bo);
        
//        //dm.print();

        try {
        	AdBrn1800DAO dao = new AdBrn1800DAO();
            ds = dao.ad_brn_1820_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        
//        AdBrn1800EJBHome home = (AdBrn1800EJBHome) JNDIManager.getInstance().getHome("AdBrn1800EJB");
//        try {
//            AdBrn1800EJB ejb = home.create();            
//            ds = ejb.ad_brn_1820_a(dm);         
//            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
