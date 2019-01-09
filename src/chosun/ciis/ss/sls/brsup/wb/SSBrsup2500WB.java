/***************************************************************************************************
 * ���ϸ� : SSBrsup2500WB.java
 * ��� : �������������ý���-���˹�������
 * �ۼ����� : 2009-04-28
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;

import java.rmi.*;

import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �������������ý���-���˹������� ���� Worker Bean
 */

public class SSBrsup2500WB {
    /**
     * �������������ý���-���˹�������-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_BNSITEMINOUT_INITDataSet ds = null;

        // DM Setting
        SS_L_BNSITEMINOUT_INITDM dm = new SS_L_BNSITEMINOUT_INITDM();
        
        SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� initPromStafIS ȣ��
        ds = dao.initSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.initSalespromotion(dm);
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
     * �������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void popInInitSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_POPINBNSITEMINOUT_INITDataSet ds = null;

        // DM Setting
    	SS_L_POPINBNSITEMINOUT_INITDM dm = new SS_L_POPINBNSITEMINOUT_INITDM();
    	
    	SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� initPromStafIS ȣ��
        ds = dao.popInInitSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.popInInitSalespromotion(dm);
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
     * �������������ý���-���˹������Ȳ-��ȸȭ��-����߰� �˾�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void popOutInitSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_POPOUTBNSITEM_INITDataSet ds = null;

        // DM Setting
    	SS_L_POPOUTBNSITEM_INITDM dm = new SS_L_POPOUTBNSITEM_INITDM();
    	
    	SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� initPromStafIS ȣ��
        ds = dao.popOutInitSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.popOutInitSalespromotion(dm);
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
     * ��������-������Ȳ-���˹������Ȳ ��������� �˾�  
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void popTotalOutInitSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_BNSITEMTOTALOUT_INITDataSet ds = null;
		
    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
    	String incmg_pers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
    	String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dt")));
    	String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
        // DM Setting
    	SS_I_BNSITEMTOTALOUT_INITDM dm = new SS_I_BNSITEMTOTALOUT_INITDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setBns_item_cd(bns_item_cd);
    	dm.setOwh_dt(inoutdt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� initPromStafIS ȣ��
        ds = dao.popTotalOutInitSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.popTotalOutInitSalespromotion(dm);
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
     * �������������ý���-���˹������Ȳ-��ȸȭ��-�԰��߰� �˾�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void popInInsertSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_POPINBNSITEMINOUTDataSet ds = null;

    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
    	String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
    	String chgpers = Util.getSessionParameterValue(req, "uid", true);       //������ ���̵�
    	
   		String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
   		String whcd = Util.checkString(req.getParameter("whcd"));
   		String inoutdt = Util.checkString(req.getParameter("inoutdt"));
   		String uprc = Util.checkString(req.getParameter("uprc"));
   		String unit = Util.checkString(req.getParameter("unit"));
   		String qunt = Util.checkString(req.getParameter("qunt"));
   		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_f")));
   		
        // DM Setting
		SS_I_POPINBNSITEMINOUTDM dm = new SS_I_POPINBNSITEMINOUTDM();
    	
		dm.setCmpycd(cmpycd);
		dm.setBns_itemcd(bns_itemcd);
		dm.setWhcd(whcd);
		dm.setInoutdt(inoutdt);
		dm.setUprc(uprc);
		dm.setUnit(unit);
		dm.setQunt(qunt);
		dm.setRemk(remk);
		dm.setIncmgpers(incmgpers);
		dm.setChgpers(chgpers);
		
		SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� initPromStafIS ȣ��
        ds = dao.popInInsertSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.popInInsertSalespromotion(dm);
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
     * �������������ý���-���˹������Ȳ-��ȸȭ��-����߰� �˾�-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void popOutInsertSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_POPOUTBNSITEMDataSet ds = null;

    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
   		String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
   		String chgpers = Util.getSessionParameterValue(req, "uid", true);       //������ ���̵�
   		
   		String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
   		String whcd = Util.Uni2Ksc(Util.checkString(req.getParameter("whcd")));
   		String team = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
   		String part = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
   		String area = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
   		String bo = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
		String aftdivnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aftdivnclsf")));
   		String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("inoutdt")));
   		String no_valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("no_valqunt")));
   		String valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("valqunt")));
   		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
   		String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));

        // DM Setting
		SS_I_POPOUTBNSITEMDM dm = new SS_I_POPOUTBNSITEMDM();
    	
		dm.setIncmgpers(incmgpers);
		dm.setChgpers(chgpers);
		dm.setCmpycd(cmpycd);
		dm.setBns_itemcd(bns_itemcd);
		dm.setWhcd(whcd);
		dm.setTeam(team);
		dm.setPart(part);
		dm.setArea(area);
		dm.setBo(bo);
		dm.setAftdivnclsf(aftdivnclsf);
		dm.setInoutdt(inoutdt);
		dm.setNo_valqunt(no_valqunt);
		dm.setValqunt(valqunt);
		dm.setRemk(remk);
		dm.setUprc(uprc);
		
		SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� initPromStafIS ȣ��
        ds = dao.popOutInsertSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.popOutInsertSalespromotion(dm);
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
     * ��������-������Ȳ-���˹������Ȳ ���Ĺ�� �ǿ� ���� ���� ����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void popAfterInsertSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_POPAFTERBNSITEMDataSet ds = null;

    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
   		String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
   		String chgpers = Util.getSessionParameterValue(req, "uid", true);       //������ ���̵�
   		
   		String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
   		String whcd = Util.Uni2Ksc(Util.checkString(req.getParameter("whcd")));
   		String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
   		String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
   		String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
   		String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
   		String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
   		String no_valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("no_valqunt")));
   		String valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("valqunt")));
   		String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("inoutdt")));
   		String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
		String nosumqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("nosumqunt")));
		String sumqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("sumqunt")));
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        // DM Setting
   		SS_I_POPAFTERBNSITEMDM dm = new SS_I_POPAFTERBNSITEMDM();
    	
   		dm.setCmpycd(cmpycd);
   		dm.setIncmgpers(incmgpers);
   		dm.setBns_itemcd(bns_itemcd);
   		dm.setWhcd(whcd);
   		dm.setSeq(seq);
   		dm.setChgpers(chgpers);
   		dm.setDeptcd(deptcd);
   		dm.setPartcd(partcd);
   		dm.setAreacd(areacd);
   		dm.setBocd(bocd);
   		dm.setNo_valqunt(no_valqunt);
   		dm.setValqunt(valqunt);
   		dm.setInoutdt(inoutdt);
   		dm.setUprc(uprc);
   		dm.setNosumqunt(nosumqunt);
   		dm.setSumqunt(sumqunt);
   		dm.setRemk(remk);
   		
   		SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� initPromStafIS ȣ��
        ds = dao.popAfterInsertSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.popAfterInsertSalespromotion(dm);
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
     * ��������-������Ȳ-���˹������Ȳ ��������� ��ǰ�űԵ�� ����  
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void popTotalOutInsertSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_I_BNSITEMTOTALOUTDataSet ds = null;

    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
   		String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
   		String chgpers = Util.getSessionParameterValue(req, "uid", true);       //������ ���̵�
   		
   		String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
   		String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("inoutdt")));
   		String no_valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("no_valqunt")));
   		String valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("valqunt")));
   		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
   		String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
        // DM Setting
		SS_I_BNSITEMTOTALOUTDM dm = new SS_I_BNSITEMTOTALOUTDM();
    	
		dm.setCmpycd(cmpycd);
		dm.setIncmgpers(incmgpers);
		dm.setChgpers(chgpers);
		dm.setBns_itemcd(bns_itemcd);
		dm.setInoutdt(inoutdt);
		dm.setNo_valqunt(no_valqunt);
		dm.setValqunt(valqunt);
		dm.setRemk(remk);
		dm.setUprc(uprc);
		
		SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� initPromStafIS ȣ��
        ds = dao.popTotalOutInsertSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.popTotalOutInsertSalespromotion(dm);
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
     * �������������ý���-���˹�������-��ȸȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void listSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_TASLM_BNSITEMINOUTDataSet ds = null;
   	
        // Request Parameter Processing
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String itemnm = Util.checkString(req.getParameter("itemnm"));
        // DM Setting
        SS_L_TASLM_BNSITEMINOUTDM dm = new SS_L_TASLM_BNSITEMINOUTDM();

        dm.setItemclsf(itemclsf);
        dm.setItemcd(itemcd);
        dm.setItemnm(itemnm);
        
        SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� selectPromStafISList ȣ��
        ds = dao.listSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.listSalespromotion(dm);
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
     * �������������ý���-���˹�������-��ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void detailSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_TASLM_BNSITEMINOUTDataSet ds = null;
    	// Request Parameter Processing
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
   		String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//�Է��ھ��̵�
   		String chgpers = Util.getSessionParameterValue(req, "uid", true);       //������ ���̵�
   
		String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
		String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
		String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
		String itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("itemnm")));
		String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
		String mainware = Util.Uni2Ksc(Util.checkString(req.getParameter("mainware")));
		String pyungware = Util.Uni2Ksc(Util.checkString(req.getParameter("pyungware")));
		String sungware = Util.Uni2Ksc(Util.checkString(req.getParameter("sungware")));
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
		
        // DM Setting
        SS_S_TASLM_BNSITEMINOUTDM dm = new SS_S_TASLM_BNSITEMINOUTDM();
        dm.setItemclsf(itemclsf);
        dm.setItemcd(itemcd);
        dm.setBns_itemcd(bns_itemcd);
        dm.setItemnm(itemnm);
        dm.setUnit(unit);
        dm.setMainware(mainware);
        dm.setPyungware(pyungware);
        dm.setSungware(sungware);
        dm.setRemk(remk);
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setChgpers(chgpers);
        
        SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� selectPromStafISDetail ȣ��
        ds = dao.detailSalespromotion(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.detailSalespromotion(dm);
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
     * �������������ý���-���˹�������-����ȸȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void detailSearchSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_DETASLM_BNSITEMINOUTDataSet ds = null;
   	
        // Request Parameter Processing
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String itemnm = Util.checkString(req.getParameter("itemnm"));
		String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
		String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        // DM Setting
        SS_S_DETASLM_BNSITEMINOUTDM dm = new SS_S_DETASLM_BNSITEMINOUTDM();

        dm.setItemclsf(itemclsf);
        dm.setItemcd(itemcd);
        dm.setItemnm(itemnm);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setCmpycd(cmpycd);
        
        SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� selectPromStafISList ȣ��
        ds = dao.detailSearchSalespromotion(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.detailSearchSalespromotion(dm);
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
     * �������������ý���-���˹�������-����ȸȭ��-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void detailDeleteSalespromotion(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_D_BNSITEMINOUTDataSet ds = null;
   	
        // Request Parameter Processing
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//ȸ���ڵ�
    	String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));

    	// DM Setting
        SS_D_BNSITEMINOUTDM dm = new SS_D_BNSITEMINOUTDM();

        dm.setBns_itemcd(bns_itemcd);
        dm.setCmpycd(cmpycd);
        
        SSBrsup2500DAO dao = new SSBrsup2500DAO();
        // DAO ��ü�� selectPromStafISList ȣ��
        ds = dao.detailDeleteSalespromotion(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup2500EJBHome home = (SSBrsup2500EJBHome)JNDIManager.getInstance().getHome("SSBrsup2500EJB");
        try{
            SSBrsup2500EJB ejb = home.create();
            ds = ejb.detailDeleteSalespromotion(dm);
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