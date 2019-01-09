/***************************************************************************************************
 * 파일명 : SE_BOI_2900DAO.java
 * 기능 : 보증계약통보
 * 작성일자 : 2016-11-02
 * 작성자 : 심정보
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.boi.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */
public class SE_BOI_2900DAO {
	
	public SE_BOI_2900_MDataSet se_boi_2900_m(SE_BOI_2900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2900_MDataSet ds = (SE_BOI_2900_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2910_LDataSet se_boi_2910_l(SE_BOI_2910_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2910_LDataSet ds = (SE_BOI_2910_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2920_SDataSet se_boi_2920_s(SE_BOI_2920_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2920_SDataSet ds = (SE_BOI_2920_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
