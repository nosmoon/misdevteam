/***************************************************************************************************
 * ���ϸ� : PL_RTN_1200WB.java
 * ��� : ��ǰ����-���ົ�ŷ�ó����ǰ
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
import chosun.ciis.pl.rtn.dao.PL_RTN_1200DAO;
import chosun.ciis.pl.rtn.dm.PL_RTN_1200_MDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1210_LDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1220_LDM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1230_ADM;
import chosun.ciis.pl.rtn.dm.PL_RTN_1240_LDM;
import chosun.ciis.pl.rtn.ds.PL_RTN_1200_MDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1210_LDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1220_LDataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1230_ADataSet;
import chosun.ciis.pl.rtn.ds.PL_RTN_1240_LDataSet;

/**
 * 
 */
public class PL_RTN_1200WB extends BaseWB {

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
    public void pl_rtn_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1200_MDataSet ds = null;

        // DM Setting
        PL_RTN_1200_MDM dm = new PL_RTN_1200_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_RTN_1200DAO dao = new PL_RTN_1200DAO();
            ds = dao.pl_rtn_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1200EJBHome home = (PL_RTN_1200EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1200EJB");
//        try {
//        	PL_RTN_1200EJB ejb = home.create();
//            ds = ejb.pl_rtn_1200_m(dm);
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
    public void pl_rtn_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1210_LDataSet ds = null;

        // DM Setting
        PL_RTN_1210_LDM dm = new PL_RTN_1210_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
//		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
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
        	PL_RTN_1200DAO dao = new PL_RTN_1200DAO();
            ds = dao.pl_rtn_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1200EJBHome home = (PL_RTN_1200EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1200EJB");
//        try {
//        	PL_RTN_1200EJB ejb = home.create();
//            ds = ejb.pl_rtn_1210_l(dm);
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
    public void pl_rtn_1220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1220_LDataSet ds = null;

        // DM Setting
        PL_RTN_1220_LDM dm = new PL_RTN_1220_LDM();

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
        	PL_RTN_1200DAO dao = new PL_RTN_1200DAO();
            ds = dao.pl_rtn_1220_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1200EJBHome home = (PL_RTN_1200EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1200EJB");
//        try {
//        	PL_RTN_1200EJB ejb = home.create();
//            ds = ejb.pl_rtn_1220_l(dm);
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
    public void pl_rtn_1230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1230_ADataSet ds = null;

        // DM Setting
        PL_RTN_1230_ADM dm = new PL_RTN_1230_ADM();

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
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));									//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));								//�ŷ�ó����
		String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));						//�߼�ó����
		String qty_chk = Util.checkString(req.getParameter("qty_chk"));									//�μ�üũ

    	String updateData = Util.checkString(req.getParameter("updateData"));							//�躻����

    	Hashtable hash = getHashMultiUpdateData(updateData);											//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");														//���и�� �迭     
    	String deal_seq_arr = (String)hash.get("deal_seq");												//�ŷ����� �迭     
    	String medi_cd_arr = (String)hash.get("medi_cd");												//��ü�ڵ� �迭   
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");										//��üȣ�� �迭   
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
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setSend_plac_seq(send_plac_seq);
		dm.setQty_chk(qty_chk);
		dm.setMode_arr(mode_arr);
		dm.setDeal_seq_arr(deal_seq_arr);
		dm.setMedi_cd_arr(medi_cd_arr);
		dm.setMedi_ser_no_arr(medi_ser_no_arr);
		dm.setDeal_qty_arr(deal_qty_arr);
		dm.setDeal_uprc_arr(deal_uprc_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setDeal_amt_arr(deal_amt_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_RTN_1200DAO dao = new PL_RTN_1200DAO();
            ds = dao.pl_rtn_1230_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1200EJBHome home = (PL_RTN_1200EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1200EJB");
//        try {
//        	PL_RTN_1200EJB ejb = home.create();
//            ds = ejb.pl_rtn_1230_a(dm);
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
    public void pl_rtn_1240_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RTN_1240_LDataSet ds = null;

        // DM Setting
        PL_RTN_1240_LDM dm = new PL_RTN_1240_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));							//���س��
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//�ŷ�ó����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_yymm(basi_yymm);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RTN_1200DAO dao = new PL_RTN_1200DAO();
            ds = dao.pl_rtn_1240_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RTN_1200EJBHome home = (PL_RTN_1200EJBHome) JNDIManager.getInstance().getHome("PL_RTN_1200EJB");
//        try {
//        	PL_RTN_1200EJB ejb = home.create();
//            ds = ejb.pl_rtn_1240_l(dm);
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
