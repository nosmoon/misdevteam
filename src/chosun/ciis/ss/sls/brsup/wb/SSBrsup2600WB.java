/***************************************************************************************************
 * 파일명 : SSBrsup2600WB.java
 * 기능 : 지국지원-빌링_자동이체-이체신청개선
 * 작성일자 : 2009-05-20
 * 작성자 : 김용욱
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;

import java.rmi.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국지원-빌링_자동이체-이체신청개선 위한 Worker Bean
 */

public class SSBrsup2600WB {

    /**
     * 지국지원-빌링_자동이체-이체신청개선-조회화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void listSearchTransfer(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_SHFTAPLCDataSet ds = null;
   	
        // Request Parameter Processing
    	String aplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclsf")));
    	String search_word_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word_kind")));
		String fromdata = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdata")));
		String todata = Util.Uni2Ksc(Util.checkString(req.getParameter("todata")));
		
    	// DM Setting
        SS_L_SHFTAPLCDM dm = new SS_L_SHFTAPLCDM();

        dm.setAplcclsf(aplcclsf);
        dm.setSearch_word_kind(search_word_kind);
        dm.setFromdata(fromdata);
        dm.setTodata(todata);
        
        SSBrsup2600DAO dao = new SSBrsup2600DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.listSearchTransfer(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2600EJBHome home = (SSBrsup2600EJBHome)JNDIManager.getInstance().getHome("SSBrsup2600EJB");
        try{
            SSBrsup2600EJB ejb = home.create();
            ds = ejb.listSearchTransfer(dm);
            req.setAttribute("ds", ds);
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
     * 지국지원-빌링_자동이체-이체신청개선-상세조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void detailSearchTransfer(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_SHFTAPLCDataSet ds = null;
        // Request Parameter Processing
    	
		String sysid = Util.Uni2Ksc(Util.checkString(req.getParameter("sysid")));
		String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
		String svctype = Util.Uni2Ksc(Util.checkString(req.getParameter("svctype")));
		String aplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclsf")));
		// DM Setting
		SS_S_SHFTAPLCDM dm = new SS_S_SHFTAPLCDM();
		
		dm.setSysid(sysid);
		dm.setBasidt(basidt);
		dm.setSvctype(svctype);
		dm.setAplcclsf(aplcclsf);
		
		SSBrsup2600DAO dao = new SSBrsup2600DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.detailSearchTransfer(dm);
        req.setAttribute("ds", ds);
	
        /*
        SSBrsup2600EJBHome home = (SSBrsup2600EJBHome)JNDIManager.getInstance().getHome("SSBrsup2600EJB");
        try{
            SSBrsup2600EJB ejb = home.create();
            ds = ejb.detailSearchTransfer(dm);
            req.setAttribute("ds", ds);
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
     * 지국지원-빌링_자동이체-이체신청개선 업로드(이체신청내역 엑셀문서 일괄등록)  
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void uploadSearchTransfer(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_SHFTAPLC_UPLOADDataSet ds = null;
        // Request Parameter Processing
    	String uid = Util.getSessionParameterValue(req, "uid", true);
    	
    	String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
    	String procdt = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt")));
    	String procstat = Util.Uni2Ksc(Util.checkString(req.getParameter("procstat")));
    	String proccnt = Util.Uni2Ksc(Util.checkString(req.getParameter("proccnt")));
    	String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
    	String svctype = Util.Uni2Ksc(Util.checkString(req.getParameter("svctype")));
    	String aplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclsf")));
    	String insttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("insttcd")));
    	String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
    	String shftaplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftaplcclsf")));
    	String pymtno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtno1")));
    	String pymtno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtno2")));
    	String pymthopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("pymthopedt")));
    	String feekind = Util.Uni2Ksc(Util.checkString(req.getParameter("feekind")));
    	String recpinstt = Util.Uni2Ksc(Util.checkString(req.getParameter("recpinstt")));
    	String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
    	String vdtydt = Util.Uni2Ksc(Util.checkString(req.getParameter("vdtydt")));
    	String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
    	String nm = Util.Uni2Ksc(Util.checkString(req.getParameter("nm")));
    	String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
    	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
    	String rdrtel = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel")));
    	String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));
    	String zipseq = Util.Uni2Ksc(Util.checkString(req.getParameter("zipseq")));
    	String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
    	String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
    	String zip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip3")));
    	String dlvplacno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvplacno")));
    	String brchptel = Util.Uni2Ksc(Util.checkString(req.getParameter("brchptel")));
    	String reqbrchcd = Util.Uni2Ksc(Util.checkString(req.getParameter("reqbrchcd")));
    	String fststrtdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fststrtdt")));
    	String reqplacclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("reqplacclsf")));
    	String elecreqno = Util.Uni2Ksc(Util.checkString(req.getParameter("elecreqno")));
    	String ocomcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ocomcd")));
    	String ocomresn = Util.Uni2Ksc(Util.checkString(req.getParameter("ocomresn")));
    	String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
		// DM Setting
		SS_L_SHFTAPLC_UPLOADDM dm = new SS_L_SHFTAPLC_UPLOADDM();
		
		dm.setUid(uid);
		dm.setFilenm(filenm);
		dm.setProcdt(procdt);
		dm.setProcstat(procstat);
		dm.setProccnt(proccnt);
		dm.setBasidt(basidt);
		dm.setSvctype(svctype);
		dm.setAplcclsf(aplcclsf);
		dm.setInsttcd(insttcd);
		dm.setAplcdt(aplcdt);
		dm.setShftaplcclsf(shftaplcclsf);
		dm.setPymtno1(pymtno1);
		dm.setPymtno2(pymtno2);
		dm.setPymthopedt(pymthopedt);
		dm.setFeekind(feekind);
		dm.setRecpinstt(recpinstt);
		dm.setAcctno(acctno);
		dm.setVdtydt(vdtydt);
		dm.setPrn(prn);
		dm.setNm(nm);
		dm.setTel_no(tel_no);
		dm.setRdrnm(rdrnm);
		dm.setRdrtel(rdrtel);
		dm.setRdrprn(rdrprn);
		dm.setZipseq(zipseq);
		dm.setZip1(zip1);
		dm.setZip2(zip2);
		dm.setZip3(zip3);
		dm.setDlvplacno(dlvplacno);
		dm.setBrchptel(brchptel);
		dm.setReqbrchcd(reqbrchcd);
		dm.setFststrtdt(fststrtdt);
		dm.setReqplacclsf(reqplacclsf);
		dm.setElecreqno(elecreqno);
		dm.setOcomcd(ocomcd);
		dm.setOcomresn(ocomresn);
		dm.setRemk(remk);
		
		SSBrsup2600DAO dao = new SSBrsup2600DAO();
        // DAO 객체의 selectPromStafISList 호출
        ds = dao.uploadSearchTransfer(dm);
        req.setAttribute("ds", ds);
	
        /*
        SSBrsup2600EJBHome home = (SSBrsup2600EJBHome)JNDIManager.getInstance().getHome("SSBrsup2600EJB");
        try{
            SSBrsup2600EJB ejb = home.create();
            ds = ejb.uploadSearchTransfer(dm);
            req.setAttribute("ds", ds);
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