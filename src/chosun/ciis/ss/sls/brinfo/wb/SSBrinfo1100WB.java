/***************************************************************************************************
* ���ϸ� : SSBrinfo1100WB.java
* ��� : ����Info-������Ȳ ó���� ���� Worker Bean
* �ۼ����� : 2004-02-09
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
import chosun.ciis.ss.sls.rdr.dm.SS_L_READER_BOINFO_INITDM;
import chosun.ciis.ss.sls.rdr.ds.SS_L_READER_BOINFO_INITDataSet;

/**
 * ����Info-������Ȳ ���� WB
 */

public class SSBrinfo1100WB{

    /**
     * ����Info-������Ȳ �ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoinfoInitList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_BOINFO_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_BOINFO_INITDM dm = new SS_L_BOINFO_INITDM();

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
		// DAO ��ü�� selectInitList ȣ��
		ds = dao.selectInitList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
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
     * ����Info-������Ȳ ��ȸ(����Ʈ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoinfoList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BOINFODataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));  //�μ��ڵ�
        String areacd = Util.checkString(req.getParameter("areacd"));  //�����ڵ�
        String bocd = Util.checkString(req.getParameter("bocd"));      //�����ڵ�

        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting

        SS_L_BOINFODM dm = new SS_L_BOINFODM();
        dm.setDeptcd(deptcd);  //�μ��ڵ�
        dm.setAreacd(areacd);  //�����ڵ�
        dm.setBocd(bocd);      //�����ڵ�

        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
		// DAO ��ü�� selectBoinfoList ȣ��
		ds = dao.selectBoinfoList(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectBoinfoList(dm);
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
     * ����Info-������Ȳ-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectBoinfoDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_BOINFODataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));

        // DM Setting
        SS_S_BOINFODM dm = new SS_S_BOINFODM();
        dm.setBocd(bocd);
        dm.setBasi_yymm(basi_yymm);

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
		// DAO ��ü�� selectBoinfoDetail ȣ��
		ds = dao.selectBoinfoDetail(dm);
		req.setAttribute("ds", ds);

		/*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectBoinfoDetail(dm);
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
     * ����Info-�������°���_�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoAcctInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_BOACCT_INITDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
    	SS_L_BOACCT_INITDM dm = new SS_L_BOACCT_INITDM();

    	SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO ��ü�� selectBoqtypcondList ȣ��
        ds = dao.selectBoAcctInit(dm);
        req.setAttribute("ds", ds);

        /*SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectBoAcctInit(dm);
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
     * ����Info-�������°���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBoAcctList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SS_L_BOACCT_LISTDataSet ds = null;
        // Request Parameter Processing
        String deptlist = Util.checkString(req.getParameter("deptlist"));  //�μ����
        String partlist = Util.checkString(req.getParameter("partlist"));  //�������
        String arealist = Util.checkString(req.getParameter("arealist"));  //�������
        String bocd = Util.checkString(req.getParameter("bocd"));          //�����ڵ�
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String shacctno = Util.checkString(req.getParameter("shacctno"));      //20150920 �弱�� ���¹�ȣ �߰�
        String shacctnm = Util.checkString(req.getParameter("shacctnm"));      //20150921 �弱�� �����ָ� �߰�
        String cntr_fr_dt = Util.checkString(req.getParameter("cntr_fr_dt"));    //20170825 ������ ���۰������ �߰�
        String cntr_to_dt = Util.checkString(req.getParameter("cntr_to_dt"));    //20170825 ������ ���������� �߰�
        String pageno = Util.checkString(req.getParameter("pageno"));
        String pagesize = Util.checkString(req.getParameter("pagesize"));

        // DM Setting
        SS_L_BOACCT_LISTDM dm = new SS_L_BOACCT_LISTDM();
        dm.setDeptlist(deptlist);  //�μ����
        dm.setArealist(partlist);  //�������
        dm.setArealist(arealist);  //�������
        dm.setBocd(bocd);          //�����ڵ�
        dm.setAcctitem(acctitem);  //�����׸�
        dm.setShacctno(shacctno);      //���¹�ȣ 20150920 �弱��
        dm.setShacctnm(shacctnm);      //�����ָ� 20150920 �弱��
        dm.setCntr_fr_dt(cntr_fr_dt);  //����������
        dm.setCntr_to_dt(cntr_to_dt);  //�����������
        dm.setPageno(Long.parseLong(pageno));  //��������ȣ
        dm.setPagesize(Long.parseLong(pagesize));  //������������

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO ��ü�� selectBoqtypcondList ȣ��
        ds = dao.selectBoAcctList(dm);
        req.setAttribute("ds", ds);

        /*SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.selectBoAcctList(dm);
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
     * ����Info-�������°��� ����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void updateBoAcctItem(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_U_BOACCTDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
//        String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //20170816�弱�� ���ǿ��� �Է��� ���̵� �Ѱ��ִ°ɷ� ����.

        // DM Setting
        SS_U_BOACCTDM dm = new SS_U_BOACCTDM();
        dm.setSeq(seq);
        dm.setBocd(bocd);          //�����ڵ�
        dm.setAcctitem(acctitem);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setDeps_persnm(deps_persnm);
        dm.setRemk(remk);
        dm.setIncmgpers(incmgpers);

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO ��ü�� updateBoAcctItem ȣ��
        ds = dao.updateBoAcctItem(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.updateBoAcctItem(dm);
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
     * ����Info-�������°��� ����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void deleteBoAcctItem(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_D_BOACCTDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
//        String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //20170816�弱�� ���ǿ��� �Է��� ���̵� �Ѱ��ִ°ɷ� ����.

        // DM Setting
        SS_D_BOACCTDM dm = new SS_D_BOACCTDM();
        dm.setSeq(seq);
        dm.setBocd(bocd);          //�����ڵ�
        dm.setAcctitem(acctitem);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setDeps_persnm(deps_persnm);
        dm.setIncmgpers(incmgpers);

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO ��ü�� deleteBoAcctItem ȣ��
        ds = dao.deleteBoAcctItem(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.deleteBoAcctItem(dm);
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
     * ����Info-�������°��� ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void insertBoAcctItem(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_I_BOACCTDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));
        String bankcd = Util.checkString(req.getParameter("bankcd"));
        String acctno = Util.checkString(req.getParameter("acctno"));
        String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
//        String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //20170816�弱�� ���ǿ��� �Է��� ���̵� �Ѱ��ִ°ɷ� ����.

        // DM Setting
        SS_I_BOACCTDM dm = new SS_I_BOACCTDM();
        dm.setSeq(seq);
        dm.setBocd(bocd);          //�����ڵ�
        dm.setAcctitem(acctitem);
        dm.setBankcd(bankcd);
        dm.setAcctno(acctno);
        dm.setDeps_persnm(deps_persnm);
        dm.setRemk(remk);
        dm.setIncmgpers(incmgpers);

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO ��ü�� insertBoAcctItem ȣ��
        ds = dao.insertBoAcctItem(dm);
        req.setAttribute("ds", ds);
        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.insertBoAcctItem(dm);
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
     * ����Info-�������°��� �����丮 ��ȸ 20150922 �弱��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void histBoAcctList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_BOACCT_LISTDataSet ds = null;
        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_S_BOACCT_LISTDM dm = new SS_S_BOACCT_LISTDM();
        dm.setBocd(bocd);          //�����ڵ�

        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO ��ü�� insertBoAcctItem ȣ��
        ds = dao.histBoAcctList(dm);
        req.setAttribute("ds", ds);
        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.insertBoAcctItem(dm);
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
     * ����Info-�������°��� ���Ȯ�� 20170919 ������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void cnfmBoAcctItem(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SS_U_BOACCT_CNFMDataSet ds = null;
        // Request Parameter Processing
        String seq = Util.checkString(req.getParameter("seq"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String acctitem = Util.checkString(req.getParameter("acctitem"));        
        String incmgpers = Util.getSessionParameterValue(req, "uid", true); //20170816�弱�� ���ǿ��� �Է��� ���̵� �Ѱ��ִ°ɷ� ����.

        // DM Setting
        SS_U_BOACCT_CNFMDM dm = new SS_U_BOACCT_CNFMDM();
        dm.setUid(incmgpers);
        dm.setBocd(bocd);          //�����ڵ�
        dm.setSeq(seq);        
        dm.setAcctitem(acctitem);
        
        SSBrinfo1100DAO dao = new SSBrinfo1100DAO();
        // DAO ��ü�� insertBoAcctItem ȣ��
        ds = dao.cnfmBoAcctItem(dm);
        req.setAttribute("ds", ds);
        /*
        SSBrinfo1100EJBHome home = (SSBrinfo1100EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1100EJB");
        try{
            SSBrinfo1100EJB ejb = home.create();
            ds = ejb.insertBoAcctItem(dm);
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
