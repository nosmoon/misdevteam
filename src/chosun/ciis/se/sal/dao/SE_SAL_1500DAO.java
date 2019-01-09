/***************************************************************************************************
* 파일명 : SE_SAL_1500DAO.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 생성
* 작성일자 : 2009-04-14
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.SE_SAL_1500_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1510_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1520_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1500_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1510_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1520_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
                                                                 
                                                                                      
public class SE_SAL_1500DAO {
	
	public SE_SAL_1500_MDataSet se_sal_1500_m(SE_SAL_1500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1500_MDataSet ds = (SE_SAL_1500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public SE_SAL_1510_LDataSet se_sal_1510_l(SE_SAL_1510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1510_LDataSet ds = (SE_SAL_1510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
      
	public SE_SAL_1520_ADataSet se_sal_1520_a(SE_SAL_1520_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1520_ADataSet ds = (SE_SAL_1520_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}                                                                               
