/***************************************************************************************************
 * 파일명 : SE_TRG_1700DAO.java
 * 기능 : 담당평가기준관리
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
public class SE_TRG_1700DAO {
	
	public SE_TRG_1710_LDataSet se_trg_1710_l(SE_TRG_1710_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1710_LDataSet ds = (SE_TRG_1710_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1720_LDataSet se_trg_1720_l(SE_TRG_1720_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1720_LDataSet ds = (SE_TRG_1720_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1730_ADataSet se_trg_1730_a(SE_TRG_1730_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1730_ADataSet ds = (SE_TRG_1730_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1740_ADataSet se_trg_1740_a(SE_TRG_1740_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1740_ADataSet ds = (SE_TRG_1740_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1750_ADataSet se_trg_1750_a(SE_TRG_1750_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1750_ADataSet ds = (SE_TRG_1750_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
