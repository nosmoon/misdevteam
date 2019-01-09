/***************************************************************************************************
* ���ϸ� : SSReader1400WB.java
* ��� : ������Ȳ-VacationStop-��� ó���� ���� Worker Bean
* �ۼ����� : 2004-01-17
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
 * ������Ȳ-VacationStop-��� ���� WB
 */

public class SSReader1400WB{

    /**
     * ������Ȳ-VacationStop-��� �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_VSCOST_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_VSCOST_INITDM dm = new SS_L_VSCOST_INITDM();

        SSReader1400DAO dao = new SSReader1400DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1400EJBHome home = (SSReader1400EJBHome)JNDIManager.getInstance().getHome("SSReader1400EJB");
        try{
            SSReader1400EJB ejb = home.create();
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
     * ������Ȳ-VacationStop-��� �ް������ڵ�,�ڵ�� ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectVacaAreaList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_VSCD_AREANMDataSet ds = null;
        // Request Parameter Processing
        String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("common_vaca_arearegncd")));

        // DM Setting
        SS_L_VSCD_AREANMDM dm = new SS_L_VSCD_AREANMDM();
        dm.setVaca_arearegncd(vaca_arearegncd);
        
        SSReader1400DAO dao = new SSReader1400DAO();
		// DAO ��ü�� selectVacaAreaList ȣ��
		ds = dao.selectVacaAreaList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1400EJBHome home = (SSReader1400EJBHome)JNDIManager.getInstance().getHome("SSReader1400EJB");
        try{
            SSReader1400EJB ejb = home.create();
            ds = ejb.selectVacaAreaList(dm);
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
     * ������Ȳ-VacationStop-��� ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectVscostList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_VSCOST_COSTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));   //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));   //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));       //�����ڵ�
        String frdt = Util.checkString(req.getParameter("frdt"));       //������
        String todt = Util.checkString(req.getParameter("todt"));       //������

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_VSCOST_COSTDM dm = new SS_L_VSCOST_COSTDM();
        dm.setDeptcd(deptcd );  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setFrdt(frdt);   //������
        dm.setTodt(todt);   //������
        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������

		SSReader1400DAO dao = new SSReader1400DAO();
		// DAO ��ü�� selectVscostList ȣ��
		ds = dao.selectVscostList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1400EJBHome home = (SSReader1400EJBHome)JNDIManager.getInstance().getHome("SSReader1400EJB");
        try{
            SSReader1400EJB ejb = home.create();
            ds = ejb.selectVscostList(dm);
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