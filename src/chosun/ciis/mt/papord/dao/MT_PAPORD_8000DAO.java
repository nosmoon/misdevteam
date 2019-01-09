/***************************************************************************************************
* 파일명 : MT_PAPORD_7000DAO
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-17
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.papord.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

public class MT_PAPORD_8000DAO {
		
	/**
	 * 용지자동발주 - 콤보
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_8000_MDataSet mt_papord_8000_m(MT_PAPORD_8000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8000_MDataSet ds = (MT_PAPORD_8000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PAPORD_8002_LDataSet mt_papord_8002_l(MT_PAPORD_8002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8002_LDataSet ds = (MT_PAPORD_8002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PAPORD_8003_LDataSet mt_papord_8003_l(MT_PAPORD_8003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8003_LDataSet ds = (MT_PAPORD_8003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_PAPORD_8004_ADataSet mt_papord_8004_a(MT_PAPORD_8004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8004_ADataSet ds = (MT_PAPORD_8004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_PAPORD_8005_LDataSet mt_papord_8005_l(MT_PAPORD_8005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8005_LDataSet ds = (MT_PAPORD_8005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_PAPORD_8006_LDataSet mt_papord_8006_l(MT_PAPORD_8006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8006_LDataSet ds = (MT_PAPORD_8006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_PAPORD_8101_LDataSet mt_papord_8101_l(MT_PAPORD_8101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8101_LDataSet ds = (MT_PAPORD_8101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_PAPORD_8201_LDataSet mt_papord_8201_l(MT_PAPORD_8201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8201_LDataSet ds = (MT_PAPORD_8201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_PAPORD_8008_LDataSet mt_papord_8008_l(MT_PAPORD_8008_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8008_LDataSet ds = (MT_PAPORD_8008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PAPORD_8009_DDataSet mt_papord_8009_d(MT_PAPORD_8009_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_8009_DDataSet ds = (MT_PAPORD_8009_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}