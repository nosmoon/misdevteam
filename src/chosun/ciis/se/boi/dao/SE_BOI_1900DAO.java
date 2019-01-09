/***************************************************************************************************
 * 파일명 : SE_BOI_1900DAO.java
 * 기능 : 해약관리 - 전세보증금인수인계
 * 작성일자 : 2009-05-22
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
public class SE_BOI_1900DAO {
	
	public SE_BOI_1900_MDataSet se_boi_1900_m(SE_BOI_1900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1900_MDataSet ds = (SE_BOI_1900_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1910_LDataSet se_boi_1910_l(SE_BOI_1910_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1910_LDataSet ds = (SE_BOI_1910_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1920_LDataSet se_boi_1920_l(SE_BOI_1920_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1920_LDataSet ds = (SE_BOI_1920_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1930_LDataSet se_boi_1930_l(SE_BOI_1930_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1930_LDataSet ds = (SE_BOI_1930_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1940_ADataSet se_boi_1940_a(SE_BOI_1940_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1940_ADataSet ds = (SE_BOI_1940_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
