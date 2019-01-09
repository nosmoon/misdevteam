/***************************************************************************************************
 * ���ϸ� : PL_BAS_1400WB.java
 * ��� : ���ʰ���-�����ܾװ���
 * �ۼ����� : 2009.03.05
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
import chosun.ciis.pl.bas.dao.PL_BAS_1400DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1400_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1410_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1420_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1430_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1400_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1410_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1420_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1430_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1400WB extends BaseWB {

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
    public void pl_bas_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1400_MDataSet ds = null;

        // DM Setting
        PL_BAS_1400_MDM dm = new PL_BAS_1400_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1400DAO dao = new PL_BAS_1400DAO();
            ds = dao.pl_bas_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1400EJBHome home = (PL_BAS_1400EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1400EJB");
//        try {
//        	PL_BAS_1400EJB ejb = home.create();
//            ds = ejb.pl_bas_1400_m(dm);
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
    public void pl_bas_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1410_LDataSet ds = null;

        // DM Setting
        PL_BAS_1410_LDM dm = new PL_BAS_1410_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
        String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));			//�ŷ�ó����
        String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));						//����
        String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));				//�ŷ�ó�ڵ�

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setDlco_clsf(dlco_clsf);
        dm.setArea(area);
        dm.setDlco_cd(dlco_cd);

        try {
        	PL_BAS_1400DAO dao = new PL_BAS_1400DAO();
            ds = dao.pl_bas_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1400EJBHome home = (PL_BAS_1400EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1400EJB");
//        try {
//        	PL_BAS_1400EJB ejb = home.create();
//            ds = ejb.pl_bas_1410_l(dm);
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
     * ����ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1420_LDataSet ds = null;

        // DM Setting
        PL_BAS_1420_LDM dm = new PL_BAS_1420_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
        String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));				//�ŷ�ó�ڵ�
        String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));				//�ŷ�ó����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setDlco_cd(dlco_cd);
        dm.setDlco_seq(dlco_seq);

        try {
        	PL_BAS_1400DAO dao = new PL_BAS_1400DAO();
            ds = dao.pl_bas_1420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1400EJBHome home = (PL_BAS_1400EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1400EJB");
//        try {
//        	PL_BAS_1400EJB ejb = home.create();
//            ds = ejb.pl_bas_1420_l(dm);
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
    public void pl_bas_1430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1430_ADataSet ds = null;

        // DM Setting
        PL_BAS_1430_ADM dm = new PL_BAS_1430_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//ó�������ڵ�(����:S, ����:D)
    	String updateData = Util.checkString(req.getParameter("updateData"));						//��������

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");													//row state
    	String reg_dt_arr = (String)hash.get("reg_dt");												//�������
    	String reg_seq_arr = (String)hash.get("reg_seq");											//��ϼ���
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//�ŷ�ó�ڵ�
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//�ŷ�ó����
    	String medi_clsf_arr = (String)hash.get("medi_clsf");										//��ü����
    	String meda_clsf_arr = (String)hash.get("meda_clsf");										//��������
    	String setup_dt_arr = (String)hash.get("setup_dt");											//��������
    	String basi_yymm_arr = (String)hash.get("basi_yymm");										//���س��
    	String setup_amt_arr = (String)hash.get("setup_amt");										//�����ݾ�
    	String dd_clos_yn_arr = (String)hash.get("dd_clos_yn");										//�ϸ�������
    	String remk_arr = (String)hash.get("remk");													//���

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr);
		dm.setReg_dt_arr(reg_dt_arr);
		dm.setReg_seq_arr(reg_seq_arr);
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setMedi_clsf_arr(medi_clsf_arr);
		dm.setMeda_clsf_arr(meda_clsf_arr);
		dm.setSetup_dt_arr(setup_dt_arr);
		dm.setBasi_yymm_arr(basi_yymm_arr);
		dm.setSetup_amt_arr(setup_amt_arr);
		dm.setDd_clos_yn_arr(dd_clos_yn_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1400DAO dao = new PL_BAS_1400DAO();
            ds = dao.pl_bas_1430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1400EJBHome home = (PL_BAS_1400EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1400EJB");
//        try {
//        	PL_BAS_1400EJB ejb = home.create();
//            ds = ejb.pl_bas_1430_a(dm);
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
