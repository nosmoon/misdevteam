/***************************************************************************************************
* ���ϸ� : MT_PRNPAP_4000WB
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-09 
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
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
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
import chosun.ciis.mt.papord.dm.*;                    
import chosun.ciis.mt.papord.ds.*;             
 
public class MT_PAPORD_1400WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * �ְ������μⷮ����(����, ��ü �޺�)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_1400_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1400_MDataSet ds = null;
		
		MT_PAPORD_1400_MDM dm = new MT_PAPORD_1400_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPORD_1400_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * �ְ������μⷮ����(���� �޺�)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_4001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4001_MDataSet ds = null;
		
		MT_PAPORD_4001_MDM dm = new MT_PAPORD_4001_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
		dm.print();

		ds = (MT_PAPORD_4001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * �ְ������μⷮ����(�߷�/1�� �޺�)
	 * @param dm
	 * @return ds 
	 * @throws AppException
	 */
    public void mt_papord_4002_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4002_MDataSet ds = null;
		
		MT_PAPORD_4002_MDM dm = new MT_PAPORD_4002_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_4002_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    
    /**
	 * ������, ����μ�, ���⿩��
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_4003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4003_LDataSet ds = null;
		
		MT_PAPORD_4003_LDM dm = new MT_PAPORD_4003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_s = Util.checkString(req.getParameter("issu_dt_s"));
		dm.fac_clsf_s = Util.checkString(req.getParameter("fac_clsf_s"));
		dm.medi_cd_s = Util.checkString(req.getParameter("medi_cd_s"));
		dm.sect_cd_s = Util.checkString(req.getParameter("sect_cd_s"));
		dm.print();

		ds = (MT_PAPORD_4003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * �ְ������μⷮ���� ����,����,����
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_1420_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1420_ADataSet ds = null;
		
		MT_PAPORD_1420_ADM dm = new MT_PAPORD_1420_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//String[] converted = convertMultiUpdateData(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String mode             = (String)hash.get("m");
		String prt_dt          = (String)hash.get("prt_dt");
		String issu_dt          = (String)hash.get("issu_dt");
		String fac_clsf         = (String)hash.get("fac_clsf");
		String medi_cd          = (String)hash.get("medi_cd");
		String sect_cd          = (String)hash.get("sect_cd");
		String pap_std        	= (String)hash.get("pap_std");
		String issu_pcnt        = (String)hash.get("issu_pcnt");
		String slip_qty         = (String)hash.get("slip_qty");
		String pap_model       	= (String)hash.get("pap_model");
		String a_wgt            = (String)hash.get("a_wgt");
		String b_wgt            = (String)hash.get("b_wgt");
		String c_wgt            = (String)hash.get("c_wgt");
		String occr_dt          = (String)hash.get("occr_dt");
		String seq 			    = (String)hash.get("seq");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode.toUpperCase());
		dm.setPrt_dt(prt_dt);
		dm.setIssu_dt(issu_dt);
		dm.setFac_clsf(fac_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setSect_cd(sect_cd);
		dm.setPap_std(pap_std);
		dm.setIssu_pcnt(issu_pcnt);
		dm.setSlip_qty(slip_qty);
		dm.setPap_model(pap_model);
		dm.setA_wgt(a_wgt);
		dm.setB_wgt(b_wgt);
		dm.setC_wgt(c_wgt);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.print();
		
		ds = (MT_PAPORD_1420_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * �ְ������μⷮ���� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4005_LDataSet ds = null;
		
		MT_PAPORD_4005_LDM dm = new MT_PAPORD_4005_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf_s"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt_s"));
		dm.print();

		ds = (MT_PAPORD_4005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * �ְ������μⷮ���� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_1410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1410_LDataSet ds = null;
		
		MT_PAPORD_1410_LDM dm = new MT_PAPORD_1410_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.prt_dt_fr = Util.checkString(req.getParameter("prt_dt_fr"));
		dm.prt_dt_to = Util.checkString(req.getParameter("prt_dt_to"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_1410_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * �ְ������μⷮ���� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4007_LDataSet ds = null;
		
		MT_PAPORD_4007_LDM dm = new MT_PAPORD_4007_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_yymm	= Util.checkString(req.getParameter("occr_yymm"));
		dm.fac_clsf		= Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PAPORD_4007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * �ְ������μⷮ���� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4008_LDataSet ds = null;
		
		MT_PAPORD_4008_LDM dm = new MT_PAPORD_4008_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPORD_4008_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * �ְ�������ȸ �˾�
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_papord_4100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4100_LDataSet ds = null;
		
		MT_PAPORD_4100_LDM dm = new MT_PAPORD_4100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
		dm.issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
		dm.print();

		ds = (MT_PAPORD_4100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
