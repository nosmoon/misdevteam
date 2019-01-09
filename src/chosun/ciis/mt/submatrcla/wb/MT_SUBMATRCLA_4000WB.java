
package chosun.ciis.mt.submatrcla.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;



public class MT_SUBMATRCLA_4000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    
	
	public void mt_submatrcla_4201_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATRCLA_4201_LDataSet ds = null;
    	
    	// DM Setting
    	MT_SUBMATRCLA_4201_LDM dm = new MT_SUBMATRCLA_4201_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setClam_dt_fr(Util.checkString(req.getParameter("clam_dt_fr")));
    	dm.setClam_dt_to(Util.checkString(req.getParameter("clam_dt_to")));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setPart_cd(Util.checkString(req.getParameter("part_cd")));
    	dm.setPart_nm(Util.checkString(req.getParameter("part_nm")));
    	dm.setPart_clas1(Util.checkString(req.getParameter("part_clas1")));
		
    	dm.print();

        ds = (MT_SUBMATRCLA_4201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
	
		
}