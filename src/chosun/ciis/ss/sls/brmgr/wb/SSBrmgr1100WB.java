/***************************************************************************************************
* ���ϸ� : SSBrmgr1100WB.java
* ��� : �����濵-���ϸ�����Ȳ ó���� ���� Worker Bean
* �ۼ����� : 2004-03-06
* �ۼ��� : ����ȫ
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


/**
 * �����濵-���ϸ�����Ȳ ���� WB
 */

public class SSBrmgr1100WB{

    /**
     * �����濵-���ϸ�����Ȳ �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_MIGLLMMTCLOS_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_MIGLLMMTCLOS_INITDM dm = new SS_L_MIGLLMMTCLOS_INITDM();
        
        SSBrmgr1100DAO dao = new SSBrmgr1100DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1100EJBHome home = (SSBrmgr1100EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1100EJB");
        try{
            SSBrmgr1100EJB ejb = home.create();
            ds = ejb.selectInitList(dm);
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
     * �����濵-���ϸ�����Ȳ ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectMigllmmtclosList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_MIGLLMMTCLOSDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basidt = Util.checkString(req.getParameter("basidt"));

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        SS_L_MIGLLMMTCLOSDM dm = new SS_L_MIGLLMMTCLOSDM();
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setBasidt(basidt);

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        SSBrmgr1100DAO dao = new SSBrmgr1100DAO();
		// DAO ��ü�� selectMigllmmtclosList ȣ��
		ds = dao.selectMigllmmtclosList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1100EJBHome home = (SSBrmgr1100EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1100EJB");
        try{
            SSBrmgr1100EJB ejb = home.create();
            ds = ejb.selectMigllmmtclosList(dm);
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
     * �����濵-���ϸ�����Ȳ ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectMilgpayDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_MILGPAYDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        SS_L_MILGPAYDM dm = new SS_L_MILGPAYDM();
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        SSBrmgr1100DAO dao = new SSBrmgr1100DAO();
		// DAO ��ü�� selectMilgpayDetail ȣ��
		ds = dao.selectMilgpayDetail(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1100EJBHome home = (SSBrmgr1100EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1100EJB");
        try{
            SSBrmgr1100EJB ejb = home.create();
            ds = ejb.selectMilgpayDetail(dm);
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