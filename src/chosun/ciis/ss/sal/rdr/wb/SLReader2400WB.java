/**************************************************************************************************
* 파일명    : SLReader2400WB.java
* 기능      : 독자-VacationStop관리를 위한 Worker Bean
* 작성일자  : 2004-01-20
* 작성자    : 김영윤
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/
package chosun.ciis.ss.sal.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.dao.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;

/**
 * 독자-VacationStop관리를 위한 Worker Bean
 */
public class SLReader2400WB {
    /**
     * VacationStop관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void initVS(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_VS_INITDataSet ds = null;
        // 지국지사코드를 WB 의 세션에서
        String bocd = Util.getSessionParameterValue(req, "bocd", true); //지국지사코드

        // parameter requesting 하고  DM에 값을 Setting
        SL_L_VS_INITDM dm = new SL_L_VS_INITDM();
        dm.setBocd(bocd);
        
        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.initVS(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_L_VS_INITDataSet ds = null;
            ds = ejb.initVS(dm);          // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds);     // request에 결과값을 Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * VacationStop관리-목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVSList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_VSDataSet ds = null;
        // 지국지사코드를 WB 의 세션에서
        String bocd = Util.getSessionParameterValue(req, "bocd", true); //지국지사코드

        // parameter requesting 하고  DM에 값을 Setting
        String workflag = Util.checkString(req.getParameter("workflag"));
        String clsfcd = Util.checkString(req.getParameter("clsfcd"));
        String bocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfmyn")));
        String ing = Util.Uni2Ksc(Util.checkString(req.getParameter("ing")));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        SL_L_VSDM dm = new SL_L_VSDM();
        dm.setBocd(bocd);
        dm.setWorkflag(workflag);
        dm.setClsfcd(clsfcd);
        dm.setBocnfmyn(bocnfmyn);
        dm.setIng(ing);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        
        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.selectVSList(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_L_VSDataSet ds = null;
            ds = ejb.selectVSList(dm);          // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds);     // request에 결과값을 Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * VacationStop관리-상세보기
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVSDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_VSDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        SL_S_VSDM dm = new SL_S_VSDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.selectVSDetail(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_S_VSDataSet ds = null;
            ds = ejb.selectVSDetail(dm);          // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds);     // request에 결과값을 Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * VacationStop관리-휴가지배달지역 목록조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVSAreaRegn(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_VS_AREANMDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));

        SL_L_VS_AREANMDM dm = new SL_L_VS_AREANMDM();
        dm.setVaca_arearegncd(vaca_arearegncd);

        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.selectVSAreaRegn(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_L_VS_AREANMDataSet ds = null;
            ds = ejb.selectVSAreaRegn(dm);          // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds);     // request에 결과값을 Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * VacationStop관리-휴가지배달지역 지국명,지국전화번호 상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVSBODetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_VS_AREABODataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
        String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));

        SL_S_VS_AREABODM dm = new SL_S_VS_AREABODM();
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setVaca_areacd(vaca_areacd);

        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.selectVSBODetail(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_S_VS_AREABODataSet ds = null;
            ds = ejb.selectVSBODetail(dm);          // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds);     // request에 결과값을 Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * VacationStop관리-입력,수정,삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void accessVS(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_VSDataSet ds = null;
        // 지국지사코드를 WB 의 세션에서
        String bocd = Util.getSessionParameterValue(req, "bocd", true); //지국지사코드

        // parameter requesting 하고  DM에 값을 Setting
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);												// 변경자(로그인아이디) : 단일
        String accflag = Util.checkString(req.getParameter("accflag"));                                                 // 처리구분(I:입력, U:수정, D:삭제)
        String userflag = Util.checkString(req.getParameter("userflag"));                                               // 사용자구분(10:독자, 20:지국지사(본), 30:지국지사(휴가지) 40:독자서비스센타)
        String regdt = Util.checkString(req.getParameter("regdt"));                                                     // 등록일자
        String regno = Util.checkString(req.getParameter("regno"));                                                     // 등록번호
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));                                                   // 독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));                                                   // 매체코드
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));                                       // 독자명
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));                                           // 독자전화번호1
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));                                           // 독자전화번호2
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));                                           // 독자전화번호3
        String dlvzip = Util.checkString(req.getParameter("dlvzip"));                                                   // 배달지우편번호
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));                                   // 배달지주소
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));                           // 배달지상세주소
        String qty = Util.checkString(req.getParameter("qty"));                                                         // 부수
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));                                           // 신청경로코드
        String clsfcd = Util.checkString(req.getParameter("clsfcd"));                                                   // 구분코드(서비스구분: 10:V-Stop, 20:V-Stop+휴가지배달, 30:V-Stop+특정일배달)
        String suspfrdt = Util.checkString(req.getParameter("suspfrdt"));                                               // 중지시작일자
        String susptodt = Util.checkString(req.getParameter("susptodt"));                                               // 중지종료일자
        String bgnmappli = Util.checkString(req.getParameter("bgnmappli"));                                             // 시작월분
        String endmappli = Util.checkString(req.getParameter("endmappli"));                                             // 종료월분
        String spcfdlvdt = Util.checkString(req.getParameter("spcfdlvdt"));                                             // 특정배달일자
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                                         // 비고
        String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));                                         // 독자휴대폰번호1
        String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));                                         // 독자휴대폰번호2
        String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));                                         // 독자휴대폰번호3
        String vaca_areadlvfrdt = Util.checkString(req.getParameter("vaca_areadlvfrdt"));                               // 휴가지배달시작일자
        String vaca_areadlvtodt = Util.checkString(req.getParameter("vaca_areadlvtodt"));                               // 휴가지배달종료일자
        String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));                                 // 휴가지권역코드
        String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));                                         // 휴가지코드
        String vaca_areazip = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areazip")));                         // 휴가지우편번호
        String vaca_areaaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areaaddr")));                       // 휴가지주소
        String vaca_areadtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadtlsaddr")));               // 휴가지상세주소
        String vaca_areabocd = Util.checkString(req.getParameter("vaca_areabocd"));                                     // 휴가지지국지사코드
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));                                               // 지국확인
        String boremk = Util.Uni2Ksc(Util.checkString(req.getParameter("boremk")));                                     // 지국비고
        String vaca_areadlvofficnfmyn = Util.checkString(req.getParameter("vaca_areadlvofficnfmyn"));                   // 휴가지배달지국확인
        String vaca_areadlvoffiremk = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadlvoffiremk")));         // 휴가지배달지국비고

        SL_A_VSDM dm = new SL_A_VSDM();

        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setUserflag(userflag);
        dm.setRegdt(regdt);
        dm.setRegno(regno);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setBocd(bocd);
        dm.setDlvzip(dlvzip);
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setQty(qty);
        dm.setAplcpathcd(aplcpathcd);
        dm.setClsfcd(clsfcd);
        dm.setSuspfrdt(suspfrdt);
        dm.setSusptodt(susptodt);
        dm.setBgnmappli(bgnmappli);
        dm.setEndmappli(endmappli);
        dm.setSpcfdlvdt(spcfdlvdt);
        dm.setRemk(remk);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setVaca_areadlvfrdt(vaca_areadlvfrdt);
        dm.setVaca_areadlvtodt(vaca_areadlvtodt);
        dm.setVaca_arearegncd(vaca_arearegncd);
        dm.setVaca_areacd(vaca_areacd);
        dm.setVaca_areazip(vaca_areazip);
        dm.setVaca_areaaddr(vaca_areaaddr);
        dm.setVaca_areadtlsaddr(vaca_areadtlsaddr);
        dm.setVaca_areabocd(vaca_areabocd);
        dm.setBocnfmyn(bocnfmyn);
        dm.setBoremk(boremk);
        dm.setVaca_areadlvofficnfmyn(vaca_areadlvofficnfmyn);
        dm.setVaca_areadlvoffiremk(vaca_areadlvoffiremk);

        SLReader2400DAO dao = new SLReader2400DAO();
        ds = dao.accessVS(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 Binding
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader2400EJBHome home = (SLReader2400EJBHome)JNDIManager.getInstance().getHome("SLReader2400EJB");
        try{
            SLReader2400EJB ejb = home.create();
            SL_A_VSDataSet ds = null;
            ds = ejb.accessVS(dm);          // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds);     // request에 결과값을 Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
}
