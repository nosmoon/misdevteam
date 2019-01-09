/***************************************************************************************************
 * ���ϸ� : PL_COM_1200WB.java
 * ��� : �������-�系�Ǹ����ó��
 * �ۼ����� : 2009.04.06
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
import chosun.ciis.pl.com.dao.PL_COM_1200DAO;
import chosun.ciis.pl.com.dm.PL_COM_1210_SDM;
import chosun.ciis.pl.com.dm.PL_COM_1220_ADM;
import chosun.ciis.pl.com.ds.PL_COM_1210_SDataSet;
import chosun.ciis.pl.com.ds.PL_COM_1220_ADataSet;

/**
 * 
 */
public class PL_COM_1200WB extends BaseWB {

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
	public void pl_com_1210_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1210_SDataSet ds = null;
		PL_COM_1210_SDM dm = new PL_COM_1210_SDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //���������� Request�� ���� �Ķ����
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));				//��ü����
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));					//�ֹ�����
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));		//�ֹ��׷����

        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
		dm.setMedi_clsf(medi_clsf);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);

        try {
        	PL_COM_1200DAO dao = new PL_COM_1200DAO();
            ds = dao.pl_com_1210_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		PL_COM_1200EJBHome home = (PL_COM_1200EJBHome)JNDIManager.getInstance().getHome("PL_COM_1200EJB");
//		try {
//			PL_COM_1200EJB ejb = home.create();
//
//			ds = ejb.pl_com_1210_s(dm);
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
     * ����/���� Request �Ķ���Ͱ� Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
	public void pl_com_1220_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		PL_COM_1220_ADataSet ds = null;
		PL_COM_1220_ADM dm = new PL_COM_1220_ADM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);			//�����
		String incmg_pers_ip = req.getRemoteAddr();   									//�Է���IP                           

        //���������� Request�� ���� �Ķ����
		String acc_flag = Util.checkString(req.getParameter("acc_flag"));				//ó������
		String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));				//��ü����
		String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));					//�ֹ�����
		String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));		//�ֹ��׷����
		String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));				//���س��
		String basi_dt = Util.checkString(req.getParameter("basi_dt"));					//��������
		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));			//���

        //DM ���� Setting�Ѵ�.
		dm.setAcc_flag(acc_flag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setMedi_clsf(medi_clsf);
		dm.setOrdr_dt(ordr_dt);
		dm.setOrdr_grp_seq(ordr_grp_seq);
		dm.setBasi_yymm(basi_yymm);
		dm.setBasi_dt(basi_dt);
		dm.setRemk(remk);

        try {
        	PL_COM_1200DAO dao = new PL_COM_1200DAO();
            ds = dao.pl_com_1220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		PL_COM_1200EJBHome home = (PL_COM_1200EJBHome)JNDIManager.getInstance().getHome("PL_COM_1200EJB");
//		try {
//			PL_COM_1200EJB ejb = home.create();
//
//			ds = ejb.pl_com_1220_a(dm);
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
