/***************************************************************************************************
* 파일명 : SSExtn3400WB.java
* 기능 : 미수개월수별 조회
* 작성일자 : 2015-11-09
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

public class SSExtn3400WB{

    /**
     * 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn3400(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_3400_ADataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_3400_ADM dm = new SS_SLS_EXTN_3400_ADM();
         dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn3400DAO dao = new SSExtn3400DAO();         
         ds = dao.initExtn3400(dm);
         req.setAttribute("ds", ds);

    }


    /**
     * 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    
   public void selectExtn3410(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_SLS_EXTN_3410_LDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String valmm = Util.checkString(req.getParameter("valmm"));
        String misucnt = Util.checkString(req.getParameter("misucnt"));        

        SS_SLS_EXTN_3410_LDM dm = new SS_SLS_EXTN_3410_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setValmm(valmm);
        dm.setMisucnt(misucnt);
        
        dm.print();
               
        SSExtn3400DAO dao = new SSExtn3400DAO();		
		ds = dao.selectExtn3410(dm);
		req.setAttribute("ds", ds);

    }

}
