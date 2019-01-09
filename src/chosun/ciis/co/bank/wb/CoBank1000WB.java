/***************************************************************************************************
* ���ϸ�   : CoBank1000WB.java
* ���     : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
*            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
* �ۼ����� : 
* �ۼ���   : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/

package chosun.ciis.co.bank.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;

//import javax.ejb.CreateException;
//import javax.ejb.EJBException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.bank.dao.CoBank1000DAO;
import chosun.ciis.co.bank.dm.CO_BANK_1000_MDM;
import chosun.ciis.co.bank.dm.CO_BANK_1010_LDM;
import chosun.ciis.co.bank.ds.CO_BANK_1000_MDataSet;
import chosun.ciis.co.bank.ds.CO_BANK_1010_LDataSet;
//import chosun.ciis.co.bank.ejb.CoBank1000EJB;
//import chosun.ciis.co.bank.ejb.CoBank1000EJBHome;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * �������-�������� Ȯ��ó������ WorkBean
 */

public class CoBank1000WB extends BaseWB {


    /**
     * �������� ����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_bank_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {    	

        //����� ��������
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sys_clsf	  = Util.checkString(req.getParameter("sys_clsf"));
        
        // DM Setting
    	CO_BANK_1000_MDM dm = new CO_BANK_1000_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    	dm.setSys_clsf(sys_clsf);
        
    	/*
        CoBank1000EJBHome home = (CoBank1000EJBHome) JNDIManager.getInstance().getHome("CoBank1000EJB");
        
        try {
       	    CoBank1000EJB ejb = home.create();
            ds = ejb.co_bank_1000_m(dm);	// ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);	// request�� ������� ��´�.
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        */
        try {
            DBManager manager = new DBManager("MISCOM");
            
            CO_BANK_1000_MDataSet ds = (CO_BANK_1000_MDataSet) manager.executeCall(dm);
            
            if (!"".equals(ds.errcode)) {
                throw new AppException(ds.errcode, ds.errmsg);
            }        
            req.setAttribute("ds", ds);

        }        
        catch (SysException e) {
            throw new SysException();
        }
    }
    
    /**
     * ����-�����Ա޳��� ����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_bank_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {    	
    	//CO_BANK_1010_LDataSet ds = null;

        //����� ��������
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String sys_clsf = Util.checkString(req.getParameter("sys_clsf"));
    	String acct_mang_cd = Util.checkString(req.getParameter("acct_mang_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String tran_content = Util.checkString(req.getParameter("tran_content"));
    	String tran_amt = Util.checkString(req.getParameter("tran_amt"));
    	String tran_clsfy = Util.checkString(req.getParameter("tran_clsfy"));

    	// DM Setting
    	CO_BANK_1010_LDM dm = new CO_BANK_1010_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSys_clsf(sys_clsf);
    	dm.setAcct_mang_cd(acct_mang_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setTran_content(tran_content);
    	dm.setTran_amt(tran_amt); 
    	dm.setTran_clsfy(tran_clsfy);
    	
        
    	dm.print();
    	/*
        CoBank1000EJBHome home = (CoBank1000EJBHome) JNDIManager.getInstance().getHome("CoBank1000EJB");
        
        try {
       	    CoBank1000EJB ejb = home.create();
            ds = ejb.co_bank_1010_l(dm);	// ������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);	// request�� ������� ��´�.
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        */
        DBManager manager = new DBManager("MISCOM");
        
        CO_BANK_1010_LDataSet ds = (CO_BANK_1010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        req.setAttribute("ds", ds);
    }
    
    
}
