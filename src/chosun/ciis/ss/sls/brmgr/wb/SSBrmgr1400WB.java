/***************************************************************************************************
* ���ϸ� : SSBrmgr1400WB.java
* ��� : �����濵-�μ�����-��û���� ó���� ���� Worker Bean
* �ۼ����� : 2004-03-06
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;


/**
 * �����濵-�μ�����-��û���� ���� WB
 */

public class SSBrmgr1400WB{

    /**
     * �����濵-�μ�����-��û���� �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_QTYAPLC_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_QTYAPLC_INITDM dm = new SS_L_QTYAPLC_INITDM();
        
        SSBrmgr1400DAO dao = new SSBrmgr1400DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

        /*
		SSBrmgr1400EJBHome home = (SSBrmgr1400EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1400EJB");
        try{
            SSBrmgr1400EJB ejb = home.create();
            ds = ejb.selectInitList(dm);
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
     * �����濵-�μ�����-��û���� ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectQtyaplcVexcList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLC_VEXCDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));

        // DM Setting
        SS_L_QTYAPLC_VEXCDM dm = new SS_L_QTYAPLC_VEXCDM();
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        
        SSBrmgr1400DAO dao = new SSBrmgr1400DAO();
		// DAO ��ü�� selectQtyaplcVexcList ȣ��
		ds = dao.selectQtyaplcVexcList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1400EJBHome home = (SSBrmgr1400EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1400EJB");
        try{
            SSBrmgr1400EJB ejb = home.create();
            ds = ejb.selectQtyaplcVexcList(dm);
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
     * �����濵-�μ����� ��û����(�μ����)-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateQtyaplcVexc(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_QTYAPLC_VEXCDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        // Request Parameter Processing
        final String DELIMITER = "##";

		String bocd = ""; //���������ڵ�
		String aplcdt = ""; //��û����

        StringBuffer sb_aplcno = new StringBuffer("");     //��û��ȣ(����)
        StringBuffer sb_medicd = new StringBuffer("");     //��ü�ڵ�(����)
        StringBuffer sb_basidt = new StringBuffer("");     //��������(����)
        StringBuffer sb_issudt = new StringBuffer("");     //��������(����)
        StringBuffer sb_basiqty = new StringBuffer("");     //���غμ�(����)
        StringBuffer sb_boaplcicdcqty = new StringBuffer("");     //�����μ�(����)
        StringBuffer sb_sendqty = new StringBuffer("");     //�߼ۺμ�(����)
        String checkedary = Util.checkString(req.getParameter("checkedary")); //üũ���ÿ���(����)
        String checkyn = null; //  checkedary���� #�� �и��Ͽ� �����ϱ� ���� ����

        String[] bocd_ary  = req.getParameterValues("bocd");
        String[] aplcdt_ary  = req.getParameterValues("aplcdt");
        String[] aplcno_ary  = req.getParameterValues("aplcno");
        String[] medicd  = req.getParameterValues("medicd");
        String[] basidt  = req.getParameterValues("basidt");
        String[] issudt = req.getParameterValues("issudt");
        String[] basiqty = req.getParameterValues("basiqty");
        String[] boaplcicdcqty = req.getParameterValues("boaplcicdcqty");
        String[] sendqty = req.getParameterValues("sendqty");

		//## �߰�����
		int k = 0;
        for(int i=0; i<medicd.length; i++){

        	bocd = bocd_ary[0];
        	aplcdt = aplcdt_ary[0];

        	checkyn = checkedary.substring(i+k,i+k+1);

        	if(checkyn.equals("Y")){

                sb_aplcno.append(DELIMITER + aplcno_ary[i]);
                sb_medicd.append(DELIMITER + medicd[i]);
	        	sb_basidt.append(DELIMITER + basidt[i]);
	        	sb_issudt.append(DELIMITER + issudt[i]);
	        	sb_basiqty.append(DELIMITER + basiqty[i]);
	        	sb_boaplcicdcqty.append(DELIMITER + boaplcicdcqty[i]);
	        	sb_sendqty.append(DELIMITER + sendqty[i]);
	        }

        	k = k+2;
        }
        //�Ǿտ� ## ���ű���
        if(medicd.length > 0){
            sb_aplcno.delete(0,DELIMITER.length());
            sb_medicd.delete(0,DELIMITER.length());
            sb_basidt.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_basiqty.delete(0,DELIMITER.length());
            sb_boaplcicdcqty.delete(0,DELIMITER.length());
            sb_sendqty.delete(0,DELIMITER.length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        //String incmgpers = "user_id";

        // DM Setting
        SS_A_QTYAPLC_VEXCDM dm = new SS_A_QTYAPLC_VEXCDM();

        dm.setAplcdt(aplcdt);
        dm.setBocd(bocd);
        dm.setAplcno(sb_aplcno.toString());
        dm.setMedicd(sb_medicd.toString());
        dm.setBasidt(sb_basidt.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setBasiqty(sb_basiqty.toString());
        dm.setBoaplcicdcqty(sb_boaplcicdcqty.toString());
        dm.setSendqty(sb_sendqty.toString());
        dm.setIncmgpers(incmgpers);
        
        SSBrmgr1400DAO dao = new SSBrmgr1400DAO();
		// DAO ��ü�� updateQtyaplcVexc ȣ��
        bResult = dao.updateQtyaplcVexc(dm);
        if(bResult == true){ // ���������� �Էµ� ���
           sResult = "true";
        }
        req.setAttribute("bocd", bocd);

        /*
        SSBrmgr1400EJBHome home = (SSBrmgr1400EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1400EJB");
        try{
            SSBrmgr1400EJB ejb = home.create();
            bResult = ejb.updateQtyaplcVexc(dm);
            if(bResult == true){ // ���������� �Էµ� ���
               sResult = "true";
            }
            req.setAttribute("bocd", bocd);
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