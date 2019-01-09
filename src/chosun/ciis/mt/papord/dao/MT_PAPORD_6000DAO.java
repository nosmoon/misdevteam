/***************************************************************************************************
* 파일명 : MT_PAPORD_6000DAO
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-16
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

public class MT_PAPORD_6000DAO {
		
	/**
	 * 제지사별 용지 발주비율 조회(일일발주비율)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_6000_LDataSet mt_papord_6000_l(MT_PAPORD_6000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6000_LDataSet ds = (MT_PAPORD_6000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 제지사별 용지 발주비율 조회(월별발주비율)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_6001_LDataSet mt_papord_6001_l(MT_PAPORD_6001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6001_LDataSet ds = (MT_PAPORD_6001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 제지사별 용지 발주비율 조회(누적발주비율)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_6002_LDataSet mt_papord_6002_l(MT_PAPORD_6002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_6002_LDataSet ds = (MT_PAPORD_6002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}