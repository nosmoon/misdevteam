/***************************************************************************************************
 * ���ϸ� : PL_SAL_1400WB.java
 * ��� : �躻����-�系�Ǹ�
 * �ۼ����� : 2009.04.02
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
import chosun.ciis.pl.sal.dao.PL_SAL_1400DAO;
import chosun.ciis.pl.sal.dm.PL_SAL_1400_MDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1410_LDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1420_LDM;
import chosun.ciis.pl.sal.dm.PL_SAL_1430_ADM;
import chosun.ciis.pl.sal.ds.PL_SAL_1400_MDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1410_LDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1420_LDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_1430_ADataSet;

/**
 * 
 */
public class PL_SAL_1400WB extends BaseWB {

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
    public void pl_sal_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1400_MDataSet ds = null;

        // DM Setting
        PL_SAL_1400_MDM dm = new PL_SAL_1400_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_SAL_1400DAO dao = new PL_SAL_1400DAO();
            ds = dao.pl_sal_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1400EJBHome home = (PL_SAL_1400EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1400EJB");
//        try {
//        	PL_SAL_1400EJB ejb = home.create();
//            ds = ejb.pl_sal_1400_m(dm);
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
    public void pl_sal_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1410_LDataSet ds = null;

        // DM Setting
        PL_SAL_1410_LDM dm = new PL_SAL_1410_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
		String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));						//���س������
		String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));						//���س������
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//�ŷ�ó����
		String send_plac_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_nm")));		//�߼�ó��(����)
		String phone_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_1")));			//��ȭ��ȣ1
		String phone_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_2")));			//��ȭ��ȣ2
		String phone_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_3")));			//��ȭ��ȣ3
		String owh_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_yn")));					//�����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt_fr(basi_dt_fr);
		dm.setBasi_dt_to(basi_dt_to);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setSend_plac_nm(send_plac_nm);
		dm.setPhone_no_1(phone_no_1);
		dm.setPhone_no_2(phone_no_2);
		dm.setPhone_no_3(phone_no_3);
		dm.setOwh_yn(owh_yn);

        try {
        	PL_SAL_1400DAO dao = new PL_SAL_1400DAO();
            ds = dao.pl_sal_1410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1400EJBHome home = (PL_SAL_1400EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1400EJB");
//        try {
//        	PL_SAL_1400EJB ejb = home.create();
//            ds = ejb.pl_sal_1410_l(dm);
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
    public void pl_sal_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1420_LDataSet ds = null;

        // DM Setting
        PL_SAL_1420_LDM dm = new PL_SAL_1420_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));								//�ֹ�����
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));					//�ֹ��׷����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);

        try {
        	PL_SAL_1400DAO dao = new PL_SAL_1400DAO();
            ds = dao.pl_sal_1420_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1400EJBHome home = (PL_SAL_1400EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1400EJB");
//        try {
//        	PL_SAL_1400EJB ejb = home.create();
//            ds = ejb.pl_sal_1420_l(dm);
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
    public void pl_sal_1430_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_1430_ADataSet ds = null;

        // DM Setting
        PL_SAL_1430_ADM dm = new PL_SAL_1430_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);							//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);							//�����
		String incmg_pers_ip = req.getRemoteAddr();   													//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));					//ó������
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));								//��ü����
		String deal_dt = Util.checkString(req.getParameter("deal_dt"));									//�ŷ�����
		String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));						//�ŷ��׷����
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));									//��������
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));									//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));								//�ŷ�ó����
		String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));						//�߼�ó����
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));									//�ֹ�����
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));                       //�ֹ��׷����
		String send_plac_nm = Util.checkString(req.getParameter("send_plac_nm"));                       //�߼�ó��(����)
		String send_plac_tel_no_1 = Util.checkString(req.getParameter("send_plac_tel_no_1"));           //��ȭ��ȣ1
		String send_plac_tel_no_2 = Util.checkString(req.getParameter("send_plac_tel_no_2"));           //��ȭ��ȣ2
		String send_plac_tel_no_3 = Util.checkString(req.getParameter("send_plac_tel_no_3"));           //��ȭ��ȣ3
		String send_plac_ptph_no_1 = Util.checkString(req.getParameter("send_plac_ptph_no_1"));         //�޴�����ȣ1
		String send_plac_ptph_no_2 = Util.checkString(req.getParameter("send_plac_ptph_no_2"));         //�޴�����ȣ2
		String send_plac_ptph_no_3 = Util.checkString(req.getParameter("send_plac_ptph_no_3"));         //�޴�����ȣ3
		String send_plac_fax_no_1 = Util.checkString(req.getParameter("send_plac_fax_no_1"));           //�ѽ���ȣ1
		String send_plac_fax_no_2 = Util.checkString(req.getParameter("send_plac_fax_no_2"));           //�ѽ���ȣ2
		String send_plac_fax_no_3 = Util.checkString(req.getParameter("send_plac_fax_no_3"));           //�ѽ���ȣ3
		String send_plac_zip_1 = Util.checkString(req.getParameter("send_plac_zip_1"));                 //�����ȣ1
		String send_plac_zip_2 = Util.checkString(req.getParameter("send_plac_zip_2"));                 //�����ȣ2
		String send_plac_addr = Util.checkString(req.getParameter("send_plac_addr"));                   //�ּ�
		String send_plac_dtls_addr = Util.checkString(req.getParameter("send_plac_dtls_addr"));         //���ּ�
		String remk = Util.checkString(req.getParameter("remk"));										//���

    	String updateData = Util.checkString(req.getParameter("updateData"));							//�躻����

    	Hashtable hash = getHashMultiUpdateData(updateData);											//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");														//���и�� �迭     
    	String ordr_seq_arr = (String)hash.get("ordr_seq");												//�ֹ����� �迭     
    	String deal_seq_arr = (String)hash.get("deal_seq");												//�ŷ����� �迭     
    	String medi_cd_arr = (String)hash.get("medi_cd");												//��ü�ڵ� �迭   
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");										//��üȣ�� �迭   
    	String deal_qty_arr = (String)hash.get("deal_qty");												//�ŷ��μ� �迭   
    	String deal_uprc_arr = (String)hash.get("deal_uprc");											//�ŷ��ܰ� �迭 
    	String dcrate_arr = (String)hash.get("dcrate");													//���� �迭         
    	String deal_amt_arr = (String)hash.get("deal_amt");												//�ŷ��ݾ� �迭 
    	String sale_clsf_arr = (String)hash.get("sale_clsf");											//���ⱸ�� �迭     
    	String sendclsf_arr = (String)hash.get("sendclsf");												//�߼۱��� �迭   
    	String wh_cd_arr = (String)hash.get("wh_cd");													//â���ڵ� �迭     
    	String sell_type_arr = (String)hash.get("sell_type");											//�Ǹ����� �迭     

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);
		dm.setDeal_dt(deal_dt);
		dm.setDeal_grp_seq(deal_grp_seq);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_dt(basi_dt);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setSend_plac_seq(send_plac_seq);
		dm.setSend_plac_nm(send_plac_nm);
		dm.setSend_plac_tel_no_1(send_plac_tel_no_1);
		dm.setSend_plac_tel_no_2(send_plac_tel_no_2);
		dm.setSend_plac_tel_no_3(send_plac_tel_no_3);
		dm.setSend_plac_ptph_no_1(send_plac_ptph_no_1);
		dm.setSend_plac_ptph_no_2(send_plac_ptph_no_2);
		dm.setSend_plac_ptph_no_3(send_plac_ptph_no_3);
		dm.setSend_plac_fax_no_1(send_plac_fax_no_1);
		dm.setSend_plac_fax_no_2(send_plac_fax_no_2);
		dm.setSend_plac_fax_no_3(send_plac_fax_no_3);
		dm.setSend_plac_zip_1(send_plac_zip_1);
		dm.setSend_plac_zip_2(send_plac_zip_2);
		dm.setSend_plac_addr(send_plac_addr);
		dm.setSend_plac_dtls_addr(send_plac_dtls_addr);
		dm.setRemk(remk);
		dm.setMode_arr(mode_arr);
		dm.setOrdr_seq_arr(ordr_seq_arr);
		dm.setDeal_seq_arr(deal_seq_arr);
		dm.setMedi_cd_arr(medi_cd_arr);
		dm.setMedi_ser_no_arr(medi_ser_no_arr);
		dm.setDeal_qty_arr(deal_qty_arr);
		dm.setDeal_uprc_arr(deal_uprc_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setDeal_amt_arr(deal_amt_arr);
		dm.setSale_clsf_arr(sale_clsf_arr);
		dm.setSendclsf_arr(sendclsf_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setSell_type_arr(sell_type_arr);

        try {
        	PL_SAL_1400DAO dao = new PL_SAL_1400DAO();
            ds = dao.pl_sal_1430_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_1400EJBHome home = (PL_SAL_1400EJBHome) JNDIManager.getInstance().getHome("PL_SAL_1400EJB");
//        try {
//        	PL_SAL_1400EJB ejb = home.create();
//            ds = ejb.pl_sal_1430_a(dm);
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
