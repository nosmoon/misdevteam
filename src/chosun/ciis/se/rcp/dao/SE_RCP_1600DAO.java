/***************************************************************************************************
 * 파일명 : SE_RCP_1600DAO.java
 * 기능 : 가상계좌등록
 * 작성일자 : 2009-05-06
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
public class SE_RCP_1600DAO {
	
	public SE_RCP_1600_MDataSet se_rcp_1600_m(SE_RCP_1600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1600_MDataSet ds = (SE_RCP_1600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1610_LDataSet se_rcp_1610_l(SE_RCP_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1610_LDataSet ds = (SE_RCP_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1620_LDataSet se_rcp_1620_l(SE_RCP_1620_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1620_LDataSet ds = (SE_RCP_1620_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1630_ADataSet se_rcp_1630_a(SE_RCP_1630_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1630_ADataSet ds = (SE_RCP_1630_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
    
}
