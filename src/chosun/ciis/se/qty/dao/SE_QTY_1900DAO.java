/***************************************************************************************************
 * 파일명 : SE_QTY_1900DAO.java
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

package chosun.ciis.se.qty.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */
public class SE_QTY_1900DAO {
	
    public SE_QTY_1900_MDataSet se_qty_1900_m(SE_QTY_1900_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_QTY_1900_MDataSet ds = (SE_QTY_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	public SE_QTY_1910_LDataSet se_qty_1910_l(SE_QTY_1910_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1910_LDataSet ds = (SE_QTY_1910_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
		
	public SE_QTY_1920_ADataSet se_qty_1920_a(SE_QTY_1920_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1920_ADataSet ds = (SE_QTY_1920_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_1930_LDataSet se_qty_1930_l(SE_QTY_1930_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1930_LDataSet ds = (SE_QTY_1930_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public SE_QTY_1950_LDataSet se_qty_1950_l(SE_QTY_1950_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1950_LDataSet ds = (SE_QTY_1950_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
