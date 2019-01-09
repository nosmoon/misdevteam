/***************************************************************************************************
 * 파일명   : PSSupport1101WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2003-10-29
 * 작성자   : 김건호
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.support.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.support.ejb.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.dao.*;

/**
 * 불편접수-불편등록
 */
public class PSSupport1101WB {
    /**
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DSCT_SPPTDataSet ds = null;
        // 출판국이 아닐경우는 ALL로 모든 매체코드를 조회한다.

        PS_L_DSCT_SPPTDM dm = new PS_L_DSCT_SPPTDM(); // DM 값을 Setting한다.

        String cmpycd      = Util.getSessionParameterValue(req, "cmpycd", true);          // 회사코드

        dm.setCmpycd(cmpycd);

        PSSupport1101EJBHome home = (PSSupport1101EJBHome) JNDIManager.getInstance().getHome("PSSupport1101EJB");
        try {

            PSSupport1101EJB ejb = home.create();

            ds = ejb.selectCodeList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DSCTINFODataSet ds = null;

        //사용자 세션정보
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true); //지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디

        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
        String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
        String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
        String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));

        PS_L_DSCTINFODM dm = new PS_L_DSCTINFODM(); // DM 값을 Setting한다.

        dm.setBocd(bocd);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);

        PSSupport1101EJBHome home = (PSSupport1101EJBHome) JNDIManager.getInstance().getHome("PSSupport1101EJB");
        try {

            PSSupport1101EJB ejb = home.create();

            ds = ejb.selectRdrList(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void insertDsct(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_I_DSCTDataSet ds = null;

        //사용자 세션정보
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true);                   //지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                 //입력자아이디

        String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String rdrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrbocd")));
        String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd"))); //불편유형
        String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
        String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
        String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
        String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
        String tel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
        String tel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
        String tel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));

        String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
        String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
        String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));

        String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));

        PS_I_DSCTDM dm = new PS_I_DSCTDM(); // DM 값을 Setting한다.

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRegdt(regdt);
        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setRdrbocd(rdrbocd);
        dm.setDscttypecd(dscttypecd);
        dm.setPrn(prn);
        dm.setMedicd(medicd);
        dm.setTermsubsno(termsubsno);
        dm.setZip(zip);
        dm.setAddr(addr);
        dm.setDtlsaddr(dtlsaddr);
        dm.setTel1(tel1);
        dm.setTel2(tel2);
        dm.setTel3(tel3);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);

        dm.setTitl(titl);
        dm.setCont(cont);

        PSSupport1101EJBHome home = (PSSupport1101EJBHome) JNDIManager.getInstance().getHome("PSSupport1101EJB");
        try {

            PSSupport1101EJB ejb = home.create();

            ds = ejb.insertDsct(dm); // 설정된 dm값으로 EJB를 호출한다.

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

}