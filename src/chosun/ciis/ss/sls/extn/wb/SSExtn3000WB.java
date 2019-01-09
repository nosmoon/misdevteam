/***************************************************************************************************
* 파일명 : SSExtn3000WB.java
* 기능 : 중지방어관리
* 작성일자 : 2015-02-27
* 작성자 : 심정보
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
 * 중지방어관리 WB
 */

public class SSExtn3000WB{

    /**
     * 중지방어관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectSuspDefInit(HttpServletRequest req, HttpServletResponse res) throws AppException {

         SS_L_SUSP_DEF_INITDataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));

         SS_L_SUSP_DEF_INITDM dm = new SS_L_SUSP_DEF_INITDM();
         dm.setBocd(bocd);

         SSExtn3000DAO dao = new SSExtn3000DAO();
         // DAO 객체의 initApt 호출
         ds = dao.selectSuspDefInit(dm);
         req.setAttribute("ds", ds);

    }


    /**
     * 중지방어관리-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
   public void selectSuspDefList(HttpServletRequest req, HttpServletResponse res) throws AppException {

        SS_L_SUSP_DEFDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("corrbocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String def_type = Util.checkString(req.getParameter("def_type"));
        String rdrnm = Util.checkString(req.getParameter("rdrnm"));
        String agentnm = Util.checkString(req.getParameter("agentnm"));
        String cns_stat = Util.checkString(req.getParameter("cns_stat"));


        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));

        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SS_L_SUSP_DEFDM dm = new SS_L_SUSP_DEFDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setDef_type(def_type);
        dm.setRdrnm(rdrnm);
        dm.setAgentnm(agentnm);
        dm.setCns_stat(cns_stat);
        
        dm.print();
       
        SSExtn3000DAO dao = new SSExtn3000DAO();
		// DAO 객체의 initApt 호출
		ds = dao.selectSuspDefList(dm);
		req.setAttribute("ds", ds);

    }


    /**
     * 중지방어관리-상세화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
   public void selectSuspDefDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {

        SS_S_SUSP_DEFDataSet ds = null;

        //request process
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplcno = Util.checkString(req.getParameter("aplcno"));

        SS_S_SUSP_DEFDM dm = new SS_S_SUSP_DEFDM();
        dm.setAplcdt(aplcdt);
        dm.setAplcno(aplcno);

        SSExtn3000DAO dao = new SSExtn3000DAO();
        // DAO 객체의 initApt 호출
        ds = dao.selectSuspDefDetail(dm);
        req.setAttribute("ds", ds);

    }
   
   public void selectSuspDefPrint(HttpServletRequest req, HttpServletResponse res) throws AppException {

       SS_P_SUSP_DEFDataSet ds = null;

       //request process
       String deptcd = Util.checkString(req.getParameter("deptcd"));
       String partcd = Util.checkString(req.getParameter("partcd"));
       String areacd = Util.checkString(req.getParameter("areacd"));
       String bocd = Util.checkString(req.getParameter("corrbocd"));
       String frdt = Util.checkString(req.getParameter("frdt"));
       String todt = Util.checkString(req.getParameter("todt"));
       String def_type = Util.checkString(req.getParameter("def_type"));
       String rdrnm = Util.checkString(req.getParameter("rdrnm"));
       String agentnm = Util.checkString(req.getParameter("agentnm"));
       String cns_stat = Util.checkString(req.getParameter("cns_stat"));


       String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
       String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));

       pageno = ("".equals(pageno))? "1" : pageno;
       pagesize = ("".equals(pagesize))? "10" : pagesize;

       SS_P_SUSP_DEFDM dm = new SS_P_SUSP_DEFDM();
       dm.setDeptcd(deptcd);
       dm.setPartcd(partcd);
       dm.setAreacd(areacd);
       dm.setBocd(bocd);
       dm.setFrdt(frdt);
       dm.setTodt(todt);
       dm.setDef_type(def_type);
       dm.setRdrnm(rdrnm);
       dm.setAgentnm(agentnm);
       dm.setCns_stat(cns_stat);
      
       SSExtn3000DAO dao = new SSExtn3000DAO();
		// DAO 객체의 initApt 호출
		ds = dao.selectSuspDefPrint(dm);
		req.setAttribute("ds", ds);

   }
}
