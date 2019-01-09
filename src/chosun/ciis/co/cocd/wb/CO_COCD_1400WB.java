/***************************************************************************************************
* ���ϸ� : CO_COCD_1200WB
* ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.co.cocd.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.cocd.dm.CO_COCD_1400_MDM;
import chosun.ciis.co.cocd.dm.CO_COCD_1410_LDM;
import chosun.ciis.co.cocd.ds.CO_COCD_1400_MDataSet;
import chosun.ciis.co.cocd.ds.CO_COCD_1410_LDataSet;
/**
 * 
 */

public class CO_COCD_1400WB extends BaseWB{

    /**
     * �ʱ�ȭ��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1400_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1200_MDataSet ds = null;

        // DM Setting
        CO_COCD_1400_MDM dm = new CO_COCD_1400_MDM();

        String cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
        String job_clsf = Util.checkString(req.getParameter("job_clsf"));
        String cd_clsf 	= Util.checkString(req.getParameter("cd_clsf"));
        String cd   	= Util.checkString(req.getParameter("cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCd_clsf(cd_clsf);
        dm.setCd(cd);
        
        DBManager manager 			= new DBManager("MISCOM");
        dm.print();
        CO_COCD_1400_MDataSet ds 	= (CO_COCD_1400_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    /**
     * �ʱ�ȭ��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1410_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	
        //CO_COCD_1210_LDataSet ds = null;

        // DM Setting
        CO_COCD_1410_LDM dm = new CO_COCD_1410_LDM();

        String cmpy_cd 	=Util.getSessionParameterValue(req, "cmpycd", true);
        String bis_cd = Util.checkString(req.getParameter("bis_cd"));
        String cd = Util.checkString(req.getParameter("cd"));
        String cdnm = Util.checkString(req.getParameter("cdnm"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setBis_cd(bis_cd);
        dm.setCd(cd);
        dm.setCdnm(cdnm);
        
        dm.print();
        DBManager manager 			= new DBManager("MISCOM");
        
        CO_COCD_1410_LDataSet ds 	= (CO_COCD_1410_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        req.setAttribute("ds", ds);
    }
   
}
