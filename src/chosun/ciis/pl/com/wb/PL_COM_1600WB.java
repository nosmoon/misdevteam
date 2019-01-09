/***************************************************************************************************
 * ���ϸ� : PL_COM_1600WB.java
 * ��� : �������-�����ڵ�˻��˾�
 * �ۼ����� : 2009.04.22
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
import chosun.ciis.pl.com.dao.PL_COM_1600DAO;
import chosun.ciis.pl.com.dm.PL_COM_1610_LDM;
import chosun.ciis.pl.com.dm.PL_COM_1620_SDM;
import chosun.ciis.pl.com.ds.PL_COM_1610_LDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1620_SDataSet;

/**
 * 
 */
public class PL_COM_1600WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * ��ȸ Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
	public void pl_com_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1610_LDataSet ds = null;
		PL_COM_1610_LDM dm = new PL_COM_1610_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //���������� Request�� ���� �Ķ����
		String bank_cd = Util.checkString(req.getParameter("bank_cd"));					//�����ڵ�
		String bank_nm = Util.checkString(req.getParameter("bank_nm"));					//����������

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setBank_cd(bank_cd);
		dm.setBank_nm(bank_nm);

        try {
        	PL_COM_1600DAO dao = new PL_COM_1600DAO();
            ds = dao.pl_com_1610_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			PL_COM_1600EJBHome home = (PL_COM_1600EJBHome)JNDIManager.getInstance().getHome("PL_COM_1600EJB");
//			PL_COM_1600EJB ejb = home.create();
//
//			ds = ejb.pl_com_1610_l(dm);
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
	public void pl_com_1620_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1620_SDataSet ds = null;
		PL_COM_1620_SDM dm = new PL_COM_1620_SDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //���������� Request�� ���� �Ķ����
		String bank_cd = Util.checkString(req.getParameter("bank_cd"));					//�����ڵ�

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setBank_cd(bank_cd);

        try {
        	PL_COM_1600DAO dao = new PL_COM_1600DAO();
            ds = dao.pl_com_1620_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			PL_COM_1600EJBHome home = (PL_COM_1600EJBHome)JNDIManager.getInstance().getHome("PL_COM_1600EJB");
//			PL_COM_1600EJB ejb = home.create();
//
//			ds = ejb.pl_com_1620_s(dm);
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
