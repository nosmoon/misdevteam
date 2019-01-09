/***************************************************************************************************
* 파일명 : MT_PAPORD_2000DAO
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-07
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

public class MT_PAPORD_2000DAO {
	/**
	 * 제지사별 기본발주비율 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_2001_LDataSet mt_papord_2001_l(MT_PAPORD_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_2001_LDataSet ds = (MT_PAPORD_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 제지사별 기본발주비율 저장, 수정, 삭제
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_2002_ADataSet mt_papord_2002_a(MT_PAPORD_2002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_2002_ADataSet ds = (MT_PAPORD_2002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}