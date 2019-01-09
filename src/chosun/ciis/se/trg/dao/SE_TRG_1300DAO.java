/***************************************************************************************************
 * 파일명 : SE_TRG_1300DAO.java
 * 기능 : 월별확장및성장실적
 * 작성일자 : 2009-04-06
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.trg.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */
public class SE_TRG_1300DAO {
	
	public SE_TRG_1300_MDataSet se_trg_1300_m(SE_TRG_1300_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1300_MDataSet ds = (SE_TRG_1300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_TRG_1310_LDataSet se_trg_1310_l(SE_TRG_1310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1310_LDataSet ds = (SE_TRG_1310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_TRG_1320_ADataSet se_trg_1320_a(SE_TRG_1320_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1320_ADataSet ds = (SE_TRG_1320_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
