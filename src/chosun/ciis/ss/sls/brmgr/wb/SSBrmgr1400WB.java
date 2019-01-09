/***************************************************************************************************
* 파일명 : SSBrmgr1400WB.java
* 기능 : 지국경영-부수증감-신청대행 처리를 위한 Worker Bean
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
 * 지국경영-부수증감-신청대행 위한 WB
 */

public class SSBrmgr1400WB{

    /**
     * 지국경영-부수증감-신청대행 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_QTYAPLC_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_QTYAPLC_INITDM dm = new SS_L_QTYAPLC_INITDM();
        
        SSBrmgr1400DAO dao = new SSBrmgr1400DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

        /*
		SSBrmgr1400EJBHome home = (SSBrmgr1400EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1400EJB");
        try{
            SSBrmgr1400EJB ejb = home.create();
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
     * 지국경영-부수증감-신청대행 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectQtyaplcVexcList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLC_VEXCDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));

        // DM Setting
        SS_L_QTYAPLC_VEXCDM dm = new SS_L_QTYAPLC_VEXCDM();
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        
        SSBrmgr1400DAO dao = new SSBrmgr1400DAO();
		// DAO 객체의 selectQtyaplcVexcList 호출
		ds = dao.selectQtyaplcVexcList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1400EJBHome home = (SSBrmgr1400EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1400EJB");
        try{
            SSBrmgr1400EJB ejb = home.create();
            ds = ejb.selectQtyaplcVexcList(dm);
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
     * 지국경영-부수증감 신청대행(부수담당)-저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateQtyaplcVexc(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_QTYAPLC_VEXCDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request로 반환할 String Type 결과값

        // Request Parameter Processing
        final String DELIMITER = "##";

		String bocd = ""; //지국지사코드
		String aplcdt = ""; //신청일자

        StringBuffer sb_aplcno = new StringBuffer("");     //신청번호(복수)
        StringBuffer sb_medicd = new StringBuffer("");     //매체코드(복수)
        StringBuffer sb_basidt = new StringBuffer("");     //기준일자(복수)
        StringBuffer sb_issudt = new StringBuffer("");     //발행일자(복수)
        StringBuffer sb_basiqty = new StringBuffer("");     //기준부수(복수)
        StringBuffer sb_boaplcicdcqty = new StringBuffer("");     //증감부수(복수)
        StringBuffer sb_sendqty = new StringBuffer("");     //발송부수(복수)
        String checkedary = Util.checkString(req.getParameter("checkedary")); //체크선택여부(복수)
        String checkyn = null; //  checkedary에서 #을 분리하여 저장하기 윈한 변수

        String[] bocd_ary  = req.getParameterValues("bocd");
        String[] aplcdt_ary  = req.getParameterValues("aplcdt");
        String[] aplcno_ary  = req.getParameterValues("aplcno");
        String[] medicd  = req.getParameterValues("medicd");
        String[] basidt  = req.getParameterValues("basidt");
        String[] issudt = req.getParameterValues("issudt");
        String[] basiqty = req.getParameterValues("basiqty");
        String[] boaplcicdcqty = req.getParameterValues("boaplcicdcqty");
        String[] sendqty = req.getParameterValues("sendqty");

		//## 추가구문
		int k = 0;
        for(int i=0; i<medicd.length; i++){

        	bocd = bocd_ary[0];
        	aplcdt = aplcdt_ary[0];

        	checkyn = checkedary.substring(i+k,i+k+1);

        	if(checkyn.equals("Y")){

                sb_aplcno.append(DELIMITER + aplcno_ary[i]);
                sb_medicd.append(DELIMITER + medicd[i]);
	        	sb_basidt.append(DELIMITER + basidt[i]);
	        	sb_issudt.append(DELIMITER + issudt[i]);
	        	sb_basiqty.append(DELIMITER + basiqty[i]);
	        	sb_boaplcicdcqty.append(DELIMITER + boaplcicdcqty[i]);
	        	sb_sendqty.append(DELIMITER + sendqty[i]);
	        }

        	k = k+2;
        }
        //맨앞에 ## 제거구문
        if(medicd.length > 0){
            sb_aplcno.delete(0,DELIMITER.length());
            sb_medicd.delete(0,DELIMITER.length());
            sb_basidt.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_basiqty.delete(0,DELIMITER.length());
            sb_boaplcicdcqty.delete(0,DELIMITER.length());
            sb_sendqty.delete(0,DELIMITER.length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        //String incmgpers = "user_id";

        // DM Setting
        SS_A_QTYAPLC_VEXCDM dm = new SS_A_QTYAPLC_VEXCDM();

        dm.setAplcdt(aplcdt);
        dm.setBocd(bocd);
        dm.setAplcno(sb_aplcno.toString());
        dm.setMedicd(sb_medicd.toString());
        dm.setBasidt(sb_basidt.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setBasiqty(sb_basiqty.toString());
        dm.setBoaplcicdcqty(sb_boaplcicdcqty.toString());
        dm.setSendqty(sb_sendqty.toString());
        dm.setIncmgpers(incmgpers);
        
        SSBrmgr1400DAO dao = new SSBrmgr1400DAO();
		// DAO 객체의 updateQtyaplcVexc 호출
        bResult = dao.updateQtyaplcVexc(dm);
        if(bResult == true){ // 성공적으로 입력된 경우
           sResult = "true";
        }
        req.setAttribute("bocd", bocd);

        /*
        SSBrmgr1400EJBHome home = (SSBrmgr1400EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1400EJB");
        try{
            SSBrmgr1400EJB ejb = home.create();
            bResult = ejb.updateQtyaplcVexc(dm);
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