/***************************************************************************************************
 * ���ϸ� : PL_LST_3000WB.java
 * ��� : ��°���-��������
 * �ۼ����� : 2009.06.09
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
import chosun.ciis.pl.lst.dao.PL_LST_3000DAO;
import chosun.ciis.pl.lst.dm.PL_LST_3000_MDM;
import chosun.ciis.pl.lst.ds.PL_LST_3000_MDataSet;

/**
 * 
 */
public class PL_LST_3000WB extends BaseWB {

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
    public void pl_lst_3000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_LST_3000_MDataSet ds = null;

        // DM Setting
        PL_LST_3000_MDM dm = new PL_LST_3000_MDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);						//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);						//�����

        //DM ���� Setting�Ѵ�.
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	PL_LST_3000DAO dao = new PL_LST_3000DAO();
            ds = dao.pl_lst_3000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        PL_LST_3000EJBHome home = (PL_LST_3000EJBHome) JNDIManager.getInstance().getHome("PL_LST_3000EJB");
//        try {
//        	PL_LST_3000EJB ejb = home.create();
//            ds = ejb.pl_lst_3000_m(dm);
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
