/***************************************************************************************************
* 파일명   : AdCom1400WB.java
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

package chosun.ciis.ad.com.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.com.dao.AdCom1400DAO;
import chosun.ciis.ad.com.dm.AD_COM_1410_LDM;
import chosun.ciis.ad.com.dm.AD_COM_1420_ADM;
import chosun.ciis.ad.com.dm.AD_COM_1430_ADM;
import chosun.ciis.ad.com.ds.AD_COM_1410_LDataSet;
import chosun.ciis.ad.com.ds.AD_COM_1420_ADataSet;
import chosun.ciis.ad.com.ds.AD_COM_1430_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 광고관리-업무연락-광고원고수배장 / 중점확인광고리스트 확인처리관리 WorkBean
 */

public class AdCom1400WB extends BaseWB {

    /**
     * 광고원고수배장 / 중점확인광고리스트 목록을 조회한다.
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_com_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	
    	AD_COM_1410_LDataSet ds = null;

        //사용자 세션정보 
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        // DM Setting
    	AD_COM_1410_LDM dm = new AD_COM_1410_LDM();
    	
        String search_dt      = Util.checkString(req.getParameter("search_dt"));	//일자       	
     	
        dm.setCmpy_cd(cmpy_cd);
        dm.setSearch_dt(search_dt);        
        

        try {
        	AdCom1400DAO dao = new AdCom1400DAO();
            ds = dao.ad_com_1410_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
        
//        AdCom1400EJBHome home = (AdCom1400EJBHome) JNDIManager.getInstance().getHome("AdCom1400EJB");
//        
//        try {
//       	    AdCom1400EJB ejb = home.create();
//            ds = ejb.ad_com_1410_l(dm);	// 설정된 dm값으로 EJB를 호출한다.
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
     * 업무연락-광고원고수배장 등록, 수정, 삭제
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */

    public void ad_com_1420_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	

    	AD_COM_1420_ADataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);   
    	String incmg_pers_ip= req.getRemoteAddr();
    	String srch_dt = Util.checkString(req.getParameter("srch_dt"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        String flag 		= Util.checkString((String)hash.get("m"));
        String seq 			= Util.checkString((String)hash.get("seq"));
        String chrg_pers	= Util.checkString((String)hash.get("chrg_pers"));
        String advt_cont	= Util.checkString((String)hash.get("advt_cont"));
        String advt_size 	= Util.checkString((String)hash.get("advt_size"));
        String chro_clsf 	= Util.checkString((String)hash.get("chro_clsf"));
        String srch_plac 	= Util.checkString((String)hash.get("srch_plac"));
        String cntc_plac 	= Util.checkString((String)hash.get("cntc_plac"));
        String tm 			= Util.checkString((String)hash.get("tm"));
        String agn 			= Util.checkString((String)hash.get("agn"));
        String sect_clsf	= Util.checkString((String)hash.get("sect_clsf"));
                    
        // DM Setting
    	AD_COM_1420_ADM dm = new AD_COM_1420_ADM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSrch_dt(srch_dt);
    	dm.setSeq(seq);
    	dm.setChrg_pers(chrg_pers);
    	dm.setAdvt_cont(advt_cont);
    	dm.setAdvt_size(advt_size);
    	dm.setChro_clsf(chro_clsf);
    	dm.setSrch_plac(srch_plac);
    	dm.setCntc_plac(cntc_plac);
    	dm.setTm(tm);
    	dm.setAgn(agn);
    	dm.setSect_clsf(sect_clsf);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setFlag(flag.toUpperCase());
    	
    	dm.print();

        try {
        	AdCom1400DAO dao = new AdCom1400DAO();
            ds = dao.ad_com_1420_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdCom1400EJBHome home = (AdCom1400EJBHome) JNDIManager.getInstance().getHome("AdCom1400EJB");
//        
//        try {
//            AdCom1400EJB ejb = home.create();
//            ds = ejb.ad_com_1420_a(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 업무연락-중점확인광고리스트 등록, 수정, 삭제
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_com_1430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	

    	AD_COM_1430_ADataSet ds = null;

        //사용자 세션정보
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
     	String incmg_pers  = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip= req.getRemoteAddr();

    	String cnfm_dt = Util.checkString(req.getParameter("cnfm_dt")); 
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));    	

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        String flag 		= Util.checkString((String)hash.get("m"));
        String seq 			= Util.checkString((String)hash.get("seq"));
        String pubc_side	= Util.checkString((String)hash.get("pubc_side"));
        String advcs		= Util.checkString((String)hash.get("advcs"));
        String std 			= Util.checkString((String)hash.get("std"));
        String slcrg 		= Util.checkString((String)hash.get("slcrg"));
        String cnfm_matt 	= Util.checkString((String)hash.get("cnfm_matt"));
               
        // DM Setting
    	AD_COM_1430_ADM dm = new AD_COM_1430_ADM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setCnfm_dt(cnfm_dt);
    	dm.setSeq(seq);
    	dm.setPubc_side(pubc_side);
    	dm.setAdvcs(advcs);
    	dm.setStd(std);
    	dm.setSlcrg(slcrg);
    	dm.setCnfm_matt(cnfm_matt);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setFlag(flag.toUpperCase());

    	dm.print();

        try {
        	AdCom1400DAO dao = new AdCom1400DAO();
            ds = dao.ad_com_1430_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdCom1400EJBHome home = (AdCom1400EJBHome) JNDIManager.getInstance().getHome("AdCom1400EJB");
//        
//        try {
//            AdCom1400EJB ejb = home.create();
//            ds = ejb.ad_com_1430_a(dm); // 설정된 dm값으로 EJB를 호출한다.
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
}
