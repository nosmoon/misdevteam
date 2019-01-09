/***************************************************************************************************
 * 파일명 : SE_BOI_2400DAO.java
 * 기능 : 해약관리 - 정리구좌대손처리
 * 작성일자 : 2009-05-28
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
public class SE_BOI_2400DAO {
	
	public SE_BOI_2400_MDataSet se_boi_2400_m(SE_BOI_2400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2400_MDataSet ds = (SE_BOI_2400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2410_LDataSet se_boi_2410_l(SE_BOI_2410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2410_LDataSet ds = (SE_BOI_2410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2440_ADataSet se_boi_2440_a(SE_BOI_2440_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2440_ADataSet ds = (SE_BOI_2440_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2450_ADataSet se_boi_2450_a(SE_BOI_2450_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2450_ADataSet ds = (SE_BOI_2450_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
