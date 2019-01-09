/***************************************************************************************************
 * 파일명 : SSBrsup2000WB.java
 * 기능 : 지국지원-판촉현황을 위한 Worker Bean
 * 작성일자 : 2004-03-05
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국지원-판촉현황을 위한 Worker Bean
 */

public class SSBrsup2000WB {
    /**
     * 지국지원-판촉현황-IS요원-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initPromStafIS(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_INIT_ISDataSet ds = null;

        // DM Setting
        SS_L_PROMSTAF_INIT_ISDM dm = new SS_L_PROMSTAF_INIT_ISDM();

        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 initPromStafIS 호출
        ds = dao.initPromStafIS(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.initPromStafIS(dm);
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
     * 지국지원-판촉현황-IS요원-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafISList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_ISDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String prn = Util.checkString(req.getParameter("prn"));
        String ernno = Util.checkString(req.getParameter("ernno"));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_PROMSTAF_ISDM dm = new SS_L_PROMSTAF_ISDM();

        dm.setStafclsfcd(stafclsfcd);
        dm.setCntrstatcd(cntrstatcd);
        dm.setStafno(stafno);
        dm.setStafnm(stafnm);
        dm.setPrn(prn);
        dm.setErnno(ernno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.selectPromStafISList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.selectPromStafISList(dm);
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
     * 지국지원-판촉현황-IS요원-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafISPrint(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_IS_EXCELDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String prn = Util.checkString(req.getParameter("prn"));
        String ernno = Util.checkString(req.getParameter("ernno"));

        // DM Setting
        SS_L_PROMSTAF_IS_EXCELDM dm = new SS_L_PROMSTAF_IS_EXCELDM();

        dm.setStafclsfcd(stafclsfcd);
        dm.setCntrstatcd(cntrstatcd);
        dm.setStafno(stafno);
        dm.setStafnm(stafnm);
        dm.setPrn(prn);
        dm.setErnno(ernno);
 
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.selectPromStafISPrint(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.selectPromStafISList(dm);
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
     * 지국지원-판촉현황-IS요원-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafISDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_PROMSTAF_ISDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));

        // DM Setting
        SS_S_PROMSTAF_ISDM dm = new SS_S_PROMSTAF_ISDM();
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 selectPromStafISDetail 호출
        ds = dao.selectPromStafISDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.selectPromStafISDetail(dm);
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
     * 지국지원-판촉현황-IS요원-저장(등록)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertPromStafIS(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_PROMSTAF_ISDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));
        String prn = Util.checkString(req.getParameter("prn"));
        String ernno = Util.checkString(req.getParameter("ernno"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String zip = Util.checkString(req.getParameter("zip"));
        String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
        String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
        String tel_no1 = Util.checkString(req.getParameter("tel_no1"));
        String tel_no2 = Util.checkString(req.getParameter("tel_no2"));
        String tel_no3 = Util.checkString(req.getParameter("tel_no3"));
        String ptph_no1 = Util.checkString(req.getParameter("ptph_no1"));
        String ptph_no2 = Util.checkString(req.getParameter("ptph_no2"));
        String ptph_no3 = Util.checkString(req.getParameter("ptph_no3"));
        String email = Util.checkString(req.getParameter("email"));
        String carrmatt = Util.Uni2Ksc(Util.checkString(req.getParameter("carrmatt")));
        String leaderyn = Util.checkString(req.getParameter("leaderyn"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String acctbank = Util.checkString(req.getParameter("acctbank"));
        String acctdeps_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("acctdeps_pers")));
        String id_cardissudt = Util.checkString(req.getParameter("id_cardissudt"));
        String blngteamregmm = Util.checkString(req.getParameter("blngteamregmm"));
        String blngteamnm = Util.Uni2Ksc(Util.checkString(req.getParameter("blngteamnm")));
        String jursarearegmm = Util.checkString(req.getParameter("jursarearegmm"));
        String jursareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("jursareanm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String cntryn = Util.checkString(req.getParameter("cntryn"));
        String in_cmpydt = Util.checkString(req.getParameter("in_cmpydt"));
        String lvcmpydt = Util.checkString(req.getParameter("lvcmpydt"));
        String clsfdtls = Util.checkString(req.getParameter("clsfdtls"));
        String kdregdt = Util.checkString(req.getParameter("kdregdt"));
        String kdcntrdt = Util.checkString(req.getParameter("kdcntrdt"));
        String kdexpdt = Util.checkString(req.getParameter("kdexpdt"));


        // DM Setting
        SS_A_PROMSTAF_ISDM dm = new SS_A_PROMSTAF_ISDM();
        dm.setAccflag(accflag);
        dm.setClsf(clsf);
        dm.setIncmgpers(incmgpers);
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        dm.setPrn(prn);
        dm.setErnno(ernno);
        dm.setStafnm(stafnm);
        dm.setZip(zip);
        dm.setAddr(addr);
        dm.setDtlsaddr(dtlsaddr);
        dm.setTel_no1(tel_no1);
        dm.setTel_no2(tel_no2);
        dm.setTel_no3(tel_no3);
        dm.setPtph_no1(ptph_no1);
        dm.setPtph_no2(ptph_no2);
        dm.setPtph_no3(ptph_no3);
        dm.setEmail(email);
        dm.setCarrmatt(carrmatt);
        dm.setLeaderyn(leaderyn);
        dm.setAcctno(acctno);
        dm.setAcctbank(acctbank);
        dm.setAcctdeps_pers(acctdeps_pers);
        dm.setId_cardissudt(id_cardissudt);
        dm.setBlngteamregmm(blngteamregmm);
        dm.setBlngteamnm(blngteamnm);
        dm.setJursarearegmm(jursarearegmm);
        dm.setJursareanm(jursareanm);
        dm.setRemk(remk);
        dm.setCntrstatcd(cntryn);   //계약상태코드 : ('y' : 해지)
        dm.setIn_cmpydt(in_cmpydt);
        dm.setLvcmpydt(lvcmpydt);
        dm.setClsfdtls(clsfdtls);
        dm.setKdregdt(kdregdt);
        dm.setKdcntrdt(kdcntrdt);
        dm.setKdexpdt(kdexpdt);
        
        dm.print();
        
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 insertPromStafIS 호출
        ds = dao.insertPromStafIS(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.insertPromStafIS(dm);
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
     * 지국지원-판촉현황-IS요원-저장(수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updatePromStafIS(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_PROMSTAF_ISDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));
        String prn = Util.checkString(req.getParameter("prn"));
        String ernno = Util.checkString(req.getParameter("ernno"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String zip = Util.checkString(req.getParameter("zip"));
        String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
        String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
        String tel_no1 = Util.checkString(req.getParameter("tel_no1"));
        String tel_no2 = Util.checkString(req.getParameter("tel_no2"));
        String tel_no3 = Util.checkString(req.getParameter("tel_no3"));
        String ptph_no1 = Util.checkString(req.getParameter("ptph_no1"));
        String ptph_no2 = Util.checkString(req.getParameter("ptph_no2"));
        String ptph_no3 = Util.checkString(req.getParameter("ptph_no3"));
        String email = Util.checkString(req.getParameter("email"));
        String carrmatt = Util.Uni2Ksc(Util.checkString(req.getParameter("carrmatt")));
        String leaderyn = Util.checkString(req.getParameter("leaderyn"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String acctbank = Util.checkString(req.getParameter("acctbank"));
        String acctdeps_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("acctdeps_pers")));
        String id_cardissudt = Util.checkString(req.getParameter("id_cardissudt"));
        String blngteamregmm = Util.checkString(req.getParameter("blngteamregmm"));
        String blngteamnm = Util.Uni2Ksc(Util.checkString(req.getParameter("blngteamnm")));
        String jursarearegmm = Util.checkString(req.getParameter("jursarearegmm"));
        String jursareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("jursareanm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String cntryn = Util.checkString(req.getParameter("cntryn"));
        String in_cmpydt = Util.checkString(req.getParameter("in_cmpydt"));
        String lvcmpydt = Util.checkString(req.getParameter("lvcmpydt"));
        String clsfdtls = Util.checkString(req.getParameter("clsfdtls"));
        String kdregdt = Util.checkString(req.getParameter("kdregdt"));
        String kdcntrdt = Util.checkString(req.getParameter("kdcntrdt"));
        String kdexpdt = Util.checkString(req.getParameter("kdexpdt"));

        // DM Setting
        SS_A_PROMSTAF_ISDM dm = new SS_A_PROMSTAF_ISDM();
        dm.setAccflag(accflag);
        dm.setClsf(clsf);
        dm.setIncmgpers(incmgpers);
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        dm.setPrn(prn);
        dm.setErnno(ernno);
        dm.setStafnm(stafnm);
        dm.setZip(zip);
        dm.setAddr(addr);
        dm.setDtlsaddr(dtlsaddr);
        dm.setTel_no1(tel_no1);
        dm.setTel_no2(tel_no2);
        dm.setTel_no3(tel_no3);
        dm.setPtph_no1(ptph_no1);
        dm.setPtph_no2(ptph_no2);
        dm.setPtph_no3(ptph_no3);
        dm.setEmail(email);
        dm.setCarrmatt(carrmatt);
        dm.setLeaderyn(leaderyn);
        dm.setAcctno(acctno);
        dm.setAcctbank(acctbank);
        dm.setAcctdeps_pers(acctdeps_pers);
        dm.setId_cardissudt(id_cardissudt);
        dm.setBlngteamregmm(blngteamregmm);
        dm.setBlngteamnm(blngteamnm);
        dm.setJursarearegmm(jursarearegmm);
        dm.setJursareanm(jursareanm);
        dm.setRemk(remk);
        dm.setCntrstatcd(cntryn);   //계약상태코드 : ('y' : 해지)
        dm.setIn_cmpydt(in_cmpydt);
        dm.setLvcmpydt(lvcmpydt);
        dm.setClsfdtls(clsfdtls);
        dm.setKdregdt(kdregdt);
        dm.setKdcntrdt(kdcntrdt);
        dm.setKdexpdt(kdexpdt);
        
        dm.print();

        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 updatePromStafIS 호출
        ds = dao.updatePromStafIS(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.updatePromStafIS(dm);
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
     * 지국지원-판촉현황-IS요원-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deletePromStafIS(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_PROMSTAF_ISDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String clsf = Util.checkString(req.getParameter("clsf"));
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));

        // DM Setting
        SS_A_PROMSTAF_ISDM dm = new SS_A_PROMSTAF_ISDM();
        dm.setAccflag(accflag);
        dm.setClsf(clsf);
        dm.setIncmgpers(incmgpers);
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 deletePromStafIS 호출
        ds = dao.deletePromStafIS(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.deletePromStafIS(dm);
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
     * 지국지원-판촉현황-요원관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initPromStaf(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAF_INITDataSet ds = null;

        // DM Setting
        SS_L_PROMSTAF_INITDM dm = new SS_L_PROMSTAF_INITDM();
        
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 initPromStaf 호출
        ds = dao.initPromStaf(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.initPromStaf(dm);
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
     * 지국지원-판촉현황-요원관리-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_PROMSTAFDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String prn = Util.checkString(req.getParameter("prn"));
        String ernno = Util.checkString(req.getParameter("ernno"));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_PROMSTAFDM dm = new SS_L_PROMSTAFDM();

        dm.setStafclsfcd(stafclsfcd);
        dm.setCntrstatcd(cntrstatcd);
        dm.setStafno(stafno);
        dm.setStafnm(stafnm);
        dm.setPrn(prn);
        dm.setErnno(ernno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 selectPromStafList 호출
        ds = dao.selectPromStafList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.selectPromStafList(dm);
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
     * 지국지원-판촉현황-요원관리-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafListExcel(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_PROMSTAF_PRINTDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String prn = Util.checkString(req.getParameter("prn"));
        String ernno = Util.checkString(req.getParameter("ernno"));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_PROMSTAF_PRINTDM dm = new SS_L_PROMSTAF_PRINTDM();

        dm.setStafclsfcd(stafclsfcd);
        dm.setCntrstatcd(cntrstatcd);
        dm.setStafno(stafno);
        dm.setStafnm(stafnm);
        dm.setPrn(prn);
        dm.setErnno(ernno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 selectPromStafDetail 호출
        ds = dao.selectPromStafListPrint(dm);        
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.selectPromStafList(dm);
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
     * 지국지원-판촉현황-요원관리-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectPromStafDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_PROMSTAFDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));

        // DM Setting
        SS_S_PROMSTAFDM dm = new SS_S_PROMSTAFDM();
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        
        SSBrsup2000DAO dao = new SSBrsup2000DAO();
        // DAO 객체의 selectPromStafDetail 호출
        ds = dao.selectPromStafDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2000EJBHome home = (SSBrsup2000EJBHome)JNDIManager.getInstance().getHome("SSBrsup2000EJB");
        try{
            SSBrsup2000EJB ejb = home.create();
            ds = ejb.selectPromStafDetail(dm);
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