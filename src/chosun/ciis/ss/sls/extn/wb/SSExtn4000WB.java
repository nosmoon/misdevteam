/***************************************************************************************************
* ���ϸ� : SSExtn4000WB.java
* ��� : �ٺμ� �Է� ���� ��ȸ
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

public class SSExtn4000WB{

    /**
     * �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn4000(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_4000_ADataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_4000_ADM dm = new SS_SLS_EXTN_4000_ADM();
         dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn4000DAO dao = new SSExtn4000DAO();         
         ds = dao.initExtn4000(dm);
         req.setAttribute("ds", ds);

    }


    /**
     * ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    
   public void selectExtn4010(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_SLS_EXTN_4010_LDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        
        SS_SLS_EXTN_4010_LDM dm = new SS_SLS_EXTN_4010_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setYymm(yymm);       
        
        dm.print();
               
        SSExtn4000DAO dao = new SSExtn4000DAO();		
		ds = dao.selectExtn4010(dm);
		req.setAttribute("ds", ds);

    }

}
