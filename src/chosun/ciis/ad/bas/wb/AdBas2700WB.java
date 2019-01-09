/***************************************************************************************************
* 파일명   : AdBas2700WB.java
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
import chosun.ciis.ad.bas.dao.AdBas2700DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2700_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2710_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2720_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2730_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_2740_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_2700_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2710_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2720_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2730_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2740_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 광고관리-기초자료관리 파트관리 WorkBean
 */

public class AdBas2700WB extends BaseWB {

    /**
     * 파트관리 초기
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2700_MDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);

    	//DM Setting
    	AD_BAS_2700_MDM dm = new AD_BAS_2700_MDM();
    	
        dm.setCmpy_cd(cmpy_cd);


        try {
        	AdBas2700DAO dao = new AdBas2700DAO();
            ds = dao.ad_bas_2700_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2700EJBHome home = (AdBas2700EJBHome) JNDIManager.getInstance().getHome("AdBas2700EJB");
//        try {        
//       		AdBas2700EJB ejb = home.create();
//            ds = ejb.ad_bas_2700_m(dm);        
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
     * 파트관리 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2710_LDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf = Util.getSessionParameterValue(req, "dealmedicd", true);	
    	String part_nm 		= Util.checkString(req.getParameter("part_nm"));	
    	String del_yn 		= Util.checkString(StringUtil.nvl(req.getParameter("del_yn"),"N"));
    	
        // DM Setting
    	AD_BAS_2710_LDM dm = new AD_BAS_2710_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setPart_nm(part_nm);
    	dm.setDel_yn(del_yn);

        try {
        	AdBas2700DAO dao = new AdBas2700DAO();
            ds = dao.ad_bas_2710_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2700EJBHome home = (AdBas2700EJBHome) JNDIManager.getInstance().getHome("AdBas2700EJB");
//        try {
//        	AdBas2700EJB ejb = home.create();   
//            ds = ejb.ad_bas_2710_l(dm);        
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
     * 조직관리 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2720_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2720_LDataSet ds = null;

    	String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf 	= Util.getSessionParameterValue(req, "dealmedicd", true);    	
    	String part_cd 		= Util.checkString(req.getParameter("part_cd"));	
    	String acct_nm 		= Util.checkString(req.getParameter("acct_nm"));

        // DM Setting
    	AD_BAS_2720_LDM dm = new AD_BAS_2720_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);        
        dm.setMedi_clsf(medi_clsf);
        dm.setPart_cd(part_cd);
        dm.setAcct_nm(acct_nm);
        
        dm.print();

        try {
        	AdBas2700DAO dao = new AdBas2700DAO();
            ds = dao.ad_bas_2720_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2700EJBHome home = (AdBas2700EJBHome) JNDIManager.getInstance().getHome("AdBas2700EJB");
//        try {        
//        	AdBas2700EJB ejb = home.create();   
//            ds = ejb.ad_bas_2720_l(dm);        
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
     * 파트관리 입력, 수정, 삭제
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2730_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2730_ADataSet ds = null;

        String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String medi_clsf = Util.getSessionParameterValue(req, "dealmedicd", true);    	
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip= req.getRemoteAddr();
    	
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate1"));
    	
        Hashtable hash = getHashMultiUpdateData(multiUpDate);
        
        String flag 	= Util.checkString((String)hash.get("m"));
        String part_cd	= Util.checkString((String)hash.get("part_cd"));
        String part_nm	= Util.checkString((String)hash.get("part_nm"));
        String team_cd 	= Util.checkString((String)hash.get("team_cd"));  
        String del_yn 	= Util.checkString((String)hash.get("del_yn"));                    

        // DM Setting
    	AD_BAS_2730_ADM dm = new AD_BAS_2730_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setPart_cd(part_cd);
    	dm.setPart_nm(part_nm);
    	dm.setTeam_cd(team_cd);
    	dm.setDel_yn(del_yn);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setFlag(flag.toUpperCase());

        try {
        	AdBas2700DAO dao = new AdBas2700DAO();
            ds = dao.ad_bas_2730_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2700EJBHome home = (AdBas2700EJBHome) JNDIManager.getInstance().getHome("AdBas2700EJB");
//        try {        
//        	AdBas2700EJB ejb = home.create();   
//            ds = ejb.ad_bas_2730_a(dm);
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
     * 조직관리 입력, 수정, 삭제
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2740_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2740_ADataSet ds = null;

        String cmpy_cd  		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String medi_clsf 		= Util.getSessionParameterValue(req, "dealmedicd", true);    	
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip	= req.getRemoteAddr();  	
    	String multiUpDate 		= Util.checkString(req.getParameter("multiUpDate2"));
    	   	
        Hashtable hash = getHashMultiUpdateData(multiUpDate);
        
        String flag 		= Util.checkString((String)hash.get("m"));
        String part_cd		= Util.checkString((String)hash.get("part_cd"));
        String acct_id		= Util.checkString((String)hash.get("acct_id"));
        String seq 			= Util.checkString((String)hash.get("seq"));   
        String part_posi	= Util.checkString((String)hash.get("part_posi"));
        String chrg_clsf	= Util.checkString((String)hash.get("chrg_clsf"));
        String chrg_medi	= Util.checkString((String)hash.get("chrg_medi"));        
        String frdt 		= Util.checkString((String)hash.get("frdt"));
        String todt 		= Util.checkString((String)hash.get("todt"));
        String alt_team_pers	= Util.checkString((String)hash.get("alt_team_pers"));
        String alt_chrg_pers	= Util.checkString((String)hash.get("alt_chrg_pers"));
        
        // DM Setting
    	AD_BAS_2740_ADM dm = new AD_BAS_2740_ADM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setPart_cd(part_cd);
        dm.setAcct_id(acct_id);
        dm.setSeq(seq);
        dm.setPart_posi(part_posi);
        dm.setChrg_clsf(chrg_clsf);
        dm.setChrg_medi(chrg_medi);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setAlt_team_pers(alt_team_pers);
        dm.setAlt_chrg_pers(alt_chrg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
    	dm.setFlag(flag.toUpperCase());
    	
    	dm.print();

        try {
        	AdBas2700DAO dao = new AdBas2700DAO();
            ds = dao.ad_bas_2740_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//         
//        AdBas2700EJBHome home = (AdBas2700EJBHome) JNDIManager.getInstance().getHome("AdBas2700EJB");
//        try {        
//        	AdBas2700EJB ejb = home.create();   
//            ds = ejb.ad_bas_2740_a(dm);
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
