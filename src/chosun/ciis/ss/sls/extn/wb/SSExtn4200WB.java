/***************************************************************************************************
* ���ϸ� : SSExtn4200WB.java
* ��� : Ȯ�����Ǻ� ���� ��ȸ
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

public class SSExtn4200WB{

    /**
     * �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn4200(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_4200_ADataSet ds = null;

         //request process
         String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_4200_ADM dm = new SS_SLS_EXTN_4200_ADM();
         dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn4200DAO dao = new SSExtn4200DAO();         
         ds = dao.initExtn4200(dm);
         req.setAttribute("ds", ds);

    }


    /**
     * ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    
   public void selectExtn4210(HttpServletRequest req, HttpServletResponse res) throws AppException {

	    SS_SLS_EXTN_4210_LDataSet ds = null;

        //request process
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        String rdr_extntype1 = Util.checkString(req.getParameter("rdr_extntype1"));
        String resitype = Util.checkString(req.getParameter("resitype"));
        String bns_itemnm = Util.checkString(req.getParameter("bns_itemnm"));
        String svcmm = Util.checkString(req.getParameter("svcmm"));
        String clamtmthd = Util.checkString(req.getParameter("clamtmthd"));
        
        /*
        if(resitype.equals("��ü")){
        	resitype = "";
        }        
        if(clamtmthd.equals("��ü")){
        	clamtmthd = "";	
        }
        */
        
        SS_SLS_EXTN_4210_LDM dm = new SS_SLS_EXTN_4210_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setYymm(yymm);  
        dm.setRdr_extntype1(rdr_extntype1);
        dm.setResitype(resitype);
        dm.setBns_itemnm(bns_itemnm);
        dm.setSvcmm(svcmm);
        dm.setClamtmthd(clamtmthd);
        
        dm.print();
               
        SSExtn4200DAO dao = new SSExtn4200DAO();		
		ds = dao.selectExtn4210(dm);
		req.setAttribute("ds", ds);

    }

}
