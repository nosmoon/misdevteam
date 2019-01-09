/***************************************************************************************************
 * 파일명 : SE_TRG_1400DAO.java
 * 기능 : 지국평가기준관리
 * 작성일자 : 2009-04-01
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
public class SE_TRG_1400DAO {
	
	public SE_TRG_1400_MDataSet se_trg_1400_m(SE_TRG_1400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1400_MDataSet ds = (SE_TRG_1400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1410_LDataSet se_trg_1410_l(SE_TRG_1410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1410_LDataSet ds = (SE_TRG_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1420_LDataSet se_trg_1420_l(SE_TRG_1420_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1420_LDataSet ds = (SE_TRG_1420_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1430_ADataSet se_trg_1430_a(SE_TRG_1430_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1430_ADataSet ds = (SE_TRG_1430_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1440_ADataSet se_trg_1440_a(SE_TRG_1440_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1440_ADataSet ds = (SE_TRG_1440_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1450_ADataSet se_trg_1450_a(SE_TRG_1450_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1450_ADataSet ds = (SE_TRG_1450_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_TRG_1460_ADataSet se_trg_1460_a(SE_TRG_1460_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_TRG_1460_ADataSet ds = (SE_TRG_1460_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
