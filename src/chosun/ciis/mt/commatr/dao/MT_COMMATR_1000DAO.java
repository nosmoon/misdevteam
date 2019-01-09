package chosun.ciis.mt.commatr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
//import chosun.ciis.mt.submatrin.dm.MT_SUBMATRIN_1101_LDM;
//import chosun.ciis.mt.submatrin.ds.MT_MATRIN_1101_LDataSet;

import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 *
 */

public class MT_COMMATR_1000DAO {
    /**
     *  TAB 1 자재내역 등록
     * @param dm
     * @return
     * @throws AppException
     */
	public MT_COMMATR_1100_LDataSet getMt_Commatr_1100(MT_COMMATR_1100_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMATR_1100_LDataSet ds = (MT_COMMATR_1100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public MT_COMMATR_1101_LDataSet getMt_Commatr_1101(MT_COMMATR_1101_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMATR_1101_LDataSet ds = (MT_COMMATR_1101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public MT_COMMATR_1102_LDataSet mt_commatr_1102_l(MT_COMMATR_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1102_LDataSet ds = (MT_COMMATR_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_1103_ADataSet mt_commatr_1103_a(MT_COMMATR_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1103_ADataSet ds = (MT_COMMATR_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_COMMATR_1104_MDataSet mt_commatr_1104_m(MT_COMMATR_1104_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1104_MDataSet ds = (MT_COMMATR_1104_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/**
	 * 자재내역 등록 팝업
	 * @param dm
	 * @return
	 * @throws AppException
	 */
	public MT_COMMATR_1110_LDataSet mt_commatr_1110_l(MT_COMMATR_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1110_LDataSet ds = (MT_COMMATR_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/**
	 * TAB2 자재내역 조회
	 */
	public MT_COMMATR_1201_LDataSet mt_commatr_1201_l(MT_COMMATR_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1201_LDataSet ds = (MT_COMMATR_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    /**
	 * TAB3 매체코드 조회
	 */
    public MT_COMMATR_1301_LDataSet getMt_Commatr_1301(MT_COMMATR_1301_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

//        System.out.println(manager.m_dbPool);
        MT_COMMATR_1301_LDataSet ds = (MT_COMMATR_1301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
	 * TAB3  조회
	 */

	public MT_COMMATR_1302_LDataSet mt_commatr_1302_l(MT_COMMATR_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1302_LDataSet ds = (MT_COMMATR_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}



    public MT_COMMATR_1303_ADataSet mt_commatr_1303_a(MT_COMMATR_1303_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1303_ADataSet ds = (MT_COMMATR_1303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_1400_LDataSet mt_commatr_1400_l(MT_COMMATR_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1400_LDataSet ds = (MT_COMMATR_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_1401_LDataSet mt_commatr_1401_l(MT_COMMATR_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1401_LDataSet ds = (MT_COMMATR_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_COMMATR_1410_ADataSet mt_commatr_1410_a(MT_COMMATR_1410_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1410_ADataSet ds = (MT_COMMATR_1410_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_COMMATR_1601_LDataSet mt_commatr_1601_l(MT_COMMATR_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1601_LDataSet ds = (MT_COMMATR_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_COMMATR_1602_LDataSet mt_commatr_1602_l(MT_COMMATR_1602_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1602_LDataSet ds = (MT_COMMATR_1602_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MT_COMMATR_1603_ADataSet mt_commatr_1603_a(MT_COMMATR_1603_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1603_ADataSet ds = (MT_COMMATR_1603_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public MT_COMMATR_1610_LDataSet mt_commatr_1610_l(MT_COMMATR_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1610_LDataSet ds = (MT_COMMATR_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
}