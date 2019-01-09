/***************************************************************************************************
 * ���ϸ� : PL_SAL_1000WB.java
 * ��� : �躻����-����������ǥ�躻
 * �ۼ����� : 2009.03.18
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.sal.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.sal.dao.PL_SAL_1000DAO;
import chosun.ciis.pl.sal.dm.PL_SAL_1000_MDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1010_LDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1020_LDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1030_ADM;
import chosun.ciis.pl.sal.ds.PL_SAL_1000_MDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1010_LDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1020_LDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1030_ADataSet;

/**
 * 
 */
public class PL_SAL_1000WB extends BaseWB {

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
    public void pl_sal_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1000_MDataSet ds = null;

        // DM Setting
        PL_SAL_1000_MDM dm = new PL_SAL_1000_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_SAL_1000DAO dao = new PL_SAL_1000DAO();
            ds = dao.pl_sal_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1000EJBHome home = (PL_SAL_1000EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1000EJB");
//        try {
//        	PL_SAL_1000EJB ejb = home.create();
//            ds = ejb.pl_sal_1000_m(dm);
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
     * ������ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_sal_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1010_LDataSet ds = null;

        // DM Setting
        PL_SAL_1010_LDM dm = new PL_SAL_1010_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));						//��üȣ��

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_SAL_1000DAO dao = new PL_SAL_1000DAO();
            ds = dao.pl_sal_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1000EJBHome home = (PL_SAL_1000EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1000EJB");
//        try {
//        	PL_SAL_1000EJB ejb = home.create();
//            ds = ejb.pl_sal_1010_l(dm);
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
     * �躻��ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_sal_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1020_LDataSet ds = null;

        // DM Setting
        PL_SAL_1020_LDM dm = new PL_SAL_1020_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
        String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));				//��ü�ڵ�
        String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));		//��üȣ��

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_cd(medi_cd);
        dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_SAL_1000DAO dao = new PL_SAL_1000DAO();
            ds = dao.pl_sal_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1000EJBHome home = (PL_SAL_1000EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1000EJB");
//        try {
//        	PL_SAL_1000EJB ejb = home.create();
//            ds = ejb.pl_sal_1020_l(dm);
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
     * ���/����/���� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_sal_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1030_ADataSet ds = null;

        // DM Setting
        PL_SAL_1030_ADM dm = new PL_SAL_1030_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);							//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);							//�����
		String incmg_pers_ip = req.getRemoteAddr();   													//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));					//ó������
		String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));					//��ü�ڵ�
		String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));			//��üȣ��
		String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));				//���س��
		String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));					//��������

    	String updateData = Util.checkString(req.getParameter("updateData"));							//�躻����

    	Hashtable hash = getHashMultiUpdateData(updateData);											//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");														//���и�� �迭     
    	String dlco_clsf_arr = (String)hash.get("dlco_clsf");											//�ŷ�ó���� �迭     
    	String deal_dt_arr = (String)hash.get("deal_dt");												//�ŷ����� �迭     
    	String deal_grp_seq_arr = (String)hash.get("deal_grp_seq");										//�ŷ��׷���� �迭   
    	String deal_seq_arr = (String)hash.get("deal_seq");												//�ŷ����� �迭     
    	String dlco_cd_arr = (String)hash.get("dlco_cd");												//�ŷ�ó�ڵ� �迭   
    	String dlco_seq_arr = (String)hash.get("dlco_seq");												//�ŷ�ó���� �迭   
    	String send_plac_seq_arr = (String)hash.get("send_plac_seq");									//�߼�ó���� �迭   
    	String wh_cd_arr = (String)hash.get("wh_cd");													//â���ڵ� �迭     
    	String sell_type_arr = (String)hash.get("sell_type");											//�Ǹ����� �迭     
    	String sale_clsf_arr = (String)hash.get("sale_clsf");											//���ⱸ�� �迭     
    	String sendclsf_arr = (String)hash.get("sendclsf");												//�߼۱��� �迭   
    	String deal_uprc_arr = (String)hash.get("deal_uprc");											//�ŷ��ܰ� �迭 
    	String deal_qty_arr = (String)hash.get("deal_qty");												//�ŷ��μ� �迭   
    	String dcrate_arr = (String)hash.get("dcrate");													//���� �迭         
    	String deal_amt_arr = (String)hash.get("deal_amt");												//�ŷ��ݾ� �迭 
    	String remk_arr = (String)hash.get("remk");														//��� �迭         

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);
		dm.setMode_arr(mode_arr);
		dm.setDlco_clsf_arr(dlco_clsf_arr);
		dm.setDeal_dt_arr(deal_dt_arr);
		dm.setDeal_grp_seq_arr(deal_grp_seq_arr);
		dm.setDeal_seq_arr(deal_seq_arr);
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setSend_plac_seq_arr(send_plac_seq_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setSell_type_arr(sell_type_arr);
		dm.setSale_clsf_arr(sale_clsf_arr);
		dm.setSendclsf_arr(sendclsf_arr);
		dm.setDeal_uprc_arr(deal_uprc_arr);
		dm.setDeal_qty_arr(deal_qty_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setDeal_amt_arr(deal_amt_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_SAL_1000DAO dao = new PL_SAL_1000DAO();
            ds = dao.pl_sal_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1000EJBHome home = (PL_SAL_1000EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1000EJB");
//        try {
//        	PL_SAL_1000EJB ejb = home.create();
//            ds = ejb.pl_sal_1030_a(dm);
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