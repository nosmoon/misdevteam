/***************************************************************************************************
 * ���ϸ� : SSBrmgr1600WB.java
 * ��� : �����濵-�������μ���Ȳ�� ���� Worker Bean
 * �ۼ����� : 2004-03-12
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �����濵-�������μ���Ȳ�� ���� WB
 */

public class SSBrmgr1600WB {
    /**
     * �����濵-�������μ���Ȳ-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initSpQty(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_L_QTY_SP_INITDataSet ds = null;

        // DM Setting
    	SS_L_QTY_SP_INITDM dm = new SS_L_QTY_SP_INITDM();
    	
    	SSBrmgr1600DAO dao = new SSBrmgr1600DAO();
        // DAO ��ü�� initSpQty ȣ��
        ds = dao.initSpQty(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrmgr1600EJBHome home = (SSBrmgr1600EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1600EJB");
        try {
            SSBrmgr1600EJB ejb = home.create();
            ds = ejb.initSpQty(dm);
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
     * �����濵-�������μ���Ȳ-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectSpQtyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // ��������� �Ǽ� DB ������ ��
        SS_L_QTY_SPDataSet ds = null;

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_QTY_SPDM dm = new SS_L_QTY_SPDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setYymm(yymm);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrmgr1600DAO dao = new SSBrmgr1600DAO();
        // DAO ��ü�� selectSpQtyList ȣ��
        ds = dao.selectSpQtyList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrmgr1600EJBHome home = (SSBrmgr1600EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1600EJB");
        try {
            SSBrmgr1600EJB ejb = home.create();
            ds = ejb.selectSpQtyList(dm);
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
     * �����濵-�������μ���Ȳ-�μ�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printSpQtyExcel(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // ��������� �Ǽ� DB ������ ��
        SS_L_QTY_SP_EXCELDataSet ds = null;

        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String medicd = Util.checkString(req.getParameter("medicd"));
        String yymm = Util.checkString(req.getParameter("yymm"));

        // DM Setting
        SS_L_QTY_SP_EXCELDM dm = new SS_L_QTY_SP_EXCELDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setMedicd(medicd);
        dm.setYymm(yymm);
        
        SSBrmgr1600DAO dao = new SSBrmgr1600DAO();
        // DAO ��ü�� printSpQtyExcel ȣ��
        ds = dao.printSpQtyExcel(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1600EJBHome home = (SSBrmgr1600EJBHome) JNDIManager.getInstance().getHome("SSBrmgr1600EJB");
        try {
            SSBrmgr1600EJB ejb = home.create();
            ds = ejb.printSpQtyExcel(dm);
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
