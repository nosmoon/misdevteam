/***************************************************************************************************
* 파일명   : SSExtn2500WB.java
* 기능     : 확장현황 본사확장 페이지를 위한 Worker Bean
* 작성일자 : 2009-05-20
* 작성자   : 권정윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
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
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 확장현황 본사확장 페이지를 위한 WB
 */

public class SSExtn2500WB{
	
    /**
     * /확장현황-단체확장-업로드
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void uploadExtn(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_I_EXTN_PATYRDR_NEWDataSet ds = null;
    	
    	//String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);   
    	
    	String uid = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
    	String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
    	String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
    	//String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
    	String dept_nm = "";
    	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
    	String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
    	String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
    	String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
    	String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
    	String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
    	String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
    	String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
    	String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
    	String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
    	String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
    	String svccd = Util.Uni2Ksc(Util.checkString(req.getParameter("svccd")));
    	String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
    	String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
    	String extnempseq = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
    	String aplcpersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpersnm")));
    	String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
    	String delyn = Util.Uni2Ksc(Util.checkString(req.getParameter("delyn")));    	
    	String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
    	String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
    	
    	System.out.println("extndt "+extndt);
    	System.out.println("extnflnm "+extnflnm);
    	System.out.println("rdrnm "+rdrnm);
    	System.out.println("rdrtel_no1 "+rdrtel_no1);
    	System.out.println("rdrptph_no1 "+rdrptph_no1);
    	System.out.println("dlvzip "+dlvzip);
    	System.out.println("dlvaddr "+dlvaddr);
    	System.out.println("dlvdtlsaddr "+dlvdtlsaddr);
    	System.out.println("corrbocd "+corrbocd);
    	System.out.println("svccd "+svccd);
    	System.out.println("remk "+remk);
    	System.out.println("qty "+qty);
    	System.out.println("extnempseq "+extnempseq);
    	System.out.println("aplcpersnm "+aplcpersnm);
    	System.out.println("dlvhopedt "+dlvhopedt);
    	System.out.println("delyn "+delyn);
    	System.out.println("prn "+prn);
    	System.out.println("cmpycd "+cmpycd);
        // DM Setting
    	SS_I_EXTN_PATYRDR_NEWDM dm = new SS_I_EXTN_PATYRDR_NEWDM();
    	
    	dm.setUid(uid);
    	dm.setExtndt(extndt);
    	dm.setExtnflnm(extnflnm);
    	dm.setDept_nm(dept_nm);
    	dm.setRdrnm(rdrnm);
    	dm.setRdrtel_no1(rdrtel_no1);
    	dm.setRdrtel_no2(rdrtel_no2);
    	dm.setRdrtel_no3(rdrtel_no3);
    	dm.setRdrptph_no1(rdrptph_no1);
    	dm.setRdrptph_no2(rdrptph_no2);
    	dm.setRdrptph_no3(rdrptph_no3);
    	dm.setDlvzip(dlvzip);
    	dm.setDlvaddr(dlvaddr);
    	dm.setDlvdtlsaddr(dlvdtlsaddr);
    	dm.setCorrbocd(corrbocd);
    	dm.setSvccd(svccd);
    	dm.setRemk(remk);
    	dm.setQty(qty);
    	dm.setExtnempseq(extnempseq);
    	dm.setAplcpersnm(aplcpersnm);
    	dm.setDlvhopedt(dlvhopedt);
    	dm.setDelyn(delyn);
    	dm.setPrn(prn);
    	dm.setCmpycd(cmpycd);
    	
    	SSExtn2500DAO dao = new SSExtn2500DAO();
        // DAO 객체의 initApt 호출
        ds = dao.uploadExtn(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.uploadExtn(dm);
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
     * /확장현황-단체확장-확장자 조회
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void getUserInfo(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_L_EXTN_PATY_NEWDataSet ds = null;
    	
    	String srch_word = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_word")));
    	
        // DM Setting
    	SS_L_EXTN_PATY_NEWDM dm = new SS_L_EXTN_PATY_NEWDM();
    	dm.setSrch_word(srch_word);

    	SSExtn2500DAO dao = new SSExtn2500DAO();
        // DAO 객체의 initApt 호출
        ds = dao.getUserInfo(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn2100EJBHome home = (SSExtn2100EJBHome)JNDIManager.getInstance().getHome("SSExtn2100EJB");
        try{
                SSExtn2100EJB ejb = home.create();
                ds = ejb.getUserInfo(dm);
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
