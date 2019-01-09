/***************************************************************************************************
 * 파일명 : SSCa1000WB.java
 * 기능 : 사이버센터-사이버지국장
 * 작성일자 : 2005-04-18
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.ca.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


public class SSCa1000WB {

    /**
     * 사이버센터-사이버센터장-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initCaHead(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CA_HEAD_INITDataSet ds = null;

        // DM Setting
        SS_L_CA_HEAD_INITDM dm = new SS_L_CA_HEAD_INITDM();
        
        SSCa1000DAO dao = new SSCa1000DAO();
        // DAO 객체의 initCaHead 호출
        ds = dao.initCaHead(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1000EJBHome home = (SSCa1000EJBHome)JNDIManager.getInstance().getHome("SSCa1000EJB");
        try{
            SSCa1000EJB ejb = home.create();
            ds = ejb.initCaHead(dm);
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
     * 사이버센터-사이버센터장-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCaHeadList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CA_HEADDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String prn = Util.checkString(req.getParameter("prn"));
        String ernno = Util.checkString(req.getParameter("ernno"));
        String empseq = Util.checkString(req.getParameter("empseq"));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_CA_HEADDM dm = new SS_L_CA_HEADDM();

        dm.setStafclsfcd(stafclsfcd);
        dm.setCntrstatcd(cntrstatcd);
        dm.setStafno(stafno);
        dm.setStafnm(stafnm);
        dm.setPrn(prn);        
        dm.setErnno(ernno);
        dm.setEmpseq(empseq);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSCa1000DAO dao = new SSCa1000DAO();
        // DAO 객체의 selecCaHeadList 호출
        ds = dao.selectCaHeadList(dm);
        req.setAttribute("ds", ds);

        /*
        SSCa1000EJBHome home = (SSCa1000EJBHome)JNDIManager.getInstance().getHome("SSCa1000EJB");
        try{
            SSCa1000EJB ejb = home.create();
            ds = ejb.selectCaHeadList(dm);
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
     * 사이버센터-사이버센터장-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCaHeadDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_CA_HEADDataSet ds = null;
        // Request Parameter Processing
        String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));

        // DM Setting
        SS_S_CA_HEADDM dm = new SS_S_CA_HEADDM();
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);

        SSCa1000DAO dao = new SSCa1000DAO();
        // DAO 객체의 selectCaHeadDetail 호출
        ds = dao.selectCaHeadDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSCa1000EJBHome home = (SSCa1000EJBHome)JNDIManager.getInstance().getHome("SSCa1000EJB");
        try{
            SSCa1000EJB ejb = home.create();
            ds = ejb.selectCaHeadDetail(dm);
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
     * 사이버센터-사이버센터장-등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void accessCaHead(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_CA_HEADDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
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
        String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
        String in_cmpydt = Util.checkString(req.getParameter("in_cmpydt"));
        String lvcmpydt = Util.checkString(req.getParameter("lvcmpydt"));
        String empseq = Util.checkString(req.getParameter("empseq"));


        // DM Setting
        SS_A_CA_HEADDM dm = new SS_A_CA_HEADDM();
        dm.setAccflag(accflag);
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
        dm.setCntrstatcd(cntrstatcd);
        dm.setIn_cmpydt(in_cmpydt);
        dm.setLvcmpydt(lvcmpydt);
        dm.setEmpseq(empseq);
        
        SSCa1000DAO dao = new SSCa1000DAO();
        // DAO 객체의 accessCaHead 호출
        ds = dao.accessCaHead(dm);
        req.setAttribute("ds", ds);

        /*
        SSCa1000EJBHome home = (SSCa1000EJBHome)JNDIManager.getInstance().getHome("SSCa1000EJB");
        try{
            SSCa1000EJB ejb = home.create();
            ds = ejb.accessCaHead(dm);
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