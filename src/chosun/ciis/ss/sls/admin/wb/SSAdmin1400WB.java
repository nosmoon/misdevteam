/***************************************************************************************************
 * ���ϸ� : SSAdmin1400WB.java
 * ��� : ������-�۾�-����� ���� Worker Bean
 * �ۼ����� : 2004-04-09
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
 * ������-�۾�-����� ���� WB
 */

public class SSAdmin1400WB {
    /**
     * ������-�۾�-���-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRK_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_WRK_INITDM dm = new SS_L_WRK_INITDM();

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� initWrk ȣ��
        ds = dao.initWrk(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.initWrk(dm);
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
     * ������-�۾�-���-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectWrkList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRKDataSet ds = null;
        // Request Parameter Processing
        String cycl = Util.checkString(req.getParameter("cycl"));
        String id = Util.checkString(req.getParameter("id"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_WRKDM dm = new SS_L_WRKDM();
        dm.setCycl(cycl);
        dm.setId(id);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� selectWrkList ȣ��
        ds = dao.selectWrkList(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.selectWrkList(dm);
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
     * ������-�۾�-���-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectWrkDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_WRKDataSet ds = null;
        // Request Parameter Processing
        String id = Util.checkString(req.getParameter("id"));

        // DM Setting
        SS_S_WRKDM dm = new SS_S_WRKDM();
        dm.setId(id);

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� selectWrkDetail ȣ��
        ds = dao.selectWrkDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.selectWrkDetail(dm);
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
     * ������-�۾�-���-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_WRKDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
        String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
        String cycl = Util.checkString(req.getParameter("cycl"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String endddyn = Util.checkString(req.getParameter("endddyn"));
        String basitm = Util.checkString(req.getParameter("basitm"));
        String pgmnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgmnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_WRKDM dm = new SS_A_WRKDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setId(id);
        dm.setDescri(descri);
        dm.setCycl(cycl);
        dm.setBasidt(basidt);
        dm.setEndddyn(endddyn);
        dm.setBasitm(basitm);
        dm.setPgmnm(pgmnm);
        dm.setRemk(remk);
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� insertWrk ȣ��
        ds = dao.insertWrk(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.insertWrk(dm);
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
     * ������-�۾�-���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_WRKDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
        String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
        String cycl = Util.checkString(req.getParameter("cycl"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String endddyn = Util.checkString(req.getParameter("endddyn"));
        String basitm = Util.checkString(req.getParameter("basitm"));
        String pgmnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgmnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_WRKDM dm = new SS_A_WRKDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setId(id);
        dm.setDescri(descri);
        dm.setCycl(cycl);
        dm.setBasidt(basidt);
        dm.setEndddyn(endddyn);
        dm.setBasitm(basitm);
        dm.setPgmnm(pgmnm);
        dm.setRemk(remk);
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� updateWrk ȣ��
        ds = dao.updateWrk(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.updateWrk(dm);
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
     * ������-�۾�-���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_WRKDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));

        // DM Setting
        SS_A_WRKDM dm = new SS_A_WRKDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setId(id);

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� deleteWrk ȣ��
        ds = dao.deleteWrk(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.deleteWrk(dm);
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
     * ������-�۾�-���-��������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void runWrk(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        // Request Parameter Processing
        String id = Util.checkString(req.getParameter("id"));

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� runWrk ȣ��
        dao.runWrk(id, incmgpers);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ejb.runWrk(id, incmgpers);
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
     * ������-�۾��̷�-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initWrkHist(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRKHIST_INITDataSet ds = null;
        // Request Parameter Processing
        // DM Setting
        SS_L_WRKHIST_INITDM dm = new SS_L_WRKHIST_INITDM();
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� initWrkHist ȣ��
        ds = dao.initWrkHist(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.initWrkHist(dm);
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
     * ������-�۾�-�̷�-���(�̷�)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectWrkHstyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRKHISTDataSet ds = null;
        // Request Parameter Processing
        String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_WRKHISTDM dm = new SS_L_WRKHISTDM();
        dm.setId(id);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� selectWrkHstyList ȣ��
        ds = dao.selectWrkHstyList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.selectWrkHstyList(dm);
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
     * ������-�۾�-�̷�-���(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectWrkPtcrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_WRKDTLDataSet ds = null;
        // Request Parameter Processing
        String id = Util.checkString(req.getParameter("id"));
        String execno = Util.checkString(req.getParameter("execno"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_WRKDTLDM dm = new SS_L_WRKDTLDM();
        dm.setId(id);
        dm.setExecno(execno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1400DAO dao = new SSAdmin1400DAO();
        // DAO ��ü�� selectWrkPtcrList ȣ��
        ds = dao.selectWrkPtcrList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1400EJBHome home = (SSAdmin1400EJBHome) JNDIManager.getInstance().getHome("SSAdmin1400EJB");
        try {
            SSAdmin1400EJB ejb = home.create();
            ds = ejb.selectWrkPtcrList(dm);
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
