/***************************************************************************************************
* ���ϸ� : SSBrinfo1600WB.java
* ��� : ����Info-�߼۳뼱�� ���� Worker Bean
 * �ۼ����� : 2004-04-01
 * �ۼ��� : ��â��
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
 * ����Info-�߼۳뼱�� ���� Worker Bean
 */

public class SSBrinfo1600WB{

    /**
     * ����Info-����������������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectAreaList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	
    	SS_L_BSNS_INITDataSet ds = null;

    	SS_L_BSNS_INITDM dm = new SS_L_BSNS_INITDM();

    	SSBrinfo1600DAO dao = new SSBrinfo1600DAO();
        // DAO ��ü�� selectBsnsList ȣ��
        ds = dao.selectAreaList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSBrinfo1600EJBHome home = (SSBrinfo1600EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1600EJB");
        try{
            SSBrinfo1600EJB ejb = home.create();
            SS_L_BSNS_INITDataSet ds = null;
            ds = ejb.selectAreaList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ����Info-�߼۳뼱(�����뼱��ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectBsnsList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_L_BSNSDataSet ds = null;
    	
         // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));    					    //���������ڵ�
        String areacd = Util.checkString(req.getParameter("common_areacd"));	     		//�����ڵ�
		String noname = Util.Uni2Ksc(Util.checkString(req.getParameter("noname")));			//�뼱��
		String jbbhdatefrom = Util.checkString(req.getParameter("jbbhdatefrom"));			//��ȸ ��������
        String jbbhdateto = Util.checkString(req.getParameter("jbbhdateto"));				//��ȸ ��������


        SS_L_BSNSDM dm = new SS_L_BSNSDM();

        //dm.setDeptcd(deptcd);
        //dm.setPartcd(partcd);
        dm.setAreacd(areacd);        
        dm.setBocd(bocd);
        dm.setSendplacnm(noname);
        dm.setFromdate(jbbhdatefrom);
        dm.setTodate(jbbhdateto);
        //dm.setNoname(noname);
		//dm.setJbbhdatefrom(jbbhdatefrom);
        //dm.setJbbhdateto(jbbhdateto);

        SSBrinfo1600DAO dao = new SSBrinfo1600DAO();
        // DAO ��ü�� selectBsnsList ȣ��
        ds = dao.selectBsnsList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSBrinfo1600EJBHome home = (SSBrinfo1600EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1600EJB");
        try{
            SSBrinfo1600EJB ejb = home.create();
            SS_L_BSNSDataSet ds = null;
            ds = ejb.selectBsnsList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ����Info-�߼۳뼱(sms��ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectSmsDetail(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_S_SMSDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));    					//���������ڵ�

        SS_S_SMSDM dm = new SS_S_SMSDM();

        dm.setBocd(bocd);
        
        SSBrinfo1600DAO dao = new SSBrinfo1600DAO();
        // DAO ��ü�� selectLeasamtList ȣ��
        ds = dao.selectSmsDetail(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSBrinfo1600EJBHome home = (SSBrinfo1600EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1600EJB");
        try{
            SSBrinfo1600EJB ejb = home.create();
            SS_S_SMSDataSet ds = null;
            ds = ejb.selectSmsDetail(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
     * ����Info-�߼۳뼱(sms����)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/

    public void selectSmsUpdate(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SS_U_SMSDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));        				//���������ڵ�
		String sms1 = Util.checkString(req.getParameter("sms1"));						//sms���Ź�ȣ1
		String sms2 = Util.checkString(req.getParameter("sms2"));						//sms���Ź�ȣ2
		String sms3 = Util.checkString(req.getParameter("sms3"));						//sms���Ź�ȣ3
		String emailnm = Util.checkString(req.getParameter("emailnm"));					//Email
		String smsset = Util.checkString(req.getParameter("smsset"));					//sms�뺸����
		String emailset = Util.checkString(req.getParameter("emailset"));				//email�뺸����

        SS_U_SMSDM dm = new SS_U_SMSDM();

        dm.setBocd(bocd);
		dm.setSms1(sms1);
		dm.setSms2(sms2);
		dm.setSms3(sms3);
		dm.setEmailnm(emailnm);
		dm.setSmsset(smsset);
		dm.setEmailset(emailset);
		
		SSBrinfo1600DAO dao = new SSBrinfo1600DAO();
        // DAO ��ü�� selectDetailView ȣ��
        ds = dao.selectSmsUpdate(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSBrinfo1600EJBHome home = (SSBrinfo1600EJBHome)JNDIManager.getInstance().getHome("SSBrinfo1600EJB");
        try{
            SSBrinfo1600EJB ejb = home.create();
            SS_U_SMSDataSet ds = null;
            ds = ejb.selectSmsUpdate(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
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
