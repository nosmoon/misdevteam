/***************************************************************************************************
 * ���ϸ� : PL_COM_1300WB.java
 * ��� : �������-�系�Ǹ��Ա�ó��
 * �ۼ����� : 2009.04.22
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.com.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.com.dao.PL_COM_1300DAO;
import chosun.ciis.pl.com.dm.PL_COM_1300_MDM;
import chosun.ciis.pl.com.dm.PL_COM_1310_LDM;
import chosun.ciis.pl.com.dm.PL_COM_1320_ADM;
import chosun.ciis.pl.com.ds.PL_COM_1300_MDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1310_LDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1320_ADataSet;

/**
 * 
 */
public class PL_COM_1300WB extends BaseWB {

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
    public void pl_com_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1300_MDataSet ds = null;

        // DM Setting
        PL_COM_1300_MDM dm = new PL_COM_1300_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//�ŷ�ó����
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));								//�ֹ�����
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));					//�ֹ��׷����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);

        try {
        	PL_COM_1300DAO dao = new PL_COM_1300DAO();
            ds = dao.pl_com_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1300EJBHome home = (PL_COM_1300EJBHome) JNDIManager.getInstance().getHome("PL_COM_1300EJB");
//        try {
//        	PL_COM_1300EJB ejb = home.create();
//            ds = ejb.pl_com_1300_m(dm);
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
    public void pl_com_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1310_LDataSet ds = null;

        // DM Setting
        PL_COM_1310_LDM dm = new PL_COM_1310_LDM();

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
        	PL_COM_1300DAO dao = new PL_COM_1300DAO();
            ds = dao.pl_com_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1300EJBHome home = (PL_COM_1300EJBHome) JNDIManager.getInstance().getHome("PL_COM_1300EJB");
//        try {
//        	PL_COM_1300EJB ejb = home.create();
//            ds = ejb.pl_com_1310_l(dm);
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
    public void pl_com_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1320_ADataSet ds = null;

        // DM Setting
        PL_COM_1320_ADM dm = new PL_COM_1320_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
		String h_rcpm_dt = Util.checkString(req.getParameter("h_rcpm_dt"));							//�Ա�����
		String h_dlco_cd = Util.checkString(req.getParameter("h_dlco_cd"));                         //�ŷ�ó�ڵ�
		String h_dlco_seq = Util.checkString(req.getParameter("h_dlco_seq"));                       //�ŷ�ó����
		String h_rcpm_shet_no = Util.checkString(req.getParameter("h_rcpm_shet_no"));				//�Ա�ǥ��ȣ
		String h_occr_dt = Util.checkString(req.getParameter("h_occr_dt"));							//�߻�����
		String h_slip_clsf = Util.checkString(req.getParameter("h_slip_clsf"));						//��ǥ����
		String h_seq = Util.checkString(req.getParameter("h_seq"));									//����
		String h_gurt_amt = Util.checkString(req.getParameter("h_gurt_amt"));						//�����ݾ�
		String h_deal_dt = Util.checkString(req.getParameter("h_deal_dt"));							//�ŷ�����
		String h_deal_grp_seq = Util.checkString(req.getParameter("h_deal_grp_seq"));				//�ŷ��׷����
		String h_ordr_dt = Util.checkString(req.getParameter("h_ordr_dt"));							//�ֹ�����
		String h_ordr_grp_seq = Util.checkString(req.getParameter("h_ordr_grp_seq"));				//�ֹ��׷����
		String h_dr_rcpm_amt_sum = Util.checkString(req.getParameter("h_dr_rcpm_amt_sum"));			//�����ݾ���
		String h_crdt_rcpm_amt_sum = Util.checkString(req.getParameter("h_crdt_rcpm_amt_sum"));		//�뺯�ݾ���

		//��������
    	String updateData1 = Util.Uni2Ksc(Util.checkString(req.getParameter("updateData1")));		//��������
    	Hashtable hash1 = getHashMultiUpdateData(updateData1);										//��Ƽ�����ͺи�

    	String d_rcpm_type_arr = (String)hash1.get("d_rcpm_type");									//�Ա����� �迭     
    	String d_amt_arr = (String)hash1.get("d_amt");												//�ݾ� �迭   
    	String d_rmtt_dt_arr = (String)hash1.get("d_rmtt_dt");										//�۱�����(��������) �迭   
    	String d_rmtt_plac_arr = (String)hash1.get("d_rmtt_plac");									//�۱�ó �迭   
    	String d_acct_mang_no_arr = (String)hash1.get("d_acct_mang_no");							//���°�����ȣ �迭 
    	String d_note_no_arr = (String)hash1.get("d_note_no");										//������ȣ �迭         
    	String d_note_clsf_cd_arr = (String)hash1.get("d_note_clsf_cd");							//���������ڵ� �迭 
    	String d_bank_cd_arr = (String)hash1.get("d_bank_cd");										//�����ڵ� �迭     
    	String d_issu_pers_nm_arr = (String)hash1.get("d_issu_pers_nm");							//�����ڸ� �迭   
    	String d_issu_cmpy_clsf_cd_arr = (String)hash1.get("d_issu_cmpy_clsf_cd");					//����籸���ڵ� �迭     
    	String d_comp_dt_arr = (String)hash1.get("d_comp_dt");										//������� �迭     
    	String d_mtry_dt_arr = (String)hash1.get("d_mtry_dt");										//�������� �迭         
    	String d_remk_arr = (String)hash1.get("d_remk");											//��� �迭     
    	String d_slip_clsf_arr = (String)hash1.get("d_slip_clsf");									//��ǥ���� �迭         
    	String d_seq_arr = (String)hash1.get("d_seq");												//���� �迭     
    	String d_subseq_arr = (String)hash1.get("d_subseq");										//������� �迭         
    	String d_dd_clos_yn_arr = (String)hash1.get("d_dd_clos_yn");								//�������� �迭     

		//�뺯����
    	String updateData2 = Util.Uni2Ksc(Util.checkString(req.getParameter("updateData2")));		//�뺯����
    	Hashtable hash2 = getHashMultiUpdateData(updateData2);										//��Ƽ�����ͺи�

    	String c_budg_clsf_arr = (String)hash2.get("c_budg_clsf");									//���걸�� �迭     
    	String c_basi_yymm_arr = (String)hash2.get("c_basi_yymm");									//���س�� �迭   
    	String c_amt_arr = (String)hash2.get("c_amt");												//�ݾ� �迭   
    	String c_remk_arr = (String)hash2.get("c_remk");											//��� �迭   
    	String c_slip_clsf_arr = (String)hash2.get("c_slip_clsf");									//��ǥ���� �迭 
    	String c_seq_arr = (String)hash2.get("c_seq");												//���� �迭         
    	String c_subseq_arr = (String)hash2.get("c_subseq");										//������� �迭 
    	String c_dd_clos_yn_arr = (String)hash2.get("c_dd_clos_yn");								//�������� �迭     

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setH_rcpm_dt(h_rcpm_dt);
		dm.setH_dlco_cd(h_dlco_cd);
		dm.setH_dlco_seq(h_dlco_seq);
		dm.setH_rcpm_shet_no(h_rcpm_shet_no);
		dm.setH_occr_dt(h_occr_dt);
		dm.setH_slip_clsf(h_slip_clsf);
		dm.setH_seq(h_seq);
		dm.setH_gurt_amt(h_gurt_amt);
		dm.setH_deal_dt(h_deal_dt);
		dm.setH_deal_grp_seq(h_deal_grp_seq);
		dm.setH_ordr_dt(h_ordr_dt);
		dm.setH_ordr_grp_seq(h_ordr_grp_seq);
		dm.setH_dr_rcpm_amt_sum(h_dr_rcpm_amt_sum);
		dm.setH_crdt_rcpm_amt_sum(h_crdt_rcpm_amt_sum);
		dm.setD_rcpm_type_arr(d_rcpm_type_arr);
		dm.setD_amt_arr(d_amt_arr);
		dm.setD_rmtt_dt_arr(d_rmtt_dt_arr);
		dm.setD_rmtt_plac_arr(d_rmtt_plac_arr);
		dm.setD_acct_mang_no_arr(d_acct_mang_no_arr);
		dm.setD_note_no_arr(d_note_no_arr);
		dm.setD_note_clsf_cd_arr(d_note_clsf_cd_arr);
		dm.setD_bank_cd_arr(d_bank_cd_arr);
		dm.setD_issu_pers_nm_arr(d_issu_pers_nm_arr);
		dm.setD_issu_cmpy_clsf_cd_arr(d_issu_cmpy_clsf_cd_arr);
		dm.setD_comp_dt_arr(d_comp_dt_arr);
		dm.setD_mtry_dt_arr(d_mtry_dt_arr);
		dm.setD_remk_arr(d_remk_arr);
		dm.setD_slip_clsf_arr(d_slip_clsf_arr);
		dm.setD_seq_arr(d_seq_arr);
		dm.setD_subseq_arr(d_subseq_arr);
		dm.setD_dd_clos_yn_arr(d_dd_clos_yn_arr);
		dm.setC_budg_clsf_arr(c_budg_clsf_arr);
		dm.setC_basi_yymm_arr(c_basi_yymm_arr);
		dm.setC_amt_arr(c_amt_arr);
		dm.setC_remk_arr(c_remk_arr);
		dm.setC_slip_clsf_arr(c_slip_clsf_arr);
		dm.setC_seq_arr(c_seq_arr);
		dm.setC_subseq_arr(c_subseq_arr);
		dm.setC_dd_clos_yn_arr(c_dd_clos_yn_arr);

        try {
        	PL_COM_1300DAO dao = new PL_COM_1300DAO();
            ds = dao.pl_com_1320_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1300EJBHome home = (PL_COM_1300EJBHome) JNDIManager.getInstance().getHome("PL_COM_1300EJB");
//        try {
//        	PL_COM_1300EJB ejb = home.create();
//            ds = ejb.pl_com_1320_a(dm);
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
