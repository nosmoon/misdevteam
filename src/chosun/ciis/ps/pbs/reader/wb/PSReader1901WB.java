/***************************************************************************************************
 * 파일명   : PSReader1901WB.java
 * 기  능   : 독자-수금입력목록
 * 작성일자 : 2008-07-14
 * 작성자   : 김재일
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

public class PSReader1901WB {

    /**
     * 독자-수금입력목록
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectClamtList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_PBLMCLAMTDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                      //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                         //사용자ID

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                     //지국지사코드
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                 //매체코드
        String procdt_to = Util.checkString(req.getParameter("procdt_to"));                         //입금일자(시작)
        String procdt_fr = Util.checkString(req.getParameter("procdt_fr"));                         //입금일자(종료)
        String recpmthd = Util.checkString(req.getParameter("recpmthd"));                           //입금방법
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("curr_page_no")));        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("records_per_page")));  //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "15";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        PS_L_PBLMCLAMTDM dm = new PS_L_PBLMCLAMTDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setProcdt_to(procdt_to);
        dm.setProcdt_fr(procdt_fr);
        dm.setRecpmthd(recpmthd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        PSReader1901EJBHome home = (PSReader1901EJBHome) JNDIManager.getInstance().getHome("PSReader1901EJB");
        try {

            PSReader1901EJB ejb = home.create();
            ds = ejb.selectClamtList(dm);   // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);     // request에 결과값을 담는다.
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
