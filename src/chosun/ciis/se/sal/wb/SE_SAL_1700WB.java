/***************************************************************************************************
* 파일명 : SE_SAL_1700WB.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-16
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dm.CO_SMTB_1020_UDM;
import chosun.ciis.se.sal.ds.CO_SMTB_1020_UDataSet;
import chosun.ciis.se.sal.dao.SE_SAL_1700DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1700_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1710_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1720_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1730_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1740_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1750_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1760_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1770_UDM;
import chosun.ciis.se.sal.dm.SE_SAL_1780_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1785_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1700_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1710_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1720_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1730_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1740_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1750_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1760_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1770_UDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1780_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1785_ADataSet;
/**
 * 
 */

public class SE_SAL_1700WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1700_MDataSet ds = null;

        // DM Setting
        SE_SAL_1700_MDM dm 		= new SE_SAL_1700_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        String auth_gb			= "1";
        String feat_clsf		= "";
        
        Calendar cal 			= Calendar.getInstance();
        String yyyy				= String.valueOf(cal.get(cal.YEAR));
        String mm				= String.valueOf(cal.get(cal.MONTH) + 1);
        mm						= mm.length() == 1 ? "0" + mm : mm;
    	String dd				= String.valueOf(cal.get(cal.DATE));
    	dd						= dd.length() == 1 ? "0" + dd : dd;
        
        dm.setAuth_gb			(auth_gb		);
        dm.setFeat_clsf			(feat_clsf		);
        dm.setBase_dt			(yyyy + mm + dd	);
        
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1700_m(dm);
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
    
    /**
     * 청구 등록 대상 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1710_LDataSet ds = null;

        // DM Setting
        SE_SAL_1710_LDM dm 		= new SE_SAL_1710_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String team				= Util.checkString(req.getParameter("team"		));
        String part				= Util.checkString(req.getParameter("part"		));
        String area				= Util.checkString(req.getParameter("area"		));
        String bo_nm			= Util.checkString(req.getParameter("bo_nm"		));
        String gubun			= Util.checkString(req.getParameter("gubun"		));
        String send_gubun		= Util.checkString(req.getParameter("send_gubun"));
        String elec_yn			= Util.checkString(req.getParameter("elec_yn"	));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setYymm				(yymm			);
        dm.setTeam				(team			);
        dm.setPart				(part			);
        dm.setArea				(area			);
        dm.setBo_nm				(bo_nm			);
        dm.setGubun				(gubun			);
        dm.setSend_gubun		(send_gubun		);
        dm.setElec_yn			(elec_yn		);
        
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1710_l(dm);
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
    
    /**
     * 1차, 2차 일련번호 생성
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1720_ADataSet ds = null;

        // DM Setting
        SE_SAL_1720_ADM dm 		= new SE_SAL_1720_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip	= Util.checkString(req.getRemoteAddr());
        String clos_yn			= Util.checkString(req.getParameter("clos_yn"	));
        String yymm				= Util.checkString(req.getParameter("yymm"		));
        String tms				= Util.checkString(req.getParameter("tms"		));
        String selldeptcd		= "";
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setClos_yn			(clos_yn		);
        dm.setYymm				(yymm			);
        dm.setTms				(tms			);
        dm.setSelldeptcd		(selldeptcd		);
        
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1720_a(dm);
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
    
    /**
     * 일괄발행 대상 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1730_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1730_LDataSet ds = null;

        // DM Setting
        SE_SAL_1730_LDM dm 		= new SE_SAL_1730_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String gubun			= Util.checkString(req.getParameter("gubun"			));
        String vat_gubun		= Util.checkString(req.getParameter("vat_gubun"		));
        String correct_gubun	= Util.checkString(req.getParameter("correct_gubun"	));
        String elec_yn			= Util.checkString(req.getParameter("elec_yn"		));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setYymm				(yymm			);
        dm.setGubun				(gubun			);
        dm.setVat_gubun			(vat_gubun		);
        dm.setElec_yn			(elec_yn		);
        dm.setCorrect_gubun		(correct_gubun	);
        dm.print();
        
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1730_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1730_l(dm);
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
    
    /**
     * 전송 자료 생성 및 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1740_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1740_ADataSet ds = null;

        // DM Setting 
        SE_SAL_1740_ADM dm 		= new SE_SAL_1740_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip	= Util.checkString(req.getRemoteAddr());
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String gubun			= Util.checkString(req.getParameter("gubun"			));
        String vat_gubun		= Util.checkString(req.getParameter("vat_gubun"		));
        String correct_gubun	= Util.checkString(req.getParameter("correct_gubun"	));
        String semuro_id		= Util.checkString(req.getParameter("semuro_id"		));
        String tmsg_type		= "1";
        String stmt_clsf		= vat_gubun.equals("2") ? "1" : "3";
        String pers_clsf		= "2";
                
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setGubun				(gubun			);
        dm.setVat_gubun			(vat_gubun		);
        dm.setCorrect_gubun		(correct_gubun	);
        dm.setTmsg_type			(tmsg_type		);
        dm.setStmt_clsf			(stmt_clsf		);
        dm.setPers_clsf			(pers_clsf		);
        dm.setSemuro_id			(semuro_id		);
        dm.print();
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1740_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1740_a(dm);
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
    
    /**
     * 개별발행 대상 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1750_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1750_LDataSet ds = null;

        // DM Setting
        SE_SAL_1750_LDM dm 		= new SE_SAL_1750_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String gubun			= Util.checkString(req.getParameter("gubun"			));
        String vat_gubun		= Util.checkString(req.getParameter("vat_gubun"		));
        String correct_gubun	= Util.checkString(req.getParameter("correct_gubun"	));
        String elec_yn			= Util.checkString(req.getParameter("elec_yn"		));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setYymm				(yymm			);
        dm.setGubun				(gubun			);
        dm.setVat_gubun			(vat_gubun		);
        dm.setElec_yn			(elec_yn		);
        dm.setCorrect_gubun		(correct_gubun	);
        dm.print();
        
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1750_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1750_l(dm);
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
    
    /**
     * 개별 자료 생성 및 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1760_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1760_ADataSet ds = null;

        // DM Setting
        SE_SAL_1760_ADM dm 		= new SE_SAL_1760_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip	= Util.checkString(req.getRemoteAddr());
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String gubun			= Util.checkString(req.getParameter("gubun"			));
        String vat_gubun		= Util.checkString(req.getParameter("vat_gubun"		));
        String correct_gubun	= Util.checkString(req.getParameter("correct_gubun"	));
        String semuro_id		= Util.checkString(req.getParameter("semuro_id"		));
        String tmsg_type		= "1";
        String stmt_clsf		= vat_gubun.equals("2") ? "1" : "3";
        String pers_clsf		= "2";
                
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setGubun				(gubun			);
        dm.setVat_gubun			(vat_gubun		);
        dm.setCorrect_gubun		(correct_gubun	);
        dm.setTmsg_type			(tmsg_type		);
        dm.setStmt_clsf			(stmt_clsf		);
        dm.setPers_clsf			(pers_clsf		);
        dm.setSemuro_id			(semuro_id		);
        
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1760_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1760_a(dm);
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
    
    /**
     * 세무로 번호 업데이트
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1770_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	
        SE_SAL_1770_UDataSet ds = null;

        // DM Setting
        SE_SAL_1770_UDM dm 		= new SE_SAL_1770_UDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip	= Util.checkString(req.getRemoteAddr());
        String slip_occr_dt		= Util.checkString(req.getParameter("slip_occr_dt"	));
        String slip_clsf_cd		= Util.checkString(req.getParameter("slip_clsf_cd"	));
        String slip_seq			= Util.checkString(req.getParameter("slip_seq"		));
        String vat_gubun		= Util.checkString(req.getParameter("vat_gubun"		));
        String semuro_no		= Util.checkString(req.getParameter("semuro_no"		));
        
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setSlip_occr_dt		(slip_occr_dt	);
        dm.setSlip_clsf_cd		(slip_clsf_cd	);
        dm.setSlip_seq			(slip_seq		);
        dm.setVat_gubun			(vat_gubun		);
        dm.setSemuro_no			(semuro_no		);
        
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1770_u(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1770_u(dm);
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
    
    public void se_sal_1780_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1780_ADataSet ds = null;

        // DM Setting 
        SE_SAL_1780_ADM dm 		= new SE_SAL_1780_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip	= Util.checkString(req.getRemoteAddr());
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String gubun			= Util.checkString(req.getParameter("gubun"			));
        String vat_gubun		= Util.checkString(req.getParameter("vat_gubun"		));
        String correct_gubun	= Util.checkString(req.getParameter("correct_gubun"	));
        String semuro_id		= Util.checkString(req.getParameter("semuro_id"		));
        String tmsg_type		= "1";
        String stmt_clsf		= vat_gubun.equals("2") ? "1" : "3";
        String pers_clsf		= "2";
                
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setYymm				(yymm			);
        dm.setGubun				(gubun			);
        dm.setVat_gubun			(vat_gubun		);
        dm.setCorrect_gubun		(correct_gubun	);
        dm.setTmsg_type			(tmsg_type		);
        dm.setStmt_clsf			(stmt_clsf		);
        dm.setPers_clsf			(pers_clsf		);
        //dm.setSemuro_id			(semuro_id		);
        dm.print();
        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1780_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1700EJBHome home = (SE_SAL_1700EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1700EJB");
//        
//        try {
//        	SE_SAL_1700EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1740_a(dm);
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
    
    public void se_sal_1785_a(HttpServletRequest req, HttpServletResponse res) throws AppException 
	{
    	SE_SAL_1785_ADataSet ds = null;
    	SE_SAL_1785_ADM dm = new SE_SAL_1785_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.interface_batch_id = Util.checkString(req.getParameter("batch_id"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ip = req.getRemoteAddr();

		dm.print();

        try {
        	SE_SAL_1700DAO dao = new SE_SAL_1700DAO();
            ds = dao.se_sal_1785_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		/* EJB 수정후 끝 */

		/*
		try 
		{
			CO_SMTB_1000EJBHome home = (CO_SMTB_1000EJBHome)JNDIManager.getInstance().getHome("CO_SMTB_1000EJB");
			CO_SMTB_1000EJB ejb = home.create();

			ds = ejb.co_smtb_1020_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) 
		{
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) 
		{
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		*/

		/*******************************************************************************************
		 String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		 Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		 dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 dm.interface_batch_id = (String)hash.get("interface_batch_id");
		 dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		 dm.incmg_pers = (String)hash.get("incmg_pers");
		 *******************************************************************************************/

		/*******************************************************************************************
		 dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 dm.interface_batch_id = Util.getSessionParameterValue(req,"interface_batch_id",true);
		 dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		 dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 *******************************************************************************************/
	} 
}
