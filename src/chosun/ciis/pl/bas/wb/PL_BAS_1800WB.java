/***************************************************************************************************
 * ���ϸ� : PL_BAS_1800WB.java
 * ��� : ���ʰ���-������ڵ����
 * �ۼ����� : 2009.06.22
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
import chosun.ciis.pl.bas.dao.PL_BAS_1800DAO;
import chosun.ciis.pl.bas.dm.PL_BAS_1800_MDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1810_LDM;
import chosun.ciis.pl.bas.dm.PL_BAS_1820_ADM;
import chosun.ciis.pl.bas.ds.PL_BAS_1800_MDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1810_LDataSet;
import chosun.ciis.pl.bas.ds.PL_BAS_1820_ADataSet;
import chosun.ciis.pl.base.wb.BaseWB;

/**
 * 
 */
public class PL_BAS_1800WB extends BaseWB {

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
    public void pl_bas_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1800_MDataSet ds = null;

        // DM Setting
        PL_BAS_1800_MDM dm = new PL_BAS_1800_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_BAS_1800DAO dao = new PL_BAS_1800DAO();
            ds = dao.pl_bas_1800_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1800EJBHome home = (PL_BAS_1800EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1800EJB");
//        try {
//        	PL_BAS_1800EJB ejb = home.create();
//            ds = ejb.pl_bas_1800_m(dm);
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
    public void pl_bas_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1810_LDataSet ds = null;

        // DM Setting
        PL_BAS_1810_LDM dm = new PL_BAS_1810_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String issu_cmpy = Util.checkString(req.getParameter("issu_cmpy"));							//�����
		String hndlmedi_clsf = Util.checkString(req.getParameter("hndlmedi_clsf"));					//��޸�ü����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIssu_cmpy(issu_cmpy);
		dm.setHndlmedi_clsf(hndlmedi_clsf);

        try {
        	PL_BAS_1800DAO dao = new PL_BAS_1800DAO();
            ds = dao.pl_bas_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1800EJBHome home = (PL_BAS_1800EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1800EJB");
//        try {
//        	PL_BAS_1800EJB ejb = home.create();
//            ds = ejb.pl_bas_1810_l(dm);
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
    public void pl_bas_1820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_BAS_1820_ADataSet ds = null;

        // DM Setting
        PL_BAS_1820_ADM dm = new PL_BAS_1820_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����
		String incmg_pers_ip = req.getRemoteAddr();   												//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));							//ó�������ڵ�(����:S, ����:D)
		String cd = Util.checkString(req.getParameter("cd"));										//�ڵ�(������ڵ�)
		String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));						//�ڵ��(������)
		String cd_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_abrv_nm")));			//����(��������)
		String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));							//�����ڵ�1(��޸�ü�ڵ�)
		String mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));							//�����ڵ�2(���ົ�����������)
		String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));							//�����ڵ�3(�����Ϻ��迭�翩��)
		String use_yn = Util.checkString(req.getParameter("use_yn"));								//��뿩��

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setCd(cd);
		dm.setCdnm(cdnm);
		dm.setCd_abrv_nm(cd_abrv_nm);
		dm.setMang_cd_1(mang_cd_1);
		dm.setMang_cd_2(mang_cd_2);
		dm.setMang_cd_3(mang_cd_3);
		dm.setUse_yn(use_yn);

        try {
        	PL_BAS_1800DAO dao = new PL_BAS_1800DAO();
            ds = dao.pl_bas_1820_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_BAS_1800EJBHome home = (PL_BAS_1800EJBHome) JNDIManager.getInstance().getHome("PL_BAS_1800EJB");
//        try {
//        	PL_BAS_1800EJB ejb = home.create();
//            ds = ejb.pl_bas_1820_a(dm);
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
