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

package chosun.ciis.hd.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.com.dm.*;
import chosun.ciis.hd.com.ds.*;

/** 
 * 
 */
public class HD_COM_1000DAO {
	
	public HD_COM_1001_LDataSet hd_com_1001_l(HD_COM_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_1001_LDataSet ds = (HD_COM_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COM_1002_LDataSet getHd_com_1002(HD_COM_1002_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_COM_1002_LDataSet ds = (HD_COM_1002_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_COM_1003_LDataSet hd_com_1003_l(HD_COM_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_1003_LDataSet ds = (HD_COM_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COM_1004_SDataSet getHd_com_1004(HD_COM_1004_SDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_COM_1004_SDataSet ds = (HD_COM_1004_SDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_COM_1100_LDataSet hd_com_1100_l(HD_COM_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_1100_LDataSet ds = (HD_COM_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COM_1101_LDataSet getHd_com_1101(HD_COM_1101_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_COM_1101_LDataSet ds = (HD_COM_1101_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_COM_1102_SDataSet getHd_com_1102(HD_COM_1102_SDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_COM_1102_SDataSet ds = (HD_COM_1102_SDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_COM_1103_LDataSet hd_com_1103_l(HD_COM_1103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_1103_LDataSet ds = (HD_COM_1103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COM_1200_LDataSet hd_com_1200_l(HD_COM_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_1200_LDataSet ds = (HD_COM_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COM_2000_LDataSet hd_com_2000_l(HD_COM_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_2000_LDataSet ds = (HD_COM_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COM_2100_ADataSet hd_com_2100_a(HD_COM_2100_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COM_2100_ADataSet ds = (HD_COM_2100_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
