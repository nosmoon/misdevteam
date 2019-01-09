/***************************************************************************************************
* ���ϸ� : SSBrmgr1500WB.java
* ��� : �����濵-������ ����� ��Ȳ ó���� ���� Worker Bean
* �ۼ����� : 2004-02-24
* �ۼ��� : �輺��
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
 * �����濵-������ ����� ��Ȳ�� ���� WB
 */

public class SSBrmgr1500WB{

    /**
     * �����濵-������ ����� ��Ȳ-�ʱ�ȭ��(�μ���ȸ, ���� ��� ��ȸ, ���� ���� ��ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_FCT_FRFT_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_FCT_FRFT_INITDM dm = new SS_L_FCT_FRFT_INITDM();
        
        SSBrmgr1500DAO dao = new SSBrmgr1500DAO();
        // DAO ��ü�� selectCodeList ȣ��
        ds = dao.selectCodeList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1500EJBHome home = (SSBrmgr1500EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1500EJB");
        try{
            SSBrmgr1500EJB ejb = home.create();
            ds = ejb.selectCodeList(dm);
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
     * �����濵-������ ����� ��Ȳ-��ȸ ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectCommList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_FCT_FRFT_LISTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String frdt = Util.checkString(req.getParameter("frdt"));      //�ΰ��Ⱓ �˻� ������
        String todt = Util.checkString(req.getParameter("todt"));      //�ΰ��Ⱓ �˻� ������
        String viltresn = Util.checkString(req.getParameter("viltresn"));         //���� ����
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));   // ���ڸ�
        String delbocom = Util.checkString(req.getParameter("delbocom"));   //���ǰ��
        String pageno = Util.checkString(req.getParameter("pageno"));       //���� ������
        String pagesize = Util.checkString(req.getParameter("pagesize")); //�������� �Ǽ�

        // DM Setting
        SS_L_FCT_FRFT_LISTDM dm = new SS_L_FCT_FRFT_LISTDM();

        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setFrdt(frdt);      //�ΰ��Ⱓ �˻� ������
        dm.setTodt(todt);      //�ΰ��Ⱓ �˻� ������
        dm.setViltresn(viltresn);                  //���� ����
        dm.setRdrnm(rdrnm);     //���ڸ�
        dm.setDelbocom(delbocom); //���ǰ��
        dm.setPageno(Long.parseLong(pageno));      //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������
        
        SSBrmgr1500DAO dao = new SSBrmgr1500DAO();
        // DAO ��ü�� selectCommList ȣ��
        ds = dao.selectCommList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1500EJBHome home = (SSBrmgr1500EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1500EJB");
        try{
            SSBrmgr1500EJB ejb = home.create();
            ds = ejb.selectCommList(dm);
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
     * �����濵-������ ����� ��Ȳ- ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectFctFrftDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_FCT_FRFTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        String impndt = Util.checkString(req.getParameter("impndt_pk"));  //�ΰ�����
        String deptcd = Util.checkString(req.getParameter("deptcd_pk"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd_pk"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�
        String viltresn = Util.checkString(req.getParameter("viltresn_pk"));  //�������

        // DM Setting
        SS_S_FCT_FRFTDM dm = new SS_S_FCT_FRFTDM();

        dm.setImpndt(impndt);  //�ΰ�����
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�
        dm.setViltresn(viltresn); //�������
        
        SSBrmgr1500DAO dao = new SSBrmgr1500DAO();
        // DAO ��ü�� selectFctFrftDetail ȣ��
        ds = dao.selectFctFrftDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrmgr1500EJBHome home = (SSBrmgr1500EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1500EJB");
        try{
            SSBrmgr1500EJB ejb = home.create();
            ds = ejb.selectFctFrftDetail(dm);
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
     * �����濵-������ ����� ��Ȳ-�Է�,����,���� ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void accessFctFrft(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_FCT_FRFTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");

        String accflag = Util.checkString(req.getParameter("accflag"));
        //String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String viltnoit = Util.checkString(req.getParameter("viltnoit"));
        String impndt = Util.checkString(req.getParameter("impndt"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String frftimpnamt = Util.checkString(req.getParameter("frftimpnamt"));
        String resamt = Util.checkString(req.getParameter("resamt"));
        String delbocom = Util.checkString(req.getParameter("delbocom"));
        String viltresn = Util.checkString(req.getParameter("viltresn"));
        String hdqtrcpmamt = Util.checkString(req.getParameter("hdqtrcpmamt"));
        String hdqtrcpmdt = Util.checkString(req.getParameter("hdqtrcpmdt"));
        String hdqtun_pymtamt = Util.checkString(req.getParameter("hdqtun_pymtamt"));
        String borcpmamt = Util.checkString(req.getParameter("borcpmamt"));
        String borcpmdt = Util.checkString(req.getParameter("borcpmdt"));
        String boun_pymtamt = Util.checkString(req.getParameter("boun_pymtamt"));

        if (viltnoit.length() == 0) {
            viltnoit = "0";
        }
        if (frftimpnamt.length() == 0) {
            frftimpnamt = "0";
        }
        if (resamt.length() == 0) {
            resamt = "0";
        }
        if (hdqtrcpmamt.length() == 0) {
            hdqtrcpmamt = "0";
        }
        if (hdqtun_pymtamt.length() == 0) {
            hdqtun_pymtamt = "0";
        }
        if (borcpmamt.length() == 0) {
            borcpmamt = "0";
        }
        if (boun_pymtamt.length() == 0) {
            boun_pymtamt = "0";
        }

        // DM Setting
        SS_A_FCT_FRFTDM dm = new SS_A_FCT_FRFTDM();

		dm.setAccflag(accflag);
		dm.setIncmgpers(incmgpers);
		dm.setDeptcd(deptcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
		dm.setImpndt(impndt);
		dm.setViltresn(viltresn);
		if(!"D".equals(accflag)){
			dm.setViltnoit(Long.parseLong(viltnoit));
			dm.setRdrnm(rdrnm);
			dm.setFrftimpnamt(Long.parseLong(frftimpnamt));
			dm.setResamt(Long.parseLong(resamt));
			dm.setDelbocom(delbocom);
			dm.setHdqtrcpmamt(Long.parseLong(hdqtrcpmamt));
			dm.setHdqtrcpmdt(hdqtrcpmdt);
			dm.setHdqtun_pymtamt(Long.parseLong(hdqtun_pymtamt));
			dm.setBorcpmamt(Long.parseLong(borcpmamt));
			dm.setBorcpmdt(borcpmdt);
			dm.setBoun_pymtamt(Long.parseLong(boun_pymtamt));
		}
		
		SSBrmgr1500DAO dao = new SSBrmgr1500DAO();
        // DAO ��ü�� accessFctFrft ȣ��
        ds = dao.accessFctFrft(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrmgr1500EJBHome home = (SSBrmgr1500EJBHome)JNDIManager.getInstance().getHome("SSBrmgr1500EJB");
        try{
            SSBrmgr1500EJB ejb = home.create();
            ds = ejb.accessFctFrft(dm);
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
