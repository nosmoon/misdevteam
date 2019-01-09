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

package chosun.ciis.as.aset.dao;

import java.sql.*;
 
import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */
public class AS_ASET_1000DAO {
	
	public AS_ASET_1001_MDataSet as_aset_1001_m(AS_ASET_1001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1001_MDataSet ds = (AS_ASET_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1002_LDataSet as_aset_1002_l(AS_ASET_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1002_LDataSet ds = (AS_ASET_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1003_SDataSet as_aset_1003_s(AS_ASET_1003_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1003_SDataSet ds = (AS_ASET_1003_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1004_SDataSet as_aset_1004_s(AS_ASET_1004_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1004_SDataSet ds = (AS_ASET_1004_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1005_SDataSet as_aset_1005_s(AS_ASET_1005_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1005_SDataSet ds = (AS_ASET_1005_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1006_SDataSet as_aset_1006_s(AS_ASET_1006_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1006_SDataSet ds = (AS_ASET_1006_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1007_SDataSet as_aset_1007_s(AS_ASET_1007_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1007_SDataSet ds = (AS_ASET_1007_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1008_ADataSet as_aset_1008_a(AS_ASET_1008_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISAST");
		AS_ASET_1008_ADataSet ds = (AS_ASET_1008_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		return ds;
	}

	public AS_ASET_1009_LDataSet as_aset_1009_l(AS_ASET_1009_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1009_LDataSet ds = (AS_ASET_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1010_LDataSet as_aset_1010_l(AS_ASET_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1010_LDataSet ds = (AS_ASET_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1101_MDataSet as_aset_1101_m(AS_ASET_1101_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1101_MDataSet ds = (AS_ASET_1101_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1102_LDataSet as_aset_1102_l(AS_ASET_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1102_LDataSet ds = (AS_ASET_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1103_LDataSet as_aset_1103_l(AS_ASET_1103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1103_LDataSet ds = (AS_ASET_1103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1104_LDataSet as_aset_1104_l(AS_ASET_1104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1104_LDataSet ds = (AS_ASET_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1106_LDataSet as_aset_1106_l(AS_ASET_1106_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1106_LDataSet ds = (AS_ASET_1106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1107_LDataSet as_aset_1107_l(AS_ASET_1107_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1107_LDataSet ds = (AS_ASET_1107_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1108_LDataSet as_aset_1108_l(AS_ASET_1108_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1108_LDataSet ds = (AS_ASET_1108_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1110_ADataSet as_aset_1110_a(AS_ASET_1110_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1110_ADataSet ds = (AS_ASET_1110_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1109_LDataSet as_aset_1109_l(AS_ASET_1109_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1109_LDataSet ds = (AS_ASET_1109_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1201_LDataSet as_aset_1201_l(AS_ASET_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1201_LDataSet ds = (AS_ASET_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1202_LDataSet as_aset_1202_l(AS_ASET_1202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1202_LDataSet ds = (AS_ASET_1202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1203_LDataSet as_aset_1203_l(AS_ASET_1203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1203_LDataSet ds = (AS_ASET_1203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1204_IDataSet as_aset_1204_i(AS_ASET_1204_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1204_IDataSet ds = (AS_ASET_1204_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1205_ADataSet as_aset_1205_a(AS_ASET_1205_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1205_ADataSet ds = (AS_ASET_1205_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1300_MDataSet as_aset_1300_m(AS_ASET_1300_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1300_MDataSet ds = (AS_ASET_1300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1301_LDataSet as_aset_1301_l(AS_ASET_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1301_LDataSet ds = (AS_ASET_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1302_IDataSet as_aset_1302_i(AS_ASET_1302_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1302_IDataSet ds = (AS_ASET_1302_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1303_ADataSet as_aset_1303_a(AS_ASET_1303_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1303_ADataSet ds = (AS_ASET_1303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1304_LDataSet as_aset_1304_l(AS_ASET_1304_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1304_LDataSet ds = (AS_ASET_1304_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1305_LDataSet as_aset_1305_l(AS_ASET_1305_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1305_LDataSet ds = (AS_ASET_1305_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1401_LDataSet as_aset_1401_l(AS_ASET_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1401_LDataSet ds = (AS_ASET_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1402_LDataSet as_aset_1402_l(AS_ASET_1402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1402_LDataSet ds = (AS_ASET_1402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1403_LDataSet as_aset_1403_l(AS_ASET_1403_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1403_LDataSet ds = (AS_ASET_1403_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1404_IDataSet as_aset_1404_i(AS_ASET_1404_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1404_IDataSet ds = (AS_ASET_1404_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1405_DDataSet as_aset_1405_d(AS_ASET_1405_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1405_DDataSet ds = (AS_ASET_1405_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1501_LDataSet as_aset_1501_l(AS_ASET_1501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1501_LDataSet ds = (AS_ASET_1501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1502_LDataSet as_aset_1502_l(AS_ASET_1502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1502_LDataSet ds = (AS_ASET_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1503_IDataSet as_aset_1503_i(AS_ASET_1503_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1503_IDataSet ds = (AS_ASET_1503_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1504_ADataSet as_aset_1504_a(AS_ASET_1504_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1504_ADataSet ds = (AS_ASET_1504_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1601_LDataSet as_aset_1601_l(AS_ASET_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1601_LDataSet ds = (AS_ASET_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_ASET_1602_LDataSet as_aset_1602_l(AS_ASET_1602_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1602_LDataSet ds = (AS_ASET_1602_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_ASET_1603_IDataSet as_aset_1603_i(AS_ASET_1603_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1603_IDataSet ds = (AS_ASET_1603_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_ASET_1605_ADataSet as_aset_1605_a(AS_ASET_1605_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1605_ADataSet ds = (AS_ASET_1605_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public AS_ASET_1701_MDataSet as_aset_1701_m(AS_ASET_1701_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1701_MDataSet ds = (AS_ASET_1701_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1702_LDataSet as_aset_1702_l(AS_ASET_1702_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1702_LDataSet ds = (AS_ASET_1702_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1703_LDataSet as_aset_1703_l(AS_ASET_1703_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1703_LDataSet ds = (AS_ASET_1703_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1704_LDataSet as_aset_1704_l(AS_ASET_1704_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1704_LDataSet ds = (AS_ASET_1704_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1705_ADataSet as_aset_1705_a(AS_ASET_1705_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1705_ADataSet ds = (AS_ASET_1705_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1708_ADataSet as_aset_1708_a(AS_ASET_1708_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1708_ADataSet ds = (AS_ASET_1708_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1709_LDataSet as_aset_1709_l(AS_ASET_1709_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1709_LDataSet ds = (AS_ASET_1709_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public AS_ASET_1801_LDataSet as_aset_1801_l(AS_ASET_1801_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1801_LDataSet ds = (AS_ASET_1801_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_ASET_1802_ADataSet as_aset_1802_a(AS_ASET_1802_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1802_ADataSet ds = (AS_ASET_1802_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_ASET_1901_LDataSet as_aset_1901_l(AS_ASET_1901_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1901_LDataSet ds = (AS_ASET_1901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_ASET_1902_LDataSet as_aset_1902_l(AS_ASET_1902_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1902_LDataSet ds = (AS_ASET_1902_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public AS_ASET_1903_LDataSet as_aset_1903_l(AS_ASET_1903_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1903_LDataSet ds = (AS_ASET_1903_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public AS_ASET_1904_ADataSet as_aset_1904_a(AS_ASET_1904_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1904_ADataSet ds = (AS_ASET_1904_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public AS_ASET_1906_MDataSet as_aset_1906_m(AS_ASET_1906_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISAST");
		AS_ASET_1906_MDataSet ds = (AS_ASET_1906_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
