/***************************************************************************************************
 * 파일명   : PSAllow1101WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고
 *            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 *            출판업무지원 공통사용 workbeen
 * 작성일자 : 2004-03-08
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

public class PSAllow1101WB {

    /**
     * 사원별수당관리 초기를 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectBoemp_AlonKind(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_BOEMP_ALON_KINDDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //지국지사코드
        String boemp_no1 = Util.checkString(req.getParameter("boemp_no1"));                                   //사원번호1
        String boemp_no2 = Util.checkString(req.getParameter("boemp_no2"));                                   //사원번호2
        String deptcd = Util.checkString(req.getParameter("deptcd"));                                         //부서코드

        //DM 값을 Setting한다.
        PS_L_BOEMP_ALON_KINDDM dm = new PS_L_BOEMP_ALON_KINDDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setBoemp_no1(boemp_no1);                                                                           //사원번호1
        dm.setBoemp_no2(boemp_no2);                                                                           //사원번호2
        dm.setDeptcd(deptcd);                                                                                 //부서코드

        PSAllow1101EJBHome home = (PSAllow1101EJBHome) JNDIManager.getInstance().getHome("PSAllow1101EJB");
        try {
            PSAllow1101EJB ejb = home.create();
            ds = ejb.selectBoemp_AlonKind(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 사원별 수당종류 저장을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void accessBoemp_AlonKind(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_A_BOEMP_ALONKINDDataSet ds = null;

        //사용자 세션정보
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.checkString(req.getParameter("bocd"));                                             //지국지사코드
        String listcntstr = Util.checkString(req.getParameter("listcnt"));                                    //총 레코드 카운트
        if (listcntstr.equals(""))   listcntstr = "0";
        long   listcnt = Long.parseLong(listcntstr);

        StringBuffer empalonkindarr = new StringBuffer("");                                                   //사원,수당종류 Array
        StringBuffer temparr = new StringBuffer("");                                                          //특정사원의 수당종류를 위한 임시변수

        //사원별 수당종류 String Array로 구성
        for (int i=0 ; i < listcnt ; i++) {
            temparr.append("##");
            temparr.append(Util.checkString(req.getParameter("empno"+i)));                                    //사원번호+
            temparr.append("01".equals(Util.checkString(req.getParameter("busn_check"+i)))    ? "&&01" : ""); //영업수당+
            temparr.append("02".equals(Util.checkString(req.getParameter("rslt_check"+i)))    ? "&&02" : ""); //성과수당+
            temparr.append("03".equals(Util.checkString(req.getParameter("dcl_amt_check"+i))) ? "&&03" : ""); //직수수당+
            temparr.append("04".equals(Util.checkString(req.getParameter("spc_check"+i)))     ? "&&04" : ""); //특별수당+
            temparr.append("05".equals(Util.checkString(req.getParameter("posi_check"+i)))    ? "&&05" : ""); //직급수당+
            temparr.append("06".equals(Util.checkString(req.getParameter("prsnt_check"+i)))   ? "&&06" : ""); //출근수당+
            temparr.append("07".equals(Util.checkString(req.getParameter("camp_check"+i)))    ? "&&07" : ""); //캠페인수당+
            temparr.append("08".equals(Util.checkString(req.getParameter("cash_check"+i)))    ? "&&08" : ""); //현금수당+
            temparr.append("09".equals(Util.checkString(req.getParameter("advn_check"+i)))    ? "&&09" : ""); //가지급금+

            empalonkindarr.append(temparr);  //전체 구성 Array에 Append
            temparr = new StringBuffer("");  //초기화
        }

        empalonkindarr.delete(0,2);          //처음 ## 제거

        // DM 값을 Setting한다.
        PS_A_BOEMP_ALONKINDDM dm = new PS_A_BOEMP_ALONKINDDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //입력사원번호
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setEmpalonkindarr(empalonkindarr.toString());                                                      //사원,수당종류 Array

        PSAllow1101EJBHome home = (PSAllow1101EJBHome)JNDIManager.getInstance().getHome("PSAllow1101EJB");
        try{
            PSAllow1101EJB ejb = home.create();
            ds = ejb.accessBoemp_AlonKind(dm);             // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                    // request에 결과값을 담는다.
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