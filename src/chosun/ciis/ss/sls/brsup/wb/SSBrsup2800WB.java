/***************************************************************************************************
 * 파일명 : SSBrsup2800WB.java
 * 기능 : 센터지원-판촉현황-요원관리-13개월실적
 * 작성일자 : 2016-05-03
 * 작성자 : 심정보
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
 * 센터지원-판촉현황-요원관리-13개월실적
 */

public class SSBrsup2800WB {

    /**
     * 센터지원-판촉현황-요원관리-13개월실적-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initBrsup2800(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_SLS_BRSUP_2800_ADataSet ds = null;    	
    	SS_SLS_BRSUP_2800_ADM dm = new SS_SLS_BRSUP_2800_ADM();    	
        SSBrsup2800DAO dao = new SSBrsup2800DAO();        
        ds = dao.initBrsup2800(dm);
        req.setAttribute("ds", ds);
    }
    
    public void searchBrsup2810(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
        String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
        String stafno = Util.checkString(req.getParameter("stafno"));
        String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
        String prn = Util.checkString(req.getParameter("prn"));
        String ernno = Util.checkString(req.getParameter("ernno"));
        String yymm = Util.checkString(req.getParameter("yymm"));
	    
        SS_SLS_BRSUP_2810_LDM dm = new  SS_SLS_BRSUP_2810_LDM();
		
        dm.setStafclsfcd(stafclsfcd);
        dm.setCntrstatcd(cntrstatcd);
        dm.setStafno(stafno);
        dm.setStafnm(stafnm);
        dm.setPrn(prn);
        dm.setErnno(ernno);
        dm.setYymm(yymm);
		
		dm.print();
		
		SS_SLS_BRSUP_2810_LDataSet ds = null;
		
		SSBrsup2800DAO dao = new SSBrsup2800DAO();       
		ds = dao.searchBrsup2810(dm);
		req.setAttribute("ds", ds);
    }
}