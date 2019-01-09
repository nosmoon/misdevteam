/***************************************************************************************************
* 파일명 : SSExtn4400WB.java
* 기능 : 연락처 중복 독자
* 작성일자 : 2015-12-11
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

public class SSExtn4400WB{

    /**
     * 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn4400(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_4400_ADataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_4400_ADM dm = new SS_SLS_EXTN_4400_ADM();
         dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn4400DAO dao = new SSExtn4400DAO();         
         ds = dao.initExtn4400(dm);
         req.setAttribute("ds", ds);

    }


    /**
     * 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    
   public void selectExtn4410(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_SLS_EXTN_4410_LDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        String telflag = Util.checkString(req.getParameter("telflag"));
               
        SS_SLS_EXTN_4410_LDM dm = new SS_SLS_EXTN_4410_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setYymm(yymm);  
        dm.setTelflag(telflag);
        
        dm.print();
               
        SSExtn4400DAO dao = new SSExtn4400DAO();		
		ds = dao.selectExtn4410(dm);
		req.setAttribute("ds", ds);

    }

}
