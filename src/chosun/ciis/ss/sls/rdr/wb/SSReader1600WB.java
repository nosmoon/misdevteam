/***************************************************************************************************
 * 파일명   : SSReader1600WB.java
 * 기  능   : 독자현황-독자등급부여를 위한 WB
 * 작성일자 : 2004-04-22
 * 작성자   : 김대섭
 ****************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 독자인증통합에 따른 판매출판 일괄변경
 * 수정자   : 김대섭
 * 수정일자 : 2005-02-22
 * 백  업   :
 ****************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 독자인증신청현황 추가 및 기존코드 코멘트 처리
 * 수정자 : 김대섭
 * 수정일자 : 2005-05-04
 * 백  업   :
 ****************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;

/*
 * 독자현황-독자등급부여를 위한 WB
 */
public class SSReader1600WB {

    /**
     * 독자등급관리 등급신청내역을 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
/*
    public void selectGradAplcList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_RDRCRTS_GRAD_APLCDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //지국지사코드
        String callpgclsf = "SS";                                                                             //호출페이지구분
        String sh_aplcdt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcdt_fr")));               //신청시작일자
        String sh_aplcdt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcdt_to")));               //신청종료일자
        String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));                     //매체코드
        String sh_rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_no")));                     //독자번호
        String sh_rdr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdr_nm")));                     //독자명
// 20050222 김대섭 수정(판매출판 일괄변경)
        String sh_apl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_apl_nm")));                     //신청자명

        String sh_prn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn1")));                         //주민번호1
        String sh_prn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_prn2")));                         //주민번호2
        String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));                     //전화번호1
        String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));                     //전화번호2
        String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));                     //전화번호3
        String sh_dtlsprocstat = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dtlsprocstat")));         //상세처리상태
        String sh_dtlsprocclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dtlsprocclsf")));         //상세처리구분
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        CO_L_RDRCRTS_GRAD_APLCDM dm = new CO_L_RDRCRTS_GRAD_APLCDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setCallpgclsf(callpgclsf);
        dm.setSh_aplcdt_fr(sh_aplcdt_fr);
        dm.setSh_aplcdt_to(sh_aplcdt_to);
        dm.setSh_medicd(sh_medicd);
        dm.setSh_rdr_no(sh_rdr_no);
        dm.setSh_rdr_nm(sh_rdr_nm);
        dm.setSh_apl_nm(sh_apl_nm);
        dm.setSh_prn1(sh_prn1);
        dm.setSh_prn2(sh_prn2);
        dm.setSh_phone1(sh_phone1);
        dm.setSh_phone2(sh_phone2);
        dm.setSh_phone3(sh_phone3);
        dm.setSh_dtlsprocstat(sh_dtlsprocstat);
        dm.setSh_dtlsprocclsf(sh_dtlsprocclsf);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSReader1600EJBHome home = (SSReader1600EJBHome) JNDIManager.getInstance().getHome("SSReader1600EJB");
        try {

            SSReader1600EJB ejb = home.create();
            ds = ejb.selectGradAplcList(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 독자등급관리 등급신청내역을 저장한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
/*
    public void updateGradAplcGrnt(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_U_RDRCRTS_GRAD_GRNTDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String listcntstr = Util.checkString(req.getParameter("listcnt"));                                    //총 레코드 카운트
        if (listcntstr.equals(""))   listcntstr = "0";
        long   listcnt = Long.parseLong(listcntstr);

        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //지국지사코드
        String callpgclsf = "SS";                                                                             //호출페이지구분

		StringBuffer onlmembseqarr	= new StringBuffer("");  												 //온라인회원일련번호 Array
        StringBuffer regdtarr       = new StringBuffer("");                                                  //신청일자 Array
        StringBuffer regnoarr       = new StringBuffer("");                                                  //신청번호 Array
        StringBuffer bocdarr        = new StringBuffer("");                                                  //지국지사코드 Array
        StringBuffer medicdarr      = new StringBuffer("");                                                  //매체코드 Array
        StringBuffer rdr_noarr      = new StringBuffer("");                                                  //독자번호 Array
        StringBuffer rdrgradarr  	= new StringBuffer("");                                                  //비교등급 Array
        StringBuffer dtlsprocstatarr= new StringBuffer("");                                                  //상세처리상태 Array
        StringBuffer errresncdarr   = new StringBuffer("");                                                  //오류사유 Array
        StringBuffer chkseqarr      = new StringBuffer("");                                                  //체크순번 Array

        //String Array로 구성
        for (int i=0 ; i < listcnt ; i++) {
        	if ("SEL".equals(Util.checkString(req.getParameter("grad_check"+i)))) {
        		onlmembseqarr.append("##");
        		onlmembseqarr.append(Util.checkString(req.getParameter("onlmembseq"+i)));                    //온라인회원일련번호

				regdtarr.append("##");
        		regdtarr.append(Util.checkString(req.getParameter("aplcdt"+i)));                             //신청일자

        		regnoarr.append("##");
        		regnoarr.append(Util.checkString(req.getParameter("aplcno"+i)));                             //신청번호

        		bocdarr.append("##");
        		bocdarr.append(Util.checkString(req.getParameter("bocd"+i)));                                //지국지사코드

        		medicdarr.append("##");
        		medicdarr.append(Util.checkString(req.getParameter("medicd"+i)));                            //매체코드

        		rdr_noarr.append("##");
        		rdr_noarr.append(Util.checkString(req.getParameter("rdr_no"+i)));                            //독자번호

        		rdrgradarr.append("##");
        		rdrgradarr.append(Util.checkString(req.getParameter("rdrgrad"+i)));                      	 //비교등급

        		dtlsprocstatarr.append("##");
        		dtlsprocstatarr.append(Util.checkString(req.getParameter("dtlsprocstat"+i)));                //상세처리상태

        		chkseqarr.append("##");
        		chkseqarr.append(Util.checkString(req.getParameter("chkseq"+i)));                            //체크순번

        		errresncdarr.append("##");
        		errresncdarr.append(Util.checkString(req.getParameter("errresncd"+i)));                         //체크순번
        	}
        }

        onlmembseqarr.delete(0,2);      //처음 ## 제거
        regdtarr.delete(0,2);          	//처음 ## 제거
        regnoarr.delete(0,2);          	//처음 ## 제거
        bocdarr.delete(0,2);            //처음 ## 제거
        medicdarr.delete(0,2);          //처음 ## 제거
        rdr_noarr.delete(0,2);          //처음 ## 제거
        rdrgradarr.delete(0,2);     	//처음 ## 제거
        dtlsprocstatarr.delete(0,2);    //처음 ## 제거
        chkseqarr.delete(0,2);          //처음 ## 제거
        errresncdarr.delete(0,2);          //처음 ## 제거

        //DM 값을 Setting한다.
        CO_U_RDRCRTS_GRAD_GRNTDM dm = new CO_U_RDRCRTS_GRAD_GRNTDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setCallpgclsf(callpgclsf);
		dm.setOnlmembseqarr(onlmembseqarr.toString());
        dm.setRegdtarr(regdtarr.toString());
        dm.setRegnoarr(regnoarr.toString());
        dm.setBocdarr(bocdarr.toString());
        dm.setMedicdarr(medicdarr.toString());
        dm.setRdr_noarr(rdr_noarr.toString());
        dm.setRdrgradarr(rdrgradarr.toString());
        dm.setDtlsprocstatarr(dtlsprocstatarr.toString());
        dm.setChkseqarr(chkseqarr.toString());
        dm.setErrresncdarr(errresncdarr.toString());


        SSReader1600EJBHome home = (SSReader1600EJBHome) JNDIManager.getInstance().getHome("SSReader1600EJB");
        try {

            SSReader1600EJB ejb = home.create();
            ds = ejb.updateGradAplcGrnt(dm); // 설정된 dm값으로 EJB를 호출한다.
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
     * 독자등급부여 독자비교대상을 조회한다
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
/*
    public void selectAplcCmprList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_RDRCRTS_APLC_CMPRDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));                               //지국지사코드
        String callpgclsf = "SS";                                                                             //호출페이지구분
        String sh_searcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_searcd")));                     //검색구분코드
        if (sh_searcd.equals(""))   sh_searcd = "NO";                                                         //검색구분코드가 없을경우 DEFAULT로 독자번호
        String sh_searnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_searnm")));                     //검색어
        String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));                     //매체코드
        String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));                     //전화번호1
        String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));                     //전화번호2
        String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));                     //전화번호3
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        CO_L_RDRCRTS_APLC_CMPRDM dm = new CO_L_RDRCRTS_APLC_CMPRDM();

        dm.setCmpycd(cmpycd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setCallpgclsf(callpgclsf);
        dm.setSh_searcd(sh_searcd);
        dm.setSh_searnm(sh_searnm);
        dm.setSh_medicd(sh_medicd);
        dm.setSh_phone1(sh_phone1);
        dm.setSh_phone2(sh_phone2);
        dm.setSh_phone3(sh_phone3);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSReader1600EJBHome home = (SSReader1600EJBHome) JNDIManager.getInstance().getHome("SSReader1600EJB");
        try {

            SSReader1600EJB ejb = home.create();
            ds = ejb.selectAplcCmprList(dm); // 설정된 dm값으로 EJB를 호출한다.
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


/* 2005-05-04 김대섭 추가 */
    /**
     * 독자인증신청-초기화면
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void initRdrCrts(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_RDRCRTS_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_RDRCRTS_INITDM dm = new SS_L_RDRCRTS_INITDM();

        SSReader1600DAO dao = new SSReader1600DAO();
        ds = dao.initRdrCrts(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1600EJBHome home = (SSReader1600EJBHome) JNDIManager.getInstance().getHome("SSReader1600EJB");
        try {
            SSReader1600EJB ejb = home.create();
            ds = ejb.initRdrCrts(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * 독자인증신청-목록
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     **/
    public void selectRdrCrtsList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_RDRCRTSDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String membnm = Util.Uni2Ksc(Util.checkString(req.getParameter("membnm")));
        String prn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prn1")));
        String prn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prn2")));
        String telno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno1")));
        String telno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno2")));
        String telno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno3")));
        String dtlsprocstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsprocstatcd")));
        String errresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("errresncd")));
        String recstat = Util.checkString(req.getParameter("recstat"));
        String mblestat = Util.checkString(req.getParameter("mblestat"));
        String mblenonrsmgcd = Util.checkString(req.getParameter("mblenonrsmgcd"));
        String ireader_stat = Util.checkString(req.getParameter("ireader_stat"));
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);


        // DM Setting
        SS_L_RDRCRTSDM dm = new SS_L_RDRCRTSDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setMembnm(membnm);
        dm.setPrn1(prn1);
        dm.setPrn2(prn2);
        dm.setTelno1(telno1);
        dm.setTelno2(telno2);
        dm.setTelno3(telno3);
        dm.setDtlsprocstatcd(dtlsprocstatcd);
        dm.setErrresncd(errresncd);
        dm.setRecstat(recstat);
        dm.setMblestat(mblestat);
        dm.setMblenonrsmgcd(mblenonrsmgcd);
        dm.setIreader_stat(ireader_stat);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSReader1600DAO dao = new SSReader1600DAO();
        ds = dao.selectRdrCrtsList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1600EJBHome home = (SSReader1600EJBHome) JNDIManager.getInstance().getHome("SSReader1600EJB");
        try {
            SSReader1600EJB ejb = home.create();
            ds = ejb.selectRdrCrtsList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

}
