/***************************************************************************************************
* ���ϸ� : SSExtn1200WB.java
 * ��� : ���Ȯ�� ó���� ���� Worker Bean
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
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
 * Ȯ����Ȳ-���Ȯ�� �� ���� WB
 */

public class SSExtn1200WB{

    /**
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void empCampInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_XTN_EMPCAMP_INITDataSet ds = null;
        // DM Setting
        SS_L_RDR_XTN_EMPCAMP_INITDM dm = new SS_L_RDR_XTN_EMPCAMP_INITDM();

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� init ȣ��
        ds = dao.empCampInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
                SSExtn1200EJB ejb = home.create();
                ds = ejb.empCampInit(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpCampList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EMPCAMPDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_EMPCAMPDM dm = new SS_L_RDR_EXTN_EMPCAMPDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� selectCampList ȣ��
        ds = dao.selectEmpCampList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.selectEmpCampList(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpCampDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_EXTN_EMPCAMPDataSet ds = null;
        // Request Parameter Processing
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_S_RDR_EXTN_EMPCAMPDM dm = new SS_S_RDR_EXTN_EMPCAMPDM();
        dm.setRdr_extncampno(rdr_extncampno);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� selectDetailCamp ȣ��
        ds = dao.selectEmpCampDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.selectEmpCampDetail(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-����(���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertEmpCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCAMPDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String wght = Util.checkString(req.getParameter("wght"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String alonpayplandt = Util.checkString(req.getParameter("alonpayplandt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));//�ѱ�ó��

        // ���Ȯ���ȸ ��ü ����
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String alonamtary = Util.checkString(req.getParameter("alonamtary"));
        String qtyaplydtary = Util.checkString(req.getParameter("qtyaplydtary"));
        String basivalqtyary = Util.checkString(req.getParameter("basivalqtyary"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCAMPDM dm = new SS_A_RDR_EXTN_EMPCAMPDM();
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
        dm.setQtyaplydtary(qtyaplydtary);
        dm.setBasivalqtyary(basivalqtyary);
        dm.setIncmgpers(incmgpers);

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� insertCamp ȣ��
        ds = dao.insertEmpCamp(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.insertEmpCamp(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateEmpCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCAMPDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String wght = Util.checkString(req.getParameter("wght"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String alonpayplandt = Util.checkString(req.getParameter("alonpayplandt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));//�ѱ�ó��

        // ���Ȯ���ȸ ��ü ����
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String alonamtary = Util.checkString(req.getParameter("alonamtary"));
        String qtyaplydtary = Util.checkString(req.getParameter("qtyaplydtary"));
        String basivalqtyary = Util.checkString(req.getParameter("basivalqtyary"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCAMPDM dm = new SS_A_RDR_EXTN_EMPCAMPDM();
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
        dm.setQtyaplydtary(qtyaplydtary);
        dm.setBasivalqtyary(basivalqtyary);
        dm.setIncmgpers(incmgpers);

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� updateCamp ȣ��
        ds = dao.updateEmpCamp(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.updateEmpCamp(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteEmpCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCAMPDataSet ds = null;

        // Request Parameter Processing
        // ���Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCAMPDM dm = new SS_A_RDR_EXTN_EMPCAMPDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� deleteCamp ȣ��
        ds = dao.deleteEmpCamp(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.deleteEmpCamp(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeEmpCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCAMP_CLOSEDM dm = new SS_A_RDR_EXTN_EMPCAMP_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setIncmgpers(incmgpers);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� closeCamp ȣ��
        ds = dao.closeEmpCamp(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.closeEmpCamp(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelEmpCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCAMP_CLOSEDM dm = new SS_A_RDR_EXTN_EMPCAMP_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setIncmgpers(incmgpers);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� closeCancelCamp ȣ��
        ds = dao.closeCancelEmpCamp(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.closeCancelEmpCamp(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-���-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpCampCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EMPCLOSDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_EMPCLOSDM dm = new SS_L_RDR_EXTN_EMPCLOSDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� selectCampCostList ȣ��
        ds = dao.selectEmpCampCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.selectEmpCampCostList(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-���-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpCampCostDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_EXTN_EMPCLOSDataSet ds = null;
        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_RDR_EXTN_EMPCLOSDM dm = new SS_S_RDR_EXTN_EMPCLOSDM();
        dm.setBasidt(basidt);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� selectDetailCampCost ȣ��
        ds = dao.selectEmpCampCostDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.selectEmpCampCostDetail(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-���-����(���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertEmpCampCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���Ȯ���ȸ��� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCLOSDM dm = new SS_A_RDR_EXTN_EMPCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setIncmgpers(incmgpers);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� insertCampCost ȣ��
        ds = dao.insertEmpCampCost(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.insertEmpCampCost(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-���-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateEmpCampCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���Ȯ���ȸ��� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCLOSDM dm = new SS_A_RDR_EXTN_EMPCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setIncmgpers(incmgpers);

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� updateCampCost ȣ��
        ds = dao.updateEmpCampCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.updateEmpCampCost(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteEmpCampCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCLOSDataSet ds = null;

        // Request Parameter Processing
        // ���Ȯ���ȸ��� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCLOSDM dm = new SS_A_RDR_EXTN_EMPCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� deleteCampCost ȣ��
        ds = dao.deleteEmpCampCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.deleteEmpCampCost(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeEmpCampCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���Ȯ���ȸ��� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCLOS_CLOSEDM dm = new SS_A_RDR_EXTN_EMPCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� closeCampCost ȣ��
        ds = dao.closeEmpCampCost(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.closeEmpCampCost(dm);
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
     * Ȯ����Ȳ-���Ȯ��-��ȸ����-���-�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelEmpCampCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EMPCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ���Ȯ���ȸ��� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_EMPCLOS_CLOSEDM dm = new SS_A_RDR_EXTN_EMPCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� closeCancelCampCost ȣ��
        ds = dao.closeCancelEmpCampCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.closeCancelEmpCampCost(dm);
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
     * Ȯ����Ȳ-���Ȯ��-������-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void empCostInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� costInit ȣ��
        ds = dao.empCostInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.empCostInit(dm);
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
     * Ȯ����Ȳ-���Ȯ��-������-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EMPCOSTDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String busnchrgclamtyn = Util.checkString(req.getParameter("busnchrgclamtyn"));
        String splychrgclamtyn = Util.checkString(req.getParameter("splychrgclamtyn"));

        // DM Setting
        SS_L_RDR_EXTN_EMPCOSTDM dm = new SS_L_RDR_EXTN_EMPCOSTDM();

        dm.setAccflag(accflag);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setBasidt(basidt);
        dm.setBusnchrgclamtyn(busnchrgclamtyn);
        dm.setSplychrgclamtyn(splychrgclamtyn);
        
        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� selectCostList ȣ��
        ds = dao.selectEmpCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.selectEmpCostList(dm);
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
     * Ȯ����Ȳ-���Ȯ��-������-�󼼸��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectEmpCostDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EMPCOSTDDataSet ds = null;

        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_RDR_EXTN_EMPCOSTDDM dm = new SS_L_RDR_EXTN_EMPCOSTDDM();
        dm.setBasidt(basidt);
        dm.setBocd(bocd);

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� selectEmpCostDetailList ȣ��
        ds = dao.selectEmpCostDetailList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.selectEmpCostDetailList(dm);
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
     * Ȯ����Ȳ-���Ȯ��-������-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateEmpCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_RDR_EXTN_EMPCOSTDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidtary = Util.checkString(req.getParameter("basidtary"));
        String bocdary = Util.checkString(req.getParameter("bocdary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_RDR_EXTN_EMPCOSTDM dm = new SS_U_RDR_EXTN_EMPCOSTDM();
        dm.setAccflag(accflag);
        dm.setBasidtary(basidtary);
        dm.setBocdary(bocdary);
        dm.setCheckedary(checkedary);
        dm.setIncmgpers(incmgpers);

        SSExtn1200DAO dao = new SSExtn1200DAO();
        // DAO ��ü�� updateCost ȣ��
        ds = dao.updateEmpCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1200EJBHome home = (SSExtn1200EJBHome)JNDIManager.getInstance().getHome("SSExtn1200EJB");
        try{
            SSExtn1200EJB ejb = home.create();
            ds = ejb.updateEmpCost(dm);
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
}
