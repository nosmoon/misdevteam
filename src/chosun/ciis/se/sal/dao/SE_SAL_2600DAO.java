/***************************************************************************************************
* 파일명 : SE_SAL_2600DAO.java
* 기능 : 판매 - 매출관리 - 단건계산서등록
* 작성일자 : 2009-07-20
* 작성자 : 배창희
***************************************************************************************************/
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
public class SE_SAL_2600DAO {
	
	public SE_SAL_2600_MDataSet se_sal_2600_m(SE_SAL_2600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2600_MDataSet ds = (SE_SAL_2600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2610_LDataSet se_sal_2610_l(SE_SAL_2610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2610_LDataSet ds = (SE_SAL_2610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_SAL_2620_ADataSet se_sal_2620_a(SE_SAL_2620_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2620_ADataSet ds = (SE_SAL_2620_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2630_ADataSet se_sal_2630_a(SE_SAL_2630_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2630_ADataSet ds = (SE_SAL_2630_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
