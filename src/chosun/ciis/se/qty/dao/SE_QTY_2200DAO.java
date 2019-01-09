/***************************************************************************************************
 * 파일명 : SE_QTY_2200DAO.java
 * 기능 : 부수관리-특판신청관리
 * 작성일자 : 2009-03-05
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
public class SE_QTY_2200DAO {
	
	public SE_QTY_2200_MDataSet se_qty_2200_m(SE_QTY_2200_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2200_MDataSet ds = (SE_QTY_2200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2210_LDataSet se_qty_2210_l(SE_QTY_2210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2210_LDataSet ds = (SE_QTY_2210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2220_SDataSet se_qty_2220_s(SE_QTY_2220_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2220_SDataSet ds = (SE_QTY_2220_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2230_ADataSet se_qty_2230_a(SE_QTY_2230_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2230_ADataSet ds = (SE_QTY_2230_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_QTY_2240_UDataSet se_qty_2240_u(SE_QTY_2240_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_QTY_2240_UDataSet ds = (SE_QTY_2240_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
