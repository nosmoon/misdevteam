/***************************************************************************************************
* 파일명 : SE_SAL_1800DAO.java
* 기능 : 판매 - 지대관리 - 매출관리 - 매출마감
* 작성일자 : 2009-04-10
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.SE_SAL_1800_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1810_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1820_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1800_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1810_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1820_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
                                                                 
                                                                                      
public class SE_SAL_1800DAO {
	public SE_SAL_1800_MDataSet se_sal_1800_m(SE_SAL_1800_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1800_MDataSet ds = (SE_SAL_1800_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
      
	public SE_SAL_1810_LDataSet se_sal_1810_l(SE_SAL_1810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1810_LDataSet ds = (SE_SAL_1810_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
      
	public SE_SAL_1820_ADataSet se_sal_1820_a(SE_SAL_1820_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1820_ADataSet ds = (SE_SAL_1820_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}                                                                               
