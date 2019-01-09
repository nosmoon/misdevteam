/***************************************************************************************************
 * 파일명 : SE_TRG_1400WB.java
 * 기능 : 지국평가기준관리
 * 작성일자 : 2009-04-01
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
import chosun.ciis.se.trg.dao.SE_TRG_1400DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1400_MDM;
import chosun.ciis.se.trg.dm.SE_TRG_1410_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1420_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1430_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1440_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1450_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1460_ADM;
import chosun.ciis.se.trg.ds.SE_TRG_1400_MDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1410_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1420_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1430_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1440_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1450_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1460_ADataSet;
/**
 * 
 */

public class SE_TRG_1400WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1400_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1400_MDataSet ds = null;
		SE_TRG_1400_MDM dm = new SE_TRG_1400_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_TRG_1400DAO dao = new SE_TRG_1400DAO();
            ds = dao.se_trg_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1400EJBHome home = (SE_TRG_1400EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1400EJB");
//			SE_TRG_1400EJB ejb = home.create();
//
//			ds = ejb.se_trg_1400_m(dm);
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
     * 지국그룹관리 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1410_LDataSet ds = null;
		SE_TRG_1410_LDM dm = new SE_TRG_1410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.schgb = Util.checkString(req.getParameter("schgb"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_TRG_1400DAO dao = new SE_TRG_1400DAO();
            ds = dao.se_trg_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();	
//		try {
//			SE_TRG_1400EJBHome home = (SE_TRG_1400EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1400EJB");
//			SE_TRG_1400EJB ejb = home.create();
//
//			ds = ejb.se_trg_1410_l(dm);
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
     * 평가요소 관리 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1420_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1420_LDataSet ds = null;
		SE_TRG_1420_LDM dm = new SE_TRG_1420_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));

        try {
        	SE_TRG_1400DAO dao = new SE_TRG_1400DAO();
            ds = dao.se_trg_1420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1400EJBHome home = (SE_TRG_1400EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1400EJB");
//			SE_TRG_1400EJB ejb = home.create();
//
//			ds = ejb.se_trg_1420_l(dm);
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
     * 그룹 일괄분배
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1430_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1430_ADataSet ds = null;
		SE_TRG_1430_ADM dm = new SE_TRG_1430_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.colcnt = Util.checkString(req.getParameter("colcnt"));
		dm.evlu_grp_ar = Util.checkString(req.getParameter("evlu_grp_ar"));
		dm.bo_cnt_ar = Util.checkString(req.getParameter("bo_cnt_ar"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1400DAO dao = new SE_TRG_1400DAO();
            ds = dao.se_trg_1430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_TRG_1400EJBHome home = (SE_TRG_1400EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1400EJB");
//			SE_TRG_1400EJB ejb = home.create();
//
//			ds = ejb.se_trg_1430_a(dm);
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
     * 지국별 그룹수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1440_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1440_ADataSet ds = null;
		SE_TRG_1440_ADM dm = new SE_TRG_1440_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = dm.incmg_pers_ip = req.getRemoteAddr();
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		String bo_cdseq_ar = (String)hash.get("bo_cdseq"); 
		String evlu_grp_ar = (String)hash.get("evlu_grp"); 
		
		dm.mode_ar = mode_ar.toUpperCase();
		dm.bo_cdseq_ar = bo_cdseq_ar;
		dm.evlu_grp_ar = evlu_grp_ar;

        try {
        	SE_TRG_1400DAO dao = new SE_TRG_1400DAO();
            ds = dao.se_trg_1440_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_TRG_1400EJBHome home = (SE_TRG_1400EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1400EJB");
//			SE_TRG_1400EJB ejb = home.create();
//
//			ds = ejb.se_trg_1440_a(dm);
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
     * 평가요소 수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1450_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1450_ADataSet ds = null;
		SE_TRG_1450_ADM dm = new SE_TRG_1450_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.evlu_seq = Util.checkString(req.getParameter("evlu_seq"));
		dm.evlu_grp_ar = Util.checkString(req.getParameter("evlu_grp_ar"));
		dm.ratio1 = Util.checkString(req.getParameter("ratio1"));
		dm.ratio2 = Util.checkString(req.getParameter("ratio2"));

		int colcnt = Integer.parseInt(Util.checkString(req.getParameter("colcnt")));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		//String evlu_grp_ar = (String)hash.get("evlu_grp"); 
		//String amt_ar = (String)hash.get("amt"); 
		
		String[] tmpTok = mode_ar.split("#");
		int iRnum = tmpTok.length;

    	String colnm = "";
    	String amt_tmp = "";
		
    	String[] amt_ar = new String[iRnum];

    	for(int i=1; i<=colcnt; i++){
    		colnm = "grp"+i;
    		amt_tmp = (String)hash.get(colnm); 

    		String[] tmpTok1 = amt_tmp.split("#");

    		//가변갯수만큼 ':'로 구분자 넣어 만듬
    		for(int j=0; j<iRnum; j++){
    			if(i==1){
    				amt_ar[j] = "";
    			}
    			
    			if(tmpTok1.length>j) amt_ar[j] = amt_ar[j] + ":" + tmpTok1[j];
    			else amt_ar[j] = amt_ar[j] + ":";
    			
    			if(i==1){
    				amt_ar[j] = amt_ar[j].substring(1);
    			}
    		}
    	}

    	String amt_send_ar = "";
    	
		for(int i=0; i<iRnum; i++){
			amt_send_ar = amt_send_ar +"#"+ amt_ar[i];
		}

		amt_send_ar = amt_send_ar.substring(1);
		dm.mode_ar = mode_ar.toUpperCase();
		dm.amt_ar = amt_send_ar;
		
    	String multiUpDate2 = Util.checkString(req.getParameter("multiUpDate2"));
    	Hashtable hash2 = getHashMultiUpdateData(multiUpDate2);

    	String mode_ar2 = (String)hash2.get("m"); 
		//String evlu_grp_ar = (String)hash2.get("evlu_grp"); 
		//String amt_ar = (String)hash2.get("amt"); 
		
		String[] tmpTok2 = mode_ar2.split("#");
		int iRnum2 = tmpTok2.length;

    	String amt_tmp2 = "";
		
    	String[] amt_ar2 = new String[iRnum2];

    	for(int i=1; i<=colcnt; i++){
    		colnm = "grp"+i;
    		amt_tmp2 = (String)hash2.get(colnm); 

    		String[] tmpTok1 = amt_tmp2.split("#");

    		//가변갯수만큼 ':'로 구분자 넣어 만듬
    		for(int j=0; j<iRnum2; j++){
    			if(i==1){
    				amt_ar2[j] = "";
    			}
    			
    			if(tmpTok1.length>j) amt_ar2[j] = amt_ar2[j] + ":" + tmpTok1[j];
    			else amt_ar2[j] = amt_ar2[j] + ":";
    			
    			if(i==1){
    				amt_ar2[j] = amt_ar2[j].substring(1);
    			}
    		}
    	}

    	String amt_send_ar2 = "";
    	
		for(int i=0; i<iRnum2; i++){
			amt_send_ar2 = amt_send_ar2 +"#"+ amt_ar2[i];
		}

		amt_send_ar2 = amt_send_ar2.substring(1);
		dm.mode2_ar = mode_ar2.toUpperCase();
		dm.amt2_ar = amt_send_ar2;

        try {
        	SE_TRG_1400DAO dao = new SE_TRG_1400DAO();
            ds = dao.se_trg_1450_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
		
//		try {
//			SE_TRG_1400EJBHome home = (SE_TRG_1400EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1400EJB");
//			SE_TRG_1400EJB ejb = home.create();
//
//			ds = ejb.se_trg_1450_a(dm);
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
     * 평가기준 전월복사
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1460_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1460_ADataSet ds = null;
		SE_TRG_1460_ADM dm = new SE_TRG_1460_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1400DAO dao = new SE_TRG_1400DAO();
            ds = dao.se_trg_1460_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
//		try {
//			SE_TRG_1400EJBHome home = (SE_TRG_1400EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1400EJB");
//			SE_TRG_1400EJB ejb = home.create();
//
//			ds = ejb.se_trg_1460_a(dm);
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
