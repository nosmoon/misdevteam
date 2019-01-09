/***************************************************************************************************
 * 파일명 : SE_QTY_1100DAO.java
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
public class SE_QTY_1100DAO {
	
    public SE_QTY_1100_MDataSet se_qty_1100_m(SE_QTY_1100_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_QTY_1100_MDataSet ds = (SE_QTY_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_QTY_1110_LDataSet se_qty_1110_l(SE_QTY_1110_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_QTY_1110_LDataSet ds = (SE_QTY_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_QTY_1120_UDataSet se_qty_1120_u(SE_QTY_1120_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_QTY_1120_UDataSet ds = (SE_QTY_1120_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public SE_QTY_1130_ADataSet se_qty_1130_a(SE_QTY_1130_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1130_ADataSet ds = (SE_QTY_1130_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_1140_LDataSet se_qty_1140_l(SE_QTY_1140_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_1140_LDataSet ds = (SE_QTY_1140_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
