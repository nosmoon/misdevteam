/***************************************************************************************************
* 파일명 : SSReader1100WB.java
* 기능 : 독자현황-독자불편 처리를 위한 Worker Bean
* 작성일자 : 2004-01-12
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

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
import chosun.ciis.ss.sls.move.dao.SSMove1000DAO;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDRDM;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDR_INITDM;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDRDataSet;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDR_INITDataSet;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dao.SSCommon1100DAO;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-독자불편 위한 WB
 */

public class SSReader11100WB{

    /**
     * 독자현황-독자불편-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void mo_selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{ //모바일
        SS_L_RDR_DSCT_INITDataSet ds = null;
        SS_L_RDR_DSCT_INITDM dm = new SS_L_RDR_DSCT_INITDM();

        SSReader11100DAO dao = new SSReader11100DAO();
		// DAO 객체의 selectInitList 호출
		ds = dao.mo_selectInitList(dm);
		req.setAttribute("ds", ds);

    }

    /**
     * 독자현황-독자불편 조회(리스트)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void mo_selectRdrDsctList(HttpServletRequest req, HttpServletResponse res) throws AppException{ //모바일

        SS_MO_L_RDR_DSCTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //부서코드
        String partcd = Util.checkString(req.getParameter("partcd"));  //부서코드
        String areacd = Util.checkString(req.getParameter("areacd"));  //지역코드
        String bocd = Util.checkString(req.getParameter("bocd"));      //지국코드
        String bonm = Util.checkString(req.getParameter("bonm"));      //센터명
        String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));  //경로코드
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));  //기간선택종류
        String frdt = Util.checkString(req.getParameter("frdt")); //시작일
        String todt = Util.checkString(req.getParameter("todt")); //종료일
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm"))); //독자명
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no"))); //독자번호
        String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl"))); //제목
        String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont"))); //내용
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));  //지국지사확인상태
        String boprocyn = Util.checkString(req.getParameter("boprocyn"));  //지국지사처리여부 (Y:처리, N:미처리)
        String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));  //구독불만유형 코드

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
        String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));

        // DM Setting

        SS_MO_L_RDR_DSCTDM dm = new SS_MO_L_RDR_DSCTDM();
        dm.setDeptcd(deptcd);  //부서코드
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);  //지역코드
        dm.setBocd(bocd);      //지국코드
        dm.setBonm(bonm);	//센터명
        dm.setFromtogb(fromtogb);  //기간종류
        dm.setFrdt(frdt);   //시작일
        dm.setTodt(todt);   //종료일
        dm.setRdrnm(rdrnm); //독자명
        dm.setRdr_no(rdr_no); //독자번호
        dm.setTitl(titl); //제목
        dm.setCont(cont); //내용
        dm.setBocnfmyn(bocnfmyn);  //지국지사확인상태
        dm.setBoprocyn(boprocyn);  //지국지사처리여부 (Y:처리, N:미처리)
        dm.setAcpnpathcd(acpnpathcd);  //경로코드
        dm.setDscttypecd(dscttypecd);  //구독불만유형 코드
        dm.setPageno(Long.parseLong(pageno));  //페이지번호
        dm.setPagesize(Long.parseLong(pagesize));  //페이지사이즈
        dm.setCns_empnm(cns_empnm);
        dm.setProcpers(procpers);

        dm.print();

        SSReader11100DAO dao = new SSReader11100DAO();
		// DAO 객체의 selectRdrDsctList 호출
		ds = dao.mo_selectRdrDsctList(dm);
		req.setAttribute("ds", ds);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);

    }

    /**
     * 독자현황-독자불편-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void mo_selectRdrDsctDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{ //모바일용
        SS_S_RDR_DSCTDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_RDR_DSCTDM dm = new SS_S_RDR_DSCTDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSReader11100DAO dao = new SSReader11100DAO();
		// DAO 객체의 selectRdrDsctDetail 호출
		ds = dao.mo_selectRdrDsctDetail(dm);
		req.setAttribute("ds", ds);

    }

}
