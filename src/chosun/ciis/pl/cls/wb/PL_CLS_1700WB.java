/***************************************************************************************************
 * ���ϸ� : PL_CLS_1000WB.java
 * ��� : ��������-�Ա��ϸ���
 * �ۼ����� : 2009.05.13
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.cls.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.cls.dao.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;
/**
 * 
 */
public class PL_CLS_1700WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * ��ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_cls_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1710_LDataSet ds = null;

        // DM Setting
        PL_CLS_1710_LDM dm = new PL_CLS_1710_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
       
        //���������� Request�� ���� �Ķ����
		String issu_dt = Util.checkString(req.getParameter("issu_dt"));						//��������FROM
		
        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIssu_dt(issu_dt);

		dm.print();
		
		
        try {
        	PL_CLS_1700DAO dao = new PL_CLS_1700DAO();
            ds = dao.pl_cls_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1000EJBHome home = (PL_CLS_1000EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1000EJB");
//        try {
//        	PL_CLS_1000EJB ejb = home.create();
//            ds = ejb.pl_cls_1010_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * ����/������� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_cls_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1720_ADataSet ds = null;

        // DM Setting
        PL_CLS_1720_ADM dm = new PL_CLS_1720_ADM();
        
        String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.bo_cd = Util.checkString((String)hash.get("bo_cd"));
		dm.gnr_qty = Util.checkString((String)hash.get("gnr_qty"));
		dm.net_sale_amt = Util.checkString((String)hash.get("net_sale_amt"));
		
        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//ó������
		String issu_dt = Util.checkString(req.getParameter("issu_dt"));								//��������(��������)
		
        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIssu_dt(issu_dt);
		dm.print();
		
		
        try {
        	PL_CLS_1700DAO dao = new PL_CLS_1700DAO();
            ds = dao.pl_cls_1720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }
    
    public void pl_cls_1730_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1730_ADataSet ds = null;

        // DM Setting
        PL_CLS_1730_ADM dm = new PL_CLS_1730_ADM();

        //Session���� ���� ����Ÿ
        String uid    	  = Util.getSessionParameterValue(req, "uid", true);						//�����ID
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//ó������
		String basi_dt = Util.checkString(req.getParameter("issu_dt"));								//��������(��������)
		String basi_yymm = basi_dt.substring(0, 6);							//���س��
		
        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setUid(uid);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);
		dm.print();
		
		
        try {
        	PL_CLS_1700DAO dao = new PL_CLS_1700DAO();
            ds = dao.pl_cls_1730_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }
    
 public void pl_cls_1740_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1740_LDataSet ds = null;

        // DM Setting
        PL_CLS_1740_LDM dm = new PL_CLS_1740_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
       
        //���������� Request�� ���� �Ķ����
		String issu_dt = Util.checkString(req.getParameter("issu_dt"));						//��������FROM
		
        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIssu_dt(issu_dt);
		dm.print();
		
		
        try {
        	PL_CLS_1700DAO dao = new PL_CLS_1700DAO();
            ds = dao.pl_cls_1740_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

    }
}
