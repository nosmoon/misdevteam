/***************************************************************************************************
 * ���ϸ� : PL_BAS_1200WB.java
 * ��� : ���ʰ���-�ŷ�ó����
 * �ۼ����� : 2009.03.04
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
import chosun.ciis.pl.bas.dao.PL_BAS_1200DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1200_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1210_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1220_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1230_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1240_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1250_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1260_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1270_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1200_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1210_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1220_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1230_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1240_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1250_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1260_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1270_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1200WB extends BaseWB {

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
    public void pl_bas_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1200_MDataSet ds = null;

        // DM Setting
        PL_BAS_1200_MDM dm = new PL_BAS_1200_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1200_m(dm);
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
    public void pl_bas_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1210_LDataSet ds = null;

        // DM Setting
        PL_BAS_1210_LDM dm = new PL_BAS_1210_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//�ŷ�ó����
		String area = Util.checkString(req.getParameter("area"));									//����
		String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));				//�ŷ�ó��

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setDlco_nm(dlco_nm);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1210_l(dm);
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
    public void pl_bas_1220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1220_LDataSet ds = null;

        // DM Setting
        PL_BAS_1220_LDM dm = new PL_BAS_1220_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//�ŷ�ó����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1220_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1220_l(dm);
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
    public void pl_bas_1230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1230_ADataSet ds = null;

        // DM Setting
        PL_BAS_1230_ADM dm = new PL_BAS_1230_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//�����ڵ�(I:���   U:����   D:����) 
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�        
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));                           //�ŷ�ó����        
		String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));               //�ŷ�ó��          
		String dlco_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_abrv_nm")));     //�ŷ�ó����      
		String comn_mang_no = Util.checkString(req.getParameter("comn_mang_no"));                   //���������ȣ      
		String rptv_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_flnm")));           //��ǥ����          
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));                         //�ŷ�ó����        
		String area = Util.checkString(req.getParameter("area"));                                   //����              
		String bkst_cnt = Util.checkString(req.getParameter("bkst_cnt"));                           //������            
		String tel_no_1 = Util.checkString(req.getParameter("tel_no_1"));                           //��ȭ��ȣ1         
		String tel_no_2 = Util.checkString(req.getParameter("tel_no_2"));                           //��ȭ��ȣ2         
		String tel_no_3 = Util.checkString(req.getParameter("tel_no_3"));                           //��ȭ��ȣ3         
		String tel_no_etc = Util.checkString(req.getParameter("tel_no_etc"));                       //��ȭ��ȣ��Ÿ      
		String ptph_no_1 = Util.checkString(req.getParameter("ptph_no_1"));                         //�޴�����ȣ1       
		String ptph_no_2 = Util.checkString(req.getParameter("ptph_no_2"));                         //�޴�����ȣ2       
		String ptph_no_3 = Util.checkString(req.getParameter("ptph_no_3"));                         //�޴�����ȣ3       
		String fax_no_1 = Util.checkString(req.getParameter("fax_no_1"));                           //�ѽ���ȣ1         
		String fax_no_2 = Util.checkString(req.getParameter("fax_no_2"));                           //�ѽ���ȣ2         
		String fax_no_3 = Util.checkString(req.getParameter("fax_no_3"));                           //�ѽ���ȣ3         
		String email = Util.checkString(req.getParameter("email"));                                 //�̸���            
		String zip_1 = Util.checkString(req.getParameter("zip_1"));                                 //�����ȣ1         
		String zip_2 = Util.checkString(req.getParameter("zip_2"));                                 //�����ȣ2         
		String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));                     //�ּ�              
		String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));           //���ּ�          
		String magz_deal_yn = Util.checkString(req.getParameter("magz_deal_yn"));                   //�������ŷ�����    
		String magz_deal_frdt = Util.checkString(req.getParameter("magz_deal_frdt"));               //�������ŷ���������
		String magz_deal_todt = Util.checkString(req.getParameter("magz_deal_todt"));               //�������ŷ���������
		String sep_book_deal_yn = Util.checkString(req.getParameter("sep_book_deal_yn"));           //���ົ�ŷ�����    
		String sep_book_deal_frdt = Util.checkString(req.getParameter("sep_book_deal_frdt"));       //���ົ�ŷ���������
		String sep_book_deal_todt = Util.checkString(req.getParameter("sep_book_deal_todt"));       //���ົ�ŷ���������
		String remk = Util.checkString(req.getParameter("remk"));                                   //���
		String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));    
		
        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setDlco_nm(dlco_nm);
		dm.setDlco_abrv_nm(dlco_abrv_nm);
		dm.setComn_mang_no(comn_mang_no);
		dm.setRptv_flnm(rptv_flnm);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setBkst_cnt(bkst_cnt);
		dm.setTel_no_1(tel_no_1);
		dm.setTel_no_2(tel_no_2);
		dm.setTel_no_3(tel_no_3);
		dm.setTel_no_etc(tel_no_etc);
		dm.setPtph_no_1(ptph_no_1);
		dm.setPtph_no_2(ptph_no_2);
		dm.setPtph_no_3(ptph_no_3);
		dm.setFax_no_1(fax_no_1);
		dm.setFax_no_2(fax_no_2);
		dm.setFax_no_3(fax_no_3);
		dm.setEmail(email);
		dm.setZip_1(zip_1);
		dm.setZip_2(zip_2);
		dm.setAddr(addr);
		dm.setDtls_addr(dtls_addr);
		dm.setMagz_deal_yn(magz_deal_yn);
		dm.setMagz_deal_frdt(magz_deal_frdt);
		dm.setMagz_deal_todt(magz_deal_todt);
		dm.setSep_book_deal_yn(sep_book_deal_yn);
		dm.setSep_book_deal_frdt(sep_book_deal_frdt);
		dm.setSep_book_deal_todt(sep_book_deal_todt);
		dm.setRemk(remk);
		dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
		
        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1230_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1230_a(dm);
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
     * ��޸�ü Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1240_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1240_ADataSet ds = null;

        // DM Setting
        PL_BAS_1240_ADM dm = new PL_BAS_1240_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
    	String updateData = Util.checkString(req.getParameter("updateData"));						//���೻��

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");													//ó������
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//�ŷ�ó�ڵ�
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//�ŷ�ó����
    	String medi_cd_arr = (String)hash.get("medi_cd");											//��ü�ڵ�
    	String deal_yn_arr = (String)hash.get("deal_yn");											//�ŷ�����
    	String no_val_exne_arr = (String)hash.get("no_val_exne");									//��������
    	String dcrate_arr = (String)hash.get("dcrate");												//����
    	String wh_cd_arr = (String)hash.get("wh_cd");												//â���ڵ�
    	String sendclsf_arr = (String)hash.get("sendclsf");											//�߼۱���
    	String remk_arr = (String)hash.get("remk");													//���
    	
        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setMedi_cd_arr(medi_cd_arr);
		dm.setDeal_yn_arr(deal_yn_arr);
		dm.setNo_val_exne_arr(no_val_exne_arr);
		dm.setDcrate_arr(dcrate_arr);
		dm.setWh_cd_arr(wh_cd_arr);
		dm.setSendclsf_arr(sendclsf_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1240_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1240_a(dm);
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
     * �߼�ó Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1250_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1250_ADataSet ds = null;

        // DM Setting
        PL_BAS_1250_ADM dm = new PL_BAS_1250_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
    	String updateData = Util.checkString(req.getParameter("updateData"));						//���೻��

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");													//ó������
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//�ŷ�ó�ڵ�    
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//�ŷ�ó����    
    	String send_plac_seq_arr = (String)hash.get("send_plac_seq");								//�߼�ó����    
    	String send_plac_nm_arr = (String)hash.get("send_plac_nm");									//�߼�ó��      
    	String magz_deal_yn_arr = (String)hash.get("magz_deal_yn");									//�������ŷ�����      
    	String sep_book_deal_yn_arr = (String)hash.get("sep_book_deal_yn");							//���ົ�ŷ�����      
    	String vexc_dlco_cd_arr = (String)hash.get("vexc_dlco_cd");									//����ŷ�ó�ڵ�
    	String tel_no_arr = (String)hash.get("tel_no");												//��ȭ��ȣ      
    	String fax_no_arr = (String)hash.get("fax_no");												//�ѽ���ȣ      
    	String zip_1_arr = (String)hash.get("zip_1");												//�����ȣ1     
    	String zip_2_arr = (String)hash.get("zip_2");												//�����ȣ2     
    	String addr_arr = (String)hash.get("addr");													//�ּ�          
    	String dtls_addr_arr = (String)hash.get("dtls_addr");										//���ּ�      
    	String remk_arr = (String)hash.get("remk");													//���

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setSend_plac_seq_arr(send_plac_seq_arr);
		dm.setSend_plac_nm_arr(send_plac_nm_arr);
		dm.setMagz_deal_yn_arr(magz_deal_yn_arr);
		dm.setSep_book_deal_yn_arr(sep_book_deal_yn_arr);
		dm.setVexc_dlco_cd_arr(vexc_dlco_cd_arr);
		dm.setTel_no_arr(tel_no_arr);
		dm.setFax_no_arr(fax_no_arr);
		dm.setZip_1_arr(zip_1_arr);
		dm.setZip_2_arr(zip_2_arr);
		dm.setAddr_arr(addr_arr);
		dm.setDtls_addr_arr(dtls_addr_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1250_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1250_a(dm);
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
     * �㺸���� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1260_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1260_ADataSet ds = null;

        // DM Setting
        PL_BAS_1260_ADM dm = new PL_BAS_1260_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
    	String updateData = Util.checkString(req.getParameter("updateData"));						//���೻��

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");													//ó������
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//�ŷ�ó�ڵ�  
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//�ŷ�ó����  
    	String colt_seq_arr = (String)hash.get("colt_seq");											//�㺸����    
    	String colt_clsf_arr = (String)hash.get("colt_clsf");										//�㺸����    
    	String setup_stat_arr = (String)hash.get("setup_stat");										//��������    
    	String colt_obj_nm_arr = (String)hash.get("colt_obj_nm");									//�㺸����    
    	String prty_rank_arr = (String)hash.get("prty_rank");										//�켱����    
    	String acqr_dt_arr = (String)hash.get("acqr_dt");											//�������    
    	String colt_setup_amt_arr = (String)hash.get("colt_setup_amt");								//�㺸������  
    	String pub_ann_amt_arr = (String)hash.get("pub_ann_amt");									//���ð���    
    	String plcw_arr = (String)hash.get("plcw");													//������      
    	String gurt_strt_dd_arr = (String)hash.get("gurt_strt_dd");									//����������  
    	String gurt_end_dd_arr = (String)hash.get("gurt_end_dd");									//����������  
    	String insr_stock_no_arr = (String)hash.get("insr_stock_no");								//�������ǹ�ȣ
    	String remk_arr = (String)hash.get("remk");													//���

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setColt_seq_arr(colt_seq_arr);
		dm.setColt_clsf_arr(colt_clsf_arr);
		dm.setSetup_stat_arr(setup_stat_arr);
		dm.setColt_obj_nm_arr(colt_obj_nm_arr);
		dm.setPrty_rank_arr(prty_rank_arr);
		dm.setAcqr_dt_arr(acqr_dt_arr);
		dm.setColt_setup_amt_arr(colt_setup_amt_arr);
		dm.setPub_ann_amt_arr(pub_ann_amt_arr);
		dm.setPlcw_arr(plcw_arr);
		dm.setGurt_strt_dd_arr(gurt_strt_dd_arr);
		dm.setGurt_end_dd_arr(gurt_end_dd_arr);
		dm.setInsr_stock_no_arr(insr_stock_no_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1260_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1260_a(dm);
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
     * ������ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1270_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1270_ADataSet ds = null;

        // DM Setting
        PL_BAS_1270_ADM dm = new PL_BAS_1270_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
    	String updateData = Util.checkString(req.getParameter("updateData"));						//���೻��

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");													//ó������
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//�ŷ�ó�ڵ�      
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//�ŷ�ó����      
    	String gurt_pers_seq_arr = (String)hash.get("gurt_pers_seq");								//�����μ���      
    	String setup_stat_arr = (String)hash.get("setup_stat");										//��������    
    	String gurt_pers_flnm_arr = (String)hash.get("gurt_pers_flnm");								//�����μ���      
    	String gurt_pers_prn_1_arr = (String)hash.get("gurt_pers_prn");								//�������ֹι�ȣ1 
    	String gurt_pers_prn_2_arr = (String)hash.get("gurt_pers_prn_2");							//�������ֹι�ȣ2 
    	String tel_no_1_arr = (String)hash.get("tel_no_1");											//��ȭ��ȣ1       
    	String tel_no_2_arr = (String)hash.get("tel_no_2");											//��ȭ��ȣ2       
    	String tel_no_3_arr = (String)hash.get("tel_no_3");											//��ȭ��ȣ3       
    	String ptph_no_1_arr = (String)hash.get("ptph_no_1");										//�޴�����ȣ1     
    	String ptph_no_2_arr = (String)hash.get("ptph_no_2");										//�޴�����ȣ2     
    	String ptph_no_3_arr = (String)hash.get("ptph_no_3");										//�޴�����ȣ3     
    	String zip_1_arr = (String)hash.get("zip_1");												//�����ȣ1       
    	String zip_2_arr = (String)hash.get("zip_2");												//�����ȣ2       
    	String addr_arr = (String)hash.get("addr");													//�ּ�            
    	String dtls_addr_arr = (String)hash.get("dtls_addr");										//���ּ�        
    	String rshp_arr = (String)hash.get("rshp");													//����            
    	String remk_arr = (String)hash.get("remk");													//���

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMode_arr(mode_arr.toUpperCase());
		dm.setDlco_cd_arr(dlco_cd_arr);
		dm.setDlco_seq_arr(dlco_seq_arr);
		dm.setGurt_pers_seq_arr(gurt_pers_seq_arr);
		dm.setSetup_stat_arr(setup_stat_arr);
		dm.setGurt_pers_flnm_arr(gurt_pers_flnm_arr);
		dm.setGurt_pers_prn_1_arr(gurt_pers_prn_1_arr);
		dm.setGurt_pers_prn_2_arr(gurt_pers_prn_2_arr);
		dm.setTel_no_1_arr(tel_no_1_arr);
		dm.setTel_no_2_arr(tel_no_2_arr);
		dm.setTel_no_3_arr(tel_no_3_arr);
		dm.setPtph_no_1_arr(ptph_no_1_arr);
		dm.setPtph_no_2_arr(ptph_no_2_arr);
		dm.setPtph_no_3_arr(ptph_no_3_arr);
		dm.setZip_1_arr(zip_1_arr);
		dm.setZip_2_arr(zip_2_arr);
		dm.setAddr_arr(addr_arr);
		dm.setDtls_addr_arr(dtls_addr_arr);
		dm.setRshp_arr(rshp_arr);
		dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1200DAO dao = new PL_BAS_1200DAO();
            ds = dao.pl_bas_1270_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }

//        PL_BAS_1200EJBHome home = (PL_BAS_1200EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1200EJB");
//        try {
//        	PL_BAS_1200EJB ejb = home.create();
//            ds = ejb.pl_bas_1270_a(dm);
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
