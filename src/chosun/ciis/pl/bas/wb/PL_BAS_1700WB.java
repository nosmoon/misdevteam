/***************************************************************************************************
 * ���ϸ� : PL_BAS_1700WB.java
 * ��� : ���ʰ���-������Ա��ذ���
 * �ۼ����� : 2009.06.15
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.bas.dao.PL_BAS_1700DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1700_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1710_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1720_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1700_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1710_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1720_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1700WB extends BaseWB {

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
    public void pl_bas_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1700_MDataSet ds = null;

        // DM Setting
        PL_BAS_1700_MDM dm = new PL_BAS_1700_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1700DAO dao = new PL_BAS_1700DAO();
            ds = dao.pl_bas_1700_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1700EJBHome home = (PL_BAS_1700EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1700EJB");
//        try {
//        	PL_BAS_1700EJB ejb = home.create();
//            ds = ejb.pl_bas_1700_m(dm);
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
    public void pl_bas_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1710_LDataSet ds = null;

        // DM Setting
        PL_BAS_1710_LDM dm = new PL_BAS_1710_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//�ŷ�ó����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setMedi_cd(medi_cd);
		dm.setDlco_clsf(dlco_clsf);

        try {
        	PL_BAS_1700DAO dao = new PL_BAS_1700DAO();
            ds = dao.pl_bas_1710_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1700EJBHome home = (PL_BAS_1700EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1700EJB");
//        try {
//        	PL_BAS_1700EJB ejb = home.create();
//            ds = ejb.pl_bas_1710_l(dm);
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
    public void pl_bas_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1720_ADataSet ds = null;

        // DM Setting
        PL_BAS_1720_ADM dm = new PL_BAS_1720_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//ó�������ڵ�(����:S, ����:D)
		String medi_cd_old = Util.checkString(req.getParameter("medi_cd_old"));						//��ü�ڵ�(��)
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//�ŷ�ó����
		String aply_bgn_yymm = Util.checkString(req.getParameter("aply_bgn_yymm"));					//������۳��
		String aply_end_yymm = Util.checkString(req.getParameter("aply_end_yymm"));					//����������
		String sale_aply_clsf = Util.checkString(req.getParameter("sale_aply_clsf"));				//�������뱸��
		String sale_rate = Util.checkString(req.getParameter("sale_rate"));							//�������
		String purc_aply_clsf = Util.checkString(req.getParameter("purc_aply_clsf"));				//�������뱸��
		String purc_rate = Util.checkString(req.getParameter("purc_rate"));							//���Կ���
		String cntr_amt = Util.checkString(req.getParameter("cntr_amt"));							//���ݾ�
		String dcrate_basi = Util.checkString(req.getParameter("dcrate_basi"));						//��������
		String dcrate_basi_rate = Util.checkString(req.getParameter("dcrate_basi_rate"));			//�������ؿ���

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_cd_old(medi_cd_old);
		dm.setMedi_cd(medi_cd);
		dm.setDlco_clsf(dlco_clsf);
		dm.setAply_bgn_yymm(aply_bgn_yymm);
		dm.setAply_end_yymm(aply_end_yymm);
		dm.setSale_aply_clsf(sale_aply_clsf);
		dm.setSale_rate(sale_rate);
		dm.setPurc_aply_clsf(purc_aply_clsf);
		dm.setPurc_rate(purc_rate);
		dm.setCntr_amt(cntr_amt);
		dm.setDcrate_basi(dcrate_basi);
		dm.setDcrate_basi_rate(dcrate_basi_rate);

        try {
        	PL_BAS_1700DAO dao = new PL_BAS_1700DAO();
            ds = dao.pl_bas_1720_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1700EJBHome home = (PL_BAS_1700EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1700EJB");
//        try {
//        	PL_BAS_1700EJB ejb = home.create();
//            ds = ejb.pl_bas_1720_a(dm);
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
