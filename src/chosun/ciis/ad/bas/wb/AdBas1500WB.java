/***************************************************************************************************
* 파일명   : AdBas1500WB.java
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

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas1500DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1500_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1510_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1511_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1512_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1520_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1521_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1530_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1540_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1550_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1555_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1570_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1580_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1590_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1500_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1510_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1511_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1512_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1520_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1521_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1530_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1540_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1550_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1555_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1570_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1580_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1590_ADataSet;
import chosun.ciis.ad.common.wb.AttachFileVO;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 광고관리-기초자료관리 일일보고 WorkBean
 */

public class AdBas1500WB extends BaseWB {

    /**
     * 일일보고,일일보고등록-메인페이지
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1500_MDataSet ds = null;

        // DM Setting
    	AD_BAS_1500_MDM dm = new AD_BAS_1500_MDM();
        String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String page_id = Util.checkString(req.getParameter("page_id"));
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setPage_id(page_id);
        
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1500_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
        
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        try {        
//        	AdBas1500EJB ejb = home.create();        
//            ds = ejb.ad_bas_1500_m(dm);        
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
     * 일일보고-거래처접촉자료,야근일지 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1510_LDataSet ds = null;

        // DM Setting
    	AD_BAS_1510_LDM dm = new AD_BAS_1510_LDM();
        String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String rept_clsf 	= Util.checkString(req.getParameter("rept_clsf"));
    	String medi_clsf	= Util.checkString(req.getParameter("medi_clsf"));
    	String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
    	String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
    	String advcs_clsf 	= Util.checkString(req.getParameter("advcs_clsf"));
    	String patr_chrg_pers = Util.checkString(req.getParameter("patr_chrg_pers"));
    	String chrg_pers 	= Util.checkString(req.getParameter("chrg_pers"));
    	String search_wd 	= Util.checkString(req.getParameter("search_wd"));
    	String dlco_no 	= Util.checkString(req.getParameter("dlco_no"));
    	String sch_clsf 	= Util.checkString(req.getParameter("sch_clsf"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRept_clsf(rept_clsf);
        dm.setMedi_clsf(medi_clsf);
        dm.setSearch_dt_fr(search_dt_fr);
        dm.setSearch_dt_to(search_dt_to);
        dm.setAdvcs_clsf(advcs_clsf);
        dm.setPatr_chrg_pers(patr_chrg_pers);
        dm.setChrg_pers(chrg_pers);
        dm.setSearch_wd(search_wd);
        dm.setDlco_no(dlco_no);
        dm.setSch_clsf(sch_clsf);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
        
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1510_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
//        
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        try {        
//        	AdBas1500EJB ejb = home.create();   
//            ds = ejb.ad_bas_1510_l(dm);        
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
     * 일일보고-거래처접촉자료,야근일지 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1511_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1511_LDataSet ds = null;

        // DM Setting
    	AD_BAS_1511_LDM dm = new AD_BAS_1511_LDM();
        String cmpy_cd  		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String rept_clsf 		= "02";//Util.checkString(req.getParameter("rept_clsf"));
    	String medi_clsf		= Util.checkString(req.getParameter("medi_clsf"));
    	String search_dt_fr 	= Util.checkString(req.getParameter("search_dt_fr"));
    	String search_dt_to 	= Util.checkString(req.getParameter("search_dt_to"));
    	String advcs_clsf 		= Util.checkString(req.getParameter("advcs_clsf"));
    	String patr_chrg_pers 	= Util.checkString(req.getParameter("patr_chrg_pers"));
    	String chrg_pers 		= Util.checkString(req.getParameter("chrg_pers"));
    	String search_wd 		= Util.checkString(req.getParameter("search_wd"));
    	String dlco_no 	= Util.checkString(req.getParameter("dlco_no"));
    	String sch_clsf 	= Util.checkString(req.getParameter("sch_clsf"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRept_clsf(rept_clsf);
        dm.setMedi_clsf(medi_clsf);
        dm.setSearch_dt_fr(search_dt_fr);
        dm.setSearch_dt_to(search_dt_to);
        dm.setAdvcs_clsf(advcs_clsf);
        dm.setPatr_chrg_pers(patr_chrg_pers);
        dm.setChrg_pers(chrg_pers);
        dm.setSearch_wd(search_wd);
        dm.setDlco_no(dlco_no);
        dm.setSch_clsf(sch_clsf);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
        
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1511_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
//        
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        try {        
//        	AdBas1500EJB ejb = home.create();   
//            ds = ejb.ad_bas_1511_l(dm);        
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
     * 일일보고-지사업무보고 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1512_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1512_LDataSet ds = null;

        // DM Setting
    	AD_BAS_1512_LDM dm = new AD_BAS_1512_LDM();
        String cmpy_cd  		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String rept_clsf 		= "03";//Util.checkString(req.getParameter("rept_clsf"));
    	String medi_clsf		= Util.checkString(req.getParameter("medi_clsf"));
    	String search_dt_fr 	= Util.checkString(req.getParameter("search_dt_fr"));
    	String search_dt_to 	= Util.checkString(req.getParameter("search_dt_to"));
    	String advcs_clsf 		= Util.checkString(req.getParameter("advcs_clsf"));
    	String patr_chrg_pers 	= Util.checkString(req.getParameter("patr_chrg_pers"));
    	String chrg_pers 		= Util.checkString(req.getParameter("chrg_pers"));
    	String search_wd 		= Util.checkString(req.getParameter("search_wd"));
    	String dlco_no 	        = Util.checkString(req.getParameter("dlco_no"));
    	String sch_clsf 	    = Util.checkString(req.getParameter("sch_clsf"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRept_clsf(rept_clsf);
        dm.setMedi_clsf(medi_clsf);
        dm.setSearch_dt_fr(search_dt_fr);
        dm.setSearch_dt_to(search_dt_to);
        dm.setAdvcs_clsf(advcs_clsf);
        dm.setPatr_chrg_pers(patr_chrg_pers);
        dm.setChrg_pers(chrg_pers);
        dm.setSearch_wd(search_wd);
        dm.setDlco_no(dlco_no);
        dm.setSch_clsf(sch_clsf);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
        
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1512_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
    }
    
    /**
     * 일일보고-야근일지 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	AD_BAS_1520_LDataSet ds = null;

        // DM Setting
    	AD_BAS_1520_LDM dm = new AD_BAS_1520_LDM();
        String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
    	String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setSearch_dt_fr(search_dt_fr);
        dm.setSearch_dt_to(search_dt_to);
        dm.setIncmg_pers(incmg_pers);
        
//        //dm.print();
        
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1520_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
//        
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        try {        
//        	AdBas1500EJB ejb = home.create();   
//            ds = ejb.ad_bas_1520_l(dm);        
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
     * 일일보고-관리정보 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1521_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	AD_BAS_1521_LDataSet ds = null;

        // DM Setting
    	AD_BAS_1521_LDM dm = new AD_BAS_1521_LDM();
        String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
    	String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
    	String search_wd    = Util.checkString(req.getParameter("search_wd"));
    	String dlco_no      = Util.checkString(req.getParameter("dlco_no"));
    	String chrg_pers    = Util.checkString(req.getParameter("chrg_pers_nm"));
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setSearch_dt_fr(search_dt_fr);
        dm.setSearch_dt_to(search_dt_to);
        dm.setSearch_wd(search_wd);
        dm.setDlco_no(dlco_no);
        dm.setChrg_pers(chrg_pers);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
        
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1521_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
    }    
    /**
     * 일일보고-팀장의견 저장,삭제
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1530_ADataSet ds = null;

        // DM Setting
    	AD_BAS_1530_ADM dm = new AD_BAS_1530_ADM();
        String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String rept_clsf = Util.checkString(req.getParameter("rept_clsf"));
    	String make_dt = Util.checkString(req.getParameter("make_dt"));
    	String rept_no = Util.checkString(req.getParameter("rept_no"));
    	String taem_chf_opn = Util.checkString(req.getParameter("taem_chf_opn"));
    	String flag = Util.checkString(req.getParameter("flag"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRept_clsf(rept_clsf);
        dm.setMake_dt(make_dt);
        dm.setRept_no(Long.parseLong(rept_no));
        dm.setTaem_chf_opn(taem_chf_opn);
        dm.setIncmg_pers(incmg_pers);
        dm.setFlag(flag);
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1530_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
//        
//        
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        try {        
//        	AdBas1500EJB ejb = home.create();   
//            ds = ejb.ad_bas_1530_a(dm);
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
     * 일일보고등록-상세조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1540_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1540_SDataSet ds = null;

        String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String rept_clsf 	= Util.checkString(req.getParameter("rept_clsf"));
    	String make_dt 		= Util.checkString(req.getParameter("make_dt"));
    	String rept_no 		= Util.checkString(req.getParameter("rept_no"));
    	String page_id 		= Util.checkString(req.getParameter("page_id"));
    	String incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);    

        // DM Setting
    	AD_BAS_1540_SDM dm = new AD_BAS_1540_SDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setRept_clsf(rept_clsf);
        dm.setMake_dt(make_dt);
        dm.setRept_no(rept_no);
        dm.setPage_id(page_id);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
       
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1540_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
//        
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        try {        
//        	AdBas1500EJB ejb = home.create();   
//            ds = ejb.ad_bas_1540_s(dm);
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
     * 일일보고등록-입력,수정,삭제
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1550_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	AD_BAS_1550_ADataSet ds = null;
    	
        String cmpy_cd  		= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers  		= Util.getSessionParameterValue(req, "emp_no", true);   // 조회사원     
        String incmg_pers_ip	= req.getRemoteAddr();
        
        String rept_clsf		= Util.checkString(req.getParameter("rept_clsf"));
    	String make_dt			= Util.checkString(req.getParameter("make_dt"));
    	String rept_no			= Util.checkString(req.getParameter("rept_no"));
    	String advcs_clsf  		= Util.checkString(req.getParameter("advcs_clsf"));
    	String medi_clsf		= Util.checkString(req.getParameter("medi_clsf"));
    	String data_clsf		= Util.checkString(req.getParameter("data_clsf"));
    	String chrg_pers		= Util.checkString(req.getParameter("chrg_pers"));
    	String dlco_no			= Util.checkString(req.getParameter("dlco_no"));
    	String patr_chrg_pers  	= Util.checkString(req.getParameter("patr_chrg_pers"));
    	String titl				= /*Util.checkString*/(req.getParameter("titl"));
    	System.out.println("cont::"+/*Util.checkString*/(req.getParameter("cont")));
    	String cont				= /*Util.checkString*/(req.getParameter("cont"));
    	String add_file_no1  	= Util.checkString(req.getParameter("add_file_no1"));
    	String add_file_no2  	= Util.checkString(req.getParameter("add_file_no2"));
    	String add_file_no3  	= Util.checkString(req.getParameter("add_file_no3"));
    	String add_file_no4  	= Util.checkString(req.getParameter("add_file_no4"));
    	String add_file_no5  	= Util.checkString(req.getParameter("add_file_no5"));
    	String file_delyn1    	= Util.checkString(req.getParameter("file_delyn1"));
    	String file_delyn2    	= Util.checkString(req.getParameter("file_delyn2"));
    	String file_delyn3    	= Util.checkString(req.getParameter("file_delyn3"));
    	String file_delyn4    	= Util.checkString(req.getParameter("file_delyn4"));
    	String file_delyn5    	= Util.checkString(req.getParameter("file_delyn5"));
    	if (file_delyn1.equals("")){ file_delyn1 = "N"; }
    	if (file_delyn2.equals("")){ file_delyn2 = "N"; }
    	if (file_delyn3.equals("")){ file_delyn3 = "N"; }
    	if (file_delyn4.equals("")){ file_delyn4 = "N"; }
    	if (file_delyn5.equals("")){ file_delyn5 = "N"; }
    	String flag       	 	= Util.checkString(req.getParameter("flag"));
    	
        ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
        
       try{
	        //titl = new String(titl.getBytes("8859_1"), "EUC-KR");
	        //String cont2 = new String(cont.getBytes("8859_1"), "EUC-KR");
	        //System.out.println("cont2::"+cont2);	
        }catch(Exception e){
//        	
        }
        
//      DM Setting
        AD_BAS_1550_ADM dm = new AD_BAS_1550_ADM();
        
        //삭제, 파일삭제일때는 미실행
        if (!"D".equals(flag) && ("N".equals(file_delyn1) || "N".equals(file_delyn2) || "N".equals(file_delyn3) || "N".equals(file_delyn4) || "N".equals(file_delyn5))){
        	if(attcFiles != null){
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file1(attachFileVO.getAttcFilCont());
			            if (!flag.equals("I") && (!add_file_no1.equals(""))) {
			            	dm.setAdd_file_no1(add_file_no1);
			            }
		        	}else if(i==1){		//2번째 첨부
			        	dm.setAdd_file_nm2(attachFileVO.getAttcFilNm());
			          	dm.setAdd_file2(attachFileVO.getAttcFilCont());
			          	if (!flag.equals("I")  && (!add_file_no2.equals(""))) {
			            	dm.setAdd_file_no2(add_file_no2);
			            }
		        	}else if(i==2){		//3번째 첨부
			        	dm.setAdd_file_nm3(attachFileVO.getAttcFilNm());
			        	dm.setAdd_file3(attachFileVO.getAttcFilCont());                
			        	if (!flag.equals("I") && (!add_file_no3.equals(""))) {
			        		dm.setAdd_file_no3(add_file_no3);		                	
			         	}
		        	}else if(i==3){		//4번째 첨부
			        	dm.setAdd_file_nm4(attachFileVO.getAttcFilNm());
			        	dm.setAdd_file4(attachFileVO.getAttcFilCont());
			        	if (!flag.equals("I") && (!add_file_no4.equals(""))) {
			        		dm.setAdd_file_no4(add_file_no4);
			         	}
		        	}else if(i==4){		//5번째 첨부
		        		dm.setAdd_file_nm5(attachFileVO.getAttcFilNm());
		        		dm.setAdd_file5(attachFileVO.getAttcFilCont());
		        		if (!flag.equals("I") && (!add_file_no5.equals(""))) {
		        			dm.setAdd_file_no5(add_file_no5);
			        	}
		        	}
		        }    
        	}
        }
        
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRept_clsf(rept_clsf);
        dm.setMake_dt(make_dt);
        dm.setRept_no(rept_no);
        dm.setAdvcs_clsf(advcs_clsf);
        dm.setMedi_clsf(medi_clsf);
        dm.setData_clsf(data_clsf);
        dm.setChrg_pers(chrg_pers);
        dm.setDlco_no(dlco_no);
        dm.setPatr_chrg_pers(patr_chrg_pers);
        dm.setTitl(titl);
        dm.setCont(StringUtil.replaceToXml(cont));
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);        
        dm.setFile_delyn1(file_delyn1);
        dm.setFile_delyn2(file_delyn2);
        dm.setFile_delyn3(file_delyn3);
        dm.setFile_delyn4(file_delyn4);
        dm.setFile_delyn5(file_delyn5);
        dm.setFlag(flag);

        dm.print();
        
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1550_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
//        
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        try {
//        	AdBas1500EJB ejb = home.create();
//        	ds = ejb.ad_bas_1550_a(dm);
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
    
    /**
     * 일일보고-첨부파일저장
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1555_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1555_ADataSet ds = null;

        //사용자 세션정보
        String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);   	
    	String rept_clsf 	= Util.checkString(req.getParameter("rept_clsf"));
    	String make_dt 		= Util.checkString(req.getParameter("make_dt"));
    	String rept_no 		= Util.checkString(req.getParameter("rept_no"));
    	String add_file_no = "";
    	String add_file_seq = Util.checkString(req.getParameter("add_file_seq"));
    	if (add_file_seq.equals("add_file_no1")){
    		add_file_no = Util.checkString(req.getParameter("add_file_no1"));
    	}else if(add_file_seq.equals("add_file_no2")){
    		add_file_no = Util.checkString(req.getParameter("add_file_no2"));   		
    	}else if(add_file_seq.equals("add_file_no3")){
    		add_file_no = Util.checkString(req.getParameter("add_file_no3"));   		
    	}else if(add_file_seq.equals("add_file_no4")){
    		add_file_no = Util.checkString(req.getParameter("add_file_no4"));   		
    	}else if(add_file_seq.equals("add_file_no5")){
    		add_file_no = Util.checkString(req.getParameter("add_file_no5"));   		
    	}
    	 	
    	AD_BAS_1555_ADM dm = new AD_BAS_1555_ADM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRept_clsf(rept_clsf);
    	dm.setMake_dt(make_dt);
    	dm.setRept_no(Long.parseLong(rept_no));
    	dm.setAdd_file_no(Long.parseLong(add_file_no));
    	
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1555_a(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
            req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.
        }  
        catch (AppException e) {
            throw e;
        }
        
//    	AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//    	
//        try {
//        	AdBas1500EJB ejb = home.create();
//            ds = ejb.ad_bas_1555_a(dm); // 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
//            req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.
//        } catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        } catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 일일보고등록-프로필 조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1560_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    }
    
    /**
     * 야근일지-상세조회
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1570_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_1570_SDataSet ds = null;

        String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String seq = Util.checkString(req.getParameter("seq"));
    	String night_shift_dt = Util.checkString(req.getParameter("night_shift_dt"));
        
    	System.out.println("cmpy_cd : "+cmpy_cd);    	
    	System.out.println("seq : "+seq);
    	System.out.println("night_shift_dt : "+night_shift_dt);
        
    	// DM Setting
    	AD_BAS_1570_SDM dm = new AD_BAS_1570_SDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSeq(Long.parseLong(seq));
    	dm.setNight_shift_dt(night_shift_dt);
        
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1570_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 	
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        try {        
//        	AdBas1500EJB ejb = home.create();   
//            ds = ejb.ad_bas_1570_s(dm);        
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
     * 야근일지-입력,수정,삭제
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1580_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1580_ADataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	String seq = Util.checkString(req.getParameter("seq"));
    	String night_shift_dt = Util.checkString(req.getParameter("night_shift_dt"));
    	String duty_main_empno = Util.checkString(req.getParameter("duty_main_empno"));
    	String duty_sub_empno = Util.checkString(req.getParameter("duty_sub_empno"));
    	String make_centr_main_empno = Util.checkString(req.getParameter("make_centr_main_empno"));
    	String make_centr_sub_empno = Util.checkString(req.getParameter("make_centr_sub_empno"));
    	String dd_nwsp_cont = Util.checkString(req.getParameter("dd_nwsp_cont"));
    	String flag = Util.checkString(req.getParameter("flag"));
   	
        // DM Setting
    	AD_BAS_1580_ADM dm = new AD_BAS_1580_ADM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	if (!flag.equals("I")) {
    		dm.setSeq(Long.parseLong(seq));
        }    	
    	dm.setNight_shift_dt(night_shift_dt);
    	dm.setDuty_main_empno(duty_main_empno);
    	dm.setDuty_sub_empno(duty_sub_empno);  	
    	dm.setMake_centr_main_empno(make_centr_main_empno);
    	dm.setMake_centr_sub_empno(make_centr_sub_empno);
    	dm.setDd_nwsp_cont(dd_nwsp_cont);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setFlag(flag);
    	
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1580_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }
        
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        
//        try {        
//        	AdBas1500EJB ejb = home.create();
//            ds = ejb.ad_bas_1580_a(dm);
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
     * 야근일지-입력,수정,삭제
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_1590_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_1590_ADataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String rept_clsf = Util.checkString(req.getParameter("rept_clsf"));
    	String make_dt = Util.checkString(req.getParameter("make_dt"));
    	String rept_no = Util.checkString(req.getParameter("rept_no"));
    	String add_file_no = Util.checkString(req.getParameter("add_file_no"));
   	
        // DM Setting
    	AD_BAS_1590_ADM dm = new AD_BAS_1590_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRept_clsf(rept_clsf);
    	dm.setMake_dt(make_dt);
    	dm.setRept_no(rept_no);
    	dm.setAdd_file_no(add_file_no);
    	
    	dm.print();
    	
        try {
        	AdBas1500DAO dao = new AdBas1500DAO();
            ds = dao.ad_bas_1590_a(dm);
            req.setAttribute("ds", ds);
	        req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
	        req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.            
        }  
        catch (AppException e) {
            throw e;
        }   	
//        AdBas1500EJBHome home = (AdBas1500EJBHome) JNDIManager.getInstance().getHome("AdBas1500EJB");
//        
//        try {        
//        	AdBas1500EJB ejb = home.create();
//            ds = ejb.ad_bas_1590_a(dm);
//            req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
//            req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.
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
