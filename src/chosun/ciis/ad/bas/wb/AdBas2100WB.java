/***************************************************************************************************
* 파일명 : .java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas2100DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2100_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2110_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2110_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2120_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2130_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_2140_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_2100_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2110_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2110_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2120_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2130_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2140_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas2100WB extends BaseWB {

     /**
     * 업무구분, 코드구분의 combobox 데이타가져오기
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2100_MDataSet ds = null;

        // DM Setting
    	AD_BAS_2100_MDM dm = new AD_BAS_2100_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
                 
        dm.setCmpy_cd(cmpy_cd);
       
        try {
        	AdBas2100DAO dao = new AdBas2100DAO();
            ds = dao.ad_bas_2100_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }    
        
//    	AdBas2100EJBHome home = (AdBas2100EJBHome) JNDIManager.getInstance().getHome("AdBas2100EJB");
//        try {
//        	AdBas2100EJB ejb = home.create();
//            ds = ejb.ad_bas_2100_m(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//           SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

    
    /**
     * 거래처인물정보 리스트
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2100_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2110_LDataSet ds = null;

        // DM Setting
    	AD_BAS_2110_LDM dm = new AD_BAS_2110_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String cmpy_nm = Util.checkString(req.getParameter("cmpy_nm"));
    	String cur_job = Util.checkString(req.getParameter("cur_job"));
    	String flnm = Util.checkString(req.getParameter("flnm"));
    	String cust_mang_item = Util.checkString(req.getParameter("cust_mang_item"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setCmpy_nm(cmpy_nm);
    	dm.setCur_job(cur_job);
    	dm.setFlnm(flnm);
    	dm.setCust_mang_item(cust_mang_item);

        try {
        	AdBas2100DAO dao = new AdBas2100DAO();
            ds = dao.ad_bas_2100_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }    
        
//        AdBas2100EJBHome home = (AdBas2100EJBHome) JNDIManager.getInstance().getHome("AdBas2100EJB");
//        try {
//        	AdBas2100EJB ejb = home.create();
//            ds = ejb.ad_bas_2100_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   
    
    
    /**
     * 거래처인물정보 고객관리내역 리스트
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2120_LDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	    	
        // DM Setting
    	AD_BAS_2120_LDM dm = new AD_BAS_2120_LDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setMedi_clsf(medi_clsf);

        try {
        	AdBas2100DAO dao = new AdBas2100DAO();
            ds = dao.ad_bas_2120_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }    
//        
//        AdBas2100EJBHome home = (AdBas2100EJBHome) JNDIManager.getInstance().getHome("AdBas2100EJB");
//        try {
//        	AdBas2100EJB ejb = home.create();
//            ds = ejb.ad_bas_2120_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }  
    
    
    /**
     * 거래처인물정보 상세
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2110_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2110_SDataSet ds = null;

        // DM Setting
    	AD_BAS_2110_SDM dm = new AD_BAS_2110_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String prfl_no = Util.checkString(req.getParameter("prfl_no"));
                      
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setPrfl_no(prfl_no);
        
        try {
        	AdBas2100DAO dao = new AdBas2100DAO();
            ds = dao.ad_bas_2110_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas2100EJBHome home = (AdBas2100EJBHome) JNDIManager.getInstance().getHome("AdBas2100EJB");
//        try {
//        	AdBas2100EJB ejb = home.create();
//            ds = ejb.ad_bas_2110_s(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    } 
        
    
    /**
     * 거래처인물정보 등록,수정,삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2130_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2130_ADataSet ds = null;
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String flag = Util.checkString(req.getParameter("flag"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String prfl_no = Util.checkString(req.getParameter("prfl_no"));
    	String flnm = Util.checkString(req.getParameter("flnm"));
    	String chin_flnm = Util.checkString(req.getParameter("chin_flnm"));
    	String cur_job = Util.checkString(req.getParameter("cur_job"));
    	String bidt = Util.checkString(req.getParameter("bidt"));
    	String nativ = Util.checkString(req.getParameter("nativ"));
    	String sex = Util.checkString(req.getParameter("sex"));
    	String offi_zip1 = Util.checkString(req.getParameter("offi_zip1"));
    	String offi_zip2 = Util.checkString(req.getParameter("offi_zip2"));
    	String offi_zip3 = Util.checkString(req.getParameter("offi_zip3"));
    	String offi_addr = Util.checkString(req.getParameter("offi_addr"));
    	String offi_dtls_addr = Util.checkString(req.getParameter("offi_dtls_addr"));
    	String offi_tel_no = Util.checkString(req.getParameter("offi_tel_no"));
    	String home_zip1 = Util.checkString(req.getParameter("home_zip1"));
    	String home_zip2 = Util.checkString(req.getParameter("home_zip2"));
    	String home_zip3 = Util.checkString(req.getParameter("home_zip3"));
    	String home_addr = Util.checkString(req.getParameter("home_addr"));
    	String home_dtls_addr = Util.checkString(req.getParameter("home_dtls_addr"));
    	String home_tel_no = Util.checkString(req.getParameter("home_tel_no"));
    	String etc_addr_zip1 = Util.checkString(req.getParameter("etc_addr_zip1"));
    	String etc_addr_zip2 = Util.checkString(req.getParameter("etc_addr_zip2"));
    	String etc_addr_zip3 = Util.checkString(req.getParameter("etc_addr_zip3"));
    	String etc_addr = Util.checkString(req.getParameter("etc_addr"));
    	String etc_dtls_addr = Util.checkString(req.getParameter("etc_dtls_addr"));
    	String ceph_no1 = Util.checkString(req.getParameter("ceph_no1"));
    	String ceph_no2 = Util.checkString(req.getParameter("ceph_no2"));
    	String birth_hscl = Util.checkString(req.getParameter("birth_hscl"));
    	String birth_univ = Util.checkString(req.getParameter("birth_univ"));
    	String email = Util.checkString(req.getParameter("email"))+'@'+Util.checkString(req.getParameter("gubun_email"));
    	String wedd_anvy_dt = Util.checkString(req.getParameter("wedd_anvy_dt"));
    	String relg = Util.checkString(req.getParameter("relg"));
    	String hby = Util.checkString(req.getParameter("hby"));
    	String army = Util.checkString(req.getParameter("army"));
    	String child_cnt = Util.checkString(req.getParameter("child_cnt"));
    	String golf = Util.checkString(req.getParameter("golf"));
    	String smok_yn = Util.checkString(req.getParameter("smok_yn"));
    	String drink_yn = Util.checkString(req.getParameter("drink_yn"));
    	String main_nwsp_subs = Util.checkString(req.getParameter("main_nwsp_subs"));
    	String wedd_yn = Util.checkString(req.getParameter("wedd_yn"));
    	String spc_matt = Util.checkString(req.getParameter("spc_matt"));
    	String vip_pers_line = Util.checkString(req.getParameter("vip_pers_line"));
    	String lvcmpy_yn = Util.checkString(req.getParameter("lvcmpy_yn"));
    	String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String cust_mang_item = Util.checkString(req.getParameter("cust_mang_item"));

        // DM Setting
    	AD_BAS_2130_ADM dm = new AD_BAS_2130_ADM();
    	
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setPrfl_no(prfl_no);
    	dm.setFlnm(flnm);
    	dm.setChin_flnm(chin_flnm);
    	dm.setCur_job(cur_job);
    	dm.setBidt(bidt);
    	dm.setNativ(nativ);
    	dm.setSex(sex);
    	dm.setOffi_zip1(offi_zip1);
    	dm.setOffi_zip2(offi_zip2);
    	dm.setOffi_zip3(offi_zip3);
    	dm.setOffi_addr(offi_addr);
    	dm.setOffi_dtls_addr(offi_dtls_addr);
    	dm.setOffi_tel_no(offi_tel_no);
    	dm.setHome_zip1(home_zip1);
    	dm.setHome_zip2(home_zip2);
    	dm.setHome_zip3(home_zip3);
    	dm.setHome_addr(home_addr);
    	dm.setHome_dtls_addr(home_dtls_addr);
    	dm.setHome_tel_no(home_tel_no);
    	dm.setEtc_addr_zip1(etc_addr_zip1);
    	dm.setEtc_addr_zip2(etc_addr_zip2);
    	dm.setEtc_addr_zip3(etc_addr_zip3);
    	dm.setEtc_addr(etc_addr);
    	dm.setEtc_dtls_addr(etc_dtls_addr);
    	dm.setCeph_no1(ceph_no1);
    	dm.setCeph_no2(ceph_no2);
    	dm.setBirth_hscl(birth_hscl);
    	dm.setBirth_univ(birth_univ);
    	dm.setEmail(email);
    	dm.setWedd_anvy_dt(wedd_anvy_dt);
    	dm.setRelg(relg);
    	dm.setHby(hby);
    	dm.setArmy(army);
    	dm.setChild_cnt(child_cnt);
    	dm.setGolf(golf);
    	dm.setSmok_yn(smok_yn);
    	dm.setDrink_yn(drink_yn);
    	dm.setMain_nwsp_subs(main_nwsp_subs);
    	dm.setWedd_yn(wedd_yn);
    	dm.setSpc_matt(spc_matt);
    	dm.setVip_pers_line(vip_pers_line);
    	dm.setLvcmpy_yn(lvcmpy_yn);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setChg_pers(chg_pers);
	
    	dm.setCust_mang_item(cust_mang_item); 
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
       //System.out.println("multiUpdateData = "+ multiUpdateData);
        
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode 			= (String)hash.get("m"); 
        String seq	 			= (String)hash.get("seq"); 
        String frdt         	= (String)hash.get("frdt"); 
        String todt     		= (String)hash.get("todt"); 
        String carr_matt 		= (String)hash.get("carr_matt"); 
    	
    	dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setCarr_matt(carr_matt);
 	

        try {
        	AdBas2100DAO dao = new AdBas2100DAO();
            ds = dao.ad_bas_2130_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//    	//dm.print();
//        AdBas2100EJBHome home = (AdBas2100EJBHome) JNDIManager.getInstance().getHome("AdBas2100EJB");
//        try { 
//        	AdBas2100EJB ejb = home.create();
//            ds = ejb.ad_bas_2130_a(dm);
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
     * 거래처인물정보 고객관리내역 등록
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2140_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	AD_BAS_2140_ADataSet ds = null;
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String flag = Util.checkString(req.getParameter("flag"));
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        // DM Setting
    	AD_BAS_2140_ADM dm = new AD_BAS_2140_ADM();
    	
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setChg_pers(chg_pers);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        //System.out.println("multiUpdateData = "+ multiUpdateData);
         
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
     	
     	String mode 			= (String)hash.get("m"); 
        String seq	 			= (String)hash.get("seq"); 
        String dlco_no         	= (String)hash.get("dlco_no"); 
        String prfl_no         	= (String)hash.get("prfl_no"); 
        String cust_mang_item  	= (String)hash.get("cust_mang_item");
        //String seq  			= (String)hash.get("seq");
        String send_dt  		= (String)hash.get("send_dt");
        String remk  		    = (String)hash.get("remk"); 

        dm.setMode(mode.toUpperCase());
    	dm.setSeq(seq);
    	dm.setDlco_no(dlco_no);
    	dm.setPrfl_no(prfl_no);
    	dm.setCust_mang_item(cust_mang_item);
    	dm.setSend_dt(send_dt);
    	dm.setRemk(remk);
    	

        try {
        	AdBas2100DAO dao = new AdBas2100DAO();
            ds = dao.ad_bas_2140_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas2100EJBHome home = (AdBas2100EJBHome) JNDIManager.getInstance().getHome("AdBas2100EJB");
//        try { 
//        	AdBas2100EJB ejb = home.create();
//            ds = ejb.ad_bas_2140_a(dm);
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
