/***************************************************************************************************
 * 파일명 : PilotDAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.as.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.com.dm.*;
import chosun.ciis.as.com.ds.*;

/**
 * 
 */
public class AS_COM_1000DAO {
	
	public AS_COM_1000_SDataSet as_com_1000_s(AS_COM_1000_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_COM_1000_SDataSet ds = (AS_COM_1000_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_COM_1100_LDataSet as_com_1100_l(AS_COM_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_COM_1100_LDataSet ds = (AS_COM_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_COM_1200_LDataSet as_com_1200_l(AS_COM_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_COM_1200_LDataSet ds = (AS_COM_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_COM_1300_LDataSet as_com_1300_l(AS_COM_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_COM_1300_LDataSet ds = (AS_COM_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_COM_1600_LDataSet as_com_1600_l(AS_COM_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_COM_1600_LDataSet ds = (AS_COM_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_COM_1800_LDataSet as_com_1800_l(AS_COM_1800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_COM_1800_LDataSet ds = (AS_COM_1800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_COM_1900_LDataSet as_com_1900_l(AS_COM_1900_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_COM_1900_LDataSet ds = (AS_COM_1900_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
