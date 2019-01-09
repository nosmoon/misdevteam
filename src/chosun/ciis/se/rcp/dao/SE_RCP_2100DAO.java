/***************************************************************************************************
 * 파일명 : SE_RCP_2100DAO.java
 * 기능 : 입금전표조회
 * 작성일자 : 2009-05-07
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
public class SE_RCP_2100DAO {
	
	public SE_RCP_2100_MDataSet se_rcp_2100_m(SE_RCP_2100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2100_MDataSet ds = (SE_RCP_2100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_2110_LDataSet se_rcp_2110_l(SE_RCP_2110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2110_LDataSet ds = (SE_RCP_2110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}
