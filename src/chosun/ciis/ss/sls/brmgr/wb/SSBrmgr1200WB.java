/***************************************************************************************************
* ���ϸ� : SSBrmgr1200WB.java
* ��� : �����濵-�μ����� ������û,��û(���) ó���� ���� Worker Bean
* �ۼ����� : 2004-03-18
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� : �μ����� - ����(���)�� ����ó�� �߰�.
* ������ :   Ȳ����
* �������� : 2009.4.30
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
import chosun.ciis.co.decid.dao.CO_DECID_1000DAO;
import chosun.ciis.co.decid.dm.CO_DECID_1000_IDM;
import chosun.ciis.co.decid.ds.CO_DECID_1000_IDataSet;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;

import chosun.ciis.ss.intf.brmgr.SSBrmgr1200AD;


/**
 * �����濵-�μ����� ������û,��û(���) ���� WB
 */

public class SSBrmgr1200WB{

    /**
     * �����濵-�μ����� ������û,��û(���) �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_QTYAPLC_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_QTYAPLC_INITDM dm = new SS_L_QTYAPLC_INITDM();
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
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
     * �����濵-�μ����� ������û(���) ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectQtyaplcMainNwspList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLC_MAIN_NWSPDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));        		//�μ��ڵ�
        String partcd = Util.checkString(req.getParameter("partcd"));        		//��Ʈ�ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));        		//�����ڵ�
        String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));    			//����
        String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));   //���ڱ��м��� (1:��û����, 2:�߼�����)
        String chrgcnfmyn = Util.checkString(req.getParameter("chrgcnfmyn"));   	//���Ȯ������

        // DM Setting
        SS_L_QTYAPLC_MAIN_NWSPDM dm = new SS_L_QTYAPLC_MAIN_NWSPDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setChrgcnfmyn(chrgcnfmyn);
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
		// DAO ��ü�� selectQtyaplcMainNwspList ȣ��
		ds = dao.selectQtyaplcMainNwspList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
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
     * �����濵-�μ����� ������û(���)-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void updateQtyaplcMainNwsp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_QTYAPLC_MAIN_NWSPDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        // Request Parameter Processing
        final String DELIMITER = "##";

        StringBuffer sb_aplcdt = new StringBuffer("");     //��û����(����)
        StringBuffer sb_bocd   = new StringBuffer("");     //�����ڵ�(����)
        StringBuffer sb_issudt = new StringBuffer("");     //��������(����)
        StringBuffer sb_chrgupdicdcqty = new StringBuffer("");     //�����������μ�(����)
        StringBuffer sb_preclosyn = new StringBuffer("");     //������������(����)
        StringBuffer sb_chkyn = new StringBuffer("");     //���缱�� ����. ���Ȯ�ο��θ� ������� �ʰ� �� �ʵ带 ���. ���Ȯ�� ���ε� �� �ʵ忡 ���� ������.
        StringBuffer sb_remk = new StringBuffer("");     //���
        StringBuffer sb_areacd = new StringBuffer("");		//���翡 ���Ե� ����
        String checkedary = Util.checkString(req.getParameter("checkedary")); //���Ȯ�ο���(����)

        String[] aplcdt  = req.getParameterValues("aplcdt");
        String[] bocd = req.getParameterValues("bocd");
        String[] issudt = req.getParameterValues("issudt");
        String[] chrgupdicdcqty = req.getParameterValues("chrgupdicdcqty");
        String[] preclosyn = req.getParameterValues("preclosyn");
        String[] chkyn = req.getParameterValues("chk");
        String[] remk = req.getParameterValues("remk");
        String[] areacd = req.getParameterValues("areacd");

        //## �߰�����
        for(int i=0; i<aplcdt.length; i++){
            sb_aplcdt.append(DELIMITER + aplcdt[i]);
            sb_bocd.append(DELIMITER + bocd[i]);
            sb_issudt.append(DELIMITER + issudt[i]);
            sb_chrgupdicdcqty.append(DELIMITER + chrgupdicdcqty[i]);
            sb_preclosyn.append(DELIMITER + preclosyn[i]);
            sb_remk.append(DELIMITER + remk[i]);
            sb_chkyn.append(DELIMITER + chkyn[i]);
            //���� üũ�� �� ���� areacd�� ����.
            if("Y".equals(chkyn[i]))
            	sb_areacd.append("#" + areacd[i]);
        }
        //�Ǿտ� ## ���ű���
        if(aplcdt.length > 0){
            sb_aplcdt.delete(0,DELIMITER.length());
            sb_bocd.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_chrgupdicdcqty.delete(0,DELIMITER.length());
            sb_preclosyn.delete(0,DELIMITER.length());
            sb_chkyn.delete(0,DELIMITER.length());
            sb_remk.delete(0,DELIMITER.length());
            sb_areacd.delete(0,"#".length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);
        //String incmgpers = "user_id";

        // DM Setting
        SS_U_QTYAPLC_MAIN_NWSPDM dm = new SS_U_QTYAPLC_MAIN_NWSPDM();
        dm.setAplcdt(sb_aplcdt.toString());
        dm.setBocd(sb_bocd.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setChrgcnfmyn(checkedary);
        dm.setChrgupdicdcqty(sb_chrgupdicdcqty.toString());
        dm.setPreclosyn(sb_preclosyn.toString());
        dm.setChkyn(sb_chkyn.toString());
        dm.setRemk(sb_remk.toString());
        dm.setIncmgpers(incmgpers);

    	//�ű� ���� �ڵ� �������� DM setting -> ��ü������ �����ϴ� ���� �ƴ϶� ���뿡�� �޾ƿ��� ������ ����. ���뿡 ���� ����.
        //SS_L_QTYAPLC_DOCIDDM docidDM = new SS_L_QTYAPLC_DOCIDDM();
        //docidDM.setDocumenttype(SSBrmgr1200AD.docType);
        CO_DECID_1000_IDM docidDM		= new CO_DECID_1000_IDM();
        docidDM.setCmpy_cd(SSBrmgr1200AD.companyCD);
        docidDM.setDecid_job_cd(SSBrmgr1200AD.docType);
        docidDM.setDoc_titl(SSBrmgr1200AD.subject);
        docidDM.setDoc_stat_cd(SSBrmgr1200AD.statReady);
        docidDM.setIncmg_pers_ip(req.getRemoteAddr());
        docidDM.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        docidDM.print();
        
        //���翡 ���Ե� �������� �μ���Ȳ DM setting
        SS_L_QTYAPLC_ILGYEDM ilgydm = new SS_L_QTYAPLC_ILGYEDM();
        ilgydm.setArealist(sb_areacd.toString());
        
        //********** ���� *****************
        // 111111111111111111111111
        /*
        CO_DECID_1000DAO deciddao = new CO_DECID_1000DAO();
        CO_DECID_1000_IDataSet docidds = deciddao.getCo_decid_1000(docidDM);
        req.setAttribute("docidds", docidds);
        //���� �����Ϳ� ���� �ڵ� �߰�.
        dm.setDocumentid(docidds.decid_key);
        
        //22222222222222222
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
        // DAO ��ü�� selectQtyaplcDocID ȣ��
        SS_L_QTYAPLC_ILGYEDataSet ilgyds = dao.selectQtyaplcIlgye(ilgydm);
        req.setAttribute("ilgyds", ilgyds);
        
        //3333333333333333333
        try{
    	SSBrmgr1200AD ad = new SSBrmgr1200AD();
    	ad.setDocumentContent(req);
    	//System.out.println("===== approval doc =====" + ad.generateDocument());
    	ad.generateDocument();
    	ad.send(req);

        } catch(CreateException e){
        	SysException se = new SysException(e);
        	LogManager.getInstance().log(se);
        	throw se;
        } catch(RemoteException e){
        	SysException se = new SysException(e);
        	LogManager.getInstance().log(se);
        	throw se;
        } catch(AppException e){
        	LogManager.getInstance().log(e);
        	throw e;
        } catch(Exception e){
        	SysException se = new SysException(e);
        	LogManager.getInstance().log(se);
        	throw se;
        }
        // 4444444444444444444444444
        // DAO ��ü�� updateQtyaplcMainNwsp ȣ��
        bResult = dao.updateQtyaplcMainNwsp(dm);
        if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
         }
         */
        //**********  ��  *****************
        
        

/*        CO_DECID_1000EJBHome decidHome	= (CO_DECID_1000EJBHome) JNDIManager.getInstance().getHome("CO_DECID_1000EJB");
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            CO_DECID_1000EJB decidEjb = decidHome.create();
            // 111111111111111111111111
        	//�ű� ���� �ڵ� �������� -> ���뿡 ���� ������ �����ϰ� ���� ��ȣ�� �޾� �´�.
            //SS_L_QTYAPLC_DOCIDDataSet docidds = ejb.selectQtyaplcDocID(docidDM);
//            CO_DECID_1000_IDataSet docidds = decidEjb.getCo_decid_1000(docidDM);
//            req.setAttribute("docidds", docidds);
//            //���� �����Ϳ� ���� �ڵ� �߰�.
//            dm.setDocumentid(docidds.decid_key);
   
            //22222222222222222
            //�������� �μ���Ȳ ��������.
//            SS_L_QTYAPLC_ILGYEDataSet ilgyds = ejb.selectQtyaplcIlgye(ilgydm);
//            req.setAttribute("ilgyds", ilgyds);
            
            //3333333333333333333
        	//���� ó��.
//        	SSBrmgr1200AD ad = new SSBrmgr1200AD();
//        	ad.setDocumentContent(req);
//        	//System.out.println("===== approval doc =====" + ad.generateDocument());
//        	ad.generateDocument();
//        	ad.send(req);
        	// 4444444444444444444444444
            bResult = ejb.updateQtyaplcMainNwsp(dm);
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
        } catch(AppException e){
        	LogManager.getInstance().log(e);
            throw e;
       } catch(Exception e){
        	SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * �����濵-�μ�����-������û(����)-�μ�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void printQtyaplcMainNwspClosList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_QTYAPLC_MAINNWSP_PRINTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));    			//����
        String dt_clsf_chce = Util.checkString(req.getParameter("dt_clsf_chce"));   //���ڱ��м��� (1:��û����, 2:�߼�����)
        String closyn = Util.checkString(req.getParameter("closyn"));   	        //������������

        // DM Setting
        SS_L_QTYAPLC_MAINNWSP_PRINTDM dm = new SS_L_QTYAPLC_MAINNWSP_PRINTDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setClosyn(closyn);
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
        // DAO �� printQtyaplcMainNwspClosList ȣ��
        ds = dao.printQtyaplcMainNwspClosList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            ds = ejb.printQtyaplcMainNwspClosList(dm);
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
     * �����濵-�μ����� ��û(���) ��ȸ(����Ʈ)
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
        String chrgcnfmyn = Util.checkString(req.getParameter("chrgcnfmyn"));   	//���Ȯ������

        // DM Setting
        SS_L_QTYAPLCDM dm = new SS_L_QTYAPLCDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setDt_clsf(dt_clsf);
        dm.setDt_clsf_chce(dt_clsf_chce);
        dm.setChrgcnfmyn(chrgcnfmyn);
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
		// DAO ��ü�� selectQtyaplcList ȣ��
		ds = dao.selectQtyaplcList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
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
     * �����濵-�μ����� ��û(���)-����(����)
     * ������ ������ �μ�������û�� �ҳ�(130),�ְ�(110),������(610),����(111) �׸� ���ؼ��� ó���Ѵ�.
     * �߰����� ��ü�� ���� ó���� ����  �ּ�ó���� �׸��� �����ϰ� ��ü���� �׸� �ʿ��� �׸��� �߰��Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
    **/
    public void updateQtyaplc(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_QTYAPLCDataSet ds = null;

        boolean bResult = false;
        String sResult = "false";       // request�� ��ȯ�� String Type �����

        // Request Parameter Processing
        final String DELIMITER = "##";

        StringBuffer sb_aplcdt = new StringBuffer("");     //��û����(����)
        StringBuffer sb_bocd   = new StringBuffer("");     //�����ڵ�(����)
        StringBuffer sb_issudt = new StringBuffer("");     //��������(����)

/*
 *      ���ν��� �������� �ּ�ó��
        StringBuffer sb_chrgupdicdcqty130 = new StringBuffer("");     //�ҳ�������(����)
        StringBuffer sb_chrgupdicdcqty210 = new StringBuffer("");     //�ְ�������(����)
        StringBuffer sb_chrgupdicdcqty610 = new StringBuffer("");     //������������(����)
        StringBuffer sb_chrgupdicdcqty111 = new StringBuffer("");     //����������(����)
*/
/*
 �߰����� ��ü�� ���� ó���� ����  �ּ�ó���� �׸��� �����ϰ� ��ü���� �׸� �ʿ��� �׸��� �߰��Ѵ�.
        StringBuffer sb_chrgupdicdcqty613 = new StringBuffer("");     //����������(����)
        StringBuffer sb_chrgupdicdcqty715 = new StringBuffer("");     //�Ѱ�������(����)
        StringBuffer sb_chrgupdicdcqty721 = new StringBuffer("");     //�췲��������(����)
*/
        /* ���ν��� �������� �ּ�ó
        StringBuffer sb_chrgupdicdcqty130_u = new StringBuffer("");     //�ҳ������м������ɿ���(����)
        StringBuffer sb_chrgupdicdcqty210_u = new StringBuffer("");     //�ְ������м������ɿ���(����)
        StringBuffer sb_chrgupdicdcqty610_u = new StringBuffer("");     //�����������м������ɿ���(����)
        StringBuffer sb_chrgupdicdcqty111_u = new StringBuffer("");     //���������м������ɿ���(����)
        */
/*
�߰����� ��ü�� ���� ó���� ����  �ּ�ó���� input �Ķ���͸� �����Ѵ�.
        StringBuffer sb_chrgupdicdcqty613_u = new StringBuffer("");     //���������м������ɿ���(����)
        StringBuffer sb_chrgupdicdcqty715_u = new StringBuffer("");     //�Ѱ������м������ɿ���(����)
        StringBuffer sb_chrgupdicdcqty721_u = new StringBuffer("");     //�췲�������м������ɿ���(����)
*/
        StringBuffer sb_mediinfo = new StringBuffer("");     //��ü����(����) : ��ü�ڵ�*�����������μ�*�������ɿ���@@��ü�ڵ�*�����������μ�*�������ɿ���@@��ü�ڵ�*�����������μ�*�������ɿ���##
        String checkedary = Util.checkString(req.getParameter("checkedary")); //���Ȯ�ο���(����)

        String[] aplcdt  = req.getParameterValues("aplcdt");
        String[] bocd = req.getParameterValues("bocd");
        String[] issudt = req.getParameterValues("issudt");
        String[] medicd = req.getParameterValues("medicd");
        
        String[] chrgupdicdcqty = req.getParameterValues("chrgupdicdcqty");     //��ü��(����)
        String[] chrgupdicdcqty_u = req.getParameterValues("chrgupdicdcqty_u");     //��ü��(����)        
        /*
        String[] chrgupdicdcqty130 = req.getParameterValues("chrgupdicdcqty130");
        String[] chrgupdicdcqty210 = req.getParameterValues("chrgupdicdcqty210");
        String[] chrgupdicdcqty610 = req.getParameterValues("chrgupdicdcqty610");
        String[] chrgupdicdcqty111 = req.getParameterValues("chrgupdicdcqty111");
        */
/*
�߰����� ��ü�� ���� ó���� ����  �ּ�ó���� input �Ķ���͸� �����Ѵ�.
        String[] chrgupdicdcqty613 = req.getParameterValues("chrgupdicdcqty613");
        String[] chrgupdicdcqty715 = req.getParameterValues("chrgupdicdcqty715");
        String[] chrgupdicdcqty721 = req.getParameterValues("chrgupdicdcqty721");
*/
        /*
        String[] chrgupdicdcqty130_u = req.getParameterValues("chrgupdicdcqty130_u");
        String[] chrgupdicdcqty210_u = req.getParameterValues("chrgupdicdcqty210_u");
        String[] chrgupdicdcqty610_u = req.getParameterValues("chrgupdicdcqty610_u");
        String[] chrgupdicdcqty111_u = req.getParameterValues("chrgupdicdcqty111_u");
        */
/*
�߰����� ��ü�� ���� ó���� ����  �ּ�ó���� input �Ķ���͸� �����Ѵ�.

        String[] chrgupdicdcqty613_u = req.getParameterValues("chrgupdicdcqty613_u");
        String[] chrgupdicdcqty715_u = req.getParameterValues("chrgupdicdcqty715_u");
        String[] chrgupdicdcqty721_u = req.getParameterValues("chrgupdicdcqty721_u");
*/
        //## �߰�����
        for(int i=0; i<aplcdt.length; i++){
            sb_aplcdt.append(DELIMITER + aplcdt[i]);
            sb_bocd.append(DELIMITER + bocd[i]);
            sb_issudt.append(DELIMITER + issudt[i]);
/*
            sb_mediinfo.append(DELIMITER + "130*" + chrgupdicdcqty130[i] + "*"+ chrgupdicdcqty130_u[i] + "@@" + "210*" + chrgupdicdcqty210[i] + "*"+ chrgupdicdcqty210_u[i] + "@@" + "610*" + chrgupdicdcqty610[i] + "*"+ chrgupdicdcqty610_u[i] + "@@" + "111*" + chrgupdicdcqty111[i] + "*"+ chrgupdicdcqty111_u[i] + "@@" + "613*" + chrgupdicdcqty613[i] + "*"+ chrgupdicdcqty613_u[i] + "@@" + "715*" + chrgupdicdcqty715[i] + "*"+ chrgupdicdcqty715_u[i] + "@@" + "721*" + chrgupdicdcqty721[i] + "*"+ chrgupdicdcqty721_u[i]);
            sb_mediinfo.append(DELIMITER + "130*" + chrgupdicdcqty130[i] + "*"+ chrgupdicdcqty130_u[i] + "@@" + "210*" + chrgupdicdcqty210[i] + "*"+ chrgupdicdcqty210_u[i] + "@@" + "610*" + chrgupdicdcqty610[i] + "*"+ chrgupdicdcqty610_u[i] + "@@" + "111*" + chrgupdicdcqty111[i] + "*"+ chrgupdicdcqty111_u[i]);
*/
            sb_mediinfo.append(DELIMITER + medicd[i] + "*" + chrgupdicdcqty[i] + "*"+ chrgupdicdcqty_u[i] );
        }
        //�Ǿտ� ## ���ű���
        if(aplcdt.length > 0){
            sb_aplcdt.delete(0,DELIMITER.length());
            sb_bocd.delete(0,DELIMITER.length());
            sb_issudt.delete(0,DELIMITER.length());
            sb_mediinfo.delete(0,DELIMITER.length());
       }
        String incmgpers = Util.getSessionParameterValue(req, "uid", false);

        // DM Setting
        SS_U_QTYAPLCDM dm = new SS_U_QTYAPLCDM();

        dm.setAplcdt(sb_aplcdt.toString());
        dm.setBocd(sb_bocd.toString());
        dm.setIssudt(sb_issudt.toString());
        dm.setMediinfo(sb_mediinfo.toString());
        dm.setChrgcnfmyn(checkedary);
        dm.setIncmgpers(incmgpers);
        
        SSBrmgr1200DAO dao = new SSBrmgr1200DAO();
		// DAO ��ü�� updateQtyaplc ȣ��
        bResult = dao.updateQtyaplc(dm);
        if(bResult == true){ // ���������� �Էµ� ���
            sResult = "true";
        }
        req.setAttribute("bocd", bocd);

        /* 
        SSBrmgr1200EJBHome home = (SSBrmgr1200EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1200EJB");
        try{
            SSBrmgr1200EJB ejb = home.create();
            bResult = ejb.updateQtyaplc(dm);
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
