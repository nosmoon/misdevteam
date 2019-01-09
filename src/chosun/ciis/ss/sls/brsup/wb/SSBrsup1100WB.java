/***************************************************************************************************
 * ���ϸ� : SSBrsup1100WB.java
 * ��� : ��������-�Ź�������ǰ-�߼�,��� ���� Worker Bean
 * �ۼ����� : 2004-01-20
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

/**
 * ��������-�Ź�������ǰ-�߼�,��� ���� WB
 */

public class SSBrsup1100WB {

    /**
     * ��������-�Ź�������ǰ-�߼�-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initNwspItemSend(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEM_CDLSTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_NWSPITEM_CDLSTDM dm = new SS_L_NWSPITEM_CDLSTDM();
        
        SSBrsup1100DAO dao = new SSBrsup1100DAO();
        // DAO ��ü�� initNwspItemSend ȣ��
        ds = dao.initNwspItemSend(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1100EJBHome home = (SSBrsup1100EJBHome) JNDIManager.getInstance().getHome("SSBrsup1100EJB");
        try {
            SSBrsup1100EJB ejb = home.create();
            ds = ejb.initNwspItemSend(dm);
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
     * ��������-�Ź�������ǰ-�߼�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemSendList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEMSENDDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));
        String sendclsf = Util.checkString(req.getParameter("sendclsf"));
        String costclsf = Util.checkString(req.getParameter("costclsf"));
        String sendplaccd = Util.checkString(req.getParameter("sendplaccd"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_NWSPITEMSENDDM dm = new SS_L_NWSPITEMSENDDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setItemcd(itemcd);
        dm.setItemclsf(itemclsf);
        dm.setSendclsf(sendclsf);
        dm.setCostclsf(costclsf);
        dm.setSendplaccd(sendplaccd);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1100DAO dao = new SSBrsup1100DAO();
        // DAO ��ü�� selectNwspItemSendList ȣ��
        ds = dao.selectNwspItemSendList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1100EJBHome home = (SSBrsup1100EJBHome) JNDIManager.getInstance().getHome("SSBrsup1100EJB");
        try {
            SSBrsup1100EJB ejb = home.create();
            ds = ejb.selectNwspItemSendList(dm);
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
     * ��������-�Ź�������ǰ-���-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initNwspItemAccd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEM_CDLSTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_NWSPITEM_CDLSTDM dm = new SS_L_NWSPITEM_CDLSTDM();

        SSBrsup1100DAO dao = new SSBrsup1100DAO();
        // DAO ��ü�� initNwspItemAccd ȣ��
        ds = dao.initNwspItemAccd(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1100EJBHome home = (SSBrsup1100EJBHome) JNDIManager.getInstance().getHome("SSBrsup1100EJB");
        try {
            SSBrsup1100EJB ejb = home.create();
            ds = ejb.initNwspItemAccd(dm);
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
     * ��������-�Ź�������ǰ-���-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemAccdList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEMACCDDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));
        String sendclsf = Util.checkString(req.getParameter("sendclsf"));
        String costclsf = Util.checkString(req.getParameter("costclsf"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_NWSPITEMACCDDM dm = new SS_L_NWSPITEMACCDDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setItemcd(itemcd);
        dm.setItemclsf(itemclsf);
        dm.setSendclsf(sendclsf);
        dm.setCostclsf(costclsf);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSBrsup1100DAO dao = new SSBrsup1100DAO();
        // DAO ��ü�� selectNwspItemAccdList ȣ��
        ds = dao.selectNwspItemAccdList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1100EJBHome home = (SSBrsup1100EJBHome) JNDIManager.getInstance().getHome("SSBrsup1100EJB");
        try {
            SSBrsup1100EJB ejb = home.create();
            ds = ejb.selectNwspItemAccdList(dm);
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
     * ��������-�Ź�������ǰ-���-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemAccdDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_NWSPITEMACCDDataSet ds = null;
        // Request Parameter Processing
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplcno = Util.checkString(req.getParameter("aplcno"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String accdno = Util.checkString(req.getParameter("accdno"));
        // DM Setting
        SS_S_NWSPITEMACCDDM dm = new SS_S_NWSPITEMACCDDM();
        dm.setAplcdt(aplcdt);
        dm.setAplcno(aplcno);
        dm.setItemcd(itemcd);
        dm.setAccdno(accdno);

        SSBrsup1100DAO dao = new SSBrsup1100DAO();
        // DAO ��ü�� selectNwspItemAccdDetail ȣ��
        ds = dao.selectNwspItemAccdDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1100EJBHome home = (SSBrsup1100EJBHome) JNDIManager.getInstance().getHome("SSBrsup1100EJB");
        try {
            SSBrsup1100EJB ejb = home.create();
            ds = ejb.selectNwspItemAccdDetail(dm);
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
     * ��������-�Ź�������ǰ-���-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertNwspItemAccd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_NWSPITEMACCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String accddt = Util.checkString(req.getParameter("accddt"));
        String accdquntStr = Util.checkString(req.getParameter("accdqunt"));
        long accdqunt = Long.parseLong(accdquntStr);
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        // DM Setting
        SS_A_NWSPITEMACCDDM dm = new SS_A_NWSPITEMACCDDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setItemcd(itemcd);
        dm.setAccddt(accddt);
        dm.setAccdqunt(accdqunt);
        dm.setRemk(remk);

        SSBrsup1100DAO dao = new SSBrsup1100DAO();
        // DAO ��ü�� insertNwspItemAccd ȣ��
        ds = dao.insertNwspItemAccd(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1100EJBHome home = (SSBrsup1100EJBHome) JNDIManager.getInstance().getHome("SSBrsup1100EJB");
        try {
            SSBrsup1100EJB ejb = home.create();
            ds = ejb.insertNwspItemAccd(dm);
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
     * ��������-�Ź�������ǰ-���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateNwspItemAccd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_NWSPITEMACCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplcno = Util.checkString(req.getParameter("aplcno"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String accdno = Util.checkString(req.getParameter("accdno"));
        String accddt = Util.checkString(req.getParameter("accddt"));
        String accdquntStr = Util.checkString(req.getParameter("accdqunt"));
        long accdqunt = Long.parseLong(accdquntStr);
        String regdt = Util.checkString(req.getParameter("regdt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        // DM Setting
        SS_A_NWSPITEMACCDDM dm = new SS_A_NWSPITEMACCDDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setAplcdt(aplcdt);
        dm.setAplcno(aplcno);
        dm.setItemcd(itemcd);
        dm.setAccdno(accdno);
        dm.setAccddt(accddt);
        dm.setAccdqunt(accdqunt);
        dm.setRegdt(regdt);
        dm.setRemk(remk);
        
        SSBrsup1100DAO dao = new SSBrsup1100DAO();
        // DAO ��ü�� updateNwspItemAccd ȣ��
        ds = dao.updateNwspItemAccd(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1100EJBHome home = (SSBrsup1100EJBHome) JNDIManager.getInstance().getHome("SSBrsup1100EJB");
        try {
            SSBrsup1100EJB ejb = home.create();
            ds = ejb.updateNwspItemAccd(dm);
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
     * ��������-�Ź�������ǰ-���-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteNwspItemAccd(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_NWSPITEMACCDDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String aplcdt = Util.checkString(req.getParameter("aplcdt"));
        String aplcno = Util.checkString(req.getParameter("aplcno"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String accdno = Util.checkString(req.getParameter("accdno"));
        // DM Setting
        SS_A_NWSPITEMACCDDM dm = new SS_A_NWSPITEMACCDDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setAplcdt(aplcdt);
        dm.setAplcno(aplcno);
        dm.setItemcd(itemcd);
        dm.setAccdno(accdno);
        
        SSBrsup1100DAO dao = new SSBrsup1100DAO();
        // DAO ��ü�� deleteNwspItemAccd ȣ��
        ds = dao.deleteNwspItemAccd(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1100EJBHome home = (SSBrsup1100EJBHome) JNDIManager.getInstance().getHome("SSBrsup1100EJB");
        try {
            SSBrsup1100EJB ejb = home.create();
            ds = ejb.deleteNwspItemAccd(dm);
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
