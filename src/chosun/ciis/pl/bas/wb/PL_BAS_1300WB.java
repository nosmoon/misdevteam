/***************************************************************************************************
 * ���ϸ� : PL_BAS_1300WB.java
 * ��� : ���ʰ���-�ŷ�ó��޸�ü����
 * �ۼ����� : 2009.02.27
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
import chosun.ciis.pl.bas.dao.PL_BAS_1300DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1300_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1310_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1320_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1330_ADM;
import chosun.ciis.pl.bas.dm.PL_BAS_1340_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1300_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1310_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1320_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1330_ADataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1340_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1300WB extends BaseWB {

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
    public void pl_bas_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1300_MDataSet ds = null;

        // DM Setting
        PL_BAS_1300_MDM dm = new PL_BAS_1300_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1300EJBHome home = (PL_BAS_1300EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1300EJB");
//        try {
//        	PL_BAS_1300EJB ejb = home.create();
//            ds = ejb.pl_bas_1300_m(dm);
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
    public void pl_bas_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1310_LDataSet ds = null;

        // DM Setting
        PL_BAS_1310_LDM dm = new PL_BAS_1310_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
        String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));			//��ü����
        String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));			//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_clsf(medi_clsf);
        dm.setIssu_cmpy(issu_cmpy);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1300EJBHome home = (PL_BAS_1300EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1300EJB");
//        try {
//        	PL_BAS_1300EJB ejb = home.create();
//            ds = ejb.pl_bas_1310_l(dm);
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
    public void pl_bas_1320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1320_LDataSet ds = null;

        // DM Setting
        PL_BAS_1320_LDM dm = new PL_BAS_1320_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
        String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));			//��ü����
        String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));				//��ü�ڵ�
        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setMedi_clsf(medi_clsf);
        dm.setMedi_cd(medi_cd);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1320_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1300EJBHome home = (PL_BAS_1300EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1300EJB");
//        try {
//        	PL_BAS_1300EJB ejb = home.create();
//            ds = ejb.pl_bas_1320_l(dm);
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
     * ���� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1330_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1330_ADataSet ds = null;

        // DM Setting
        PL_BAS_1330_ADM dm = new PL_BAS_1330_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
    	String updateData = Util.checkString(req.getParameter("updateData"));						//�ŷ�ó��޸�ü����

    	Hashtable hash = getHashMultiUpdateData(updateData);										//��Ƽ�����ͺи�

    	String medi_cd_arr = (String)hash.get("medi_cd");											//��ü�ڵ�
    	String dlco_cd_arr = (String)hash.get("dlco_cd");											//�ŷ�ó�ڵ�
    	String dlco_seq_arr = (String)hash.get("dlco_seq");											//�ŷ�ó����
    	String deal_yn_arr = (String)hash.get("deal_yn");											//�ŷ�����
    	String no_val_exne_arr = (String)hash.get("no_val_exne");									//��������
    	String dcrate_arr = (String)hash.get("dcrate");												//����
    	String wh_cd_arr = (String)hash.get("wh_cd");												//â���ڵ�
    	String sendclsf_arr = (String)hash.get("sendclsf");											//�߼۱���
    	String remk_arr = (String)hash.get("remk");													//���

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setMedi_cd_arr(medi_cd_arr);
        dm.setDlco_cd_arr(dlco_cd_arr);
        dm.setDlco_seq_arr(dlco_seq_arr);
        dm.setDeal_yn_arr(deal_yn_arr);
        dm.setNo_val_exne_arr(no_val_exne_arr);
        dm.setDcrate_arr(dcrate_arr);
        dm.setWh_cd_arr(wh_cd_arr);
        dm.setSendclsf_arr(sendclsf_arr);
        dm.setRemk_arr(remk_arr);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1330_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1300EJBHome home = (PL_BAS_1300EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1300EJB");
//        try {
//        	PL_BAS_1300EJB ejb = home.create();
//            ds = ejb.pl_bas_1330_a(dm);
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
     * ���� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_bas_1340_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1340_ADataSet ds = null;

        // DM Setting
        PL_BAS_1340_ADM dm = new PL_BAS_1340_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
    	String basi_medi = Util.checkString(req.getParameter("basi_medi"));							//���ظ�ü
    	String targ_medi = Util.checkString(req.getParameter("targ_medi"));							//����ü

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setBasi_medi(basi_medi);
        dm.setTarg_medi(targ_medi);

        try {
        	PL_BAS_1300DAO dao = new PL_BAS_1300DAO();
            ds = dao.pl_bas_1340_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
}
