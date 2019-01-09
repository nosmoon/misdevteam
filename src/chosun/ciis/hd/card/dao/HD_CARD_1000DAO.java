/***************************************************************************************************
 * 파일명 : PilotDAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.hd.card.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.card.dm.*;
import chosun.ciis.hd.card.ds.*;

/**
 * 
 */
public class HD_CARD_1000DAO {
	
	public HD_CARD_1000_LDataSet hd_card_1000_l(HD_CARD_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CARD_1000_LDataSet ds = (HD_CARD_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_CARD_1020_MDataSet hd_card_1020_m(HD_CARD_1020_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CARD_1020_MDataSet ds = (HD_CARD_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_CARD_1100_LDataSet hd_card_1100_l(HD_CARD_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CARD_1100_LDataSet ds = (HD_CARD_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_CARD_1101_LDataSet hd_card_1101_l(HD_CARD_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_CARD_1101_LDataSet ds = (HD_CARD_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
