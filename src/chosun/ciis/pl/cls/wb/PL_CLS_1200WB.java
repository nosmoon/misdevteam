/***************************************************************************************************
 * ���ϸ� : PL_CLS_1200WB.java
 * ��� : ��������-���������
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
import chosun.ciis.pl.cls.dao.PL_CLS_1200DAO;
import chosun.ciis.pl.cls.dm.PL_CLS_1200_MDM;
import chosun.ciis.pl.cls.dm.PL_CLS_1210_LDM;
import chosun.ciis.pl.cls.dm.PL_CLS_1220_ADM;
import chosun.ciis.pl.cls.ds.PL_CLS_1200_MDataSet;
import chosun.ciis.pl.cls.ds.PL_CLS_1210_LDataSet;
import chosun.ciis.pl.cls.ds.PL_CLS_1220_ADataSet;

/**
 * 
 */
public class PL_CLS_1200WB extends BaseWB {

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
    public void pl_cls_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1200_MDataSet ds = null;

        // DM Setting
        PL_CLS_1200_MDM dm = new PL_CLS_1200_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_CLS_1200DAO dao = new PL_CLS_1200DAO();
            ds = dao.pl_cls_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1200EJBHome home = (PL_CLS_1200EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1200EJB");
//        try {
//        	PL_CLS_1200EJB ejb = home.create();
//            ds = ejb.pl_cls_1200_m(dm);
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
    public void pl_cls_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1210_LDataSet ds = null;

        // DM Setting
        PL_CLS_1210_LDM dm = new PL_CLS_1210_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
		String basi_yymm_fr = Util.checkString(req.getParameter("basi_yymm_fr"));					//���س��FROM
		String basi_yymm_to = Util.checkString(req.getParameter("basi_yymm_to"));					//���س��TO

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_yymm_fr(basi_yymm_fr);
		dm.setBasi_yymm_to(basi_yymm_to);

        try {
        	PL_CLS_1200DAO dao = new PL_CLS_1200DAO();
            ds = dao.pl_cls_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1200EJBHome home = (PL_CLS_1200EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1200EJB");
//        try {
//        	PL_CLS_1200EJB ejb = home.create();
//            ds = ejb.pl_cls_1210_l(dm);
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
    public void pl_cls_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_CLS_1220_ADataSet ds = null;

        // DM Setting
        PL_CLS_1220_ADM dm = new PL_CLS_1220_ADM();

        //Session���� ���� ����Ÿ
        String uid    	  = Util.getSessionParameterValue(req, "uid", true);						//�����ID
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//ó������
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));							//���س��
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));								//��������(��������)

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setUid(uid);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);

        try {
        	PL_CLS_1200DAO dao = new PL_CLS_1200DAO();
            ds = dao.pl_cls_1220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_CLS_1200EJBHome home = (PL_CLS_1200EJBHome) JNDIManager.getInstance().getHome("PL_CLS_1200EJB");
//        try {
//        	PL_CLS_1200EJB ejb = home.create();
//            ds = ejb.pl_cls_1220_a(dm);
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
