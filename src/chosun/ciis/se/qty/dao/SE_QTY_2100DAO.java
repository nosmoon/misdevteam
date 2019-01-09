/***************************************************************************************************
 * 파일명 : SE_QTY_2100DAO.java
 * 기능 : 부수관리
 * 작성일자 : 일일변동부수 증감내역
 * 작성자 : 배창희
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
public class SE_QTY_2100DAO {
	
	public SE_QTY_2100_MDataSet se_qty_2100_m(SE_QTY_2100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2100_MDataSet ds = (SE_QTY_2100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2105_LDataSet se_qty_2105_l(SE_QTY_2105_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2105_LDataSet ds = (SE_QTY_2105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_QTY_2110_LDataSet se_qty_2110_l(SE_QTY_2110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2110_LDataSet ds = (SE_QTY_2110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2120_SDataSet se_qty_2120_s(SE_QTY_2120_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2120_SDataSet ds = (SE_QTY_2120_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2130_ADataSet se_qty_2130_a(SE_QTY_2130_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2130_ADataSet ds = (SE_QTY_2130_ADataSet)manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }

		return ds;
	}

    
}
