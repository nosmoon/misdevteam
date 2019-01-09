/***************************************************************************************************
* 파일명 : SSExtn1900WB.java
* 기능 : 지국경영-입주아파트현황을 위한 Worker Bean
* 작성일자 : 2006-06-01
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

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
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국경영-입주아파트현황을 위한 WB
 */

public class SSExtn1900WB{

    /**
     * 확장현황-확장제한-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExtnResInit(HttpServletRequest req, HttpServletResponse res) throws AppException {

         SS_L_EXTN_RES_INITDataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));

         SS_L_EXTN_RES_INITDM dm = new SS_L_EXTN_RES_INITDM();
         dm.setBocd(bocd);

         SSExtn1900DAO dao = new SSExtn1900DAO();
         // DAO 객체의 initApt 호출
         ds = dao.selectExtnResInit(dm);
         req.setAttribute("ds", ds);
         
         /*
         SSExtn1900EJBHome home = (SSExtn1900EJBHome)JNDIManager.getInstance().getHome("SSExtn1900EJB");

         try{
             SSExtn1900EJB ejb = home.create();
             ds = ejb.selectExtnResInit(dm);
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
     * 확장현황-확장제한-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
   public void selectExtnResList(HttpServletRequest req, HttpServletResponse res) throws AppException {

        SS_L_EXTN_RESDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("corrbocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String cns_empcnfmstatcd = Util.checkString(req.getParameter("cns_empcnfmstatcd"));
        String cns_empcnfmocomcd = Util.checkString(req.getParameter("cns_empcnfmocomcd"));
        String chrg_cnfmstatcd = Util.checkString(req.getParameter("chrg_cnfmstatcd"));
        String chrg_cnfmocomcd = Util.checkString(req.getParameter("chrg_cnfmocomcd"));


        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));

        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SS_L_EXTN_RESDM dm = new SS_L_EXTN_RESDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setCns_empcnfmstatcd(cns_empcnfmstatcd);
        dm.setCns_empcnfmocomcd(cns_empcnfmocomcd);
        dm.setChrg_cnfmstatcd(chrg_cnfmstatcd);
        dm.setChrg_cnfmocomcd(chrg_cnfmocomcd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSExtn1900DAO dao = new SSExtn1900DAO();
		// DAO 객체의 initApt 호출
		ds = dao.selectExtnResList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1900EJBHome home = (SSExtn1900EJBHome)JNDIManager.getInstance().getHome("SSExtn1900EJB");

        try{
            SSExtn1900EJB ejb = home.create();
            ds = ejb.selectExtnResList(dm);
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
     * 확장현황-확장제한-상세화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
   public void selectExtnResDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {

        CO_S_EXTN_RESDataSet ds = null;

        //request process
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        CO_S_EXTN_RESDM dm = new CO_S_EXTN_RESDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSExtn1900DAO dao = new SSExtn1900DAO();
        // DAO 객체의 initApt 호출
        ds = dao.selectExtnResDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1900EJBHome home = (SSExtn1900EJBHome)JNDIManager.getInstance().getHome("SSExtn1900EJB");

        try{
            SSExtn1900EJB ejb = home.create();
            ds = ejb.selectExtnResDetail(dm);
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
        * 확장현황-확장제한-담당확인
        * @param req HttpServletRequest
        * @param res HttpServletResponse
        * @throws AppException
        **/
      public void selectExtnResUpdate(HttpServletRequest req, HttpServletResponse res) throws AppException {

           CO_U_EXTN_RESDataSet ds = null;

           //request process
           String slssclsf = Util.checkString(req.getParameter("slssclsf"));
           String regdt = Util.checkString(req.getParameter("regdt"));
           String regno = Util.checkString(req.getParameter("regno"));
           String chrg_cnfmstatcd = Util.checkString(req.getParameter("chrg_cnfmstatcd"));
           String chrg_cnfmocomcd = Util.checkString(req.getParameter("chrg_cnfmocomcd"));
           String chrg_id = Util.getSessionParameterValue(req, "uid", true);
           String chrg_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_remk")));
           String chgpers = Util.getSessionParameterValue(req, "uid", true);

           CO_U_EXTN_RESDM dm = new CO_U_EXTN_RESDM();
           dm.setSlssclsf(slssclsf);
           dm.setRegdt(regdt);
           dm.setRegno(regno);
           dm.setChrg_cnfmstatcd(chrg_cnfmstatcd);
           dm.setChrg_cnfmocomcd(chrg_cnfmocomcd);
           dm.setChrg_id(chrg_id);
           dm.setChrg_remk(chrg_remk);
           dm.setChgpers(chgpers);

           SSExtn1900DAO dao = new SSExtn1900DAO();
           // DAO 객체의 initApt 호출
           ds = dao.selectExtnResUpdate(dm);
           req.setAttribute("ds", ds);
           
           /*
           SSExtn1900EJBHome home = (SSExtn1900EJBHome)JNDIManager.getInstance().getHome("SSExtn1900EJB");

           try{
               SSExtn1900EJB ejb = home.create();
               ds = ejb.selectExtnResUpdate(dm);
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
