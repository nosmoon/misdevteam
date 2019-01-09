/***************************************************************************************************
* 파일명 : SSReader1100WB.java
* 기능 : 독자현황-독자불편 처리를 위한 Worker Bean
* 작성일자 : 2004-01-12
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.move.dao.SSMove1000DAO;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDRDM;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDR_INITDM;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDRDataSet;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDR_INITDataSet;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dao.SSCommon1100DAO;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-독자불편 위한 WB
 */

public class SSReader1100WB{

    /**
     * 독자현황-독자불편-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_DSCT_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_RDR_DSCT_INITDM dm = new SS_L_RDR_DSCT_INITDM();

        SSReader1100DAO dao = new SSReader1100DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1100EJBHome home = (SSReader1100EJBHome)JNDIManager.getInstance().getHome("SSReader1100EJB");
        try{
            SSReader1100EJB ejb = home.create();
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
     * 독자현황-독자불편 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectRdrDsctList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_RDR_DSCTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String partcd = Util.checkString(req.getParameter("partcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));  //경로코드
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));  //기간선택종류
        String frdt = Util.checkString(req.getParameter("frdt")); //시작일
        String todt = Util.checkString(req.getParameter("todt")); //종료일
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm"))); //독자명
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no"))); //독자번호
        String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl"))); //제목
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont"))); //내용
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));  //지국지사확인상태
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));  //지국지사처리여부 (Y:처리, N:미처리)
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));  //구독불만유형 코드

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
        String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));     
        
        String expt_cic = Util.Uni2Ksc(Util.checkString(req.getParameter("expt_cic")));
        
        System.out.println("expt_cic : "+expt_cic);
        // DM Setting

        SS_L_RDR_DSCTDM dm = new SS_L_RDR_DSCTDM();
        dm.setDeptcd(deptcd);  //부서코드
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setFromtogb(fromtogb);  //기간종류
        dm.setFrdt(frdt);   //시작일
        dm.setTodt(todt);   //종료일
        dm.setRdrnm(rdrnm); //독자명
        dm.setRdr_no(rdr_no); //독자번호
        dm.setTitl(titl); //제목
        dm.setCont(cont); //내용
        dm.setBocnfmyn(bocnfmyn);  //지국지사확인상태
        dm.setBoprocyn(boprocyn);  //지국지사처리여부 (Y:처리, N:미처리)
        dm.setAcpnpathcd(acpnpathcd);  //경로코드
        dm.setDscttypecd(dscttypecd);  //구독불만유형 코드
        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
        dm.setCns_empnm(cns_empnm);
        dm.setProcpers(procpers);
        dm.setExpt_cic(expt_cic);
        
        SSReader1100DAO dao = new SSReader1100DAO();
		// DAO 객체의 selectRdrDsctList 호출
		ds = dao.selectRdrDsctList(dm);
		req.setAttribute("ds", ds);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
		
        /*
        SSReader1100EJBHome home = (SSReader1100EJBHome)JNDIManager.getInstance().getHome("SSReader1100EJB");
        try{
            SSReader1100EJB ejb = home.create();
            ds = ejb.selectRdrDsctList(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * 독자현황-독자불편-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectRdrDsctDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_DSCTDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_RDR_DSCTDM dm = new SS_S_RDR_DSCTDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSReader1100DAO dao = new SSReader1100DAO();
		// DAO 객체의 selectRdrDsctDetail 호출
		ds = dao.selectRdrDsctDetail(dm);
		req.setAttribute("ds", ds);
		
		/*
		SSReader1100EJBHome home = (SSReader1100EJBHome)JNDIManager.getInstance().getHome("SSReader1100EJB");
        try{
            SSReader1100EJB ejb = home.create();
            ds = ejb.selectRdrDsctDetail(dm);
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
    
    public void initCampTm(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_CAMP_TM_EXTN_INITDataSet ds = null;
        
    	SS_L_CAMP_TM_EXTN_INITDM dm = new SS_L_CAMP_TM_EXTN_INITDM();

    	SSReader1100DAO dao = new SSReader1100DAO();
        // DAO 객체의 init 호출
        ds = dao.initCampTm(dm);
        req.setAttribute("ds", ds);
    }

    public void selectCampTmList(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_CAMP_TM_EXTNDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String date_flag = Util.checkString(req.getParameter("date_flag"));
        String search_frdt = Util.checkString(req.getParameter("search_frdt"));
        String search_todt = Util.checkString(req.getParameter("search_todt"));
        String db_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("db_gubun")));
        String agentid = Util.checkString(req.getParameter("agentid"));
        String rdrnm = Util.checkString(req.getParameter("rdrnm"));
        String conn_gubun = Util.checkString(req.getParameter("conn_gubun"));
        String bocnfm = Util.checkString(req.getParameter("bocnfm"));
        String subscnfmstat = Util.checkString(req.getParameter("subscnfmstat"));
        String campid = Util.checkString(req.getParameter("campid"));

        // DM Setting
        SS_L_CAMP_TM_EXTNDM dm = new SS_L_CAMP_TM_EXTNDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setDate_flag(date_flag);
        dm.setSearch_frdt(search_frdt);
        dm.setSearch_todt(search_todt);
        dm.setDb_gubun(db_gubun);
        dm.setAgentnm(agentid);
        dm.setRdrnm(rdrnm);
        dm.setConn_gubun(conn_gubun);
        dm.setBocnfm(bocnfm);
        dm.setSubscnfmstat(subscnfmstat);
        dm.setCampid(campid);
        
        dm.print();
       
        SSReader1100DAO dao = new SSReader1100DAO();
        // DAO 객체의 selectMoveList 호출
        ds = dao.selectCampTmList(dm);
        req.setAttribute("ds", ds);
        
    }
    
    public void selectTmAgentList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SS_L_TM_AGENTLISTDataSet ds = null;
        // Request Parameter Processing
        String search_frdt = Util.checkString(req.getParameter("search_frdt"));
        String search_todt = Util.checkString(req.getParameter("search_todt"));

        // DM Setting
        SS_L_TM_AGENTLISTDM dm = new SS_L_TM_AGENTLISTDM();
        dm.setSearch_frdt(search_frdt);
        dm.setSearch_todt(search_todt);
        
        dm.print();

        SSReader1100DAO dao = new SSReader1100DAO();
        // DAO 객체의 selectBOList 호출
        ds = dao.selectTmAgentList(dm);
        req.setAttribute("ds", ds);
       
    }
    
    public void selectTmCampList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SS_L_TM_CAMPLISTDataSet ds = null;
        // Request Parameter Processing
        String search_frdt = Util.checkString(req.getParameter("search_frdt"));
        String search_todt = Util.checkString(req.getParameter("search_todt"));

        // DM Setting
        SS_L_TM_CAMPLISTDM dm = new SS_L_TM_CAMPLISTDM();
        dm.setSearch_frdt(search_frdt);
        dm.setSearch_todt(search_todt);
        
        dm.print();

        SSReader1100DAO dao = new SSReader1100DAO();
        // DAO 객체의 selectBOList 호출
        ds = dao.selectTmCampList(dm);
        req.setAttribute("ds", ds);
       
    }
}
