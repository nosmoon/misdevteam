/***************************************************************************************************
* 파일명 : SE_SAL_1100DAO.java
* 기능 : 판매 - 매출관리 - 월장려금관리
 * 작성일자 : 2009.03.26
 * 작성자 :   김진경
***************************************************************************************************
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
                                                                 
                                                                                      
public class SE_SAL_1100DAO {
	
	public SE_SAL_1105_LDataSet se_sal_1105_l(SE_SAL_1105_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1105_LDataSet ds = (SE_SAL_1105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1110_LDataSet se_sal_1110_l(SE_SAL_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1110_LDataSet ds = (SE_SAL_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1120_ADataSet se_sal_1120_a(SE_SAL_1120_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1120_ADataSet ds = (SE_SAL_1120_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	
}
