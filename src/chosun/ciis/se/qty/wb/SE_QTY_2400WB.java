/***************************************************************************************************
* 파일명 : SE_QTY_2400WB.java
 * 기능 : 부수관리 - 일일증감부수마감
 * 작성일자 : 2009-03-10
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.qty.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.decid.dao.CO_DECID_1000DAO;
import chosun.ciis.co.decid.dm.CO_DECID_1000_IDM;
import chosun.ciis.co.decid.ds.CO_DECID_1000_IDataSet;
import chosun.ciis.se.intf.qty.SE_QTY_2400Decid;
import chosun.ciis.se.qty.dao.SE_QTY_2400DAO;
import chosun.ciis.se.qty.dm.SE_QTY_2400_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_2410_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2420_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2430_ADM;
import chosun.ciis.se.qty.dm.SE_QTY_2440_ADM;
import chosun.ciis.se.qty.dm.SE_QTY_2450_UDM;
import chosun.ciis.se.qty.dm.SE_QTY_2460_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2680_PDM;
import chosun.ciis.se.qty.ds.SE_QTY_2400_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2410_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2420_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2430_ADataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2440_ADataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2450_UDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2460_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2680_PDataSet;

/**
 * 
 */

public class SE_QTY_2400WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2400_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2400_MDataSet ds = null;
		SE_QTY_2400_MDM dm = new SE_QTY_2400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_QTY_2400DAO dao = new SE_QTY_2400DAO();
            ds = dao.se_qty_2400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2400EJBHome home = (SE_QTY_2400EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2400EJB");
//			SE_QTY_2400EJB ejb = home.create();
//
//			ds = ejb.se_qty_2400_m(dm);
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
     * 마감내역 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2410_LDataSet ds = null;
		SE_QTY_2410_LDM dm = new SE_QTY_2410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt1 = Util.checkString(req.getParameter("issu_dt1"));
		dm.issu_dt2 = Util.checkString(req.getParameter("issu_dt2"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));

        try {
        	SE_QTY_2400DAO dao = new SE_QTY_2400DAO();
            ds = dao.se_qty_2410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2400EJBHome home = (SE_QTY_2400EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2400EJB");
//			SE_QTY_2400EJB ejb = home.create();
//
//			ds = ejb.se_qty_2410_l(dm);
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
     * 마감대상 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2420_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2420_LDataSet ds = null;
		SE_QTY_2420_LDM dm = new SE_QTY_2420_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		dm.clos_tms = Util.checkString(req.getParameter("clos_tms"));

        try {
        	SE_QTY_2400DAO dao = new SE_QTY_2400DAO();
            ds = dao.se_qty_2420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//		try {
//			SE_QTY_2400EJBHome home = (SE_QTY_2400EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2400EJB");
//			SE_QTY_2400EJB ejb = home.create();
//
//			ds = ejb.se_qty_2420_l(dm);
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
     * 마감정보 등록/저장/삭제
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2430_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2430_ADataSet ds = null;
		SE_QTY_2430_ADM dm = new SE_QTY_2430_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		String mode_ar = (String)hash.get("m");
		String issu_dt_ar = (String)hash.get("issu_dt");
		String send_clos_grp_clsf_ar = (String)hash.get("send_clos_grp_clsf");
		String clos_tms_ar = (String)hash.get("clos_tms");
		String remk_ar = (String)hash.get("remk");
		
		dm.mode_ar = mode_ar.toUpperCase();
		dm.issu_dt_ar = issu_dt_ar;
		dm.send_clos_grp_clsf_ar = send_clos_grp_clsf_ar;
		dm.clos_tms_ar = clos_tms_ar;
		dm.remk_ar = remk_ar;

        try {
        	SE_QTY_2400DAO dao = new SE_QTY_2400DAO();
            ds = dao.se_qty_2430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_QTY_2400EJBHome home = (SE_QTY_2400EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2400EJB");
//			SE_QTY_2400EJB ejb = home.create();
//
//			ds = ejb.se_qty_2430_a(dm);
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
     * 마감/마감취소 실행
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2440_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2440_ADataSet ds = null;
		SE_QTY_2440_ADM dm = new SE_QTY_2440_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		dm.clos_tms = Util.checkString(req.getParameter("clos_tms"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_QTY_2400DAO dao = new SE_QTY_2400DAO();
            ds = dao.se_qty_2440_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_QTY_2400EJBHome home = (SE_QTY_2400EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2400EJB");
//			SE_QTY_2400EJB ejb = home.create();
//
//			ds = ejb.se_qty_2440_a(dm);
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
     * 전자결재 실행
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2450_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2450_UDataSet ds = null;
		SE_QTY_2450_UDM dm = new SE_QTY_2450_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		dm.clos_tms = Util.checkString(req.getParameter("clos_tms"));
		dm.incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));

		SE_QTY_2680_PDataSet pDs = null;
		SE_QTY_2680_PDM pDm = new SE_QTY_2680_PDM();

		pDm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		pDm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		pDm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		pDm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		pDm.clos_tms = Util.checkString(req.getParameter("clos_tms"));
		pDm.incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));


		try {
	        CO_DECID_1000_IDM coDm = new CO_DECID_1000_IDM();
	        coDm.setCmpy_cd(SE_QTY_2400Decid.companyCD);
	        coDm.setDecid_job_cd(SE_QTY_2400Decid.docType);
	        coDm.setDoc_titl(SE_QTY_2400Decid.subject);
	        coDm.setDoc_stat_cd(SE_QTY_2400Decid.statReady);
	        coDm.setIncmg_pers_ip(req.getRemoteAddr());
	        coDm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

			//결재키 신규생성
        	CO_DECID_1000DAO dao1 = new CO_DECID_1000DAO();
            CO_DECID_1000_IDataSet coDs = dao1.getCo_decid_1000(coDm);
            req.setAttribute("coDs", coDs);

//	        CO_DECID_1000EJBHome decidHome	= (CO_DECID_1000EJBHome) JNDIManager.getInstance().getHome("CO_DECID_1000EJB");
//            CO_DECID_1000EJB coEjb = decidHome.create();
//	        
//            CO_DECID_1000_IDataSet coDs = coEjb.getCo_decid_1000(coDm);
//            req.setAttribute("coDs", coDs);
            
    		dm.decid_id = coDs.decid_key;
			System.out.println("coDs.decid_key>>>>>>>>>>>"+coDs.decid_key);
   		
			//결재키 마감정보에 업뎃
        	SE_QTY_2400DAO dao2 = new SE_QTY_2400DAO();
			ds = dao2.se_qty_2450_u(dm);

//			SE_QTY_2400EJBHome home = (SE_QTY_2400EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2400EJB");
//			SE_QTY_2400EJB ejb = home.create();
//
//			ds = ejb.se_qty_2450_u(dm);
			
			//추가인쇄의뢰내역 조회
			pDs = dao2.se_qty_2680_p(pDm);
			req.setAttribute("pDs", pDs);

        	//결재 처리.
			SE_QTY_2400Decid qDecid = new SE_QTY_2400Decid();
			qDecid.setDocumentContent(req);
        	//System.out.println("===== approval doc =====" + ad.generateDocument());
			qDecid.generateDocument();
			qDecid.send(req);
        	
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch(AppException e){
        	LogManager.getInstance().log(e);
            throw e;
        }
		catch(Exception e){
        	SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

	}

	public void se_qty_2460_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2460_LDataSet ds = null;
		SE_QTY_2460_LDM dm = new SE_QTY_2460_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		dm.clos_tms = Util.checkString(req.getParameter("clos_tms"));

        try {
        	SE_QTY_2400DAO dao = new SE_QTY_2400DAO();
            ds = dao.se_qty_2460_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_QTY_2400EJBHome home = (SE_QTY_2400EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2400EJB");
//			SE_QTY_2400EJB ejb = home.create();
//
//			ds = ejb.se_qty_2460_l(dm);
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
