/***************************************************************************************************
* 파일명 : MT_PAPORD_5000DAO
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-09
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

public class MT_PAPORD_5000DAO {
		
	/**
	 * 공장콤보
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_5000_MDataSet mt_papord_5000_m(MT_PAPORD_5000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5000_MDataSet ds = (MT_PAPORD_5000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 제지사조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_5001_LDataSet mt_papord_5001_l(MT_PAPORD_5001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5001_LDataSet ds = (MT_PAPORD_5001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_5002_LDataSet mt_papord_5002_l(MT_PAPORD_5002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5002_LDataSet ds = (MT_PAPORD_5002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	
	/**
	 * 제지사별 발주량
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_5003_LDataSet mt_papord_5003_l(MT_PAPORD_5003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5003_LDataSet ds = (MT_PAPORD_5003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 저장
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_5004_ADataSet mt_papord_5004_a(MT_PAPORD_5004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5004_ADataSet ds = (MT_PAPORD_5004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 공장별 최대 수용량
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_5005_LDataSet mt_papord_5005_l(MT_PAPORD_5005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5005_LDataSet ds = (MT_PAPORD_5005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 발주 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_5006_LDataSet mt_papord_5006_l(MT_PAPORD_5006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_5006_LDataSet ds = (MT_PAPORD_5006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}