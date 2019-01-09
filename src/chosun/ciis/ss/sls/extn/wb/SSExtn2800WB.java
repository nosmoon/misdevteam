/***************************************************************************************************
 * 파일명 : SSExtn2800WB.java
 * 기능 : 센터비독자관리 Worker Bean
 * 작성일자 : 2013-06-27
 * 작성자 : 이혁
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ss.sls.brinfo.dao.SSBrinfo1000DAO;
import chosun.ciis.ss.sls.brinfo.dm.SS_L_BO_SRCH_INITDM;
import chosun.ciis.ss.sls.brinfo.ds.SS_L_BO_SRCH_INITDataSet;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * 확장현황-센터비독자관리를 위한 WB
 */

public class SSExtn2800WB {

    /**
     * 확장현황-센터비독자관리-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_TEAM_SRCH_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_TEAM_SRCH_INITDM dm = new SS_L_TEAM_SRCH_INITDM();
        
        SSExtn2800DAO dao = new SSExtn2800DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
    }
    
	/**
	 * 확장현황-센터비독자관리(조회) 조회된 request값을 set한다.
	 * 
	 * @param HttpServletRequest 	req
	 * @param HttpServletResponse	res
	 * @throws AppException
	 * 
	 * @return void
	 */
	public void selectRdrareaList(HttpServletRequest req, HttpServletResponse res) throws AppException {

		// parameter requesting 하고 DM에 값을 Setting //처리 FLAG(I:등록, U:수정, D:삭제,
		// E:확장)
		String deptcd = Util.checkString(req.getParameter("deptcd")); //팀코드
		String partcd = Util.checkString(req.getParameter("partcd")); //파트코드
		String areacd = Util.checkString(req.getParameter("areacd")); //지역코드
		String bocd = Util.checkString(req.getParameter("bocd")); //센터코드
//		String pageno = Util.checkString(req.getParameter("pageno")); // 페이지번호
//		String pagesize = Util.checkString(req.getParameter("pagesize")); // 페이지사이즈
		String rdr_regdt1 = Util.checkString(req.getParameter("rdr_regdt1")); // 검색기간1
		String rdr_regdt2 = Util.checkString(req.getParameter("rdr_regdt2")); // 검색기간2
		String search_flg = Util.checkString(req.getParameter("search_flg")); // 검색구분
		String medicd = Util.checkString(req.getParameter("medicd")); // 매체코드
		String search_nm = Util.Uni2Ksc(Util.checkString(req
				.getParameter("search_nm"))); // 검색명

		SS_L_RDR_RDRAREADM dm = new SS_L_RDR_RDRAREADM();

		System.out.println("===========================");
		System.out.println("deptcd: " + deptcd);
		System.out.println("partcd: " + partcd);
		System.out.println("areacd: " + areacd);
		System.out.println("bocd: " + bocd);
		System.out.println("===========================");
		
//		pageno = ("".equals(pageno)) ? "1" : pageno; // 'pageno'가 Null일경우 1을
		// 반환
//		pagesize = ("".equals(pagesize)) ? "20" : pagesize; // 'pagesize'가
		// Null일경우 20을 반환

		dm.setDeptcd(deptcd);
		dm.setPartcd(partcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
//		dm.setPageno(Long.parseLong(pageno));
//		dm.setPagesize(Long.parseLong(pagesize));
		dm.setRdr_regdt1(rdr_regdt1);
		dm.setRdr_regdt2(rdr_regdt2);
		dm.setSearch_flg(search_flg);
		dm.setMedicd(medicd);
		dm.setSearch_nm(search_nm);
		
		SSExtn2800DAO dao = new SSExtn2800DAO();
	    // DAO 객체의 init 호출
		SS_L_RDR_RDRAREADataSet ds = null;
	    ds = dao.selectRdrareaList(dm);
	    req.setAttribute("ds", ds);

	}
	
	/**
	 * 확장현황-센터비독자관리(상세조회) 조회된 request값을 set한다.
	 * 
	 * @param HttpServletRequest 	req
	 * @param HttpServletResponse	res
	 * @throws AppException
	 * 
	 * @return void
	 */	
	public void selectRdrareaDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {

		// parameter requesting 하고 DM에 값을 Setting
		String bocd = Util.checkString(req.getParameter("bocd")); // 지국지사코드
		String areardr_no = Util.checkString(req.getParameter("areardr_no")); // 지역독자번호

		SS_S_RDR_RDRAREADM dm = new SS_S_RDR_RDRAREADM();

		dm.setBocd(bocd);
		dm.setAreardr_no(areardr_no);

		SSExtn2800DAO dao = new SSExtn2800DAO();
		// DAO 객체의 init 호출
		SS_S_RDR_RDRAREADataSet ds = null;
	    ds = dao.selectRdrareaDetail(dm);
	    req.setAttribute("ds", ds);
	}
	
}

