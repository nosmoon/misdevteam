package chosun.ciis.pr.prtexec.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */ 
 
public class PR_PRTEXEC_5000DAO { 

	
	public PR_PRTEXEC_5000_LDataSet pr_prtexec_5000_l(PR_PRTEXEC_5000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5000_LDataSet ds = (PR_PRTEXEC_5000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/*
	 * 전체발행내역 마감
	 */
	public PR_PRTEXEC_5020_ADataSet pr_prtexec_5020_a(PR_PRTEXEC_5020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5020_ADataSet ds = (PR_PRTEXEC_5020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PRTEXEC_5030_ADataSet pr_prtexec_5030_a(PR_PRTEXEC_5030_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5030_ADataSet ds = (PR_PRTEXEC_5030_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/*
	 * 		자재마감
	 */
	public PR_PRTEXEC_5031_ADataSet pr_prtexec_5031_a(PR_PRTEXEC_5031_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5031_ADataSet ds = (PR_PRTEXEC_5031_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/*
	 * 		자재마감 취소
	 */
	public PR_PRTEXEC_5032_ADataSet pr_prtexec_5032_a(PR_PRTEXEC_5032_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5032_ADataSet ds = (PR_PRTEXEC_5032_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/*
	 * 		자재참고사항 조회
	 */
	public PR_PRTEXEC_5033_SDataSet pr_prtexec_5033_s(PR_PRTEXEC_5033_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5033_SDataSet ds = (PR_PRTEXEC_5033_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/*
	 * 		자재참고사항 등록
	 */
	public PR_PRTEXEC_5034_ADataSet pr_prtexec_5034_a(PR_PRTEXEC_5034_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5034_ADataSet ds = (PR_PRTEXEC_5034_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PRTEXEC_5040_LDataSet pr_prtexec_5040_l(PR_PRTEXEC_5040_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5040_LDataSet ds = (PR_PRTEXEC_5040_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PRTEXEC_5050_LDataSet pr_prtexec_5050_l(PR_PRTEXEC_5050_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5050_LDataSet ds = (PR_PRTEXEC_5050_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PRTEXEC_5060_LDataSet pr_prtexec_5060_l(PR_PRTEXEC_5060_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5060_LDataSet ds = (PR_PRTEXEC_5060_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public PR_PRTEXEC_5070_ADataSet pr_prtexec_5070_a(PR_PRTEXEC_5070_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5070_ADataSet ds = (PR_PRTEXEC_5070_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public PR_PRTEXEC_5090_ADataSet pr_prtexec_5090_a(PR_PRTEXEC_5090_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTEXEC_5090_ADataSet ds = (PR_PRTEXEC_5090_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}