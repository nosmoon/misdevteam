/***************************************************************************************************
 * 파일명   : PSAllow1801WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 *            출판업무지원 공통사용 workbeen
 * 작성일자 : 2004-03-12
 * 작성자   : 김상옥
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백  업   :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.allow.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.allow.ejb.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.dao.*;

public class PSAllow1801WB {

    /**
     * 수당월마감 초기를 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DEPTEMP_ALON_PTCRDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String closmm = Util.checkString(req.getParameter("closmm"));                                         //마감년월
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //지국지사코드
        String deptcd = Util.checkString(req.getParameter("deptcd"));                                         //부서코드

        //DM 값을 Setting한다.
        PS_L_DEPTEMP_ALON_PTCRDM dm = new PS_L_DEPTEMP_ALON_PTCRDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setClosmm(closmm);                                                                                 //마감년월
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setDeptcd(deptcd);                                                                                 //부서코드

        PSAllow1801EJBHome home = (PSAllow1801EJBHome) JNDIManager.getInstance().getHome("PSAllow1801EJB");
        try {
            PSAllow1801EJB ejb = home.create();
            ds = ejb.selectAlonClos(dm);       // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);        // request에 결과값을 담는다.
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
     * 수당월마감 마감을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void accessAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_BO_ALON_COLSDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String closmm = Util.checkString(req.getParameter("closmm"));                                         //마감년월
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //지국지사코드
        String paydt = Util.checkString(req.getParameter("paydt"));                                           //지급일자

        //DM 값을 Setting한다.
        PS_A_BO_ALON_COLSDM dm = new PS_A_BO_ALON_COLSDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setClosmm(closmm);                                                                                 //마감년월
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setPaydt(paydt);                                                                                   //지급일자

        PSAllow1801EJBHome home = (PSAllow1801EJBHome) JNDIManager.getInstance().getHome("PSAllow1801EJB");
        try {
            PSAllow1801EJB ejb = home.create();
            ds = ejb.accessAlonClos(dm);       // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);        // request에 결과값을 담는다.
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
     * 수당월마감 마감취소를 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void deleteAlonClos(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_D_BO_ALON_CANCDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String closmm = Util.checkString(req.getParameter("closmm"));                                         //마감년월
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //지국지사코드

        //DM 값을 Setting한다.
        PS_D_BO_ALON_CANCDM dm = new PS_D_BO_ALON_CANCDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setClosmm(closmm);                                                                                 //마감년월
        dm.setBocd(bocd);                                                                                     //지국지사코드

        PSAllow1801EJBHome home = (PSAllow1801EJBHome) JNDIManager.getInstance().getHome("PSAllow1801EJB");
        try {
            PSAllow1801EJB ejb = home.create();
            ds = ejb.deleteAlonClos(dm);       // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);        // request에 결과값을 담는다.
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