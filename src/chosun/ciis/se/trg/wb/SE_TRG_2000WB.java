/***************************************************************************************************
 * 파일명 : SE_TRG_2000WB.java
 * 기능 : 담당평가결과 조회
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
import chosun.ciis.se.trg.dao.SE_TRG_2000DAO;
import chosun.ciis.se.trg.dm.SE_TRG_2010_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_2020_UDM;
import chosun.ciis.se.trg.ds.SE_TRG_2010_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_2020_UDataSet;
/**
 * 
 */

public class SE_TRG_2000WB extends BaseWB {

    /**
     * 실적내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_2010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_2010_LDataSet ds = null;
		SE_TRG_2010_LDM dm = new SE_TRG_2010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
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
        	SE_TRG_2000DAO dao = new SE_TRG_2000DAO();
            ds = dao.se_trg_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_2000EJBHome home = (SE_TRG_2000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_2000EJB");
//			SE_TRG_2000EJB ejb = home.create();
//
//			ds = ejb.se_trg_2010_l(dm);
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
     * 보정점수 저장
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_2020_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_2020_UDataSet ds = null;
		SE_TRG_2020_UDM dm = new SE_TRG_2020_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));

    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode_ar = (String)hash.get("m"); 
		String chrg_pers_ar = (String)hash.get("chrg_pers"); 
		String rvis_scor_ar = (String)hash.get("rvis_scor"); 

		dm.mode_ar = mode_ar.toUpperCase();
		dm.chrg_pers_ar = chrg_pers_ar;
		dm.rvis_scor_ar = rvis_scor_ar;

        try {
        	SE_TRG_2000DAO dao = new SE_TRG_2000DAO();
            ds = dao.se_trg_2020_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_TRG_2000EJBHome home = (SE_TRG_2000EJBHome)JNDIManager.getInstance().getHome("SE_TRG_2000EJB");
//			SE_TRG_2000EJB ejb = home.create();
//
//			ds = ejb.se_trg_2020_u(dm);
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
