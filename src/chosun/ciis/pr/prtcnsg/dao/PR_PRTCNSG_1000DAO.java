package chosun.ciis.pr.prtcnsg.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

public class PR_PRTCNSG_1000DAO {
	// ��Ź�μ�Ҹ��Է� �޺� ��ȸ 
	public PR_PRTCNSG_1000_MDataSet pr_prtcnsg_1000_m(PR_PRTCNSG_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1000_MDataSet ds = (PR_PRTCNSG_1000_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�μ�Ҹ��Է� ��ȸ 
	public PR_PRTCNSG_1100_LDataSet pr_prtcnsg_1100_l(PR_PRTCNSG_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1100_LDataSet ds = (PR_PRTCNSG_1100_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�μ�Ҹ��Է� ���/����
	public PR_PRTCNSG_1101_ADataSet pr_prtcnsg_1101_a(PR_PRTCNSG_1101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1101_ADataSet ds = (PR_PRTCNSG_1101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�μ�Ҹ� ���� ��ü���೻�� ��ȸ 
	public PR_PRTCNSG_1102_LDataSet pr_prtcnsg_1102_l(PR_PRTCNSG_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1102_LDataSet ds = (PR_PRTCNSG_1102_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	// ��Ź�μ�Ҹ��Է� ���/����
	public PR_PRTCNSG_1105_DDataSet pr_prtcnsg_1105_d(PR_PRTCNSG_1105_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1105_DDataSet ds = (PR_PRTCNSG_1105_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�μ�Ҹ�˻� 
	public PR_PRTCNSG_1200_LDataSet pr_prtcnsg_1200_l(PR_PRTCNSG_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1200_LDataSet ds = (PR_PRTCNSG_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�μ�ܰ����� ��ȸ
	public PR_PRTCNSG_1310_LDataSet pr_prtcnsg_1310_l(PR_PRTCNSG_1310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1310_LDataSet ds = (PR_PRTCNSG_1310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	//��Ź�μ�ܰ�����  �Է�/����/����
	public PR_PRTCNSG_1311_ADataSet pr_prtcnsg_1311_a(PR_PRTCNSG_1311_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1311_ADataSet ds = (PR_PRTCNSG_1311_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�����ܰ�  ��ȸ
	public PR_PRTCNSG_1320_LDataSet pr_prtcnsg_1320_l(PR_PRTCNSG_1320_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1320_LDataSet ds = (PR_PRTCNSG_1320_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�����ܰ� �Է�/����/����
	public PR_PRTCNSG_1321_ADataSet pr_prtcnsg_1321_a(PR_PRTCNSG_1321_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1321_ADataSet ds = (PR_PRTCNSG_1321_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// PS�Ǵܰ����� ��ȸ
	public PR_PRTCNSG_1330_LDataSet pr_prtcnsg_1330_l(PR_PRTCNSG_1330_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1330_LDataSet ds = (PR_PRTCNSG_1330_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// PS�Ǵܰ�����  �Է�/����/����
	public PR_PRTCNSG_1331_ADataSet pr_prtcnsg_1331_a(PR_PRTCNSG_1331_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1331_ADataSet ds = (PR_PRTCNSG_1331_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�μ������ �÷���ȸ, 
	public PR_PRTCNSG_1400_LDataSet pr_prtcnsg_1400_l(PR_PRTCNSG_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1400_LDataSet ds = (PR_PRTCNSG_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// ��Ź�μ������ ��ȸ
	public PR_PRTCNSG_1401_LDataSet pr_prtcnsg_1401_l(PR_PRTCNSG_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1401_LDataSet ds = (PR_PRTCNSG_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	//����
	public PR_PRTCNSG_1402_ADataSet pr_prtcnsg_1402_a(PR_PRTCNSG_1402_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1402_ADataSet ds = (PR_PRTCNSG_1402_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	//�������
	public PR_PRTCNSG_1403_ADataSet pr_prtcnsg_1403_a(PR_PRTCNSG_1403_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		PR_PRTCNSG_1403_ADataSet ds = (PR_PRTCNSG_1403_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}