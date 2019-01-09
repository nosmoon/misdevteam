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

public class MT_PAPORD_7000DAO {
		
	/**
	 * 용지자동발주서 - 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_7000_LDataSet mt_papord_7000_l(MT_PAPORD_7000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7000_LDataSet ds = (MT_PAPORD_7000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 용지자동발주서 - 그리드Caption
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_7001_LDataSet mt_papord_7001_l(MT_PAPORD_7001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7001_LDataSet ds = (MT_PAPORD_7001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 발주서전송
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_7002_LDataSet mt_papord_7002_l(MT_PAPORD_7002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7002_LDataSet ds = (MT_PAPORD_7002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 제지사, 담당자 이메일 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_7003_LDataSet mt_papord_7003_l(MT_PAPORD_7003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_7003_LDataSet ds = (MT_PAPORD_7003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}