/***************************************************************************************************
* ���ϸ� : SSExtn1400WB.java
 * ��� : Ȯ��������� ���� Worker Bean
* �ۼ����� : 2003-12-17
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
 * Ȯ����Ȳ-Ȯ��������� �� ���� WB
 */

public class SSExtn1400WB {
    /**
     * Ȯ����Ȳ-Ȯ��������-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectSlsCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_SLSCLOSDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_SLSCLOSDM dm = new SS_L_RDR_EXTN_SLSCLOSDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� selectSlsCostList ȣ��
        ds = dao.selectSlsCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.selectSlsCostList(dm);
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
     * Ȯ����Ȳ-Ȯ��������-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectSlsCostDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_EXTN_SLSCLOSDataSet ds = null;
        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_RDR_EXTN_SLSCLOSDM dm = new SS_S_RDR_EXTN_SLSCLOSDM();
        dm.setBasidt(basidt);
        
        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� selectSlsCostDetail ȣ��
        ds = dao.selectSlsCostDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.selectSlsCostDetail(dm);
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
     * Ȯ����Ȳ-Ȯ��������-����(���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertSlsCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // Ȯ��������� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));

        // DM Setting
        SS_A_RDR_EXTN_SLSCLOSDM dm = new SS_A_RDR_EXTN_SLSCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setIncmgpers(incmgpers);

        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� insertSlsCost ȣ��
        ds = dao.insertSlsCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.insertSlsCost(dm);
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
     * Ȯ����Ȳ-Ȯ��������-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateSlsCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // Ȯ��������� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));

        // DM Setting
        SS_A_RDR_EXTN_SLSCLOSDM dm = new SS_A_RDR_EXTN_SLSCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setIncmgpers(incmgpers);

        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� updateSlsCost ȣ��
        ds = dao.updateSlsCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.updateSlsCost(dm);
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
     * Ȯ����Ȳ-Ȯ��������-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteSlsCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SLSCLOSDataSet ds = null;

        // Request Parameter Processing
        // Ȯ��������� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_SLSCLOSDM dm = new SS_A_RDR_EXTN_SLSCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);

        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� deleteSlsCost ȣ��
        ds = dao.deleteSlsCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.deleteSlsCost(dm);
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
     * Ȯ����Ȳ-Ȯ��������-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeSlsCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // Ȯ��������� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_SLSCLOS_CLOSEDM dm = new SS_A_RDR_EXTN_SLSCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);
        
        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� closeSlsCost ȣ��
        ds = dao.closeSlsCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.closeSlsCost(dm);
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
     * Ȯ����Ȳ-Ȯ��������-�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelSlsCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_SLSCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // Ȯ��������� ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RDR_EXTN_SLSCLOS_CLOSEDM dm = new SS_A_RDR_EXTN_SLSCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);

        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� closeCancelSlsCost ȣ��
        ds = dao.closeCancelSlsCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.closeCancelSlsCost(dm);
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
     * Ȯ����Ȳ-Ȯ��������-���/��ȸ-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void slsAmtInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� slsAmtInit ȣ��
        ds = dao.slsAmtInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.slsAmtInit(dm);
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
     * Ȯ����Ȳ-Ȯ��������-���/��ȸ-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectSlsAmtList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_SLSCOSTDataSet ds = null;

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String boextn = Util.checkString(req.getParameter("boextn"));
        String movm = Util.checkString(req.getParameter("movm"));
        String empextn = Util.checkString(req.getParameter("empextn"));
        String exgextn = Util.checkString(req.getParameter("exgextn"));

        // DM Setting
        SS_L_RDR_EXTN_SLSCOSTDM dm = new SS_L_RDR_EXTN_SLSCOSTDM();
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setBasidt(basidt);
        dm.setBoextn(boextn);
        dm.setMovm(movm);
        dm.setEmpextn(empextn);
        dm.setExgextn(exgextn);

        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� selectSlsAmtList ȣ��
        ds = dao.selectSlsAmtList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.selectSlsAmtList(dm);
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
     * Ȯ����Ȳ-Ȯ��������-���/��ȸ-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateSlsAmt(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_RDR_EXTN_SLSCOSTDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String basidtary = Util.checkString(req.getParameter("basidtary"));
        String bocdary = Util.checkString(req.getParameter("bocdary"));
        String payqtyary = Util.checkString(req.getParameter("payqtyary"));
        String uprcary = Util.checkString(req.getParameter("uprcary"));
        String splyamtary = Util.checkString(req.getParameter("splyamtary"));

        // DM Setting
        SS_U_RDR_EXTN_SLSCOSTDM dm = new SS_U_RDR_EXTN_SLSCOSTDM();
        dm.setIncmgpers(incmgpers);
        dm.setBasidtary(basidtary);
        dm.setBocdary(bocdary);
        dm.setPayqtyary(payqtyary);
        dm.setUprcary(uprcary);
        dm.setSplyamtary(splyamtary);

        SSExtn1400DAO dao = new SSExtn1400DAO();
        // DAO ��ü�� updateSlsAmt ȣ��
        ds = dao.updateSlsAmt(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1400EJBHome home = (SSExtn1400EJBHome)JNDIManager.getInstance().getHome("SSExtn1400EJB");
        try{
            SSExtn1400EJB ejb = home.create();
            ds = ejb.updateSlsAmt(dm);
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