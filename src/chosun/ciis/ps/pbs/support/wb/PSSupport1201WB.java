/***************************************************************************************************
 * 파일명   : PSSupport1201WB.java
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
 * 불편접수-불편처리
 */
public class PSSupport1201WB {
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
     * 불편접수된 내역을 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_L_DSCT_CATLDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //지국지사코드

        String kubun = Util.checkString(req.getParameter("kubun"));
        String datefrom = Util.checkString(req.getParameter("datefrom"));
        String dateto = Util.checkString(req.getParameter("dateto"));
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));
        String curr_page_no = req.getParameter("curr_page_no"); // 현재페이지
        String records_per_page = req.getParameter("records_per_page"); // 페이지당 Row수

        int iPageSize = Integer.parseInt(records_per_page); // 페이지당 Row수 int로 변환
        int iPageNo = 1; // 최초 페이지 1로 설정
        if (curr_page_no != null && !curr_page_no.equals("")) { // 페이지 값이 있으면 재설정
            iPageNo = Integer.parseInt(curr_page_no);
        }

        PS_L_DSCT_CATLDM dm = new PS_L_DSCT_CATLDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setKubun(kubun);
        dm.setDatefrom(datefrom);
        dm.setDateto(dateto);
        dm.setDscttypecd(dscttypecd);
        dm.setBoprocyn(boprocyn);
        dm.setPageno(iPageNo);
        dm.setPagesize(iPageSize);

        PSSupport1201EJBHome home = (PSSupport1201EJBHome) JNDIManager.getInstance().getHome("PSSupport1201EJB");
        try {

            PSSupport1201EJB ejb = home.create();

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
     * 불편접수를 확인 및 처리한다.
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void updateDsct(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_A_DSCTDataSet ds = null;

        //사용자 세션정보
        String bocd = Util.getSessionParameterValue(req, "cmpycd", true); //지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //입력자아이디

        String accflag = Util.checkString(req.getParameter("accflag"));
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));
        String proccont = Util.Uni2Ksc(Util.checkString(req.getParameter("boproccont")));
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));
        String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));

        PS_A_DSCTDM dm = new PS_A_DSCTDM(); // DM 값을 Setting한다.

        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setRegdt(regdt);
        dm.setRegno(regno);
        dm.setProccont(proccont);
        dm.setBoprocyn(boprocyn);
        dm.setProcpers(procpers);

        PSSupport1201EJBHome home = (PSSupport1201EJBHome) JNDIManager.getInstance().getHome("PSSupport1201EJB");
        try {

            PSSupport1201EJB ejb = home.create();

            ds = ejb.updateDsct(dm); // 설정된 dm값으로 EJB를 호출한다.

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
     * 불만접수 상세내역 보기
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectDsctDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        PS_S_DSCT_CATLDataSet ds = null;

        //사용자 세션정보
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); //지국지사코드

        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        PS_S_DSCT_CATLDM dm = new PS_S_DSCT_CATLDM(); // DM 값을 Setting한다.

        dm.setCmpycd(cmpycd);
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        PSSupport1201EJBHome home = (PSSupport1201EJBHome) JNDIManager.getInstance().getHome("PSSupport1201EJB");
        try {

            PSSupport1201EJB ejb = home.create();

            ds = ejb.selectDsctDetail(dm); // 설정된 dm값으로 EJB를 호출한다.

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
    * 불편접수를 확인 및 처리한다.
    * 조회된 request값을 set한다.
    * @param HttpServletRequest req
    * @param HttpServletResponse res
    * @return void
    */
   public void updateBranchDsct(HttpServletRequest req, HttpServletResponse res) throws AppException {
       PS_U_DSCTDataSet ds = null;

       //사용자 세션정보
       String bocd = Util.getSessionParameterValue(req, "cmpycd", true);    //지국지사코드
       String incmgpers = Util.getSessionParameterValue(req, "uid", true);  //입력자아이디

       String regdt = Util.checkString(req.getParameter("regdt"));          //등록일자
       String regno = Util.checkString(req.getParameter("regno"));          //등록번호
       String rdrbocd = Util.checkString(req.getParameter("rdrbocd"));      //해당지사
       String rdr_no = Util.checkString(req.getParameter("rdr_no"));        //독자번호
       String medicd =  Util.checkString(req.getParameter("medicd"));       //매체코드
       String termsubsno =  Util.checkString(req.getParameter("termsubsno"));   //독자번호

       String boproccont = Util.Uni2Ksc(Util.checkString(req.getParameter("boproccont")));  //처리내용
       String boprocyn = Util.checkString(req.getParameter("boprocyn"));                    //처리여부
       String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));                    //등록자

       PS_U_DSCTDM dm = new PS_U_DSCTDM(); // DM 값을 Setting한다.

       dm.setRegdt(regdt);
       dm.setRegno(regno);
       dm.setRdrbocd(rdrbocd);
       dm.setRdr_no(rdr_no);
       dm.setMedicd(medicd);
       dm.setTermsubsno(termsubsno);

       dm.setBoproccont(boproccont);
       dm.setBoprocyn(boprocyn);
       dm.setProcpers(procpers);
       dm.setIncmgpers(incmgpers);

       PSSupport1201EJBHome home = (PSSupport1201EJBHome) JNDIManager.getInstance().getHome("PSSupport1201EJB");
       try {

           PSSupport1201EJB ejb = home.create();

           ds = ejb.updateBranchDsct(dm); // 설정된 dm값으로 EJB를 호출한다.

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