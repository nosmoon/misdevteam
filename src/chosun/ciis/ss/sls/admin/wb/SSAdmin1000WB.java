/***************************************************************************************************
 * ���ϸ� : SSAdmin1000WB.java
 * ��� : ������-�����ڵ�,�����ȣ,�����ڵ带 ���� Worker Bean
 * �ۼ����� : 2004-03-09
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������-�����ڵ�,�����ȣ�� ���� WB
 */

public class SSAdmin1000WB {
    /**
     * ������-�����ڵ�-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_CDV_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        CO_L_CDV_INITDM dm = new CO_L_CDV_INITDM();
        
        
        /* EJB ������ ���� */
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� initCode ȣ��
        ds = dao.initCode(dm);
        req.setAttribute("ds", ds);
		/* EJB ������ �� */
		
        /* EJB ������ ����
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.initCode(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        EJB ������ ����*/
    }

    /**
     * ������-�����ڵ�-�ڵ屸��-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodeGBList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_CDV_CICDGBDataSet ds = null;
        // Request Parameter Processing
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));

        // DM Setting
        CO_L_CDV_CICDGBDM dm = new CO_L_CDV_CICDGBDM();
        dm.setCiymgbcd(ciymgbcd);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� selectCodeGBList ȣ��
        ds = dao.selectCodeGBList(dm);
        req.setAttribute("ds", ds);
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectCodeGBList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_L_CDVDataSet ds = null;
        // Request Parameter Processing
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));
        String cicdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdnm")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        CO_L_CDVDM dm = new CO_L_CDVDM();
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);
        dm.setCicdnm(cicdnm);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� selectCodeList ȣ��
        ds = dao.selectCodeList(dm);
        req.setAttribute("ds", ds);
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectCodeList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCodeDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_S_CDVDataSet ds = null;
        // Request Parameter Processing
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));

        // DM Setting
        CO_S_CDVDM dm = new CO_S_CDVDM();
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);

        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� selectCodeDetail ȣ��
        ds = dao.selectCodeDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectCodeDetail(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_A_CDVDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));
        String cicdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdnm")));
        String cicdynm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdynm")));
        String cimgtcd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd1")));
        String cimgtcd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd2")));
        String cimgtcd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd3")));
        String cimgtcd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd4")));
        String cimgtcd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd5")));
        String cimgtcd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd6")));
        String cimgtcd7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd7")));
        String ciremarks = Util.Uni2Ksc(Util.checkString(req.getParameter("ciremarks")));
//        String sabun = Util.checkString(req.getParameter("sabun"));

        // DM Setting
        CO_A_CDVDM dm = new CO_A_CDVDM();
        dm.setAccflag(accflag);
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);
        dm.setCicdnm(cicdnm);
        dm.setCicdynm(cicdynm);
        dm.setCimgtcd1(cimgtcd1);
        dm.setCimgtcd2(cimgtcd2);
        dm.setCimgtcd3(cimgtcd3);
        dm.setCimgtcd4(cimgtcd4);
        dm.setCimgtcd5(cimgtcd5);
        dm.setCimgtcd6(cimgtcd6);
        dm.setCimgtcd7(cimgtcd7);
        dm.setCiremarks(ciremarks);
        dm.setSabun(incmgpers);

        
        // DAO ��ü ����
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� insertCode ȣ��
        ds = dao.insertCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.insertCode(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_A_CDVDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));
        String cicdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdnm")));
        String cicdynm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdynm")));
        String cimgtcd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd1")));
        String cimgtcd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd2")));
        String cimgtcd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd3")));
        String cimgtcd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd4")));
        String cimgtcd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd5")));
        String cimgtcd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd6")));
        String cimgtcd7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cimgtcd7")));
        String ciremarks = Util.Uni2Ksc(Util.checkString(req.getParameter("ciremarks")));
//        String sabun = Util.checkString(req.getParameter("sabun"));

        // DM Setting
        CO_A_CDVDM dm = new CO_A_CDVDM();
        dm.setAccflag(accflag);
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);
        dm.setCicdnm(cicdnm);
        dm.setCicdynm(cicdynm);
        dm.setCimgtcd1(cimgtcd1);
        dm.setCimgtcd2(cimgtcd2);
        dm.setCimgtcd3(cimgtcd3);
        dm.setCimgtcd4(cimgtcd4);
        dm.setCimgtcd5(cimgtcd5);
        dm.setCimgtcd6(cimgtcd6);
        dm.setCimgtcd7(cimgtcd7);
        dm.setCiremarks(ciremarks);
        dm.setSabun(incmgpers);

        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� updateCode ȣ��
        ds = dao.updateCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.updateCode(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteCode(HttpServletRequest req, HttpServletResponse res) throws AppException {
        CO_A_CDVDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
        String cicdgb = Util.checkString(req.getParameter("cicdgb"));
        String cicodeval = Util.checkString(req.getParameter("cicodeval"));

        // DM Setting
        CO_A_CDVDM dm = new CO_A_CDVDM();
        dm.setAccflag(accflag);
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCicodeval(cicodeval);
        dm.setSabun(incmgpers);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� deleteCode ȣ��
        ds = dao.deleteCode(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.deleteCode(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initAcctcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_ACCTCD_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_ACCTCD_INITDM dm = new SS_L_ACCTCD_INITDM();
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� initAcctcd ȣ��
        ds = dao.initAcctcd(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.initAcctcd(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAcctcdList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_ACCTCDDataSet ds = null;
        // Request Parameter Processing
        String imptexpnclsf = Util.checkString(req.getParameter("imptexpnclsf"));
        String acctcd = Util.checkString(req.getParameter("acctcd"));
        String acctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acctnm")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_ACCTCDDM dm = new SS_L_ACCTCDDM();
        dm.setImptexpnclsf(imptexpnclsf);
        dm.setAcctcd(acctcd);
        dm.setAcctnm(acctnm);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� selectAcctcdList ȣ��
        ds = dao.selectAcctcdList(dm);
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectAcctcdList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectAcctcdDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_ACCTCDDataSet ds = null;
        // Request Parameter Processing
        String acctcd = Util.checkString(req.getParameter("acctcd"));

        // DM Setting
        SS_S_ACCTCDDM dm = new SS_S_ACCTCDDM();
        dm.setAcctcd(acctcd);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� selectAcctcdDetail ȣ��
        ds = dao.selectAcctcdDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectAcctcdDetail(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertAcctcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_ACCTCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String acctcd = Util.checkString(req.getParameter("acctcd"));
        String acctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acctnm")));
        String imptexpnclsf = Util.checkString(req.getParameter("imptexpnclsf"));
        String leaf_inyn = Util.checkString(req.getParameter("leaf_inyn"));
        String empadvyn = Util.checkString(req.getParameter("empadvyn"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_ACCTCDDM dm = new SS_A_ACCTCDDM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setAcctcd(acctcd);
        dm.setAcctnm(acctnm);
        dm.setImptexpnclsf(imptexpnclsf);
        dm.setLeaf_inyn(leaf_inyn);
        dm.setEmpadvyn(empadvyn);
        dm.setRemk(remk);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� insertAcctcd ȣ��
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.insertAcctcd(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateAcctcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_ACCTCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String acctcd = Util.checkString(req.getParameter("acctcd"));
        String acctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acctnm")));
        String imptexpnclsf = Util.checkString(req.getParameter("imptexpnclsf"));
        String leaf_inyn = Util.checkString(req.getParameter("leaf_inyn"));
        String empadvyn = Util.checkString(req.getParameter("empadvyn"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_ACCTCDDM dm = new SS_A_ACCTCDDM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setAcctcd(acctcd);
        dm.setAcctnm(acctnm);
        dm.setImptexpnclsf(imptexpnclsf);
        dm.setLeaf_inyn(leaf_inyn);
        dm.setEmpadvyn(empadvyn);
        dm.setRemk(remk);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� updateAcctcd ȣ��
        ds = dao.updateAcctcd(dm);
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.updateAcctcd(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteAcctcd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_ACCTCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String acctcd = Util.checkString(req.getParameter("acctcd"));

        // DM Setting
        SS_A_ACCTCDDM dm = new SS_A_ACCTCDDM();
        dm.setAccflag(accflag);
        dm.setIncmgpers(incmgpers);
        dm.setAcctcd(acctcd);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� deleteAcctcd ȣ��
        ds = dao.deleteAcctcd(dm);
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.deleteAcctcd(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ȣ-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initZip(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� initZip ȣ��
        ds = dao.initZip(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome)JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.initZip(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ȣ-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectZipList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_PSTCDDataSet ds = null;

        // Request Parameter Processing
        String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
        String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
        String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_PSTCDDM dm = new SS_L_PSTCDDM();
        dm.setFlag(flag);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setZip1(zip1);
        dm.setZip2(zip2);
        dm.setAddr3(addr3);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� selectZipList ȣ��
        ds = dao.selectZipList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectZipList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ȣ-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectZipDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_JUSODataSet ds = null;

        // Request Parameter Processing
        String zip1 = Util.checkString(req.getParameter("zip1"));
        String zip2 = Util.checkString(req.getParameter("zip2"));
        String zip3 = Util.checkString(req.getParameter("zip3"));

        // DM Setting
        SS_L_JUSODM dm = new SS_L_JUSODM();
        dm.setZip1(zip1);
        dm.setZip2(zip2);
        dm.setZip3(zip3);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� selectZipDetail ȣ��
        ds = dao.selectZipDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.selectZipDetail(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ȣ-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void accessZip(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_JUSODataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String zip1 = Util.checkString(req.getParameter("zip1"));
        String zip2 = Util.checkString(req.getParameter("zip2"));
        String zip3 = Util.checkString(req.getParameter("zip3"));
        String addr1ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr1ary")));
        String addr2ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr2ary")));
        String addr3ary = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3ary")));
        String largedlvplacary = Util.Uni2Ksc(Util.checkString(req.getParameter("largedlvplacary")));
        String isldary = Util.Uni2Ksc(Util.checkString(req.getParameter("isldary")));
        String bgnnary = Util.Uni2Ksc(Util.checkString(req.getParameter("bgnnary")));
        String endnary = Util.Uni2Ksc(Util.checkString(req.getParameter("endnary")));
        String bocdary = Util.checkString(req.getParameter("bocdary"));

        // DM Setting
        SS_A_JUSODM dm = new SS_A_JUSODM();
        dm.setIncmgpers(incmgpers);
        dm.setZip1(zip1);
        dm.setZip2(zip2);
        dm.setZip3(zip3);
        dm.setAddr1ary(addr1ary);
        dm.setAddr2ary(addr2ary);
        dm.setAddr3ary(addr3ary);
        dm.setLargedlvplacary(largedlvplacary);
        dm.setIsldary(isldary);
        dm.setBgnnary(bgnnary);
        dm.setEndnary(endnary);
        dm.setBocdary(bocdary);
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� accessZip ȣ��
        ds = dao.accessZip(dm);
        req.setAttribute("ds", ds);
        
/*
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome) JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try {
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.accessZip(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-�����ڵ�-���
     * �Ǹ������� ���ν����� ����Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @throws AppException
     **/
    public void selectBNSITEMSP(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SL_L_BNSITEMDataSet ds = null;

        // parameter requesting �ϰ�  DM�� ���� Setting
        String bns_itemcd = Util.checkString(req.getParameter("txtbns_itemcd")); // ���˹��ڵ�
        String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("txtbns_itemnm"))); // ���˹���
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        SL_L_BNSITEMDM dm = new SL_L_BNSITEMDM();

        dm.setBns_itemcd(bns_itemcd); // ���˹��ڵ�
        dm.setBns_itemnm(bns_itemnm); // ���˹���
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        //dm.setBocd(sBocd); // ��������
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� selectBNSITEMSP ȣ��
        ds = dao.selectBNSITEMSP(dm);
        req.setAttribute("ds", ds);
        
/*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome)JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try{
          SSAdmin1000EJB ejb = home.create();
          ds = ejb.selectBNSITEMSP(dm); // ������ dm������ EJB�� ȣ��
          req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������-�����ڵ�-�Է�,����,����
     * �Ǹ������� ���ν����� ����Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void actionBNSITEMSP(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
        SL_A_BNSITEMDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String accflag = Util.checkString(req.getParameter("accflag")); // �÷���
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); // �Է���(������)

        String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd")); // ���˹��ڵ�
        String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemnm"))); // ���˹���
        String uprc = Util.checkString(req.getParameter("uprc")); // �ܰ�
        String mnftwon = Util.Uni2Ksc(Util.checkString(req.getParameter("mnftwon"))); // ������
        String spec = Util.Uni2Ksc(Util.checkString(req.getParameter("spec"))); // ���
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk"))); // ���
        String useclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("useclsf"))); // ���ó����
        String useyn = Util.Uni2Ksc(Util.checkString(req.getParameter("useyn"))); // ��뿩��

        SL_A_BNSITEMDM dm = new SL_A_BNSITEMDM();

        dm.setAccflag(accflag); // �÷���
        dm.setIncmgpers(incmgpers);

        dm.setBns_itemcd(bns_itemcd); // ���˹��ڵ�
        dm.setBns_itemnm(bns_itemnm); // ���˹���
        dm.setUprc(Long.parseLong(Util.convertNull(uprc,"0"))); // �ܰ�
        dm.setMnftwon(mnftwon); // ������
        dm.setSpec(spec); // ���
        dm.setRemk(remk); // ���
        dm.setUseclsf(useclsf); // ���ó����
        dm.setUseyn(useyn); // ��뿩��

        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� actionBNSITEMSP ȣ��
        ds = dao.actionBNSITEMSP(dm);
        req.setAttribute("ds", ds);
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome)JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try{
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.actionBNSITEMSP(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ������-�����ڵ�-��
     * �Ǹ������� ���ν����� ����Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/
    public void detailBNSITEMSP(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
        SL_S_BNSITEMDataSet ds = null;

        // parameter requesting �ϰ�  DM�� ���� Setting
        String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd")); // ���˹��ڵ�

        SL_S_BNSITEMDM dm = new SL_S_BNSITEMDM();

        dm.setItemcd(bns_itemcd); // ���˹��ڵ�
        
        SSAdmin1000DAO dao = new SSAdmin1000DAO();
        // DAO ��ü�� detailBNSITEMSP ȣ��
        ds = dao.detailBNSITEMSP(dm);
        req.setAttribute("ds", ds); 
        
/*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSAdmin1000EJBHome home = (SSAdmin1000EJBHome)JNDIManager.getInstance().getHome("SSAdmin1000EJB");
        try{
            SSAdmin1000EJB ejb = home.create();
            ds = ejb.detailBNSITEMSP(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
