/***************************************************************************************************
* ���ϸ� : SSBrinfo1300WB.java
* ��� : ����Info-����������Ȳ ó���� ���� Worker Bean
* �ۼ����� : 2004-02-02
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ����Info-����������Ȳ ���� WB
 */

public class SSBrinfo1300WB{

    /**
     * ����Info-����������Ȳ �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_BOEMP_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_BOEMP_INITDM dm = new SS_L_BOEMP_INITDM();
        
        SSBrinfo1300DAO dao = new SSBrinfo1300DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1300EJBHome home = (SSBrinfo1300EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1300EJB");
        try{
            SSBrinfo1300EJB ejb = home.create();
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
     * ����Info-����������Ȳ ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoempList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BOEMPDataSet ds = null;
        // Request Parameter Processing
        String viewflag = Util.checkString(req.getParameter("viewflag"));  //��ȸ����
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_BOEMPDM dm = new SS_L_BOEMPDM();
        dm.setViewflag(viewflag);//��ȸ����
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        SSBrinfo1300DAO dao = new SSBrinfo1300DAO();
		// DAO ��ü�� selectBoempList ȣ��
		ds = dao.selectBoempList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1300EJBHome home = (SSBrinfo1300EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1300EJB");
        try{
            SSBrinfo1300EJB ejb = home.create();
            ds = ejb.selectBoempList(dm);
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
     * ����Info-����������Ȳ-�󼼸��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoempDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BOEMP_DTLDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�

        // DM Setting
        SS_L_BOEMP_DTLDM dm = new SS_L_BOEMP_DTLDM();
        dm.setBocd(bocd);      //�����ڵ�
        
        SSBrinfo1300DAO dao = new SSBrinfo1300DAO();
        // DAO ��ü�� selectBoempDetailList ȣ��
        ds = dao.selectBoempDetailList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1300EJBHome home = (SSBrinfo1300EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1300EJB");
        try{
            SSBrinfo1300EJB ejb = home.create();
            ds = ejb.selectBoempDetailList(dm);
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