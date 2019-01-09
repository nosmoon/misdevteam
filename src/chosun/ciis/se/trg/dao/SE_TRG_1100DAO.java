/***************************************************************************************************
 * 파일명 : SE_TRG_1100DAO.java
 * 기능 : 지국별 목표등록
 * 작성일자 : 2009-03-26
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
public class SE_TRG_1100DAO {
	
	public SE_TRG_1100_MDataSet se_trg_1100_m(SE_TRG_1100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1100_MDataSet ds = (SE_TRG_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1110_LDataSet se_trg_1110_l(SE_TRG_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1110_LDataSet ds = (SE_TRG_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1120_LDataSet se_trg_1120_l(SE_TRG_1120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1120_LDataSet ds = (SE_TRG_1120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1130_ADataSet se_trg_1130_a(SE_TRG_1130_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1130_ADataSet ds = (SE_TRG_1130_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1140_ADataSet se_trg_1140_a(SE_TRG_1140_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1140_ADataSet ds = (SE_TRG_1140_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1150_SDataSet se_trg_1150_s(SE_TRG_1150_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1150_SDataSet ds = (SE_TRG_1150_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1160_ADataSet se_trg_1160_a(SE_TRG_1160_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1160_ADataSet ds = (SE_TRG_1160_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_TRG_1170_ADataSet se_trg_1170_a(SE_TRG_1170_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1170_ADataSet ds = (SE_TRG_1170_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
