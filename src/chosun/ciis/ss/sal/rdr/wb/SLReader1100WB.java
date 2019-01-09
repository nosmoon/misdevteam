/**************************************************************************************************
* 파일명    : SLReader1000WB.java
* 기능      : Servlet에서 받은 parameter를 이용하여 dm을 set하고
*             EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
* 작성일자  : 2003-11-20
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
 * 독자-독자정보관리
 */
public class SLReader1100WB{

    /**
     * 독자정보관리(독자정보 초기화)
     * 독자정보관리 화면에 사용되는 코드값을 가져온다. (독자정보 및 구독정보 초기화)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_E_READERINIDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String sBocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        SL_E_READERINIDM dm = new SL_E_READERINIDM();

        dm.setBocd(sBocd); // 지국지사코드
        
        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectCodeList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_E_READERINIDataSet ds = null;
            ds = ejb.selectCodeList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(저장(독자추가))
     * 독자추가( 확장정보, 독자신상정보, 신문구독계약정보, 판촉물정보 생성 )
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void insertReader(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_I_READERDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd 			= Util.getSessionParameterValue(req, "bocd", true);		                //지국지사코드
        String incmgpers 		= Util.getSessionParameterValue(req, "uid", true);                      //입력자아이디
        String paty_clsfcd 		= Util.checkString(req.getParameter("paty_clsfcd"));                    //단체구분코드(독자정보)
        String rdrnm 			= Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));            //독자명(독자정보)
        String prn 				= Util.checkString(req.getParameter("prn"));                            //주민등록번호(독자정보)
        String ernno 			= Util.checkString(req.getParameter("ernno"));                          //사업자등록번호(독자정보)
        String email 			= Util.Uni2Ksc(Util.checkString(req.getParameter("email")));            //이메일(독자정보)
        String weddanvydt 		= Util.checkString(req.getParameter("weddanvydt"));                     //결혼기념일(독자정보)
        String bidt 			= Util.checkString(req.getParameter("bidt"));                           //생년월일(독자정보)
        String lusoclsfcd 		= Util.checkString(req.getParameter("lusoclsfcd"));                     //음력양력구분(독자정보)
        String remk 			= Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));             //비고(독자정보)
        String aplcpathcd 		= "20";                                                                 //신청경로코드(확장정보)
        String rdr_extntypecd 	= Util.checkString(req.getParameter("rdr_extntypecd"));                 //확장유형코드(확장정보)
        String extnblngcd 		= Util.checkString(req.getParameter("extnblngcd"));                     //확장자소속코드(확장정보)
        String empclsfcd 		= Util.checkString(req.getParameter("empclsfcd"));                      //사원구분코드(확장정보)
        String empdeptcd 		= Util.checkString(req.getParameter("empdeptcd"));                      //사원부서코드(확장정보)
        String empdeptnm 		= Util.Uni2Ksc(Util.checkString(req.getParameter("empdeptnm")));        //사원부서명(확장정보)
        String empseq 			= Util.checkString(req.getParameter("empseq"));                         //사원번호(확장정보)
        String bodutycd 		= Util.checkString(req.getParameter("bodutycd"));                       //지국직책코드(확장정보)
        String boposicd 		= Util.checkString(req.getParameter("boposicd"));                       //지국직급코드(확장정보)
        String stafclsfcd 		= Util.checkString(req.getParameter("stafclsfcd"));                     //요원구분코드(확장정보)
        String stafno 			= Util.checkString(req.getParameter("stafno"));                         //요원번호(확장정보)
        String boemp_no 		= Util.checkString(req.getParameter("boemp_no"));                       //지국지사사원번호(확장정보)
        String extnid 			= Util.checkString(req.getParameter("extnid"));                         //확장자아이디(확장정보)(독자우대홈페이지 아이디)
        String extnflnm 		= Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));         //확장자 성명(확장정보)
        String extntel1 		= Util.checkString(req.getParameter("extntel1"));                       //확장자전화번호 DDD(확장정보)
        String extntel2 		= Util.checkString(req.getParameter("extntel2"));                       //확장자전화번호 국(확장정보)
        String extntel3 		= Util.checkString(req.getParameter("extntel3"));                       //확장자전화번호 번호(확장정보)
        String extnptph_no1 	= Util.checkString(req.getParameter("extnptph_no1"));                   //확장자휴대폰번호 이통사번호(확장정보)
        String extnptph_no2 	= Util.checkString(req.getParameter("extnptph_no2"));                   //확장자휴대폰번호 국(확장정보)
        String extnptph_no3 	= Util.checkString(req.getParameter("extnptph_no3"));                   //확장자휴대폰번호 번호(확장정보)
        String extnprn 			= Util.checkString(req.getParameter("extnprn"));                        //확장자 주민등록번호(확장정보)
        String deptcd 			= Util.checkString(req.getParameter("deptcd"));                         //(!주의)(해당지국의)부서코드(확장정보) - 값이 존재하지 않으면, SP_CO_I_RDR_EXTN 에서 해당지국지사코드에 의해 조회됨
        String areacd 			= Util.checkString(req.getParameter("areacd"));                         //(!주의)(해당지국의)지역코드(확장정보) - 값이 존재하지 않으면, SP_CO_I_RDR_EXTN 에서 해당지국지사코드에 의해 조회됨
        String bns_itemcd 		= Util.checkString(req.getParameter("bns_itemcd"));                     //판촉물코드(판촉물지급정보)
        String subsuprc 		= Util.checkString(req.getParameter("subsuprc"));                       //구독단가(신문구독정보)
        String medicd 			= Util.checkString(req.getParameter("medicd"));                         //매체코드(신문구독정보+확장정보)
        String resitypecd 		= Util.checkString(req.getParameter("resitypecd"));                     //주거형태코드(신문구독정보+확장정보)
        String resiclsfcd 		= Util.checkString(req.getParameter("resiclsfcd"));                     //주거구분코드(신문구독정보+확장정보)
        String rdrtel_no1 		= Util.checkString(req.getParameter("rdrtel_no1"));                     //전화번호 지역(신문구독정보+확장정보)
        String rdrtel_no2 		= Util.checkString(req.getParameter("rdrtel_no2"));                     //전화번호 국(신문구독정보+확장정보)
        String rdrtel_no3 		= Util.checkString(req.getParameter("rdrtel_no3"));                     //전화번호 번호(신문구독정보+확장정보)
        String rdrptph_no1 		= Util.checkString(req.getParameter("rdrptph_no1"));                    //휴대폰 이통사번호(신문구독정보+확장정보)
        String rdrptph_no2 		= Util.checkString(req.getParameter("rdrptph_no2"));                    //휴대폰 국(신문구독정보+확장정보)
        String rdrptph_no3 		= Util.checkString(req.getParameter("rdrptph_no3"));                    //휴대폰 번호(신문구독정보+확장정보)
        String dlvzip 			= Util.checkString(req.getParameter("dlvzip"));                         //배달지우편번호(신문구독정보+확장정보)
        String dlvcd 			= Util.checkString(req.getParameter("dlvcd"));                          //배달지코드(주소코드)(신문구독정보+확장정보)
        String dlvpyong 		= Util.checkString(req.getParameter("dlvpyong"));                       //배달지평수(신문구독정보)
        String dlvaddr 			= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));          //배달지주소(신문구독정보+확장정보)
        String dlvdtlsaddr 		= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));      //배달지상세주소(신문구독정보+확장정보)
        String dlvbnji 			= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));          //배달지 번호(신문구독정보)
        String dlvser_no 		= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvser_no")));        //배달지 호수(신문구독정보)
        String dlvdong 			= Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));          //배달지 동(신문구독정보)
        String dlvteamcd 		= Util.checkString(req.getParameter("dlvteamcd"));                      //배달지 조코드(신문구독정보)
        String dlvdstccd 		= Util.checkString(req.getParameter("dlvdstccd"));                      //배달지 주소코드(신문구독정보)
        String dlvno 			= Util.checkString(req.getParameter("dlvno"));                          //배달번호(신문구독정보)
        String dlvintvno 		= Util.checkString(req.getParameter("dlvintvno"));                      //배달사이번호(신문구독정보)
        String dlvmthdcd 		= Util.checkString(req.getParameter("dlvmthdcd"));                      //배달방법코드(신문구독정보)
        String thrw_plac 		= Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_plac")));        //투입장소(신문구독정보)
        String dlvqty 			= Util.checkString(req.getParameter("dlvqty"));                         //배달부수(신문구독정보)
        String valqty 			= Util.checkString(req.getParameter("valqty"));                         //유료부수(신문구독정보+확장정보)
        String no_valqty 		= Util.checkString(req.getParameter("no_valqty"));                      //무료부수(신문구독정보+확장정보)
        String pre_valqty 		= Util.checkString(req.getParameter("pre_valqty"));                     //준유가부수(신문구독정보)
        String subsamt 			= Util.checkString(req.getParameter("subsamt"));                        //구독금액(신문구독정보)
        String dscnamt 			= Util.checkString(req.getParameter("dscnamt"));                        //할일금액(신문구독정보)
        String post_dlvfee      = Util.checkString(req.getParameter("post_dlvfee"));                    //우송료(신문구독정보)
        String rptvfreeclsf 	= Util.Uni2Ksc(Util.checkString(req.getParameter("rptvfreeclsf")));     //대표무료구분코드(신문구독정보)
        String rptvsubsdt 		= Util.checkString(req.getParameter("rptvsubsdt"));                     //대표구독일자(신문구독정보)
        String rptvrdr_extndt 	= Util.Uni2Ksc(Util.checkString(req.getParameter("rptvrdr_extndt")));   //대표확장일자(신문구독정보)
        String rptvrdr_extntype = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));   //(!주의)대표확장유형코드(신문구독정보)(확장유형코드-hidden)
        String rptvextn 		= Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));         //(!주의)대표확장자(신문구독정보)(확장자명-확장자 검색을 통해 셋팅된 확장자 성명)
        String totrdr_extncost 	= Util.checkString(req.getParameter("totrdr_extncost"));                //총 확장비용(신문구독정보)
        String clamtclsfcd 		= Util.checkString(req.getParameter("clamtclsfcd"));                    //수금구분코드(신문구독정보)
        String rptvvalmm 		= Util.checkString(req.getParameter("rptvvalmm"));                      //대표유가월(신문구독정보)
        String rptvrdr_movmdt 	= Util.checkString(req.getParameter("rptvrdr_movmdt"));                 //대표이전일자(신문구독정보)
        String clamtmthdcd 		= Util.checkString(req.getParameter("clamtmthdcd"));                    //수금방법코드(신문구독정보)
        String clamtcyclcd 		= Util.checkString(req.getParameter("clamtcyclcd"));                    //수금주기코드(분기월)(신문구독정보)
        String etc1 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));             //기타1 ( 확장성을 위한 예비 변수)
        String etc2 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));             //기타2 ( 확장성을 위한 예비 변수)
        String etc3 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));             //기타3 ( 확장성을 위한 예비 변수)
        String etc4 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc4")));             //기타4 ( 확장성을 위한 예비 변수)
        String etc5 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc5")));             //기타5 ( 확장성을 위한 예비 변수)
        String etc6 			= Util.Uni2Ksc(Util.checkString(req.getParameter("etc6")));             //기타6 ( 확장성을 위한 예비 변수)


        // filtering
        // long type  "" --> "0"
        dlvpyong   = ("".equals(dlvpyong))? "0"   : dlvpyong;
        subsuprc   = ("".equals(subsuprc))? "0"   : subsuprc;
        dlvqty     = ("".equals(dlvqty))? "0"     : dlvqty;
        valqty     = ("".equals(valqty))? "0"     : valqty;
        no_valqty  = ("".equals(no_valqty))? "0"  : no_valqty;
        pre_valqty = ("".equals(pre_valqty))? "0" : pre_valqty;
        subsamt    = ("".equals(subsamt))? "0"    : subsamt;
        dscnamt    = ("".equals(dscnamt))? "0"    : dscnamt;
        post_dlvfee    = ("".equals(post_dlvfee))? "0"    : post_dlvfee;
        totrdr_extncost = ("".equals(totrdr_extncost))? "0" : totrdr_extncost;

        // 배달부수를 구한다. 배달부수 = 유료부수 + 무료부수 + 준유료부수
        dlvqty = "" + ( Long.parseLong(valqty) + Long.parseLong(no_valqty) + Long.parseLong(pre_valqty));

        SL_I_READERDM dm = new SL_I_READERDM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setPaty_clsfcd(paty_clsfcd);
        dm.setRdrnm(rdrnm);
        dm.setPrn(prn);
        dm.setErnno(ernno);
        dm.setEmail(email);
        dm.setWeddanvydt(weddanvydt);
        dm.setBidt(bidt);
        dm.setLusoclsfcd(lusoclsfcd);
        dm.setRemk(remk);
        dm.setAplcpathcd(aplcpathcd);
        dm.setRdr_extntypecd(rdr_extntypecd);
        dm.setExtnblngcd(extnblngcd);
        dm.setEmpclsfcd(empclsfcd);
        dm.setEmpdeptcd(empdeptcd);
        dm.setEmpdeptnm(empdeptnm);
        dm.setEmpseq(empseq);
        dm.setBodutycd(bodutycd);
        dm.setBoposicd(boposicd);
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        dm.setBoemp_no(boemp_no);
        dm.setExtnid(extnid);
        dm.setExtnflnm(extnflnm);
        dm.setExtntel1(extntel1);
        dm.setExtntel2(extntel2);
        dm.setExtntel3(extntel3);
        dm.setExtnptph_no1(extnptph_no1);
        dm.setExtnptph_no2(extnptph_no2);
        dm.setExtnptph_no3(extnptph_no3);
        dm.setExtnprn(extnprn);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBns_itemcd(bns_itemcd);
        dm.setSubsuprc(Long.parseLong(subsuprc));
        dm.setMedicd(medicd);
        dm.setResitypecd(resitypecd);
        dm.setResiclsfcd(resiclsfcd);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setDlvzip(dlvzip);
        dm.setDlvcd(dlvcd);
        dm.setDlvpyong(Long.parseLong(dlvpyong));
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setDlvbnji(dlvbnji);
        dm.setDlvser_no(dlvser_no);
        dm.setDlvdong(dlvdong);
        dm.setDlvteamcd(dlvteamcd);
        dm.setDlvdstccd(dlvdstccd);
        dm.setDlvno(dlvno);
        dm.setDlvintvno(dlvintvno);
        dm.setDlvmthdcd(dlvmthdcd);
        dm.setThrw_plac(thrw_plac);
        dm.setDlvqty(Long.parseLong(dlvqty));
        dm.setValqty(Long.parseLong(valqty));
        dm.setNo_valqty(Long.parseLong(no_valqty));
        dm.setPre_valqty(Long.parseLong(pre_valqty));
        dm.setSubsamt(Long.parseLong(subsamt));
        dm.setDscnamt(Long.parseLong(dscnamt));
        dm.setPost_dlvfee(Long.parseLong(post_dlvfee));
        dm.setRptvfreeclsf(rptvfreeclsf);
        dm.setRptvsubsdt(rptvsubsdt);
        dm.setRptvrdr_extndt(rptvrdr_extndt);
        dm.setRptvrdr_extntype(rptvrdr_extntype);
        dm.setRptvextn(rptvextn);
        dm.setTotrdr_extncost(Long.parseLong(totrdr_extncost));
        dm.setClamtclsfcd(clamtclsfcd);
        dm.setRptvvalmm(rptvvalmm);
        dm.setRptvrdr_movmdt(rptvrdr_movmdt);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setClamtcyclcd(clamtcyclcd);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);
        dm.setEtc4(etc4);
        dm.setEtc5(etc5);
        dm.setEtc6(etc6);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.insertReader(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        boolean bResult = false; // DML 쿼리 성공 여부
        String sResult = "";
        try{
            SLReader1100EJB ejb = home.create();
            SL_I_READERDataSet ds = null;
            ds = ejb.insertReader(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(독자목록검색)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectReaderList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_READERDataSet ds = null;
        //requesting parameters
        String bocd = Util.getSessionParameterValue(req, "bocd", true);							//지국지사코드
        String search_order = Util.checkString(req.getParameter("search_order"));				//검색정렬조건
        String search_ad = Util.checkString(req.getParameter("search_ad"));						//검색 asc, desc
        String search_cond = Util.checkString(req.getParameter("search_cond"));					//검색 조건검색조건('ALL':통합검색, 'DSTC':구역코드, 'DSNO':구역+배달, 'NO':독자번호, 'NM':독자명, 'ADDR':상세주소, 'ADDRS':주소전체, 'TEL':전화번호, 'EMAIL':이메일, 'PRVNO':전(前)독자번호 '':전체)
        String search_pttn = Util.checkString(req.getParameter("search_pttn"));					//통합(전체)검색시 검색어의 패턴('1':구역, '2':구역+배달, '3':독자번호, '4':독자명, '5':주소, '6':전화번호)
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));	//검색어
        String search_stop = Util.checkString(req.getParameter("search_stop"));					//검색시 중지독자 포함 여부
        String pageno = Util.checkString(req.getParameter("pageno"));							//페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));						//한페이지당 레코드수(페이지사이즈)

        //setting dm
        SL_L_READERDM dm = new SL_L_READERDM();
        dm.setBocd(bocd);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_pttn(search_pttn);
        dm.setSearch_word(search_word);
        dm.setSearch_stop(search_stop);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectReaderList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_READERDataSet ds = null;
            ds = ejb.selectReaderList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(독자상세보기)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectReaderDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_RDR_INFODataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);				//지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));			//매체코드
        String basiyymm = Util.checkString(req.getParameter("basiyymm"));		//수금내역의 검색기준년월

        SL_S_RDR_INFODM dm = new SL_S_RDR_INFODM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setBasiyymm(basiyymm);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectReaderDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_RDR_INFODataSet ds = null;
            ds = ejb.selectReaderDetail(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(독자정보수정)
     * @param req HttpServletRequest
     * @param res HttpServletRequest
     * @throws AppException
     *
     */
    public void updateReaderInfo(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_U_READERINFODataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);					        //지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);		                //입력자(수정자)
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));				//독자번호
        String dlvdstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdstccd")));		//배달구역코드(구역코드)
        String dlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvno")));				//배달번호
        String dlvintvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvintvno")));		//사이번호
        String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));				//배달지우편번호
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));			//배달지주소
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));	//배달지상세주소
        String dlvbnji = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));			//배달지번지
        String dlvcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvcd")));				//배달지코드(주소코드)
        String dlvdong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));			//배달지동
        String dlvser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvser_no")));		//배달지호
        String dlvpyong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvpyong")));			//평
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));				//독자번호
        String paty_clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_clsfcd")));	//단체구분코드
        String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));		//독자 전화번호1(지역)
        String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));		//독자 전화번호2(국)
        String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));		//독자 전화번호3(번호)
        String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));		//주거형태코드(주택, 연립, 아파트..)
        String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));		//주거구분코드(자취,하숙 ..)
        String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));	//독자 휴대폰번호1(이통사 번호)
        String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));	//독자 휴대폰번호2(국)
        String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));   //독자 휴대폰번호3(번호)
        String dlvmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvmthdcd")));		//배달방법코드
        String thrw_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_plac")));		//투입장소코드
        String bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("bidt")));					//생년월일
        String lusoclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("lusoclsfcd")));		//주소구분코드
        String weddanvydt = Util.Uni2Ksc(Util.checkString(req.getParameter("weddanvydt")));		//결혼기념일
        String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));				//이메일
        String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));					//주민등록번호
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));					//비고

        String medicd      = Util.checkString(req.getParameter("medicd"));                      //매체코드
        String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));                 //수금방법
        String clamtcyclcd = Util.checkString(req.getParameter("clamtcyclcd"));                 //수금주기(분기월)

        dlvpyong = ("".equals(dlvpyong))? "0": dlvpyong;

        SL_U_READERINFODM dm = new SL_U_READERINFODM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setDlvdstccd(dlvdstccd);
        dm.setDlvno(dlvno);
        dm.setDlvintvno(dlvintvno);
        dm.setDlvzip(dlvzip);
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setDlvbnji(dlvbnji);
        dm.setDlvcd(dlvcd);
        dm.setDlvdong(dlvdong);
        dm.setDlvser_no(dlvser_no);
        dm.setDlvpyong(Long.parseLong(dlvpyong));
        dm.setRdrnm(rdrnm);
        dm.setPaty_clsfcd(paty_clsfcd);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setResitypecd(resitypecd);
        dm.setResiclsfcd(resiclsfcd);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setDlvmthdcd(dlvmthdcd);
        dm.setThrw_plac(thrw_plac);
        dm.setBidt(bidt);
        dm.setLusoclsfcd(lusoclsfcd);
        dm.setWeddanvydt(weddanvydt);
        dm.setEmail(email);
        dm.setPrn(prn);
        dm.setRemk(remk);
        dm.setMedicd(medicd);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setClamtcyclcd(clamtcyclcd);
        
        boolean bResult = false; // DML 쿼리 성공 여부
        String sResult = "";
        
        SLReader1100DAO dao = new SLReader1100DAO();
        bResult = dao.updateReaderInfo(dm);
        if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
        }
        req.setAttribute("result", sResult); // request에 결과값을 담는다.
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        boolean bResult = false; // DML 쿼리 성공 여부
        String sResult = "";
        try{
            SLReader1100EJB ejb = home.create();
            SL_U_READERINFODataSet ds = null;
            bResult = ejb.updateReaderInfo(dm); // 설정된 dm값으로 EJB를 호출
            if(bResult == true){ // 성공적으로 입력된 경우
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
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
     * 독자정보관리(구독내역팝업-구독내역목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectSubsHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_NWSPSUBSCNTRPTCRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//독자번호
        String frdt = Util.checkString(req.getParameter("frdt"));				//검색 시작일
        String todt = Util.checkString(req.getParameter("todt"));				//검색 종료일
        String medicd = Util.checkString(req.getParameter("medicd"));			//매체코드(들)  ('##' 으로 연결된 여러 매체코드 일 수 있음)
        String pageno = Util.checkString(req.getParameter("pageno"));			//페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));		//페이지사이즈

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_L_NWSPSUBSCNTRPTCRDM dm = new SL_L_NWSPSUBSCNTRPTCRDM();
        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectSubsHistoryList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_NWSPSUBSCNTRPTCRDataSet ds = null;
            ds = ejb.selectSubsHistoryList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(구독내역팝업-휴독내역목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectStopsHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_VSPTCRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//독자번호
        String frdt = Util.checkString(req.getParameter("frdt"));				//검색 시작일
        String todt = Util.checkString(req.getParameter("todt"));               //검색 종료일
        String medicd = Util.checkString(req.getParameter("medicd"));           //매체코드(들)  ('##' 으로 연결된 여러 매체코드 일 수 있음)
        String pageno = Util.checkString(req.getParameter("pageno"));           //페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));       //페이지사이즈

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_L_VSPTCRDM dm = new SL_L_VSPTCRDM();
        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectStopsHistoryList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_VSPTCRDataSet ds = null;
            ds = ejb.selectStopsHistoryList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(구독내역팝업-이사내역목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectMoveHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_MOVM_RDRPTCRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));		//독자번호
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));         //검색 시작일
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));         //검색 종료일
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));     //매체코드(들)  ('##' 으로 연결된 여러 매체코드 일 수 있음)
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));     //페이지번호
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize"))); //페이지사이즈


        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_L_MOVM_RDRPTCRDM dm = new SL_L_MOVM_RDRPTCRDM();

        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectMoveHistoryList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MOVM_RDRPTCRDataSet ds = null;
            ds = ejb.selectMoveHistoryList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리-구독추가변경팝업(초기화면)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void initSubsCntr(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_NWSPSUBSCNTR_INITDataSet ds = null;
        // 지국지사코드 session 값 셋팅
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드

        SL_L_NWSPSUBSCNTR_INITDM dm = new SL_L_NWSPSUBSCNTR_INITDM();

        dm.setBocd(bocd);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.initSubsCntr(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_NWSPSUBSCNTR_INITDataSet ds = null;
            ds = ejb.initSubsCntr(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리-구독추가변경팝업(구독계약목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectSubsCntrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_NWSPSUBSCNTRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));		//매체코드

        SL_L_NWSPSUBSCNTRDM dm = new SL_L_NWSPSUBSCNTRDM();

        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectSubsCntrList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_NWSPSUBSCNTRDataSet ds = null;
            ds = ejb.selectSubsCntrList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리-구독추가변경팝업(구독계약상세조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectSubsCntrDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_NWSPSUBSCNTRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));		//매체코드
        String cntrno = Util.checkString(req.getParameter("cntrno"));		//신문구독계약번호
        String mangno = Util.checkString(req.getParameter("mangno"));		//관리번호

        SL_S_NWSPSUBSCNTRDM dm = new SL_S_NWSPSUBSCNTRDM();

        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setCntrno(cntrno);
        dm.setMangno(mangno);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectSubsCntrDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_NWSPSUBSCNTRDataSet ds = null;
            ds = ejb.selectSubsCntrDetail(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(구독계약 등록,수정)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessSubsCntr(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_NWSPSUBSCNTRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		                            //지국지사코드                                       							//지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);              				//입력자(수정자)
        String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));					//처리 FLAG(I:입력, S:저장)
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));						//독자번호
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));                     //매체코드
        String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));                     //계약번호
        String mangno = Util.Uni2Ksc(Util.checkString(req.getParameter("mangno")));                     //관리번호
        String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));             //확장일자
        String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));             //확장번호
        String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));     //확장유형코드
        String extnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnnm")));                     //확장자명
        String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));         //확장비용
        String subsfr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfr_dt")));               //구독시작일자
        String freeyn = Util.Uni2Ksc(Util.checkString(req.getParameter("freeyn")));                     //무료여부
        String freeclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("freeclsf")));                 //무료구분
        String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));                       //유가월
        String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));                 //구독단가
        String subsqty = Util.Uni2Ksc(Util.checkString(req.getParameter("subsqty")));                   //구독부수
        String dscnamt = Util.Uni2Ksc(Util.checkString(req.getParameter("dscnamt")));                   //할인금액
        String post_dlvfee = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvfee")));           //우송료
        String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));             //판촉물코드
        String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));             //확장자소속코드
        String bodutycd = Util.Uni2Ksc(Util.checkString(req.getParameter("bodutycd")));                 //지국직책코드
        String boposicd = Util.Uni2Ksc(Util.checkString(req.getParameter("boposicd")));                 //지국직급코드(활용유보)
        String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));             //요원구분코드
        String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));                     //요원번호
        String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));                 //지국지사사원번호
        String extntel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel1")));                 //확장자전화1
        String extntel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel2")));                 //확장자전화2
        String extntel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel3")));                 //확장자전화3
        String extnptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no1")));         //확장자휴대폰번호1
        String extnptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no2")));         //확장자휴대폰번호2
        String extnptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no3")));         //확장자휴대폰번호3
        String extnprn = Util.Uni2Ksc(Util.checkString(req.getParameter("extnprn")));                   //확장자주민등록번호
        String extnemail = Util.Uni2Ksc(Util.checkString(req.getParameter("extnemail")));               //확장자이메일
        String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));             //신청경로코드
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                         //비고

        // filtering
        // long type  "" --> "0"
        rdr_extncost = ("".equals(rdr_extncost))? "0" : rdr_extncost;
        subsuprc = ("".equals(subsuprc))? "0" : subsuprc;
        subsqty = ("".equals(subsqty))? "0" : subsqty;
        dscnamt = ("".equals(dscnamt))? "0" : dscnamt;
        post_dlvfee = ("".equals(post_dlvfee))? "0" : post_dlvfee;

        SL_A_NWSPSUBSCNTRDM dm = new SL_A_NWSPSUBSCNTRDM();

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setCntrno(cntrno);
        dm.setMangno(mangno);
        dm.setRdr_extndt(rdr_extndt);
        dm.setRdr_extnno(rdr_extnno);
        dm.setRdr_extntypecd(rdr_extntypecd);
        dm.setExtnnm(extnnm);
        dm.setRdr_extncost(Long.parseLong(rdr_extncost));
        dm.setSubsfr_dt(subsfr_dt);
        dm.setFreeyn(freeyn);
        dm.setFreeclsf(freeclsf);
        dm.setValmm(valmm);
        dm.setSubsuprc(Long.parseLong(subsuprc));
        dm.setSubsqty(Long.parseLong(subsqty));
        dm.setDscnamt(Long.parseLong(dscnamt));
        dm.setPost_dlvfee(Long.parseLong(post_dlvfee));
        dm.setBns_itemcd(bns_itemcd);
        dm.setExtnblngcd(extnblngcd);
        dm.setBodutycd(bodutycd);
        dm.setBoposicd(boposicd);
        dm.setStafclsfcd(stafclsfcd);
        dm.setStafno(stafno);
        dm.setBoemp_no(boemp_no);
        dm.setExtntel1(extntel1);
        dm.setExtntel2(extntel2);
        dm.setExtntel3(extntel3);
        dm.setExtnptph_no1(extnptph_no1);
        dm.setExtnptph_no2(extnptph_no2);
        dm.setExtnptph_no3(extnptph_no3);
        dm.setExtnprn(extnprn);
        dm.setExtnemail(extnemail);
        dm.setAplcpathcd(aplcpathcd);
        dm.setRemk(remk);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.accessSubsCntr(dm);
        req.setAttribute("ds", ds);  // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_NWSPSUBSCNTRDataSet ds = null;
            ds = ejb.accessSubsCntr(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds);  // request에 결과값을 Binding
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
     * 독자정보관리(입금내역목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectRcpmList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_RDRCLAMTHSTYDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);			//지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));		//매체코드
        String basiyymm = Util.checkString(req.getParameter("basiyymm"));	//검색기준년월

        SL_L_RDRCLAMTHSTYDM dm = new SL_L_RDRCLAMTHSTYDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setBasiyymm(basiyymm);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectRcpmList(dm);
        req.setAttribute("ds", ds);  // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_RDRCLAMTHSTYDataSet ds = null;
            ds = ejb.selectRcpmList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds);  // request에 결과값을 Binding
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
     * 독자정보관리(입금내역상세보기)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectRcpmDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_RDR_NWSPCLAMTDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true); 				//지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no")); 			//독자번호
        String medicd = Util.checkString(req.getParameter("medicd")); 			//매체코드
        String subsmappli = Util.checkString(req.getParameter("subsmappli")); 	//구독월분

        SL_S_RDR_NWSPCLAMTDM dm = new SL_S_RDR_NWSPCLAMTDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setSubsmappli(subsmappli);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectRcpmDetail(dm);
        req.setAttribute("ds", ds);     // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_RDR_NWSPCLAMTDataSet ds = null;
            ds = ejb.selectRcpmDetail(dm);  // 설정된 dm값으로 EJB를 호출
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
     * 독자정보관리(입금정보저장)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessRcpm(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_CLAMTRDRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);					//지국지사코드 : 단일
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);         //변경자(로그인아이디) : 단일
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));               //독자번호 : 복수
        String medicd = Util.checkString(req.getParameter("medicd"));               //매체코드 : 복수
        String subsmappli = Util.checkString(req.getParameter("subsmappli"));       //구독월분 : 복수
        String dlvdstccd = Util.checkString(req.getParameter("dlvdstccd"));         //배달지구역코드 : 복수
        String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));     //수금방법코드 : 복수
        String rcpmclsfcd = Util.checkString(req.getParameter("rcpmclsfcd"));       //입금구분코드 : 복수
        String clamt = Util.checkString(req.getParameter("clamt"));                 //수금액 : 복수
        String recpdt = Util.checkString(req.getParameter("recpdt"));               //수납일자 : 단일

        SL_A_CLAMTRDRDM dm = new SL_A_CLAMTRDRDM();

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setSubsmappli(subsmappli);
        dm.setDlvdstccd(dlvdstccd);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setRcpmclsfcd(rcpmclsfcd);
        dm.setClamt(clamt);
        dm.setRecpdt(recpdt);

        boolean bResult = false; // DML 쿼리 성공 여부
        String sResult = "";
        SLReader1100DAO dao = new SLReader1100DAO();
        bResult = dao.accessRcpm(dm);
        if(bResult == true){ // 성공적으로 입력된 경우
            sResult = "true";
        }
        req.setAttribute("result", sResult); // request에 결과값을 담는다.
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        boolean bResult = false; // DML 쿼리 성공 여부
        String sResult = "";
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_CLAMTRDRDataSet ds = null;
            bResult = ejb.accessRcpm(dm); // 설정된 dm값으로 EJB를 호출
            if(bResult == true){ // 성공적으로 입력된 경우
                sResult = "true";
            }
            req.setAttribute("result", sResult); // request에 결과값을 담는다.
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
     * 독자정보관리(마일리지지급내역팝업-초기화면)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void initMilgPayHistory(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_MILGPAY_INITDataSet ds = null;
        // session process
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드

        SL_L_MILGPAY_INITDM dm = new SL_L_MILGPAY_INITDM();

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.initMilgPayHistory(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MILGPAY_INITDataSet ds = null;
            ds = ejb.initMilgPayHistory(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(마일리지지급내역팝업-목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectMilgPayHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_MILGPAYDataSet ds = null;
        // parameter process
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String frpaydt = Util.checkString(req.getParameter("frpaydt"));
        String topaydt = Util.checkString(req.getParameter("topaydt"));
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SL_L_MILGPAYDM dm = new SL_L_MILGPAYDM();
        dm.setRdr_no(rdr_no);
        dm.setFrpaydt(frpaydt);
        dm.setTopaydt(topaydt);
        dm.setPaybasicd(paybasicd);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectMilgPayHistoryList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MILGPAYDataSet ds = null;
            ds = ejb.selectMilgPayHistoryList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(마일리지지급내역팝업-상세조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectMilgPayHistoryDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_MILGPAYDataSet ds = null;
        // parameter process
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String milgpaydt = Util.checkString(req.getParameter("milgpaydt"));
        String milgpayno = Util.checkString(req.getParameter("milgpayno"));

        SL_S_MILGPAYDM dm = new SL_S_MILGPAYDM();

        dm.setRdr_no(rdr_no);
        dm.setMilgpaydt(milgpaydt);
        dm.setMilgpayno(milgpayno);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectMilgPayHistoryDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_MILGPAYDataSet ds = null;
            ds = ejb.selectMilgPayHistoryDetail(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(마일리지지급내역팝업-등록,수정,삭제)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessMilgPayHistory(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_MILGPAYDataSet ds = null;
        // Session process
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		    //지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);		//입력 혹은 수정, 삭제자 ID

        // Parameter process
        String accflag = Util.checkString(req.getParameter("accflag"));				//처리 FLAG (I:등록, U:수정, D:삭제)
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));               //독자번호
        String milgpaydt = Util.checkString(req.getParameter("milgpaydt"));         //마일리지지급일자
        String milgpayno = Util.checkString(req.getParameter("milgpayno"));         //마일리지지급번호
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));               //회사코드
        String medicd = Util.checkString(req.getParameter("medicd"));               //매체코드
        String paybasicd = Util.checkString(req.getParameter("paybasicd"));         //지급기준코드
        String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));         //지급구분코드
        String pont = Util.checkString(req.getParameter("pont"));                   //포인트

        // filtering
        // long type  "" --> "0"
        pont = ("".equals(pont))? "0" : pont;

        SL_A_MILGPAYDM dm = new SL_A_MILGPAYDM();

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setRdr_no(rdr_no);
        dm.setMilgpaydt(milgpaydt);
        dm.setMilgpayno(milgpayno);
        dm.setCmpycd(cmpycd);
        dm.setMedicd(medicd);
        dm.setPaybasicd(paybasicd);
        dm.setPayclsfcd(payclsfcd);
        dm.setPont(Long.parseLong(pont));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.accessMilgPayHistory(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_MILGPAYDataSet ds = null;
            ds = ejb.accessMilgPayHistory(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(불편접수팝업-초기화면)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void initDsct(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	CO_L_TAOCC_CDVDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String ciymgbcd = "97";   //업무구분 : 지국지사공통
        String cicdgb = "390";    //코드구분 : 구독불만유형
        String cimgtcd1 = "Y";  //관리항복1
        String cimgtcd2 = "ALL";  //관리항목2
        String cimgtcd3 = "ALL";  //관리항목3
        String cimgtcd4 = "ALL";  //관리항목4
        String cimgtcd5 = "ALL";  //관리항목5
        String cimgtcd6 = "NO";   //관리항목6
        String cimgtcd7 = "NO";   //관리항목7

        CO_L_TAOCC_CDVDM dm = new CO_L_TAOCC_CDVDM();
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCimgtcd1(cimgtcd1);
        dm.setCimgtcd2(cimgtcd2);
        dm.setCimgtcd3(cimgtcd3);
        dm.setCimgtcd4(cimgtcd4);
        dm.setCimgtcd5(cimgtcd5);
        dm.setCimgtcd6(cimgtcd6);
        dm.setCimgtcd7(cimgtcd7);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.initDsct(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            CO_L_TAOCC_CDVDataSet ds = null;
            ds = ejb.initDsct(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(중지팝업)(초기화)
     * 중지처리를 위한 매체목록, 중지사유및 독자 신상정보 조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectStopSubsList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_E_SUBS_CNTR_STOP_INIDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);				//지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//독자번호

        SL_E_SUBS_CNTR_STOP_INIDM dm = new SL_E_SUBS_CNTR_STOP_INIDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);

        //debugging
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        
        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectStopSubsList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_E_SUBS_CNTR_STOP_INIDataSet ds = null;
            ds = ejb.selectStopSubsList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(중지처리)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void updateStopSubs(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_SUBS_CNTR_STOPDataSet ds = null;
        //requesting parameters
        final String DELIMITER = "##";
        String[] idxs       = req.getParameterValues("idx");   //인계대상 중 체크된 목록의 idx값들
        String bocd         = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);      //입력자(단수)
        String suspdt       = Util.checkString(req.getParameter("suspdt"));         //중지일자
        String susptype     = Util.checkString(req.getParameter("susptype"));       //처리 FLAG (97-360 10:부분중지, 20:전체중지)
        String remk         = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));  //비고(타지구독매체 정보로 활용됨)
        String resv1 		= Util.checkString(req.getParameter("resv1"));
        String resv2 		= Util.checkString(req.getParameter("resv2"));
        String resv3 		= Util.checkString(req.getParameter("resv3"));

        StringBuffer sb_rdr_no 		= new StringBuffer(""); //독자번호 (복수입력됨)
        StringBuffer sb_medicd 		= new StringBuffer(""); //매체     (복수입력됨)
        StringBuffer sb_freeyn 		= new StringBuffer(""); //무료여부 (복수입력됨)
        StringBuffer sb_freeclsf 	= new StringBuffer(""); //무료구분 (복수입력됨)
        StringBuffer sb_qty 		= new StringBuffer(""); //부수     (복수입력됨)
        StringBuffer sb_suspresncd 	= new StringBuffer(""); //중지사유 (97-370 )

        String[] rdr_nos 		= req.getParameterValues("rdr_no" 		);
        String[] medicds 		= req.getParameterValues("medicd" 		);
        String[] freeyns 		= req.getParameterValues("freeyn" 		);
        String[] freeclsfs 	    = req.getParameterValues("freeclsf" 	);
        String[] qtys 			= req.getParameterValues("qty" 			);
        String[] suspresncds 	= req.getParameterValues("suspresncd"   );



        if(idxs == null){
             throw new AppException("[SLReader1100WB.java-updateStopSubs](1)", "중지대상중 체크된 건이 없습니다.");
        }

        for(int i=0; i<idxs.length; i++){
            sb_rdr_no.append(DELIMITER + rdr_nos[Integer.parseInt(idxs[i])]);
            sb_medicd.append(DELIMITER + Util.Uni2Ksc(medicds[Integer.parseInt(idxs[i])]));
            sb_freeyn.append(DELIMITER + freeyns[Integer.parseInt(idxs[i])]);
            sb_freeclsf.append(DELIMITER + freeclsfs[Integer.parseInt(idxs[i])]);
            sb_qty.append(DELIMITER + qtys[Integer.parseInt(idxs[i])]);
            sb_suspresncd.append(DELIMITER + suspresncds[Integer.parseInt(idxs[i])]);
        }
        if(idxs.length > 0){
            sb_rdr_no.delete(0,DELIMITER.length());
            sb_medicd.delete(0,DELIMITER.length());
            sb_freeyn.delete(0,DELIMITER.length());
            sb_freeclsf.delete(0,DELIMITER.length());
            sb_qty.delete(0,DELIMITER.length());
            sb_suspresncd.delete(0,DELIMITER.length());
        }

        //setting dm
        SL_A_SUBS_CNTR_STOPDM dm = new SL_A_SUBS_CNTR_STOPDM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setSusptype(susptype);
        dm.setSuspdt(suspdt);
        dm.setRemk(remk);
        dm.setRdr_no(sb_rdr_no.toString());
        dm.setMedicd(sb_medicd.toString());
        dm.setFreeyn(sb_freeyn.toString());
        dm.setFreeclsf(sb_freeclsf.toString());
        dm.setQty(sb_qty.toString());
        dm.setSuspresncd(sb_suspresncd.toString());
        dm.setResv1(resv1);
        dm.setResv2(resv2);
        dm.setResv3(resv3);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.updateStopSubs(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            SL_A_SUBS_CNTR_STOPDataSet ds = null;
            ds = ejb.updateStopSubs(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(불편접수팝업-초기화면)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void initMovmTrsf(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_MOVM_RDR_INIT_01DataSet ds = null;
        SL_L_MOVM_RDR_INIT_01DM dm = new SL_L_MOVM_RDR_INIT_01DM();

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.initMovmTrsf(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MOVM_RDR_INIT_01DataSet ds = null;
            ds = ejb.initMovmTrsf(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(판촉물지급내역팝업-목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectBnsItemPayHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_BNS_ITEMPAYDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));					//독자번호
        String frpaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("frpaydt")));               //from 지급일자
        String topaydt = Util.Uni2Ksc(Util.checkString(req.getParameter("topaydt")));               //to   지급일자
        String search_order = Util.Uni2Ksc(Util.checkString(req.getParameter("search_order")));     //정렬조건
        String search_ad = Util.Uni2Ksc(Util.checkString(req.getParameter("search_ad")));           //"ASC" or "DESC"
        String search_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("search_cond")));       //검색조건
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));       //검색어
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                 //현재페이지
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));             //페이지당 보여줄 건수


        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "10" : pagesize;

        SL_L_BNS_ITEMPAYDM dm = new SL_L_BNS_ITEMPAYDM();
        dm.setRdr_no(rdr_no);
        dm.setFrpaydt(frpaydt);
        dm.setTopaydt(topaydt);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectBnsItemPayHistoryList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_BNS_ITEMPAYDataSet ds = null;
            ds = ejb.selectBnsItemPayHistoryList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(판촉물지급내역팝업-상세조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectBnsItemPayHistoryDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_S_BNS_ITEMPAYDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));				//독자번호
        String payno = Util.Uni2Ksc(Util.checkString(req.getParameter("payno")));               //지급번호

        SL_S_BNS_ITEMPAYDM dm = new SL_S_BNS_ITEMPAYDM();
        dm.setRdr_no(rdr_no);
        dm.setPayno(payno);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectBnsItemPayHistoryDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_S_BNS_ITEMPAYDataSet ds = null;
            ds = ejb.selectBnsItemPayHistoryDetail(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(판촉물지급내역팝업-등록,수정,삭제)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessBnsItemPayHistory(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_BNS_ITEMPAYDataSet ds = null;
        // Session process
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		    //지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);		//입력 혹은 수정, 삭제자 ID

        // parameter requesting 하고  DM에 값을 Setting
        String accflag = Util.checkString(req.getParameter("accflag"));         //처리 FLAG (I:등록, U:수정, D:삭제)
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));           //독자번호
        String payno = Util.checkString(req.getParameter("payno"));             //지급번호
        String paydt = Util.checkString(req.getParameter("paydt"));             //지급일자
        String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));   //판촉물코드
        String qunt = Util.checkString(req.getParameter("qunt"));               //수량
        String amt = Util.checkString(req.getParameter("amt"));                 //금액
        String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));   //확장일자
        String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));   //확장번호

        // filtering
        // long type  "" --> "0"
        qunt = ("".equals(qunt))? "1" : qunt;
        amt = ("".equals(amt))? "10" : amt;


        SL_A_BNS_ITEMPAYDM dm = new SL_A_BNS_ITEMPAYDM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setRdr_no(rdr_no);
        dm.setPayno(payno);
        dm.setPaydt(paydt);
        dm.setBns_itemcd(bns_itemcd);
        dm.setQunt(Long.parseLong(qunt));
        dm.setAmt(Long.parseLong(amt));
        dm.setRdr_extndt(rdr_extndt);
        dm.setRdr_extnno(rdr_extnno);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.accessBnsItemPayHistory(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_BNS_ITEMPAYDataSet ds = null;
            ds = ejb.accessBnsItemPayHistory(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(이체신청팝업-신규신청 초기화)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcNew(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_L_APLC_NEWDataSet ds = null;
        SL_L_APLC_NEWDM dm = new SL_L_APLC_NEWDM();

        // dm 세팅 시작
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String rdr_no = req.getParameter("rdr_no");
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        // dm 세팅 끝
        
        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectAplcNew(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.

        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.selectAplcNew(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
     * 독자정보관리(이체신청팝업-해지신청 초기화)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcExpy(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_L_APLC_EXPYDataSet ds = null;
        SL_L_APLC_EXPYDM dm = new SL_L_APLC_EXPYDM();

        // dm 세팅 시작
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String rdr_no = req.getParameter("rdr_no");
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        // dm 세팅 끝

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectAplcExpy(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
        
        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.selectAplcExpy(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
     * 독자정보관리(이체신청팝업-해지신청대상목록 상세보기)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAplcDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_S_APLC_EXPYDataSet ds = null;
        SL_S_APLC_EXPYDM dm = new SL_S_APLC_EXPYDM();

        // dm 세팅 시작
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String rdr_no = req.getParameter("rdr_no");
        String medicd = req.getParameter("medicd");

        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        // dm 세팅 끝

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectAplcDetail(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
        
        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.selectAplcDetail(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
     * 독자정보관리(이체신청팝업-자동이체신청 입력)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertAutoShiftAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_I_SHFTAPLCDataSet ds = null;
        SL_I_SHFTAPLCDM dm = new SL_I_SHFTAPLCDM();

        // dm 세팅 시작
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String accflag = Util.checkString(req.getParameter("accflag"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
        String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
        String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
        String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
        String bankcd = Util.checkString(req.getParameter("recpinstt"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
        String cardno = Util.checkString(req.getParameter("cardno"));
        String vdtyprd = Util.checkString(req.getParameter("vdtyyy")) + Util.checkString(req.getParameter("vdtymm"));
        String prn = Util.checkString(req.getParameter("prn"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
        String email = Util.checkString(req.getParameter("email"));
        String tmpFlag = "R";

        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setShftclsf(shftclsf);
        dm.setPymtnm(pymtnm);
        dm.setPymttel1(pymttel1);
        dm.setPymttel2(pymttel2);
        dm.setPymttel3(pymttel3);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setCardcmpycd(cardcmpycd);
        dm.setCardno(cardno);
        dm.setVdtyprd(vdtyprd);
        dm.setPrn(prn);
        dm.setAplcdt(aplcdt);
        dm.setAplyyymm(aplyyymm);
        dm.setEmail(email);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        dm.setTmpflag(tmpFlag);
        // dm 세팅 끝

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.insertAutoShiftAplc(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
        
        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.insertAutoShiftAplc(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
     * 독자정보관리(이체신청팝업-이체방법변경)
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateShftMthd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SL_U_SHFTMTHDCHGDataSet ds = null;
        SL_U_SHFTMTHDCHGDM dm = new SL_U_SHFTMTHDCHGDM();

        // dm 세팅 시작
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String shftclsf = Util.checkString(req.getParameter("shftclsf"));
        String pymtnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtnm")));
        String pymttel1 = Util.checkString(req.getParameter("pymttel1"));
        String pymttel2 = Util.checkString(req.getParameter("pymttel2"));
        String pymttel3 = Util.checkString(req.getParameter("pymttel3"));
        String bankcd = Util.checkString(req.getParameter("recpinstt"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String cardcmpycd = Util.checkString(req.getParameter("cardcmpycd"));
        String cardno = Util.checkString(req.getParameter("cardno"));
        String vdtyprd = Util.checkString(req.getParameter("vdtyyy")) + Util.checkString(req.getParameter("vdtymm"));
        String prn = Util.checkString(req.getParameter("prn"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplyyymm = Util.checkString(req.getParameter("aplyyymm"));
        String email = Util.checkString(req.getParameter("email"));

        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setShftclsf(shftclsf);
        dm.setPymtnm(pymtnm);
        dm.setPymttel1(pymttel1);
        dm.setPymttel2(pymttel2);
        dm.setPymttel3(pymttel3);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setCardcmpycd(cardcmpycd);
        dm.setCardno(cardno);
        dm.setVdtyprd(vdtyprd);
        dm.setPrn(prn);
        dm.setAplcdt(aplcdt);
        dm.setAplyyymm(aplyyymm);
        dm.setEmail(email);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);
        // dm 세팅 끝

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.updateShftMthd(dm);
        req.setAttribute("ds", ds); // request에 결과값을 담는다.
        
        /*
        SLReader1100EJBHome home = (SLReader1100EJBHome) JNDIManager.getInstance().getHome("SLReader1100EJB");
        try {
            SLReader1100EJB ejb = home.create();
            ds = ejb.updateShftMthd(dm); // 설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds); // request에 결과값을 담는다.
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
     * 독자정보관리(독자메모팝업-조회,등록,수정,초기화)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void accessRdrMemo(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_RDRMEMODataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String accflag = Util.checkString(req.getParameter("accflag"));			//처리 FLAG(R:조회, U:수정, D:초기화)
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);     //입력자(수정자)아이디
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));           //독자번호
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont"))); //독자로 부터 입력받은 내용

        SL_A_RDRMEMODM dm = new SL_A_RDRMEMODM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        dm.setCont(cont);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.accessRdrMemo(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_RDRMEMODataSet ds = null;
            ds = ejb.accessRdrMemo(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(중지내역팝업-목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void selectStopHist(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SL_L_SUBS_CNTR_STOP_HISTDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));

        SL_L_SUBS_CNTR_STOP_HISTDM dm = new SL_L_SUBS_CNTR_STOP_HISTDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectStopHist(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_SUBS_CNTR_STOP_HISTDataSet ds = null;
            ds = ejb.selectStopHist(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(중지내역팝업-중지취소처리)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void cancelStopMulti(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_A_SUBS_CNTR_STOP_CANCDataSet ds = null;
        //requesting parameters
        final String DELIMITER = "##";
        String[] idxs       = req.getParameterValues("idx");   //인계대상 중 체크된 목록의 idx값들
        String bocd         = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
        String incmgpers    = Util.getSessionParameterValue(req, "uid", true);      //입력자(단수)
        String resv1 		= Util.checkString(req.getParameter("resv1"));
        String resv2 		= Util.checkString(req.getParameter("resv2"));
        String resv3 		= Util.checkString(req.getParameter("resv3"));

        StringBuffer sb_rdr_no 		= new StringBuffer(""); //독자번호 (복수입력됨)
        StringBuffer sb_medicd 		= new StringBuffer(""); //매체코드 (복수입력됨)
        StringBuffer sb_cntrno 		= new StringBuffer(""); //계약번호 (복수입력됨)
        StringBuffer sb_mangno 		= new StringBuffer(""); //관리번호 (복수입력됨)

        String[] rdr_nos 		= req.getParameterValues("rdr_no" 		);
        String[] medicds 		= req.getParameterValues("medicd" 		);
        String[] cntrnos 		= req.getParameterValues("cntrno" 		);
        String[] mangnos 	    = req.getParameterValues("mangno" 	    );

        if(idxs == null){
             throw new AppException("[SLReader1100WB.java-cancelStop](1)", "중지취소처리");
        }

        for(int i=0; i<idxs.length; i++){
            sb_rdr_no.append(DELIMITER + rdr_nos[Integer.parseInt(idxs[i])]);
            sb_medicd.append(DELIMITER + Util.Uni2Ksc(medicds[Integer.parseInt(idxs[i])]));
            sb_cntrno.append(DELIMITER + cntrnos[Integer.parseInt(idxs[i])]);
            sb_mangno.append(DELIMITER + mangnos[Integer.parseInt(idxs[i])]);
        }
        if(idxs.length > 0){
            sb_rdr_no.delete(0,DELIMITER.length());
            sb_medicd.delete(0,DELIMITER.length());
            sb_cntrno.delete(0,DELIMITER.length());
            sb_mangno.delete(0,DELIMITER.length());
        }

        //setting dm
        SL_A_SUBS_CNTR_STOP_CANCDM dm = new SL_A_SUBS_CNTR_STOP_CANCDM();
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(sb_rdr_no.toString());
        dm.setMedicd(sb_medicd.toString());
        dm.setCntrno(sb_cntrno.toString());
        dm.setMangno(sb_mangno.toString());
        dm.setResv1(resv1);
        dm.setResv2(resv2);
        dm.setResv3(resv3);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.cancelStopMulti(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_A_SUBS_CNTR_STOP_CANCDataSet ds = null;
            ds = ejb.cancelStopMulti(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(기존독자목록팝업-목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void dupChkRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_RDR_DUP_CHKDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String medicd = Util.checkString(req.getParameter("medicd"));				//매체코드
        String bocd = Util.getSessionParameterValue(req, "bocd", true);				//지국지사코드
        String accflag = Util.checkString(req.getParameter("accflag"));             //처리 FLAG ('10' : 기존독자 카운트, '20' : 기족독자목록조회 )
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);      	//입력자(단수)
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));   //독자명
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));		//전화번호1
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));		//전화번호2
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));		//전화번호3
        String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));		//휴대폰번호1
        String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));		//휴대폰번호2
        String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));		//휴대폰번호3
        String prn = Util.checkString(req.getParameter("prn"));						//주민등록번호
        String dlvzip = Util.checkString(req.getParameter("dlvzip"));				//우편번호
        String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));				//주소
        String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));		//상세주소
        String dlvdong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));	            //동
        String dlvser_no = Util.checkString(req.getParameter("dlvser_no"));			                //호수
        String dlvbnji = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));				//번지
        String email =Util.Uni2Ksc(Util.checkString(req.getParameter("email")));					//이메일


        SL_L_RDR_DUP_CHKDM dm = new SL_L_RDR_DUP_CHKDM();
        dm.setAccflag(accflag);
        dm.setMedicd(medicd);
        dm.setBocd(bocd);
        dm.setIncmgpers(incmgpers);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setRdrptph_no1(rdrptph_no1);
        dm.setRdrptph_no2(rdrptph_no2);
        dm.setRdrptph_no3(rdrptph_no3);
        dm.setPrn(prn);
        dm.setDlvzip(dlvzip);
        dm.setDlvaddr(dlvaddr);
        dm.setDlvdtlsaddr(dlvdtlsaddr);
        dm.setDlvdong(dlvdong);
        dm.setDlvser_no(dlvser_no);
        dm.setDlvbnji(dlvbnji);
        dm.setEmail(email);

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.dupChkRdrList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_RDR_DUP_CHKDataSet ds = null;

            ds = ejb.dupChkRdrList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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

    public void selectDsctList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_L_DSCTDataSet ds = null;
        //requesting parameters
        String bocd = Util.getSessionParameterValue(req, "bocd", true);                         //지국지사코드
        String reg_fr_dt = Util.checkString(req.getParameter("reg_fr_dt"));                     //등록일자(~에서)
        String reg_to_dt = Util.checkString(req.getParameter("reg_to_dt"));                     //등록일자(~까지)
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));                   //불편유형코드(구독불만유형코드)
        String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));                   //신청경로(10:독자우대,20:지국,30:TM,40:기타)
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));                       //지국처리여부("Y", "N")
        String search_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("search_cond")));   //검색조건('ALL', 'DSNO', 'NO', 'NM', 'TITLE', 'CONT')
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));   //검색어
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));             //현재페이지
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));         //페이지당 보여줄 건수

        // filtering
        // long type  "" --> "0"
        pageno		 =	("".equals(pageno		))? "1" : pageno      ;		//현재페이지
        pagesize	 =	("".equals(pagesize	 	))? "10": pagesize	  ;		//페이지당 보여줄 건수

        //setting dm
        SL_L_DSCTDM dm = new SL_L_DSCTDM();
        dm.setBocd(bocd);
        dm.setReg_fr_dt(reg_fr_dt);
        dm.setReg_to_dt(reg_to_dt);
        dm.setDscttypecd(dscttypecd);
        dm.setAcpnpathcd(acpnpathcd);
        dm.setBoprocyn(boprocyn);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader1100DAO dao = new SLReader1100DAO();
        ds = dao.selectDsctList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
        	
            SLReader1100EJB ejb = home.create();
            SL_L_DSCTDataSet ds = null;
            ds = ejb.selectDsctList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
