/***************************************************************************************************
 * 파일명 : SE_QTY_2300DAO.java
 * 기능 : 부수관리 - 일일증감부수마감
 * 작성일자 : 2009-03-10
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
public class SE_QTY_2300DAO {
	
	public SE_QTY_2300_MDataSet se_qty_2300_m(SE_QTY_2300_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2300_MDataSet ds = (SE_QTY_2300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2305_MDataSet se_qty_2305_m(SE_QTY_2305_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2305_MDataSet ds = (SE_QTY_2305_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2306_LDataSet se_qty_2306_l(SE_QTY_2306_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2306_LDataSet ds = (SE_QTY_2306_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2310_LDataSet se_qty_2310_l(SE_QTY_2310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2310_LDataSet ds = (SE_QTY_2310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2320_LDataSet se_qty_2320_l(SE_QTY_2320_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2320_LDataSet ds = (SE_QTY_2320_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2330_ADataSet se_qty_2330_a(SE_QTY_2330_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2330_ADataSet ds = (SE_QTY_2330_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_QTY_2340_ADataSet se_qty_2340_a(SE_QTY_2340_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2340_ADataSet ds = (SE_QTY_2340_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_QTY_2670_PDataSet se_qty_2670_p(SE_QTY_2670_PDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2670_PDataSet ds = (SE_QTY_2670_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
