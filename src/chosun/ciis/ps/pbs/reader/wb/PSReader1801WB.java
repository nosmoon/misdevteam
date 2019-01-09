/***************************************************************************************************
 * 파일명   : PSReader1801WB.java
 * 기  능   : 독자-독자조회 코드및 초기화면
 * 작성일자 : 2004-02-29
 * 작성자   : 김건호
 ****************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 ****************************************************************************************************/

package chosun.ciis.ps.pbs.reader.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.reader.ejb.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;

public class PSReader1801WB {

    /**
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    /*
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_PUBL_RDRDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //로그인사용자

        PS_S_PUBL_RDRDM dm = new PS_S_PUBL_RDRDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);

        PSReader1401EJBHome home = (PSReader1401EJBHome) JNDIManager.getInstance().getHome("PSReader1401EJB");
        try {

            PSReader1401EJB ejb = home.create();
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
    */

    /**
     * 독자조회 데이타를 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_RDR_PUBL_ETCDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //로그인사용자

        String aplcdtfr = Util.checkString(req.getParameter("aplcdtfr"));
        String aplcdtto = Util.checkString(req.getParameter("aplcdtto"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String asinbocd = Util.checkString(req.getParameter("asinbocd"));
        String prn1 = Util.checkString(req.getParameter("prn1"));
        String prn2 = Util.checkString(req.getParameter("prn2"));
        String tel_kubun = Util.checkString(req.getParameter("tel_kubun"));
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
        String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
        String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
        String curr_page_no = req.getParameter("curr_page_no"); // 현재페이지
        String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수
        String flnm_yn = req.getParameter("flnm_yn") ;      // 독자명/수취인명 등 구분

        int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_RDR_PUBL_ETCDM dm = new PS_L_RDR_PUBL_ETCDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setAplcdtfr(aplcdtfr);
        dm.setAplcdtto(aplcdtto);
        dm.setMedicd(medicd);
        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setAsinbocd(asinbocd);
        dm.setPrn1(prn1);
        dm.setPrn2(prn2);
        dm.setTel_kubun(tel_kubun);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setAddr(addr);
        dm.setEmail(email);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);
        dm.setFlnm_yn(flnm_yn);

        PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");
        try {

            PSReader1801EJB ejb = home.create();
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
     * 구독자관리 상세 조회
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    /*
    public void selectDetailInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_READERINFODataSet ds = null;

        //사용자 세션정보
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);         // 사용자

        //정상적으로 Request로 받을 파라메터
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_rdr_no"))); //독자번호
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_medicd"))); //매체번호
        String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_termsubsno"))); //정기구독자번호

        //DM 값을 Setting한다.
        PS_S_READERINFODM dm = new PS_S_READERINFODM();
        dm.setIncmgpers(incmgpers); // 사용자
        dm.setRdr_no(rdr_no); //독자번호
        dm.setMedicd(medicd); //매체번호
        dm.setTermsubsno(termsubsno); //정기구독자번호

        PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");

        try {
            PSReader1801EJB ejb = home.create();
            ds = ejb.selectDetailInfo(dm); //설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); //request에 결과값을 담는다.
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
    */


   /**
    * 지국 독자
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBoReaderList(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_L_BO_READER_SEARCHDataSet ds = null;

       //Session에서 얻을 데이타
       String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
       //String bocd = Util.getSessionParameterValue(req, "bocd", true);

       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
       String gubun1 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun1")));
       String nmtext = Util.Uni2Ksc(Util.checkString(req.getParameter("nmtext")));
       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
       String gubun2 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun2")));
       String phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone1")));
       String phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone2")));
       String phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone3")));
       String gubun3 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun3")));
       String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
       String sendmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_sendmthd")));
       String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
       String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
       String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));

       String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
       if (pagenostr.equals(""))   pagenostr = "1";
       long   pageno = Long.parseLong(pagenostr);
       String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
       if (pagesizestr.equals(""))   pagesizestr = "5";
       long   pagesize = Long.parseLong(pagesizestr);

       //DM 값을 Setting한다.
       PS_L_BO_READER_SEARCHDM dm = new PS_L_BO_READER_SEARCHDM();

       dm.setCmpycd(cmpycd);
       dm.setMedicd(medicd);
       dm.setGubun1(gubun1);
       dm.setNmtext(nmtext);
       dm.setRdr_no(rdr_no);
       dm.setGubun2(gubun2);
       dm.setPhone1(phone1);
       dm.setPhone2(phone2);
       dm.setPhone3(phone3);
       dm.setGubun3(gubun3);
       dm.setDlvdtlsaddr(dlvdtlsaddr);
       dm.setSendmthd(sendmthd);
       dm.setAreacd(areacd);
       dm.setDeptcd(deptcd);
       dm.setBocd(bocd);
       dm.setPageno(pageno);
       dm.setPagesize(pagesize);

       PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");
       try {

           PSReader1801EJB ejb = home.create();
           ds = ejb.selectBoReaderList(dm); // 설정된 dm값으로 EJB를 호출한다.
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
    * 지국 독자
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    **/
   public void selectBoReaderDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_S_BO_READERINFODataSet ds = null;

       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
       String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));

       //DM 값을 Setting한다.
       PS_S_BO_READERINFODM dm = new PS_S_BO_READERINFODM();

       dm.setRdr_no(rdr_no);
       dm.setMedicd(medicd);
       dm.setTermsubsno(termsubsno);

       PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");
       try {

           PSReader1801EJB ejb = home.create();
           ds = ejb.selectBoReaderDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
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
    * 수정할 구독자 정보를 Set
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
   public void updateBoReaderInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_U_BO_READERINFO_ONEDataSet ds = null;

       //사용자 세션정보
       //String bocd = Util.getSessionParameterValue(req, "bocd", true); //지국지사코드
       String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //회사코드
       String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디

       //정상적으로 Request로 받을 파라메터
       String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no"))); //독자번호
       String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd"))); //매체코드
       String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno"))); //정기구독번호

       String acq_bocd = Util.checkString(req.getParameter("acq_bocd"));
       String sendmthd = Util.checkString(req.getParameter("sendmthd"));
       String dstccd = Util.checkString(req.getParameter("dstccd"));
       String dlvno = Util.checkString(req.getParameter("dlvno"));
       String bo_rdr_no = Util.checkString(req.getParameter("bo_rdr_no"));

       //DM 값을 Setting한다.
       PS_U_BO_READERINFO_ONEDM dm = new PS_U_BO_READERINFO_ONEDM();

       dm.setIncmgpers(incmgpers); //입력사원번호
       dm.setRdr_no(rdr_no); //독자번호
       dm.setMedicd(medicd); //매체코드
       dm.setTermsubsno(termsubsno); //정기구독번호

       dm.setAcq_bocd(acq_bocd);       //수취인지국코드
       dm.setSendmthd(sendmthd);
       dm.setDstccd(dstccd);
       dm.setDlvno(dlvno);
       dm.setBo_rdr_no(bo_rdr_no);

       PSReader1801EJBHome home = (PSReader1801EJBHome) JNDIManager.getInstance().getHome("PSReader1801EJB");
       try {
           PSReader1801EJB ejb = home.create();
           ds = ejb.updateBoReaderInfo(dm); //설정된 dm값으로 EJB를 호출한다.
           req.setAttribute("ds", ds); //request에 결과값을 담는다.
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
/***************************************************************************************************
 * 수정자     :
 * 수정전코드 :
**************************************************************************************************/
