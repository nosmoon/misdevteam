/***************************************************************************************************
 * 파일명 : SE_TRG_1800WB.java
 * 기능 : 담당평가대상자선정
 * 작성일자 : 2009-04-06
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.trg.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.trg.dao.SE_TRG_1800DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1810_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1820_ADM;
import chosun.ciis.se.trg.ds.SE_TRG_1810_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1820_ADataSet;
/**
 * 
 */

public class SE_TRG_1800WB extends BaseWB {

    /**
     * 대상자내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1810_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1810_LDataSet ds = null;
		SE_TRG_1810_LDM dm = new SE_TRG_1810_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		String evlu_no = Util.checkString(req.getParameter("evlu_no"));
		String yy = "";
		String evlu_seq = "";
		if(evlu_no.length()>=4){
			yy = evlu_no.substring(0,4);
		}
		if(evlu_no.length()==7){
			evlu_seq = evlu_no.substring(4,7);
		}
		
		dm.yy = yy;
		dm.evlu_seq = evlu_seq;

        try {
        	SE_TRG_1800DAO dao = new SE_TRG_1800DAO();
            ds = dao.se_trg_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1800EJBHome home = (SE_TRG_1800EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1800EJB");
//			SE_TRG_1800EJB ejb = home.create();
//
//			ds = ejb.se_trg_1810_l(dm);
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
    
    /**
     * 대상자 저장
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1820_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1820_ADataSet ds = null;
		SE_TRG_1820_ADM dm = new SE_TRG_1820_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));

    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode_ar = (String)hash.get("m"); 
		String team_cd_ar = (String)hash.get("team_cd"); 
		String part_cd_ar = (String)hash.get("part_cd"); 
		String area_cd_ar = (String)hash.get("area_cd"); 
		String chrg_pers_ar = (String)hash.get("chrg_pers"); 
		String evlu_yn_ar = (String)hash.get("evlu_yn"); 
		String evlu_grp_ar = (String)hash.get("evlu_grp"); 
		String remk_ar = (String)hash.get("remk"); 

		dm.mode_ar = mode_ar.toUpperCase();
		dm.team_cd_ar = team_cd_ar;
		dm.part_cd_ar = part_cd_ar;
		dm.area_cd_ar = area_cd_ar;
		dm.chrg_pers_ar = chrg_pers_ar;
		dm.evlu_yn_ar = evlu_yn_ar;
		dm.evlu_grp_ar = evlu_grp_ar;
		dm.remk_ar = remk_ar;

        try {
        	SE_TRG_1800DAO dao = new SE_TRG_1800DAO();
            ds = dao.se_trg_1820_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1800EJBHome home = (SE_TRG_1800EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1800EJB");
//			SE_TRG_1800EJB ejb = home.create();
//
//			ds = ejb.se_trg_1820_a(dm);
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
