/***************************************************************************************************
* 파일명 : MT_PAPINOUT_1100WB.java
* 기능 :  판매 - 기준정보 - 담당자 등록 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.papinout.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.papinout.dao.MT_PAPINOUT_1100DAO;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_1100_MDM;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_1110_LDM;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_1120_ADM;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_1130_LDM;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1100_MDataSet;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1110_LDataSet;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1120_ADataSet;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1130_LDataSet;
/**
 * 
 */

public class MT_PAPINOUT_1100WB extends BaseWB{

    /**
     * 담당자 구분과 담당부서 코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	MT_PAPINOUT_1100_MDataSet ds = null;

        // DM Setting
    	MT_PAPINOUT_1100_MDM dm = new MT_PAPINOUT_1100_MDM();
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        //Util.checkString(req.getParameter("team_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	MT_PAPINOUT_1100DAO dao = new MT_PAPINOUT_1100DAO();
            ds = dao.mt_papinout_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            ds = ejb.se_bas_1200_m(dm);
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
     * 검색조건에 맞는 담당자 이력 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    
    public void mt_papinout_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        MT_PAPINOUT_1110_LDataSet ds = null;

        // DM Setting
        MT_PAPINOUT_1110_LDM dm 	= new MT_PAPINOUT_1110_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true); //Util.checkString(req.getParameter("cmpy_cd"));
        String ewh_dt       = Util.checkString(req.getParameter("ewh_dt"));
        String issu_dt       = Util.checkString(req.getParameter("issu_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEwh_dt(ewh_dt);
        dm.setIssu_dt(issu_dt);
        
        dm.print();
        
        try {
        	MT_PAPINOUT_1100DAO dao = new MT_PAPINOUT_1100DAO();
            ds = dao.mt_papinout_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1210_l(dm);
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
     * 담당자를 등록, 수정, 삭제한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_papinout_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	MT_PAPINOUT_1120_ADataSet ds = null;

        //DM Setting
        MT_PAPINOUT_1120_ADM dm = new MT_PAPINOUT_1120_ADM();
        
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

        System.out.println("multiUpdateData: " + multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	System.out.println("11111111111111111111111");
    	String mode_ar = (String)hash.get("m"); 
    	System.out.println("2222222222222222222222");
		String ewh_dt_ar = (String)hash.get("ewh_dt");
		System.out.println("333333333333333333333");
		String fac_clsf_ar = (String)hash.get("fac_clsf");
		System.out.println("44444444444444444444444444");
		String matr_cd_ar = (String)hash.get("matr_cd");
		System.out.println("55555555555555555555555");
		String ewh_roll_cnt_ar = (String)hash.get("ewh_roll_cnt");
		System.out.println("6666666666666666666666");
		String ewh_wgt_ar = (String)hash.get("ewh_wgt");
		System.out.println("777777777777777777777");
		String roll_wgt_ar = (String)hash.get("roll_wgt");
		System.out.println("8888888888888888888888");
		
    	String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
    	String issu_dt          = Util.checkString(req.getParameter("issu_dt"));
    	String issu_remk        = Util.checkString(req.getParameter("issu_remk"));
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        

        dm.setCmpy_cd(cmpy_cd);
        dm.setIssu_dt(issu_dt);
        dm.setIssu_remk(issu_remk);
        dm.setMode(mode_ar.toUpperCase());
        dm.setEwh_dt(ewh_dt_ar);
        dm.setFac_clsf(fac_clsf_ar);
        dm.setMatr_cd(matr_cd_ar);
        dm.setEwh_roll_cnt(ewh_roll_cnt_ar);
        dm.setEwh_wgt(ewh_wgt_ar);
        dm.setRoll_wgt(roll_wgt_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
        
        try {
        	MT_PAPINOUT_1100DAO dao = new MT_PAPINOUT_1100DAO();
            ds = dao.mt_papinout_1120_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            ds = ejb.se_bas_1220_a(dm);
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
public void mt_papinout_1130_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        MT_PAPINOUT_1130_LDataSet ds = null;

        // DM Setting
        MT_PAPINOUT_1130_LDM dm 	= new MT_PAPINOUT_1130_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true); //Util.checkString(req.getParameter("cmpy_cd"));
        String ewh_dt       = Util.checkString(req.getParameter("ewh_dt"));
        String issu_dt       = Util.checkString(req.getParameter("issu_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setEwh_dt(ewh_dt);
        dm.setIssu_dt(issu_dt);
        
        dm.print();
        
        try {
        	MT_PAPINOUT_1100DAO dao = new MT_PAPINOUT_1100DAO();
            ds = dao.mt_papinout_1130_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }
    
}
