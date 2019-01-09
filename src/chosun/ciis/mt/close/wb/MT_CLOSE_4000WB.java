package chosun.ciis.mt.close.wb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException; 
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;
 
public class MT_CLOSE_4000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * �������������� ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_close_4000(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	MT_CLOSE_4000_LDataSet ds = null;

        // DM Setting
    	MT_CLOSE_4000_LDM dm = new MT_CLOSE_4000_LDM();

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));	// ȸ���ڵ�
    	
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_4000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */
    	
        /* EJB ������ ����		
        try {
            MT_CLOSE_4000EJBHome home = (MT_CLOSE_4000EJBHome) JNDIManager.getInstance().getHome("MT_CLOSE_4000EJB");
        	MT_CLOSE_4000EJB ejb = home.create();

    		dm.print();
        	
        	ds = ejb.getMt_Close_4000(dm);
        	
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        EJB ������ �� */
    }

    /**
     * �������������� �Է�,����,����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */    
    public void mt_close_4001(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	MT_CLOSE_4001_ADataSet ds = null;
    	MT_CLOSE_4001_ADM dm = new MT_CLOSE_4001_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		System.out.println("converted[ 0] => CRUD	(" + converted[0]+")");
		System.out.println("converted[ 1] => ROW	(" + converted[1]+")");
		System.out.println("converted[ 2] => ȸ��	(" + converted[2]+")");
		System.out.println("converted[ 3] => ��κ�	(" + converted[3]+")");
		System.out.println("converted[ 4] => ���� 	(" + converted[4]+")");
		System.out.println("converted[ 5] => ����   	(" + converted[5]+")");
		
		String mode      	= converted[0];
		String row       	= converted[1];
		String dstb_rat_cd  = converted[3];		// ��κ�
		String dstb_rat_nm  = converted[4];		// ��κ��
		String basi   		= converted[5];		// ����
		String calc_styl   	= converted[6];		// ����

		dm.setMode(mode);
		dm.setRow(row);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	// ȸ���ڵ�
		dm.setDstb_rat_cd(dstb_rat_cd);										// ��κ�
		dm.setDstb_rat_nm(dstb_rat_nm);										// ��κ��
		dm.setBasi(basi);													// ����
		dm.setCalc_styl(calc_styl);											// ����
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		// �Է���IP
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);	// �Է���
    	
    	dm.print();
    	
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_4001_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */

        /* EJB ������ ����		
    	try {
            MT_CLOSE_4000EJBHome home = (MT_CLOSE_4000EJBHome) JNDIManager.getInstance().getHome("MT_CLOSE_4000EJB");
        	MT_CLOSE_4000EJB ejb = home.create();

        	ds = ejb.getMt_Close_4001(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        EJB ������ �� */
    }

}