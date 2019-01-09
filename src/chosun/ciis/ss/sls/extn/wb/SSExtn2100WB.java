/***************************************************************************************************
* 파일명   : SSExtn2100WB.java
* 기능     : 확장현황 본사확장 페이지를 위한 Worker Bean
* 작성일자 : 2009-05-20
* 작성자   : 권정윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 확장현황 본사확장 페이지를 위한 WB
 */

public class SSExtn2100WB{

    /**
     * 확장현황-본사확장-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void hdqtInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_HDQT_INITDataSet ds = null;
        // DM Setting
    	SS_L_EXTN_HDQT_INITDM dm = new SS_L_EXTN_HDQT_INITDM();

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.hdqtInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.hdqtInit(dm);
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
     * 확장현황-본사확장-조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selecthdqt(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_HDQTDataSet ds = null;
    	
    	String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
    	String type2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type2")));
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
    	String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
    	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
    	String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
    	String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
    	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
    	String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
    	String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
    	String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
    	String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
    	String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
    	
        // DM Setting
    	SS_L_EXTN_HDQTDM dm = new SS_L_EXTN_HDQTDM();
    	dm.setType(type);
    	dm.setType2(type2);
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setMedicd(medicd);
    	dm.setFromtogb(fromtogb);
    	dm.setFromdt(fromdt);
    	dm.setTodt(todt);
    	dm.setAplcpathcd(aplcpathcd);
    	dm.setRdr_extntypecd(rdr_extntypecd);
    	dm.setRdrnm(rdrnm);
    	dm.setExtnflnm(extnflnm);
    	dm.setAplcpersnm(aplcpersnm);
    	dm.setBo_headcnfmyn(bo_headcnfmyn);
    	dm.setSubscnfmstatcd(subscnfmstatcd);
    	dm.setValmm(valmm);
    	
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.selecthdqt(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.selecthdqt(dm);
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
     * 확장현황-본사확장-상세조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void detailhdqt(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_EXTN_HDQTDataSet ds = null;
    	
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
    	String mangno = Util.Uni2Ksc(Util.checkString(req.getParameter("mangno")));
    	
        // DM Setting
    	SS_S_EXTN_HDQTDM dm = new SS_S_EXTN_HDQTDM();
    	dm.setRdr_no(rdr_no);
    	dm.setMedicd(medicd);
    	dm.setCntrno(cntrno);
    	dm.setMangno(mangno);
    	
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.detailhdqt(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.detailhdqt(dm);
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
     * 확장현황-본사확장-사원확장 계좌정보 업데이트
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updatehdqt(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_U_EXTN_HDQTDataSet ds = null;
    	
    	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
    	String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
    	String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
    	String alonadjmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("alonadjmyn")));
    	String banknm = Util.Uni2Ksc(Util.checkString(req.getParameter("banknm")));
    	String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
    	String depspers = Util.Uni2Ksc(Util.checkString(req.getParameter("depspers")));
    	
        // DM Setting
    	SS_U_EXTN_HDQTDM dm = new SS_U_EXTN_HDQTDM();
    	dm.setUid(uid);
    	dm.setCmpycd(cmpycd);
    	dm.setRdr_extndt(rdr_extndt);
    	dm.setRdr_extnno(rdr_extnno);
    	dm.setRdr_extncost(rdr_extncost);
    	dm.setAlonadjmyn(alonadjmyn);
    	dm.setBanknm(banknm);
    	dm.setAcctno(acctno);
    	dm.setDepspers(depspers);
        	
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.updatehdqt(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.updatehdqt(dm);
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
     * 확장현황-본사확장- 지역담당자 공지
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void alerthdqt(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_EXTN_HDQT_ALERTDataSet ds = null;
    	
    	String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
    	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
    	    	
        // DM Setting
    	SS_I_EXTN_HDQT_ALERTDM dm = new SS_I_EXTN_HDQT_ALERTDM();
    	dm.setValmm(valmm);
    	dm.setUid(uid);
    	        
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.alerthdqt(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.alerthdqt(dm);
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
     * 확장현황-본사확장- 지역담당자 공지내용
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void showAlert(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_HDQT_ALERTDataSet ds = null;
    	
    	String emp_no = Util.getSessionParameterValue(req, "emp_no", true);   //사번    
    	String valmm = Util.getSessionParameterValue(req, "valmm", true); // 유가월
    	//String emp_no = "190054";

        // DM Setting
    	SS_L_EXTN_HDQT_ALERTDM dm = new SS_L_EXTN_HDQT_ALERTDM();
    	dm.setEmp_no(emp_no);
    	dm.setValmm(valmm);
    	
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.showAlert(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.showAlert(dm);
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
     * 확장현황-에듀/제휴확장-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void eduInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_EDU_INITDataSet ds = null;
        // DM Setting
    	SS_L_EXTN_EDU_INITDM dm = new SS_L_EXTN_EDU_INITDM();

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.eduInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.eduInit(dm);
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
     * 확장현황-에듀/제휴확장-목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEdu(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_EDUINSTDataSet ds = null;
    	
    	String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
    	String edutype = Util.Uni2Ksc(Util.checkString(req.getParameter("edutype")));
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
    	String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
    	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
    	String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
    	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
    	String instnm = Util.Uni2Ksc(Util.checkString(req.getParameter("instnm")));
    	String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
    	String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
    	
        // DM Setting
    	SS_L_EXTN_EDUINSTDM dm = new SS_L_EXTN_EDUINSTDM();
    	dm.setType(type);
    	dm.setEdutype(edutype);
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setMedicd(medicd);
    	dm.setFromtogb(fromtogb);
    	dm.setFromdt(fromdt);
    	dm.setTodt(todt);
    	dm.setRdr_extntypecd(rdr_extntypecd);
    	dm.setRdrnm(rdrnm);
    	dm.setInstnm(instnm);
    	dm.setSubscnfmstatcd(subscnfmstatcd);
    	dm.setValmm(valmm);
    	
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.selectEdu(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.selectEdu(dm);
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
     * 확장현황-에듀/제휴확장-상세조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void detailEdu(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_EXTN_EDURDRDataSet ds = null;
    	
    	String insttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("insttcd")));
    	String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
    	String edutype = Util.Uni2Ksc(Util.checkString(req.getParameter("edutype")));
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
    	String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
    	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
    	String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
    	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
    	String instnm = Util.Uni2Ksc(Util.checkString(req.getParameter("instnm")));
    	String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
    	String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
    
        // DM Setting
    	SS_S_EXTN_EDURDRDM dm = new SS_S_EXTN_EDURDRDM();
    	dm.setInsttcd(insttcd);
    	dm.setType(type);
    	dm.setEdutype(edutype);
    	dm.setDeptcd(deptcd);
    	dm.setPartcd(partcd);
    	dm.setAreacd(areacd);
    	dm.setBocd(bocd);
    	dm.setMedicd(medicd);
    	dm.setFromtogb(fromtogb);
    	dm.setFromdt(fromdt);
    	dm.setTodt(todt);
    	dm.setRdr_extntypecd(rdr_extntypecd);
    	dm.setRdrnm(rdrnm);
    	dm.setInstnm(instnm);
    	dm.setSubscnfmstatcd(subscnfmstatcd);
    	dm.setValmm(valmm);
    	
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.detailEdu(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.detailEdu(dm);
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
     * 확장현황-에듀/제휴확장-상세저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateEdu(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_U_EXTN_EDURDRDataSet ds = null;
    	
    	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	String insttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("insttcd")));
    	String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
    	String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
    	String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String protpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("protpersnm")));
    	String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
    	String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
    	String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
    	String procstat = Util.Uni2Ksc(Util.checkString(req.getParameter("procstat")));
    	String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
    	
        // DM Setting
    	SS_U_EXTN_EDURDRDM dm = new SS_U_EXTN_EDURDRDM();
    	dm.setUid(uid);
    	dm.setCmpycd(cmpycd);
    	dm.setInsttcd(insttcd);
    	dm.setSeq(seq);
    	dm.setRdr_extndt(rdr_extndt);
    	dm.setRdr_extnno(rdr_extnno);
    	dm.setBocd(bocd);
    	dm.setProtpersnm(protpersnm);
    	dm.setZip(zip);
    	dm.setAddr(addr);
    	dm.setDtlsaddr(dtlsaddr);
    	dm.setProcstat(procstat);
    	dm.setRemk(remk);
    	
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.updateEdu(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.updateEdu(dm);
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
     * 확장현황-에듀/제휴확장-독자등록 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void eduRdrInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_EDURDR_INITDataSet ds = null;
        // DM Setting
    	SS_L_EXTN_EDURDR_INITDM dm = new SS_L_EXTN_EDURDR_INITDM();

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.eduRdrInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.eduRdrInit(dm);
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
     * 확장현황-에듀/제휴확장-독자등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertRdr(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_EXTN_EDURDRDataSet ds = null;
    	
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);   //입력자 아이디
    	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
    	String instcd = Util.Uni2Ksc(Util.checkString(req.getParameter("instcd")));
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String subsqty = Util.Uni2Ksc(Util.checkString(req.getParameter("subsqty")));
    	String rdr_extndd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndd")));
    	String nm = Util.Uni2Ksc(Util.checkString(req.getParameter("nm")));
    	String protpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("protpersnm")));
    	String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
    	String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
    	String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
    	String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
    	String subsyn = Util.Uni2Ksc(Util.checkString(req.getParameter("subsyn")));
    	String dlvhopedd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
    	String rdrcnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrcnfm")));
    	String procstat = Util.Uni2Ksc(Util.checkString(req.getParameter("procstat")));
    	String resn = Util.Uni2Ksc(Util.checkString(req.getParameter("resn")));
    	String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
    	
        // DM Setting
    	SS_I_EXTN_EDURDRDM dm = new SS_I_EXTN_EDURDRDM();
    	dm.setCmpycd(cmpycd);
    	dm.setUid(uid);
    	dm.setInstcd(instcd);
    	dm.setMedicd(medicd);
    	dm.setSubsqty(subsqty);
    	dm.setRdr_extndd(rdr_extndd);
    	dm.setNm(nm);
    	dm.setProtpersnm(protpersnm);
    	dm.setTel_no(tel_no);
    	dm.setZip(zip);
    	dm.setAddr(addr);
    	dm.setDtlsaddr(dtlsaddr);
    	dm.setSubsyn(subsyn);
    	dm.setDlvhopedd(dlvhopedd);
    	dm.setBocd(bocd);
    	dm.setBonm(bonm);
    	dm.setRdrcnfm(rdrcnfm);
    	dm.setProcstat(procstat);
    	dm.setResn(resn);
    	dm.setRemk(remk);

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.insertRdr(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.insertRdr(dm);
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
     * 확장현황-에듀/제휴확장-기관신규등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertInst(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_EXTN_EDUINSTDataSet ds = null;
    	
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);   //입력자 아이디
    	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
    	String edutype = Util.Uni2Ksc(Util.checkString(req.getParameter("edutype")));
    	String insttnm = Util.Uni2Ksc(Util.checkString(req.getParameter("insttnm")));
    	String ldgrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("ldgrnm")));
    	String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
    	String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
    	String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
    	String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
    	String cntrbgndd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrbgndd")));
    	String cntrto_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrto_dd")));
    	String rdr_extndd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));
    	String bns_itemuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemuprc")));
    	String comsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("comsuprc")));
    	String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
    	
        // DM Setting
    	SS_I_EXTN_EDUINSTDM dm = new SS_I_EXTN_EDUINSTDM();
    	dm.setCmpycd(cmpycd);
    	dm.setUid(uid);
    	dm.setEdutype(edutype);
    	dm.setInsttnm(insttnm);
    	dm.setLdgrnm(ldgrnm);
    	dm.setTel_no(tel_no);
    	dm.setZip(zip);
    	dm.setAddr(addr);
    	dm.setDtlsaddr(dtlsaddr);
    	dm.setCntrbgndd(cntrbgndd);
    	dm.setCntrto_dd(cntrto_dd);
    	dm.setRdr_extndd(rdr_extndd);
    	dm.setBocd(bocd);
    	dm.setSubsuprc(subsuprc);
    	dm.setBns_itemuprc(bns_itemuprc);
    	dm.setComsuprc(comsuprc);
    	dm.setRemk(remk);

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.insertInst(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.insertInst(dm);
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
     * /확장현황-사원확장비 관리 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void costInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_COST_INITDataSet ds = null;
        // DM Setting
    	SS_L_EXTN_COST_INITDM dm = new SS_L_EXTN_COST_INITDM();

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.costInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.costInit(dm);
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
     * /확장현황-사원확장비 관리 조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_EXTN_COSTDataSet ds = null;
    	
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String rdr_extnbgndd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnbgndd")));
    	String rdr_extnto_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnto_dd")));
    	
        // DM Setting
    	SS_L_EXTN_COSTDM dm = new SS_L_EXTN_COSTDM();
    	dm.setMedicd(medicd);
    	dm.setRdr_extnbgndd(rdr_extnbgndd);
    	dm.setRdr_extnto_dd(rdr_extnto_dd);

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.selectCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.selectCost(dm);
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
     * /확장현황-사원확장비 신규입력
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_EXTN_COSTDataSet ds = null;
    	
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);   
    	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
    	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
    	String rdr_extnbgndd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnbgndd")));
    	String rdr_extnto_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnto_dd")));
    	String rdr_extncampnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampnm")));
    	String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
    	String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
    	
        // DM Setting
    	SS_I_EXTN_COSTDM dm = new SS_I_EXTN_COSTDM();
    	dm.setCmpycd(cmpycd);
    	dm.setUid(uid);
    	dm.setMedicd(medicd);
    	dm.setRdr_extnbgndd(rdr_extnbgndd);
    	dm.setRdr_extnto_dd(rdr_extnto_dd);
    	dm.setRdr_extncampnm(rdr_extncampnm);
    	dm.setRdr_extncost(rdr_extncost);
    	dm.setRemk(remk);

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.insertCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.insertCost(dm);
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
     * /확장현황-단체확장-업로드
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void uploadExtn(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_I_EXTN_PATYRDRDataSet ds = null;
    	
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);   
    	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
    	String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
    	String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
    	String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));
    	String extn_bank_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_bank_nm")));
    	String extn_acc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_acc_no")));
    	String extn_depositor = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_depositor")));
    	String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
    	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
    	String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
    	String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
    	String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
    	String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
    	String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
    	String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
    	String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
    	String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
    	String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
    	String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
    	String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
    	String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
    	String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
    	String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
    	String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));
    	String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));
    	String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));
    	String medi1 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi1")));
    	String medi2 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi2")));
    	String medi3 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi3")));
    	String medi4 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi4")));
    	String medi5 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi5")));
    	String medi6 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi6")));
    	String medi7 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi7")));
    	String medi8 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi8")));
    	String medi9 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi9")));
    	String medi10 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi10")));
    	String svc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc1")));
    	String svc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc2")));
    	String svc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc3")));
    	String svc4 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc4")));
    	String svc5 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc5")));
    	String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
    	
        // DM Setting
    	SS_I_EXTN_PATYRDRDM dm = new SS_I_EXTN_PATYRDRDM();
    	dm.setCmpycd(cmpycd);
    	dm.setUid(uid);
    	dm.setExtndt(extndt);
    	dm.setExtnflnm(extnflnm);
    	dm.setPymtflnm(pymtflnm);
    	dm.setExtn_bank_nm(extn_bank_nm);
    	dm.setExtn_acc_no(extn_acc_no);
    	dm.setExtn_depositor(extn_depositor);
    	dm.setDept_nm(dept_nm);
    	dm.setRdrnm(rdrnm);
    	dm.setRdrtel_no1(rdrtel_no1);
    	dm.setRdrtel_no2(rdrtel_no2);
    	dm.setRdrtel_no3(rdrtel_no3);
    	dm.setRdrptph_no1(rdrptph_no1);
    	dm.setRdrptph_no2(rdrptph_no2);
    	dm.setRdrptph_no3(rdrptph_no3);
    	dm.setDlvzip(dlvzip);
    	dm.setDlvaddr(dlvaddr);
    	dm.setDlvdtlsaddr(dlvdtlsaddr);
    	dm.setCorrbocd(corrbocd);
    	dm.setDlvhopedt(dlvhopedt);
    	dm.setValmm(valmm);
    	dm.setResiclsfcd(resiclsfcd);
    	dm.setResitypecd(resitypecd);
    	dm.setAplcperstel_no1(aplcperstel_no1);
    	dm.setAplcperstel_no2(aplcperstel_no2);
    	dm.setAplcperstel_no3(aplcperstel_no3);
    	dm.setMedi1(medi1);
    	dm.setMedi2(medi2);
    	dm.setMedi3(medi3);
    	dm.setMedi4(medi4);
    	dm.setMedi5(medi5);
    	dm.setMedi6(medi6);
    	dm.setMedi7(medi7);
    	dm.setMedi8(medi8);
    	dm.setMedi9(medi9);
    	dm.setMedi10(medi10);
    	dm.setSvc1(svc1);
    	dm.setSvc2(svc2);
    	dm.setSvc3(svc3);
    	dm.setSvc4(svc4);
    	dm.setSvc5(svc5);
    	dm.setRdr_extncost(rdr_extncost);

    	
    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.uploadExtn(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.uploadExtn(dm);
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
     * /확장현황-단체확장-확장자 조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void getUserInfo(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_L_EXTN_PATYDataSet ds = null;
    	
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);   //입력자 아이디
    	String srch_word = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_word")));
    	
        // DM Setting
    	SS_L_EXTN_PATYDM dm = new SS_L_EXTN_PATYDM();
    	dm.setCmpycd(cmpycd);
    	dm.setSrch_word(srch_word);

    	SSExtn2100DAO dao = new SSExtn2100DAO();
        // DAO 객체의 initApt 호출
        ds = dao.getUserInfo(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.getUserInfo(dm);
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
}
