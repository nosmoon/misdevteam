/***************************************************************************************************
* ���ϸ� : SSExtn1100WB.java
 * ��� : ǰ����Ȯ�� ó���� ���� Worker Bean
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * Ȯ����Ȳ-ǰ����Ȯ�� �� ���� WB
 */

public class SSExtn1100WB{


    /**
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void exgCampInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_XTN_EXGCAMP_INITDataSet ds = null;
        // DM Setting
        SS_L_RDR_XTN_EXGCAMP_INITDM dm = new SS_L_RDR_XTN_EXGCAMP_INITDM();
        
        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� init ȣ��
        ds = dao.exgCampInit(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
                SSExtn1100EJB ejb = home.create();
                ds = ejb.exgCampInit(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExgCampList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EXGCAMPDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_RDR_EXTN_EXGCAMPDM dm = new SS_L_RDR_EXTN_EXGCAMPDM();

        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� selectCampList ȣ��
        ds = dao.selectExgCampList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.selectExgCampList(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExgCampDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_S_RDR_EXTN_EXGCAMPDataSet ds = null;
        // Request Parameter Processing
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_S_RDR_EXTN_EXGCAMPDM dm = new SS_S_RDR_EXTN_EXGCAMPDM();
        dm.setRdr_extncampno(rdr_extncampno);
        
        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� selectDetailCamp ȣ��
        ds = dao.selectExgCampDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.selectExgCampDetail(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-����(���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertExgCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EXGCAMPDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ǰ����Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String wght = Util.checkString(req.getParameter("wght"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String alonpayplandt = Util.checkString(req.getParameter("alonpayplandt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));//�ѱ�ó��

        // ǰ����Ȯ���ȸ ��ü ����
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String alonamtary = Util.checkString(req.getParameter("alonamtary"));
        String qtyaplydtary = Util.checkString(req.getParameter("qtyaplydtary"));
        String basivalqtyary = Util.checkString(req.getParameter("basivalqtyary"));

        // DM Setting
        SS_A_RDR_EXTN_EXGCAMPDM dm = new SS_A_RDR_EXTN_EXGCAMPDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setCampnm(campnm);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setAlonpayplandt(alonpayplandt);
        dm.setRemk(remk);
        dm.setMedicdary(medicdary);
        dm.setAlonamtary(alonamtary);
        dm.setQtyaplydtary(qtyaplydtary);
        dm.setBasivalqtyary(basivalqtyary);
        dm.setIncmgpers(incmgpers);

        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� insertCamp ȣ��
        ds = dao.insertExgCamp(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.insertExgCamp(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-����(����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateExgCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EXGCAMPDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ǰ����Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
        String campnm = Util.Uni2Ksc(Util.checkString(req.getParameter("campnm")));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String wght = Util.checkString(req.getParameter("wght"));
        String closdt = Util.checkString(req.getParameter("closdt"));
        String alonpayplandt = Util.checkString(req.getParameter("alonpayplandt"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));//�ѱ�ó��

        // ǰ����Ȯ���ȸ ��ü ����
        String medicdary = Util.checkString(req.getParameter("medicdary"));
        String alonamtary = Util.checkString(req.getParameter("alonamtary"));
        String qtyaplydtary = Util.checkString(req.getParameter("qtyaplydtary"));
        String basivalqtyary = Util.checkString(req.getParameter("basivalqtyary"));

        // DM Setting
        SS_A_RDR_EXTN_EXGCAMPDM dm = new SS_A_RDR_EXTN_EXGCAMPDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setCampnm(campnm);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setClosdt(closdt);
        dm.setAlonpayplandt(alonpayplandt);
        dm.setRemk(remk);
        dm.setMedicdary(medicdary);
        dm.setAlonamtary(alonamtary);
        dm.setQtyaplydtary(qtyaplydtary);
        dm.setBasivalqtyary(basivalqtyary);
        dm.setIncmgpers(incmgpers);

        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� updateCamp ȣ��
        ds = dao.updateExgCamp(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.updateExgCamp(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteExgCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EXGCAMPDataSet ds = null;

        // Request Parameter Processing
        // ǰ����Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_EXGCAMPDM dm = new SS_A_RDR_EXTN_EXGCAMPDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);

        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� deleteCamp ȣ��
        ds = dao.deleteExgCamp(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.deleteExgCamp(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeExgCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ǰ����Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_EXGCAMP_CLOSEDM dm = new SS_A_RDR_EXTN_EXGCAMP_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setIncmgpers(incmgpers);

        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� closeCamp ȣ��
        ds = dao.closeExgCamp(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.closeExgCamp(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-�������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void closeCancelExgCamp(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        // ǰ����Ȯ���ȸ ����
        String accflag = Util.checkString(req.getParameter("accflag"));
        String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));

        // DM Setting
        SS_A_RDR_EXTN_EXGCAMP_CLOSEDM dm = new SS_A_RDR_EXTN_EXGCAMP_CLOSEDM();
        dm.setAccflag(accflag);
        dm.setRdr_extncampno(rdr_extncampno);
        dm.setIncmgpers(incmgpers);

        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� closeCancelCamp ȣ��
        ds = dao.closeCancelExgCamp(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.closeCancelExgCamp(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-������-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void exgCostInit(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� costInit ȣ��
        ds = dao.exgCostInit(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.exgCostInit(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-������-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExgCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EXGCOSTDataSet ds = null;

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String basidt = Util.checkString(req.getParameter("basidt"));
        String busnchrgclamtyn = Util.checkString(req.getParameter("busnchrgclamtyn"));
        String splychrgclamtyn = Util.checkString(req.getParameter("splychrgclamtyn"));

        // DM Setting
        SS_L_RDR_EXTN_EXGCOSTDM dm = new SS_L_RDR_EXTN_EXGCOSTDM();

        dm.setAccflag(accflag);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setBasidt(basidt);
        dm.setBusnchrgclamtyn(busnchrgclamtyn);
        dm.setSplychrgclamtyn(splychrgclamtyn);

        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� selectCostList ȣ��
        ds = dao.selectExgCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.selectExgCostList(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-������-�󼼸��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectExgCostDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EXGCOSTDDataSet ds = null;

        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_RDR_EXTN_EXGCOSTDDM dm = new SS_L_RDR_EXTN_EXGCOSTDDM();
        dm.setBasidt(basidt);
        dm.setBocd(bocd);
        
        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� selectExgCostDetailList ȣ��
        ds = dao.selectExgCostDetailList(dm);
        req.setAttribute("ds", ds);

        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.selectExgCostDetailList(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-������-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateExgCost(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_U_RDR_EXTN_EXGCOSTDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String basidtary = Util.checkString(req.getParameter("basidtary"));
        String bocdary = Util.checkString(req.getParameter("bocdary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_RDR_EXTN_EXGCOSTDM dm = new SS_U_RDR_EXTN_EXGCOSTDM();
        dm.setAccflag(accflag);
        dm.setBasidtary(basidtary);
        dm.setBocdary(bocdary);
        dm.setCheckedary(checkedary);
        dm.setIncmgpers(incmgpers);

        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� updateExgCost ȣ��
        ds = dao.updateExgCost(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.updateExgCost(dm);
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
     * Ȯ����Ȳ-ǰ����Ȯ��-�۱�-�μ�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printExgCostList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        SS_L_RDR_EXTN_EXGCOST_PRINTDataSet ds = null;

        // Request Parameter Processing
        String basidt = Util.checkString(req.getParameter("basidt"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_RDR_EXTN_EXGCOST_PRINTDM dm = new SS_L_RDR_EXTN_EXGCOST_PRINTDM();

        dm.setBasidt(basidt);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);

        SSExtn1100DAO dao = new SSExtn1100DAO();
        // DAO ��ü�� printExgCostList ȣ��
        ds = dao.printExgCostList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSExtn1100EJBHome home = (SSExtn1100EJBHome)JNDIManager.getInstance().getHome("SSExtn1100EJB");
        try{
            SSExtn1100EJB ejb = home.create();
            ds = ejb.printExgCostList(dm);
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
