/***************************************************************************************************
* 파일명 : SSBrmgr1300WB.java
* 기능 : 지국경영-부수증감 부수담당 처리를 위한 Worker Bean
* 작성일자 : 2004-03-06
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
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
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;


/**
 * 지국경영-부수증감 부수담당 위한 WB
 */

public class SSBrmgr1300WB{

    /**
     * 지국경영-부수증감 본지신청,신청(부수담당) 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_QTYAPLC_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_QTYAPLC_INITDM dm = new SS_L_QTYAPLC_INITDM();
        
        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
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
     * 지국경영-부수증감 본지신청(부수담당) 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectQtyaplcMainNwspList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLC_MAIN_NWSPDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));        		//부서코드
        String partcd = Util.checkString(req.getParameter("partcd"));        		//부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));        		//지역코드
        String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));    			//일자
        String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));   //일자구분선택 (1:신청일자, 2:발송일자)
        String closyn = Util.checkString(req.getParameter("closyn"));   	        //마감여부조건

        // DM Setting
        SS_L_QTYAPLC_MAIN_NWSPDM dm = new SS_L_QTYAPLC_MAIN_NWSPDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setClosyn(closyn);

        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
        // DAO 객체의 selectQtyaplcMainNwspList 호출
        ds = dao.selectQtyaplcMainNwspList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
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
     * 지국경영-부수증감 본지신청(지원)-마감
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateQtyaplcMainNwspClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        // Request Parameter Processing
        final String DELIMITER = "##";

        StringBuffer sb_aplcdt = new StringBuffer("");     //신청일자(복수)
        StringBuffer sb_bocd   = new StringBuffer("");     //지국코드(복수)
        StringBuffer sb_issudt = new StringBuffer("");     //발행일자(복수)
        StringBuffer sb_prvissudt = new StringBuffer("");  //이전발행일자(복수)
        StringBuffer sb_chrgcnfmyn = new StringBuffer(""); //이전담당확인여부(복수)
        String checkedary = Util.checkString(req.getParameter("checkedary")); //마감확인여부(복수)

        String[] aplcdt  = req.getParameterValues("aplcdt");
        String[] bocd = req.getParameterValues("bocd");
        String[] issudt = req.getParameterValues("issudt");
        String[] prvissudt = req.getParameterValues("prvissudt");
        String[] chrgcnfmyn = req.getParameterValues("chrgcnfmyn");

        //## 추가구문
        for(int i=0; i<aplcdt.length; i++){
            sb_aplcdt.append(DELIMITER + aplcdt[i]);
            sb_bocd.append(DELIMITER + bocd[i]);
            sb_issudt.append(DELIMITER + issudt[i]);
            sb_prvissudt.append(DELIMITER + prvissudt[i]);
            sb_chrgcnfmyn.append(DELIMITER + chrgcnfmyn[i]);
        }
        //맨앞에 ## 제거구문
        if(aplcdt.length > 0){
            sb_aplcdt.delete(0,DELIMITER.length());
            sb_bocd.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_prvissudt.delete(0,DELIMITER.length());
            sb_chrgcnfmyn.delete(0,DELIMITER.length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);

        // DM Setting
        SS_U_QTYAPLC_MAIN_NWSP_CLOSDM dm = new SS_U_QTYAPLC_MAIN_NWSP_CLOSDM();

        dm.setAplcdt(sb_aplcdt.toString());
        dm.setBocd(sb_bocd.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setPrvissudt(sb_prvissudt.toString());
        dm.setChrgcnfmyn(sb_chrgcnfmyn.toString());
        dm.setClosyn(checkedary);
        dm.setIncmgpers(incmgpers);
        
        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
		// DAO 의 updateQtyaplcMainNwspClos 호출
        bResult = dao.updateQtyaplcMainNwspClos(dm);
        if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
        }
        req.setAttribute("bocd", bocd);


        /*SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
            bResult = ejb.updateQtyaplcMainNwspClos(dm);
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

    /**
     * 지국경영-부수증감 신청(지원) 조회(리스트)
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
        String closyn = Util.checkString(req.getParameter("closyn"));   	        //마감여부조건

        // DM Setting
        SS_L_QTYAPLCDM dm = new SS_L_QTYAPLCDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setClosyn(closyn);
        
        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
		// DAO 의 selectQtyaplcList 호출
		ds = dao.selectQtyaplcList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
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
     * 지국경영-부수증감 신청(지원)-마감
     * 본지를 제외한 부수증감신청은 소년(130),주간(110),스포츠(610),수능(111) 항목에 대해서만 처리한다.
     * 추가적인 매체에 대해 처리할 경우는  주석처리된 항목을 해제하고 매체정보 항목에 필요한 항목을 추가한다.
     * 본지를 제외한 부수증감신청 마감은 영업담당의 마감여부와 상관없이 처리한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateQtyaplcClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_QTYAPLC_CLOSDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        // Request Parameter Processing
        final String DELIMITER = "##";

        StringBuffer sb_aplcdt = new StringBuffer("");     //신청일자(복수)
        StringBuffer sb_bocd   = new StringBuffer("");     //지국코드(복수)
        StringBuffer sb_issudt = new StringBuffer("");     //발행일자(복수)
        StringBuffer sb_prvissudt = new StringBuffer("");     //이전발행일자(복수)
/*
        StringBuffer sb_chrgupdicdcqty130 = new StringBuffer("");     //소년증감분(복수)
        StringBuffer sb_chrgupdicdcqty210 = new StringBuffer("");     //주간증감분(복수)
        StringBuffer sb_chrgupdicdcqty610 = new StringBuffer("");     //스포츠증감분(복수)
        StringBuffer sb_chrgupdicdcqty111 = new StringBuffer("");     //수능증감분(복수)
        StringBuffer sb_chrgupdicdcqty130_u = new StringBuffer("");     //소년증감분수정가능여부(복수)
        StringBuffer sb_chrgupdicdcqty210_u = new StringBuffer("");     //주간증감분수정가능여부(복수)
        StringBuffer sb_chrgupdicdcqty610_u = new StringBuffer("");     //스포츠증감분수정가능여부(복수)
        StringBuffer sb_chrgupdicdcqty111_u = new StringBuffer("");     //수능증감분수정가능여부(복수)
*/
        StringBuffer sb_mediinfo = new StringBuffer("");     //매체정보(복수) : 매체코드*담당수정증감부수*수정가능여부@@매체코드*담당수정증감부수*수정가능여부@@매체코드*담당수정증감부수*수정가능여부##
        String checkedary = Util.checkString(req.getParameter("checkedary")); //마감확인여부(복수)

        String[] aplcdt  = req.getParameterValues("aplcdt");
        String[] bocd = req.getParameterValues("bocd");
        String[] issudt = req.getParameterValues("issudt");
        String[] prvissudt = req.getParameterValues("prvissudt");
        String[] medicd = req.getParameterValues("medicd");
        String[] chrgupdicdcqty = req.getParameterValues("chrgupdicdcqty");
        String[] chrgupdicdcqty_u = req.getParameterValues("chrgupdicdcqty_u");
        /*
        String[] chrgupdicdcqty130 = req.getParameterValues("chrgupdicdcqty130");
        String[] chrgupdicdcqty210 = req.getParameterValues("chrgupdicdcqty210");
        String[] chrgupdicdcqty610 = req.getParameterValues("chrgupdicdcqty610");
        String[] chrgupdicdcqty111 = req.getParameterValues("chrgupdicdcqty111");
        String[] chrgupdicdcqty130_u = req.getParameterValues("chrgupdicdcqty130_u");
        String[] chrgupdicdcqty210_u = req.getParameterValues("chrgupdicdcqty210_u");
        String[] chrgupdicdcqty610_u = req.getParameterValues("chrgupdicdcqty610_u");
        String[] chrgupdicdcqty111_u = req.getParameterValues("chrgupdicdcqty111_u");
        */

        //## 추가구문
        for(int i=0; i<aplcdt.length; i++){
            sb_aplcdt.append(DELIMITER + aplcdt[i]);
            sb_bocd.append(DELIMITER + bocd[i]);
            sb_issudt.append(DELIMITER + issudt[i]);
            sb_prvissudt.append(DELIMITER + prvissudt[i]);
            sb_mediinfo.append(DELIMITER + medicd[i] + "*" + chrgupdicdcqty[i] + "*"+ chrgupdicdcqty_u[i]);
        }
        //맨앞에 ## 제거구문
        if(aplcdt.length > 0){
            sb_aplcdt.delete(0,DELIMITER.length());
            sb_bocd.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_prvissudt.delete(0,DELIMITER.length());
            sb_mediinfo.delete(0,DELIMITER.length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);

        // DM Setting
        SS_U_QTYAPLC_CLOSDM dm = new SS_U_QTYAPLC_CLOSDM();

        dm.setAplcdt(sb_aplcdt.toString());
        dm.setBocd(sb_bocd.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setPrvissudt(sb_prvissudt.toString());
        dm.setMediinfo(sb_mediinfo.toString());
        dm.setClosyn(checkedary);
        dm.setIncmgpers(incmgpers);
        
        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
		// DAO 의 updateQtyaplcClos 호출
        bResult = dao.updateQtyaplcClos(dm);
		if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
        }
        req.setAttribute("bocd", bocd);
		
        /*
        SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
            bResult = ejb.updateQtyaplcClos(dm);
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
