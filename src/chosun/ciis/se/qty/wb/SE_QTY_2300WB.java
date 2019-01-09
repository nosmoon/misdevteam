/***************************************************************************************************
* 파일명 : SE_QTY_2300WB.java
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
import chosun.ciis.se.intf.qty.SE_QTY_2300Decid;
import chosun.ciis.se.qty.dao.SE_QTY_2300DAO;
import chosun.ciis.se.qty.dao.SE_QTY_2400DAO;
import chosun.ciis.se.qty.dm.SE_QTY_2300_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_2305_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_2306_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2310_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2320_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_2330_ADM;
import chosun.ciis.se.qty.dm.SE_QTY_2340_ADM;
import chosun.ciis.se.qty.dm.SE_QTY_2450_UDM;
import chosun.ciis.se.qty.dm.SE_QTY_2670_PDM;
import chosun.ciis.se.qty.ds.SE_QTY_2300_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2305_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2306_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2310_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2320_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2330_ADataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2340_ADataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2450_UDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_2670_PDataSet;
/**
 * 
 */

public class SE_QTY_2300WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2300_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2300_MDataSet ds = null;
		SE_QTY_2300_MDM dm = new SE_QTY_2300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_QTY_2300DAO dao = new SE_QTY_2300DAO();
            ds = dao.se_qty_2300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2300EJBHome home = (SE_QTY_2300EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2300EJB");
//			SE_QTY_2300EJB ejb = home.create();
//
//			ds = ejb.se_qty_2300_m(dm);
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
     * 발송정보 팝업 초기
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2305_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2305_MDataSet ds = null;
		SE_QTY_2305_MDM dm = new SE_QTY_2305_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_QTY_2300DAO dao = new SE_QTY_2300DAO();
            ds = dao.se_qty_2305_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2300EJBHome home = (SE_QTY_2300EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2300EJB");
//			SE_QTY_2300EJB ejb = home.create();
//
//			ds = ejb.se_qty_2305_m(dm);
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
     * 해당일의 발송매체,섹션 내역
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2306_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2306_LDataSet ds = null;
		SE_QTY_2306_LDM dm = new SE_QTY_2306_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));

        try {
        	SE_QTY_2300DAO dao = new SE_QTY_2300DAO();
            ds = dao.se_qty_2306_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_QTY_2300EJBHome home = (SE_QTY_2300EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2300EJB");
//			SE_QTY_2300EJB ejb = home.create();
//
//			ds = ejb.se_qty_2306_l(dm);
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
     * 발송정보 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2310_LDataSet ds = null;
		SE_QTY_2310_LDM dm = new SE_QTY_2310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));

        try {
        	SE_QTY_2300DAO dao = new SE_QTY_2300DAO();
            ds = dao.se_qty_2310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_QTY_2300EJBHome home = (SE_QTY_2300EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2300EJB");
//			SE_QTY_2300EJB ejb = home.create();
//
//			ds = ejb.se_qty_2310_l(dm);
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
     * 인쇄부수 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2320_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2320_LDataSet ds = null;
		SE_QTY_2320_LDM dm = new SE_QTY_2320_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));

        try {
        	SE_QTY_2300DAO dao = new SE_QTY_2300DAO();
            ds = dao.se_qty_2320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_2300EJBHome home = (SE_QTY_2300EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2300EJB");
//			SE_QTY_2300EJB ejb = home.create();
//
//			ds = ejb.se_qty_2320_l(dm);
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
     * 발송정보 등록/삭제
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_2330_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2330_ADataSet ds = null;
		SE_QTY_2330_ADM dm = new SE_QTY_2330_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		dm.clos_tms = Util.checkString(req.getParameter("clos_tms"));
		dm.ser_no1 = Util.checkString(req.getParameter("ser_no1"));
		dm.ser_no2 = Util.checkString(req.getParameter("ser_no2"));
		dm.sect_remk = Util.checkString(req.getParameter("sect_remk"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.chg_matt = Util.checkString(req.getParameter("chg_matt"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		String mode_ar = (String)hash.get("m");
		String send_proc_seq_ar = (String)hash.get("send_proc_seq");
		String prt_dt_ar = (String)hash.get("prt_dt");
		String route_clsf_ar = (String)hash.get("route_clsf");
		String medi_cd_ar = (String)hash.get("medi_cd");
		String sect_cd_ar = (String)hash.get("sect_cd");
		String pcnt_ar = (String)hash.get("pcnt");
		String clr_pcnt_ar = (String)hash.get("clr_pcnt");
		String add_prt_seq_ar = (String)hash.get("add_prt_seq");
		
		dm.mode_ar = mode_ar.toUpperCase();
		dm.send_proc_seq_ar = send_proc_seq_ar;
		dm.prt_dt_ar = prt_dt_ar;
		dm.route_clsf_ar = route_clsf_ar;
		dm.medi_cd_ar = medi_cd_ar;
		dm.sect_cd_ar = sect_cd_ar;
		dm.pcnt_ar = pcnt_ar;
		dm.clr_pcnt_ar = clr_pcnt_ar;
		dm.add_prt_seq_ar = add_prt_seq_ar;
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_QTY_2300DAO dao = new SE_QTY_2300DAO();
            ds = dao.se_qty_2330_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_QTY_2300EJBHome home = (SE_QTY_2300EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2300EJB");
//			SE_QTY_2300EJB ejb = home.create();
//
//			ds = ejb.se_qty_2330_a(dm);
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
	public void se_qty_2340_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_2340_ADataSet ds = null;
		SE_QTY_2340_ADM dm = new SE_QTY_2340_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		dm.clos_tms = Util.checkString(req.getParameter("clos_tms"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_QTY_2300DAO dao = new SE_QTY_2300DAO();
            ds = dao.se_qty_2340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_QTY_2300EJBHome home = (SE_QTY_2300EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2300EJB");
//			SE_QTY_2300EJB ejb = home.create();
//
//			ds = ejb.se_qty_2340_a(dm);
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
	public void se_qty_2350_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		CO_DECID_1000_IDM coDm = new CO_DECID_1000_IDM();

		SE_QTY_2450_UDataSet ds = null;
		SE_QTY_2450_UDM dm = new SE_QTY_2450_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		dm.clos_tms = Util.checkString(req.getParameter("clos_tms"));
		dm.incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));

		SE_QTY_2670_PDataSet pDs = null;
		SE_QTY_2670_PDM pDm = new SE_QTY_2670_PDM();

		pDm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		pDm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		pDm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		pDm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		pDm.clos_tms = Util.checkString(req.getParameter("clos_tms"));
		pDm.incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));


		try {
	        coDm.setCmpy_cd(SE_QTY_2300Decid.companyCD);
	        coDm.setDecid_job_cd(SE_QTY_2300Decid.docType);
	        coDm.setDoc_titl(SE_QTY_2300Decid.subject);
	        coDm.setDoc_stat_cd(SE_QTY_2300Decid.statReady);
	        coDm.setIncmg_pers_ip(req.getRemoteAddr());
	        coDm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        	//인쇄부수전표 조회
        	SE_QTY_2300DAO dao1 = new SE_QTY_2300DAO();
			pDs = dao1.se_qty_2670_p(pDm);

//			SE_QTY_2300EJBHome home = (SE_QTY_2300EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2300EJB");
//			SE_QTY_2300EJB ejb = home.create();
//
			if(!(pDs.curlist_a.size()==24 && pDs.curlist_b.size()==9 && pDs.curlist_c.size()==2)){
//				System.out.println("pDs.curlist_a.size()>>>>>>>>"+pDs.curlist_a.size());
//				System.out.println("pDs.curlist_b.size()>>>>>>>>"+pDs.curlist_b.size());
//				System.out.println("pDs.curlist_c.size()>>>>>>>>"+pDs.curlist_c.size());
	            throw new AppException("SE_QTY_2300WB", "전자결재 양식과 데이타 내역이 맞지 않습니다. 양식을 수정하십시오.");
			}

			req.setAttribute("pDs", pDs);


//	        CO_DECID_1000EJBHome decidHome	= (CO_DECID_1000EJBHome) JNDIManager.getInstance().getHome("CO_DECID_1000EJB");
//            CO_DECID_1000EJB coEjb = decidHome.create();

//            CO_DECID_1000_IDataSet coDs = coEjb.getCo_decid_1000(coDm);
//            req.setAttribute("coDs", coDs);
            
			//결재키 신규생성
        	CO_DECID_1000DAO dao2 = new CO_DECID_1000DAO();
    		CO_DECID_1000_IDataSet coDs = dao2.getCo_decid_1000(coDm);
            req.setAttribute("coDs", coDs);

            //결재키 마감정보에 업뎃
    		dm.decid_id = coDs.decid_key;
			System.out.println("coDs.decid_key>>>>>>>>>>>"+coDs.decid_key);
 		
        	SE_QTY_2400DAO dao3 = new SE_QTY_2400DAO();
            ds = dao3.se_qty_2450_u(dm);

//			SE_QTY_2400EJBHome home2 = (SE_QTY_2400EJBHome)JNDIManager.getInstance().getHome("SE_QTY_2400EJB");
//			SE_QTY_2400EJB ejb2 = home2.create();

//			ds = ejb2.se_qty_2450_u(dm);
			
        	//결재 처리.
			SE_QTY_2300Decid qDecid = new SE_QTY_2300Decid();
			qDecid.setDocumentContent(req);
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


}
