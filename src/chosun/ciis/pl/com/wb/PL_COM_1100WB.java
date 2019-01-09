/***************************************************************************************************
 * ���ϸ� : PL_COM_1100WB.java
 * ��� : �������-��ü�˻��˾�
 * �ۼ����� : 2009.02.17
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.com.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.com.dao.PL_COM_1100DAO;
import chosun.ciis.pl.com.dm.PL_COM_1100_MDM;
import chosun.ciis.pl.com.dm.PL_COM_1110_LDM;
import chosun.ciis.pl.com.dm.PL_COM_1120_SDM;
import chosun.ciis.pl.com.ds.PL_COM_1100_MDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1110_LDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1120_SDataSet;

/**
 * 
 */
public class PL_COM_1100WB extends BaseWB {

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
    public void pl_com_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1100_MDataSet ds = null;

        // DM Setting
        PL_COM_1100_MDM dm = new PL_COM_1100_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_COM_1100DAO dao = new PL_COM_1100DAO();
            ds = dao.pl_com_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1100EJBHome home = (PL_COM_1100EJBHome) JNDIManager.getInstance().getHome("PL_COM_1100EJB");
//        try {
//        	PL_COM_1100EJB ejb = home.create();
//            ds = ejb.pl_com_1100_m(dm);
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
	public void pl_com_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1110_LDataSet ds = null;
		PL_COM_1110_LDM dm = new PL_COM_1110_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //���������� Request�� ���� �Ķ����
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));				//��ü����
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));					//��ü�ڵ�
		String medi_nm = Util.checkString(req.getParameter("medi_nm"));					//��ü��
		String absence_clsf = Util.checkString(req.getParameter("absence_clsf"));		//���Ǳ���

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_nm(medi_nm);
		dm.setAbsence_clsf(absence_clsf);

        try {
        	PL_COM_1100DAO dao = new PL_COM_1100DAO();
            ds = dao.pl_com_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			PL_COM_1100EJBHome home = (PL_COM_1100EJBHome)JNDIManager.getInstance().getHome("PL_COM_1100EJB");
//			PL_COM_1100EJB ejb = home.create();
//
//			ds = ejb.pl_com_1110_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}
    
    /**
     * 1����ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
	public void pl_com_1120_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1120_SDataSet ds = null;
		PL_COM_1120_SDM dm = new PL_COM_1120_SDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //���������� Request�� ���� �Ķ����
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));				//��ü����
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));					//��ü�ڵ�
		String medi_nm = Util.checkString(req.getParameter("medi_nm"));					//��ü��
		String absence_clsf = Util.checkString(req.getParameter("absence_clsf"));		//���Ǳ���

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_nm(medi_nm);
		dm.setAbsence_clsf(absence_clsf);

        try {
        	PL_COM_1100DAO dao = new PL_COM_1100DAO();
            ds = dao.pl_com_1120_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			PL_COM_1100EJBHome home = (PL_COM_1100EJBHome)JNDIManager.getInstance().getHome("PL_COM_1100EJB");
//			PL_COM_1100EJB ejb = home.create();
//
//			ds = ejb.pl_com_1120_s(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
	}
    
}
