/***************************************************************************************************
 * ���ϸ� : SSAdmin1200WB.java
 * ��� : ������-�۾�-���̱׷��̼��� ���� Worker Bean
 * �ۼ����� : 2004-02-13
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
 * ������-�۾�-���̱׷��̼��� ���� WB
 */

public class SSAdmin1200WB {

    /**
     * ������-���̱׷��̼�-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void init(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� initMig ȣ��
        ds = dao.initMig(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome)JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.initMig(dm);
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
     * ������-���̱׷��̼�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMigBOCDList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKCHKDataSet ds = null;
        // Request Parameter Processing

        String endcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("endcnfmyn")));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);

        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MIGRWORKCHKDM dm = new SS_L_MIGRWORKCHKDM();

        dm.setEndcnfmyn(endcnfmyn);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO ��ü�� selectMigList ȣ��
        ds = dao.selectMigBOCDList(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMigBOCDList(dm);
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
     * ������-���̱׷��̼�-���� ������Ȳ ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMIGRMECD(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRMECDDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRMECDDM dm = new SS_L_MIGRMECDDM();

        dm.setBocd(bocd);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO ��ü�� selectMigList ȣ��
        ds = dao.selectMIGRMECD(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMIGRMECD(dm);
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
     * ������-���̱׷��̼�-������ ������Ȳ ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMIGRGUYUK(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRGUYUKDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRGUYUKDM dm = new SS_L_MIGRGUYUKDM();

        dm.setBocd(bocd);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO ��ü�� selectMigList ȣ��
        ds = dao.selectMIGRGUYUK(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMIGRGUYUK(dm);
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
     * ������-���̱׷��̼�-���ݹ���� ������Ȳ ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMIGRSGBANG(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRSGBANGDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRSGBANGDM dm = new SS_L_MIGRSGBANGDM();

        dm.setBocd(bocd);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO ��ü�� selectMigList ȣ��
        ds = dao.selectMIGRSGBANG(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMIGRSGBANG(dm);
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
     * ������-���̱׷��̼�-����������ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMIGRERR(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRERRDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRERRDM dm = new SS_L_MIGRERRDM();

        dm.setBocd(bocd);
        
        SSAdmin1200DAO dao = new SSAdmin1200DAO();
        // DAO ��ü�� selectMigList ȣ��
        ds = dao.selectMIGRERR(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1200EJBHome home = (SSAdmin1200EJBHome) JNDIManager.getInstance().getHome("SSAdmin1200EJB");
        try {
            SSAdmin1200EJB ejb = home.create();
            ds = ejb.selectMIGRERR(dm);
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

}
