/***************************************************************************************************
* 파일명 : SE_BNS_1100WB.java
* 기능 :  판매 - 판촉물관리 - 판촉물등록 
 * 작성일자 : 2009-03-11
 * 작성자 :   이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.bns.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.bns.dao.SE_BNS_1100DAO;
import chosun.ciis.se.bns.dm.SE_BNS_1100_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1110_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1120_SDM;
import chosun.ciis.se.bns.dm.SE_BNS_1130_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1140_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1160_ADM;
import chosun.ciis.se.bns.dm.SE_BNS_1170_ADM;
import chosun.ciis.se.bns.dm.SE_BNS_1180_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_1100_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1110_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1120_SDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1130_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1140_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1160_ADataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1170_ADataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1180_ADataSet;
/**
 * 
 */

public class SE_BNS_1100WB extends BaseWB{

    /**
     * 담당자 구분과 담당부서 코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_bns_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1100_MDataSet ds = null;

        // DM Setting
        SE_BNS_1100_MDM dm = new SE_BNS_1100_MDM();
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);//Util.checkString(req.getParameter("team_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_BNS_1100DAO dao = new SE_BNS_1100DAO();
            ds = dao.se_bns_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BNS_1100EJBHome home = (SE_BNS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1100EJB");
//        
//        try {
//        	SE_BNS_1100EJB ejb = home.create();
//            ds = ejb.se_bns_1100_m(dm);
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
    public void se_bns_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1110_LDataSet ds = null;

        // DM Setting
        SE_BNS_1110_LDM dm 	= new SE_BNS_1110_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true); //Util.checkString(req.getParameter("cmpy_cd"));
        String bitem_cd     = Util.checkString(req.getParameter("bitem_cd"));
        String bitem_nm     = Util.checkString(req.getParameter("bitem_nm"));
        String bitem_clas   = Util.checkString(req.getParameter("bitem_clas"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBitem_cd(bitem_cd);
        dm.setBitem_nm(bitem_nm);
        dm.setBitem_clas(bitem_clas);        

        try {
        	SE_BNS_1100DAO dao = new SE_BNS_1100DAO();
            ds = dao.se_bns_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
//        SE_BNS_1100EJBHome home = (SE_BNS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1100EJB");
//        
//        try {
//        	SE_BNS_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bns_1110_l(dm);
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
    
    public void se_bns_1120_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1120_SDataSet ds = null;

        // DM Setting
        SE_BNS_1120_SDM dm = new SE_BNS_1120_SDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true);
        String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
        //String bo_seq = Util.checkString(req.getParameter("bo_seq"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBns_item_cd(bns_item_cd);
        //dm.setBo_seq(bo_seq);

        try {
        	SE_BNS_1100DAO dao = new SE_BNS_1100DAO();
            ds = dao.se_bns_1120_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BNS_1100EJBHome home = (SE_BNS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1100EJB");
//        try {
//        	SE_BNS_1100EJB ejb = home.create();
//            ds = ejb.se_bns_1120_s(dm);
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
    
    public void se_bns_1130_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1130_LDataSet ds = null;

        // DM Setting
        SE_BNS_1130_LDM dm 	= new SE_BNS_1130_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true); //Util.checkString(req.getParameter("cmpy_cd"));
        String bns_item_cd     = Util.checkString(req.getParameter("bns_item_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBns_item_cd(bns_item_cd);        

        try {
        	SE_BNS_1100DAO dao = new SE_BNS_1100DAO();
            ds = dao.se_bns_1130_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
//        SE_BNS_1100EJBHome home = (SE_BNS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1100EJB");
//        
//        try {
//        	SE_BNS_1100EJB ejb = home.create();
//            System.out.println("wwwwwwwwwwwwwww");
//            ds = ejb.se_bns_1130_l(dm);
//            System.out.println("zzzzzzzzzzzzzzz");
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
    
    public void se_bns_1140_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1140_LDataSet ds = null;

        // DM Setting
        SE_BNS_1140_LDM dm 	= new SE_BNS_1140_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true); //Util.checkString(req.getParameter("cmpy_cd"));
        String bns_item_cd     = Util.checkString(req.getParameter("bns_item_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setBns_item_cd(bns_item_cd);        

        try {
        	SE_BNS_1100DAO dao = new SE_BNS_1100DAO();
            ds = dao.se_bns_1140_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
//        SE_BNS_1100EJBHome home = (SE_BNS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1100EJB");
//        
//        try {
//        	SE_BNS_1100EJB ejb = home.create();
//            System.out.println("wwwwwwwwwwwwwww");
//            ds = ejb.se_bns_1140_l(dm);
//            System.out.println("zzzzzzzzzzzzzzz");
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
    public void se_bns_1160_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BNS_1160_ADataSet ds = null;

        // DM Setting
        SE_BNS_1160_ADM dm = new SE_BNS_1160_ADM();

		String accflag = Util.checkString(req.getParameter("accflag"));
		String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
		String bns_item_nm = Util.checkString(req.getParameter("bns_item_nm"));
		String bns_item_clas = Util.checkString(req.getParameter("bns_item_clas"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String yy_plan_stok_qunt = Util.checkString(req.getParameter("yy_plan_stok_qunt"));
		String stok_qunt = Util.checkString(req.getParameter("stok_qunt"));
		String unit = Util.checkString(req.getParameter("unit"));
		String stok_mang_yn = Util.checkString(req.getParameter("stok_mang_yn"));
		String rchps_clsf = Util.checkString(req.getParameter("rchps_clsf"));
		String clgps_clsf = Util.checkString(req.getParameter("clgps_clsf"));
		String stmt_issu_clsf = Util.checkString(req.getParameter("stmt_issu_clsf"));
		String send_clsf = Util.checkString(req.getParameter("send_clsf"));
		String aplc_frdt = Util.checkString(req.getParameter("aplc_frdt"));
		String aplc_todt = Util.checkString(req.getParameter("aplc_todt"));
		String aplc_clos_tm = Util.checkString(req.getParameter("aplc_clos_tm"));
		String remk = Util.checkString(req.getParameter("remk"));
		String stmt_item_clsf = Util.checkString(req.getParameter("stmt_item_clsf"));
		String use_yn = Util.checkString(req.getParameter("use_yn"));		
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setAccflag(accflag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setBns_item_cd(bns_item_cd);
		dm.setBns_item_nm(bns_item_nm); 
		dm.setBns_item_clas(bns_item_clas);
		dm.setMedi_cd(medi_cd);
		dm.setYy_plan_stok_qunt(yy_plan_stok_qunt);
		dm.setStok_qunt(stok_qunt);
		dm.setUnit(unit);
		dm.setStok_mang_yn(stok_mang_yn);
		dm.setRchps_clsf(rchps_clsf);
		dm.setClgps_clsf(clgps_clsf);
		dm.setStmt_issu_clsf(stmt_issu_clsf);
		dm.setSend_clsf(send_clsf);
		dm.setAplc_frdt(aplc_frdt);
		dm.setAplc_todt(aplc_todt);
		dm.setAplc_clos_tm(aplc_clos_tm);
		dm.setRemk(remk);
		dm.setStmt_item_clsf(stmt_item_clsf);
		dm.setUse_yn(use_yn);
		dm.setIncmgpers(incmgpers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

        try {
        	SE_BNS_1100DAO dao = new SE_BNS_1100DAO();
            ds = dao.se_bns_1160_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();  

//        SE_BNS_1100EJBHome home = (SE_BNS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1100EJB");
//        
//        try {
//        	SE_BNS_1100EJB ejb = home.create();
//            ds = ejb.se_bns_1160_a(dm);
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
    
    public void se_bns_1170_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_BNS_1170_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdateData: " + multiUpdateData);
    	String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));

        //System.out.println("multiUpdateData: " + multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	String mode_ar = (String)hash.get("m"); 
		//String bns_item_cd_ar = (String)hash.get("bns_item_cd");
		String aply_dt_ar = (String)hash.get("aply_dt");
		String uprc_ar = (String)hash.get("uprc");
		String divn_uprc_ar = (String)hash.get("divn_uprc");
		String insd_divn_uprc_ar = (String)hash.get("insd_divn_uprc");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        //String bns_item_cd      = Util.getSessionParameterValue(req, "bns_item_cd", true);
        
        //DM Setting
        SE_BNS_1170_ADM dm = new SE_BNS_1170_ADM();

        dm.setCmpy_cd(cmpy_cd);
        System.out.println("mode_ar: " + mode_ar);        
        dm.setMode(mode_ar.toUpperCase());
        dm.setBns_item_cd(bns_item_cd);
        dm.setAply_dt(aply_dt_ar);
        dm.setUprc(uprc_ar);
        dm.setDivn_uprc(divn_uprc_ar);
        dm.setInsd_divn_uprc(insd_divn_uprc_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmgpers(incmg_pers);
        
        try {
        	SE_BNS_1100DAO dao = new SE_BNS_1100DAO();
            ds = dao.se_bns_1170_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1100EJBHome home = (SE_BNS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1100EJB");
//        
//        try {
//        	SE_BNS_1100EJB ejb = home.create();
//            ds = ejb.se_bns_1170_a(dm);
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
    
    public void se_bns_1180_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_BNS_1180_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdateData: " + multiUpdateData);
    	String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));

        //System.out.println("multiUpdateData: " + multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	String mode_ar = (String)hash.get("m"); 
		//String bns_item_cd_ar = (String)hash.get("bns_item_cd");
		String dscn_seq_ar = (String)hash.get("dscn_seq");
		String qunt_ar = (String)hash.get("qunt");
		String dscn_uprc_ar = (String)hash.get("dscn_uprc");
		String remk_ar = (String)hash.get("remk");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        //String bns_item_cd      = Util.getSessionParameterValue(req, "bns_item_cd", true);
        
        //DM Setting
        SE_BNS_1180_ADM dm = new SE_BNS_1180_ADM();

        dm.setCmpy_cd(cmpy_cd);
        System.out.println("mode_ar: " + mode_ar);        
        dm.setMode(mode_ar.toUpperCase());
        dm.setBns_item_cd(bns_item_cd);
        dm.setDscn_seq(dscn_seq_ar);
        dm.setQunt(qunt_ar);
        dm.setDscn_uprc(dscn_uprc_ar);
        dm.setRemk(remk_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmgpers(incmg_pers);
        
        try {
        	SE_BNS_1100DAO dao = new SE_BNS_1100DAO();
            ds = dao.se_bns_1180_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BNS_1100EJBHome home = (SE_BNS_1100EJBHome) JNDIManager.getInstance().getHome("SE_BNS_1100EJB");
//        
//        try {
//        	SE_BNS_1100EJB ejb = home.create();
//            ds = ejb.se_bns_1180_a(dm);
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
