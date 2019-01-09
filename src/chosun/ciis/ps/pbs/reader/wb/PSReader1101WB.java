/***************************************************************************************************
* 파일명   : PSReader1101WB.java
* 기능     : Servlet에서 받은 parameter를 이용하여 dm을 set하고 EJB 호출하여 얻은 결과값을 request값으로 반환한다.
* 작성일자 : 2004-02-25
* 작성자   : 김상옥
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/

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


/**
 * 독자-확장독자관리
 */
public class PSReader1101WB{

    /**
     * 확장독자관리 초기,상세조회,RESET을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectRdr_ExtnINFO(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_S_RDR_EXTNDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));                                 //확장일자
        String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));                                 //확장번호

        //DM 값을 Setting한다.
        PS_S_RDR_EXTNDM dm = new PS_S_RDR_EXTNDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setRdr_extndt(rdr_extndt);                                                                         //확장일자
        dm.setRdr_extnno(rdr_extnno);                                                                         //확장번호

        PSReader1101EJBHome home = (PSReader1101EJBHome)JNDIManager.getInstance().getHome("PSReader1101EJB");

        try{
            PSReader1101EJB ejb = home.create();
            ds = ejb.selectRdr_ExtnINFO(dm);           //설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                //request에 결과값을 담는다.
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

    /**
     * 확장독자관리 입력을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void insertRdr_ExtnINFO(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_I_RDR_EXTNDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                           //매체코드
        String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));                           //신청일자
        String qtystr = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));                              //부수
        if (qtystr.equals(""))   qtystr = "1";
        long   qty = Long.parseLong(qtystr);
        String rshpclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rshpclsfcd")));                   //관계구분코드
        String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));                   //신청자명
        String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));         //신청자전화번호1
        String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));         //신청자전화번호2
        String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));         //신청자전화번호3
        String aplcpersptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no1")));       //신청자휴대폰번호1
        String aplcpersptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no2")));       //신청자휴대폰번호2
        String aplcpersptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no3")));       //신청자휴대폰번호3
        String aplcpersoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersoffinm")));           //신청자직장명
        String aplcpersposi = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersposi")));               //신청자직책
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));                             //독자명
        String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));                   //독자전화번호1
        String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));                   //독자전화번호2
        String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));                   //독자전화번호3
        String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));                 //독자휴대폰번호1
        String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));                 //독자휴대폰번호2
        String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));                 //독자휴대폰번호3
        String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));                           //독자주민번호
        String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));                       //독자이메일
        String rdrmembseq = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrmembseq")));                   //독자회원일련번호
        String rdrposi = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrposi")));                         //독자직책
        String rdroffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffinm")));                     //독자직장명
        String rdroffitel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no1")));           //독자직장전화번호1
        String rdroffitel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no2")));           //독자직장전화번호2
        String rdroffitel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no3")));           //독자직장전화번호3
        String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));                           //배달지우편번호
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));                         //배달지주소
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));                 //배달지상세주소
        String acqclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("acqclsf")));                         //수취구분
        String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));                       //납부자성명
        String pymtoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtoffinm")));                   //납부자직장명
        String pymtposi = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtposi")));                       //납부자직책
        String pymttel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no1")));                 //납부자전화번호1
        String pymttel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no2")));                 //납부자전화번호2
        String pymttel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no3")));                 //납부자전화번호3
        String pymtptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no1")));               //납부자휴대폰번호1
        String pymtptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no2")));               //납부자휴대폰번호2
        String pymtptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no3")));               //납부자휴대폰번호3
        String pymtzip = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtzip")));                         //납부자우편번호
        String pymtaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtaddr")));                       //납부자주소
        String pymtdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtdtlsaddr")));               //납부자상세주소
        String rcpmmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmmthd")));                       //입금방법
        String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));                       //배정지국지사코드
        String asinresn = Util.Uni2Ksc(Util.checkString(req.getParameter("asinresn")));                       //배정사유
        String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));                   //주거구분코드
        String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));                   //주거형태코드
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                               //비고
        String rdr_extnclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnclsfcd")));                               //비고

        //DM 값을 Setting한다.
        PS_I_RDR_EXTNDM dm = new PS_I_RDR_EXTNDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setMedicd(medicd);                                                                                 //매체코드
        dm.setAplcdt(aplcdt);                                                                                 //신청일자
        dm.setQty(qty);                                                                                       //부수
        dm.setRshpclsfcd(rshpclsfcd);                                                                         //관계구분코드
        dm.setAplcpersnm(aplcpersnm);                                                                         //신청자명
        dm.setAplcperstel_no1(aplcperstel_no1);                                                               //신청자전화번호1
        dm.setAplcperstel_no2(aplcperstel_no2);                                                               //신청자전화번호2
        dm.setAplcperstel_no3(aplcperstel_no3);                                                               //신청자전화번호3
        dm.setAplcpersptph_no1(aplcpersptph_no1);                                                             //신청자휴대폰번호1
        dm.setAplcpersptph_no2(aplcpersptph_no2);                                                             //신청자휴대폰번호2
        dm.setAplcpersptph_no3(aplcpersptph_no3);                                                             //신청자휴대폰번호3
        dm.setAplcpersoffinm(aplcpersoffinm);                                                                 //신청자직장명
        dm.setAplcpersposi(aplcpersposi);                                                                     //신청자직책
        dm.setRdrnm(rdrnm);                                                                                   //독자명
        dm.setRdrtel_no1(rdrtel_no1);                                                                         //독자전화번호1
        dm.setRdrtel_no2(rdrtel_no2);                                                                         //독자전화번호2
        dm.setRdrtel_no3(rdrtel_no3);                                                                         //독자전화번호3
        dm.setRdrptph_no1(rdrptph_no1);                                                                       //독자휴대폰번호1
        dm.setRdrptph_no2(rdrptph_no2);                                                                       //독자휴대폰번호2
        dm.setRdrptph_no3(rdrptph_no3);                                                                       //독자휴대폰번호3
        dm.setRdrprn(rdrprn);                                                                                 //독자주민번호
        dm.setRdremail(rdremail);                                                                             //독자이메일
        dm.setRdrmembseq(rdrmembseq);                                                                         //독자회원일련번호
        dm.setRdrposi(rdrposi);                                                                               //독자직책
        dm.setRdroffinm(rdroffinm);                                                                           //독자직장명
        dm.setRdroffitel_no1(rdroffitel_no1);                                                                 //독자직장전화번호1
        dm.setRdroffitel_no2(rdroffitel_no2);                                                                 //독자직장전화번호2
        dm.setRdroffitel_no3(rdroffitel_no3);                                                                 //독자직장전화번호3
        dm.setDlvzip(dlvzip);                                                                                 //배달지우편번호
        dm.setDlvaddr(dlvaddr);                                                                               //배달지주소
        dm.setDlvdtlsaddr(dlvdtlsaddr);                                                                       //배달지상세주소
        dm.setAcqclsf(acqclsf);                                                                               //수취구분
        dm.setPymtflnm(pymtflnm);                                                                             //납부자성명
        dm.setPymtoffinm(pymtoffinm);                                                                         //납부자직장명
        dm.setPymtposi(pymtposi);                                                                             //납부자직책
        dm.setPymttel_no1(pymttel_no1);                                                                       //납부자전화번호1
        dm.setPymttel_no2(pymttel_no2);                                                                       //납부자전화번호2
        dm.setPymttel_no3(pymttel_no3);                                                                       //납부자전화번호3
        dm.setPymtptph_no1(pymtptph_no1);                                                                     //납부자휴대폰번호1
        dm.setPymtptph_no2(pymtptph_no2);                                                                     //납부자휴대폰번호2
        dm.setPymtptph_no3(pymtptph_no3);                                                                     //납부자휴대폰번호3
        dm.setPymtzip(pymtzip);                                                                               //납부자우편번호
        dm.setPymtaddr(pymtaddr);                                                                             //납부자주소
        dm.setPymtdtlsaddr(pymtdtlsaddr);                                                                     //납부자상세주소
        dm.setRcpmmthd(rcpmmthd);                                                                             //입금방법
        dm.setAsinbocd(asinbocd);                                                                             //배정지국지사코드
        dm.setAsinresn(asinresn);                                                                             //배정사유
        dm.setResiclsfcd(resiclsfcd);                                                                         //주거구분코드
        dm.setResitypecd(resitypecd);                                                                         //주거형태코드
        dm.setRemk(remk);                                                                                     //비고
        dm.setRdr_extnclsfcd(rdr_extnclsfcd);

        PSReader1101EJBHome home = (PSReader1101EJBHome)JNDIManager.getInstance().getHome("PSReader1101EJB");

        try{
            PSReader1101EJB ejb = home.create();
            ds = ejb.insertRdr_ExtnINFO(dm);           //설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                //request에 결과값을 담는다.
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

    /**
     * 확장독자관리 수정을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void updateRdr_ExtnINFO(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_U_RDR_EXTNDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));                   //확장일자
        String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));                   //확장번호
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                           //매체코드
        String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));                           //신청일자
        String qtystr = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));                              //부수
        if (qtystr.equals(""))   qtystr = "1";
        long   qty = Long.parseLong(qtystr);
        String rshpclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rshpclsfcd")));                   //관계구분코드
        String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));                   //신청자명
        String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));         //신청자전화번호1
        String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));         //신청자전화번호2
        String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));         //신청자전화번호3
        String aplcpersptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no1")));       //신청자휴대폰번호1
        String aplcpersptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no2")));       //신청자휴대폰번호2
        String aplcpersptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersptph_no3")));       //신청자휴대폰번호3
        String aplcpersoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersoffinm")));           //신청자직장명
        String aplcpersposi = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersposi")));               //신청자직책
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));                             //독자명
        String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));                   //독자전화번호1
        String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));                   //독자전화번호2
        String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));                   //독자전화번호3
        String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));                 //독자휴대폰번호1
        String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));                 //독자휴대폰번호2
        String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));                 //독자휴대폰번호3
        String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));                           //독자주민번호
        String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));                       //독자이메일
        String rdrmembseq = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrmembseq")));                   //독자회원일련번호
        String rdrposi = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrposi")));                         //독자직책
        String rdroffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffinm")));                     //독자직장명
        String rdroffitel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no1")));           //독자직장전화번호1
        String rdroffitel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no2")));           //독자직장전화번호2
        String rdroffitel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdroffitel_no3")));           //독자직장전화번호3
        String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));                           //배달지우편번호
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));                         //배달지주소
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));                 //배달지상세주소
        String acqclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("acqclsf")));                         //수취구분
        String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));                       //납부자성명
        String pymtoffinm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtoffinm")));                   //납부자직장명
        String pymtposi = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtposi")));                       //납부자직책
        String pymttel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no1")));                 //납부자전화번호1
        String pymttel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no2")));                 //납부자전화번호2
        String pymttel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymttel_no3")));                 //납부자전화번호3
        String pymtptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no1")));               //납부자휴대폰번호1
        String pymtptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no2")));               //납부자휴대폰번호2
        String pymtptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtptph_no3")));               //납부자휴대폰번호3
        String pymtzip = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtzip")));                         //납부자우편번호
        String pymtaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtaddr")));                       //납부자주소
        String pymtdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtdtlsaddr")));               //납부자상세주소
        String rcpmmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmmthd")));                       //입금방법
        String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));                       //배정지국지사코드
        String asinresn = Util.Uni2Ksc(Util.checkString(req.getParameter("asinresn")));                       //배정사유
        String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));                   //주거구분코드
        String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));                   //주거형태코드
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                               //비고
        String rdr_extnclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnclsfcd")));                               //비고

        //DM 값을 Setting한다.
        PS_U_RDR_EXTNDM dm = new PS_U_RDR_EXTNDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setRdr_extndt(rdr_extndt);                                                                         //확장일자
        dm.setRdr_extnno(rdr_extnno);                                                                         //확장번호
        dm.setMedicd(medicd);                                                                                 //매체코드
        dm.setAplcdt(aplcdt);                                                                                 //신청일자
        dm.setQty(qty);                                                                                       //부수
        dm.setRshpclsfcd(rshpclsfcd);                                                                         //관계구분코드
        dm.setAplcpersnm(aplcpersnm);                                                                         //신청자명
        dm.setAplcperstel_no1(aplcperstel_no1);                                                               //신청자전화번호1
        dm.setAplcperstel_no2(aplcperstel_no2);                                                               //신청자전화번호2
        dm.setAplcperstel_no3(aplcperstel_no3);                                                               //신청자전화번호3
        dm.setAplcpersptph_no1(aplcpersptph_no1);                                                             //신청자휴대폰번호1
        dm.setAplcpersptph_no2(aplcpersptph_no2);                                                             //신청자휴대폰번호2
        dm.setAplcpersptph_no3(aplcpersptph_no3);                                                             //신청자휴대폰번호3
        dm.setAplcpersoffinm(aplcpersoffinm);                                                                 //신청자직장명
        dm.setAplcpersposi(aplcpersposi);                                                                     //신청자직책
        dm.setRdrnm(rdrnm);                                                                                   //독자명
        dm.setRdrtel_no1(rdrtel_no1);                                                                         //독자전화번호1
        dm.setRdrtel_no2(rdrtel_no2);                                                                         //독자전화번호2
        dm.setRdrtel_no3(rdrtel_no3);                                                                         //독자전화번호3
        dm.setRdrptph_no1(rdrptph_no1);                                                                       //독자휴대폰번호1
        dm.setRdrptph_no2(rdrptph_no2);                                                                       //독자휴대폰번호2
        dm.setRdrptph_no3(rdrptph_no3);                                                                       //독자휴대폰번호3
        dm.setRdrprn(rdrprn);                                                                                 //독자주민번호
        dm.setRdremail(rdremail);                                                                             //독자이메일
        dm.setRdrmembseq(rdrmembseq);                                                                         //독자회원일련번호
        dm.setRdrposi(rdrposi);                                                                               //독자직책
        dm.setRdroffinm(rdroffinm);                                                                           //독자직장명
        dm.setRdroffitel_no1(rdroffitel_no1);                                                                 //독자직장전화번호1
        dm.setRdroffitel_no2(rdroffitel_no2);                                                                 //독자직장전화번호2
        dm.setRdroffitel_no3(rdroffitel_no3);                                                                 //독자직장전화번호3
        dm.setDlvzip(dlvzip);                                                                                 //배달지우편번호
        dm.setDlvaddr(dlvaddr);                                                                               //배달지주소
        dm.setDlvdtlsaddr(dlvdtlsaddr);                                                                       //배달지상세주소
        dm.setAcqclsf(acqclsf);                                                                               //수취구분
        dm.setPymtflnm(pymtflnm);                                                                             //납부자성명
        dm.setPymtoffinm(pymtoffinm);                                                                         //납부자직장명
        dm.setPymtposi(pymtposi);                                                                             //납부자직책
        dm.setPymttel_no1(pymttel_no1);                                                                       //납부자전화번호1
        dm.setPymttel_no2(pymttel_no2);                                                                       //납부자전화번호2
        dm.setPymttel_no3(pymttel_no3);                                                                       //납부자전화번호3
        dm.setPymtptph_no1(pymtptph_no1);                                                                     //납부자휴대폰번호1
        dm.setPymtptph_no2(pymtptph_no2);                                                                     //납부자휴대폰번호2
        dm.setPymtptph_no3(pymtptph_no3);                                                                     //납부자휴대폰번호3
        dm.setPymtzip(pymtzip);                                                                               //납부자우편번호
        dm.setPymtaddr(pymtaddr);                                                                             //납부자주소
        dm.setPymtdtlsaddr(pymtdtlsaddr);                                                                     //납부자상세주소
        dm.setRcpmmthd(rcpmmthd);                                                                             //입금방법
        dm.setAsinbocd(asinbocd);                                                                             //배정지국지사코드
        dm.setAsinresn(asinresn);                                                                             //배정사유
        dm.setResiclsfcd(resiclsfcd);                                                                         //주거구분코드
        dm.setResitypecd(resitypecd);                                                                         //주거형태코드
        dm.setRemk(remk);                                                                                     //비고
        dm.setRdr_extnclsfcd(rdr_extnclsfcd);                                                                 //확장구분

        PSReader1101EJBHome home = (PSReader1101EJBHome)JNDIManager.getInstance().getHome("PSReader1101EJB");

        try{
            PSReader1101EJB ejb = home.create();
            ds = ejb.updateRdr_ExtnINFO(dm);           //설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                //request에 결과값을 담는다.
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

    /**
     * 확장독자관리 삭제를 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void deleteRdr_ExtnINFO(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_D_RDR_EXTNDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));                   //확장일자
        String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));                   //확장번호

        //DM 값을 Setting한다.
        PS_D_RDR_EXTNDM dm = new PS_D_RDR_EXTNDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setRdr_extndt(rdr_extndt);                                                                         //확장일자
        dm.setRdr_extnno(rdr_extnno);                                                                         //확장번호

        PSReader1101EJBHome home = (PSReader1101EJBHome)JNDIManager.getInstance().getHome("PSReader1101EJB");

        try{
            PSReader1101EJB ejb = home.create();
            ds = ejb.deleteRdr_ExtnINFO(dm);           //설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                //request에 결과값을 담는다.
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
