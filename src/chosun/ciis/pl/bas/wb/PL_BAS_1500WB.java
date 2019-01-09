/***************************************************************************************************
 * ���ϸ� : PL_BAS_1500WB.java
 * ��� : ���ʰ���-��ǥ����
 * �ۼ����� : 2009.04.30
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.bas.dao.PL_BAS_1500DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1500_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1510_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1520_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1530_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1500_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1510_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1520_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1530_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1500WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * �ʱ�ȭ�� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1500_MDataSet ds = null;

        // DM Setting
        PL_BAS_1500_MDM dm = new PL_BAS_1500_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1500DAO dao = new PL_BAS_1500DAO();
            ds = dao.pl_bas_1500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1500EJBHome home = (PL_BAS_1500EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1500EJB");
//        try {
//        	PL_BAS_1500EJB ejb = home.create();
//            ds = ejb.pl_bas_1500_m(dm);
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
     * �����ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1510_LDataSet ds = null;

        // DM Setting
        PL_BAS_1510_LDM dm = new PL_BAS_1510_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String yy = Util.checkString(req.getParameter("yy"));										//�⵵
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setYy(yy);
		dm.setMedi_cd(medi_cd);

        try {
        	PL_BAS_1500DAO dao = new PL_BAS_1500DAO();
            ds = dao.pl_bas_1510_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1500EJBHome home = (PL_BAS_1500EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1500EJB");
//        try {
//        	PL_BAS_1500EJB ejb = home.create();
//            ds = ejb.pl_bas_1510_l(dm);
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
     * ��ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1520_LDataSet ds = null;

        // DM Setting
        PL_BAS_1520_LDM dm = new PL_BAS_1520_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String yy = Util.checkString(req.getParameter("yy"));										//�⵵
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setYy(yy);
		dm.setMedi_cd(medi_cd);

        try {
        	PL_BAS_1500DAO dao = new PL_BAS_1500DAO();
            ds = dao.pl_bas_1520_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1500EJBHome home = (PL_BAS_1500EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1500EJB");
//        try {
//        	PL_BAS_1500EJB ejb = home.create();
//            ds = ejb.pl_bas_1520_l(dm);
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
     * ����/���� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1530_ADataSet ds = null;

        // DM Setting
        PL_BAS_1530_ADM dm = new PL_BAS_1530_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//ó�������ڵ�(����:S, ����:D)
		String yy = Util.checkString(req.getParameter("yy"));										//�⵵
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�
    	String updateData = Util.checkString(req.getParameter("updateData"));						//��������

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String medi_cd_arr = (String)hash.get("medi_cd");											//��ü�ڵ�
    	String dlco_clsf_arr = (String)hash.get("dlco_clsf");										//�ŷ�ó����
    	String basi_yymm_arr = (String)hash.get("basi_yymm");										//���س��
    	String trgt_qty_arr = (String)hash.get("trgt_qty");											//��ǥ�μ�
    	String trgt_amt_arr = (String)hash.get("trgt_amt");											//��ǥ�ݾ�

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setYy(yy);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_cd_arr(medi_cd_arr);
		dm.setDlco_clsf_arr(dlco_clsf_arr);
		dm.setBasi_yymm_arr(basi_yymm_arr);
		dm.setTrgt_qty_arr(trgt_qty_arr);
		dm.setTrgt_amt_arr(trgt_amt_arr);

        try {
        	PL_BAS_1500DAO dao = new PL_BAS_1500DAO();
            ds = dao.pl_bas_1530_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1500EJBHome home = (PL_BAS_1500EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1500EJB");
//        try {
//        	PL_BAS_1500EJB ejb = home.create();
//            ds = ejb.pl_bas_1530_a(dm);
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
    
}
