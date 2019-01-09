/***************************************************************************************************
 * ���ϸ� : SSBrsup1800WB.java
 * ��� : ��������-����-���������Ḧ ���� Worker Bean
 * �ۼ����� : 2004-02-23
 * �ۼ��� : �迵��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ��������-����-���������Ḧ ���� Worker Bean
 */

public class SSBrsup1800WB {
    /**
     * ��������-����-����������-����-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initRcpcmsbs(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RCPCMSBS_INITDataSet ds = null;

        // DM Setting
        SS_L_RCPCMSBS_INITDM dm = new SS_L_RCPCMSBS_INITDM();
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� initRcpcmsbs ȣ��
        ds = dao.initRcpcmsbs(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.initRcpcmsbs(dm);
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
     * ��������-����-����������-����-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRcpcmsbsList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RCPCMSBSDataSet ds = null;
        // Request Parameter Processing
        String comscd = Util.checkString(req.getParameter("comscd"));
        String comsnm = Util.Uni2Ksc(Util.checkString(req.getParameter("comsnm")));
        String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
        String calcbasiclsf = Util.checkString(req.getParameter("calcbasiclsf"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RCPCMSBSDM dm = new SS_L_RCPCMSBSDM();

        dm.setComscd(comscd);
        dm.setComsnm(comsnm);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setCalcbasiclsf(calcbasiclsf);
        dm.setRemk(remk);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� selectRcpcmsbsList ȣ��
        ds = dao.selectRcpcmsbsList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectRcpcmsbsList(dm);
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
     * ��������-����-����������-����-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRcpcmsbsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RCPCMSBSDataSet ds = null;
        // Request Parameter Processing
        String comscd = Util.checkString(req.getParameter("comscd"));

        // DM Setting
        SS_S_RCPCMSBSDM dm = new SS_S_RCPCMSBSDM();
        dm.setComscd(comscd);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� selectRcpcmsbsDetail ȣ��
        ds = dao.selectRcpcmsbsDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectRcpcmsbsDetail(dm);
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
     * ��������-����-����������-����-����(���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertRcpcmsbs(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RCPCMSBSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String comscd = Util.checkString(req.getParameter("comscd"));
        String comsnm = Util.Uni2Ksc(Util.checkString(req.getParameter("comsnm")));
        String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
        String calcbasiclsf = Util.checkString(req.getParameter("calcbasiclsf"));
        String coms = Util.checkString(req.getParameter("coms"));
        String comsrate = Util.checkString(req.getParameter("comsrate"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
        String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
        String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));


        // DM Setting
        SS_A_RCPCMSBSDM dm = new SS_A_RCPCMSBSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setComscd(comscd);
        dm.setComsnm(comsnm);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setCalcbasiclsf(calcbasiclsf);
        dm.setComs(coms);
        dm.setComsrate(comsrate);
        dm.setRemk(remk);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);

        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� insertRcpcmsbs ȣ��
        ds = dao.insertRcpcmsbs(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.insertRcpcmsbs(dm);
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
     * ��������-����-����������-����-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateRcpcmsbs(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RCPCMSBSDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String comscd = Util.checkString(req.getParameter("comscd"));
        String comsnm = Util.Uni2Ksc(Util.checkString(req.getParameter("comsnm")));
        String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
        String calcbasiclsf = Util.checkString(req.getParameter("calcbasiclsf"));
        String coms = Util.checkString(req.getParameter("coms"));
        String comsrate = Util.checkString(req.getParameter("comsrate"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
        String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
        String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));

        // DM Setting
        SS_A_RCPCMSBSDM dm = new SS_A_RCPCMSBSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setComscd(comscd);
        dm.setComsnm(comsnm);
        dm.setClamtmthdcd(clamtmthdcd);
        dm.setCalcbasiclsf(calcbasiclsf);
        dm.setComs(coms);
        dm.setComsrate(comsrate);
        dm.setRemk(remk);
        dm.setEtc1(etc1);
        dm.setEtc2(etc2);
        dm.setEtc3(etc3);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� updateRcpcmsbs ȣ��
        ds = dao.updateRcpcmsbs(dm);
        req.setAttribute("ds", ds);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.updateRcpcmsbs(dm);
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
     * ��������-����-����������-����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteRcpcmsbs(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RCPCMSBSDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String comscd = Util.checkString(req.getParameter("comscd"));

        // DM Setting
        SS_A_RCPCMSBSDM dm = new SS_A_RCPCMSBSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setComscd(comscd);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� deleteRcpcmsbs ȣ��
        ds = dao.deleteRcpcmsbs(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.deleteRcpcmsbs(dm);
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
     * ��������-����-����������-����-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCloseList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RECPCOMSCLOSDataSet ds = null;

        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        pageno = "".equals(pageno) ? "1" : pageno;
        pagesize = "".equals(pagesize) ? "20" : pagesize;

        // DM Setting
        SS_L_RECPCOMSCLOSDM dm = new SS_L_RECPCOMSCLOSDM();
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� selectCloseList ȣ��
        ds = dao.selectCloseList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectCloseList(dm);
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
     * ��������-����-����������-����-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCloseDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RECPCOMSCLOSDataSet ds = null;

        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_S_RECPCOMSCLOSDM dm = new SS_S_RECPCOMSCLOSDM();
        dm.setBasidt(basidt);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� selectClose ȣ��
        ds = dao.selectCloseDetail(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectCloseDetail(dm);
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
     * ��������-����-����������-����-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertClose(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RECPCOMSCLOSDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String paydt = Util.checkString(req.getParameter("paydt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_RECPCOMSCLOSDM dm = new SS_A_RECPCOMSCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setPaydt(paydt);
        dm.setRemk(remk);

        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� insertClose ȣ��
        ds = dao.insertClose(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.insertClose(dm);
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
     * ��������-����-����������-����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateClose(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RECPCOMSCLOSDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String paydt = Util.checkString(req.getParameter("paydt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_RECPCOMSCLOSDM dm = new SS_A_RECPCOMSCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setPaydt(paydt);
        dm.setRemk(remk);

        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� updateClose ȣ��
        ds = dao.updateClose(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.updateClose(dm);
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
     * ��������-����-����������-����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteClose(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RECPCOMSCLOSDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String paydt = Util.checkString(req.getParameter("paydt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));

        // DM Setting
        SS_A_RECPCOMSCLOSDM dm = new SS_A_RECPCOMSCLOSDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setPaydt(paydt);
        dm.setRemk(remk);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� deleteClose ȣ��
        ds = dao.deleteClose(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.deleteClose(dm);
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
     * ��������-����-����������-����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void executeClose(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RECPCOMSCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RECPCOMSCLOS_CLOSEDM dm = new SS_A_RECPCOMSCLOS_CLOSEDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� executeClose ȣ��
        ds = dao.executeClose(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.executeClose(dm);
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
     * ��������-����-����������-����-�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void cancelClose(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RECPCOMSCLOS_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        // DM Setting
        SS_A_RECPCOMSCLOS_CLOSEDM dm = new SS_A_RECPCOMSCLOS_CLOSEDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBasidt(basidt);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� cancelClose ȣ��
        ds = dao.cancelClose(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.cancelClose(dm);
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
     * ��������-����-����������-��Ȳ-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initRcp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RCP_INITDataSet ds = null;

        // DM Setting
        SS_L_RCP_INITDM dm = new SS_L_RCP_INITDM();
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� initRcp ȣ��
        ds = dao.initRcp(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.initRcp(dm);
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
     * ��������-����-����������-��Ȳ-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectRcpList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RCPDataSet ds = null;

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String clamtmthd = Util.checkString(req.getParameter("clamtmthd"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        pageno = "".equals(pageno)? "1" : pageno;
        pagesize = "".equals(pagesize)? "20" : pagesize;

        // DM Setting
        SS_L_RCPDM dm = new SS_L_RCPDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setClamtmthd(clamtmthd);
        dm.setBasidt(basidt);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� selectRcpList ȣ��
        ds = dao.selectRcpList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectRcpList(dm);
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
     * ��������-����-���μ�����Ȳ-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectGiroRecpInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_GIRORECP_INITDataSet ds = null;

        // DM Setting
        SS_L_GIRORECP_INITDM dm = new SS_L_GIRORECP_INITDM();
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� initRcp ȣ��
        ds = dao.selectGiroRecpInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectGiroRecpInit(dm);
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
     * ��������-����-���μ�����Ȳ-�����ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectGiroRecpList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_GIRORECP_LISTDataSet ds = null;

        String selclsf = Util.checkString(req.getParameter("selclsf"));
        String fromdt = Util.checkString(req.getParameter("fromdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String recpclsf = Util.checkString(req.getParameter("recpclsf"));
        String recpbankcd = Util.checkString(req.getParameter("recpbankcd"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        pageno = "".equals(pageno)? "1" : pageno;
        pagesize = "".equals(pagesize)? "20" : pagesize;

        // DM Setting
        SS_L_GIRORECP_LISTDM dm = new SS_L_GIRORECP_LISTDM();
        dm.setSelclsf(selclsf);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setRecpclsf(recpclsf);
        dm.setRecpbankcd(recpbankcd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� initRcp ȣ��
        ds = dao.selectGiroRecpList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectGiroRecpList(dm);
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
     * ��������-����-���μ�����Ȳ-��Ͽ�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectGiroRecpExcel(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_GIRORECP_PRINTDataSet ds = null;

        String selclsf = Util.checkString(req.getParameter("selclsf"));
        String fromdt = Util.checkString(req.getParameter("fromdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String recpclsf = Util.checkString(req.getParameter("recpclsf"));
        String recpbankcd = Util.checkString(req.getParameter("recpbankcd"));

        // DM Setting
        SS_L_GIRORECP_PRINTDM dm = new SS_L_GIRORECP_PRINTDM();
        dm.setSelclsf(selclsf);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setRecpclsf(recpclsf);
        dm.setRecpbankcd(recpbankcd);

        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� initRcp ȣ��
        ds = dao.selectGiroRecpExcel(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectGiroRecpExcel(dm);
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
     * ��������-����-���μ�����Ȳ-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCvsRecpInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CVSRECP_INITDataSet ds = null;

        // DM Setting
        SS_L_CVSRECP_INITDM dm = new SS_L_CVSRECP_INITDM();
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� initRcp ȣ��
        ds = dao.selectCvsRecpInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectCvsRecpInit(dm);
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
     * ��������-����-���μ�����Ȳ-�����ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCvsRecpList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CVSRECP_LISTDataSet ds = null;

        String fromdt = Util.checkString(req.getParameter("fromdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String recpbankcd = Util.checkString(req.getParameter("recpbankcd"));
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        pageno = "".equals(pageno)? "1" : pageno;
        pagesize = "".equals(pagesize)? "20" : pagesize;

        // DM Setting
        SS_L_CVSRECP_LISTDM dm = new SS_L_CVSRECP_LISTDM();
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setBocd(bocd);
        dm.setRecpbankcd(recpbankcd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� initRcp ȣ��
        ds = dao.selectCvsRecpList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectCvsRecpList(dm);
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
     * ��������-����-���μ�����Ȳ-�����ȸ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectCvsRecpPrint(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_CVSRECP_PRINTDataSet ds = null;

        String fromdt = Util.checkString(req.getParameter("fromdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String recpbankcd = Util.checkString(req.getParameter("recpbankcd"));

        // DM Setting
        SS_L_CVSRECP_PRINTDM dm = new SS_L_CVSRECP_PRINTDM();
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setBocd(bocd);
        dm.setRecpbankcd(recpbankcd);
        
        SSBrsup1800DAO dao = new SSBrsup1800DAO();
        // DAO ��ü�� initRcp ȣ��
        ds = dao.selectCvsRecpPrint(dm);
        
        /*
        SSBrsup1800EJBHome home = (SSBrsup1800EJBHome)JNDIManager.getInstance().getHome("SSBrsup1800EJB");
        try{
            SSBrsup1800EJB ejb = home.create();
            ds = ejb.selectCvsRecpPrint(dm);
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
