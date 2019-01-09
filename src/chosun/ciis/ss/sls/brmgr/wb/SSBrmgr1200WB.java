/***************************************************************************************************
* 파일명 : SSBrmgr1200WB.java
* 기능 : 지국경영-부수증감 본지신청,신청(담당) 처리를 위한 Worker Bean
* 작성일자 : 2004-03-18
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 부수증감 - 본지(담당)에 결재처리 추가.
* 수정자 :   황성진
* 수정일자 : 2009.4.30
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.co.decid.dao.CO_DECID_1000DAO;
import chosun.ciis.co.decid.dm.CO_DECID_1000_IDM;
import chosun.ciis.co.decid.ds.CO_DECID_1000_IDataSet;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;

import chosun.ciis.ss.intf.brmgr.SSBrmgr1200AD;


/**
 * 지국경영-부수증감 본지신청,신청(담당) 위한 WB
 */

public class SSBrmgr1200WB{

    /**
     * 지국경영-부수증감 본지신청,신청(담당) 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_QTYAPLC_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_QTYAPLC_INITDM dm = new SS_L_QTYAPLC_INITDM();
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            ds = ejb.selectInitList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국경영-부수증감 본지신청(담당) 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectQtyaplcMainNwspList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLC_MAIN_NWSPDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));        		//부서코드
        String partcd = Util.checkString(req.getParameter("partcd"));        		//파트코드
        String areacd = Util.checkString(req.getParameter("areacd"));        		//지역코드
        String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));    			//일자
        String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));   //일자구분선택 (1:신청일자, 2:발송일자)
        String chrgcnfmyn = Util.checkString(req.getParameter("chrgcnfmyn"));   	//담당확인조건

        // DM Setting
        SS_L_QTYAPLC_MAIN_NWSPDM dm = new SS_L_QTYAPLC_MAIN_NWSPDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setChrgcnfmyn(chrgcnfmyn);
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
		// DAO 객체의 selectQtyaplcMainNwspList 호출
		ds = dao.selectQtyaplcMainNwspList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            ds = ejb.selectQtyaplcMainNwspList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국경영-부수증감 본지신청(담당)-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateQtyaplcMainNwsp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_QTYAPLC_MAIN_NWSPDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        // Request Parameter Processing
        final String DELIMITER = "##";

        StringBuffer sb_aplcdt = new StringBuffer("");     //신청일자(복수)
        StringBuffer sb_bocd   = new StringBuffer("");     //지국코드(복수)
        StringBuffer sb_issudt = new StringBuffer("");     //발행일자(복수)
        StringBuffer sb_chrgupdicdcqty = new StringBuffer("");     //담당수정증감부수(복수)
        StringBuffer sb_preclosyn = new StringBuffer("");     //이전마감여부(복수)
        StringBuffer sb_chkyn = new StringBuffer("");     //결재선택 여부. 담당확인여부를 사용하지 않고 이 필드를 사용. 담당확인 여부도 이 필드에 의해 조정됨.
        StringBuffer sb_remk = new StringBuffer("");     //비고
        StringBuffer sb_areacd = new StringBuffer("");		//결재에 포함될 지역
        String checkedary = Util.checkString(req.getParameter("checkedary")); //담당확인여부(복수)

        String[] aplcdt  = req.getParameterValues("aplcdt");
        String[] bocd = req.getParameterValues("bocd");
        String[] issudt = req.getParameterValues("issudt");
        String[] chrgupdicdcqty = req.getParameterValues("chrgupdicdcqty");
        String[] preclosyn = req.getParameterValues("preclosyn");
        String[] chkyn = req.getParameterValues("chk");
        String[] remk = req.getParameterValues("remk");
        String[] areacd = req.getParameterValues("areacd");

        //## 추가구문
        for(int i=0; i<aplcdt.length; i++){
            sb_aplcdt.append(DELIMITER + aplcdt[i]);
            sb_bocd.append(DELIMITER + bocd[i]);
            sb_issudt.append(DELIMITER + issudt[i]);
            sb_chrgupdicdcqty.append(DELIMITER + chrgupdicdcqty[i]);
            sb_preclosyn.append(DELIMITER + preclosyn[i]);
            sb_remk.append(DELIMITER + remk[i]);
            sb_chkyn.append(DELIMITER + chkyn[i]);
            //결재 체크가 된 건의 areacd만 조합.
            if("Y".equals(chkyn[i]))
            	sb_areacd.append("#" + areacd[i]);
        }
        //맨앞에 ## 제거구문
        if(aplcdt.length > 0){
            sb_aplcdt.delete(0,DELIMITER.length());
            sb_bocd.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_chrgupdicdcqty.delete(0,DELIMITER.length());
            sb_preclosyn.delete(0,DELIMITER.length());
            sb_chkyn.delete(0,DELIMITER.length());
            sb_remk.delete(0,DELIMITER.length());
            sb_areacd.delete(0,"#".length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);
        //String incmgpers = "user_id";

        // DM Setting
        SS_U_QTYAPLC_MAIN_NWSPDM dm = new SS_U_QTYAPLC_MAIN_NWSPDM();
        dm.setAplcdt(sb_aplcdt.toString());
        dm.setBocd(sb_bocd.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setChrgcnfmyn(checkedary);
        dm.setChrgupdicdcqty(sb_chrgupdicdcqty.toString());
        dm.setPreclosyn(sb_preclosyn.toString());
        dm.setChkyn(sb_chkyn.toString());
        dm.setRemk(sb_remk.toString());
        dm.setIncmgpers(incmgpers);

    	//신규 결재 코드 가져오기 DM setting -> 자체적으로 생성하는 것이 아니라 공통에서 받아오는 것으로 변경. 공통에 설정 포함.
        //SS_L_QTYAPLC_DOCIDDM docidDM = new SS_L_QTYAPLC_DOCIDDM();
        //docidDM.setDocumenttype(SSBrmgr1200AD.docType);
        CO_DECID_1000_IDM docidDM		= new CO_DECID_1000_IDM();
        docidDM.setCmpy_cd(SSBrmgr1200AD.companyCD);
        docidDM.setDecid_job_cd(SSBrmgr1200AD.docType);
        docidDM.setDoc_titl(SSBrmgr1200AD.subject);
        docidDM.setDoc_stat_cd(SSBrmgr1200AD.statReady);
        docidDM.setIncmg_pers_ip(req.getRemoteAddr());
        docidDM.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        docidDM.print();
        
        //결재에 포함될 지역단위 부수현황 DM setting
        SS_L_QTYAPLC_ILGYEDM ilgydm = new SS_L_QTYAPLC_ILGYEDM();
        ilgydm.setArealist(sb_areacd.toString());
        
        //********** 시작 *****************
        // 111111111111111111111111
        /*
        CO_DECID_1000DAO deciddao = new CO_DECID_1000DAO();
        CO_DECID_1000_IDataSet docidds = deciddao.getCo_decid_1000(docidDM);
        req.setAttribute("docidds", docidds);
        //저장 데이터에 결재 코드 추가.
        dm.setDocumentid(docidds.decid_key);
        
        //22222222222222222
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
        // DAO 객체의 selectQtyaplcDocID 호출
        SS_L_QTYAPLC_ILGYEDataSet ilgyds = dao.selectQtyaplcIlgye(ilgydm);
        req.setAttribute("ilgyds", ilgyds);
        
        //3333333333333333333
        try{
    	SSBrmgr1200AD ad = new SSBrmgr1200AD();
    	ad.setDocumentContent(req);
    	//System.out.println("===== approval doc =====" + ad.generateDocument());
    	ad.generateDocument();
    	ad.send(req);

        } catch(CreateException e){
        	SysException se = new SysException(e);
        	LogManager.getInstance().log(se);
        	throw se;
        } catch(RemoteException e){
        	SysException se = new SysException(e);
        	LogManager.getInstance().log(se);
        	throw se;
        } catch(AppException e){
        	LogManager.getInstance().log(e);
        	throw e;
        } catch(Exception e){
        	SysException se = new SysException(e);
        	LogManager.getInstance().log(se);
        	throw se;
        }
        // 4444444444444444444444444
        // DAO 객체의 updateQtyaplcMainNwsp 호출
        bResult = dao.updateQtyaplcMainNwsp(dm);
        if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
         }
         */
        //**********  끝  *****************
        
        

/*        CO_DECID_1000EJBHome decidHome	= (CO_DECID_1000EJBHome) JNDIManager.getInstance().getHome("CO_DECID_1000EJB");
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            CO_DECID_1000EJB decidEjb = decidHome.create();
            // 111111111111111111111111
        	//신규 결재 코드 가져오기 -> 공통에 결재 정보를 셋팅하고 결재 번호를 받아 온다.
            //SS_L_QTYAPLC_DOCIDDataSet docidds = ejb.selectQtyaplcDocID(docidDM);
//            CO_DECID_1000_IDataSet docidds = decidEjb.getCo_decid_1000(docidDM);
//            req.setAttribute("docidds", docidds);
//            //저장 데이터에 결재 코드 추가.
//            dm.setDocumentid(docidds.decid_key);
   
            //22222222222222222
            //지역단위 부수현황 가져오기.
//            SS_L_QTYAPLC_ILGYEDataSet ilgyds = ejb.selectQtyaplcIlgye(ilgydm);
//            req.setAttribute("ilgyds", ilgyds);
            
            //3333333333333333333
        	//결재 처리.
//        	SSBrmgr1200AD ad = new SSBrmgr1200AD();
//        	ad.setDocumentContent(req);
//        	//System.out.println("===== approval doc =====" + ad.generateDocument());
//        	ad.generateDocument();
//        	ad.send(req);
        	// 4444444444444444444444444
            bResult = ejb.updateQtyaplcMainNwsp(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("bocd", bocd);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(AppException e){
        	LogManager.getInstance().log(e);
            throw e;
       } catch(Exception e){
        	SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국경영-부수증감-본지신청(지원)-인쇄
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void printQtyaplcMainNwspClosList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLC_MAINNWSP_PRINTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));    			//일자
        String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));   //일자구분선택 (1:신청일자, 2:발송일자)
        String closyn = Util.checkString(req.getParameter("closyn"));   	        //마감여부조건

        // DM Setting
        SS_L_QTYAPLC_MAINNWSP_PRINTDM dm = new SS_L_QTYAPLC_MAINNWSP_PRINTDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setClosyn(closyn);
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
        // DAO 의 printQtyaplcMainNwspClosList 호출
        ds = dao.printQtyaplcMainNwspClosList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            ds = ejb.printQtyaplcMainNwspClosList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 지국경영-부수증감 신청(담당) 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectQtyaplcList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLCDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));        		//부서코드
        String partcd = Util.checkString(req.getParameter("partcd"));        		//부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));        		//지역코드
        String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));    			//일자
        String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));   //일자구분선택 (1:신청일자, 2:발송일자)
        String chrgcnfmyn = Util.checkString(req.getParameter("chrgcnfmyn"));   	//담당확인조건

        // DM Setting
        SS_L_QTYAPLCDM dm = new SS_L_QTYAPLCDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setChrgcnfmyn(chrgcnfmyn);
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
		// DAO 객체의 selectQtyaplcList 호출
		ds = dao.selectQtyaplcList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            ds = ejb.selectQtyaplcList(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }


    /**
     * 지국경영-부수증감 신청(담당)-저장(수정)
     * 본지를 제외한 부수증감신청은 소년(130),주간(110),스포츠(610),수능(111) 항목에 대해서만 처리한다.
     * 추가적인 매체에 대해 처리할 경우는  주석처리된 항목을 해제하고 매체정보 항목에 필요한 항목을 추가한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
    **/
    public void updateQtyaplc(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_QTYAPLCDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        // Request Parameter Processing
        final String DELIMITER = "##";

        StringBuffer sb_aplcdt = new StringBuffer("");     //신청일자(복수)
        StringBuffer sb_bocd   = new StringBuffer("");     //지국코드(복수)
        StringBuffer sb_issudt = new StringBuffer("");     //발행일자(복수)

/*
 *      프로시저 수정으로 주석처리
        StringBuffer sb_chrgupdicdcqty130 = new StringBuffer("");     //소년증감분(복수)
        StringBuffer sb_chrgupdicdcqty210 = new StringBuffer("");     //주간증감분(복수)
        StringBuffer sb_chrgupdicdcqty610 = new StringBuffer("");     //스포츠증감분(복수)
        StringBuffer sb_chrgupdicdcqty111 = new StringBuffer("");     //수능증감분(복수)
*/
/*
 추가적인 매체에 대해 처리할 경우는  주석처리된 항목을 해제하고 매체정보 항목에 필요한 항목을 추가한다.
        StringBuffer sb_chrgupdicdcqty613 = new StringBuffer("");     //쎄쎄쎄증감분(복수)
        StringBuffer sb_chrgupdicdcqty715 = new StringBuffer("");     //한경증감분(복수)
        StringBuffer sb_chrgupdicdcqty721 = new StringBuffer("");     //헤럴드증감분(복수)
*/
        /* 프로시저 수정으로 주석처
        StringBuffer sb_chrgupdicdcqty130_u = new StringBuffer("");     //소년증감분수정가능여부(복수)
        StringBuffer sb_chrgupdicdcqty210_u = new StringBuffer("");     //주간증감분수정가능여부(복수)
        StringBuffer sb_chrgupdicdcqty610_u = new StringBuffer("");     //스포츠증감분수정가능여부(복수)
        StringBuffer sb_chrgupdicdcqty111_u = new StringBuffer("");     //수능증감분수정가능여부(복수)
        */
/*
추가적인 매체에 대해 처리할 경우는  주석처리된 input 파라미터를 해제한다.
        StringBuffer sb_chrgupdicdcqty613_u = new StringBuffer("");     //쎄쎄쎄증감분수정가능여부(복수)
        StringBuffer sb_chrgupdicdcqty715_u = new StringBuffer("");     //한경증감분수정가능여부(복수)
        StringBuffer sb_chrgupdicdcqty721_u = new StringBuffer("");     //헤럴드증감분수정가능여부(복수)
*/
        StringBuffer sb_mediinfo = new StringBuffer("");     //매체정보(복수) : 매체코드*담당수정증감부수*수정가능여부@@매체코드*담당수정증감부수*수정가능여부@@매체코드*담당수정증감부수*수정가능여부##
        String checkedary = Util.checkString(req.getParameter("checkedary")); //담당확인여부(복수)

        String[] aplcdt  = req.getParameterValues("aplcdt");
        String[] bocd = req.getParameterValues("bocd");
        String[] issudt = req.getParameterValues("issudt");
        String[] medicd = req.getParameterValues("medicd");
        
        String[] chrgupdicdcqty = req.getParameterValues("chrgupdicdcqty");     //매체명(복수)
        String[] chrgupdicdcqty_u = req.getParameterValues("chrgupdicdcqty_u");     //매체명(복수)        
        /*
        String[] chrgupdicdcqty130 = req.getParameterValues("chrgupdicdcqty130");
        String[] chrgupdicdcqty210 = req.getParameterValues("chrgupdicdcqty210");
        String[] chrgupdicdcqty610 = req.getParameterValues("chrgupdicdcqty610");
        String[] chrgupdicdcqty111 = req.getParameterValues("chrgupdicdcqty111");
        */
/*
추가적인 매체에 대해 처리할 경우는  주석처리된 input 파라미터를 해제한다.
        String[] chrgupdicdcqty613 = req.getParameterValues("chrgupdicdcqty613");
        String[] chrgupdicdcqty715 = req.getParameterValues("chrgupdicdcqty715");
        String[] chrgupdicdcqty721 = req.getParameterValues("chrgupdicdcqty721");
*/
        /*
        String[] chrgupdicdcqty130_u = req.getParameterValues("chrgupdicdcqty130_u");
        String[] chrgupdicdcqty210_u = req.getParameterValues("chrgupdicdcqty210_u");
        String[] chrgupdicdcqty610_u = req.getParameterValues("chrgupdicdcqty610_u");
        String[] chrgupdicdcqty111_u = req.getParameterValues("chrgupdicdcqty111_u");
        */
/*
추가적인 매체에 대해 처리할 경우는  주석처리된 input 파라미터를 해제한다.

        String[] chrgupdicdcqty613_u = req.getParameterValues("chrgupdicdcqty613_u");
        String[] chrgupdicdcqty715_u = req.getParameterValues("chrgupdicdcqty715_u");
        String[] chrgupdicdcqty721_u = req.getParameterValues("chrgupdicdcqty721_u");
*/
        //## 추가구문
        for(int i=0; i<aplcdt.length; i++){
            sb_aplcdt.append(DELIMITER + aplcdt[i]);
            sb_bocd.append(DELIMITER + bocd[i]);
            sb_issudt.append(DELIMITER + issudt[i]);
/*
            sb_mediinfo.append(DELIMITER + "130*" + chrgupdicdcqty130[i] + "*"+ chrgupdicdcqty130_u[i] + "@@" + "210*" + chrgupdicdcqty210[i] + "*"+ chrgupdicdcqty210_u[i] + "@@" + "610*" + chrgupdicdcqty610[i] + "*"+ chrgupdicdcqty610_u[i] + "@@" + "111*" + chrgupdicdcqty111[i] + "*"+ chrgupdicdcqty111_u[i] + "@@" + "613*" + chrgupdicdcqty613[i] + "*"+ chrgupdicdcqty613_u[i] + "@@" + "715*" + chrgupdicdcqty715[i] + "*"+ chrgupdicdcqty715_u[i] + "@@" + "721*" + chrgupdicdcqty721[i] + "*"+ chrgupdicdcqty721_u[i]);
            sb_mediinfo.append(DELIMITER + "130*" + chrgupdicdcqty130[i] + "*"+ chrgupdicdcqty130_u[i] + "@@" + "210*" + chrgupdicdcqty210[i] + "*"+ chrgupdicdcqty210_u[i] + "@@" + "610*" + chrgupdicdcqty610[i] + "*"+ chrgupdicdcqty610_u[i] + "@@" + "111*" + chrgupdicdcqty111[i] + "*"+ chrgupdicdcqty111_u[i]);
*/
            sb_mediinfo.append(DELIMITER + medicd[i] + "*" + chrgupdicdcqty[i] + "*"+ chrgupdicdcqty_u[i] );
        }
        //맨앞에 ## 제거구문
        if(aplcdt.length > 0){
            sb_aplcdt.delete(0,DELIMITER.length());
            sb_bocd.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_mediinfo.delete(0,DELIMITER.length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);

        // DM Setting
        SS_U_QTYAPLCDM dm = new SS_U_QTYAPLCDM();

        dm.setAplcdt(sb_aplcdt.toString());
        dm.setBocd(sb_bocd.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setMediinfo(sb_mediinfo.toString());
        dm.setChrgcnfmyn(checkedary);
        dm.setIncmgpers(incmgpers);
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
		// DAO 객체의 updateQtyaplc 호출
        bResult = dao.updateQtyaplc(dm);
        if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
        }
        req.setAttribute("bocd", bocd);

        /* 
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            bResult = ejb.updateQtyaplc(dm);
            if(bResult == true){ // 성공적으로 입력된 경우
               sResult = "true";
            }
            req.setAttribute("bocd", bocd);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
}
