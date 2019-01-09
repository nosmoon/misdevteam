/***************************************************************************************************
 * ���ϸ� : SSReader1300WB.java
 * ��� :  ������Ȳ-VacationStop-����,����� ���� Worker Bean
 * �ۼ����� : 2004-02-25
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������Ȳ-VacationStop-����,����� ���� Worker Bean
 */

public class SSReader1300WB {
    /**
     * ������Ȳ-VacationStop-����-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectVsclosList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_VSCLOSDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_VSCLOSDM dm = new SS_L_VSCLOSDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSReader1300DAO dao = new SSReader1300DAO();
        // DAO ��ü�� selectVsclosList ȣ��
        ds = dao.selectVsclosList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1300EJBHome home = (SSReader1300EJBHome)JNDIManager.getInstance().getHome("SSReader1300EJB");
        try{
            SSReader1300EJB ejb = home.create();
            ds = ejb.selectVsclosList(dm);
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
     * ������Ȳ-VacationStop-����-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectVsclosDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_VSCLOSDataSet ds = null;
        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_VSCLOSDM dm = new SS_S_VSCLOSDM();
        dm.setBasidt(basidt);
        
        SSReader1300DAO dao = new SSReader1300DAO();
        // DAO ��ü�� selectVsclosDetail ȣ��
        ds = dao.selectVsclosDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1300EJBHome home = (SSReader1300EJBHome)JNDIManager.getInstance().getHome("SSReader1300EJB");
        try{
            SSReader1300EJB ejb = home.create();
            ds = ejb.selectVsclosDetail(dm);
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
     * ������Ȳ-VacationStop-����-����(���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertVsclos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_VSCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String costbasiamt = Util.checkString(req.getParameter("costbasiamt"));
        String costpaydt = Util.checkString(req.getParameter("costpaydt"));

        // DM Setting
        SS_A_VSCLOSDM dm = new SS_A_VSCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setCostbasiamt(costbasiamt);
        dm.setCostpaydt(costpaydt);
        dm.setIncmgpers(incmgpers);

        SSReader1300DAO dao = new SSReader1300DAO();
        // DAO ��ü�� insertVsclos ȣ��
        ds = dao.insertVsclos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1300EJBHome home = (SSReader1300EJBHome)JNDIManager.getInstance().getHome("SSReader1300EJB");
        try{
            SSReader1300EJB ejb = home.create();
            ds = ejb.insertVsclos(dm);
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
     * ������Ȳ-VacationStop-����-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateVsclos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_VSCLOSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String costbasiamt = Util.checkString(req.getParameter("costbasiamt"));
        String costpaydt = Util.checkString(req.getParameter("costpaydt"));

        // DM Setting
        SS_A_VSCLOSDM dm = new SS_A_VSCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setCostbasiamt(costbasiamt);
        dm.setCostpaydt(costpaydt);
        dm.setIncmgpers(incmgpers);

        SSReader1300DAO dao = new SSReader1300DAO();
        // DAO ��ü�� updateVsclos ȣ��
        ds = dao.updateVsclos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1300EJBHome home = (SSReader1300EJBHome)JNDIManager.getInstance().getHome("SSReader1300EJB");
        try{
            SSReader1300EJB ejb = home.create();
            ds = ejb.updateVsclos(dm);
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
     * ������Ȳ-VacationStop-����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteVsclos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_VSCLOSDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_VSCLOSDM dm = new SS_A_VSCLOSDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);

        SSReader1300DAO dao = new SSReader1300DAO();
        // DAO ��ü�� deleteVsclos ȣ��
        ds = dao.deleteVsclos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1300EJBHome home = (SSReader1300EJBHome)JNDIManager.getInstance().getHome("SSReader1300EJB");
        try{
            SSReader1300EJB ejb = home.create();
            ds = ejb.deleteVsclos(dm);
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
     * ������Ȳ-VacationStop-����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeVsclos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_VSCLOS_CLOSEDataSet ds = null;

        // Session Processing
        //String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String incmgpers = "user_id";

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_VSCLOS_CLOSEDM dm = new SS_A_VSCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);

        SSReader1300DAO dao = new SSReader1300DAO();
        // DAO ��ü�� closeVsclos ȣ��
        ds = dao.closeVsclos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1300EJBHome home = (SSReader1300EJBHome)JNDIManager.getInstance().getHome("SSReader1300EJB");
        try{
            SSReader1300EJB ejb = home.create();
            ds = ejb.closeVsclos(dm);
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
     * ������Ȳ-VacationStop-����-�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelVsclos(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_VSCLOS_CLOSEDataSet ds = null;

        // Session Processing
        //String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String incmgpers = "user_id";

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_VSCLOS_CLOSEDM dm = new SS_A_VSCLOS_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setIncmgpers(incmgpers);

        SSReader1300DAO dao = new SSReader1300DAO();
        // DAO ��ü�� closeCancelVsclos ȣ��
        ds = dao.closeCancelVsclos(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSReader1300EJBHome home = (SSReader1300EJBHome)JNDIManager.getInstance().getHome("SSReader1300EJB");
        try{
            SSReader1300EJB ejb = home.create();
            ds = ejb.closeCancelVsclos(dm);
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