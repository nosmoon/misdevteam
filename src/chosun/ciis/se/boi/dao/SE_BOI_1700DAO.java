/***************************************************************************************************
 * 파일명 : SE_BOI_1700DAO.java
 * 기능 : 해약관리 - 인수인계처리
 * 작성일자 : 2009-05-20
 * 작성자 : 배창희
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
public class SE_BOI_1700DAO {
	
	public SE_BOI_1700_MDataSet se_boi_1700_m(SE_BOI_1700_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1700_MDataSet ds = (SE_BOI_1700_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1710_LDataSet se_boi_1710_l(SE_BOI_1710_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1710_LDataSet ds = (SE_BOI_1710_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1720_LDataSet se_boi_1720_l(SE_BOI_1720_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1720_LDataSet ds = (SE_BOI_1720_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
	public SE_BOI_1740_ADataSet se_boi_1740_a(SE_BOI_1740_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1740_ADataSet ds = (SE_BOI_1740_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
