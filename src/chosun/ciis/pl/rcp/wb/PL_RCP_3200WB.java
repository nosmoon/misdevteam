/***************************************************************************************************
 * ���ϸ� : PL_RCP_3200WB.java
 * ��� : �Աݰ���-���꺰�Աݸ���
 * �ۼ����� : 2009.04.24
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.rcp.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.rcp.dao.PL_RCP_3200DAO;
import chosun.ciis.pl.rcp.dm.PL_RCP_3200_MDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_3210_LDM;
import chosun.ciis.pl.rcp.ds.PL_RCP_3200_MDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_3210_LDataSet;

/**
 * 
 */
public class PL_RCP_3200WB extends BaseWB {

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
    public void pl_rcp_3200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_3200_MDataSet ds = null;

        // DM Setting
        PL_RCP_3200_MDM dm = new PL_RCP_3200_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_RCP_3200DAO dao = new PL_RCP_3200DAO();
            ds = dao.pl_rcp_3200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_3200EJBHome home = (PL_RCP_3200EJBHome) JNDIManager.getInstance().getHome("PL_RCP_3200EJB");
//        try {
//        	PL_RCP_3200EJB ejb = home.create();
//            ds = ejb.pl_rcp_3200_m(dm);
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
    public void pl_rcp_3210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_3210_LDataSet ds = null;

        // DM Setting
        PL_RCP_3210_LDM dm = new PL_RCP_3210_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String fr_dt = Util.checkString(req.getParameter("fr_dt"));									//�ⰣFROM
		String to_dt = Util.checkString(req.getParameter("to_dt"));									//�ⰣTO
		String budg_clsf = Util.checkString(req.getParameter("budg_clsf"));							//���걸��
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//�ŷ�ó����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setFr_dt(fr_dt);
		dm.setTo_dt(to_dt);
		dm.setBudg_clsf(budg_clsf);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_3200DAO dao = new PL_RCP_3200DAO();
            ds = dao.pl_rcp_3210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_3200EJBHome home = (PL_RCP_3200EJBHome) JNDIManager.getInstance().getHome("PL_RCP_3200EJB");
//        try {
//        	PL_RCP_3200EJB ejb = home.create();
//            ds = ejb.pl_rcp_3210_l(dm);
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
