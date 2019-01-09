/***************************************************************************************************
* 파일명 : MT_PAPORD_1000DAO
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-03
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

public class MT_PAPORD_1000DAO {
	/**
	 * 공장combo
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1000_MDataSet mt_papord_1000_m(MT_PAPORD_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1000_MDataSet ds = (MT_PAPORD_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 공장별 용지 적정수용량 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1001_LDataSet mt_papord_1001_l(MT_PAPORD_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1001_LDataSet ds = (MT_PAPORD_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 용지Roll당중량 table Data 유무 확인
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1002_LDataSet mt_papord_1002_l(MT_PAPORD_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1002_LDataSet ds = (MT_PAPORD_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 공장별 용지 적정수용량 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1003_LDataSet mt_papord_1003_l(MT_PAPORD_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1003_LDataSet ds = (MT_PAPORD_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 공장별 용지 적정수용량 저장,수정,삭제
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1004_ADataSet mt_papord_1004_a(MT_PAPORD_1004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1004_ADataSet ds = (MT_PAPORD_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 공장별 용지 적정수용량 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1005_LDataSet mt_papord_1005_l(MT_PAPORD_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1005_LDataSet ds = (MT_PAPORD_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 공장별 용지 적정수용량 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1006_LDataSet mt_papord_1006_l(MT_PAPORD_1006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1006_LDataSet ds = (MT_PAPORD_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 공장별 용지 적정수용량 저장,수정,삭제
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1007_ADataSet mt_papord_1007_a(MT_PAPORD_1007_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1007_ADataSet ds = (MT_PAPORD_1007_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}