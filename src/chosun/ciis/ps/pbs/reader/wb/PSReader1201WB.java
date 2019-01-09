/***************************************************************************************************
* 파일명   : PSReader1201WB.java
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
 * 독자-확장독자내역
 */
public class PSReader1201WB{

    /**
     * 확장독자내역 화면을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectRdr_Extn_search(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_RDR_EXTN_SEARCHDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String sh_extndt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_fr")));               //확장일자(from)
        String sh_extndt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_to")));               //확장일자(to)
        String sh_aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcpathcd")));             //신청경로
        String sh_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extntypecd")));             //신청유형
        String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));                     //신청매체
        String sh_rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrnm")));                       //독자성명
        String sh_rdrprn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrprn1")));                   //주민번호1
        String sh_rdrprn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrprn2")));                   //주민번호2
        String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));                     //전화번호1
        String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));                     //전화번호2
        String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));                     //전화번호3
        String sh_dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvaddr")));                   //주소명
        String sh_extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extnflnm")));                 //확장자성명
        String sh_deliproccd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_deliproccd")));               //배본여부
        String sh_bouseyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_bouseyn")));                   //등록여부
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "10";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        PS_L_RDR_EXTN_SEARCHDM dm = new PS_L_RDR_EXTN_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setSh_extndt_fr(sh_extndt_fr);                                                                     //확장일자(from)
        dm.setSh_extndt_to(sh_extndt_to);                                                                     //확장일자(to)
        dm.setSh_aplcpathcd(sh_aplcpathcd);                                                                   //신청경로
        dm.setSh_extntypecd(sh_extntypecd);                                                                   //신청유형
        dm.setSh_medicd(sh_medicd);                                                                           //신청매체
        dm.setSh_rdrnm(sh_rdrnm);                                                                             //독자성명
        dm.setSh_rdrprn1(sh_rdrprn1);                                                                         //주민번호1
        dm.setSh_rdrprn2(sh_rdrprn2);                                                                         //주민번호2
        dm.setSh_phone1(sh_phone1);                                                                           //전화번호1
        dm.setSh_phone2(sh_phone2);                                                                           //전화번호2
        dm.setSh_phone3(sh_phone3);                                                                           //전화번호3
        dm.setSh_dlvaddr(sh_dlvaddr);                                                                         //주소명
        dm.setSh_extnflnm(sh_extnflnm);                                                                       //확장자성명
        dm.setSh_deliproccd(sh_deliproccd);                                                                   //배본여부
        dm.setSh_bouseyn(sh_bouseyn);                                                                         //등록여부

        dm.setPageno(pageno);                                                                                 //현재페이지
        dm.setPagesize(pagesize);                                                                             //페이지당 보여줄 건수

        PSReader1201EJBHome home = (PSReader1201EJBHome)JNDIManager.getInstance().getHome("PSReader1201EJB");

        try{
            PSReader1201EJB ejb = home.create();
            ds = ejb.selectRdr_Extn_search(dm);        //설정된 dm값으로 EJB를 호출한다.
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
