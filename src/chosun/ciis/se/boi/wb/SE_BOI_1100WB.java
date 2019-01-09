/***************************************************************************************************
* 파일명 : SE_BOI_1100WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_1100DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1100_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1110_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1120_UDM;
import chosun.ciis.se.boi.ds.SE_BOI_1100_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1110_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1120_UDataSet;
/**
 * 
 */

public class SE_BOI_1100WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1100_MDataSet ds = null;

        // DM Setting
        SE_BOI_1100_MDM dm = new SE_BOI_1100_MDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1100DAO dao = new SE_BOI_1100DAO();
            ds = dao.se_boi_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1100EJBHome home = (SE_BOI_1100EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1100EJB");
//        try {
//        	SE_BOI_1100EJB ejb = home.create();
//            ds = ejb.se_boi_1100_m(dm);
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
     * 지역 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1110_LDataSet ds = null;

        // DM Setting
        SE_BOI_1110_LDM dm = new SE_BOI_1110_LDM();

		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String schgb = Util.checkString(req.getParameter("schgb"));
        String team_cd = Util.checkString(req.getParameter("team_cd"));
        String part_cd = Util.checkString(req.getParameter("part_cd"));
        String area_cd = Util.checkString(req.getParameter("area_cd"));
        String chgdt1 = Util.checkString(req.getParameter("chgdt1"));
        String chgdt2 = Util.checkString(req.getParameter("chgdt2"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setSchgb(schgb);
        dm.setTeam_cd(team_cd);
        dm.setPart_cd(part_cd);
        dm.setArea_cd(area_cd);
        dm.setChgdt1(chgdt1);
        dm.setChgdt2(chgdt2);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_BOI_1100DAO dao = new SE_BOI_1100DAO();
            ds = dao.se_boi_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
//        SE_BOI_1100EJBHome home = (SE_BOI_1100EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1100EJB");
//        try {
//        	SE_BOI_1100EJB ejb = home.create();
//            ds = ejb.se_boi_1110_l(dm);
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
     * 지역변경, 정렬순번 일괄정렬
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1120_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BOI_1120_UDataSet ds = null;
        // DM Setting
        SE_BOI_1120_UDM dm = new SE_BOI_1120_UDM();
		String accflag = Util.checkString(req.getParameter("accflag"));
		String yymm = Util.checkString(req.getParameter("yymm"));
		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String srt_num = Util.checkString(req.getParameter("srt_num"));
		if("".equals(srt_num)) srt_num = "0";
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setCmpy_cd(cmpy_cd);
		dm.setAccflag(accflag);
		dm.setYymm(yymm);
		dm.setArea_cd(area_cd);
		dm.setSrt_num(Integer.parseInt(srt_num));
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
    	String mode_ar = (String)hash.get("m"); 
		String bo_cd_ar = (String)hash.get("bo_cd"); 
		String chg_prv_area_cd_ar = (String)hash.get("chg_prv_area_cd"); 
		String chg_prv_srt_seq_ar = (String)hash.get("chg_prv_srt_seq"); 
		String chg_aft_area_cd_ar = (String)hash.get("chg_aft_area_cd"); 
		String chg_aft_srt_seq_ar = (String)hash.get("chg_aft_srt_seq"); 
		
		dm.setMode_ar(mode_ar.toUpperCase());
		dm.setBo_cd_ar(bo_cd_ar);
		dm.setChg_prv_area_cd_ar(chg_prv_area_cd_ar);
		dm.setChg_prv_srt_seq_ar(chg_prv_srt_seq_ar);
		dm.setChg_aft_area_cd_ar(chg_aft_area_cd_ar);
		dm.setChg_aft_srt_seq_ar(chg_aft_srt_seq_ar);

        try {
        	SE_BOI_1100DAO dao = new SE_BOI_1100DAO();
            ds = dao.se_boi_1120_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_BOI_1100EJBHome home = (SE_BOI_1100EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1100EJB");
//        try {
//        	SE_BOI_1100EJB ejb = home.create();
//            ds = ejb.se_boi_1120_u(dm);
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
