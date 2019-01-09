package chosun.ciis.mt.common.dao;

import java.rmi.RemoteException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;
import chosun.ciis.as.com.dm.AS_COM_1000_SDM;
import chosun.ciis.as.com.ds.AS_COM_1000_SDataSet;
import chosun.ciis.mt.common.dm.*;
import chosun.ciis.mt.common.ds.*;

/**
 *
 */
public class MT_COMMON_DAO {

	
	public MT_COM_1000_SDataSet mt_com_1000_s(MT_COM_1000_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COM_1000_SDataSet ds = (MT_COM_1000_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) { 
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_COMMON_DEPT_0001_LDataSet getMt_Common_0001(MT_COMMON_DEPT_0001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        MT_COMMON_DEPT_0001_LDataSet ds = (MT_COMMON_DEPT_0001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_COMMON_DLCO_0001_LDataSet getMt_Common_0002(MT_COMMON_DLCO_0001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMON_DLCO_0001_LDataSet ds = (MT_COMMON_DLCO_0001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	//96 공통코드 거래처 추가
	public MT_COMMON_DLCO_0003_LDataSet getMt_Common_0009(MT_COMMON_DLCO_0003_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMON_DLCO_0003_LDataSet ds = (MT_COMMON_DLCO_0003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public MT_COMMON_MATR_0001_LDataSet getMt_Common_0003(MT_COMMON_MATR_0001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMON_MATR_0001_LDataSet ds = (MT_COMMON_MATR_0001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public MT_COMMON_DLCO_0002_LDataSet getMt_Common_0004(MT_COMMON_DLCO_0002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMON_DLCO_0002_LDataSet ds = (MT_COMMON_DLCO_0002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_COMMON_EMP_0001_LDataSet getMt_Common_0005(MT_COMMON_EMP_0001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMON_EMP_0001_LDataSet ds = (MT_COMMON_EMP_0001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_COMMON_MATR_0002_LDataSet getMt_Common_0006(MT_COMMON_MATR_0002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMON_MATR_0002_LDataSet ds = (MT_COMMON_MATR_0002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public MT_COMMON_1000_LDataSet mt_com_1000_l(MT_COMMON_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMON_1000_LDataSet ds = (MT_COMMON_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMON_2000_LDataSet mt_com_2000_l(MT_COMMON_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMON_2000_LDataSet ds = (MT_COMMON_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
