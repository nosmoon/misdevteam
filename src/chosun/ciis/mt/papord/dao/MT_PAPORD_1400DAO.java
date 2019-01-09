/***************************************************************************************************
* 파일명 : MT_PAPORD_4000DAO
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

public class MT_PAPORD_1400DAO {
		
	/**
	 * 주간발행인쇄량산정(공장, 매체 콤보)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1400_MDataSet mt_papord_1400_m(MT_PAPORD_1400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1400_MDataSet ds = (MT_PAPORD_1400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 주간발행인쇄량산정(섹션 콤보)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_4001_MDataSet mt_papord_4001_m(MT_PAPORD_4001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4001_MDataSet ds = (MT_PAPORD_4001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 주간발행인쇄량산정(중량/1롤 콤보)
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_4002_MDataSet mt_papord_4002_m(MT_PAPORD_4002_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4002_MDataSet ds = (MT_PAPORD_4002_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 발행면수, 발행부수, 양출여부
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
	public MT_PAPORD_1410_LDataSet mt_papord_1410_l(MT_PAPORD_1410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1410_LDataSet ds = (MT_PAPORD_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	/**
	 * 주간발행인쇄량산정 저장,수정,삭제
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_1420_ADataSet mt_papord_1420_a(MT_PAPORD_1420_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_1420_ADataSet ds = (MT_PAPORD_1420_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 주간발행인쇄량산정 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4005_LDataSet mt_papord_4005_l(MT_PAPORD_4005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4005_LDataSet ds = (MT_PAPORD_4005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 주간발행인쇄량산정 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4006_LDataSet mt_papord_4006_l(MT_PAPORD_4006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4006_LDataSet ds = (MT_PAPORD_4006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 주간발행인쇄량산정 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4007_LDataSet mt_papord_4007_l(MT_PAPORD_4007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4007_LDataSet ds = (MT_PAPORD_4007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 주간발행인쇄량산정 조회
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4008_LDataSet mt_papord_4008_l(MT_PAPORD_4008_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4008_LDataSet ds = (MT_PAPORD_4008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/**
	 * 주간발행조회 팝업
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_PAPORD_4100_LDataSet mt_papord_4100_l(MT_PAPORD_4100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_4100_LDataSet ds = (MT_PAPORD_4100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}