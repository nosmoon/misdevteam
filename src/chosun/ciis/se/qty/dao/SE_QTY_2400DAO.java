/***************************************************************************************************
 * 파일명 : SE_QTY_2400DAO.java
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
public class SE_QTY_2400DAO {
	
	public SE_QTY_2400_MDataSet se_qty_2400_m(SE_QTY_2400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2400_MDataSet ds = (SE_QTY_2400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2410_LDataSet se_qty_2410_l(SE_QTY_2410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2410_LDataSet ds = (SE_QTY_2410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2420_LDataSet se_qty_2420_l(SE_QTY_2420_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2420_LDataSet ds = (SE_QTY_2420_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2430_ADataSet se_qty_2430_a(SE_QTY_2430_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2430_ADataSet ds = (SE_QTY_2430_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2440_ADataSet se_qty_2440_a(SE_QTY_2440_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2440_ADataSet ds = (SE_QTY_2440_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_QTY_2450_UDataSet se_qty_2450_u(SE_QTY_2450_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2450_UDataSet ds = (SE_QTY_2450_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_QTY_2460_LDataSet se_qty_2460_l(SE_QTY_2460_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2460_LDataSet ds = (SE_QTY_2460_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2680_PDataSet se_qty_2680_p(SE_QTY_2680_PDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2680_PDataSet ds = (SE_QTY_2680_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
