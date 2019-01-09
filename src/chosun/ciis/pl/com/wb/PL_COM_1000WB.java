/***************************************************************************************************
 * ���ϸ� : PL_COM_1000WB.java
 * ��� : �������-�ŷ�ó�˻��˾�
 * �ۼ����� : 2009.03.06
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
import chosun.ciis.pl.com.dao.PL_COM_1000DAO;
import chosun.ciis.pl.com.dm.PL_COM_1000_MDM;
import chosun.ciis.pl.com.dm.PL_COM_1010_LDM;
import chosun.ciis.pl.com.dm.PL_COM_1020_SDM;
import chosun.ciis.pl.com.ds.PL_COM_1000_MDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1010_LDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1020_SDataSet;

/**
 * 
 */
public class PL_COM_1000WB extends BaseWB {

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
    public void pl_com_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1000_MDataSet ds = null;

        // DM Setting
        PL_COM_1000_MDM dm = new PL_COM_1000_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_COM_1000DAO dao = new PL_COM_1000DAO();
            ds = dao.pl_com_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_COM_1000EJBHome home = (PL_COM_1000EJBHome) JNDIManager.getInstance().getHome("PL_COM_1000EJB");
//        try {
//        	PL_COM_1000EJB ejb = home.create();
//            ds = ejb.pl_com_1000_m(dm);
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
	public void pl_com_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1010_LDataSet ds = null;
		PL_COM_1010_LDM dm = new PL_COM_1010_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //���������� Request�� ���� �Ķ����
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));				//�ŷ�ó����
		String area = Util.checkString(req.getParameter("area"));						//����
		String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));					//�ŷ�ó��
		String prv_curr_clsf = Util.checkString(req.getParameter("prv_curr_clsf"));		//�����ӱ���

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setDlco_nm(dlco_nm);
		dm.setPrv_curr_clsf(prv_curr_clsf);

        try {
        	PL_COM_1000DAO dao = new PL_COM_1000DAO();
            ds = dao.pl_com_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		PL_COM_1000EJBHome home = (PL_COM_1000EJBHome)JNDIManager.getInstance().getHome("PL_COM_1000EJB");
//		try {
//			PL_COM_1000EJB ejb = home.create();
//
//			ds = ejb.pl_com_1010_l(dm);
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
	public void pl_com_1020_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1020_SDataSet ds = null;
		PL_COM_1020_SDM dm = new PL_COM_1020_SDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //���������� Request�� ���� �Ķ����
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));				//�ŷ�ó����
		String area = Util.checkString(req.getParameter("area"));						//����
		String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));					//�ŷ�ó��
		String prv_curr_clsf = Util.checkString(req.getParameter("prv_curr_clsf"));		//�����ӱ���

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setDlco_nm(dlco_nm);
		dm.setPrv_curr_clsf(prv_curr_clsf);

        try {
        	PL_COM_1000DAO dao = new PL_COM_1000DAO();
            ds = dao.pl_com_1020_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		PL_COM_1000EJBHome home = (PL_COM_1000EJBHome)JNDIManager.getInstance().getHome("PL_COM_1000EJB");
//		try {
//			PL_COM_1000EJB ejb = home.create();
//
//			ds = ejb.pl_com_1020_s(dm);
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
