/***************************************************************************************************
* ���ϸ� : MT_PRNPAP_7000WB
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-17 
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.mt.papord.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.mt.papord.dao.MT_PAPORD_7000DAO;
import chosun.ciis.mt.papord.dm.*;                    
import chosun.ciis.mt.papord.ds.*;      
 
public class MT_PAPORD_7000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * �����ڵ����ּ� ��ȸ
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_7000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7000_LDataSet ds = null;
		
		MT_PAPORD_7000_LDM dm = new MT_PAPORD_7000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ordr_dt_fr = Util.checkString(req.getParameter("ordr_dt_fr"));
		dm.ordr_dt_to = Util.checkString(req.getParameter("ordr_dt_to"));
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm.print();

		ds = (MT_PAPORD_7000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * �����ڵ����ּ� �׸���Caption
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_7001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7001_LDataSet ds = null;
		
		MT_PAPORD_7001_LDM dm = new MT_PAPORD_7001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ordr_dt = Util.checkString(req.getParameter("ordr_dt"));
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm.print();

		ds = (MT_PAPORD_7001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * ���ּ�����
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_7002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PAPORD_7002_LDataSet ds = null;
    	MT_PAPORD_7001_LDataSet ds1 = null;
    	MT_PAPORD_7003_LDataSet ds2 = null;
    	MT_PAPORD_7002_LDM dm = new MT_PAPORD_7002_LDM();
    	MT_PAPORD_7001_LDM dm1 = new MT_PAPORD_7001_LDM();
    	MT_PAPORD_7003_LDM dm2 = new MT_PAPORD_7003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ordr_dt = Util.checkString(req.getParameter("ordr_dt"));
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm1.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm1.ordr_dt = Util.checkString(req.getParameter("ordr_dt"));
		dm1.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm2.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm2.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		String email = Util.getSessionParameterValue(req, "email", true);
		dm.print();
		/*
		ds = (MT_PAPORD_7002_LDataSet)manager.executeCall(dm);
		
		//System.out.println("###################");
		
		//��¥��ȸ(������)
		ds1 = ejb.mt_papord_7001_l(dm1);
		req.setAttribute("ds1", ds1);
		//System.out.println("###################");
		
		//�������ڵ�, ��, �޴»�������ּ�(�ŷ�ó �����1)
		ds2 = ejb.mt_papord_7003_l(dm2);
		req.setAttribute("ds2", ds2);
		//System.out.println("###################");
		
		//�����»�� �����ּ�(����)
		req.setAttribute("fromEmail",email);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		*/
		try {
			MT_PAPORD_7000DAO dao = new MT_PAPORD_7000DAO();
			//Data ��ȸ
			ds = dao.mt_papord_7002_l(dm);
			req.setAttribute("ds", ds);
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			//System.out.println("###################");
			
			//��¥��ȸ(������)
			ds1 = dao.mt_papord_7001_l(dm1);
			req.setAttribute("ds1", ds1);
			if (!"".equals(ds1.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds1.errcode, ds1.errmsg);
	        }
			//System.out.println("###################");
			
			//�������ڵ�, ��, �޴»�������ּ�(�ŷ�ó �����1)
			ds2 = dao.mt_papord_7003_l(dm2);
			req.setAttribute("ds2", ds2);
			if (!"".equals(ds2.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds2.errcode, ds2.errmsg);
	        }
			//System.out.println("###################");
			
			//�����»�� �����ּ�(����)
			req.setAttribute("fromEmail",email);
			//System.out.println("###################");
			
		}catch (SysException e) {
				throw new AppException("0101", e.getMessage());
		}
    }
}
