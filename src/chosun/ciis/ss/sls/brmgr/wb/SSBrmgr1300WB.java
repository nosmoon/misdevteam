/***************************************************************************************************
* ���ϸ� : SSBrmgr1300WB.java
* ��� : �����濵-�μ����� �μ���� ó���� ���� Worker Bean
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
 * �����濵-�μ����� �μ���� ���� WB
 */

public class SSBrmgr1300WB{

    /**
     * �����濵-�μ����� ������û,��û(�μ����) �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_QTYAPLC_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_QTYAPLC_INITDM dm = new SS_L_QTYAPLC_INITDM();
        
        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
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
     * �����濵-�μ����� ������û(�μ����) ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectQtyaplcMainNwspList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLC_MAIN_NWSPDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));        		//�μ��ڵ�
        String partcd = Util.checkString(req.getParameter("partcd"));        		//�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));        		//�����ڵ�
        String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));    			//����
        String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));   //���ڱ��м��� (1:��û����, 2:�߼�����)
        String closyn = Util.checkString(req.getParameter("closyn"));   	        //������������

        // DM Setting
        SS_L_QTYAPLC_MAIN_NWSPDM dm = new SS_L_QTYAPLC_MAIN_NWSPDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setClosyn(closyn);

        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
        // DAO ��ü�� selectQtyaplcMainNwspList ȣ��
        ds = dao.selectQtyaplcMainNwspList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
            ds = ejb.selectQtyaplcMainNwspList(dm);
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
     * �����濵-�μ����� ������û(����)-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateQtyaplcMainNwspClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_QTYAPLC_MAIN_NWSP_CLOSDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        // Request Parameter Processing
        final String DELIMITER = "##";

        StringBuffer sb_aplcdt = new StringBuffer("");     //��û����(����)
        StringBuffer sb_bocd   = new StringBuffer("");     //�����ڵ�(����)
        StringBuffer sb_issudt = new StringBuffer("");     //��������(����)
        StringBuffer sb_prvissudt = new StringBuffer("");  //������������(����)
        StringBuffer sb_chrgcnfmyn = new StringBuffer(""); //�������Ȯ�ο���(����)
        String checkedary = Util.checkString(req.getParameter("checkedary")); //����Ȯ�ο���(����)

        String[] aplcdt  = req.getParameterValues("aplcdt");
        String[] bocd = req.getParameterValues("bocd");
        String[] issudt = req.getParameterValues("issudt");
        String[] prvissudt = req.getParameterValues("prvissudt");
        String[] chrgcnfmyn = req.getParameterValues("chrgcnfmyn");

        //## �߰�����
        for(int i=0; i<aplcdt.length; i++){
            sb_aplcdt.append(DELIMITER + aplcdt[i]);
            sb_bocd.append(DELIMITER + bocd[i]);
            sb_issudt.append(DELIMITER + issudt[i]);
            sb_prvissudt.append(DELIMITER + prvissudt[i]);
            sb_chrgcnfmyn.append(DELIMITER + chrgcnfmyn[i]);
        }
        //�Ǿտ� ## ���ű���
        if(aplcdt.length > 0){
            sb_aplcdt.delete(0,DELIMITER.length());
            sb_bocd.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_prvissudt.delete(0,DELIMITER.length());
            sb_chrgcnfmyn.delete(0,DELIMITER.length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);

        // DM Setting
        SS_U_QTYAPLC_MAIN_NWSP_CLOSDM dm = new SS_U_QTYAPLC_MAIN_NWSP_CLOSDM();

        dm.setAplcdt(sb_aplcdt.toString());
        dm.setBocd(sb_bocd.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setPrvissudt(sb_prvissudt.toString());
        dm.setChrgcnfmyn(sb_chrgcnfmyn.toString());
        dm.setClosyn(checkedary);
        dm.setIncmgpers(incmgpers);
        
        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
		// DAO �� updateQtyaplcMainNwspClos ȣ��
        bResult = dao.updateQtyaplcMainNwspClos(dm);
        if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
        }
        req.setAttribute("bocd", bocd);


        /*SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
            bResult = ejb.updateQtyaplcMainNwspClos(dm);
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

    /**
     * �����濵-�μ����� ��û(����) ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectQtyaplcList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLCDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));        		//�μ��ڵ�
        String partcd = Util.checkString(req.getParameter("partcd"));        		//�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));        		//�����ڵ�
        String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));    			//����
        String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));   //���ڱ��м��� (1:��û����, 2:�߼�����)
        String closyn = Util.checkString(req.getParameter("closyn"));   	        //������������

        // DM Setting
        SS_L_QTYAPLCDM dm = new SS_L_QTYAPLCDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setClosyn(closyn);
        
        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
		// DAO �� selectQtyaplcList ȣ��
		ds = dao.selectQtyaplcList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
            ds = ejb.selectQtyaplcList(dm);
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
     * �����濵-�μ����� ��û(����)-����
     * ������ ������ �μ�������û�� �ҳ�(130),�ְ�(110),������(610),����(111) �׸� ���ؼ��� ó���Ѵ�.
     * �߰����� ��ü�� ���� ó���� ����  �ּ�ó���� �׸��� �����ϰ� ��ü���� �׸� �ʿ��� �׸��� �߰��Ѵ�.
     * ������ ������ �μ�������û ������ ��������� �������ο� ������� ó���Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateQtyaplcClos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_QTYAPLC_CLOSDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        // Request Parameter Processing
        final String DELIMITER = "##";

        StringBuffer sb_aplcdt = new StringBuffer("");     //��û����(����)
        StringBuffer sb_bocd   = new StringBuffer("");     //�����ڵ�(����)
        StringBuffer sb_issudt = new StringBuffer("");     //��������(����)
        StringBuffer sb_prvissudt = new StringBuffer("");     //������������(����)
/*
        StringBuffer sb_chrgupdicdcqty130 = new StringBuffer("");     //�ҳ�������(����)
        StringBuffer sb_chrgupdicdcqty210 = new StringBuffer("");     //�ְ�������(����)
        StringBuffer sb_chrgupdicdcqty610 = new StringBuffer("");     //������������(����)
        StringBuffer sb_chrgupdicdcqty111 = new StringBuffer("");     //����������(����)
        StringBuffer sb_chrgupdicdcqty130_u = new StringBuffer("");     //�ҳ������м������ɿ���(����)
        StringBuffer sb_chrgupdicdcqty210_u = new StringBuffer("");     //�ְ������м������ɿ���(����)
        StringBuffer sb_chrgupdicdcqty610_u = new StringBuffer("");     //�����������м������ɿ���(����)
        StringBuffer sb_chrgupdicdcqty111_u = new StringBuffer("");     //���������м������ɿ���(����)
*/
        StringBuffer sb_mediinfo = new StringBuffer("");     //��ü����(����) : ��ü�ڵ�*�����������μ�*�������ɿ���@@��ü�ڵ�*�����������μ�*�������ɿ���@@��ü�ڵ�*�����������μ�*�������ɿ���##
        String checkedary = Util.checkString(req.getParameter("checkedary")); //����Ȯ�ο���(����)

        String[] aplcdt  = req.getParameterValues("aplcdt");
        String[] bocd = req.getParameterValues("bocd");
        String[] issudt = req.getParameterValues("issudt");
        String[] prvissudt = req.getParameterValues("prvissudt");
        String[] medicd = req.getParameterValues("medicd");
        String[] chrgupdicdcqty = req.getParameterValues("chrgupdicdcqty");
        String[] chrgupdicdcqty_u = req.getParameterValues("chrgupdicdcqty_u");
        /*
        String[] chrgupdicdcqty130 = req.getParameterValues("chrgupdicdcqty130");
        String[] chrgupdicdcqty210 = req.getParameterValues("chrgupdicdcqty210");
        String[] chrgupdicdcqty610 = req.getParameterValues("chrgupdicdcqty610");
        String[] chrgupdicdcqty111 = req.getParameterValues("chrgupdicdcqty111");
        String[] chrgupdicdcqty130_u = req.getParameterValues("chrgupdicdcqty130_u");
        String[] chrgupdicdcqty210_u = req.getParameterValues("chrgupdicdcqty210_u");
        String[] chrgupdicdcqty610_u = req.getParameterValues("chrgupdicdcqty610_u");
        String[] chrgupdicdcqty111_u = req.getParameterValues("chrgupdicdcqty111_u");
        */

        //## �߰�����
        for(int i=0; i<aplcdt.length; i++){
            sb_aplcdt.append(DELIMITER + aplcdt[i]);
            sb_bocd.append(DELIMITER + bocd[i]);
            sb_issudt.append(DELIMITER + issudt[i]);
            sb_prvissudt.append(DELIMITER + prvissudt[i]);
            sb_mediinfo.append(DELIMITER + medicd[i] + "*" + chrgupdicdcqty[i] + "*"+ chrgupdicdcqty_u[i]);
        }
        //�Ǿտ� ## ���ű���
        if(aplcdt.length > 0){
            sb_aplcdt.delete(0,DELIMITER.length());
            sb_bocd.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_prvissudt.delete(0,DELIMITER.length());
            sb_mediinfo.delete(0,DELIMITER.length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);

        // DM Setting
        SS_U_QTYAPLC_CLOSDM dm = new SS_U_QTYAPLC_CLOSDM();

        dm.setAplcdt(sb_aplcdt.toString());
        dm.setBocd(sb_bocd.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setPrvissudt(sb_prvissudt.toString());
        dm.setMediinfo(sb_mediinfo.toString());
        dm.setClosyn(checkedary);
        dm.setIncmgpers(incmgpers);
        
        SSBrmgr1300DAO dao = new SSBrmgr1300DAO();
		// DAO �� updateQtyaplcClos ȣ��
        bResult = dao.updateQtyaplcClos(dm);
		if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
        }
        req.setAttribute("bocd", bocd);
		
        /*
        SSBrmgr1300EJBHome home = (SSBrmgr1300EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1300EJB");
        try{
            SSBrmgr1300EJB ejb = home.create();
            bResult = ejb.updateQtyaplcClos(dm);
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
