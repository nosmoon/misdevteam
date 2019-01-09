/***************************************************************************************************
 * 파일명 : EN_INNEXP_2000DAO.java
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

package chosun.ciis.en.innexp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */
public class EN_INNEXP_2000DAO {
	
	public EN_INNEXP_2001_LDataSet en_innexp_2001_l(EN_INNEXP_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_2001_LDataSet ds = (EN_INNEXP_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public EN_INNEXP_2002_LDataSet en_innexp_2002_l(EN_INNEXP_2002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_2002_LDataSet ds = (EN_INNEXP_2002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
