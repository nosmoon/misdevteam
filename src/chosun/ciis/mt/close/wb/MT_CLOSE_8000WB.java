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
 
public class MT_CLOSE_8000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * �ʸ������������� ȭ����ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void mt_close_8000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_8000_LDataSet ds = null;
		MT_CLOSE_8000_LDM dm = new MT_CLOSE_8000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_8000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */
        
        /* EJB ������ ����		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8000_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}
    
/*    
    public void mt_close_8000(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	MT_CLOSE_8000_LDataSet ds = null;

        // DM Setting
    	MT_CLOSE_8000_LDM dm = new MT_CLOSE_8000_LDM();

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));	// ȸ���ڵ�
		dm.setAply_from(Util.checkString(req.getParameter("aply_from"  )));	// ��������(����)
		dm.setAply_to(Util.checkString(req.getParameter("aply_to"    )));	// ��������(����)
		dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf"  )));	// ���屸��
		dm.setMatr_cd(Util.checkString(req.getParameter("matr_clsf" )));	// �����ڵ�   	
    	
		dm.print();
        
        try {
            MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome) JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
        	MT_CLOSE_8000EJB ejb = home.create();

        	ds = ejb.getMt_Close_8000(dm);
        	
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
    }
*/
    /**
     * �ʸ������������� ȭ���� �޺�(��ü,����,����,����(�ʸ�,�����) ����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_close_8001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_8001_LDataSet ds = null;
		MT_CLOSE_8001_LDM dm = new MT_CLOSE_8001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_8001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */
        
        /* EJB ������ ����		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8001_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

    /**
     * �ʸ������������� ������ ���� �� ����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */    
    public void mt_close_8002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_8002_LDataSet ds = null;
		MT_CLOSE_8002_LDM dm = new MT_CLOSE_8002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_8002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */
        
        /* EJB ������ ����		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8002_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
/*    
    public void mt_close_8002(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	MT_CLOSE_8002_ADataSet ds = null;
    	MT_CLOSE_8002_ADM dm = new MT_CLOSE_1002_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		System.out.println("converted[ 0] => CRUD (" + converted[0]+")");
		System.out.println("converted[ 1] => ROW  (" + converted[1]+")");
		System.out.println("converted[ 2] => ȸ��   (" + converted[2]+")");
		System.out.println("converted[ 3] => ����   (" + converted[3]+")");
		System.out.println("converted[ 4] => �ʸ�   (" + converted[4]+")");
		System.out.println("converted[ 5] => ����   (" + converted[5]+")");
		System.out.println("converted[ 6] => SEQ  (" + converted[6]+")");
		System.out.println("converted[ 7] => �ż�   (" + converted[7]+")");
		System.out.println("converted[ 8] => ��ü   (" + converted[8]+")");
		System.out.println("converted[ 9] => ����   (" + converted[9]+")");
		System.out.println("converted[10] => ��ǰ1 (" + converted[10]+")");
		System.out.println("converted[11] => ��ǰ2 (" + converted[11]+")");
		System.out.println("converted[12] => ��ǰ3 (" + converted[12]+")");
		System.out.println("converted[13] => ��ǰ4 (" + converted[13]+")");
		System.out.println("converted[14] => ��ǰ5 (" + converted[14]+")");
		
		String mode      = converted[0];
		String row       = converted[1];
		String fac_clsf  = converted[3];		// ���屸��
		String matr_cd   = converted[4];		// ����(�ʸ�)
		String aply_dt   = converted[5];		// ��������
		String seq       = converted[6];		// �Ϸù�ȣ
		String num_shet  = converted[7];		// �ż�
		String medi_cd   = converted[8];		// ��ü�ڵ�
		String sect_cd   = converted[9];		// �����ڵ�
		String chemi_cd1 = converted[10];		// ����(��ǰ1)
		String chemi_cd2 = converted[11];		// ����(��ǰ2)
		String chemi_cd3 = converted[12];		// ����(��ǰ3)
		String chemi_cd4 = converted[13];		// ����(��ǰ4)
		String chemi_cd5 = converted[14];		// ����(��ǰ5)

		dm.setMode(mode);
		dm.setRow(row);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	// ȸ���ڵ�
		dm.setFac_clsf(fac_clsf);		// ���屸��
		dm.setMatr_cd(matr_cd);			// ����(�ʸ�)
		dm.setAply_dt(aply_dt);			// ��������
		dm.setSeq(seq);					// �Ϸù�ȣ
		dm.setNum_shet(num_shet);		// �ż�
		dm.setMedi_cd(medi_cd);			// ��ü�ڵ�
		dm.setSect_cd(sect_cd);			// �����ڵ�
		dm.setChemi_cd1(chemi_cd1);		// ����(��ǰ1)
		dm.setChemi_cd2(chemi_cd2);		// ����(��ǰ2)
		dm.setChemi_cd3(chemi_cd3);		// ����(��ǰ3)
		dm.setChemi_cd4(chemi_cd4);		// ����(��ǰ4)
		dm.setChemi_cd5(chemi_cd5);		// ����(��ǰ5)
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		// �Է���IP
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);	// �Է���
    	
    	dm.print();

    	try {
            MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome) JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
        	MT_CLOSE_8000EJB ejb = home.create();

        	ds = ejb.getMt_Close_8002(dm);
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
    }
*/     
    public void mt_close_8003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_8003_LDataSet ds = null;
		MT_CLOSE_8003_LDM dm = new MT_CLOSE_8003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_8003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */
        
        /* EJB ������ ����		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8003_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
    
    public void mt_close_8004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_8004_LDataSet ds = null;
		MT_CLOSE_8004_LDM dm = new MT_CLOSE_8004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_8004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */
        
        /* EJB ������ ����		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8004_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}
    
    public void mt_close_8005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_8005_LDataSet ds = null;
		MT_CLOSE_8005_LDM dm = new MT_CLOSE_8005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_8005_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */
        
        /* EJB ������ ����		

		try {
			MT_CLOSE_8000EJBHome home = (MT_CLOSE_8000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_8000EJB");
			MT_CLOSE_8000EJB ejb = home.create();

			ds = ejb.mt_close_8005_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}
}