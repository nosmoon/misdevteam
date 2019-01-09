/***************************************************************************************************
* 파일명 : SSBrinfo1600WB.java
* 기능 : 지국Info-발송노선을 위한 Worker Bean
 * 작성일자 : 2004-04-01
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-발송노선을 위한 Worker Bean
 */

public class SSBrinfo1600WB{

    /**
     * 지국Info-지역정보가져오기
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectAreaList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	
    	SS_L_BSNS_INITDataSet ds = null;

    	SS_L_BSNS_INITDM dm = new SS_L_BSNS_INITDM();

    	SSBrinfo1600DAO dao = new SSBrinfo1600DAO();
        // DAO 객체의 selectBsnsList 호출
        ds = dao.selectAreaList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSBrinfo1600EJBHome home = (SSBrinfo1600EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1600EJB");
        try{
            SSBrinfo1600EJB ejb = home.create();
            SS_L_BSNS_INITDataSet ds = null;
            ds = ejb.selectAreaList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 지국Info-발송노선(발차노선조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBsnsList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_BSNSDataSet ds = null;
    	
         // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.checkString(req.getParameter("bocd"));    					    //지국지사코드
        String areacd = Util.checkString(req.getParameter("common_areacd"));	     		//지역코드
		String noname = Util.Uni2Ksc(Util.checkString(req.getParameter("noname")));			//노선명
		String jbbhdatefrom = Util.checkString(req.getParameter("jbbhdatefrom"));			//조회 시작일자
        String jbbhdateto = Util.checkString(req.getParameter("jbbhdateto"));				//조회 종료일자


        SS_L_BSNSDM dm = new SS_L_BSNSDM();

        //dm.setDeptcd(deptcd);
        //dm.setPartcd(partcd);
        dm.setAreacd(areacd);        
        dm.setBocd(bocd);
        dm.setSendplacnm(noname);
        dm.setFromdate(jbbhdatefrom);
        dm.setTodate(jbbhdateto);
        //dm.setNoname(noname);
		//dm.setJbbhdatefrom(jbbhdatefrom);
        //dm.setJbbhdateto(jbbhdateto);

        SSBrinfo1600DAO dao = new SSBrinfo1600DAO();
        // DAO 객체의 selectBsnsList 호출
        ds = dao.selectBsnsList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSBrinfo1600EJBHome home = (SSBrinfo1600EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1600EJB");
        try{
            SSBrinfo1600EJB ejb = home.create();
            SS_L_BSNSDataSet ds = null;
            ds = ejb.selectBsnsList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 지국Info-발송노선(sms조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectSmsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_SMSDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.checkString(req.getParameter("bocd"));    					//지국지사코드

        SS_S_SMSDM dm = new SS_S_SMSDM();

        dm.setBocd(bocd);
        
        SSBrinfo1600DAO dao = new SSBrinfo1600DAO();
        // DAO 객체의 selectLeasamtList 호출
        ds = dao.selectSmsDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding

        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSBrinfo1600EJBHome home = (SSBrinfo1600EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1600EJB");
        try{
            SSBrinfo1600EJB ejb = home.create();
            SS_S_SMSDataSet ds = null;
            ds = ejb.selectSmsDetail(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 지국Info-발송노선(sms수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectSmsUpdate(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_U_SMSDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.checkString(req.getParameter("bocd"));        				//지국지사코드
		String sms1 = Util.checkString(req.getParameter("sms1"));						//sms수신번호1
		String sms2 = Util.checkString(req.getParameter("sms2"));						//sms수신번호2
		String sms3 = Util.checkString(req.getParameter("sms3"));						//sms수신번호3
		String emailnm = Util.checkString(req.getParameter("emailnm"));					//Email
		String smsset = Util.checkString(req.getParameter("smsset"));					//sms통보여부
		String emailset = Util.checkString(req.getParameter("emailset"));				//email통보여부

        SS_U_SMSDM dm = new SS_U_SMSDM();

        dm.setBocd(bocd);
		dm.setSms1(sms1);
		dm.setSms2(sms2);
		dm.setSms3(sms3);
		dm.setEmailnm(emailnm);
		dm.setSmsset(smsset);
		dm.setEmailset(emailset);
		
		SSBrinfo1600DAO dao = new SSBrinfo1600DAO();
        // DAO 객체의 selectDetailView 호출
        ds = dao.selectSmsUpdate(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding

        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SSBrinfo1600EJBHome home = (SSBrinfo1600EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1600EJB");
        try{
            SSBrinfo1600EJB ejb = home.create();
            SS_U_SMSDataSet ds = null;
            ds = ejb.selectSmsUpdate(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
