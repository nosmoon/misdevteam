/***************************************************************************************************
* 파일명 : SSBrmgr11800WB.java_모바일용
* 기능 : 센터관리-투입률조사-아파트투입률을 위한 Worker Bean
* 작성일자 : 2017-01-13
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.util.*;				//추가
import java.lang.*;				//추가
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국경영-아파트투입률을 위한 WB
 */

public class SSBrmgr11800WB{

    /**
     * 아파트투입현황_주소코드리스트리턴_모바일용
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void mo_selectThrwList(HttpServletRequest req, HttpServletResponse res) throws AppException{

		// parameter requesting 하고 DM에 값을 Setting
		String bocd = req.getParameter("bocd"); // 지국지사코드
		String pageno = Util.checkString(req.getParameter("curr_page_no")); // 페이지번호
		String pagesize = Util.checkString(req.getParameter("records_per_page")); // 페이지사이즈
		String invsgdt1 = Util.checkString(req.getParameter("invsgdt1")); // 조사일자1
		String invsgdt2 = Util.checkString(req.getParameter("invsgdt2")); // 조사일자2
		String addrcd = Util.checkString(req.getParameter("addrcd")); // 주소코드

		SL_MO_L_COMM_APT_THRWDM dm = new SL_MO_L_COMM_APT_THRWDM();

		pageno = ("".equals(pageno)) ? "1" : pageno; // 'pageno'가 Null일경우 1을
		// 반환
		pagesize = ("".equals(pagesize)) ? "100" : pagesize; // 'pagesize'가
		// Null일경우 20을 반환

		dm.setBocd(bocd);
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));
		dm.setInvsgdt1(invsgdt1);
		dm.setInvsgdt2(invsgdt2);
		dm.setAddrcd(addrcd);

		dm.print();

    	SL_MO_L_COMM_APT_THRWDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO 객체의 initApt 호출
		ds = dao.mo_selectThrwList(dm);
		req.setAttribute("ds", ds);

    }


    /**
     * 아파트투입현황_주소코드에 해당하는 동 리스트리턴_모바일용
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
	public void mo_selectDtladdrList(HttpServletRequest req,   //모바일용
			HttpServletResponse res) throws AppException, SysException {


		String bocd = req.getParameter("bocd"); // 지국지사코드
		String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd"))); // 주소코드
		String sPageNo = req.getParameter("curr_page_no"); // 현재페이지
		String records_per_page = req.getParameter("records_per_page"); //주석처리함. 20160826

		SL_L_DTLSADDRDM dm = new SL_L_DTLSADDRDM();

		int iPageSize = 100; //동리스트를 모두가져오기 위해 100으로 설정해놓음. 20161121
		int iPageNo = 1; // 최초 페이지 1로 설정
		if (sPageNo != null && !sPageNo.equals("")) { // 페이지 값이 있으면 재설정
			iPageNo = Integer.parseInt(sPageNo);
		}

		// dm에 값을 Setting한다.
		dm.setBocd(bocd); // 지국지사코드
		dm.setAddrcd(addrcd); // 주소코드
		dm.setPageno(iPageNo); // 현재페이지
		dm.setPagesize(iPageSize); // 페이지당 Row수

		SL_L_DTLSADDRDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO 객체의 initApt 호출
		ds = dao.mo_selectDtladdrList(dm);
		req.setAttribute("ds", ds);
	}

	/**
	 * 배달카드(해당센터의 아파트 구독현황 조회)_모바일용
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
	public void mo_selectAptdlvList(HttpServletRequest req, HttpServletResponse res) //모바일용_모바일만존재함.
			throws AppException {

		// parameter requesting 하고 DM에 값을 Setting
		String bocd = Util.checkString(req.getParameter("bocd")); // 지국지사코드
		String medicd = Util.checkString(req.getParameter("medicd")); // 매체코드  없어도 무관
		String addrcd = Util.checkString(req.getParameter("addrcd")); // 주소코드
		String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno"))); // 동번호
		String stho = Util.checkString(req.getParameter("stho"));//시작호수
		String edho = Util.checkString(req.getParameter("edho"));//끝호수

		stho = ("".equals(stho))?"0":stho;
		edho = ("".equals(edho))?"0":edho;

		SS_L_APTDLV_LISTDM dm = new SS_L_APTDLV_LISTDM();

		dm.setBocd(bocd);
		dm.setMedicd(medicd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);
		dm.setStho(Long.parseLong(stho));
		dm.setEdho(Long.parseLong(edho));

		//dm.print();

		SS_L_APTDLV_LISTDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO 객체의 initApt 호출
		ds = dao.mo_selectAptdlvList(dm);
		req.setAttribute("ds", ds);
	}


	/**
	 * //아파트투입률조회(아파트형태리스트 or 투입률등록리스트)_모바일만존재
	 *
	 * @param HttpServletRequest
	 *            req
	 * @param HttpServletResponse
	 *            res
	 * @throws AppException
	 */
	public void mo_selectAptrchList(HttpServletRequest req, HttpServletResponse res)
			throws AppException {

		// parameter requesting 하고 DM에 값을 Setting
		String bocd = Util.checkString(req.getParameter("bocd"));
		String addrcd = Util.checkString(req.getParameter("addrcd"));
		String dongno = Util.checkString(req.getParameter("dongno"));
		String ivstdt = Util.checkString(req.getParameter("ivstdt"));
		String ivstpers = Util.checkString(req.getParameter("ivstpers"));

		SS_MO_L_APTINPIVSTDM dm = new SS_MO_L_APTINPIVSTDM();

		dm.setBocd(bocd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);
		dm.setIvstdt(ivstdt);
		dm.setIvstpers(ivstpers);

		dm.print();

		SS_MO_L_APTINPIVSTDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO 객체의 initApt 호출
		ds = dao.mo_selectAptrchList(dm);
		req.setAttribute("ds", ds);
	}


	/**
	 * //아파트의 정보, 투입률조사에 필요한 매체리스트_모바일만존재
	 *
	 * @param HttpServletRequest
	 *            req
	 * @param HttpServletResponse
	 *            res
	 * @throws AppException
	 */
	public void mo_selectAptinfoList(HttpServletRequest req, HttpServletResponse res) //모바일용
			throws AppException {

		// parameter requesting 하고 DM에 값을 Setting
		String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
		String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
		String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));

		SL_MO_L_INPIVSTINFODM dm = new SL_MO_L_INPIVSTINFODM();

		dm.setBocd(bocd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);

		dm.print();

		SL_MO_L_INPIVSTINFODataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO 객체의 initApt 호출
		ds = dao.mo_selectAptinfoList(dm);
		req.setAttribute("ds", ds);
	}

	/**
	 * 아파트투입현황(상세보기) 조회된 request값을 set한다.
	 *
	 * @param HttpServletRequest
	 *            req
	 * @param HttpServletResponse
	 *            res
	 * @throws AppException
	 */
	public void mo_accessThrw(HttpServletRequest req, HttpServletResponse res) //모바일용
			throws AppException {

		// parameter requesting 하고 DM에 값을 Setting
		String accflag = Util.checkString(req.getParameter("accflag"));
		String bocd = Util.checkString(req.getParameter("bocd"));
		String addrcd = Util.checkString(req.getParameter("addrcd"));
		String dongno = Util.checkString(req.getParameter("dongno"));
		String pyong1 = Util.checkString(req.getParameter("pyong1"));
		String hoscnt1 = Util.checkString(req.getParameter("hoscnt1"));
		String pyong2 = Util.checkString(req.getParameter("pyong2"));
		String hoscnt2 = Util.checkString(req.getParameter("hoscnt2"));
		String pyong3 = Util.checkString(req.getParameter("pyong3"));
		String hoscnt3 = Util.checkString(req.getParameter("hoscnt3"));
		String invsgdt = Util.checkString(req.getParameter("invsgdt"));
		String invsgno = Util.checkString(req.getParameter("invsgno"));
		String incmgpers = Util.checkString(req.getParameter("incmgpers"));
		String housval = Util.checkString(req.getParameter("housval"));
		String regtype1 = Util.checkString(req.getParameter("regtype1"));
		String regtype2 = Util.checkString(req.getParameter("regtype2"));
		String aptfloor = Util.checkString(req.getParameter("aptfloor"));
		String aptho = Util.checkString(req.getParameter("aptho"));

		SL_MO_A_COMM_APT_THRWDM dm = new SL_MO_A_COMM_APT_THRWDM();

		dm.setAccflag(accflag);
		dm.setBocd(bocd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);
		dm.setPyong1(Long.parseLong(Util.convertNull(pyong1, "0")));
		dm.setHoscnt1(Long.parseLong(Util.convertNull(hoscnt1, "0")));
		dm.setPyong2(Long.parseLong(Util.convertNull(pyong2, "0")));
		dm.setHoscnt2(Long.parseLong(Util.convertNull(hoscnt2, "0")));
		dm.setPyong3(Long.parseLong(Util.convertNull(pyong3, "0")));
		dm.setHoscnt3(Long.parseLong(Util.convertNull(hoscnt3, "0")));
		dm.setInvsgdt(invsgdt);
		dm.setInvsgno(invsgno);
		dm.setIncmgpers(incmgpers);
		dm.setHousval(housval);
		dm.setRegtype1(regtype1);
		dm.setRegtype2(regtype2);
		dm.setAptfloor(aptfloor);
		dm.setAptho(aptho);
		dm.print();

		SL_MO_A_COMM_APT_THRWDataSet ds = null;

        SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO 객체의 initApt 호출
		ds = dao.mo_accessThrw(dm);
		req.setAttribute("ds", ds);
	}

	/**
	 * 센터관리-투입률조사-현황검색
	 *
	 * @param HttpServletRequest
	 *            req
	 * @param HttpServletResponse
	 *            res
	 * @throws AppException
	 */
	public void mo_selectThrwResult(HttpServletRequest req, HttpServletResponse res) //모바일용
			throws AppException {

		// parameter requesting 하고 DM에 값을 Setting
		String invsgdt1 = Util.checkString(req.getParameter("invsgdt1"));
		String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
		String deptcd = Util.checkString(req.getParameter("deptcd"));
		String partcd = Util.checkString(req.getParameter("partcd"));
		String areacd = Util.checkString(req.getParameter("areacd"));
		String bocd = Util.checkString(req.getParameter("bocd"));
		String addrcd = Util.checkString(req.getParameter("addrcd"));
		String dongno = Util.checkString(req.getParameter("dongno"));
		String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));

		SS_MO_L_COMM_APT_RESULTDM dm = new SS_MO_L_COMM_APT_RESULTDM();

		dm.setInvsgdt1(invsgdt1);
		dm.setInvsgdt2(invsgdt2);
		dm.setDeptcd(deptcd);
		dm.setPartcd(partcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
		dm.setAddrcd(addrcd);
		dm.setDongno(dongno);
		dm.setIncmg_pers(incmg_pers);
		dm.print();

		SS_MO_L_COMM_APT_RESULTDataSet ds = null;

		SSBrmgr11800DAO dao = new SSBrmgr11800DAO();
		// DAO 객체의 initApt 호출
		ds = dao.mo_selectThrwResult(dm);
		req.setAttribute("ds", ds);
	}


}
