/***************************************************************************************************
 * 파일명 : SE_BOI_2800DAO.java
 * 기능 : 신문대금담보조회
 * 작성일자 : 2016-11-01
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
public class SE_BOI_2800DAO {
	
	public SE_BOI_2800_MDataSet se_boi_2800_m(SE_BOI_2800_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2800_MDataSet ds = (SE_BOI_2800_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2810_LDataSet se_boi_2810_l(SE_BOI_2810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2810_LDataSet ds = (SE_BOI_2810_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_BOI_2820_SDataSet se_boi_2820_s(SE_BOI_2820_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2820_SDataSet ds = (SE_BOI_2820_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
