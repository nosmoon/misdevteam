/***************************************************************************************************
 * 파일명 : SE_SND_1000DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.co.mng.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.co.mng.dm.CO_MNG_1000_LDM;
import chosun.ciis.co.mng.dm.CO_MNG_1010_LDM;
import chosun.ciis.co.mng.dm.CO_MNG_1020_SDM;
import chosun.ciis.co.mng.dm.CO_MNG_1050_LDM;
import chosun.ciis.co.mng.ds.CO_MNG_1000_LDataSet;
import chosun.ciis.co.mng.ds.CO_MNG_1010_LDataSet;
import chosun.ciis.co.mng.ds.CO_MNG_1020_SDataSet;
import chosun.ciis.co.mng.ds.CO_MNG_1050_LDataSet;
import java.io.PrintStream;
import java.sql.SQLException;
/**
 * 
 */
public class CO_MNG_1000DAO {
	
	public CO_MNG_1000_LDataSet co_mng_1000_l(CO_MNG_1000_LDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISCOM");
        
        System.out.println("CO_MNG_1000.dbmanager = " + manager.m_conn); 
        
        CO_MNG_1000_LDataSet ds 	= (CO_MNG_1000_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public CO_MNG_1010_LDataSet co_mng_1010_l(CO_MNG_1010_LDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_MNG_1010_LDataSet ds 	= (CO_MNG_1010_LDataSet) manager.executeCall(dm);
        ds.setMenuId(dm.getJob_clsf());
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	 
	public CO_MNG_1020_SDataSet co_mng_1020_s(CO_MNG_1020_SDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISCOM");
        CO_MNG_1020_SDataSet ds 	= (CO_MNG_1020_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public CO_MNG_1050_LDataSet co_mng_1050_l(CO_MNG_1050_LDM dm) throws AppException
	 {
	    DBManager manager = new DBManager("MISCOM");

	    CO_MNG_1050_LDataSet ds = null;
	    try
	    {
	      ds = (CO_MNG_1050_LDataSet)manager.executeCall(dm);
	      if (!"".equals(ds.errcode))
	        throw new AppException(ds.errcode, ds.errmsg);
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	    return ds;
	  }
}
