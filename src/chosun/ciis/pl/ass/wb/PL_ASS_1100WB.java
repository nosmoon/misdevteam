/***************************************************************************************************
 * ���ϸ� : PL_ASS_1100WB.java
 * ��� : ��������-���ົ����
 * �ۼ����� : 2009.03.17
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.ass.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.ass.dao.PL_ASS_1100DAO;
import chosun.ciis.pl.ass.dm.PL_ASS_1100_MDM;
import chosun.ciis.pl.ass.dm.PL_ASS_1110_LDM;
import chosun.ciis.pl.ass.dm.PL_ASS_1120_LDM;
import chosun.ciis.pl.ass.dm.PL_ASS_1130_ADM;
import chosun.ciis.pl.ass.ds.PL_ASS_1100_MDataSet;
import chosun.ciis.pl.ass.ds.PL_ASS_1110_LDataSet;
import chosun.ciis.pl.ass.ds.PL_ASS_1120_LDataSet;
import chosun.ciis.pl.ass.ds.PL_ASS_1130_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_ASS_1100WB extends BaseWB {

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
    public void pl_ass_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1100_MDataSet ds = null;

        // DM Setting
        PL_ASS_1100_MDM dm = new PL_ASS_1100_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_ASS_1100DAO dao = new PL_ASS_1100DAO();
            ds = dao.pl_ass_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_ASS_1100EJBHome home = (PL_ASS_1100EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1100EJB");
//        try {
//        	PL_ASS_1100EJB ejb = home.create();
//            ds = ejb.pl_ass_1100_m(dm);
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
     * ������ȹ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_ass_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1110_LDataSet ds = null;

        // DM Setting
        PL_ASS_1110_LDM dm = new PL_ASS_1110_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));						//��üȣ��
		String ref_medi_cd = Util.checkString(req.getParameter("ref_medi_cd"));						//������ü�ڵ�
		String ref_medi_ser_no = Util.checkString(req.getParameter("ref_medi_ser_no"));				//������üȣ��
		String basi_bgn_yymm = Util.checkString(req.getParameter("basi_bgn_yymm"));					//���ؽ��۳��
		String basi_end_yymm = Util.checkString(req.getParameter("basi_end_yymm"));					//����������
		String prd = Util.checkString(req.getParameter("prd"));										//�Ⱓ

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setRef_medi_cd(ref_medi_cd);
		dm.setRef_medi_ser_no(ref_medi_ser_no);
		dm.setBasi_bgn_yymm(basi_bgn_yymm);
		dm.setBasi_end_yymm(basi_end_yymm);
		dm.setPrd(prd);

        try {
        	PL_ASS_1100DAO dao = new PL_ASS_1100DAO();
            ds = dao.pl_ass_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_ASS_1100EJBHome home = (PL_ASS_1100EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1100EJB");
//        try {
//        	PL_ASS_1100EJB ejb = home.create();
//            ds = ejb.pl_ass_1110_l(dm);
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
    public void pl_ass_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1120_LDataSet ds = null;

        // DM Setting
        PL_ASS_1120_LDM dm = new PL_ASS_1120_LDM();

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
        	PL_ASS_1100DAO dao = new PL_ASS_1100DAO();
            ds = dao.pl_ass_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_ASS_1100EJBHome home = (PL_ASS_1100EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1100EJB");
//        try {
//        	PL_ASS_1100EJB ejb = home.create();
//            ds = ejb.pl_ass_1120_l(dm);
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
    public void pl_ass_1130_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_ASS_1130_ADataSet ds = null;

        // DM Setting
        PL_ASS_1130_ADM dm = new PL_ASS_1130_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);							//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);							//�����
		String incmg_pers_ip = req.getRemoteAddr();   													//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.checkString(req.getParameter("acc_flag"));								//ó������
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));									//��ü�ڵ�
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));							//��üȣ��
		String ref_medi_cd = Util.checkString(req.getParameter("ref_medi_cd"));							//������ü�ڵ�
		String ref_medi_ser_no = Util.checkString(req.getParameter("ref_medi_ser_no"));					//������üȣ��
		String basi_bgn_yymm = Util.checkString(req.getParameter("basi_bgn_yymm"));						//���ؽ��۳��
		String basi_end_yymm = Util.checkString(req.getParameter("basi_end_yymm"));						//����������
		String prd = Util.checkString(req.getParameter("prd"));											//�Ⱓ
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));							//���

    	String updateData = Util.checkString(req.getParameter("updateData"));							//��������

    	Hashtable hash = getHashMultiUpdateData(updateData);											//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");														//���и�� �迭     
    	String dlco_cd_arr = (String)hash.get("dlco_cd");												//�ŷ�ó�ڵ� �迭   
    	String dlco_seq_arr = (String)hash.get("dlco_seq");												//�ŷ�ó���� �迭   
    	String send_plac_seq_arr = (String)hash.get("send_plac_seq");									//�߼�ó���� �迭   
    	String sale_clsf_arr = (String)hash.get("sale_clsf");											//���ⱸ�� �迭     
    	String sendclsf_arr = (String)hash.get("sendclsf");												//�߼۱��� �迭     
    	String sell_type_arr = (String)hash.get("sell_type");											//�Ǹ����� �迭     
    	String wh_cd_arr = (String)hash.get("wh_cd");													//â���ڵ� �迭     
    	String asin_qty_arr = (String)hash.get("asin_qty");												//�����μ� �迭     
    	String dcrate_arr = (String)hash.get("dcrate");													//���� �迭         
    	String calc_qty_arr = (String)hash.get("calc_qty");												//����μ� �迭     
    	String tot_deli_qty_arr = (String)hash.get("tot_deli_qty");										//�ѹ躻�μ� �迭   
    	String avg_deli_qty_arr = (String)hash.get("avg_deli_qty");										//��չ躻�μ� �迭 
    	String tot_sell_qty_arr = (String)hash.get("tot_sell_qty");										//���Ǹźμ� �迭   
    	String tot_rtgqty_arr = (String)hash.get("tot_rtgqty");											//�ѹ�ǰ�μ� �迭   
    	String avg_sell_qty_arr = (String)hash.get("avg_sell_qty");										//����Ǹźμ� �迭 
    	String ocpy_rate_arr = (String)hash.get("ocpy_rate");											//������ �迭       
    	String remk_arr = (String)hash.get("remk");														//��� �迭         

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setRef_medi_cd(ref_medi_cd);
		dm.setRef_medi_ser_no(ref_medi_ser_no);
		dm.setBasi_bgn_yymm(basi_bgn_yymm);
		dm.setBasi_end_yymm(basi_end_yymm);
		dm.setPrd(prd);
		dm.setRemk(remk);
        dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setSend_plac_seq_arr(send_plac_seq_arr);
		dm.setSale_clsf_arr(sale_clsf_arr);
		dm.setSendclsf_arr(sendclsf_arr);
		dm.setSell_type_arr(sell_type_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setAsin_qty_arr(asin_qty_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setCalc_qty_arr(calc_qty_arr);
		dm.setTot_deli_qty_arr(tot_deli_qty_arr);
		dm.setAvg_deli_qty_arr(avg_deli_qty_arr);
		dm.setTot_sell_qty_arr(tot_sell_qty_arr);
		dm.setTot_rtgqty_arr(tot_rtgqty_arr);
		dm.setAvg_sell_qty_arr(avg_sell_qty_arr);
		dm.setOcpy_rate_arr(ocpy_rate_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_ASS_1100DAO dao = new PL_ASS_1100DAO();
            ds = dao.pl_ass_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_ASS_1100EJBHome home = (PL_ASS_1100EJBHome) JNDIManager.getInstance().getHome("PL_ASS_1100EJB");
//        try {
//        	PL_ASS_1100EJB ejb = home.create();
//            ds = ejb.pl_ass_1130_a(dm);
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
