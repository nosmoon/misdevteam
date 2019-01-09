/***************************************************************************************************
 * 파일명 : PSShare1101WB.java
 * 기능 : 정보공유-일정 처리를 위한 Work Bean
 * 작성일자 : 2004-02-23
 * 작성자 : 전현표
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/
package chosun.ciis.ps.pbs.share.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.dao.*;
import chosun.ciis.ps.pbs.share.ejb.*;

/**
 * 정보공유-일정 위한 WB
 *
 */

public class PSShare1101WB {
    /**
     * 정보공유-일정-조회(리스트)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectTacomScheList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_TACOM_SCHEDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디

        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));

        String pageno = Util.checkString(req.getParameter("curr_page_no"));
        String pagesize = Util.checkString(req.getParameter("records_per_page"));

        long iPageSize = 10;  // 페이지당 Row수 일단 10라인
        long iPageNo = 1;     // 최초 페이지 1로 설정
        if(pageno != null && !pageno.equals("")){ // 페이지 값이 있으면 재설정
           iPageNo = Long.parseLong(pageno);
           iPageSize = Long.parseLong(pagesize);
        }
        // DM Setting
        PS_L_TACOM_SCHEDM dm = new PS_L_TACOM_SCHEDM();

        dm.setCmpycd(cmpycd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSShare1101EJBHome home = (PSShare1101EJBHome) JNDIManager.getInstance().getHome("PSShare1101EJB");
        try {
            PSShare1101EJB ejb = home.create();
            ds = ejb.selectTacomScheList(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * 정보공유-일정-상세보기
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void selectTacomScheDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_TACOM_SCHEDataSet ds = null;
        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디
        String seq = Util.checkString(req.getParameter("seq"));

        // DM Setting
        PS_S_TACOM_SCHEDM dm = new PS_S_TACOM_SCHEDM();
        dm.setSeq(Long.parseLong(seq));
        dm.setCmpycd(cmpycd);
        PSShare1101EJBHome home = (PSShare1101EJBHome) JNDIManager.getInstance().getHome("PSShare1101EJB");
        try {
            PSShare1101EJB ejb = home.create();
            ds = ejb.selectTacomScheDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 정보공유-일정-저장(등록)
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void accessTacomSche(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_TACOM_SCHEDataSet ds = null;

        boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과값
        // Request Parameter Processing
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //출판회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디
        String jobcd     = Util.getSessionParameterValue(req, "jobcd", true);          //업무코드

        String seq = Util.checkString(req.getParameter("seq"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String accflag = Util.checkString(req.getParameter("accflag"));

        // DM Setting
        PS_A_TACOM_SCHEDM dm = new PS_A_TACOM_SCHEDM();

        if (!accflag.equals("I")) {
            dm.setSeq(Long.parseLong(seq));
        }
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setRemk(remk);
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setJobcd(jobcd);
        dm.setAccflag(accflag);

        PSShare1101EJBHome home = (PSShare1101EJBHome) JNDIManager.getInstance().getHome("PSShare1101EJB");
        try {
            PSShare1101EJB ejb = home.create();
            bResult = ejb.accessTacomSche(dm);
            if (bResult == true) { // 성공적으로 입력된 경우
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
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