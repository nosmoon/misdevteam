package chosun.ciis.pr.prtcnsg.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

public class PR_OTHCNSM_1000DAO {
	// 위탁인쇄소모입력 콤보 조회 
	public PR_OTHCNSM_1000_MDataSet pr_othcnsm_1000_m(PR_OTHCNSM_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1000_MDataSet ds = (PR_OTHCNSM_1000_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁인쇄소모입력 조회 
	public PR_OTHCNSM_1100_LDataSet pr_othcnsm_1100_l(PR_OTHCNSM_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1100_LDataSet ds = (PR_OTHCNSM_1100_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁인쇄소모입력 등록/수정
	public PR_OTHCNSM_1101_ADataSet pr_othcnsm_1101_a(PR_OTHCNSM_1101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1101_ADataSet ds = (PR_OTHCNSM_1101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁인쇄소모를 위한 전체발행내역 조회 
	public PR_OTHCNSM_1102_LDataSet pr_othcnsm_1102_l(PR_OTHCNSM_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1102_LDataSet ds = (PR_OTHCNSM_1102_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	// 위탁인쇄소모입력 등록/수정
	public PR_OTHCNSM_1105_DDataSet pr_othcnsm_1105_d(PR_OTHCNSM_1105_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1105_DDataSet ds = (PR_OTHCNSM_1105_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁인쇄소모검색 
	public PR_OTHCNSM_1200_LDataSet pr_othcnsm_1200_l(PR_OTHCNSM_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1200_LDataSet ds = (PR_OTHCNSM_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁인쇄단가관리 조회
	public PR_OTHCNSM_1310_LDataSet pr_othcnsm_1310_l(PR_OTHCNSM_1310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1310_LDataSet ds = (PR_OTHCNSM_1310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	//위탁인쇄단가관리  입력/수정/삭제
	public PR_OTHCNSM_1311_ADataSet pr_othcnsm_1311_a(PR_OTHCNSM_1311_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1311_ADataSet ds = (PR_OTHCNSM_1311_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁용지단가  조회
	public PR_OTHCNSM_1320_LDataSet pr_othcnsm_1320_l(PR_OTHCNSM_1320_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1320_LDataSet ds = (PR_OTHCNSM_1320_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁용지단가 입력/수정/삭제
	public PR_OTHCNSM_1321_ADataSet pr_othcnsm_1321_a(PR_OTHCNSM_1321_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1321_ADataSet ds = (PR_OTHCNSM_1321_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// PS판단가관리 조회
	public PR_OTHCNSM_1330_LDataSet pr_othcnsm_1330_l(PR_OTHCNSM_1330_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1330_LDataSet ds = (PR_OTHCNSM_1330_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// PS판단가관리  입력/수정/삭제
	public PR_OTHCNSM_1331_ADataSet pr_othcnsm_1331_a(PR_OTHCNSM_1331_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1331_ADataSet ds = (PR_OTHCNSM_1331_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁인쇄월마감 컬럼조회, 
	public PR_OTHCNSM_1400_LDataSet pr_othcnsm_1400_l(PR_OTHCNSM_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1400_LDataSet ds = (PR_OTHCNSM_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 위탁인쇄월마감 조회
	public PR_OTHCNSM_1401_LDataSet pr_othcnsm_1401_l(PR_OTHCNSM_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1401_LDataSet ds = (PR_OTHCNSM_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	//마감
	public PR_OTHCNSM_1402_ADataSet pr_othcnsm_1402_a(PR_OTHCNSM_1402_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1402_ADataSet ds = (PR_OTHCNSM_1402_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	//마감취소
	public PR_OTHCNSM_1403_ADataSet pr_othcnsm_1403_a(PR_OTHCNSM_1403_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_OTHCNSM_1403_ADataSet ds = (PR_OTHCNSM_1403_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}