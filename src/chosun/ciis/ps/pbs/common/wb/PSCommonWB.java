/***************************************************************************************************
 * 파일명   : PSCommonWB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 *            출판업무지원 공통사용 workbeen
 * 작성일자 : 2004-02-25
 * 작성자   : 김상옥
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.common.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.common.ejb.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.dao.*;

public class PSCommonWB {

    /**
     * 공통 우편번호와 주소를 찾기 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectZipAddr(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PB_L_TAOCC_PSTCDDataSet ds = null;

        //정상적으로 Request로 받을 파라메터
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));                             //검색어(읍,면,동)
        String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));                                 //우편번호

        //DM 값을 Setting한다.
        PB_L_TAOCC_PSTCDDM dm = new PB_L_TAOCC_PSTCDDM();
        dm.setAddr3(addr3);                                                                                   //검색어(읍,면,동)
        dm.setZip(zip);                                                                                       //우편번호

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectZipAddr(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }


    /**
     * 공통 우편번호와 주소를 찾기 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectZipAddr3(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_ZIP_BRANCHDataSet ds = null;

        //정상적으로 Request로 받을 파라메터
        String bocd = ""; //Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                             //검색어(읍,면,동)
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));                             //검색어(읍,면,동)
        String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));                                 //우편번호


        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno"))); //현재페이지
        if (pagenostr.equals(""))
            pagenostr = "1";
        long pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize"))); //페이지당 보여줄 건수
        if (pagesizestr.equals(""))
            pagesizestr = "1000";
        long pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        CO_L_ZIP_BRANCHDM dm = new CO_L_ZIP_BRANCHDM();
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        dm.setAddr3(addr3);                                                                                   //검색어(읍,면,동)
        dm.setZip(zip);                                                                                       //우편번호

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectZipAddr3(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 조회조건에 해당되는 사원명과 부서를조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectEmpDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PB_S_CORBOEMPDataSet ds = null;

        //정상적으로 Request로 받을 파라메터
        //String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));                               //지국지사코드
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true);                                       //사용자ID
        String boemp_no = req.getParameter("procpers");                                                         //지국지사 사원코드

		//dm에 값을 Setting한다.
        PB_S_CORBOEMPDM dm = new PB_S_CORBOEMPDM();
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setBoemp_no(boemp_no);                                                                             //지국지사 사원코드

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");

        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectEmpDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);   // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 지사별 부서를 검색한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectBoDept(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PB_L_BOCDDEPTDataSet ds = null;

        //Session에서 얻을 데이타
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //지국지사코드

		//dm에 값을 Setting한다.
        PB_L_BOCDDEPTDM dm = new PB_L_BOCDDEPTDM();
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");

        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectBoDept(dm);  // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 기존독자를 검색한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectExstRdr(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PB_L_EXST_RDR_SEARCHDataSet ds = null;

        //Session에서 얻을 데이타
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //지국지사코드
        String sh_rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_no")));                     //독자번호
        String sh_rdrtel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel1")));                   //전화번호1
        String sh_rdrtel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel2")));                   //전화번호2
        String sh_rdrtel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrtel3")));                   //전화번호3
        String sh_rdrpho1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho1")));                   //휴대폰번호1
        String sh_rdrpho2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho2")));                   //휴대폰번호2
        String sh_rdrpho3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrpho3")));                   //휴대폰번호3
        String sh_dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvzip")));                     //우편번호
        String sh_dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvaddr")));                   //주소
        String sh_dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvdtlsaddr")));           //상세주소
        String sh_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn")));                           //주민번호
        String sh_email = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_email")));                       //이메일
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        PB_L_EXST_RDR_SEARCHDM dm = new PB_L_EXST_RDR_SEARCHDM();
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setIncmgpers(incmgpers);                                                                           //입력사원번호
        dm.setSh_rdr_no(sh_rdr_no);                                                                           //독자번호
        dm.setSh_rdrtel1(sh_rdrtel1);                                                                         //전화번호1
        dm.setSh_rdrtel2(sh_rdrtel2);                                                                         //전화번호2
        dm.setSh_rdrtel3(sh_rdrtel3);                                                                         //전화번호3
        dm.setSh_rdrpho1(sh_rdrpho1);                                                                         //휴대폰번호1
        dm.setSh_rdrpho2(sh_rdrpho2);                                                                         //휴대폰번호2
        dm.setSh_rdrpho3(sh_rdrpho3);                                                                         //휴대폰번호3
        dm.setSh_dlvzip(sh_dlvzip);                                                                           //우편번호
        dm.setSh_dlvaddr(sh_dlvaddr);                                                                         //주소
        dm.setSh_dlvdtlsaddr(sh_dlvdtlsaddr);                                                                 //상세주소
        dm.setSh_prn(sh_prn);                                                                                 //주민번호
        dm.setSh_email(sh_email);                                                                             //이메일
        dm.setPageno(pageno);                                                                                 //현재페이지
        dm.setPagesize(pagesize);                                                                             //페이지당 보여줄 건수

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectExstRdr(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 독자번호로 독자정보를 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectReaderDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_RDRINFODataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드

        //정상적으로 Request로 받을 파라메터
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));                                         //독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));                                         //매체코드
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));                                 //정기구독번호

		//dm에 값을 Setting한다.
        PS_S_RDRINFODM dm = new PS_S_RDRINFODM();

        dm.setCmpycd(cmpycd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectReaderDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);      // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 독자번호로 독자정보(BOCD)를 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectReaderDetailBocd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_RDRINFODataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드

        //정상적으로 Request로 받을 파라메터
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));                                         //독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));                                         //매체코드
        String termsubsno = Util.checkString(req.getParameter("termsubsno"));                                 //정기구독번호

        //dm에 값을 Setting한다.
        PS_S_RDRINFODM dm = new PS_S_RDRINFODM();

        dm.setCmpycd(cmpycd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);

        PSCommonEJBHome home = (PSCommonEJBHome) JNDIManager.getInstance().getHome("PSCommonEJB");
        try {
            PSCommonEJB ejb = home.create();
            ds = ejb.selectReaderDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);      // request에 결과값을 담는다.
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * 지국검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectBranchOfficeList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
        // parameter requesting 하고  DM에 값을 Setting
        String bonm = Util.Uni2Euc(Util.checkString(req.getParameter("bonm")));
        String addr3 = Util.Uni2Euc(Util.checkString(req.getParameter("addr3")));
        PS_L_BO_SRCHDM dm = new PS_L_BO_SRCHDM();

        dm.setBonm(bonm);
        dm.setAddr3(addr3);
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        PSCommonEJBHome home = (PSCommonEJBHome)JNDIManager.getInstance().getHome("PSCommonEJB");
        try{
            PSCommonEJB ejb = home.create();
            PS_L_BO_SRCHDataSet ds = null;
            ds = ejb.selectBranchOfficeList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

}
