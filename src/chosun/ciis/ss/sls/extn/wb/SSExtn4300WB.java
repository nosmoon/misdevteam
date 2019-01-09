/***************************************************************************************************
 * 파일명 : SSExtn4300WB.java
 * 기능 : 문자점검독자관리를 위한 Worker Bean
 * 작성일자 : 2015-12-03
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
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
import utils.system;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * 문자점검독자관리-설문응답을 위한 WB
 */

public class SSExtn4300WB {

    /**
     * 문자점검독자관리-설문응답-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void svyRdrInit(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_MO_SVY_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

        SS_L_MO_SVY_INITDM dm = new SS_L_MO_SVY_INITDM();

        dm.setIncmg_pers(emp_no);
        dm.setCmpy_cd(cmpycd);

        SSExtn4300DAO dao = new SSExtn4300DAO();
        // DAO 객체의 init 호출
        ds = dao.svyRdrInit(dm);
        req.setAttribute("ds", ds);
    }



    /**
     * 문자점검독자관리-설문응답-해당독자목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void svyRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_MO_SVY_RDRDataSet ds = null;
        // Request Parameter Processing
    	String deptcd = Util.checkString(req.getParameter("deptcd"));
    	String partcd = Util.checkString(req.getParameter("partcd"));
    	String areacd = Util.checkString(req.getParameter("areacd"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String basicdt = Util.checkString(req.getParameter("basicdt"));
    	String extntype1 = Util.checkString(req.getParameter("extntype1"));
    	String bocfmyn = Util.checkString(req.getParameter("bocfmyn"));
    	String svy_stddt = Util.checkString(req.getParameter("svy_stddt"));
    	String svy_enddt = Util.checkString(req.getParameter("svy_enddt"));
    	String svynm = Util.checkString(req.getParameter("svynm"));
    	String svyid = Util.checkString(req.getParameter("svyid"));
    	String respyn = Util.checkString(req.getParameter("respyn"));
    	String campnm = Util.checkString(req.getParameter("campnm"));
    	String camptype = Util.checkString(req.getParameter("camptype"));
    	String rdr_no = Util.checkString(req.getParameter("rdr_no"));
    	String rdrnm = Util.checkString(req.getParameter("rdrnm"));
    	String bschk = Util.checkString(req.getParameter("bschk"));
    	String bosend = Util.checkString(req.getParameter("bosend"));
    	String pageno = Util.checkString(req.getParameter("pageno"));
    	String pagesize = Util.checkString(req.getParameter("pagesize"));

        //System.out.println("pageno=="+pageno);
        //System.out.println("pagesize=="+pagesize);

        // DM Setting
        SS_L_MO_SVY_RDRDM dm = new SS_L_MO_SVY_RDRDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setBasicdt(basicdt);
        dm.setExtntype1(extntype1);
        dm.setBocfmyn(bocfmyn);
        dm.setSvy_stddt(svy_stddt);
        dm.setSvy_enddt(svy_enddt);
        dm.setSvynm(svynm);
        dm.setSvyid(svyid);
        dm.setRespyn(respyn);
        dm.setCampnm(campnm);
        dm.setCamptype(camptype);
        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setBschk(bschk);
        dm.setBosend(bosend);
		dm.pageno   = ("".equals(pageno)) ? 1 : Long.parseLong(pageno); 		// 'pageno'가 Null일경우 1을반환
		dm.pagesize = ("".equals(pagesize)) ? 10 : Long.parseLong(pagesize);

		 dm.print();

        SSExtn4300DAO dao = new SSExtn4300DAO();
        // DAO 객체의 init 호출
        ds = dao.svyRdrList(dm);
        req.setAttribute("ds", ds);
    }


    /**
     * 문자점검독자관리-설문응답-해당독자상세 및 응답리스트
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void svyRdrDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_S_MO_SVY_RDRDataSet ds = null;
        // Request Parameter Processing
    	String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
    	String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
    	String camptype = Util.Uni2Ksc(Util.checkString(req.getParameter("camptype")));
    	String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
    	String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));

        //System.out.println("pageno=="+pageno);
        //System.out.println("pagesize=="+pagesize);

        // DM Setting
    	SS_S_MO_SVY_RDRDM dm = new SS_S_MO_SVY_RDRDM();

    	dm.setExtndt(extndt);
    	dm.setRdr_no(rdr_no);
    	dm.setBocd(bocd);
    	dm.setSeq(seq);
    	dm.setClosmm(closmm);
    	dm.setCamptype(camptype);
    	dm.setSvyid(svyid);
    	dm.setCampid(campid);
		 dm.print();

        SSExtn4300DAO dao = new SSExtn4300DAO();
        // DAO 객체의 init 호출
        ds = dao.svyRdrDetail(dm);
        req.setAttribute("ds", ds);
    }



    /**
     * 	문자점검독자관리-설문응답-센터전달, 부실확정, 전체마감
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void svyBsComp(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_A_MO_SVY_BSCOMPDataSet ds = null;
        // Request Parameter Processing
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
    	String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
    	String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
    	String workflag = Util.Uni2Ksc(Util.checkString(req.getParameter("workflag")));
    	String camptype = Util.Uni2Ksc(Util.checkString(req.getParameter("camptype")));
    	String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
    	String chgid = Util.getSessionParameterValue(req, "uid", true);


        // DM Setting
    	SS_A_MO_SVY_BSCOMPDM dm = new SS_A_MO_SVY_BSCOMPDM();

		 dm.setBocd(bocd);
		 dm.setExtndt(extndt);
		 dm.setRdr_no(rdr_no);
		 dm.setClosmm(closmm);
		 dm.setWorkflag(workflag);
		 dm.setCamptype(camptype);
		 dm.setSeq(seq);
		 dm.setChgid(chgid);
		 dm.print();

        SSExtn4300DAO dao = new SSExtn4300DAO();
        // DAO 객체의 init 호출
        ds = dao.svyBsComp(dm);
        req.setAttribute("ds", ds);
    }




    /**
     * 	문자점검독자관리-설문응답-마감년월,캠페인유형으로 설문명리스트
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void svyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_MO_SVYLISTDataSet ds = null;
    	// Request Parameter Processing
    	String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
    	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
    	String basicdt = Util.Uni2Ksc(Util.checkString(req.getParameter("basicdt")));
    	String camptype = Util.Uni2Ksc(Util.checkString(req.getParameter("camptype")));

    	// DM Setting
    	SS_L_MO_SVYLISTDM dm = new SS_L_MO_SVYLISTDM();

    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBasicdt(basicdt);
    	dm.setCamptype(camptype);
    	dm.print();

    	SSExtn4300DAO dao = new SSExtn4300DAO();
    	// DAO 객체의 init 호출
    	ds = dao.svyList(dm);
    	req.setAttribute("ds", ds);
    }






}
