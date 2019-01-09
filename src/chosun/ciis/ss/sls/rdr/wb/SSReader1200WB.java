/***************************************************************************************************
* ���ϸ� : SSReader1200WB.java
* ��� : ������Ȳ-VacationStop-��û ó���� ���� Worker Bean
* �ۼ����� : 2004-01-14
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
 * ������Ȳ-VacationStop-��û ���� WB
 */

public class SSReader1200WB{

    /**
     * ������Ȳ-VacationStop-��û �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_VS_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_VS_INITDM dm = new SS_L_VS_INITDM();
        
        SSReader1200DAO dao = new SSReader1200DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1200EJBHome home = (SSReader1200EJBHome)JNDIManager.getInstance().getHome("SSReader1200EJB");
        try{
            SSReader1200EJB ejb = home.create();
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
     * ������Ȳ-VacationStop-��û ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectVsList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_VSDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String partcd = Util.checkString(req.getParameter("partcd"));  //��Ʈ�ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));  //����ڵ�
        String fromtogb = Util.checkString(req.getParameter("fromtogb"));  //�Ⱓ��������
        String frdt = Util.checkString(req.getParameter("frdt")); //������
        String todt = Util.checkString(req.getParameter("todt")); //������
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm"))); //���ڸ�
        String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));  //������Ȯ��
        String vaca_areadlvofficnfmyn = Util.checkString(req.getParameter("vaca_areadlvofficnfmyn"));  //�������Ȯ��
        String clsfcd = Util.checkString(req.getParameter("clsfcd"));  //���� �ڵ�

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        SS_L_VSDM dm = new SS_L_VSDM();
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setFromtogb(fromtogb);  //�Ⱓ����
        dm.setFrdt(frdt);   //������
        dm.setTodt(todt);   //������
        dm.setRdrnm(rdrnm); //���ڸ�
        dm.setBocnfmyn(bocnfmyn);  //������Ȯ��
        dm.setVaca_areadlvofficnfmyn(vaca_areadlvofficnfmyn);  //�������Ȯ��
        dm.setAplcpathcd(aplcpathcd);  //����ڵ�
        dm.setClsfcd(clsfcd);  //�����ڵ�
        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������

        SSReader1200DAO dao = new SSReader1200DAO();
		// DAO ��ü�� selectVsList ȣ��
		ds = dao.selectVsList(dm);
		req.setAttribute("ds", ds);
        req.setAttribute("curr_page_no", pageno);
        req.setAttribute("records_per_page", pagesize);
		
        /*
        SSReader1200EJBHome home = (SSReader1200EJBHome)JNDIManager.getInstance().getHome("SSReader1200EJB");
        try{
            SSReader1200EJB ejb = home.create();
            ds = ejb.selectVsList(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("curr_page_no", pageno);
            req.setAttribute("records_per_page", pagesize);
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
     * ������Ȳ-VacationStop-��û ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectVsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_VSDataSet ds = null;
        // Request Parameter Processing
        String regdt = Util.checkString(req.getParameter("regdt"));
        String regno = Util.checkString(req.getParameter("regno"));

        // DM Setting
        SS_S_VSDM dm = new SS_S_VSDM();
        dm.setRegdt(regdt);
        dm.setRegno(regno);

        SSReader1200DAO dao = new SSReader1200DAO();
		// DAO ��ü�� selectVsDetail ȣ��
		ds = dao.selectVsDetail(dm);
		req.setAttribute("ds", ds);
		
		/*
        SSReader1200EJBHome home = (SSReader1200EJBHome)JNDIManager.getInstance().getHome("SSReader1200EJB");
        try{
            SSReader1200EJB ejb = home.create();
            ds = ejb.selectVsDetail(dm);
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