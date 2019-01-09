/***************************************************************************************************
 * ���ϸ� : SSBrsup1300WB.java
 * ��� : ��������-���غ���-���,�űԽ�û,�����û�� ���� Worker Bean
 * �ۼ����� : 2004-02-10
 * �ۼ��� : ��뼷
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
 * ��������-���غ���-���,�űԽ�û,�����û�� ���� Worker Bean
 */

public class SSBrsup1300WB {

    /**
     * ��������-���غ���-���-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_INSRDataSet ds = null;
        // Request Parameter Processing
        String fryy = Util.checkString(req.getParameter("fryy"));
        String toyy = Util.checkString(req.getParameter("toyy"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_INSRDM dm = new SS_L_INSRDM();
        dm.setFryy(fryy);
        dm.setToyy(toyy);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� selectInsrList ȣ��
        ds = dao.selectInsrList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.selectInsrList(dm);
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
     * ��������-���غ���-���-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_INSRDataSet ds = null;
        // Request Parameter Processing
        String cntryy = Util.checkString(req.getParameter("cntryy"));

        // DM Setting
        SS_S_INSRDM dm = new SS_S_INSRDM();
        dm.setCntryy(cntryy);

        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� selectInsrDetail ȣ��
        ds = dao.selectInsrDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.selectInsrDetail(dm);
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
     * ��������-���غ���-���-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertInsr(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_INSRDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String cntryy = Util.checkString(req.getParameter("cntryy"));
        String insrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrnm")));
        String insrcmpynm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpynm")));
        String insrcmpychrgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpychrgnm")));
        String insrcmpychrgemail = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpychrgemail")));
        String insruprcStr = Util.checkString(req.getParameter("insruprc"));
        long insruprc = Long.parseLong(insruprcStr);
        String splyuprcStr = Util.checkString(req.getParameter("splyuprc"));
        long splyuprc = Long.parseLong(splyuprcStr);
        String insruprcfStr = Util.checkString(req.getParameter("insruprcf"));
        long insruprcf = Long.parseLong(insruprcfStr);
        String splyuprcfStr = Util.checkString(req.getParameter("splyuprcf"));
        long splyuprcf = Long.parseLong(splyuprcfStr);
        String aplcfrdt = Util.checkString(req.getParameter("aplcfrdt"));
        String aplctodt = Util.checkString(req.getParameter("aplctodt"));
        String compdt = Util.checkString(req.getParameter("compdt"));
        String exprdt = Util.checkString(req.getParameter("exprdt"));
        System.out.println("insruprcf::"+insruprcf);
        System.out.println("splyuprcf::"+splyuprcf);
        // DM Setting
        SS_A_INSRDM dm = new SS_A_INSRDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setCntryy(cntryy);
        dm.setInsrnm(insrnm);
        dm.setInsrcmpynm(insrcmpynm);
        dm.setInsrcmpychrgnm(insrcmpychrgnm);
        dm.setInsrcmpychrgemail(insrcmpychrgemail);
        dm.setInsruprc(insruprc);
        dm.setSplyuprc(splyuprc);
        dm.setInsruprcf(insruprcf);
        dm.setSplyuprcf(splyuprcf);
        dm.setAplcfrdt(aplcfrdt);
        dm.setAplctodt(aplctodt);
        dm.setCompdt(compdt);
        dm.setExprdt(exprdt);
        
        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� insertInsr ȣ��
        ds = dao.insertInsr(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.insertInsr(dm);
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
     * ��������-���غ���-���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateInsr(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_INSRDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String cntryy = Util.checkString(req.getParameter("cntryy"));
        String insrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrnm")));
        String insrcmpynm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpynm")));
        String insrcmpychrgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpychrgnm")));
        String insrcmpychrgemail = Util.Uni2Ksc(Util.checkString(req.getParameter("insrcmpychrgemail")));
        String insruprcStr = Util.checkString(req.getParameter("insruprc"));
        long insruprc = Long.parseLong(insruprcStr);
        String splyuprcStr = Util.checkString(req.getParameter("splyuprc"));
        long splyuprc = Long.parseLong(splyuprcStr);
        String insruprcfStr = Util.checkString(req.getParameter("insruprcf"));
        long insruprcf = Long.parseLong(insruprcfStr);
        String splyuprcfStr = Util.checkString(req.getParameter("splyuprcf"));
        long splyuprcf = Long.parseLong(splyuprcfStr);
        String aplcfrdt = Util.checkString(req.getParameter("aplcfrdt"));
        String aplctodt = Util.checkString(req.getParameter("aplctodt"));
        String compdt = Util.checkString(req.getParameter("compdt"));
        String exprdt = Util.checkString(req.getParameter("exprdt"));
        // DM Setting
        SS_A_INSRDM dm = new SS_A_INSRDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setCntryy(cntryy);
        dm.setInsrnm(insrnm);
        dm.setInsrcmpynm(insrcmpynm);
        dm.setInsrcmpychrgnm(insrcmpychrgnm);
        dm.setInsrcmpychrgemail(insrcmpychrgemail);
        dm.setInsruprc(insruprc);
        dm.setSplyuprcf(splyuprcf);
        dm.setInsruprcf(insruprcf);
        dm.setSplyuprc(splyuprc);
        dm.setAplcfrdt(aplcfrdt);
        dm.setAplctodt(aplctodt);
        dm.setCompdt(compdt);
        dm.setExprdt(exprdt);
        
        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� updateInsr ȣ��
        ds = dao.updateInsr(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.updateInsr(dm);
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
     * ��������-���غ���-���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteInsr(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_INSRDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String cntryy = Util.checkString(req.getParameter("cntryy"));

        // DM Setting
        SS_A_INSRDM dm = new SS_A_INSRDM();
        dm.setAccflag(accflag);
        dm.setCntryy(cntryy);

        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� deleteInsr ȣ��
        ds = dao.deleteInsr(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.deleteInsr(dm);
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
     * ��������-���غ���-��û-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initInsrAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_INSRAPLC_INITDataSet ds = null;

        // Request Parameter Processing

        // DM Setting
    	SS_L_INSRAPLC_INITDM dm = new SS_L_INSRAPLC_INITDM();

    	SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� initInsrAplc ȣ��
        ds = dao.initInsrAplc(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.initInsrAplc(dm);
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
     * ��������-���غ���-��û-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrAplcList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_INSRAPLCDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String cntryy = Util.checkString(req.getParameter("cntryy"));
        String splychrgprocyn = Util.checkString(req.getParameter("splychrgprocyn"));

        // DM Setting
        SS_L_INSRAPLCDM dm = new SS_L_INSRAPLCDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setCntryy(cntryy);
        dm.setSplychrgprocyn(splychrgprocyn);
        
        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� selectInsrAplcList ȣ��
        ds = dao.selectInsrAplcList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.selectInsrAplcList(dm);
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
     * ��������-���غ���-��û-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateInsrAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_INSRAPLCDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String cntryyary = Util.checkString(req.getParameter("cntryyary"));
        String bocdary = Util.checkString(req.getParameter("bocdary"));
        String hdqtsplyquntary = Util.checkString(req.getParameter("hdqtsplyquntary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_INSRAPLCDM dm = new SS_U_INSRAPLCDM();
        dm.setIncmgpers(incmgpers);
        dm.setCntryyary(cntryyary);
        dm.setBocdary(bocdary);
        dm.setHdqtsplyquntary(hdqtsplyquntary);
        dm.setCheckedary(checkedary);
        
        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� updateInsrAplc ȣ��
        ds = dao.updateInsrAplc(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.updateInsrAplc(dm);
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
     * ��������-���غ���-��û-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrAplcDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_INSRAPLCDataSet ds = null;
        // Session Processing

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String cntryy = Util.checkString(req.getParameter("cntryy"));

        // DM Setting
        SS_S_INSRAPLCDM dm = new SS_S_INSRAPLCDM();
        dm.setBocd(bocd);
        dm.setCntryy(cntryy);
        
        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� selectInsrAplcDetail ȣ��
        ds = dao.selectInsrAplcDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.selectInsrAplcDetail(dm);
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
     * ��������-���غ���-����-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initInsrChg(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_INSRAPLC_INITDataSet ds = null;

        // Request Parameter Processing

        // DM Setting
    	SS_L_INSRAPLC_INITDM dm = new SS_L_INSRAPLC_INITDM();

    	SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� initInsrChg ȣ��
        ds = dao.initInsrChg(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.initInsrChg(dm);
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
     * ��������-���غ���-����-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectInsrChgList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_INSRAPLC_CHGDataSet ds = null;
        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String prn = Util.checkString(req.getParameter("prn"));
        String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String cntryy = Util.checkString(req.getParameter("cntryy"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_INSRAPLC_CHGDM dm = new SS_L_INSRAPLC_CHGDM();
        dm.setAccflag(accflag);
        dm.setPrn(prn);
        dm.setFlnm(flnm);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setCntryy(cntryy);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1300DAO dao = new SSBrsup1300DAO();
        // DAO ��ü�� selectInsrChgList ȣ��
        ds = dao.selectInsrChgList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1300EJBHome home = (SSBrsup1300EJBHome) JNDIManager.getInstance().getHome("SSBrsup1300EJB");
        try {
            SSBrsup1300EJB ejb = home.create();
            ds = ejb.selectInsrChgList(dm);
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