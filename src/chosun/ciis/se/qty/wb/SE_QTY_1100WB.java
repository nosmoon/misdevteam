/***************************************************************************************************
* 파일명 : SE_QTY_1100WB.java
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

package chosun.ciis.se.qty.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_1100DAO;
import chosun.ciis.se.qty.dm.SE_QTY_1100_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_1110_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_1120_UDM;
import chosun.ciis.se.qty.dm.SE_QTY_1130_ADM;
import chosun.ciis.se.qty.dm.SE_QTY_1140_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_1100_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1110_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1120_UDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1130_ADataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1140_LDataSet;
/**
 * 
 */

public class SE_QTY_1100WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1100_MDataSet ds = null;

        // DM Setting
        SE_QTY_1100_MDM dm = new SE_QTY_1100_MDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_QTY_1100DAO dao = new SE_QTY_1100DAO();
            ds = dao.se_qty_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_QTY_1100EJBHome home = (SE_QTY_1100EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1100EJB");
//        
//        try {
//        	SE_QTY_1100EJB ejb = home.create();
//            ds = ejb.se_qty_1100_m(dm);
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
     * 지역별 일계내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1110_LDataSet ds = null;

        // DM Setting
        SE_QTY_1110_LDM dm = new SE_QTY_1110_LDM();

		String team_cd = Util.checkString(req.getParameter("team_cd"));
		String part_cd = Util.checkString(req.getParameter("part_cd"));
		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String tms = Util.checkString(req.getParameter("tms"));
		String yymm = Util.checkString(req.getParameter("yymm"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String sell_net_clsf = Util.checkString(req.getParameter("sell_net_clsf"));
        
        //if(yymm.length()==8) yymm = yymm.substring(0,6);
        
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setTeam_cd(team_cd);
		dm.setPart_cd(part_cd);
		dm.setArea_cd(area_cd);
		dm.setMedi_cd(medi_cd);
		dm.setTms(tms);
		dm.setYymm(yymm);
		dm.setSell_net_clsf(sell_net_clsf);

        try {
        	SE_QTY_1100DAO dao = new SE_QTY_1100DAO();
            ds = dao.se_qty_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_QTY_1100EJBHome home = (SE_QTY_1100EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1100EJB");
//        try {
//        	SE_QTY_1100EJB ejb = home.create();
//            ds = ejb.se_qty_1110_l(dm);
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
     * 일계내역 저장
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1120_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1120_UDataSet ds = null;
        // DM Setting
        SE_QTY_1120_UDM dm = new SE_QTY_1120_UDM();
        
		String yymm = Util.checkString(req.getParameter("yymm"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String tms = Util.checkString(req.getParameter("tms"));
		if(yymm.length()==8) yymm = yymm.substring(0,6);
		
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setCmpy_cd(cmpy_cd);
		dm.setYymm(yymm);
		dm.setMedi_cd(medi_cd);
		dm.setTms(tms);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
    	String mode_ar = (String)hash.get("m"); 
		String bo_cd_ar = (String)hash.get("bo_cd"); 
		String bo_seq_ar = (String)hash.get("bo_seq"); 
		String gnr_enty_qty_ar = (String)hash.get("gnr_enty_qty"); 
		String isenty_qty_ar = (String)hash.get("isenty_qty"); 
		String isicdc_qty_ar = (String)hash.get("isicdc_qty"); 
		String rdr_extn_enty_qty_ar = (String)hash.get("rdr_extn_enty_qty"); 
		String val_movm_qty_ar = (String)hash.get("val_movm_qty"); 
		String val_icdc_qty_ar = (String)hash.get("val_icdc_qty"); 
		
		dm.setMode_ar(mode_ar.toUpperCase());
		dm.setBo_cd_ar(bo_cd_ar);
		dm.setBo_seq_ar(bo_seq_ar);
		dm.setGnr_enty_qty_ar(gnr_enty_qty_ar);
		dm.setIsenty_qty_ar(isenty_qty_ar);
		dm.setIsicdc_qty_ar(isicdc_qty_ar);
		dm.setRdr_extn_enty_qty_ar(rdr_extn_enty_qty_ar);
		dm.setVal_movm_qty_ar(val_movm_qty_ar);
		dm.setVal_icdc_qty_ar(val_icdc_qty_ar);
		
		dm.print();

        try {
        	SE_QTY_1100DAO dao = new SE_QTY_1100DAO();
            ds = dao.se_qty_1120_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_QTY_1100EJBHome home = (SE_QTY_1100EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1100EJB");
//        try {
//        	SE_QTY_1100EJB ejb = home.create();
//            ds = ejb.se_qty_1120_u(dm);
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
     * 마감/마감취소
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_1130_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_1130_ADataSet ds = null;
		SE_QTY_1130_ADM dm = new SE_QTY_1130_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.selldeptcd = Util.getSessionParameterValue(req, "selldeptcd", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.areagb = Util.checkString(req.getParameter("areagb"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_QTY_1100DAO dao = new SE_QTY_1100DAO();
            ds = dao.se_qty_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_QTY_1100EJBHome home = (SE_QTY_1100EJBHome)JNDIManager.getInstance().getHome("SE_QTY_1100EJB");
//			SE_QTY_1100EJB ejb = home.create();
//
//			ds = ejb.se_qty_1130_a(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
	
}
