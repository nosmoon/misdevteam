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

package chosun.ciis.as.leas.dao;

import java.sql.*;

import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */
public class AS_LEAS_1000DAO {
	
	public AS_LEAS_1001_LDataSet as_leas_1001_l(AS_LEAS_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1001_LDataSet ds = (AS_LEAS_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1002_UDataSet as_leas_1002_u(AS_LEAS_1002_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1002_UDataSet ds = (AS_LEAS_1002_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1003_MDataSet as_leas_1003_m(AS_LEAS_1003_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1003_MDataSet ds = (AS_LEAS_1003_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1101_MDataSet as_leas_1101_m(AS_LEAS_1101_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1101_MDataSet ds = (AS_LEAS_1101_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1102_LDataSet as_leas_1102_l(AS_LEAS_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1102_LDataSet ds = (AS_LEAS_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1103_ADataSet as_leas_1103_a(AS_LEAS_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1103_ADataSet ds = (AS_LEAS_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1104_LDataSet as_leas_1104_l(AS_LEAS_1104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1104_LDataSet ds = (AS_LEAS_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1105_LDataSet as_leas_1105_l(AS_LEAS_1105_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1105_LDataSet ds = (AS_LEAS_1105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1106_LDataSet as_leas_1106_l(AS_LEAS_1106_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1106_LDataSet ds = (AS_LEAS_1106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1107_MDataSet as_leas_1107_m(AS_LEAS_1107_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1107_MDataSet ds = (AS_LEAS_1107_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1108_IDataSet as_leas_1108_i(AS_LEAS_1108_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1108_IDataSet ds = (AS_LEAS_1108_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1201_LDataSet as_leas_1201_l(AS_LEAS_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1201_LDataSet ds = (AS_LEAS_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1202_LDataSet as_leas_1202_l(AS_LEAS_1202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1202_LDataSet ds = (AS_LEAS_1202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1203_LDataSet as_leas_1203_l(AS_LEAS_1203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1203_LDataSet ds = (AS_LEAS_1203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1204_MDataSet as_leas_1204_m(AS_LEAS_1204_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1204_MDataSet ds = (AS_LEAS_1204_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1205_ADataSet as_leas_1205_a(AS_LEAS_1205_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1205_ADataSet ds = (AS_LEAS_1205_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1206_DDataSet as_leas_1206_d(AS_LEAS_1206_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1206_DDataSet ds = (AS_LEAS_1206_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1207_ADataSet as_leas_1207_a(AS_LEAS_1207_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1207_ADataSet ds = (AS_LEAS_1207_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public AS_LEAS_1208_ADataSet as_leas_1208_a(AS_LEAS_1208_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1208_ADataSet ds = (AS_LEAS_1208_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1210_IDataSet as_leas_1210_i(AS_LEAS_1210_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1210_IDataSet ds = (AS_LEAS_1210_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1211_ADataSet as_leas_1211_a(AS_LEAS_1211_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1211_ADataSet ds = (AS_LEAS_1211_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1212_ADataSet as_leas_1212_a(AS_LEAS_1212_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1212_ADataSet ds = (AS_LEAS_1212_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1301_LDataSet as_leas_1301_l(AS_LEAS_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1301_LDataSet ds = (AS_LEAS_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1302_LDataSet as_leas_1302_l(AS_LEAS_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1302_LDataSet ds = (AS_LEAS_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1303_SDataSet as_leas_1303_s(AS_LEAS_1303_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1303_SDataSet ds = (AS_LEAS_1303_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1304_IDataSet as_leas_1304_i(AS_LEAS_1304_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1304_IDataSet ds = (AS_LEAS_1304_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1305_ADataSet as_leas_1305_a(AS_LEAS_1305_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1305_ADataSet ds = (AS_LEAS_1305_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1306_LDataSet as_leas_1306_l(AS_LEAS_1306_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1306_LDataSet ds = (AS_LEAS_1306_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1307_LDataSet as_leas_1307_l(AS_LEAS_1307_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1307_LDataSet ds = (AS_LEAS_1307_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1308_IDataSet as_leas_1308_i(AS_LEAS_1308_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1308_IDataSet ds = (AS_LEAS_1308_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1309_ADataSet as_leas_1309_a(AS_LEAS_1309_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1309_ADataSet ds = (AS_LEAS_1309_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1310_LDataSet as_leas_1310_l(AS_LEAS_1310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1310_LDataSet ds = (AS_LEAS_1310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1311_IDataSet as_leas_1311_i(AS_LEAS_1311_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1311_IDataSet ds = (AS_LEAS_1311_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1312_ADataSet as_leas_1312_a(AS_LEAS_1312_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1312_ADataSet ds = (AS_LEAS_1312_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1401_LDataSet as_leas_1401_l(AS_LEAS_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1401_LDataSet ds = (AS_LEAS_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1402_ADataSet as_leas_1402_a(AS_LEAS_1402_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1402_ADataSet ds = (AS_LEAS_1402_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1501_MDataSet as_leas_1501_m(AS_LEAS_1501_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1501_MDataSet ds = (AS_LEAS_1501_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_LEAS_1502_LDataSet as_leas_1502_l(AS_LEAS_1502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1502_LDataSet ds = (AS_LEAS_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_LEAS_1801_LDataSet as_leas_1801_l(AS_LEAS_1801_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1801_LDataSet ds = (AS_LEAS_1801_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1802_ADataSet as_leas_1802_a(AS_LEAS_1802_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1802_ADataSet ds = (AS_LEAS_1802_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1901_LDataSet as_leas_1901_l(AS_LEAS_1901_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1901_LDataSet ds = (AS_LEAS_1901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_LEAS_1902_SDataSet as_leas_1902_s(AS_LEAS_1902_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_LEAS_1902_SDataSet ds = (AS_LEAS_1902_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
