package chosun.ciis.pr.papmake.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */ 
 
public class PR_PAPMAKE_3000DAO { 

	/*
	 *  �μ�뿪�� �������� ��ȸ
	*/
	public PR_PAPMAKE_3000_LDataSet pr_papmake_3000_l(PR_PAPMAKE_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3000_LDataSet ds = (PR_PAPMAKE_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/*
	 *  �μ�뿪�� �������� ��ȸ�� ���� ���屸���ڵ� ��ȸ
	*/
	public PR_PAPMAKE_3001_LDataSet pr_papmake_3001_l(PR_PAPMAKE_3001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3001_LDataSet ds = (PR_PAPMAKE_3001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/*
	 *  �μ�뿪�� �������� ���,����,����
	*/
	public PR_PAPMAKE_3010_ADataSet pr_papmake_3010_a(PR_PAPMAKE_3010_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3010_ADataSet ds = (PR_PAPMAKE_3010_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/*
	 *  ��Ź�μ� �ܰ����� ��ȸ�� ���� ���屸���ڵ� ��ȸ
	*/
	public PR_PAPMAKE_3100_MDataSet pr_papmake_3100_m(PR_PAPMAKE_3100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3100_MDataSet ds = (PR_PAPMAKE_3100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	/*
	 *  ��Ź�μ� �ܰ�����  ��ȸ
	*/
	public PR_PAPMAKE_3101_LDataSet pr_papmake_3101_l(PR_PAPMAKE_3101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3101_LDataSet ds = (PR_PAPMAKE_3101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/*
	 *  ��Ÿ����� �ܰ�����  ��ȸ
	*/
	public PR_PAPMAKE_3201_LDataSet pr_papmake_3201_l(PR_PAPMAKE_3201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3201_LDataSet ds = (PR_PAPMAKE_3201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/*
	 *  �����뷮 ����  ��ȸ
	*/
	public PR_PAPMAKE_3301_LDataSet pr_papmake_3301_l(PR_PAPMAKE_3301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3301_LDataSet ds = (PR_PAPMAKE_3301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	/*
	 *  �μ����¹�
	*/
	public PR_PAPMAKE_3501_LDataSet pr_papmake_3501_l(PR_PAPMAKE_3501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3501_LDataSet ds = (PR_PAPMAKE_3501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/*
	 *  �μ����¹�
	*/
	public PR_PAPMAKE_3502_LDataSet pr_papmake_3502_l(PR_PAPMAKE_3502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3502_LDataSet ds = (PR_PAPMAKE_3502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public PR_PAPMAKE_3600_MDataSet pr_papmake_3600_m(PR_PAPMAKE_3600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PAPMAKE_3600_MDataSet ds = (PR_PAPMAKE_3600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}