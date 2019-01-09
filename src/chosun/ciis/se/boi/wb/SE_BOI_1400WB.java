/***************************************************************************************************
* 파일명 : SE_BOI_1400WB.java
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

package chosun.ciis.se.boi.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_1400DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1400_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1410_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1420_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1430_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1440_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1450_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1460_LDM;
import chosun.ciis.se.boi.ds.SE_BOI_1400_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1410_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1420_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1430_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1440_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1450_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1460_LDataSet;
/**
 * 
 */

public class SE_BOI_1400WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_boi_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1400_MDataSet ds = null;

        // DM Setting
        SE_BOI_1400_MDM dm = new SE_BOI_1400_MDM();

		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		
        try {
        	SE_BOI_1400DAO dao = new SE_BOI_1400DAO();
            ds = dao.se_boi_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1400EJBHome home = (SE_BOI_1400EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1400EJB");
//        try {
//        	SE_BOI_1400EJB ejb = home.create();
//            ds = ejb.se_boi_1400_m(dm);
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
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_boi_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1410_LDataSet ds = null;

        // DM Setting
        SE_BOI_1410_LDM dm = new SE_BOI_1410_LDM();

		String team_cd = Util.checkString(req.getParameter("team_cd"));
		String part_cd = Util.checkString(req.getParameter("part_cd"));
		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String chrg_flnm = Util.checkString(req.getParameter("chrg_flnm"));
		String bo_nm = Util.checkString(req.getParameter("bo_nm"));
		String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
		String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setTeam_cd(team_cd);
		dm.setPart_cd(part_cd);
		dm.setArea_cd(area_cd);
		dm.setChrg_flnm(chrg_flnm);
		dm.setBo_nm(bo_nm);
		dm.setBo_head_nm(bo_head_nm);
		dm.setCntr_stat_clsf(cntr_stat_clsf);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1400DAO dao = new SE_BOI_1400DAO();
            ds = dao.se_boi_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//        SE_BOI_1400EJBHome home = (SE_BOI_1400EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1400EJB");
//        try {
//        	SE_BOI_1400EJB ejb = home.create();
//            ds = ejb.se_boi_1410_l(dm);
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
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_boi_1420_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1420_SDataSet ds = null;

        // DM Setting
        SE_BOI_1420_SDM dm = new SE_BOI_1420_SDM();
		
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1400DAO dao = new SE_BOI_1400DAO();
            ds = dao.se_boi_1420_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_BOI_1400EJBHome home = (SE_BOI_1400EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1400EJB");
//        try {
//        	SE_BOI_1400EJB ejb = home.create();
//            ds = ejb.se_boi_1420_s(dm);
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
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_boi_1430_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1430_SDataSet ds = null;

        // DM Setting
        SE_BOI_1430_SDM dm = new SE_BOI_1430_SDM();
		
		String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setBo_head_prn(bo_head_prn);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1400DAO dao = new SE_BOI_1400DAO();
            ds = dao.se_boi_1430_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_BOI_1400EJBHome home = (SE_BOI_1400EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1400EJB");
//        try {
//        	SE_BOI_1400EJB ejb = home.create();
//            ds = ejb.se_boi_1430_s(dm);
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
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_boi_1440_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1440_LDataSet ds = null;

        // DM Setting
        SE_BOI_1440_LDM dm = new SE_BOI_1440_LDM();
				
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1400DAO dao = new SE_BOI_1400DAO();
            ds = dao.se_boi_1440_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1400EJBHome home = (SE_BOI_1400EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1400EJB");
//        try {
//        	SE_BOI_1400EJB ejb = home.create();
//            ds = ejb.se_boi_1440_l(dm);
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
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_boi_1450_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1450_LDataSet ds = null;

        // DM Setting
        SE_BOI_1450_LDM dm = new SE_BOI_1450_LDM();
				
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1400DAO dao = new SE_BOI_1400DAO();
            ds = dao.se_boi_1450_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1400EJBHome home = (SE_BOI_1400EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1400EJB");
//        try {
//        	SE_BOI_1400EJB ejb = home.create();
//            ds = ejb.se_boi_1450_l(dm);
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
     * 리스트 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_boi_1460_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1460_LDataSet ds = null;

        // DM Setting
        SE_BOI_1460_LDM dm = new SE_BOI_1460_LDM();
		
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		String bo_cntr_dt = Util.checkString(req.getParameter("bo_cntr_dt"));
		String yymm1 = Util.checkString(req.getParameter("yymm1"));
		String yymm2 = Util.checkString(req.getParameter("yymm2"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setBo_cntr_dt(bo_cntr_dt);
		dm.setYymm1(yymm1);
		dm.setYymm2(yymm2);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1400DAO dao = new SE_BOI_1400DAO();
            ds = dao.se_boi_1460_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//        SE_BOI_1400EJBHome home = (SE_BOI_1400EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1400EJB");
//        try {
//        	SE_BOI_1400EJB ejb = home.create();
//            ds = ejb.se_boi_1460_l(dm);
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
