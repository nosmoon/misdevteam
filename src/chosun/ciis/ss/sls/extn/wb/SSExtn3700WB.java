/***************************************************************************************************
* ���ϸ� : SSExtn3700WB.java
* ��� : 1����ݹ̸� ���� ��ȸ
* �ۼ����� : 2015-11-10
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.util.*;				//�߰�
import java.lang.*;				//�߰�
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

public class SSExtn3700WB{

    /**
     * �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn3700(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_3700_ADataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_3700_ADM dm = new SS_SLS_EXTN_3700_ADM();
         dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn3700DAO dao = new SSExtn3700DAO();         
         ds = dao.initExtn3700(dm);
         req.setAttribute("ds", ds);

    }


    /**
     * ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    
   public void selectExtn3710(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_SLS_EXTN_3710_LDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        
        SS_SLS_EXTN_3710_LDM dm = new SS_SLS_EXTN_3710_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setYymm(yymm);       
        
        dm.print();
               
        SSExtn3700DAO dao = new SSExtn3700DAO();		
		ds = dao.selectExtn3710(dm);
		req.setAttribute("ds", ds);

    }

}
