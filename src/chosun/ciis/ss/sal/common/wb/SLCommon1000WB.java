/**************************************************************************************************
* 파일명    : SLCommon1000WB.java
* 기능      : Servlet에서 받은 parameter를 이용하여 dm을 set하고
*             EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
* 작성일자  : 2003-11-19
* 작성자    : 김영윤
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/
package chosun.ciis.ss.sal.common.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.dao.*;

/**
 * Servlet에서 받은 parameter를 이용하여 dm을 set하고
 * EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
 */
public class SLCommon1000WB{

    /**
     * 우편번호검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectZipList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	CO_L_ZIPDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.checkString(req.getParameter("bocd"));					//지국지사코드
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//동명
        String zip = Util.checkString(req.getParameter("zip"));						//우편번호
        String pageno = Util.checkString(req.getParameter("pageno"));				//현재 페이지
        String pagesize = Util.checkString(req.getParameter("pagesize"));			//페이지사이즈

        CO_L_ZIPDM dm = new CO_L_ZIPDM();
        dm.setBocd(bocd); // 지국지사코드
        dm.setZip(zip);
        dm.setAddr3(addr3);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectZipList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            CO_L_ZIPDataSet ds = null;
            ds = ejb.selectZipList(dm); // 설정된 dm값으로 EJB를 호출
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
     * 독자검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectReaderDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_RDR_DTLS_SECHDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);								//지국지사코드
        String search_order = Util.checkString(req.getParameter("search_order"));				//검색정렬조건
        String search_ad = Util.checkString(req.getParameter("search_ad"));						//검색정렬구분(ASC, DSC)(확장시 이용할것)
        String search_cond = Util.checkString(req.getParameter("search_cond"));					//검색조건
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));	//검색어
        String search_stop = Util.checkString(req.getParameter("search_stop"));					//중지독자포함여부(확장시 이용할것)
		String search_sg = Util.checkString(req.getParameter("search_sg"));						//검색정렬구분(ASC, DSC)(확장시 이용할것)
        String pageno = Util.checkString(req.getParameter("pageno"));							//현재 페이지
        String pagesize = Util.checkString(req.getParameter("pagesize"));						//페이지사이즈

        SL_L_RDR_DTLS_SECHDM dm = new SL_L_RDR_DTLS_SECHDM();

        dm.setBocd(bocd);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setSearch_stop(search_stop);
		dm.setSearch_sg(search_sg);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectReaderDetailList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_RDR_DTLS_SECHDataSet ds = null;
            ds = ejb.selectReaderDetailList(dm); // 설정된 dm값으로 EJB를 호출
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
     * 독자검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectReaderList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_READER_01DataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);                               //지국지사코드
        String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));                   //확장일자
        String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));                   //확장번호
        String search_order = Util.checkString(req.getParameter("search_order"));               //정렬조건
        String search_ad = Util.checkString(req.getParameter("search_ad"));                     //검색 ASC, DESC
        String search_cond = Util.checkString(req.getParameter("search_cond"));                 //검색조건
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));   //검색어
        String search_stop = Util.checkString(req.getParameter("search_stop"));                 //중지독자검색 포함
        String pageno = Util.checkString(req.getParameter("pageno"));                           //페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));                       //페이지사이즈

        //filtering
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "1000" : pagesize;


        SL_L_READER_01DM dm = new SL_L_READER_01DM();
        dm.setBocd(bocd);
        dm.setRdr_extndt(rdr_extndt);
        dm.setRdr_extnno(rdr_extnno);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setSearch_stop(search_stop);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectReaderList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_READER_01DataSet ds = null;
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
     * 확장자검색(초기화면)
     * 확장자 소속 코드를 조회하여 select box를 구성한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectExtnBlngCdList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	CO_L_TAOCC_CDVDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String ciymgbcd = "97";   //업무구분 : 지국지사공통
        String cicdgb = "240";    //코드구분 : 확장자소속
        String cimgtcd1 = "ALL";  //관리항복1
        String cimgtcd2 = "Y";    //관리항목2
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

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectCommCdList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            CO_L_TAOCC_CDVDataSet ds = null;
            ds = ejb.selectCommCdList(dm); // 설정된 dm값으로 EJB를 호출
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
     * 확장자검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectExtnPersList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_EXTNPERSDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);				//지국지사코드
        String extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("extntypecd")));	//확장유형코드
        String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));	//확장자소속코드
        String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));			//고유번호
        String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));				//확장자명(검색어)
        String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));				//주민등록번호
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));			//현재 페이지
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));		//페이지사이즈

        SL_L_EXTNPERSDM dm = new SL_L_EXTNPERSDM();

        //dm.setBocd(bocd); // 지국지사코드
        dm.setBocd(bocd);
        dm.setExtntypecd(extntypecd);
        dm.setExtnblngcd(extnblngcd);
        dm.setStafno(stafno);
        dm.setName(name);
        dm.setPrn(prn);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectExtnPersList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_EXTNPERSDataSet ds = null;
            ds = ejb.selectExtnPersList(dm); // 설정된 dm값으로 EJB를 호출
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
     * 공통코드 상위코드 선택
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectClsfCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_EXTNPERSDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String sBocd = Util.getSessionParameterValue(req, "bocd", true); // 지국지사코드
        SL_L_EXTNPERSDM dm = new SL_L_EXTNPERSDM();

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectExtnPersList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding

        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_EXTNPERSDataSet ds = null;
            ds = ejb.selectExtnPersList(dm); // 설정된 dm값으로 EJB를 호출
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
     * 지국검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectBranchOfficeList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_BO_SRCHDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bonm = Util.Uni2Euc(Util.checkString(req.getParameter("bonm")));
        String addr3 = Util.Uni2Euc(Util.checkString(req.getParameter("addr3")));
        SL_L_BO_SRCHDM dm = new SL_L_BO_SRCHDM();

        dm.setBonm(bonm);
        dm.setAddr3(addr3);
        
        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectBranchOfficeList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_BO_SRCHDataSet ds = null;
            ds = ejb.selectBranchOfficeList(dm); // 설정된 dm값으로 EJB를 호출
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
     * 판촉물코드검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectBnsItemCdList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_BNSITEMDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));	//판촉물코드
        String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemnm")));	//판촉물명
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));			//현재 페이지
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));		//페이지사이즈

        SL_L_BNSITEMDM dm = new SL_L_BNSITEMDM();
        dm.setBns_itemcd(bns_itemcd);
        dm.setBns_itemnm(bns_itemnm);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectBnsItemCdList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_BNSITEMDataSet ds = null;
            ds = ejb.selectBnsItemCdList(dm); // 설정된 dm값으로 EJB를 호출
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
     * 지국취급매체(목록조회)
     * 검색조건으로써 iframe에서 call하는 것을 원칙으로 한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectBoHndlMediList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_BOMEDIDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드

        SL_L_BOMEDIDM dm = new SL_L_BOMEDIDM();

        dm.setBocd(bocd);

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectBoHndlMediList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_BOMEDIDataSet ds = null;
            ds = ejb.selectBoHndlMediList(dm); // 설정된 dm값으로 EJB를 호출
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
	 * 공통-실행내역관리
	 * 검색조건으로써 iframe에서 call하는 것을 원칙으로 한다.
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 * @throws AppException
	 * @throws SysException
	 */
	public void activeRunLog(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
		CO_A_RUNLOGDataSet ds = null;
		// parameter requesting 하고  DM에 값을 Setting
		String bocd = Util.getSessionParameterValue(req, "bocd", true);		//지국지사코드
		String accflag = Util.checkString(req.getParameter("accflag"));
		String objnm = Util.checkString(req.getParameter("objnm"));
		String seq = Util.checkString(req.getParameter("seq"));
		String status = Util.checkString(req.getParameter("status"));

		System.out.println(bocd);

		CO_A_RUNLOGDM dm = new CO_A_RUNLOGDM();

		System.out.println("["+bocd+":"+accflag+":"+objnm+":"+seq+":"+status+"]");

		dm.setAccflag(accflag);
		dm.setBocd(bocd);
		dm.setObjnm(objnm);
		dm.setSeq(seq);
		dm.setStatus(status);

		SLCommon1000DAO dao = new SLCommon1000DAO();
		ds = dao.activeRunLog(dm);
		req.setAttribute("ds", ds); // request에 결과값을 Binding
		
		/*
		// JNDI lookup 을 통해 EJB Home interface 객체생성
		SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
		try{
			SLCommon1000EJB ejb = home.create();
			CO_A_RUNLOGDataSet ds = null;
			ds = ejb.activeRunLog(dm); // 설정된 dm값으로 EJB를 호출
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
     * 해당지국 지국 구역목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectDsctList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_DSTCINFOCDDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true); // 지국지사코드
        SL_L_DSTCINFOCDDM dm = new SL_L_DSTCINFOCDDM();

        dm.setBocd(bocd);

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectDsctList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
        
        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_DSTCINFOCDDataSet ds = null;
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

    /**
         * 공통-통합 회원 서비스 조회 검색조건으로써 iframe에서 call하는 것을 원칙으로 한다.
         *
         * @param dm
         *         CO_S_RDR_SERVICEDM 객체
         * @return CO_S_RDR_SERVICEDataSet 객체
         * @throws AppException
         */
        public void selectRDR_SERVICE(HttpServletRequest req,
                HttpServletResponse res) throws AppException, SysException {
        	CO_S_RDR_SERVICEDataSet ds = null;
            // parameter requesting 하고 DM에 값을 Setting
            String rdr_no = Util.checkString(req.getParameter("rdr_no"));
            String medicd = Util.checkString(req.getParameter("medicd"));

            CO_S_RDR_SERVICEDM dm = new CO_S_RDR_SERVICEDM();

            dm.setRdr_no(rdr_no);
            dm.setMedicd(medicd);
            
            SLCommon1000DAO dao = new SLCommon1000DAO();
            ds = dao.selectRDR_SERVICE(dm);
            req.setAttribute("ds", ds); // request에 결과값을 Binding

            /*
            // JNDI lookup 을 통해 EJB Home interface 객체생성
            SLCommon1000EJBHome home = (SLCommon1000EJBHome) JNDIManager
                    .getInstance().getHome("SLCommon1000EJB");
            try {
                SLCommon1000EJB ejb = home.create();
                CO_S_RDR_SERVICEDataSet ds = null;
                ds = ejb.selectRDR_SERVICE(dm); // 설정된 dm값으로 EJB를 호출
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
}
