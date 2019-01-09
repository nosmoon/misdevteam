/***************************************************************************************************
 * 파일명   : PSAllow1701WB.java
 * 기  능   : Servlet에서 받은 parameter를 이용하여 dm을 set하고 EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 * 작성일자 : 2004-01-14
 * 작성자   : 김건호
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

/**
 * 수당-캠페인관리
 */
public class PSAllow1701WB{

    /**
     * 조회화면에 사용되는 코드값을 가져온다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
      */
     public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
         PS_S_EMP_ALON_BASEDataSet ds = null;

         //로그인 사용자 세션정보
         String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
         String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

         PS_S_EMP_ALON_BASEDM dm = new PS_S_EMP_ALON_BASEDM();      // DM 값을 Setting한다.

         dm.setCmpycd(cmpycd);
         dm.setIncmgpers(incmgpers);

         PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
         try{

             PSAllow1701EJB ejb = home.create();

             ds = ejb.selectCodeList(dm); // 설정된 dm값으로 EJB를 호출한다.

             req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
     * 캠페인 저장을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void insertCampAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_I_BO_CMPDataSet ds = null;

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));                           //지국지사코드
        String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));                           //캠페인명
        String bgncampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgncampdt")));                     //캠페인시작일자
        String endcampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("endcampdt")));                     //캠페인종료일자
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));                               //내용

        //DM 값을 Setting한다.
        PS_I_BO_CMPDM dm = new PS_I_BO_CMPDM();

        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //입력사원번호
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setCampnm(campnm);                                                                                 //캠페인명
        dm.setBgncampdt(bgncampdt);                                                                           //캠페인시작일자
        dm.setEndcampdt(endcampdt);                                                                           //캠페인종료일자
        dm.setCont(cont);                                                                                     //내용

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.insertCampAlon(dm);                // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                 // request에 결과값을 담는다.
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
     * 캠페인 검색을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCampAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_CAMP_SEARCHDataSet ds = null;

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("slt_asinbocd")));                           //지국지사코드
        String sh_bgncampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_bgncampdt")));               //캠페인시작일자
        String sh_endcampdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_endcampdt")));               //캠페인종료일자
        String sh_campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_campnm")));                     //캠페인명
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "15";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        PS_L_CAMP_SEARCHDM dm = new PS_L_CAMP_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                   //지국지사코드
        dm.setIncmgpers(incmgpers);
        dm.setBocd(bocd);
        dm.setSh_bgncampdt(sh_bgncampdt);                                                                     //캠페인시작일자
        dm.setSh_endcampdt(sh_endcampdt);                                                                     //캠페인종료일자
        dm.setSh_campnm(sh_campnm);                                                                           //캠페인명
        dm.setPageno(pageno);                                                                                 //현재페이지
        dm.setPagesize(pagesize);                                                                             //페이지당 보여줄 건수

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.selectCampAlon(dm);                // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                 // request에 결과값을 담는다.
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
     * 캠페인 삭제를 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void deleteCampAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_D_CAMP_PTCRDataSet ds = null;

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적으로 Request로 받을 파라메터
        String checkcntstr = Util.checkString(req.getParameter("checkcnt"));                                  //총 레코드 카운트
        if (checkcntstr.equals(""))   checkcntstr = "0";
        long   checkcnt = Long.parseLong(checkcntstr);
        StringBuffer campseqarr = new StringBuffer("");                                                       //사원,수당종류 Array
        StringBuffer campbocdarr = new StringBuffer("");                                                      //지국지사 Array

        //캠페인일련번호 String Array로 구성
        for (int i=0 ; i < checkcnt ; i++) {
            campseqarr.append("##");                                                                          //구분자+
            campseqarr.append(Util.checkString(req.getParameter("camp_check"+i)));                            //캠페인일련번호+
            campbocdarr.append("##");                                                                          //구분자+
            campbocdarr.append(Util.checkString(req.getParameter("camp_bocd"+i)));                            //지국지사+

        }

        campseqarr.delete(0,2);          //처음 ## 제거
        campbocdarr.delete(0,2);         //처음 ## 제거

        //DM 값을 Setting한다.
        PS_D_CAMP_PTCRDM dm = new PS_D_CAMP_PTCRDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setCambocdarr(campbocdarr.toString());
        dm.setCampseqarr(campseqarr.toString());

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.deleteCampAlon(dm);                // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                 // request에 결과값을 담는다.
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
     * 캠페인 상세내역 정보를 구하기 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectCampaign(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_S_CAMPAIGNDataSet ds = null;

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                         //지국지사코드
        String campseq = Util.Uni2Ksc(Util.checkString(req.getParameter("campseq")));                         //캠페인일련번호

        //DM 값을 Setting한다.
        PS_S_CAMPAIGNDM dm = new PS_S_CAMPAIGNDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);                                                                           //입력사원번호
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setCampseq(campseq);                                                                               //캠페인일련번호

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.selectCampaign(dm);                // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                 // request에 결과값을 담는다.
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
     * 사원캠페인 수당 검색을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectEmpCampaign(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_EMPCAMP_SEARCHDataSet ds = null;

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                              //지국지사코드
        String campseq = Util.Uni2Ksc(Util.checkString(req.getParameter("campseq")));                         //캠페인일련번호
        String sh_boemp_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_boemp_no1")));               //검색사원번호1
        String sh_boemp_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_boemp_no2")));               //검색사원번호2
        String sh_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));                        //검색부서코드
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "10";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        PS_L_EMPCAMP_SEARCHDM dm = new PS_L_EMPCAMP_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                 //출판회사코드
        dm.setIncmgpers(incmgpers);                                                                           //입력사원번호
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setCampseq(campseq);                                                                               //캠페인일련번호
        dm.setSh_boemp_no1(sh_boemp_no1);                                                                     //검색사원번호1
        dm.setSh_boemp_no2(sh_boemp_no2);                                                                     //검색사원번호2
        dm.setSh_deptcd(sh_deptcd);                                                                           //검색부서코드
        dm.setPageno(pageno);                                                                                 //현재페이지
        dm.setPagesize(pagesize);                                                                             //페이지당 보여줄 건수

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.selectEmpCampaign(dm);                // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                 // request에 결과값을 담는다.
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
     * 사원캠페인 수당 등록을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void insertEmpCampAlon(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_A_EMPCAMP_ALONDataSet ds = null;

        //로그인 사용자 세션정보
        String cmpycd =  Util.getSessionParameterValue(req, "cmpycd", true);           //출판회사코드
        String incmgpers =  Util.getSessionParameterValue(req, "uid", true);           //입력자아이디

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                              //지국지사코드
        String campseq = Util.Uni2Ksc(Util.checkString(req.getParameter("campseq")));                         //캠페인일련번호

        String checkcntstr = Util.checkString(req.getParameter("checkcnt"));                                  //총 레코드 카운트
        if (checkcntstr.equals(""))   checkcntstr = "0";
        long   checkcnt = Long.parseLong(checkcntstr);

        StringBuffer boemparr = new StringBuffer("");                                                    //사원,캠페인수당 Array
        StringBuffer bocdarr = new StringBuffer("");                                                     //사원,캠페인수당 Array
        StringBuffer amtarr = new StringBuffer("");                                                      //사원,캠페인수당 Array

        //캠페인일련번호 String Array로 구성
        for (int i=0 ; i < checkcnt ; i++) {
            boemparr.append("##");                                                                       //구분자+
            boemparr.append(Util.checkString(req.getParameter("keyboemp_no"+i)));                        //지국지사사원번호+
            amtarr.append("##");                                                                         //구분자+
            amtarr.append(Util.checkString(req.getParameter("amt"+i)));                                  //캠페인수당 건당금액+
            bocdarr.append("##");                                                                        //구분자+
            bocdarr.append(Util.checkString(req.getParameter("keybocd_no"+i)));                          //지국지사코드+
        }

        boemparr.delete(0,2);          //처음 ## 제거
        amtarr.delete(0,2);            //처음 ## 제거
        bocdarr.delete(0,2);           //처음 ## 제거

        //DM 값을 Setting한다.
        PS_A_EMPCAMP_ALONDM dm = new PS_A_EMPCAMP_ALONDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);                                                                           //입력사원번호
        dm.setBocd(bocd);                                                                                     //지국지사코드
        dm.setCampseq(campseq);                                                                               //캠페인일련번호
        dm.setBoemparr(boemparr.toString());                                                      //사원별캠페인수당배열
        dm.setBocdarr(bocdarr.toString());                                                      //사원별캠페인수당배열
        dm.setAmtarr(amtarr.toString());                                                      //사원별캠페인수당배열

        PSAllow1701EJBHome home = (PSAllow1701EJBHome)JNDIManager.getInstance().getHome("PSAllow1701EJB");
        try{
            PSAllow1701EJB ejb = home.create();
            ds = ejb.insertEmpCampAlon(dm);                // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                 // request에 결과값을 담는다.
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
