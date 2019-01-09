/***************************************************************************************************
 * 파일명 : SE_TRG_1500DAO.java
 * 기능 : 지국평가결과관리
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
public class SE_TRG_1500DAO {
	
	public SE_TRG_1500_MDataSet se_trg_1500_m(SE_TRG_1500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1500_MDataSet ds = (SE_TRG_1500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1510_LDataSet se_trg_1510_l(SE_TRG_1510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1510_LDataSet ds = (SE_TRG_1510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1520_ADataSet se_trg_1520_a(SE_TRG_1520_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1520_ADataSet ds = (SE_TRG_1520_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1540_ADataSet se_trg_1540_a(SE_TRG_1540_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1540_ADataSet ds = (SE_TRG_1540_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1550_ADataSet se_trg_1550_a(SE_TRG_1550_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1550_ADataSet ds = (SE_TRG_1550_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1560_ADataSet se_trg_1560_a(SE_TRG_1560_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1560_ADataSet ds = (SE_TRG_1560_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}
