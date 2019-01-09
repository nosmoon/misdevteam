/***************************************************************************************************
 * ���ϸ� : PL_BAS_1000WB.java
 * ��� : ���ʰ���-��������ü����
 * �ۼ����� : 2009.02.16
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
import chosun.ciis.pl.bas.dao.PL_BAS_1000DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1000_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1010_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1020_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1030_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1040_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1050_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1060_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1000_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1010_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1020_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1030_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1040_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1050_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1060_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1000WB extends BaseWB {

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
    public void pl_bas_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1000_MDataSet ds = null;

        // DM Setting
        PL_BAS_1000_MDM dm = new PL_BAS_1000_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
        String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));			//��ü����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_clsf(medi_clsf);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1000_m(dm);
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
    public void pl_bas_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1010_LDataSet ds = null;

        // DM Setting
        PL_BAS_1010_LDM dm = new PL_BAS_1010_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
        String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));			//��ü����
        String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));			//�����
        String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));				//��ü�ڵ�
        String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));				//��ü��

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_clsf(medi_clsf);
        dm.setIssu_cmpy(issu_cmpy);
        dm.setMedi_cd(medi_cd);
        dm.setMedi_nm(medi_nm);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1010_l(dm);
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
    public void pl_bas_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1020_LDataSet ds = null;

        // DM Setting
        PL_BAS_1020_LDM dm = new PL_BAS_1020_LDM();

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
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1020_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1020_l(dm);
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
    public void pl_bas_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1030_ADataSet ds = null;

        // DM Setting
        PL_BAS_1030_ADM dm = new PL_BAS_1030_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String work_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("work_flag")));			//�����ڵ�(I:���   U:����   D:����) 
		String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));           	//��ü�ڵ�                           
		String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));       //��üȣ��                           
		String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));               //��ü��                             
		String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));           //�����                             
		String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));           //��ü����                           
		String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));           //���س��                           
		String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));                 //�������                           
		String issu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_clsf")));           //���౸��                           
		String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));                		//�ܰ�                               
		String dcrate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate")));         		//����                               
		String cont_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("cont_clas")));           //����з�                           
		String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));                 //����                               
		String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));                     //����                               
		String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));                       //�԰�                               
		String page = Util.Uni2Ksc(Util.checkString(req.getParameter("page")));                     //�ʼ�                               
		String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));                     //����                               
		String unit_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("unit_wgt")));     		//�����߷�                           
		String absence_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("absence_clsf")));     //���Ǳ���                           
		String absence_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("absence_dt")));         //��������                           
		String cover_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("cover_modl")));         //ǥ����                           
		String seri_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seri_cd")));               //�ø����ڵ�                         
		String seri_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("seri_nm")));               //�ø����                           
		String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));                     //����                               
		String vexc_medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_medi_ser_no")));     //�����üȣ��                       
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));                     //���                               

        //DM ���� Setting�Ѵ�.
		dm.setWork_flag(work_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setMedi_nm(medi_nm);
		dm.setIssu_cmpy(issu_cmpy);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_yymm(basi_yymm);
		dm.setReg_dt(reg_dt);
		dm.setIssu_clsf(issu_clsf);
		dm.setUprc(uprc);
		dm.setDcrate(dcrate);
		dm.setCont_clas(cont_clas);
		dm.setAuthor(author);
		dm.setType(type);
		dm.setStd(std);
		dm.setPage(page);
		dm.setUnit(unit);
		dm.setUnit_wgt(unit_wgt);
		dm.setAbsence_clsf(absence_clsf);
		dm.setAbsence_dt(absence_dt);
		dm.setCover_modl(cover_modl);
		dm.setSeri_cd(seri_cd);
		dm.setSeri_nm(seri_nm);
		dm.setCont(cont);
		dm.setVexc_medi_ser_no(vexc_medi_ser_no);
		dm.setRemk(remk);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1030_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1030_a(dm);
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
     * ���೻�� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1040_ADataSet ds = null;

        // DM Setting
        PL_BAS_1040_ADM dm = new PL_BAS_1040_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
    	String updateData = Util.checkString(req.getParameter("updateData"));						//���೻��

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");													//ó������
    	String medi_cd_arr = (String)hash.get("medi_cd");											//��ü�ڵ�
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");									//��üȣ��
    	String issu_seq_arr = (String)hash.get("issu_seq");											//�������
    	String ecnt_arr = (String)hash.get("ecnt");													//�Ǽ�
    	String issu_dt_arr = (String)hash.get("issu_dt");											//��������
    	String issu_qty_arr = (String)hash.get("issu_qty");											//����μ�
    	String remk_arr = (String)hash.get("remk");													//���
    	
        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setAcc_flag(acc_flag);
        dm.setMode_arr(mode_arr.toUpperCase());
        dm.setMedi_cd_arr(medi_cd_arr);
        dm.setMedi_ser_no_arr(medi_ser_no_arr);
        dm.setIssu_seq_arr(issu_seq_arr);
        dm.setEcnt_arr(ecnt_arr);
        dm.setIssu_dt_arr(issu_dt_arr);
        dm.setIssu_qty_arr(issu_qty_arr);
        dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1040_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1040_a(dm);
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
     * �Ǽ����� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1050_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1050_ADataSet ds = null;

        // DM Setting
        PL_BAS_1050_ADM dm = new PL_BAS_1050_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
    	String updateData = Util.checkString(req.getParameter("updateData"));						//���೻��

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");													//ó������
    	String medi_cd_arr = (String)hash.get("medi_cd");											//��ü�ڵ�
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");									//��üȣ��
    	String ecnt_seq_arr = (String)hash.get("ecnt_seq");											//�Ǽ�����
    	String ecnt_arr = (String)hash.get("ecnt");													//�Ǽ�
    	String issu_dt_arr = (String)hash.get("issu_dt");											//��������
    	String ewh_dt_arr = (String)hash.get("ewh_dt");												//�԰�����
    	String ewh_clsf_arr = (String)hash.get("ewh_clsf");											//�԰���
    	String ewh_qty_arr = (String)hash.get("ewh_qty");											//�԰�μ�
    	String wh_cd_arr = (String)hash.get("wh_cd");												//â���ڵ�
    	String remk_arr = (String)hash.get("remk");													//���

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setAcc_flag(acc_flag);
        dm.setMode_arr(mode_arr.toUpperCase());
        dm.setMedi_cd_arr(medi_cd_arr);
        dm.setMedi_ser_no_arr(medi_ser_no_arr);
        dm.setEcnt_seq_arr(ecnt_seq_arr);
        dm.setEcnt_arr(ecnt_arr);
        dm.setIssu_dt_arr(issu_dt_arr);
        dm.setEwh_dt_arr(ewh_dt_arr);
        dm.setEwh_clsf_arr(ewh_clsf_arr);
        dm.setEwh_qty_arr(ewh_qty_arr);
        dm.setWh_cd_arr(wh_cd_arr);
        dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1050_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1050_a(dm);
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
     * �ηϳ��� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1060_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1060_ADataSet ds = null;

        // DM Setting
        PL_BAS_1060_ADM dm = new PL_BAS_1060_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
        String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));				//ó������
    	String updateData = Util.checkString(req.getParameter("updateData"));						//���೻��

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String mode_arr = (String)hash.get("m");													//ó������
    	String medi_cd_arr = (String)hash.get("medi_cd");											//��ü�ڵ�
    	String medi_ser_no_arr = (String)hash.get("medi_ser_no");									//��üȣ��
    	String appndx_seq_arr = (String)hash.get("appndx_seq");										//�ηϼ���
    	String reg_dt_arr = (String)hash.get("reg_dt");												//�������
    	String appndx_nm_arr = (String)hash.get("appndx_nm");										//�ηϸ�
    	String appndx_qty_arr = (String)hash.get("appndx_qty");										//�ηϺμ�
    	String wgt_arr = (String)hash.get("wgt");													//�߷�
    	String remk_arr = (String)hash.get("remk");													//���

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setAcc_flag(acc_flag);
        dm.setMode_arr(mode_arr.toUpperCase());
        dm.setMedi_cd_arr(medi_cd_arr);
        dm.setMedi_ser_no_arr(medi_ser_no_arr);
        dm.setAppndx_seq_arr(appndx_seq_arr);
        dm.setReg_dt_arr(reg_dt_arr);
        dm.setAppndx_nm_arr(appndx_nm_arr);
        dm.setAppndx_qty_arr(appndx_qty_arr);
        dm.setWgt_arr(wgt_arr);
        dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1000DAO dao = new PL_BAS_1000DAO();
            ds = dao.pl_bas_1060_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1000EJBHome home = (PL_BAS_1000EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1000EJB");
//        try {
//        	PL_BAS_1000EJB ejb = home.create();
//            ds = ejb.pl_bas_1060_a(dm);
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
