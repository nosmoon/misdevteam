/***************************************************************************************************
 * ���ϸ� : PL_RCP_3400WB.java
 * ��� : �Աݰ���-�̼��϶�ǥ
 * �ۼ����� : 2009.04.27
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
import chosun.ciis.pl.rcp.dao.PL_RCP_3400DAO;
import chosun.ciis.pl.rcp.dm.PL_RCP_3400_MDM;
import chosun.ciis.pl.rcp.dm.PL_RCP_3410_LDM;
import chosun.ciis.pl.rcp.ds.PL_RCP_3400_MDataSet;
import chosun.ciis.pl.rcp.ds.PL_RCP_3410_LDataSet;

/**
 * 
 */
public class PL_RCP_3400WB extends BaseWB {

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
    public void pl_rcp_3400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_3400_MDataSet ds = null;

        // DM Setting
        PL_RCP_3400_MDM dm = new PL_RCP_3400_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_RCP_3400DAO dao = new PL_RCP_3400DAO();
            ds = dao.pl_rcp_3400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_3400EJBHome home = (PL_RCP_3400EJBHome) JNDIManager.getInstance().getHome("PL_RCP_3400EJB");
//        try {
//        	PL_RCP_3400EJB ejb = home.create();
//            ds = ejb.pl_rcp_3400_m(dm);
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
    public void pl_rcp_3410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_RCP_3410_LDataSet ds = null;

        // DM Setting
        PL_RCP_3410_LDM dm = new PL_RCP_3410_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));							//���س��
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//�ŷ�ó����
		String area = Util.checkString(req.getParameter("area"));									//����
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//�ŷ�ó����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_yymm(basi_yymm);
		dm.setMedi_clsf(medi_clsf);
		dm.setDlco_clsf(dlco_clsf);
		dm.setArea(area);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_RCP_3400DAO dao = new PL_RCP_3400DAO();
            ds = dao.pl_rcp_3410_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_RCP_3400EJBHome home = (PL_RCP_3400EJBHome) JNDIManager.getInstance().getHome("PL_RCP_3400EJB");
//        try {
//        	PL_RCP_3400EJB ejb = home.create();
//            ds = ejb.pl_rcp_3410_l(dm);
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
