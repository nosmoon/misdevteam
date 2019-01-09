/***************************************************************************************************
* 파일명   : AdBas2600WB.java
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

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas2600DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2600_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2610_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2615_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2620_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2630_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2640_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2650_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_2600_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2610_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2615_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2620_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2630_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2640_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2650_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 광고관리-기초자료관리 목표관리 WorkBean
 */

public class AdBas2600WB extends BaseWB {

    /**
     * 목표관리 초기
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2600_MDataSet ds = null;

        // DM Setting
    	AD_BAS_2600_MDM dm = new AD_BAS_2600_MDM();
        String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	AdBas2600DAO dao = new AdBas2600DAO();
            ds = dao.ad_bas_2600_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2600EJBHome home = (AdBas2600EJBHome) JNDIManager.getInstance().getHome("AdBas2600EJB");
//        try {        
//       		AdBas2600EJB ejb = home.create();
//            ds = ejb.ad_bas_2600_m(dm);        
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
     * 목표관리 조회(매체별)
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2610_LDataSet ds = null;

        // DM Setting
    	AD_BAS_2610_LDM dm 	= new AD_BAS_2610_LDM();
        String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String trgt_clsf 	= Util.checkString(req.getParameter("trgt_clsf"));
    	String trgt_yymm 	= Util.checkString(req.getParameter("trgt_yymm"));

        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);
        dm.setTrgt_yymm(trgt_yymm);

        dm.print();

        try {
        	AdBas2600DAO dao = new AdBas2600DAO();
            ds = dao.ad_bas_2610_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2600EJBHome home = (AdBas2600EJBHome) JNDIManager.getInstance().getHome("AdBas2600EJB");
//        try {
//        	AdBas2600EJB ejb = home.create();   
//            ds = ejb.ad_bas_2610_l(dm);        
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
     * 목표관리 조회(매체별)
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2615_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2615_LDataSet ds = null;

        // DM Setting
    	AD_BAS_2615_LDM dm 	= new AD_BAS_2615_LDM();
        String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String trgt_clsf 	= Util.checkString(req.getParameter("trgt_clsf"));
    	String trgt_yymm 	= Util.checkString(req.getParameter("trgt_yymm"));

        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);
        dm.setTrgt_yymm(trgt_yymm);

        dm.print();

        try {
        	AdBas2600DAO dao = new AdBas2600DAO();
            ds = dao.ad_bas_2615_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2600EJBHome home = (AdBas2600EJBHome) JNDIManager.getInstance().getHome("AdBas2600EJB");
//        try {
//        	AdBas2600EJB ejb = home.create();   
//            ds = ejb.ad_bas_2615_l(dm);        
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
     * 목표관리 조회(영업팀별)
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2620_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	AD_BAS_2620_LDataSet ds = null;

        // DM Setting
    	AD_BAS_2620_LDM dm = new AD_BAS_2620_LDM();
        String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String trgt_clsf 	= Util.checkString(req.getParameter("trgt_clsf"));
    	String trgt_yymm 	= Util.checkString(req.getParameter("trgt_yymm"));	
    	
        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);        
        dm.setTrgt_yymm(trgt_yymm);

        try {
        	AdBas2600DAO dao = new AdBas2600DAO();
            ds = dao.ad_bas_2620_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2600EJBHome home = (AdBas2600EJBHome) JNDIManager.getInstance().getHome("AdBas2600EJB");
//        try {        
//        	AdBas2600EJB ejb = home.create();   
//            ds = ejb.ad_bas_2620_l(dm);        
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
     * 목표관리 조회(담당별)
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2630_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2630_LDataSet ds = null;

        // DM Setting
    	AD_BAS_2630_LDM dm = new AD_BAS_2630_LDM();

        String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String trgt_clsf 	= Util.checkString(req.getParameter("trgt_clsf"));
    	String trgt_yymm 	= Util.checkString(req.getParameter("trgt_yymm"));
    	String chrg_pers 	= Util.checkString(req.getParameter("chrg_pers"));
    	
        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);        
        dm.setTrgt_yymm(trgt_yymm);
        dm.setChrg_pers(chrg_pers);
         

        try {
        	AdBas2600DAO dao = new AdBas2600DAO();
            ds = dao.ad_bas_2630_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2600EJBHome home = (AdBas2600EJBHome) JNDIManager.getInstance().getHome("AdBas2600EJB");
//        try {        
//        	AdBas2600EJB ejb = home.create();   
//            ds = ejb.ad_bas_2630_l(dm);
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
     * 목표관리 조회(광고지사별)
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2640_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2640_LDataSet ds = null;

        // DM Setting
    	AD_BAS_2640_LDM dm = new AD_BAS_2640_LDM();

        String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String trgt_clsf 	= Util.checkString(req.getParameter("trgt_clsf"));
    	String trgt_yymm 	= Util.checkString(req.getParameter("trgt_yymm"));
    	
        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);
        dm.setTrgt_yymm(trgt_yymm);

        try {
        	AdBas2600DAO dao = new AdBas2600DAO();
            ds = dao.ad_bas_2640_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2600EJBHome home = (AdBas2600EJBHome) JNDIManager.getInstance().getHome("AdBas2600EJB");
//        try {        
//        	AdBas2600EJB ejb = home.create();   
//            ds = ejb.ad_bas_2640_l(dm);
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
     * 목표관리 목표액 저장
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2650_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2650_ADataSet ds = null;


        String cmpy_cd  		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip	= req.getRemoteAddr();    	
    	String multiUpdateData	= Util.checkString(req.getParameter("multiUpdateData"));
    	
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
        String flag 	 	= Util.checkString((String)hash.get("m"));
        String trgt_clsf	= Util.checkString((String)hash.get("trgt_clsf"));
        String trgt_yymm	= Util.checkString((String)hash.get("trgt_yymm"));
        String trgt_obj	 	= Util.checkString((String)hash.get("trgt_obj"));
        String trgt_amt	 	= Util.checkString((String)hash.get("cur_trgt_amt"));
        String team_cd	 	= Util.checkString((String)hash.get("team_cd"));
        String part_cd	 	= Util.checkString((String)hash.get("part_cd"));
        String chrg_emp_no	= Util.checkString((String)hash.get("chrg_emp_no"));

        // DM Setting
    	AD_BAS_2650_ADM dm = new AD_BAS_2650_ADM();
        dm.setCmpy_cd(cmpy_cd);        
        dm.setTrgt_clsf(trgt_clsf);
        dm.setTrgt_obj(trgt_obj);
        dm.setTrgt_yymm(trgt_yymm);
        dm.setTrgt_amt(StringUtil.strip(trgt_amt, ","));     
        dm.setTeam_cd(team_cd);
        dm.setPart_cd(part_cd);   
        dm.setChrg_emp_no(chrg_emp_no);   
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
    	dm.setFlag(flag.toUpperCase());
    	
    	dm.print();

        try {
        	AdBas2600DAO dao = new AdBas2600DAO();
            ds = dao.ad_bas_2650_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2600EJBHome home = (AdBas2600EJBHome) JNDIManager.getInstance().getHome("AdBas2600EJB");
//        try {        
//        	AdBas2600EJB ejb = home.create();   
//            ds = ejb.ad_bas_2650_a(dm);
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
