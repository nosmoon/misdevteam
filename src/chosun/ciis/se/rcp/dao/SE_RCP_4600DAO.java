/***************************************************************************************************
 * 파일명 : SE_RCP_4000DAO.java
 * 기능 : 입금관리-스포츠입금등록
 * 작성일자 : 2009-05-08
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
public class SE_RCP_4600DAO {
	
	public SE_RCP_4600_MDataSet se_rcp_4600_m(SE_RCP_4600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4600_MDataSet ds = (SE_RCP_4600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4610_LDataSet se_rcp_4610_l(SE_RCP_4610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4610_LDataSet ds = (SE_RCP_4610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4620_LDataSet se_rcp_4620_l(SE_RCP_4620_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4620_LDataSet ds = (SE_RCP_4620_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4630_LDataSet se_rcp_4630_l(SE_RCP_4630_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4630_LDataSet ds = (SE_RCP_4630_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4640_ADataSet se_rcp_4640_a(SE_RCP_4640_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4640_ADataSet ds = (SE_RCP_4640_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4641_ADataSet se_rcp_4641_a(SE_RCP_4641_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4641_ADataSet ds = (SE_RCP_4641_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4650_ADataSet se_rcp_4650_a(SE_RCP_4650_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4650_ADataSet ds = (SE_RCP_4650_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
