/***************************************************************************************************
* ���ϸ� : SSExtn1700WB.java
 * ��� : Ȯ����Ȳ-���̹�Ȯ��-���ذ����� ���� Worker Bean
* �ۼ����� : 2004-04-06
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-���ذ����� ���� WB
 */

public class SSExtn1700WB{

    /**
     * Ȯ����Ȳ-���̹�Ȯ��-���ذ���-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void cybCampInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_XTN_CYBCAMP_INITDataSet ds = null;
        // DM Setting
        SS_L_RDR_XTN_CYBCAMP_INITDM dm = new SS_L_RDR_XTN_CYBCAMP_INITDM();

        SSExtn1700DAO dao = new SSExtn1700DAO();
		// DAO ��ü�� cybCampInit ȣ��
		ds = dao.cybCampInit(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1700EJBHome home = (SSExtn1700EJBHome)JNDIManager.getInstance().getHome("SSExtn1700EJB");
        try{
	        SSExtn1700EJB ejb = home.create();
	        ds = ejb.cybCampInit(dm);
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
     * Ȯ����Ȳ-���̹�Ȯ��-���ذ���-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCybCampList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_CYBCAMPDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_CYBCAMPDM dm = new SS_L_RDR_EXTN_CYBCAMPDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSExtn1700DAO dao = new SSExtn1700DAO();
		// DAO ��ü�� selectCybCampList ȣ��
		ds = dao.selectCybCampList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1700EJBHome home = (SSExtn1700EJBHome)JNDIManager.getInstance().getHome("SSExtn1700EJB");
        try{
            SSExtn1700EJB ejb = home.create();
            ds = ejb.selectCybCampList(dm);
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
     * Ȯ����Ȳ-���̹�Ȯ��-���ذ���-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCybCampDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_EXTN_CYBCAMPDataSet ds = null;
        // Request Parameter Processing
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_S_RDR_EXTN_CYBCAMPDM dm = new SS_S_RDR_EXTN_CYBCAMPDM();
        dm.setRdr_extncampno(rdr_extncampno);
        
        SSExtn1700DAO dao = new SSExtn1700DAO();
		// DAO ��ü�� selectCybCampDetail ȣ��
		ds = dao.selectCybCampDetail(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1700EJBHome home = (SSExtn1700EJBHome)JNDIManager.getInstance().getHome("SSExtn1700EJB");
        try{
            SSExtn1700EJB ejb = home.create();
            ds = ejb.selectCybCampDetail(dm);
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
     * Ȯ����Ȳ-���̹�Ȯ��-���ذ���-����(���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertCybCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_CYBCAMPDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���̹�Ȯ����� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String alonpayplandt = Util.checkString(req.getParameter("alonpayplandt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));//�ѱ�ó��

        // ���̹�Ȯ����� ��ü ����
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String alonamtary = Util.checkString(req.getParameter("alonamtary"));
        String cnvsalonamtary = Util.checkString(req.getParameter("cnvsalonamtary"));

        // DM Setting
        SS_A_RDR_EXTN_CYBCAMPDM dm = new SS_A_RDR_EXTN_CYBCAMPDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setCampnm(campnm);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setAlonpayplandt(alonpayplandt);
        dm.setRemk(remk);
        dm.setMedicdary(medicdary);
        dm.setAlonamtary(alonamtary);
        dm.setCnvsalonamtary(cnvsalonamtary);
        dm.setIncmgpers(incmgpers);

        SSExtn1700DAO dao = new SSExtn1700DAO();
		// DAO ��ü�� insertCybCamp ȣ��
		ds = dao.insertCybCamp(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1700EJBHome home = (SSExtn1700EJBHome)JNDIManager.getInstance().getHome("SSExtn1700EJB");
        try{
            SSExtn1700EJB ejb = home.create();
            ds = ejb.insertCybCamp(dm);
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
     * Ȯ����Ȳ-���̹�Ȯ��-���ذ���-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateCybCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_CYBCAMPDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���̹�Ȯ����� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String alonpayplandt = Util.checkString(req.getParameter("alonpayplandt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));//�ѱ�ó��

        // ���̹�Ȯ����� ��ü ����
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String alonamtary = Util.checkString(req.getParameter("alonamtary"));
        String cnvsalonamtary = Util.checkString(req.getParameter("cnvsalonamtary"));

        // DM Setting
        SS_A_RDR_EXTN_CYBCAMPDM dm = new SS_A_RDR_EXTN_CYBCAMPDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setCampnm(campnm);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setAlonpayplandt(alonpayplandt);
        dm.setRemk(remk);
        dm.setMedicdary(medicdary);
        dm.setAlonamtary(alonamtary);
        dm.setCnvsalonamtary(cnvsalonamtary);
        dm.setIncmgpers(incmgpers);

        
        SSExtn1700DAO dao = new SSExtn1700DAO();
		// DAO ��ü�� updateCybCamp ȣ��
		ds = dao.updateCybCamp(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1700EJBHome home = (SSExtn1700EJBHome)JNDIManager.getInstance().getHome("SSExtn1700EJB");
        try{
            SSExtn1700EJB ejb = home.create();
            ds = ejb.updateCybCamp(dm);
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
     * Ȯ����Ȳ-���̹�Ȯ��-���ذ���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteCybCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_CYBCAMPDataSet ds = null;

        // Request Parameter Processing
        // ���̹�Ȯ����� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_CYBCAMPDM dm = new SS_A_RDR_EXTN_CYBCAMPDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);

        SSExtn1700DAO dao = new SSExtn1700DAO();
		// DAO ��ü�� deleteCybCamp ȣ��
		ds = dao.deleteCybCamp(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSExtn1700EJBHome home = (SSExtn1700EJBHome)JNDIManager.getInstance().getHome("SSExtn1700EJB");
        try{
            SSExtn1700EJB ejb = home.create();
            ds = ejb.deleteCybCamp(dm);
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
     * Ȯ����Ȳ-���̹�Ȯ��-���ذ���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
/*
    public void closeCybCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���̹�Ȯ����� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_CYBCAMP_CLOSEDM dm = new SS_A_RDR_EXTN_CYBCAMP_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setIncmgpers(incmgpers);

        SSExtn1700EJBHome home = (SSExtn1700EJBHome)JNDIManager.getInstance().getHome("SSExtn1700EJB");
        try{
            SSExtn1700EJB ejb = home.create();
            ds = ejb.closeCybCamp(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }
*/
    /**
     * Ȯ����Ȳ-���̹�Ȯ��-���ذ���-�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
/*
    public void closeCancelCybCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_CYBCAMP_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���̹�Ȯ����� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_CYBCAMP_CLOSEDM dm = new SS_A_RDR_EXTN_CYBCAMP_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setIncmgpers(incmgpers);

        SSExtn1700EJBHome home = (SSExtn1700EJBHome)JNDIManager.getInstance().getHome("SSExtn1700EJB");
        try{
            SSExtn1700EJB ejb = home.create();
            ds = ejb.closeCancelCybCamp(dm);
            req.setAttribute("ds", ds);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }
*/
}
