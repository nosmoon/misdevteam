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
 
public class MT_CLOSE_2000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * �ʸ������� ȭ����ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_close_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_2000_LDataSet ds = null;
		MT_CLOSE_2000_LDM dm = new MT_CLOSE_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_2000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */

        /* EJB ������ ����		
		try {
			MT_CLOSE_2000EJBHome home = (MT_CLOSE_2000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_2000EJB");
			MT_CLOSE_2000EJB ejb = home.create();

			ds = ejb.mt_close_2000_l(dm);
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

    /**
     * �ʸ������������� ȭ���� �޺�(��ü,����,����,����(�ʸ�,�����) ����
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_close_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_2001_LDataSet ds = null;
		MT_CLOSE_2001_LDM dm = new MT_CLOSE_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_2001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */

        /* EJB ������ ����		
		try {
			MT_CLOSE_2000EJBHome home = (MT_CLOSE_2000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_2000EJB");
			MT_CLOSE_2000EJB ejb = home.create();

			ds = ejb.mt_close_2001_l(dm);
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

    public void mt_close_2002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_2002_LDataSet ds = null;
		MT_CLOSE_2002_LDM dm = new MT_CLOSE_2002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));

		dm.print();
		
		/* EJB ������ ���� */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_2002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB ������ �� */

        /* EJB ������ ����		
		try {
			MT_CLOSE_2000EJBHome home = (MT_CLOSE_2000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_2000EJB");
			MT_CLOSE_2000EJB ejb = home.create();

			ds = ejb.mt_close_2002_l(dm);
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
		dm.matr_cd = (String)hash.get("matr_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.matr_cd = Util.getSessionParameterValue(req,"matr_cd",true);
		*******************************************************************************************/
	}
}