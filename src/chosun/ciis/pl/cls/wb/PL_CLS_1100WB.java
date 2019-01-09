/***************************************************************************************************
 * ���ϸ� : PL_CLS_1100WB.java
 * ��� : ��������-�系�Ǹ��ϸ���
 * �ۼ����� : 2009.05.11
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.cls.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.cls.dao.PL_CLS_1100DAO;
import chosun.ciis.pl.cls.dm.PL_CLS_1100_MDM;
import chosun.ciis.pl.cls.dm.PL_CLS_1110_LDM;
import chosun.ciis.pl.cls.dm.PL_CLS_1120_ADM;
import chosun.ciis.pl.cls.ds.PL_CLS_1100_MDataSet;
import chosun.ciis.pl.cls.ds.PL_CLS_1110_LDataSet;
import chosun.ciis.pl.cls.ds.PL_CLS_1120_ADataSet;

/**
 * 
 */
public class PL_CLS_1100WB extends BaseWB {

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
    public void pl_cls_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1100_MDataSet ds = null;

        // DM Setting
        PL_CLS_1100_MDM dm = new PL_CLS_1100_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_CLS_1100DAO dao = new PL_CLS_1100DAO();
            ds = dao.pl_cls_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1100EJBHome home = (PL_CLS_1100EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1100EJB");
//        try {
//        	PL_CLS_1100EJB ejb = home.create();
//            ds = ejb.pl_cls_1100_m(dm);
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
    public void pl_cls_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1110_LDataSet ds = null;

        // DM Setting
        PL_CLS_1110_LDM dm = new PL_CLS_1110_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//��������FROM
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//��������TO

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);

        try {
        	PL_CLS_1100DAO dao = new PL_CLS_1100DAO();
            ds = dao.pl_cls_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1100EJBHome home = (PL_CLS_1100EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1100EJB");
//        try {
//        	PL_CLS_1100EJB ejb = home.create();
//            ds = ejb.pl_cls_1110_l(dm);
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
    public void pl_cls_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1120_ADataSet ds = null;

        // DM Setting
        PL_CLS_1120_ADM dm = new PL_CLS_1120_ADM();

        //Session���� ���� ����Ÿ
        String uid    	  = Util.getSessionParameterValue(req, "uid", true);						//�����ID
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//ó������
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));								//��������(��������)

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setUid(uid);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt(basi_dt);

        try {
        	PL_CLS_1100DAO dao = new PL_CLS_1100DAO();
            ds = dao.pl_cls_1120_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1100EJBHome home = (PL_CLS_1100EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1100EJB");
//        try {
//        	PL_CLS_1100EJB ejb = home.create();
//            ds = ejb.pl_cls_1120_a(dm);
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
