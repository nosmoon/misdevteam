/***************************************************************************************************
 * 파일명 : SE_TRG_1000DAO.java
 * 기능 : 지역별 목표등록
 * 작성일자 : 2009-03-20
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
public class SE_TRG_1000DAO {
	
	public SE_TRG_1000_MDataSet se_trg_1000_m(SE_TRG_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1000_MDataSet ds = (SE_TRG_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1010_LDataSet se_trg_1010_l(SE_TRG_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1010_LDataSet ds = (SE_TRG_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1020_LDataSet se_trg_1020_l(SE_TRG_1020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1020_LDataSet ds = (SE_TRG_1020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_TRG_1025_LDataSet se_trg_1025_l(SE_TRG_1025_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1025_LDataSet ds = (SE_TRG_1025_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1030_ADataSet se_trg_1030_a(SE_TRG_1030_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1030_ADataSet ds = (SE_TRG_1030_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1040_ADataSet se_trg_1040_a(SE_TRG_1040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1040_ADataSet ds = (SE_TRG_1040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1050_SDataSet se_trg_1050_s(SE_TRG_1050_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1050_SDataSet ds = (SE_TRG_1050_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_TRG_1060_ADataSet se_trg_1060_a(SE_TRG_1060_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1060_ADataSet ds = (SE_TRG_1060_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
