/***************************************************************************************************
 * ���ϸ� : PL_RTN_1100WB.java
 * ��� : ��ǰ����-��������ü����ǰ
 * �ۼ����� : 2009.03.31
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.rtn.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.rtn.dao.PL_RTN_1100DAO;
import chosun.ciis.pl.rtn.dm.PL_RTN_1100_MDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1110_LDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1120_LDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1130_ADM;
import chosun.ciis.pl.rtn.ds.PL_RTN_1100_MDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1110_LDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1120_LDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1130_ADataSet;

/**
 * 
 */
public class PL_RTN_1100WB extends BaseWB {

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
    public void pl_rtn_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1100_MDataSet ds = null;

        // DM Setting
        PL_RTN_1100_MDM dm = new PL_RTN_1100_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_RTN_1100DAO dao = new PL_RTN_1100DAO();
            ds = dao.pl_rtn_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1100EJBHome home = (PL_RTN_1100EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1100EJB");
//        try {
//        	PL_RTN_1100EJB ejb = home.create();
//            ds = ejb.pl_rtn_1100_m(dm);
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
    public void pl_rtn_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1110_LDataSet ds = null;

        // DM Setting
        PL_RTN_1110_LDM dm = new PL_RTN_1110_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
//		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//���س������
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//���س������
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));						//��üȣ��

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_RTN_1100DAO dao = new PL_RTN_1100DAO();
            ds = dao.pl_rtn_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1100EJBHome home = (PL_RTN_1100EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1100EJB");
//        try {
//        	PL_RTN_1100EJB ejb = home.create();
//            ds = ejb.pl_rtn_1110_l(dm);
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
    public void pl_rtn_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1120_LDataSet ds = null;

        // DM Setting
        PL_RTN_1120_LDM dm = new PL_RTN_1120_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String deal_dt = Util.checkString(req.getParameter("deal_dt"));								//�ŷ�����
		String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));					//�ŷ��׷����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDeal_dt(deal_dt);
		dm.setDeal_grp_seq(deal_grp_seq);

        try {
        	PL_RTN_1100DAO dao = new PL_RTN_1100DAO();
            ds = dao.pl_rtn_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1100EJBHome home = (PL_RTN_1100EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1100EJB");
//        try {
//        	PL_RTN_1100EJB ejb = home.create();
//            ds = ejb.pl_rtn_1120_l(dm);
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
    public void pl_rtn_1130_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1130_ADataSet ds = null;

        // DM Setting
        PL_RTN_1130_ADM dm = new PL_RTN_1130_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);							//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);							//�����
		String incmg_pers_ip = req.getRemoteAddr();   													//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));					//ó������
		String deal_dt = Util.checkString(req.getParameter("deal_dt"));									//�ŷ�����
		String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));						//�ŷ��׷����
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));								//���س��
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));									//��������
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));									//��ü�ڵ�
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));							//��üȣ��
		String qty_chk = Util.checkString(req.getParameter("qty_chk"));									//�μ�üũ

    	String updateData = Util.checkString(req.getParameter("updateData"));							//�躻����

    	Hashtable hash = getHashMultiUpdateData(updateData);											//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");														//���и�� �迭     
    	String deal_seq_arr = (String)hash.get("deal_seq");												//�ŷ����� �迭     
    	String dlco_cd_arr = (String)hash.get("dlco_cd");												//�ŷ�ó�ڵ� �迭   
    	String dlco_seq_arr = (String)hash.get("dlco_seq");												//�ŷ�ó���� �迭   
    	String deal_qty_arr = (String)hash.get("deal_qty");												//�ŷ��μ� �迭   
    	String deal_uprc_arr = (String)hash.get("deal_uprc");											//�ŷ��ܰ� �迭 
    	String dcrate_arr = (String)hash.get("dcrate");													//���� �迭         
    	String deal_amt_arr = (String)hash.get("deal_amt");												//�ŷ��ݾ� �迭 
    	String wh_cd_arr = (String)hash.get("wh_cd");													//â���ڵ� �迭     
    	String remk_arr = (String)hash.get("remk");														//��� �迭         

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setDeal_dt(deal_dt);
		dm.setDeal_grp_seq(deal_grp_seq);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setQty_chk(qty_chk);
		dm.setMode_arr(mode_arr);
		dm.setDeal_seq_arr(deal_seq_arr);
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setDeal_qty_arr(deal_qty_arr);
		dm.setDeal_uprc_arr(deal_uprc_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setDeal_amt_arr(deal_amt_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_RTN_1100DAO dao = new PL_RTN_1100DAO();
            ds = dao.pl_rtn_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1100EJBHome home = (PL_RTN_1100EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1100EJB");
//        try {
//        	PL_RTN_1100EJB ejb = home.create();
//            ds = ejb.pl_rtn_1130_a(dm);
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
