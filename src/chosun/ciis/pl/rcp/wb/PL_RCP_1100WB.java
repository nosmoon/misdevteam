/***************************************************************************************************
 * ���ϸ� : PL_RCP_1100WB.java
 * ��� : �Աݰ���-�Աݹ�ȯó��
 * �ۼ����� : 2009.04.23
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.rcp.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.rcp.dao.PL_RCP_1100DAO;
import chosun.ciis.pl.rcp.dm.PL_RCP_1100_MDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_1110_LDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_1120_LDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_1130_LDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_1140_ADM;
import chosun.ciis.pl.rcp.ds.PL_RCP_1100_MDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_1110_LDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_1120_LDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_1130_LDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_1140_ADataSet;

/**
 * 
 */
public class PL_RCP_1100WB extends BaseWB {

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
    public void pl_rcp_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1100_MDataSet ds = null;

        // DM Setting
        PL_RCP_1100_MDM dm = new PL_RCP_1100_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1100_m(dm);
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
    public void pl_rcp_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1110_LDataSet ds = null;

        // DM Setting
        PL_RCP_1110_LDM dm = new PL_RCP_1110_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//���س������
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//���س������
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//�ŷ�ó����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1110_l(dm);
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
    public void pl_rcp_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1120_LDataSet ds = null;

        // DM Setting
        PL_RCP_1120_LDM dm = new PL_RCP_1120_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String occr_dt = Util.checkString(req.getParameter("occr_dt"));								//�߻�����
		String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));                         //��ǥ����
		String seq = Util.checkString(req.getParameter("seq"));                                     //����
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));                             //�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));                           //�ŷ�ó����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setOccr_dt(occr_dt);
		dm.setSlip_clsf(slip_clsf);
		dm.setSeq(seq);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1120_l(dm);
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
     * �����ݹ׸���������ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_rcp_1130_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1130_LDataSet ds = null;

        // DM Setting
        PL_RCP_1130_LDM dm = new PL_RCP_1130_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String dlco_cd = Util.checkString(req.getParameter("h_dlco_cd"));                           //�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("h_dlco_seq"));                         //�ŷ�ó����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1130_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1130_l(dm);
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
    public void pl_rcp_1140_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_1140_ADataSet ds = null;

        // DM Setting
        PL_RCP_1140_ADM dm = new PL_RCP_1140_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
		String h_rcpm_dt = Util.checkString(req.getParameter("h_rcpm_dt"));							//�Ա�����
		String h_dlco_cd = Util.checkString(req.getParameter("h_dlco_cd"));                         //�ŷ�ó�ڵ�
		String h_dlco_seq = Util.checkString(req.getParameter("h_dlco_seq"));                       //�ŷ�ó����
		String h_occr_dt = Util.checkString(req.getParameter("h_occr_dt"));							//�߻�����
		String h_slip_clsf = Util.checkString(req.getParameter("h_slip_clsf"));						//��ǥ����
		String h_seq = Util.checkString(req.getParameter("h_seq"));									//����
		String h_dd_clos_yn = Util.checkString(req.getParameter("h_dd_clos_yn"));					//�ϸ�������
		String h_gurt_amt = Util.checkString(req.getParameter("h_gurt_amt"));						//�����ݾ�

		//��ȯ����
    	String updateData = Util.Uni2Ksc(Util.checkString(req.getParameter("updateData")));			//��ȯ����
    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String c_budg_clsf_arr = (String)hash.get("c_budg_clsf");									//���걸�� �迭     
    	String c_basi_yymm_arr = (String)hash.get("c_basi_yymm");									//���س�� �迭   
    	String c_amt_arr = (String)hash.get("c_amt");												//�ݾ� �迭   
    	String c_remk_arr = (String)hash.get("c_remk");												//��� �迭   
    	String c_slip_clsf_arr = (String)hash.get("c_slip_clsf");									//��ǥ���� �迭 
    	String c_seq_arr = (String)hash.get("c_seq");												//���� �迭         
    	String c_subseq_arr = (String)hash.get("c_subseq");											//������� �迭 
    	String c_dd_clos_yn_arr = (String)hash.get("c_dd_clos_yn");									//�������� �迭     

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setH_rcpm_dt(h_rcpm_dt);
		dm.setH_dlco_cd(h_dlco_cd);
		dm.setH_dlco_seq(h_dlco_seq);
		dm.setH_occr_dt(h_occr_dt);
		dm.setH_slip_clsf(h_slip_clsf);
		dm.setH_seq(h_seq);
		dm.setH_dd_clos_yn(h_dd_clos_yn);
		dm.setH_gurt_amt(h_gurt_amt);
		dm.setC_budg_clsf_arr(c_budg_clsf_arr);
		dm.setC_basi_yymm_arr(c_basi_yymm_arr);
		dm.setC_amt_arr(c_amt_arr);
		dm.setC_remk_arr(c_remk_arr);
		dm.setC_slip_clsf_arr(c_slip_clsf_arr);
		dm.setC_seq_arr(c_seq_arr);
		dm.setC_subseq_arr(c_subseq_arr);
		dm.setC_dd_clos_yn_arr(c_dd_clos_yn_arr);

        try {
        	PL_RCP_1100DAO dao = new PL_RCP_1100DAO();
            ds = dao.pl_rcp_1140_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_1100EJBHome home = (PL_RCP_1100EJBHome) JNDIManager.getInstance().getHome("PL_RCP_1100EJB");
//        try {
//        	PL_RCP_1100EJB ejb = home.create();
//            ds = ejb.pl_rcp_1140_a(dm);
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
