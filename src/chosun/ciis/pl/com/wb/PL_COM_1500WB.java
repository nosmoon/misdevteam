/***************************************************************************************************
 * ���ϸ� : PL_COM_1500WB.java
 * ��� : �������-��������
 * �ۼ����� : 2009.03.24
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
import chosun.ciis.pl.com.dao.PL_COM_1500DAO;
import chosun.ciis.pl.com.dm.PL_COM_1510_SDM;
import chosun.ciis.pl.com.ds.PL_COM_1510_SDataSet;

/**
 * 
 */
public class PL_COM_1500WB extends BaseWB {

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
    public void pl_com_1510_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        PL_COM_1510_SDataSet ds = null;

        // DM Setting
        PL_COM_1510_SDM dm = new PL_COM_1510_SDM();

        //Session���� ���� ����Ÿ
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);			//ȸ���ڵ�
        String incmg_pers = Util.getSessionParameterValue(req, "uid", true);			//�����ID

        //���������� Request�� ���� �Ķ����
        String flag = Util.checkString(req.getParameter("flag"));
        String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
        String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
        String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
        String medi_cd = Util.checkString(req.getParameter("medi_cd"));
        String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
        
        //DM ���� Setting�Ѵ�.
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setFlag(flag);
        dm.setDeal_clsf(deal_clsf);
        dm.setDlco_cd(dlco_cd);
        dm.setDlco_seq(dlco_seq);
        dm.setMedi_cd(medi_cd);
        dm.setMedi_ser_no(medi_ser_no);

        try {
        	PL_COM_1500DAO dao = new PL_COM_1500DAO();
            ds = dao.pl_com_1510_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//	      PL_COM_1500EJBHome home = (PL_COM_1500EJBHome) JNDIManager.getInstance().getHome("PL_COM_1500EJB");
//        try {
//        	PL_COM_1500EJB ejb = home.create();
//            ds = ejb.pl_com_1510_s(dm);
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
