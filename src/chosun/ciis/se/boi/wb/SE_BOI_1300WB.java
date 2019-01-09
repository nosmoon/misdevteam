/***************************************************************************************************
* 파일명 : SE_BOI_1300WB.java
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
import chosun.ciis.se.boi.dao.SE_BOI_1300DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1300_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1310_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1320_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1330_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1340_LDM;
import chosun.ciis.se.boi.ds.SE_BOI_1300_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1310_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1320_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1330_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1340_LDataSet;
/**
 * 
 */

public class SE_BOI_1300WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1300_MDataSet ds = null;

        // DM Setting
        SE_BOI_1300_MDM dm = new SE_BOI_1300_MDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1300DAO dao = new SE_BOI_1300DAO();
            ds = dao.se_boi_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1300EJBHome home = (SE_BOI_1300EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1300EJB");
//        try {
//        	SE_BOI_1300EJB ejb = home.create();
//            ds = ejb.se_boi_1300_m(dm);
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
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1310_LDataSet ds = null;

        // DM Setting
        SE_BOI_1310_LDM dm = new SE_BOI_1310_LDM();
		
		String team_cd = Util.checkString(req.getParameter("team_cd"));
		String part_cd = Util.checkString(req.getParameter("part_cd"));
		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String chrg_flnm = Util.checkString(req.getParameter("chrg_flnm"));
		String cntr_dt1 = Util.checkString(req.getParameter("cntr_dt1"));
		String cntr_dt2 = Util.checkString(req.getParameter("cntr_dt2"));
		String bo_feat_clsf = Util.checkString(req.getParameter("bo_feat_clsf"));
		String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		String sido_cd = Util.checkString(req.getParameter("sido_cd"));
		String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		String order_gb = Util.checkString(req.getParameter("order_gb"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setTeam_cd(team_cd);
		dm.setPart_cd(part_cd);
		dm.setArea_cd(area_cd);
		dm.setChrg_flnm(chrg_flnm);
		dm.setCntr_dt1(cntr_dt1);
		dm.setCntr_dt2(cntr_dt2);
		dm.setBo_feat_clsf(bo_feat_clsf);
		dm.setCntr_stat_clsf(cntr_stat_clsf);
		dm.setSido_cd(sido_cd);
		dm.setAdms_dstc_cd(adms_dstc_cd);
		dm.setOrder_gb(order_gb);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1300DAO dao = new SE_BOI_1300DAO();
            ds = dao.se_boi_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//        SE_BOI_1300EJBHome home = (SE_BOI_1300EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1300EJB");
//        try {
//        	SE_BOI_1300EJB ejb = home.create();
//            ds = ejb.se_boi_1310_l(dm);
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
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1320_LDataSet ds = null;

        // DM Setting
        SE_BOI_1320_LDM dm = new SE_BOI_1320_LDM();
		
		String team_cd = Util.checkString(req.getParameter("team_cd"));
		String part_cd = Util.checkString(req.getParameter("part_cd"));
		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String chrg_flnm = Util.checkString(req.getParameter("chrg_flnm"));
		String cntr_dt1 = Util.checkString(req.getParameter("cntr_dt1"));
		String cntr_dt2 = Util.checkString(req.getParameter("cntr_dt2"));
		String bo_feat_clsf = Util.checkString(req.getParameter("bo_feat_clsf"));
		String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		String sido_cd = Util.checkString(req.getParameter("sido_cd"));
		String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		String order_gb = Util.checkString(req.getParameter("order_gb"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setTeam_cd(team_cd);
		dm.setPart_cd(part_cd);
		dm.setArea_cd(area_cd);
		dm.setChrg_flnm(chrg_flnm);
		dm.setCntr_dt1(cntr_dt1);
		dm.setCntr_dt2(cntr_dt2);
		dm.setBo_feat_clsf(bo_feat_clsf);
		dm.setCntr_stat_clsf(cntr_stat_clsf);
		dm.setSido_cd(sido_cd);
		dm.setAdms_dstc_cd(adms_dstc_cd);
		dm.setOrder_gb(order_gb);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1300DAO dao = new SE_BOI_1300DAO();
            ds = dao.se_boi_1320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1300EJBHome home = (SE_BOI_1300EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1300EJB");
//        try {
//        	SE_BOI_1300EJB ejb = home.create();
//            ds = ejb.se_boi_1320_l(dm);
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
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1330_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1330_LDataSet ds = null;

        // DM Setting
        SE_BOI_1330_LDM dm = new SE_BOI_1330_LDM();
		
		String team_cd = Util.checkString(req.getParameter("team_cd"));
		String part_cd = Util.checkString(req.getParameter("part_cd"));
		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String chrg_flnm = Util.checkString(req.getParameter("chrg_flnm"));
		String cntr_dt1 = Util.checkString(req.getParameter("cntr_dt1"));
		String cntr_dt2 = Util.checkString(req.getParameter("cntr_dt2"));
		String bo_feat_clsf = Util.checkString(req.getParameter("bo_feat_clsf"));
		String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		String sido_cd = Util.checkString(req.getParameter("sido_cd"));
		String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		String order_gb = Util.checkString(req.getParameter("order_gb"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setTeam_cd(team_cd);
		dm.setPart_cd(part_cd);
		dm.setArea_cd(area_cd);
		dm.setChrg_flnm(chrg_flnm);
		dm.setCntr_dt1(cntr_dt1);
		dm.setCntr_dt2(cntr_dt2);
		dm.setBo_feat_clsf(bo_feat_clsf);
		dm.setCntr_stat_clsf(cntr_stat_clsf);
		dm.setSido_cd(sido_cd);
		dm.setAdms_dstc_cd(adms_dstc_cd);
		dm.setOrder_gb(order_gb);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1300DAO dao = new SE_BOI_1300DAO();
            ds = dao.se_boi_1330_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1300EJBHome home = (SE_BOI_1300EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1300EJB");
//        try {
//        	SE_BOI_1300EJB ejb = home.create();
//            ds = ejb.se_boi_1330_l(dm);
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
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1340_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1340_LDataSet ds = null;

        // DM Setting
        SE_BOI_1340_LDM dm = new SE_BOI_1340_LDM();
		
		String team_cd = Util.checkString(req.getParameter("team_cd"));
		String part_cd = Util.checkString(req.getParameter("part_cd"));
		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String chrg_flnm = Util.checkString(req.getParameter("chrg_flnm"));
		String cntr_dt1 = Util.checkString(req.getParameter("cntr_dt1"));
		String cntr_dt2 = Util.checkString(req.getParameter("cntr_dt2"));
		String bo_feat_clsf = Util.checkString(req.getParameter("bo_feat_clsf"));
		String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		String sido_cd = Util.checkString(req.getParameter("sido_cd"));
		String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		String order_gb = Util.checkString(req.getParameter("order_gb"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setTeam_cd(team_cd);
		dm.setPart_cd(part_cd);
		dm.setArea_cd(area_cd);
		dm.setChrg_flnm(chrg_flnm);
		dm.setCntr_dt1(cntr_dt1);
		dm.setCntr_dt2(cntr_dt2);
		dm.setBo_feat_clsf(bo_feat_clsf);
		dm.setCntr_stat_clsf(cntr_stat_clsf);
		dm.setSido_cd(sido_cd);
		dm.setAdms_dstc_cd(adms_dstc_cd);
		dm.setOrder_gb(order_gb);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1300DAO dao = new SE_BOI_1300DAO();
            ds = dao.se_boi_1340_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1300EJBHome home = (SE_BOI_1300EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1300EJB");
//        try {
//        	SE_BOI_1300EJB ejb = home.create();
//            ds = ejb.se_boi_1340_l(dm);
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
