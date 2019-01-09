/***************************************************************************************************
* 파일명 : SE_ANG_1010DAO.java
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

package chosun.ciis.se.ang.dao;


import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.se.ang.ds.*;
import chosun.ciis.se.ang.dm.*;

/**
 * 
 */
public class SE_ANG_1000DAO {
	public SE_ANG_1010_LDataSet se_ang_1010_l(SE_ANG_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_ANG_1010_LDataSet ds = (SE_ANG_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_ANG_1020_LDataSet se_ang_1020_l(SE_ANG_1020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_ANG_1020_LDataSet ds = (SE_ANG_1020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_ANG_1030_UDataSet se_ang_1030_u(SE_ANG_1030_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_ANG_1030_UDataSet ds = (SE_ANG_1030_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
