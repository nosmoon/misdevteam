/***************************************************************************************************
* ���ϸ� : SSBrmgr1000WB.java
* ��� : �����濵-�����μ���Ȳ ó���� ���� Worker Bean
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
 * �����濵-�����μ���Ȳ ���� WB
 */

public class SSBrmgr1000WB{

    /**
     * �����濵-�����μ���Ȳ �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_BOSENDPCOND_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
                
        SS_L_BOSENDPCOND_INITDM dm = new SS_L_BOSENDPCOND_INITDM();
        
        dm.setIncmg_pers(emp_no);
        dm.setCmpy_cd(cmpycd);
                
        SSBrmgr1000DAO dao = new SSBrmgr1000DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrmgr1000EJBHome home = (SSBrmgr1000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1000EJB");
        try{
            SSBrmgr1000EJB ejb = home.create();
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
     * �����濵-�����μ���Ȳ ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectBoqtypcondList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BOSENDPCONDDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�

        String medicd = Util.checkString(req.getParameter("medicd"));
        String yymm = Util.checkString(req.getParameter("yymm"));

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        // DM Setting
        SS_L_BOSENDPCONDDM dm = new SS_L_BOSENDPCONDDM();
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setMedicd(medicd);  //��ü�ڵ�
        dm.setYymm(yymm);      //���

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        dm.setIncmg_pers(incmg_pers);
        dm.setCmpy_cd(cmpy_cd);
        
        SSBrmgr1000DAO dao = new SSBrmgr1000DAO();
		// DAO ��ü�� selectBoqtypcondList ȣ��
		ds = dao.selectBoqtypcondList(dm);
		req.setAttribute("ds", ds);
		

		/*
        SSBrmgr1000EJBHome home = (SSBrmgr1000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1000EJB");
        try{
            SSBrmgr1000EJB ejb = home.create();
            ds = ejb.selectBoqtypcondList(dm);
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
     * �����濵-�����μ���Ȳ ��������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoqtypcondEXCEL(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_P_BOSENDPCONDDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�

        String medicd = Util.checkString(req.getParameter("medicd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        // DM Setting
        SS_P_BOSENDPCONDDM dm = new SS_P_BOSENDPCONDDM();
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setMedicd(medicd);  //��ü�ڵ�
        dm.setYymm(yymm);      //���
        dm.setIncmg_pers(incmg_pers);
        dm.setCmpy_cd(cmpy_cd);
        
        SSBrmgr1000DAO dao = new SSBrmgr1000DAO();
        // DAO ��ü�� selectBoqtypcondList ȣ��
        ds = dao.selectBoqtypcondEXCEL(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1000EJBHome home = (SSBrmgr1000EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1000EJB");
        try{
            SSBrmgr1000EJB ejb = home.create();
            ds = ejb.selectBoqtypcondEXCEL(dm);
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
     * �����濵-�����μ���Ȳ ��������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoqtypcondDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SL_I_ABCDataSet ds = null;
        // Request Parameter Processing

        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String medicd = Util.checkString(req.getParameter("medicd"));
        String yymm = Util.checkString(req.getParameter("yymm"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));
        String pageno = Util.checkString(req.getParameter("pageno"));
      
//        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
//        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
        System.out.println("bocd::"+bocd);
        System.out.println("medicd::"+medicd);
        System.out.println("yymm::"+yymm);
        System.out.println("pagesize::"+pagesize);
        System.out.println("pageno::"+pageno);

        // DM Setting
        SL_I_ABCDM dm = new SL_I_ABCDM();
        dm.setBocd(bocd);      //�����ڵ�
        dm.setMedicd(medicd);  //��ü�ڵ�
        dm.setYymm(yymm);      //���
        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        SSBrmgr1000DAO dao = new SSBrmgr1000DAO();
        // DAO ��ü�� selectBoqtypcondList ȣ��
        ds = dao.selectBoqtypcondDetailList(dm);
        req.setAttribute("ds", ds);

      
    }

}
