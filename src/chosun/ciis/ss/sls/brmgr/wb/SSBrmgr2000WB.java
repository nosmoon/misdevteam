/***************************************************************************************************
* 파일명 : SSBrmgr2000WB.java
* 기능 : 지국경영-아파트투입률을 위한 Worker Bean
* 작성일자 : 2004-11-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.util.*;				//추가
import java.lang.*;				//추가
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국경영-아파트투입률을 위한 WB
 */

public class SSBrmgr2000WB{

   /**
    * 일괄발송 발송처리 지사별확인내역을 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectlist(HttpServletRequest req, HttpServletResponse res) throws AppException{
	   SS_L_CAMPSTATDataSet ds = null;

	   String pageno = Util.checkString(req.getParameter("pageno"));
	   String pagesize = Util.checkString(req.getParameter("pagesize"));
	   String deptcd = Util.checkString(req.getParameter("deptcd"));
	   String partcd = Util.checkString(req.getParameter("partcd"));
	   String areacd = Util.checkString(req.getParameter("areacd"));
	   String bocd = Util.checkString(req.getParameter("bocd"));
	   String chregcd = Util.checkString(req.getParameter("chregcd"));
	   String campid = Util.checkString(req.getParameter("campid"));
	   
	   
      SS_L_CAMPSTATDM dm = new SS_L_CAMPSTATDM();
      //dm에 값을 Setting한다.

      dm.setPageno(Long.parseLong(pageno));  //페이지번호
      dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
      
      dm.setDeptcd(deptcd);
      dm.setPartcd(partcd);
      dm.setAreacd(areacd);
      dm.setBocd(bocd);
      dm.setChregcd(chregcd);
      dm.setCampid(campid);

      SSBrmgr2000DAO dao = new SSBrmgr2000DAO();
      ds = dao.selectlist(dm);
      req.setAttribute("ds", ds); // request에 결과값을 담는다.
      
      /*
      SSBrmgr2000EJBHome home = (SSBrmgr2000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr2000EJB");
      try{
         SSBrmgr2000EJB ejb = home.create();
         ds = ejb.selectlist(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }*/
   }

   /**
    * 일괄발송 발송처리 지사별확인내역을 조회한다.
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void campinfolist(HttpServletRequest req, HttpServletResponse res) throws AppException{
	  CO_L_CAMPINFODataSet ds = null;
      //사용자 세션정보
	  String camptypecd = Util.checkString(req.getParameter("sech_camptypecd"));
	  String campdate_s = Util.checkString(req.getParameter("sech_campdate_s"));
	  String campdate_e = Util.checkString(req.getParameter("sech_campdate_e"));
	  String campnm = Util.checkString(req.getParameter("campnm"));
	  String campplanpersid = Util.checkString(req.getParameter("campplanpersid"));
	  String campmclscd = Util.checkString(req.getParameter("sech_campmclscd"));
      
	  CO_L_CAMPINFODM dm = new CO_L_CAMPINFODM();
      //dm에 값을 Setting한다.

	  dm.setCamptypecd(camptypecd);
	  dm.setCampdate_s(campdate_s);
	  dm.setCampdate_e(campdate_e);
	  dm.setCampnm(campnm);
	  dm.setCampplanpersid(campplanpersid);
	  dm.setCampmclscd(campmclscd);
	  
	  SSBrmgr2000DAO dao = new SSBrmgr2000DAO();
      ds = dao.campinfolist(dm);
      req.setAttribute("ds", ds); // request에 결과값을 담는다.
      
      /*
      SSBrmgr2000EJBHome home = (SSBrmgr2000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr2000EJB");
      try{
         SSBrmgr2000EJB ejb = home.create();
         ds = ejb.campinfolist(dm);
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }*/
   }

   /**
    * 아파트 투입률 리스트
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void selectaptlist(HttpServletRequest req, HttpServletResponse res) throws AppException{
	   SS_L_APTDONGUNITTHRWDataSet ds = null;
	   
	   String uid = Util.getSessionParameterValue(req, "uid", true);
	   String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aptlist")));
	   String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
	   String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
	   String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
	   String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
	   String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bolist")));
	   String invsgdt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt1")));
	   String invsgdt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt2")));
	   
	   SS_L_APTDONGUNITTHRWDM dm = new SS_L_APTDONGUNITTHRWDM();
       //dm에 값을 Setting한다.
	   dm.setUid(uid);
	   dm.setAddrcd(addrcd);
	   dm.setFlag(flag);
	   dm.setDeptcd(deptcd);
	   dm.setPartcd(partcd);
	   dm.setAreacd(areacd);
	   dm.setBocd(bocd);
	   dm.setInvsgdt1(invsgdt1);
	   dm.setInvsgdt2(invsgdt2);

	   SSBrmgr2000DAO dao = new SSBrmgr2000DAO();
       ds = dao.selectaptlist(dm);
       req.setAttribute("ds", ds); // request에 결과값을 담는다.
       
       /*
      SSBrmgr2000EJBHome home = (SSBrmgr2000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr2000EJB");
      try{
         SSBrmgr2000EJB ejb = home.create();
         ds = ejb.selectaptlist(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }*/
   }
   
   /**
    * 아파트 투입률 등록
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void updateaptlist(HttpServletRequest req, HttpServletResponse res) throws AppException{
	   SS_U_APTDONGUNITTHRWDataSet ds = null;
	   
	   String uid = Util.getSessionParameterValue(req, "uid", true);
	   String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
	   String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
	   String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
	   String invsgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt")));
	   String chothrwqty = Util.Uni2Ksc(Util.checkString(req.getParameter("chothrwqty")));
	   String jungthrwqty = Util.Uni2Ksc(Util.checkString(req.getParameter("jungthrwqty")));
	   String dongthrwqty = Util.Uni2Ksc(Util.checkString(req.getParameter("dongthrwqty")));
	   String etcthrwqty = Util.Uni2Ksc(Util.checkString(req.getParameter("etcthrwqty")));
	   
	   SS_U_APTDONGUNITTHRWDM dm = new SS_U_APTDONGUNITTHRWDM();
       //dm에 값을 Setting한다.
	   dm.setUid(uid);
	   dm.setAddrcd(addrcd);
	   dm.setDongno(dongno);
	   dm.setBocd(bocd);
	   dm.setInvsgdt(invsgdt);
	   dm.setChothrwqty(chothrwqty);
	   dm.setJungthrwqty(jungthrwqty);
	   dm.setDongthrwqty(dongthrwqty);
	   dm.setEtcthrwqty(etcthrwqty);

	   SSBrmgr2000DAO dao = new SSBrmgr2000DAO();
       ds = dao.updateaptlist(dm);
       req.setAttribute("ds", ds); // request에 결과값을 담는다.
       
       /*
      SSBrmgr2000EJBHome home = (SSBrmgr2000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr2000EJB");
      try{
         SSBrmgr2000EJB ejb = home.create();
         ds = ejb.updateaptlist(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }*/
   }
   
   /**
    * 아파트 투입률 초기조회
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */

   public void aptlistinit1(HttpServletRequest req, HttpServletResponse res) throws AppException{
	   SS_L_APTDONGUNITTHRW_INIT1DataSet ds = null;
	   
	   //String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
	   
	   SS_L_APTDONGUNITTHRW_INIT1DM dm = new SS_L_APTDONGUNITTHRW_INIT1DM();
       //dm에 값을 Setting한다.
	   //dm.setBocd(bocd);
	   
	   SSBrmgr2000DAO dao = new SSBrmgr2000DAO();
       ds = dao.aptlistinit1(dm);
       req.setAttribute("ds", ds); // request에 결과값을 담는다.
       
       /*
      SSBrmgr2000EJBHome home = (SSBrmgr2000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr2000EJB");
      try{
         SSBrmgr2000EJB ejb = home.create();
         ds = ejb.aptlistinit1(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }*/
   }
   
   /**
    * 아파트 투입률 초기조회
    * 조회된 request값을 set한다.
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    */ 

   public void aptlistinit(HttpServletRequest req, HttpServletResponse res) throws AppException{
	   SS_L_APTDONGUNITTHRW_INITDataSet ds = null;
	   
	   String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
	   
	   SS_L_APTDONGUNITTHRW_INITDM dm = new SS_L_APTDONGUNITTHRW_INITDM();
       //dm에 값을 Setting한다.
	   dm.setBocd(bocd);
	   
	   SSBrmgr2000DAO dao = new SSBrmgr2000DAO();
       ds = dao.aptlistinit(dm);
       req.setAttribute("ds", ds); // request에 결과값을 담는다.
       
       /*
      SSBrmgr2000EJBHome home = (SSBrmgr2000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr2000EJB");
      try{
         SSBrmgr2000EJB ejb = home.create();
         ds = ejb.aptlistinit(dm); // 설정된 dm값으로 EJB를 호출한다.
         req.setAttribute("ds", ds); // request에 결과값을 담는다.
      } catch(CreateException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      } catch(RemoteException e){
         SysException se = new SysException(e);
         LogManager.getInstance().log(se);
      }*/
   }
   /**
    * 지국경영-지국부수현황 초기화면
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    **/
   public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
       SS_L_ABC_INITDataSet ds = null;
       // Request Parameter Processing
       // String XXX = req.getParameter("XXX");
       // DM Setting
       String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
       String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

       
       SS_L_ABC_INITDM dm = new SS_L_ABC_INITDM();
       
       dm.setIncmg_pers(emp_no);
       dm.setCmpy_cd(cmpycd);
       SSBrmgr2000DAO dao = new SSBrmgr2000DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
       SSBrmgr1000EJBHome home = (SSBrmgr1000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1000EJB");
       try{
           SSBrmgr1000EJB ejb = home.create();
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
    * 지국경영-지국부수현황 조회(리스트)
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    **/

   public void selectBoqtypcondList(HttpServletRequest req, HttpServletResponse res) throws AppException{

	   SS_L_ABCDataSet ds = null;
       // Request Parameter Processing
       String deptcd = Util.checkString(req.getParameter("deptcd"));
       String partcd = Util.checkString(req.getParameter("partcd"));
       String areacd = Util.checkString(req.getParameter("areacd"));
       String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드

       String medicd = Util.checkString(req.getParameter("medicd"));
       String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
       String to_yymm = Util.checkString(req.getParameter("fr_yymm"));

       String pageno = Util.checkString(req.getParameter("pageno"));
       String pagesize = Util.checkString(req.getParameter("pagesize"));

       // DM Setting
       SS_L_ABCDM dm = new SS_L_ABCDM();
       dm.setDeptcd(deptcd);  //부서코드
       dm.setPartcd(partcd);
       dm.setAreacd(areacd);  //지역코드
       dm.setBocd(bocd);      //지국코드
       dm.setMedicd(medicd);  //매체코드
       dm.setFr_yymm(fr_yymm);
       dm.setTo_yymm(to_yymm);

       dm.setPageno(Long.parseLong(pageno));  //페이지번호
       dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
       
       SSBrmgr2000DAO dao = new SSBrmgr2000DAO();
		// DAO 객체의 selectBoqtypcondList 호출
		ds = dao.selectBoqtypcondList(dm);
		req.setAttribute("ds", ds);


		/*
       SSBrmgr1000EJBHome home = (SSBrmgr1000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1000EJB");
       try{
           SSBrmgr1000EJB ejb = home.create();
           ds = ejb.selectBoqtypcondList(dm);
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
   
   public void selectAuthratio(HttpServletRequest req, HttpServletResponse res)
   throws AppException
 {
   ABC_L_AUTHRATIODataSet ds = null;

   String basi_yy = Util.checkString(req.getParameter("basi_yy"));
   String basi_dt = Util.checkString(req.getParameter("basi_dt"));
   String bocd = Util.checkString(req.getParameter("bocd"));

   ABC_L_AUTHRATIODM dm = new ABC_L_AUTHRATIODM();
   dm.setBasi_yy(basi_yy);
   dm.setBasi_dt(basi_dt);
   dm.setBocd(bocd);

   SSBrmgr2000DAO dao = new SSBrmgr2000DAO();

   ds = dao.selectAuthratio(dm);
   req.setAttribute("ds", ds);
 }

 public void selectAbcworkchg(HttpServletRequest req, HttpServletResponse res) throws AppException
 {
   ABC_L_ABCWORKCHGDataSet ds = null;

   String bocd = Util.checkString(req.getParameter("bocd"));
   String wrkcode = Util.checkString(req.getParameter("wrkcode"));

   ABC_L_ABCWORKCHGDM dm = new ABC_L_ABCWORKCHGDM();
   dm.setBocd(bocd);
   dm.setWrkcode(wrkcode);

   SSBrmgr2000DAO dao = new SSBrmgr2000DAO();

   ds = dao.selectAbcworkchg(dm);
   req.setAttribute("ds", ds);
 }

 public void selectAuthratiodtl(HttpServletRequest req, HttpServletResponse res) throws AppException
 {
   ABC_L_AUTHRATIODTLDataSet ds = null;

   String basi_dt = Util.checkString(req.getParameter("basi_dt"));
   String bocd = Util.checkString(req.getParameter("bocd"));
   String abcclsf = Util.checkString(req.getParameter("abcclsf"));

   ABC_L_AUTHRATIODTLDM dm = new ABC_L_AUTHRATIODTLDM();
   dm.setBasi_dt(basi_dt);
   dm.setBocd(bocd);
   dm.setAbcclsf(abcclsf);

   SSBrmgr2000DAO dao = new SSBrmgr2000DAO();

   ds = dao.selectAuthratiodtl(dm);
   req.setAttribute("ds", ds);
 }
}
