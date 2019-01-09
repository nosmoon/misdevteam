/***************************************************************************************************
* 파일명 : SSExtn3800WB.java
* 기능 : 마감후 중지취소 조회
* 작성일자 : 2015-11-10
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

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
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * WB
 */

public class SSExtn3800WB{

    /**
     * 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn3800(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_3800_ADataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_3800_ADM dm = new SS_SLS_EXTN_3800_ADM();
         dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn3800DAO dao = new SSExtn3800DAO();         
         ds = dao.initExtn3800(dm);
         req.setAttribute("ds", ds);

    }


    /**
     * 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    
   public void selectExtn3810(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_SLS_EXTN_3810_LDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        
        SS_SLS_EXTN_3810_LDM dm = new SS_SLS_EXTN_3810_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setYymm(yymm);       
        
        dm.print();
               
        SSExtn3800DAO dao = new SSExtn3800DAO();		
		ds = dao.selectExtn3810(dm);
		req.setAttribute("ds", ds);

    }

}
