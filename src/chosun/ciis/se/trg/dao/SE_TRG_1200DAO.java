/***************************************************************************************************
 * 파일명 : SE_TRG_1200DAO.java
 * 기능 : 목표결과조회
 * 작성일자 : 2009-04-03
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
public class SE_TRG_1200DAO {
	
	public SE_TRG_1200_MDataSet se_trg_1200_m(SE_TRG_1200_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1200_MDataSet ds = (SE_TRG_1200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1210_LDataSet se_trg_1210_l(SE_TRG_1210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1210_LDataSet ds = (SE_TRG_1210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1220_LDataSet se_trg_1220_l(SE_TRG_1220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1220_LDataSet ds = (SE_TRG_1220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1250_SDataSet se_trg_1250_s(SE_TRG_1250_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1250_SDataSet ds = (SE_TRG_1250_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
