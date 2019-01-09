/***************************************************************************************************
* ���ϸ� : SSBrinfo1400WB.java
* ��� : ����Info-������ǰ��Ȳ-��Ȳ ó���� ���� Worker Bean
* �ۼ����� : 2004-01-27
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
 * ����Info-������ǰ��Ȳ-��Ȳ ���� WB
 */

public class SSBrinfo1400WB{

    /**
     * ����Info-������ǰ��Ȳ-��Ȳ �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_ASET_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_ASET_INITDM dm = new SS_L_ASET_INITDM();
        
        SSBrinfo1400DAO dao = new SSBrinfo1400DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrinfo1400EJBHome home = (SSBrinfo1400EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1400EJB");
        try{
            SSBrinfo1400EJB ejb = home.create();
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
     * ����Info-������ǰ��Ȳ-��Ȳ ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectAsetList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_ASETDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_ASETDM dm = new SS_L_ASETDM();
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        SSBrinfo1400DAO dao = new SSBrinfo1400DAO();
		// DAO ��ü�� selectAsetList ȣ��
		ds = dao.selectAsetList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1400EJBHome home = (SSBrinfo1400EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1400EJB");
        try{
            SSBrinfo1400EJB ejb = home.create();
            ds = ejb.selectAsetList(dm);
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
     * ����Info-������ǰ��Ȳ-�� ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectAsetDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_ASET_DTLDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String asetclascd = Util.checkString(req.getParameter("asetclascd"));  //��ǰ�з��ڵ�
        String asetnm = Util.checkString(req.getParameter("asetnm"));  //��ǰ��
        String frdt = Util.checkString(req.getParameter("frdt")); //������
        String todt = Util.checkString(req.getParameter("todt")); //������

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_ASET_DTLDM dm = new SS_L_ASET_DTLDM();
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setAsetclascd(asetclascd);
        dm.setAsetnm(asetnm);
        dm.setFrdt(frdt);   //������
        dm.setTodt(todt);   //������

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        SSBrinfo1400DAO dao = new SSBrinfo1400DAO();
		// DAO ��ü�� selectAsetDetailList ȣ��
		ds = dao.selectAsetDetailList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSBrinfo1400EJBHome home = (SSBrinfo1400EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1400EJB");
        try{
            SSBrinfo1400EJB ejb = home.create();
            ds = ejb.selectAsetDetailList(dm);
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
     * ����Info-������ǰ��Ȳ-��-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectAsetDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_ASET_DTLDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String asetseq = Util.checkString(req.getParameter("asetseq"));

        // DM Setting
        SS_S_ASET_DTLDM dm = new SS_S_ASET_DTLDM();
        dm.setBocd(bocd);
        dm.setAsetseq(asetseq);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1400EJBHome home = (SSBrinfo1400EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1400EJB");
        try{
            SSBrinfo1400EJB ejb = home.create();
            ds = ejb.selectAsetDetail(dm);
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