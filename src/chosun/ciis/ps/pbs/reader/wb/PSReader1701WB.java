/***************************************************************************************************
 * 파일명   : PSReader1701WB.java
 * 기  능   : 독자-독자입력리스트
 * 작성일자 : 2004-11-29
 * 작성자   : 전현표
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

public class PSReader1701WB {

    /**
     * 독자-독자입력리스트
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectTodayInputList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_TODAYINPUT_RDRDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));                               //지국지사코드
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                     //매체코드
        String input_fromdt = Util.checkString(req.getParameter("input_fromdt"));
        String input_todt = Util.checkString(req.getParameter("input_todt"));

        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("curr_page_no")));                        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("records_per_page")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "15";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        PS_L_TODAYINPUT_RDRDM dm = new PS_L_TODAYINPUT_RDRDM();

        dm.setCmpycd(cmpycd);
        dm.setAsinbocd(asinbocd);
        dm.setInput_fromdt(input_fromdt);
        dm.setInput_todt(input_todt);
        dm.setMedicd(medicd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        PSReader1701EJBHome home = (PSReader1701EJBHome) JNDIManager.getInstance().getHome("PSReader1701EJB");
        try {

            PSReader1701EJB ejb = home.create();
            ds = ejb.selectTodayInputList(dm); // 설정된 dm값으로 EJB를 호출한다.
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

}
/***************************************************************************************************
 * 수정자     :
 * 수정전코드 :
**************************************************************************************************/