/***************************************************************************************************
 * 파일명 : SE_RCP_1000DAO.java
 * 기능 : (가상계좌)입금확인
 * 작성일자 : 2009-04-15
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */
public class SE_RCP_1000DAO {
	
	public SE_RCP_1000_MDataSet se_rcp_1000_m(SE_RCP_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1000_MDataSet ds = (SE_RCP_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1010_LDataSet se_rcp_1010_l(SE_RCP_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1010_LDataSet ds = (SE_RCP_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1020_LDataSet se_rcp_1020_l(SE_RCP_1020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1020_LDataSet ds = (SE_RCP_1020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1030_ADataSet se_rcp_1030_a(SE_RCP_1030_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1030_ADataSet ds = (SE_RCP_1030_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
