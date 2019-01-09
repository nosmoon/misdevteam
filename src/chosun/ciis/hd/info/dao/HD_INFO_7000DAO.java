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

package chosun.ciis.hd.info.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */
public class HD_INFO_7000DAO {
	public HD_INFO_7100_MDataSet hd_info_7100_m(HD_INFO_7100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7100_MDataSet ds = (HD_INFO_7100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_7110_LDataSet hd_info_7110_l(HD_INFO_7110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7110_LDataSet ds = (HD_INFO_7110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_7120_LDataSet hd_info_7120_l(HD_INFO_7120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7120_LDataSet ds = (HD_INFO_7120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_7130_ADataSet hd_info_7130_a(HD_INFO_7130_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7130_ADataSet ds = (HD_INFO_7130_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_7140_ADataSet hd_info_7140_a(HD_INFO_7140_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7140_ADataSet ds = (HD_INFO_7140_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_7150_SDataSet hd_info_7150_s(HD_INFO_7150_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7150_SDataSet ds = (HD_INFO_7150_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
//	프리랜서 관리 
	public HD_INFO_7200_LDataSet hd_info_7200_l(HD_INFO_7200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7200_LDataSet ds = (HD_INFO_7200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
   //프리랜서 수정  
	public HD_INFO_7201_ADataSet hd_info_7201_a(HD_INFO_7201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7201_ADataSet ds = (HD_INFO_7201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
//	프리랜서 관리 (생성조회) 
	public HD_INFO_7202_LDataSet hd_info_7202_l(HD_INFO_7202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7202_LDataSet ds = (HD_INFO_7202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_7203_MDataSet hd_info_7203_m(HD_INFO_7203_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7203_MDataSet ds = (HD_INFO_7203_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	  //프리랜서 마감   
	public HD_INFO_7204_ADataSet hd_info_7204_a(HD_INFO_7204_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7204_ADataSet ds = (HD_INFO_7204_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	  //프리랜서 마감   
	public HD_INFO_7206_ADataSet hd_info_7206_a(HD_INFO_7206_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7206_ADataSet ds = (HD_INFO_7206_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	  //프리랜서 마감   
	public HD_INFO_7207_DDataSet hd_info_7207_d(HD_INFO_7207_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7207_DDataSet ds = (HD_INFO_7207_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_7208_MDataSet hd_info_7208_m(HD_INFO_7208_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_7208_MDataSet ds = (HD_INFO_7208_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}