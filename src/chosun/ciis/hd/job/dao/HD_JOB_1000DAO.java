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

package chosun.ciis.hd.job.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.ds.*;

/**
 * 
 */
public class HD_JOB_1000DAO {
	
	public HD_JOB_1000_LDataSet getHd_job_1000(HD_JOB_1000_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1000_LDataSet ds = (HD_JOB_1000_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_JOB_1001_LDataSet getHd_job_1001(HD_JOB_1001_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1001_LDataSet ds = (HD_JOB_1001_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_JOB_1002_ADataSet getHd_job_1002(HD_JOB_1002_ADM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1002_ADataSet ds = (HD_JOB_1002_ADataSet) manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
	    }
	    return ds;
	}
	
	public HD_JOB_1003_LDataSet hd_job_1003_l(HD_JOB_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1003_LDataSet ds = (HD_JOB_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_JOB_1004_LDataSet hd_job_1004_l(HD_JOB_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1004_LDataSet ds = (HD_JOB_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_JOB_1005_LDataSet hd_job_1005_l(HD_JOB_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1005_LDataSet ds = (HD_JOB_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_JOB_1100_LDataSet getHd_job_1100(HD_JOB_1100_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1100_LDataSet ds = (HD_JOB_1100_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_JOB_1101_LDataSet getHd_job_1101(HD_JOB_1101_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1101_LDataSet ds = (HD_JOB_1101_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_JOB_1102_UDataSet getHd_job_1102(HD_JOB_1102_UDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1102_UDataSet ds = (HD_JOB_1102_UDataSet) manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
	    }
	    return ds;
	}
	
	public HD_JOB_1103_ADataSet getHd_job_1103(HD_JOB_1103_ADM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1103_ADataSet ds = (HD_JOB_1103_ADataSet) manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
	    }
	    return ds;
	}
	
	public HD_JOB_1200_LDataSet hd_job_1200_l(HD_JOB_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1200_LDataSet ds = (HD_JOB_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_JOB_1201_UDataSet hd_job_1201_u(HD_JOB_1201_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_JOB_1201_UDataSet ds = (HD_JOB_1201_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
