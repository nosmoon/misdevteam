/***************************************************************************************************
* 파일명 : SE_SAL_2500DAO.java
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
public class SE_SAL_2500DAO {
	
	public SE_SAL_2500_MDataSet se_sal_2500_m(SE_SAL_2500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2500_MDataSet ds = (SE_SAL_2500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2510_LDataSet se_sal_2510_l(SE_SAL_2510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2510_LDataSet ds = (SE_SAL_2510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2520_LDataSet se_sal_2520_l(SE_SAL_2520_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2520_LDataSet ds = (SE_SAL_2520_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2530_LDataSet se_sal_2530_l(SE_SAL_2530_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2530_LDataSet ds = (SE_SAL_2530_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2535_LDataSet se_sal_2535_l(SE_SAL_2535_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2535_LDataSet ds = (SE_SAL_2535_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_SAL_2537_SDataSet se_sal_2537_s(SE_SAL_2537_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2537_SDataSet ds = (SE_SAL_2537_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2540_ADataSet se_sal_2540_a(SE_SAL_2540_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2540_ADataSet ds = (SE_SAL_2540_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2550_ADataSet se_sal_2550_a(SE_SAL_2550_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2550_ADataSet ds = (SE_SAL_2550_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_2560_ADataSet se_sal_2560_a(SE_SAL_2560_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2560_ADataSet ds = (SE_SAL_2560_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_SAL_2570_UDataSet se_sal_2570_u(SE_SAL_2570_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_2570_UDataSet ds = (SE_SAL_2570_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
