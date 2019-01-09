/***************************************************************************************************
 * ���ϸ� : PL_LST_1000WB.java
 * ��� : ��°���-�ŷ�����
 * �ۼ����� : 2009.05.25
 * �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.lst.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.pl.base.wb.BaseWB;
import chosun.ciis.pl.lst.dao.PL_LST_1000DAO;
import chosun.ciis.pl.lst.dm.PL_LST_1000_MDM;
import chosun.ciis.pl.lst.dm.PL_LST_1710_PDM;
import chosun.ciis.pl.lst.ds.PL_LST_1000_MDataSet;
import chosun.ciis.pl.lst.ds.PL_LST_1710_PDataSet;

/**
 * 
 */
public class PL_LST_1000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";

    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * �ʱ� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_lst_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_LST_1000_MDataSet ds = null;

        // DM Setting
        PL_LST_1000_MDM dm = new PL_LST_1000_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	PL_LST_1000DAO dao = new PL_LST_1000DAO();
            ds = dao.pl_lst_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_LST_1000EJBHome home = (PL_LST_1000EJBHome) JNDIManager.getInstance().getHome("PL_LST_1000EJB");
//        try {
//        	PL_LST_1000EJB ejb = home.create();
//            ds = ejb.pl_lst_1000_m(dm);
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
     * ����� UPLOAD�� ���� DOWNLOAD Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void pl_lst_1710_p(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_LST_1710_PDataSet ds = null;

        // DM Setting
        PL_LST_1710_PDM dm = new PL_LST_1710_PDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //���������� Request�� ���� �Ķ����
		String fr_dt = Util.checkString(req.getParameter("fr_dt"));									//�ŷ���������
		String to_dt = Util.checkString(req.getParameter("to_dt"));                                 //�ŷ���������
		String kyobo_yn = Util.checkString(req.getParameter("kyobo_yn"));                           //��������
		String wh_cd = Util.checkString(req.getParameter("wh_cd"));                                 //â���ڵ�
		String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));                         //�ŷ�����
		String issu_cmpy = Util.checkString(req.getParameter("issu_cmpy"));                         //�����
		String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));                             //�ŷ�ó�ڵ�
		String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));                           //�ŷ�ó����
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));                             //��ü�ڵ�
		String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));                     //��üȣ��

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setFr_dt(fr_dt);
		dm.setTo_dt(to_dt);
		dm.setKyobo_yn(kyobo_yn);
		dm.setWh_cd(wh_cd);
		dm.setDeal_clsf(deal_clsf);
		dm.setIssu_cmpy(issu_cmpy);
		dm.setDlco_cd(dlco_cd);
		dm.setDlco_seq(dlco_seq);
		dm.setMedi_cd(medi_cd);
		dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_LST_1000DAO dao = new PL_LST_1000DAO();
            ds = dao.pl_lst_1710_p(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_LST_1000EJBHome home = (PL_LST_1000EJBHome) JNDIManager.getInstance().getHome("PL_LST_1000EJB");
//        try {
//        	PL_LST_1000EJB ejb = home.create();
//            ds = ejb.pl_lst_1710_p(dm);
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
