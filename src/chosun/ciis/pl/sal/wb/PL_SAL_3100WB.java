/***************************************************************************************************
 * ���ϸ� : PL_SAL_3100WB.java
 * ��� : �躻����-�߼۰�꼭(�߰�)
 * �ۼ����� : 2009.04.08
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.sal.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.sal.dao.PL_SAL_3100DAO;
import chosun.ciis.pl.sal.dm.PL_SAL_3100_MDM;
import chosun.ciis.pl.sal.dm.PL_SAL_3110_LDM;
import chosun.ciis.pl.sal.ds.PL_SAL_3100_MDataSet;
import chosun.ciis.pl.sal.ds.PL_SAL_3110_LDataSet;

/**
 * 
 */
public class PL_SAL_3100WB extends BaseWB {

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
    public void pl_sal_3100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_3100_MDataSet ds = null;

        // DM Setting
        PL_SAL_3100_MDM dm = new PL_SAL_3100_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	PL_SAL_3100DAO dao = new PL_SAL_3100DAO();
            ds = dao.pl_sal_3100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_3100EJBHome home = (PL_SAL_3100EJBHome) JNDIManager.getInstance().getHome("PL_SAL_3100EJB");
//        try {
//        	PL_SAL_3100EJB ejb = home.create();
//            ds = ejb.pl_sal_3100_m(dm);
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
    public void pl_sal_3110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_SAL_3110_LDataSet ds = null;

        // DM Setting
        PL_SAL_3110_LDM dm = new PL_SAL_3110_LDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));								//���س��
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));							//��ü����
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));							//���س��
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));								//��ü�ڵ�
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));						//��ü����
		String sendclsf = Util.checkString(req.getParameter("sendclsf"));							//�߼۱���
		String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));							//�ŷ�ó����
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));								//�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));							//�ŷ�ó����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setBasi_dt(basi_dt);
		dm.setMedi_clsf(medi_clsf);
		dm.setBasi_yymm(basi_yymm);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);
		dm.setSendclsf(sendclsf);
		dm.setDlco_clsf(dlco_clsf);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);

        try {
        	PL_SAL_3100DAO dao = new PL_SAL_3100DAO();
            ds = dao.pl_sal_3110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_SAL_3100EJBHome home = (PL_SAL_3100EJBHome) JNDIManager.getInstance().getHome("PL_SAL_3100EJB");
//        try {
//        	PL_SAL_3100EJB ejb = home.create();
//            ds = ejb.pl_sal_3110_l(dm);
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
    