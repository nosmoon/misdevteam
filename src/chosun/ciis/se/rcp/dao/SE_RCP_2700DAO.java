/***************************************************************************************************
 * 파일명 : SE_RCP_2700DAO.java
 * 기능 : 보증금현황
 * 작성일자 : 2009-04-24
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
public class SE_RCP_2700DAO {
	
	public SE_RCP_2700_MDataSet se_rcp_2700_m(SE_RCP_2700_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2700_MDataSet ds = (SE_RCP_2700_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_2710_LDataSet se_rcp_2710_l(SE_RCP_2710_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_2710_LDataSet ds = (SE_RCP_2710_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
	
