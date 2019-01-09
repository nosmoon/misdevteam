/***************************************************************************************************
* 파일명 : SE_ETC_1600WB.java
* 기능 : 판매 - 기타관리 - ABC제출자료작성
* 작성일자 : 2011-07-27
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.etc.wb;

import java.util.Calendar;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.etc.dao.SE_ETC_1600DAO;
import chosun.ciis.se.etc.dm.SE_ETC_1600_MDM;
import chosun.ciis.se.etc.dm.SE_ETC_1610_LDM;
import chosun.ciis.se.etc.dm.SE_ETC_1620_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1630_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1640_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1650_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1660_ADM;
import chosun.ciis.se.etc.dm.SE_ETC_1670_ADM;
import chosun.ciis.se.etc.ds.SE_ETC_1600_MDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1610_LDataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1620_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1630_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1640_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1650_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1660_ADataSet;
import chosun.ciis.se.etc.ds.SE_ETC_1670_ADataSet;
/**
 * 
 */

public class SE_ETC_1600WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1600_MDataSet ds = null;

        // DM Settinga
        SE_ETC_1600_MDM dm 		= new SE_ETC_1600_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        String auth_gb			= "1";
        String feat_clsf		= "";
        
        Calendar cal 			= Calendar.getInstance();
        String yyyy				= String.valueOf(cal.get(cal.YEAR));
        String mm				= String.valueOf(cal.get(cal.MONTH) + 1);
        mm						= mm.length() == 1 ? "0" + mm : mm;
    	String dd				= String.valueOf(cal.get(cal.DATE));
    	dd						= dd.length() == 1 ? "0" + dd : dd;
        
        dm.setAuth_gb			(auth_gb		);
        dm.setFeat_clsf			(feat_clsf		);
        dm.setBase_dt			(yyyy + mm + dd	);
        
        try {
        	SE_ETC_1600DAO dao = new SE_ETC_1600DAO();
            ds = dao.se_etc_1600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1300_m(dm);
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
     * 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_etc_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1610_LDataSet ds = null;

        // DM Setting
        SE_ETC_1610_LDM dm 		= new SE_ETC_1610_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String team				= Util.checkString(req.getParameter("team"		));
        String part				= Util.checkString(req.getParameter("part"		));
        String area				= Util.checkString(req.getParameter("area"		));
        String schlevel			= Util.checkString(req.getParameter("schlevel"		));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setTeam              (team       );
        dm.setPart				(part		);
        dm.setArea				(area		);
        dm.setSchlevel			(schlevel	);
        
        try {
        	SE_ETC_1600DAO dao = new SE_ETC_1600DAO();
            ds = dao.se_etc_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1310_l(dm);
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
     * 지역 및 전체 마감/마감취소  
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_etc_1620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1620_ADataSet ds = null;

        // DM Setting
        SE_ETC_1620_ADM dm 		= new SE_ETC_1620_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
       
        String selldeptcd 		= Util.checkString(req.getParameter("selldeptcd"));
        String yymm 			= Util.checkString(req.getParameter("yymm"));
        String clos_yn 			= Util.checkString(req.getParameter("clos_yn"));
        String areagb 			= Util.checkString(req.getParameter("areagb"));
        String area_cd 			= Util.checkString(req.getParameter("area_cd"));
       
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setSelldeptcd(selldeptcd);
        dm.setYymm(yymm);
        dm.setClos_yn(clos_yn);
        dm.setAreagb(areagb);
        dm.setArea_cd(area_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        
        try {
        	SE_ETC_1600DAO dao = new SE_ETC_1600DAO();
            ds = dao.se_etc_1620_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1320_a(dm);
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
     * 저장 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_etc_1630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1630_ADataSet ds = null;

        // DM Setting
        SE_ETC_1630_ADM dm 		= new SE_ETC_1630_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
		
		
		String yymm 				= Util.checkString((String) hash.get("yymm"));
		String bo_cd 				= Util.checkString((String) hash.get("bo_cd"));
		String bo_seq 				= Util.checkString((String) hash.get("bo_seq"));
		String area_cd 				= Util.checkString((String) hash.get("area_cd"));
		String area_nm 				= Util.checkString((String) hash.get("area_nm"));
		String house_qty 			= Util.checkString((String) hash.get("house_qty"));
		String business_site_qty	= Util.checkString((String) hash.get("business_site_qty"));
		String curmm_val_qty 		= Util.checkString((String) hash.get("curmm_val_qty"));
		String livingin_yn  		= Util.checkString((String) hash.get("livingin_yn"));
		String avg_send_qty 		= Util.checkString((String) hash.get("avg_send_qty"));
		String remk 				= Util.checkString((String) hash.get("remk"));
		String sell_net_clsf        = Util.checkString((String) hash.get("sell_net_clsf"));
       
		dm.setCmpy_cd(cmpy_cd);
		dm.setYymm(yymm);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setArea_cd(area_cd);
		dm.setArea_nm(area_nm);
		dm.setHouse_qty(house_qty);
		dm.setBusiness_site_qty(business_site_qty);
		dm.setCurmm_val_qty(curmm_val_qty);
		dm.setLivingin_yn(livingin_yn);
		dm.setAvg_send_qty(avg_send_qty);
		dm.setRemk(remk);
		dm.setSell_net_clsf(sell_net_clsf);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.print();
        try {
        	SE_ETC_1600DAO dao = new SE_ETC_1600DAO();
            ds = dao.se_etc_1630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//        
//        try {
//        	SE_ETC_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_etc_1330_a(dm);
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
     * 생성
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void se_etc_1640_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1640_ADataSet ds = null;

        // DM Setting
        SE_ETC_1640_ADM dm 		= new SE_ETC_1640_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        
        String yymm 			= Util.checkString(req.getParameter("yymm"));
        String team 			= Util.checkString(req.getParameter("team"));
        String part 			= Util.checkString(req.getParameter("part"));
		String area 			= Util.checkString(req.getParameter("area"));
      
		dm.setCmpy_cd(cmpy_cd);
		dm.setYymm(yymm);
		dm.setTeam(team);
		dm.setPart(part);
		dm.setArea(area);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		
		
        try {
        	SE_ETC_1600DAO dao = new SE_ETC_1600DAO();
            ds = dao.se_etc_1640_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
    public void se_etc_1650_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1650_ADataSet ds = null;

        // DM Setting
        SE_ETC_1650_ADM dm 		= new SE_ETC_1650_ADM();
        
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        
        String yymm 			= Util.checkString(req.getParameter("yymm"));
        String noval_qty_rate	= Util.checkString(req.getParameter("noval_qty_rate"));
      System.out.println("bong"+yymm);
		dm.setCmpy_cd(cmpy_cd);
		dm.setYymm(yymm);
		dm.setNoval_qty_rate(noval_qty_rate);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.print();
		
        try {
        	SE_ETC_1600DAO dao = new SE_ETC_1600DAO();
            ds = dao.se_etc_1650_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
    public void se_etc_1660_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1660_ADataSet ds = null;

        // DM Setting
        SE_ETC_1660_ADM dm 		= new SE_ETC_1660_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        
        String yymm 			= Util.checkString(req.getParameter("yymm"));
        String house_qty_rate	= Util.checkString(req.getParameter("house_qty_rate"));
        String bnsite_qty_rate	= Util.checkString(req.getParameter("bnsite_qty_rate"));
      
		dm.setCmpy_cd(cmpy_cd);
		dm.setYymm(yymm);
		dm.setHouse_qty_rate(house_qty_rate);
		dm.setBnsite_qty_rate(bnsite_qty_rate);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.print();
		
        try {
        	SE_ETC_1600DAO dao = new SE_ETC_1600DAO();
            ds = dao.se_etc_1660_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    public void se_etc_1670_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_ETC_1670_ADataSet ds = null;

        // DM Setting
        SE_ETC_1670_ADM dm 		= new SE_ETC_1670_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String yymm 			= Util.checkString(req.getParameter("yymm"));
        String noval_qty_rate	= Util.checkString(req.getParameter("noval_qty_rate"));
        String oth_qty_rate		= Util.checkString(req.getParameter("oth_qty_rate"));
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setYymm(yymm);
		dm.setNoval_qty_rate(noval_qty_rate);
		dm.setOth_qty_rate(oth_qty_rate);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.print();
		
        try {
        	SE_ETC_1600DAO dao = new SE_ETC_1600DAO();
            ds = dao.se_etc_1670_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
}
