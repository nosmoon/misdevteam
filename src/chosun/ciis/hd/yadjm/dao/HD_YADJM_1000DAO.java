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

package chosun.ciis.hd.yadjm.dao;

//import java.io.ByteArrayOutputStream;
//import java.io.OutputStream;
//import java.io.BufferedOutputStream;
import java.io.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

//import com.oreilly.servlet.multipart.FilePart;
//import com.oreilly.servlet.multipart.MultipartParser;
//import com.oreilly.servlet.multipart.Part;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
//import oracle.jdbc.driver.OracleResultSet;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.trip.ds.HD_TRIP_1000_LDataSet;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;
 
/** 
 * 
 */
public class HD_YADJM_1000DAO {
	

	public HD_YADJM_1000_ADataSet hd_yadjm_1000_a(HD_YADJM_1000_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1000_ADataSet ds = (HD_YADJM_1000_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_1001_LDataSet hd_yadjm_1001_l(HD_YADJM_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1001_LDataSet ds = (HD_YADJM_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_1100_ADataSet hd_yadjm_1100_a(HD_YADJM_1100_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1100_ADataSet ds = (HD_YADJM_1100_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_1101_LDataSet hd_yadjm_1101_l(HD_YADJM_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1101_LDataSet ds = (HD_YADJM_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_1210_LDataSet getHd_YADJM_1210(HD_YADJM_1210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1210_LDataSet ds = (HD_YADJM_1210_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1211_ADataSet getHd_YADJM_1211(HD_YADJM_1211_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1211_ADataSet ds = (HD_YADJM_1211_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1220_LDataSet hd_yadjm_1220_l(HD_YADJM_1220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1220_LDataSet ds = (HD_YADJM_1220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_1221_ADataSet hd_yadjm_1221_a(HD_YADJM_1221_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1221_ADataSet ds = (HD_YADJM_1221_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_YADJM_1222_LDataSet hd_yadjm_1222_l(HD_YADJM_1222_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1222_LDataSet ds = (HD_YADJM_1222_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_YADJM_1223_ADataSet hd_yadjm_1223_a(HD_YADJM_1223_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1223_ADataSet ds = (HD_YADJM_1223_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_YADJM_1224_LDataSet hd_yadjm_1224_l(HD_YADJM_1224_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1224_LDataSet ds = (HD_YADJM_1224_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_1225_ADataSet getHd_YADJM_1225(HD_YADJM_1225_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1225_ADataSet ds = (HD_YADJM_1225_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1230_LDataSet getHd_YADJM_1230(HD_YADJM_1230_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1230_LDataSet ds = (HD_YADJM_1230_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1231_ADataSet getHd_YADJM_1231(HD_YADJM_1231_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1231_ADataSet ds = (HD_YADJM_1231_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	








	public HD_YADJM_1400_ADataSet getHd_YADJM_1400(HD_YADJM_1400_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1400_ADataSet ds = (HD_YADJM_1400_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	


	public HD_YADJM_1500_LDataSet getHd_YADJM_1500(HD_YADJM_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1500_LDataSet ds = (HD_YADJM_1500_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	


	public HD_YADJM_1600_LDataSet getHd_YADJM_1600(HD_YADJM_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1600_LDataSet ds = (HD_YADJM_1600_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1601_LDataSet hd_yadjm_1601_l(HD_YADJM_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1601_LDataSet ds = (HD_YADJM_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_1602_LDataSet hd_yadjm_1602_l(HD_YADJM_1602_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1602_LDataSet ds = (HD_YADJM_1602_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_1603_LDataSet hd_yadjm_1603_l(HD_YADJM_1603_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1603_LDataSet ds = (HD_YADJM_1603_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_1604_LDataSet hd_yadjm_1604_l(HD_YADJM_1604_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1604_LDataSet ds = (HD_YADJM_1604_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_1800_LDataSet getHd_YADJM_1800(HD_YADJM_1800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1800_LDataSet ds = (HD_YADJM_1800_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1810_LDataSet getHd_YADJM_1810(HD_YADJM_1810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1810_LDataSet ds = (HD_YADJM_1810_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1820_LDataSet getHd_YADJM_1820(HD_YADJM_1820_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1820_LDataSet ds = (HD_YADJM_1820_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	


	public HD_YADJM_1830_LDataSet getHd_YADJM_1830(HD_YADJM_1830_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1830_LDataSet ds = (HD_YADJM_1830_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1840_ADataSet getHd_YADJM_1840(HD_YADJM_1840_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1840_ADataSet ds = (HD_YADJM_1840_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1900_LDataSet getHd_YADJM_1900(HD_YADJM_1900_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1900_LDataSet ds = (HD_YADJM_1900_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1930_LDataSet getHd_YADJM_1930(HD_YADJM_1930_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1930_LDataSet ds = (HD_YADJM_1930_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_1940_ADataSet getHd_YADJM_1940(HD_YADJM_1940_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_1940_ADataSet ds = (HD_YADJM_1940_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_2000_ADataSet hd_yadjm_2000_a(HD_YADJM_2000_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2000_ADataSet ds = (HD_YADJM_2000_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2003_LDataSet hd_yadjm_2003_l(HD_YADJM_2003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2003_LDataSet ds = (HD_YADJM_2003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_3000_LDataSet getHd_YADJM_3000(HD_YADJM_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3000_LDataSet ds = (HD_YADJM_3000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_3001_LDataSet getHd_YADJM_3001(HD_YADJM_3001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3001_LDataSet ds = (HD_YADJM_3001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_3002_LDataSet getHd_YADJM_3002(HD_YADJM_3002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3002_LDataSet ds = (HD_YADJM_3002_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_3003_ADataSet hd_yadjm_3003_a(HD_YADJM_3003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3003_ADataSet ds = (HD_YADJM_3003_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	public HD_YADJM_3004_LDataSet hd_yadjm_3004_l(HD_YADJM_3004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3004_LDataSet ds = (HD_YADJM_3004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_YADJM_3007_ADataSet hd_yadjm_3007_a(HD_YADJM_3007_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_3007_ADataSet ds = (HD_YADJM_3007_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_YADJM_2012_1210_ADataSet hd_yadjm_2012_1210_a(HD_YADJM_2012_1210_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		System.out.println("aution2");
		HD_YADJM_2012_1210_ADataSet ds = (HD_YADJM_2012_1210_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_YADJM_2012_1212_ADataSet hd_yadjm_2012_1212_a(HD_YADJM_2012_1212_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1212_ADataSet ds = (HD_YADJM_2012_1212_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	
	public HD_YADJM_2012_1213_ADataSet hd_yadjm_2012_1213_a(HD_YADJM_2012_1213_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1213_ADataSet ds = (HD_YADJM_2012_1213_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_2012_1214_LDataSet hd_yadjm_2012_1214_l(HD_YADJM_2012_1214_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1214_LDataSet ds = (HD_YADJM_2012_1214_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_2012_1220_LDataSet hd_yadjm_2012_1220_l(HD_YADJM_2012_1220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1220_LDataSet ds = (HD_YADJM_2012_1220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2012_1221_LDataSet hd_yadjm_2012_1221_l(HD_YADJM_2012_1221_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1221_LDataSet ds = (HD_YADJM_2012_1221_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_YADJM_2012_6000_LDataSet hd_yadjm_2012_6000_l(HD_YADJM_2012_6000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_6000_LDataSet ds = (HD_YADJM_2012_6000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2012_6001_ADataSet hd_yadjm_2012_6001_a(HD_YADJM_2012_6001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		System.out.println("aution2");
		HD_YADJM_2012_6001_ADataSet ds = (HD_YADJM_2012_6001_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_2012_1231_LDataSet hd_yadjm_2012_1231_l(HD_YADJM_2012_1231_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1231_LDataSet ds = (HD_YADJM_2012_1231_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2012_1232_ADataSet hd_yadjm_2012_1232_a(HD_YADJM_2012_1232_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2012_1232_ADataSet ds = (HD_YADJM_2012_1232_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_YADJM_2012_1233_LDataSet hd_yadjm_2012_1233_l(HD_YADJM_2012_1233_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1233_LDataSet ds = (HD_YADJM_2012_1233_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_YADJM_2012_1250_LDataSet hd_yadjm_2012_1250_l(HD_YADJM_2012_1250_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2012_1250_LDataSet ds = (HD_YADJM_2012_1250_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2012_2000_ADataSet hd_yadjm_2012_2000_a(HD_YADJM_2012_2000_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2012_2000_ADataSet ds = (HD_YADJM_2012_2000_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_YADJM_2012_CONV_ADataSet hd_yadjm_2012_CONV_a(HD_YADJM_2012_CONV_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2012_CONV_ADataSet ds = (HD_YADJM_2012_CONV_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_YADJM_127001_ADataSet hd_yadjm_127001_a(HD_YADJM_127001_ADM dm) throws AppException {
		HD_YADJM_127001_ADataSet ds = null;
		System.out.println("dao1-1");
        // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	if(dm.add_file != null && !dm.getFlag().equals("D")){
       		
    		/*String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		byte[] add_file;   	   // 첨부파일 내용(임시 )

    		
    		add_file = dm.add_file;
			*/
    		DBManager manager = null;
    		try {
          	
               	manager = new DBManager("MISHDL");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("dao1-2");
               // 파라미터 설정
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.adjm_rvrs_yy);
        		cstmt.setString(5, dm.emp_no);
        		cstmt.setString(6, dm.incmg_pers);
        		cstmt.setString(7, dm.incmg_pers_ip);
        		cstmt.setString(8, dm.add_file_nm1);
        		cstmt.setBytes(9, "0101".getBytes());
        		cstmt.setString(10, dm.doc_type);
        		cstmt.setString(11, dm.seq);
        		cstmt.setString(12, dm.att_year);
        		cstmt.setString(13, dm.form_cd);
        		cstmt.setString(14, dm.resid);
        		cstmt.setString(15, dm.name);
        		cstmt.setString(16, dm.dat_cd);
        		cstmt.setString(17, dm.busnid);
        		cstmt.setString(18, dm.trade_nm);
        		cstmt.setString(19, dm.acc_no);
        		cstmt.setString(20, dm.use_place_cd);
        		cstmt.setString(21, dm.donation_cd);
        		cstmt.setString(22, dm.course_cd);
        		cstmt.setString(23, dm.subject_nm);
        		cstmt.setString(24, dm.start_dt);
        		cstmt.setString(25, dm.end_dt);
        		cstmt.setString(26, dm.com_cd);
        		cstmt.setString(27, dm.pension_cd);
        		cstmt.setString(28, dm.goods_nm);
        		cstmt.setString(29, dm.lend_dt);
        		cstmt.setString(30, dm.lend_kd);
        		cstmt.setString(31, dm.house_take_dt);
        		cstmt.setString(32, dm.mort_setup_dt);
        		cstmt.setString(33, dm.repay_years);
        		cstmt.setString(34, dm.lend_goods_nm);
        		cstmt.setString(35, dm.debt);
        		cstmt.setString(36, dm.fixed_rate_debt);
        		cstmt.setString(37, dm.not_defer_debt);
        		cstmt.setString(38, dm.this_year_rede_amt);
        		cstmt.setString(39, dm.saving_gubn);
        		cstmt.setString(40, dm.reg_dt);
        		cstmt.setString(41, dm.pay_method);
        		cstmt.setString(42, dm.insu1_resid);
        		cstmt.setString(43, dm.insu1_nm);
        		cstmt.setString(44, dm.insu2_resid1);
        		cstmt.setString(45, dm.insu2_nm1);
        		cstmt.setString(46, dm.insu2_resid2);
        		cstmt.setString(47, dm.insu2_nm2);
        		cstmt.setString(48, dm.insu2_resid2);
        		cstmt.setString(49, dm.insu2_nm2);
        		cstmt.setString(50, dm.amt);
        		cstmt.setString(51, dm.sum);
        		cstmt.setString(52, dm.mm);
        		cstmt.setString(53, dm.dd);
        		cstmt.setString(54, dm.fix_cd);
        		cstmt.setString(55, dm.date);
        		cstmt.setString(56, dm.annual);
        		cstmt.setString(57, dm.sum_y1);
        		cstmt.setString(58, dm.sum_y2);
        		cstmt.setString(59, dm.sum_y3);
        		cstmt.setString(60, dm.ddct);
        		cstmt.setString(61, dm.flag);
        		System.out.println("dao1-3");
               // 실행
	    		cstmt.execute();
	    		System.out.println("dao1-4");
               // 결과
	    		ds = (HD_YADJM_127001_ADataSet)dm.createDataSetObject();               
	    		System.out.println("dao1-5");
	    		ds.getValues(cstmt);
	    		
	    		System.out.println("dao1-6");
	    		System.out.println(ds.errcode);
	    		System.out.println(ds.errmsg);
	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}
	    		System.out.println("222222");

	    		
               
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               
               	// 첨부파일
               	if(dm.add_file != null && dm.add_file.length != 0){
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAHDM_YEARADJMFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+ dm.cmpy_cd + "' " +
		               					"   AND 	EMP_NO      = '"+ dm.emp_no + "' " +
		               					"   AND 	ADJM_RVRS_YY 	= '2012' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);
	               	
	               	//BLOB blob;


	               	System.out.println("111");
	               	System.out.println(dm.add_file);
	               	System.out.println(dm.add_file.length);


	               	if (rset1.next()) {  
	               	///////////////////////////////////////////////////////
	               	//ERP용시작
	               	/*
	                   weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	                   OutputStream os1 = oracle_blob1.getBinaryOutputStream();

	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   //for(int i=0; i<dm.add_file.length; i++){
	                       os1.write(dm.add_file[1]);
		                   System.out.println(dm.add_file);
	                   //}
	                   os1.close();
	               	*/
	                //ERP용끝
	               	////////////////////////////////////////////////////////////
	                   
	                   
	                ////////////////////////////////////////////////////////////   
	               	/*ESS용시작                                                                                                        */
	               		
		               	BLOB blob = (oracle.sql.BLOB)rset1.getBlob(1);
	               		OutputStream os1 = blob.getBinaryOutputStream();
	               		
	               		
	               		//BLOB blob = ((oracle.jdbc.driver.OracleResultSet)rset1).getBLOB(1);
	                    //OutputStream os1 = blob.getBinaryOutputStream();

	               		//BLOB blob = ((OracleResultSet)rset1).getBLOB(1);
	               		//BufferedOutputStream os1 = new BufferedOutputStream(blob.getBinaryOutputStream());

	               		//try{
	               	   //파일로부터 읽어서 BLOB 에 WRITE 한다.
		                   //for(int i=0; i<dm.add_file.length; i++){
		                       os1.write(dm.add_file);
			                   System.out.println(dm.add_file);
		                   //}
	                   	   
	                   os1.close();
	                   
	                   //}
	                   //catch( IOException ie )
	                   //{
	                	//   System.out.println( "blob write error - " + ie );
	                   //}
	                   
	                   /*ESS용끝                                                                                                        */
	                   ///////////////////////////////////////////////////////////////
	                   
	                   
	               	}
               	}
               	System.out.println("444444");
               stmt.close();
               manager.m_conn.commit();
               manager.disConnection();
               System.out.println("55555");
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   System.out.println("EXCEP-1");
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            System.out.println("EXCEP-2");
            throw new AppException(ds.errcode, ds.errmsg);
            //throw new SysException(e);
           }
        }else{        	
        	DBManager manager = new DBManager("MISHDL");
        	ds = (HD_YADJM_127001_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
	
	}	
	
  // 2013년 연말정산 관련 
	
	public HD_YADJM_5400_LDataSet hd_yadjm_5400_l(HD_YADJM_5400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5400_LDataSet ds = (HD_YADJM_5400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_YADJM_5401_ADataSet hd_yadjm_5401_a(HD_YADJM_5401_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5401_ADataSet ds = (HD_YADJM_5401_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_5402_ADataSet hd_yadjm_5402_a(HD_YADJM_5402_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5402_ADataSet ds = (HD_YADJM_5402_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_YADJM_2013_1210_ADataSet hd_yadjm_2013_1210_a(HD_YADJM_2013_1210_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		System.out.println("aution2");
		HD_YADJM_2013_1210_ADataSet ds = (HD_YADJM_2013_1210_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_YADJM_2013_1212_ADataSet hd_yadjm_2013_1212_a(HD_YADJM_2013_1212_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1212_ADataSet ds = (HD_YADJM_2013_1212_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	
	public HD_YADJM_2013_1213_ADataSet hd_yadjm_2013_1213_a(HD_YADJM_2013_1213_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1213_ADataSet ds = (HD_YADJM_2013_1213_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_2013_1214_LDataSet hd_yadjm_2013_1214_l(HD_YADJM_2013_1214_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1214_LDataSet ds = (HD_YADJM_2013_1214_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2013_1220_LDataSet hd_yadjm_2013_1220_l(HD_YADJM_2013_1220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1220_LDataSet ds = (HD_YADJM_2013_1220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2013_1221_LDataSet hd_yadjm_2013_1221_l(HD_YADJM_2013_1221_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1221_LDataSet ds = (HD_YADJM_2013_1221_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_YADJM_2013_1231_LDataSet hd_yadjm_2013_1231_l(HD_YADJM_2013_1231_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1231_LDataSet ds = (HD_YADJM_2013_1231_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2013_1232_ADataSet hd_yadjm_2013_1232_a(HD_YADJM_2013_1232_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2013_1232_ADataSet ds = (HD_YADJM_2013_1232_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_YADJM_2013_1233_LDataSet hd_yadjm_2013_1233_l(HD_YADJM_2013_1233_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1233_LDataSet ds = (HD_YADJM_2013_1233_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2013_1234_LDataSet hd_yadjm_2014_1233_l(HD_YADJM_2013_1234_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1234_LDataSet ds = (HD_YADJM_2013_1234_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2013_1250_LDataSet hd_yadjm_2013_1250_l(HD_YADJM_2013_1250_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_1250_LDataSet ds = (HD_YADJM_2013_1250_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_2013_2000_ADataSet hd_yadjm_2013_2000_a(HD_YADJM_2013_2000_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_YADJM_2013_2000_ADataSet ds = (HD_YADJM_2013_2000_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_YADJM_2013_6000_LDataSet hd_yadjm_2013_6000_l(HD_YADJM_2013_6000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_2013_6000_LDataSet ds = (HD_YADJM_2013_6000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_5900_MDataSet hd_yadjm_5900_m(HD_YADJM_5900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5900_MDataSet ds = (HD_YADJM_5900_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_5901_LDataSet hd_yadjm_5901_l(HD_YADJM_5900_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_YADJM_5901_LDataSet ds = (HD_YADJM_5901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_YADJM_5902_ADataSet hd_yadjm_5902_a(HD_YADJM_5902_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		System.out.println("aution2");
		HD_YADJM_5902_ADataSet ds = (HD_YADJM_5902_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	
	public HD_YADJM_2013_6001_ADataSet hd_yadjm_2013_6001_a(HD_YADJM_2013_6001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		System.out.println("aution2");
		HD_YADJM_2013_6001_ADataSet ds = (HD_YADJM_2013_6001_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_YADJM_137001_ADataSet hd_yadjm_137001_a(HD_YADJM_137001_ADM dm) throws AppException {
		HD_YADJM_137001_ADataSet  ds = null;
		System.out.println("dao1-1 : 왜 안됨??????" ); 
		System.out.println("file::::"+dm.add_file);
		
        // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	if(dm.add_file != null && !dm.getFlag().equals("D")){
    		System.out.println("dao1- 파일 ");
    		/*String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		byte[] add_file;   	   // 첨부파일 내용(임시 )

    		
    		add_file = dm.add_file;
			*/
    		DBManager manager = null;
    		try {
          	
               	manager = new DBManager("MISHDL");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("dao1-2");
               // 파라미터 설정
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.adjm_rvrs_yy);
        		cstmt.setString(5, dm.emp_no);
        		cstmt.setString(6, dm.incmg_pers);
        		cstmt.setString(7, dm.incmg_pers_ip);
        		cstmt.setString(8, dm.add_file_nm1);
        		cstmt.setBytes(9, "0101".getBytes());
        		cstmt.setString(10, dm.doc_type);
        		cstmt.setString(11, dm.seq);
        		cstmt.setString(12, dm.att_year);
        		cstmt.setString(13, dm.form_cd);
        		cstmt.setString(14, dm.resid);
        		cstmt.setString(15, dm.name);
        		cstmt.setString(16, dm.dat_cd);
        		cstmt.setString(17, dm.busnid);
        		cstmt.setString(18, dm.trade_nm);
        		cstmt.setString(19, dm.acc_no);
        		cstmt.setString(20, dm.use_place_cd);
        		cstmt.setString(21, dm.donation_cd);
        		cstmt.setString(22, dm.course_cd);
        		cstmt.setString(23, dm.subject_nm);
        		cstmt.setString(24, dm.start_dt);
        		cstmt.setString(25, dm.end_dt);
        		cstmt.setString(26, dm.com_cd);
        		cstmt.setString(27, dm.pension_cd);
        		cstmt.setString(28, dm.goods_nm);
        		cstmt.setString(29, dm.lend_dt);
        		cstmt.setString(30, dm.lend_kd);
        		cstmt.setString(31, dm.house_take_dt);
        		cstmt.setString(32, dm.mort_setup_dt);
        		cstmt.setString(33, dm.repay_years);
        		cstmt.setString(34, dm.lend_goods_nm);
        		cstmt.setString(35, dm.debt);
        		cstmt.setString(36, dm.fixed_rate_debt);
        		cstmt.setString(37, dm.not_defer_debt);
        		cstmt.setString(38, dm.this_year_rede_amt);
        		cstmt.setString(39, dm.saving_gubn);
        		cstmt.setString(40, dm.reg_dt);
        		cstmt.setString(41, dm.pay_method);
        		cstmt.setString(42, dm.insu1_resid);
        		cstmt.setString(43, dm.insu1_nm);
        		cstmt.setString(44, dm.insu2_resid1);
        		cstmt.setString(45, dm.insu2_nm1);
        		cstmt.setString(46, dm.insu2_resid2);
        		cstmt.setString(47, dm.insu2_nm2);
        		cstmt.setString(48, dm.insu2_resid2);
        		cstmt.setString(49, dm.insu2_nm2);
        		cstmt.setString(50, dm.amt);
        		cstmt.setString(51, dm.sum);
        		cstmt.setString(52, dm.mm);
        		cstmt.setString(53, dm.dd);
        		cstmt.setString(54, dm.fix_cd);
        		cstmt.setString(55, dm.date);
        		cstmt.setString(56, dm.annual);
        		cstmt.setString(57, dm.sum_y1);
        		cstmt.setString(58, dm.sum_y2);
        		cstmt.setString(59, dm.sum_y3);
        		cstmt.setString(60, dm.ddct);
        		cstmt.setString(61, dm.ann_tot_amt);
        		cstmt.setString(62, dm.tax_year_amt);
        		cstmt.setString(63, dm.ddct_bs_ass_amt);
        		cstmt.setString(64, dm.flag);
        		
        		System.out.println("dao1-3 :" );
               // 실행
	    		cstmt.execute();
	    		System.out.println("dao1-4");
               // 결과
	    		ds = (HD_YADJM_137001_ADataSet)dm.createDataSetObject();               
	    		System.out.println("dao1-5");
	    		ds.getValues(cstmt);
	    		
	    		System.out.println("dao1-6ㅇㅇㅇㅇㅇㅇ");
	    		System.out.println(ds.errcode);
	    		System.out.println(ds.errmsg);
	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

	    		System.out.println("dao1-6ㅇㅇㅇㅇㅇㅇ");
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               
               	System.out.println("아자자" + dm.add_file);
               	// 첨부파일
               	if(dm.add_file != null && dm.add_file.length != 0){
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAHDM_YEARADJMFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+ dm.cmpy_cd + "' " +
		               					"   AND 	EMP_NO      = '"+ dm.emp_no + "' " +
		               					"   AND 	ADJM_RVRS_YY 	= '2013' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);
	               	
	               	//BLOB blob;

	             //  	System.out.println(dm.add_file);
	              // 	System.out.println(dm.add_file.length);


	               	if (rset1.next()) {  
	               	///////////////////////////////////////////////////////
	               	//ERP용시작
	               	/*
	                   weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	                   OutputStream os1 = oracle_blob1.getBinaryOutputStream();

	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   //for(int i=0; i<dm.add_file.length; i++){
	                       os1.write(dm.add_file[1]);
		                   System.out.println(dm.add_file);
	                   //}
	                   os1.close();
	               	*/
	                //ERP용끝
	               	////////////////////////////////////////////////////////////
	                   
	                   
	                ////////////////////////////////////////////////////////////   
	               	/*ESS용시작                                                                                                        */
	               		
		               	BLOB blob = (oracle.sql.BLOB)rset1.getBlob(1);
	               		OutputStream os1 = blob.getBinaryOutputStream();
	               		
	               		
	               		//BLOB blob = ((oracle.jdbc.driver.OracleResultSet)rset1).getBLOB(1);
	                    //OutputStream os1 = blob.getBinaryOutputStream();

	               		//BLOB blob = ((OracleResultSet)rset1).getBLOB(1);
	               		//BufferedOutputStream os1 = new BufferedOutputStream(blob.getBinaryOutputStream());

	               		//try{
	               	   //파일로부터 읽어서 BLOB 에 WRITE 한다.
		                   //for(int i=0; i<dm.add_file.length; i++){
		                       os1.write(dm.add_file);
			           //        System.out.println(dm.add_file);
		                   //}
	                   	   
	                   os1.close();
	                   
	                   //}
	                   //catch( IOException ie )
	                   //{
	                	//   System.out.println( "blob write error - " + ie );
	                   //}
	                   
	                   /*ESS용끝                                                                                                        */
	                   ///////////////////////////////////////////////////////////////
	                   
	                   
	               	}
               	}
               stmt.close();
               manager.m_conn.commit();
               manager.disConnection();
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   System.out.println("EXCEP-1");
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            System.out.println("EXCEP-2");
            System.out.println(e);
            throw new AppException(ds.errcode, ds.errmsg);
            //throw new SysException(e);
           }
        }else{   
        	DBManager manager = new DBManager("MISHDL");
            System.out.println("EXCEP-ddddd");
        	ds = (HD_YADJM_137001_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
	
	}	
	
	//2014연말정산파일업로드 DAO
	public HD_YADJM_147001_ADataSet hd_yadjm_147001_a(HD_YADJM_147001_ADM dm) throws AppException {
		HD_YADJM_147001_ADataSet  ds = null;
		System.out.println("&&&& hd_yadjm_147001_a DAO 호출 됐음!!! &&& " ); 
		System.out.println("2014년 add_file::::"+dm.add_file);
		
        // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	if(dm.add_file != null && !dm.getFlag().equals("D")){
    		System.out.println("dao 1-1.첨부파일 존재하고 삭제가 아닌경우 수행된다.");
    		/*String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		byte[] add_file;   	   // 첨부파일 내용(임시 )

    		
    		add_file = dm.add_file;
			*/
    		DBManager manager = null;
    		try {
          	
               	manager = new DBManager("MISHDL");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("dao 1-2.getSQL에 dm 파라미터 셋팅11");
               	System.out.println("000000000000000011111111");
               // 파라미터 설정
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		System.out.println("000000000000000022222222");
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		System.out.println("0000000000000000");
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.adjm_rvrs_yy);
        		cstmt.setString(5, dm.emp_no);
        		cstmt.setString(6, dm.incmg_pers);
        		cstmt.setString(7, dm.incmg_pers_ip);
        		cstmt.setString(8, dm.add_file_nm1);
        		cstmt.setBytes(9, "0101".getBytes());
        		cstmt.setString(10, dm.doc_type);
        		cstmt.setString(11, dm.seq);
        		cstmt.setString(12, dm.att_year);
        		cstmt.setString(13, dm.form_cd);
        		cstmt.setString(14, dm.resid);
        		cstmt.setString(15, dm.name);
        		cstmt.setString(16, dm.dat_cd);
        		cstmt.setString(17, dm.busnid);
        		cstmt.setString(18, dm.trade_nm);
        		cstmt.setString(19, dm.acc_no);
        		cstmt.setString(20, dm.use_place_cd);
        		cstmt.setString(21, dm.donation_cd);
        		cstmt.setString(22, dm.course_cd);
        		cstmt.setString(23, dm.subject_nm);
        		cstmt.setString(24, dm.start_dt);
        		cstmt.setString(25, dm.end_dt);
        		cstmt.setString(26, dm.com_cd);
        		System.out.println("11111111111111111111");
        		cstmt.setString(27, dm.pension_cd);
        		cstmt.setString(28, dm.goods_nm);
        		cstmt.setString(29, dm.lend_dt);
        		cstmt.setString(30, dm.lend_kd);
        		cstmt.setString(31, dm.house_take_dt);
        		cstmt.setString(32, dm.mort_setup_dt);
        		cstmt.setString(33, dm.repay_years);
        		cstmt.setString(34, dm.lend_goods_nm);
        		cstmt.setString(35, dm.debt);
        		cstmt.setString(36, dm.fixed_rate_debt);
        		cstmt.setString(37, dm.not_defer_debt);
        		cstmt.setString(38, dm.this_year_rede_amt);
        		cstmt.setString(39, dm.saving_gubn);
        		cstmt.setString(40, dm.reg_dt);
        		cstmt.setString(41, dm.pay_method);
        		cstmt.setString(42, dm.insu1_resid);
        		cstmt.setString(43, dm.insu1_nm);
        		cstmt.setString(44, dm.insu2_resid1);
        		cstmt.setString(45, dm.insu2_nm1);
        		cstmt.setString(46, dm.insu2_resid2);
        		cstmt.setString(47, dm.insu2_nm2);
        		System.out.println("22222222222222222222222");
        		cstmt.setString(48, dm.insu2_resid2);
        		cstmt.setString(49, dm.insu2_nm2);
        		cstmt.setString(50, dm.amt);
        		cstmt.setString(51, dm.sum);
        		cstmt.setString(52, dm.mm);
        		cstmt.setString(53, dm.dd);
        		cstmt.setString(54, dm.fix_cd);
        		cstmt.setString(55, dm.date);
        		cstmt.setString(56, dm.annual);
        		cstmt.setString(57, dm.sum_y1);
        		cstmt.setString(58, dm.sum_y2);
        		cstmt.setString(59, dm.sum_y3);
        		cstmt.setString(60, dm.ddct);
        		cstmt.setString(61, dm.ann_tot_amt);
        		cstmt.setString(62, dm.tax_year_amt);
        		cstmt.setString(63, dm.ddct_bs_ass_amt);
        		cstmt.setString(64, dm.flag);
        		cstmt.setString(65, dm.pre_tot_amt);
        		cstmt.setString(66, dm.pre_market_tot_amt);
        		cstmt.setString(67, dm.pre_tmoney_tot_amt);
        		cstmt.setString(68, dm.edu_tp);
        		cstmt.setString(69, dm.first_tot_amt);
        		cstmt.setString(70, dm.second_tot_amt);
        		cstmt.setString(71, dm.secu_no);
        		cstmt.setString(72, dm.fund_nm);
        		System.out.println("33333333333333333");
        		
               // 실행
	    		cstmt.execute();
	    		System.out.println("dao 1-3. 쿼리 수행");
               // 결과
	    		ds = (HD_YADJM_147001_ADataSet)dm.createDataSetObject();               
	    		System.out.println("dao 1-4. 결과값 ds 에 담기");
	    		ds.getValues(cstmt);
	    		
	    		System.out.println("dao 1-5. 에러코드 => "+ds.errcode+", 에러메시지 => "+ds.errmsg);

	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

	    		System.out.println("dao 1-6.BLOB 타입 파일 처리 시작!!!");
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               
               	System.out.println("BLOB 타입 add_file 값 ===>" + dm.add_file);
               	// 첨부파일
               	if(dm.add_file != null && dm.add_file.length != 0){
               		System.out.println("BLOB 파일이 존재하면 쿼리를 수행한다");
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAHDM_YEARADJMFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+ dm.cmpy_cd + "' " +
		               					"   AND 	EMP_NO      = '"+ dm.emp_no + "' " +
		               					"   AND 	ADJM_RVRS_YY 	= '2014' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);
	               	
	               	//BLOB blob;

	             //  	System.out.println(dm.add_file);
	              // 	System.out.println(dm.add_file.length);


	               	if (rset1.next()) {  
	               	///////////////////////////////////////////////////////
	               	//ERP용시작
	               	/*
	                   weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	                   OutputStream os1 = oracle_blob1.getBinaryOutputStream();

	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   //for(int i=0; i<dm.add_file.length; i++){
	                       os1.write(dm.add_file[1]);
		                   System.out.println(dm.add_file);
	                   //}
	                   os1.close();
	               	*/
	                //ERP용끝
	               	////////////////////////////////////////////////////////////
	                   
	                   
	                ////////////////////////////////////////////////////////////   
	               	/*ESS용시작                                                                                                        */
	               		
		               	BLOB blob = (oracle.sql.BLOB)rset1.getBlob(1);
	               		OutputStream os1 = blob.getBinaryOutputStream();
	               		System.out.println("os1 =======> "+os1);
	               		
	               		
	               		//BLOB blob = ((oracle.jdbc.driver.OracleResultSet)rset1).getBLOB(1);
	                    //OutputStream os1 = blob.getBinaryOutputStream();

	               		//BLOB blob = ((OracleResultSet)rset1).getBLOB(1);
	               		//BufferedOutputStream os1 = new BufferedOutputStream(blob.getBinaryOutputStream());

	               		//try{
	               	   //파일로부터 읽어서 BLOB 에 WRITE 한다.
		                   //for(int i=0; i<dm.add_file.length; i++){
	               		System.out.println("add_file 을 DB에 쓴다!!!");
		                       os1.write(dm.add_file);
			           //        System.out.println(dm.add_file);
		                   //}
	                   	   
	                   os1.close();
	                   
	                   //}
	                   //catch( IOException ie )
	                   //{
	                	//   System.out.println( "blob write error - " + ie );
	                   //}
	                   
	                   /*ESS용끝                                                                                                        */
	                   ///////////////////////////////////////////////////////////////
	                   
	                   
	               	}
               	}
               stmt.close();
               manager.m_conn.commit();
               manager.disConnection();
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   System.out.println("EXCEP-1");
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            System.out.println("EXCEP-2");
            System.out.println(e);
            throw new AppException(ds.errcode, ds.errmsg);
            //throw new SysException(e);
           }
        }else{   
        	DBManager manager = new DBManager("MISHDL");
            System.out.println("EXCEP-ddddd");
        	ds = (HD_YADJM_147001_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
	
	}
	
	//2015연말정산파일업로드 DAO (오토젠 완료)
	public HD_YADJM_157001_ADataSet hd_yadjm_157001_a(HD_YADJM_157001_ADM dm) throws AppException {
		HD_YADJM_157001_ADataSet  ds = null;
		System.out.println("&&&& hd_yadjm_157001_a DAO 호출 됐음!!! &&& " ); 
		System.out.println("2015년 add_file::::"+dm.add_file);
		
        // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	if(dm.add_file != null && !dm.getFlag().equals("D")){
    		System.out.println("dao 1-1.첨부파일 존재하고 삭제가 아닌경우 수행된다.");
    		/*String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		byte[] add_file;   	   // 첨부파일 내용(임시 )

    		
    		add_file = dm.add_file;
			*/
    		DBManager manager = null;
    		try {
          	
               	manager = new DBManager("MISHDL");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("dao 1-2.getSQL에 dm 파라미터 셋팅");
               // 파라미터 설정
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.adjm_rvrs_yy);
        		cstmt.setString(5, dm.emp_no);
        		cstmt.setString(6, dm.incmg_pers);
        		cstmt.setString(7, dm.incmg_pers_ip);
        		cstmt.setString(8, dm.add_file_nm1);
        		cstmt.setBytes(9, "0101".getBytes());
        		cstmt.setString(10, dm.doc_type);
        		cstmt.setString(11, dm.seq);
        		cstmt.setString(12, dm.att_year);
        		cstmt.setString(13, dm.form_cd);
        		cstmt.setString(14, dm.resid);
        		cstmt.setString(15, dm.name);
        		cstmt.setString(16, dm.dat_cd);
        		cstmt.setString(17, dm.busnid);
        		cstmt.setString(18, dm.trade_nm);
        		cstmt.setString(19, dm.acc_no);
        		cstmt.setString(20, dm.use_place_cd);
        		cstmt.setString(21, dm.donation_cd);
        		cstmt.setString(22, dm.course_cd);
        		cstmt.setString(23, dm.subject_nm);
        		cstmt.setString(24, dm.start_dt);
        		cstmt.setString(25, dm.end_dt);
        		cstmt.setString(26, dm.com_cd);
        		cstmt.setString(27, dm.pension_cd);
        		cstmt.setString(28, dm.goods_nm);
        		cstmt.setString(29, dm.lend_dt);
        		cstmt.setString(30, dm.lend_kd);
        		cstmt.setString(31, dm.house_take_dt);
        		cstmt.setString(32, dm.mort_setup_dt);
        		cstmt.setString(33, dm.repay_years);
        		cstmt.setString(34, dm.lend_goods_nm);
        		cstmt.setString(35, dm.debt);
        		cstmt.setString(36, dm.fixed_rate_debt);
        		cstmt.setString(37, dm.not_defer_debt);
        		cstmt.setString(38, dm.this_year_rede_amt);
        		cstmt.setString(39, dm.saving_gubn);
        		cstmt.setString(40, dm.reg_dt);
        		cstmt.setString(41, dm.pay_method);
        		cstmt.setString(42, dm.insu1_resid);
        		cstmt.setString(43, dm.insu1_nm);
        		cstmt.setString(44, dm.insu2_resid1);
        		cstmt.setString(45, dm.insu2_nm1);
        		cstmt.setString(46, dm.insu2_resid2);
        		cstmt.setString(47, dm.insu2_nm2);
        		cstmt.setString(48, dm.insu2_resid3); 
        		cstmt.setString(49, dm.insu2_nm3); 
        		cstmt.setString(50, dm.amt);
        		cstmt.setString(51, dm.sum);
        		cstmt.setString(52, dm.mm);
        		cstmt.setString(53, dm.dd);
        		cstmt.setString(54, dm.fix_cd);
        		cstmt.setString(55, dm.date);
        		cstmt.setString(56, dm.annual);
        		cstmt.setString(57, dm.sum_y1);
        		cstmt.setString(58, dm.sum_y2);
        		cstmt.setString(59, dm.sum_y3);
        		cstmt.setString(60, dm.ddct);
        		cstmt.setString(61, dm.ann_tot_amt);
        		cstmt.setString(62, dm.tax_year_amt);
        		cstmt.setString(63, dm.ddct_bs_ass_amt);
        		cstmt.setString(64, dm.flag);
        		cstmt.setString(65, dm.pre_tot_amt);
        		cstmt.setString(66, dm.pre_market_tot_amt);
        		cstmt.setString(67, dm.pre_tmoney_tot_amt);
        		cstmt.setString(68, dm.edu_tp);
        		cstmt.setString(69, dm.first_tot_amt);
        		cstmt.setString(70, dm.second_tot_amt);
        		cstmt.setString(71, dm.secu_no);
        		cstmt.setString(72, dm.fund_nm);        		
        		cstmt.setString(73, dm.att_frmmm);  					//2015 추가
        		cstmt.setString(74, dm.att_tomm);						//2015 추가
        		cstmt.setString(75, dm.att_inqrmm);					//2015 추가
        		cstmt.setString(76, dm.ftyr_tot_amt);					//2015 추가
        		cstmt.setString(77, dm.ftyr_market_tot_amt);		//2015 추가
        		cstmt.setString(78, dm.ftyr_tmoney_tot_amt);		//2015 추가
        		cstmt.setString(79, dm.first_year_tot_amt);					//2015 추가
        		cstmt.setString(80, dm.second_year_tot_amt);				//2015 추가
        		cstmt.setString(81, dm.inqr_strt_mm);					//2015 추가
        		cstmt.setString(82, dm.inqr_end_mm);					//2015 추가
        		cstmt.setString(83, dm.lend_loan_amt);				//2015 추가
        		
               // 실행
	    		cstmt.execute();
	    		System.out.println("dao 1-3. 쿼리 수행");
               // 결과
	    		ds = (HD_YADJM_157001_ADataSet)dm.createDataSetObject();               
	    		System.out.println("dao 1-4. 결과값 ds 에 담기");
	    		ds.getValues(cstmt);
	    		
	    		System.out.println("dao 1-5. 에러코드 => "+ds.errcode+", 에러메시지 => "+ds.errmsg);

	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

	    		System.out.println("dao 1-6.BLOB 타입 파일 처리 시작!!!");
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               
               	System.out.println("BLOB 타입 add_file 값 ===>" + dm.add_file);
               	// 첨부파일
               	if(dm.add_file != null && dm.add_file.length != 0){
               		System.out.println("BLOB 파일이 존재하면 쿼리를 수행한다");
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAHDM_YEARADJMFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+ dm.cmpy_cd + "' " +
		               					"   AND 	EMP_NO      = '"+ dm.emp_no + "' " +
		               					"   AND 	ADJM_RVRS_YY 	= '2015' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);
	               	
	               	//BLOB blob;

	             //  	System.out.println(dm.add_file);
	              // 	System.out.println(dm.add_file.length);


	               	if (rset1.next()) {  
	               	///////////////////////////////////////////////////////
	               	//ERP용시작
	               	/*
	                   weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	                   OutputStream os1 = oracle_blob1.getBinaryOutputStream();

	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   //for(int i=0; i<dm.add_file.length; i++){
	                       os1.write(dm.add_file[1]);
		                   System.out.println(dm.add_file);
	                   //}
	                   os1.close();
	               	*/
	                //ERP용끝
	               	////////////////////////////////////////////////////////////
	                   
	                   
	                ////////////////////////////////////////////////////////////   
	               	/*ESS용시작                                                                                                        */
	               		
		               	BLOB blob = (oracle.sql.BLOB)rset1.getBlob(1);
	               		OutputStream os1 = blob.getBinaryOutputStream();
	               		System.out.println("os1 =======> "+os1);
	               		
	               		
	               		//BLOB blob = ((oracle.jdbc.driver.OracleResultSet)rset1).getBLOB(1);
	                    //OutputStream os1 = blob.getBinaryOutputStream();

	               		//BLOB blob = ((OracleResultSet)rset1).getBLOB(1);
	               		//BufferedOutputStream os1 = new BufferedOutputStream(blob.getBinaryOutputStream());

	               		//try{
	               	   //파일로부터 읽어서 BLOB 에 WRITE 한다.
		                   //for(int i=0; i<dm.add_file.length; i++){
	               		System.out.println("add_file 을 DB에 쓴다!!!");
		                       os1.write(dm.add_file);
			           //        System.out.println(dm.add_file);
		                   //}
	                   	   
	                   os1.close();
	                   
	                   //}
	                   //catch( IOException ie )
	                   //{
	                	//   System.out.println( "blob write error - " + ie );
	                   //}
	                   
	                   /*ESS용끝                                                                                                        */
	                   ///////////////////////////////////////////////////////////////
	                   
	                   
	               	}
               	}
               stmt.close();
               manager.m_conn.commit();
               manager.disConnection();
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   System.out.println("EXCEP-1");
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            System.out.println("EXCEP-2");
            System.out.println(e);
            throw new AppException(ds.errcode, ds.errmsg);
            //throw new SysException(e);
           }
        }else{   
        	DBManager manager = new DBManager("MISHDL");
            System.out.println("EXCEP-첨부파일이 없거나 정상flag가 아닌경우 탄다.");
        	ds = (HD_YADJM_157001_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
	
	}
	
//	2016연말정산파일업로드 DAO
	public HD_YADJM_167001_ADataSet hd_yadjm_167001_a(HD_YADJM_167001_ADM dm) throws AppException {
		HD_YADJM_167001_ADataSet  ds = null;
		System.out.println("&&&& hd_yadjm_167001_a DAO 호출 됐음!!! &&& " ); 
		System.out.println("2016년 add_file::::"+dm.add_file);
		
        // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	if(dm.add_file != null && !dm.getFlag().equals("D")){
    		System.out.println("dao 1-1.첨부파일 존재하고 삭제가 아닌경우 수행된다.");
    		/*String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		byte[] add_file;   	   // 첨부파일 내용(임시 )

    		
    		add_file = dm.add_file;
			*/
    		DBManager manager = null;
    		try {
          	
               	manager = new DBManager("MISHDL");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("dao 1-2.getSQL에 dm 파라미터 셋팅");
               // 파라미터 설정
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.adjm_rvrs_yy);
        		cstmt.setString(5, dm.emp_no);
        		cstmt.setString(6, dm.incmg_pers);
        		cstmt.setString(7, dm.incmg_pers_ip);
        		cstmt.setString(8, dm.add_file_nm1);
        		cstmt.setBytes(9, "0101".getBytes());
        		cstmt.setString(10, dm.doc_type);
        		cstmt.setString(11, dm.seq);
        		cstmt.setString(12, dm.att_year);
        		cstmt.setString(13, dm.form_cd);
        		cstmt.setString(14, dm.resid);
        		cstmt.setString(15, dm.name);
        		cstmt.setString(16, dm.dat_cd);
        		cstmt.setString(17, dm.busnid);
        		cstmt.setString(18, dm.trade_nm);
        		cstmt.setString(19, dm.acc_no);
        		cstmt.setString(20, dm.use_place_cd);
        		cstmt.setString(21, dm.donation_cd);
        		cstmt.setString(22, dm.course_cd);
        		cstmt.setString(23, dm.subject_nm);
        		cstmt.setString(24, dm.start_dt);
        		cstmt.setString(25, dm.end_dt);
        		cstmt.setString(26, dm.com_cd);
        		cstmt.setString(27, dm.pension_cd);
        		cstmt.setString(28, dm.goods_nm);
        		cstmt.setString(29, dm.lend_dt);
        		cstmt.setString(30, dm.lend_kd);
        		cstmt.setString(31, dm.house_take_dt);
        		cstmt.setString(32, dm.mort_setup_dt);
        		cstmt.setString(33, dm.repay_years);
        		cstmt.setString(34, dm.lend_goods_nm);
        		cstmt.setString(35, dm.debt);
        		cstmt.setString(36, dm.fixed_rate_debt);
        		cstmt.setString(37, dm.not_defer_debt);
        		cstmt.setString(38, dm.this_year_rede_amt);
        		cstmt.setString(39, dm.saving_gubn);
        		cstmt.setString(40, dm.reg_dt);
        		cstmt.setString(41, dm.pay_method);
        		cstmt.setString(42, dm.insu1_resid);
        		cstmt.setString(43, dm.insu1_nm);
        		cstmt.setString(44, dm.insu2_resid1);
        		cstmt.setString(45, dm.insu2_nm1);
        		cstmt.setString(46, dm.insu2_resid2);
        		cstmt.setString(47, dm.insu2_nm2);
        		cstmt.setString(48, dm.insu2_resid3); 
        		cstmt.setString(49, dm.insu2_nm3); 
        		cstmt.setString(50, dm.amt);
        		cstmt.setString(51, dm.sum);
        		cstmt.setString(52, dm.mm);
        		cstmt.setString(53, dm.dd);
        		cstmt.setString(54, dm.fix_cd);
        		cstmt.setString(55, dm.date);
        		cstmt.setString(56, dm.annual);
        		cstmt.setString(57, dm.sum_y1);
        		cstmt.setString(58, dm.sum_y2);
        		cstmt.setString(59, dm.sum_y3);
        		cstmt.setString(60, dm.ddct);
        		cstmt.setString(61, dm.ann_tot_amt);
        		cstmt.setString(62, dm.tax_year_amt);
        		cstmt.setString(63, dm.ddct_bs_ass_amt);
        		cstmt.setString(64, dm.flag);
        		cstmt.setString(65, dm.pre_tot_amt);
        		cstmt.setString(66, dm.pre_market_tot_amt);
        		cstmt.setString(67, dm.pre_tmoney_tot_amt);
        		cstmt.setString(68, dm.edu_tp);
        		cstmt.setString(69, dm.first_tot_amt);
        		cstmt.setString(70, dm.second_tot_amt);
        		cstmt.setString(71, dm.secu_no);
        		cstmt.setString(72, dm.fund_nm);        		
        		cstmt.setString(73, dm.att_frmmm);  					//2015 추가
        		cstmt.setString(74, dm.att_tomm);						//2015 추가
        		cstmt.setString(75, dm.att_inqrmm);					//2015 추가
        		cstmt.setString(76, dm.ftyr_tot_amt);					//2015 추가
        		cstmt.setString(77, dm.ftyr_market_tot_amt);		//2015 추가
        		cstmt.setString(78, dm.ftyr_tmoney_tot_amt);		//2015 추가
        		cstmt.setString(79, dm.first_year_tot_amt);					//2015 추가
        		cstmt.setString(80, dm.second_year_tot_amt);				//2015 추가
        		cstmt.setString(81, dm.inqr_strt_mm);					//2015 추가
        		cstmt.setString(82, dm.inqr_end_mm);					//2015 추가
        		cstmt.setString(83, dm.lend_loan_amt);				//2015 추가
        		//cstmt.setString(84, dm.hi_yrs);     //2016 추가
        		//cstmt.setString(85, dm.ltrm_yrs);	//2016 추가
        		//cstmt.setString(84, dm.hi_ntf );	//2016 추가
        		//cstmt.setString(85, dm.ltrm_ntf);	//2016 추가
        		//cstmt.setString(86, dm.hi_pmt);		//2016 추가
        		//cstmt.setString(87, dm.ltrm_pmt);	//2016 추가
        		//cstmt.setString(90, dm.spym);		//2016 추가
        		//cstmt.setString(91, dm.jlc);		//2016 추가
        		//cstmt.setString(92, dm.ntf);		//2016 추가
        		//cstmt.setString(93, dm.pmt);		//2016 추가
        		//cstmt.setString(84, dm.wrkp_ntf);	//2016 추가
        		//cstmt.setString(85, dm.rgn_pmt);	//2016 추가
        		//cstmt.setString(90, dm.apln);		//2016 추가
        		cstmt.setString(84, dm.sbdy_apln_sum);	//2016 추가
        		cstmt.setString(85, dm.conb_sum);	//2016 추가
        		
               // 실행
	    		cstmt.execute();
	    		System.out.println("dao 1-3. 쿼리 수행");
               // 결과
	    		ds = (HD_YADJM_167001_ADataSet)dm.createDataSetObject();               
	    		System.out.println("dao 1-4. 결과값 ds 에 담기");
	    		ds.getValues(cstmt);
	    		
	    		System.out.println("dao 1-5. 에러코드 => "+ds.errcode+", 에러메시지 => "+ds.errmsg);

	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

	    		System.out.println("dao 1-6.BLOB 타입 파일 처리 시작!!!");
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               
               	System.out.println("BLOB 타입 add_file 값 ===>" + dm.add_file);
               	// 첨부파일
               	if(dm.add_file != null && dm.add_file.length != 0){
               		System.out.println("BLOB 파일이 존재하면 쿼리를 수행한다");
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAHDM_YEARADJMFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+ dm.cmpy_cd + "' " +
		               					"   AND 	EMP_NO      = '"+ dm.emp_no + "' " +
		               					"   AND 	ADJM_RVRS_YY 	= '2016' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);
	               	
	               	//BLOB blob;

	             //  	System.out.println(dm.add_file);
	              // 	System.out.println(dm.add_file.length);
	               	System.out.println("DB에서 읽어옴 ㅊ");

	               	if (rset1.next()) {  
	               	///////////////////////////////////////////////////////
	               	//ERP용시작
	               	/*
	                   weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	                   OutputStream os1 = oracle_blob1.getBinaryOutputStream();

	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   //for(int i=0; i<dm.add_file.length; i++){
	                       os1.write(dm.add_file[1]);
		                   System.out.println(dm.add_file);
	                   //}
	                   os1.close();
	               	*/
	                //ERP용끝
	               	////////////////////////////////////////////////////////////
	                   
	                   
	                ////////////////////////////////////////////////////////////   
	               	/*ESS용시작                                                                                                        */
	                
		               	BLOB blob = (oracle.sql.BLOB)rset1.getBlob(1);
	               		OutputStream os1 = blob.getBinaryOutputStream();
	               		System.out.println("os1 =======> "+os1);
	               		
	               		
	               		//BLOB blob = ((oracle.jdbc.driver.OracleResultSet)rset1).getBLOB(1);
	                    //OutputStream os1 = blob.getBinaryOutputStream();

	               		//BLOB blob = ((OracleResultSet)rset1).getBLOB(1);
	               		//BufferedOutputStream os1 = new BufferedOutputStream(blob.getBinaryOutputStream());

	               		//try{
	               	   //파일로부터 읽어서 BLOB 에 WRITE 한다.
		                   //for(int i=0; i<dm.add_file.length; i++){
	               		System.out.println("add_file 을 DB에 쓴다!!!");
		                       os1.write(dm.add_file);
			           //        System.out.println(dm.add_file);
		                   //}
	                   	   
	                   os1.close();
	                   
	                   //}
	                   //catch( IOException ie )
	                   //{
	                	//   System.out.println( "blob write error - " + ie );
	                   //}
	                   
	                   /*ESS용끝                                                                                                        */
	                   ///////////////////////////////////////////////////////////////
	                   
	                   
	               	}
               	}
               stmt.close();
               manager.m_conn.commit();
               manager.disConnection();
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   System.out.println("EXCEP-1");
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            System.out.println("EXCEP-2");
            System.out.println(e);
            throw new AppException(ds.errcode, ds.errmsg);
            //throw new SysException(e);
           }
        }else{   
        	DBManager manager = new DBManager("MISHDL");
            System.out.println("EXCEP-첨부파일이 없거나 정상flag가 아닌경우 탄다.");
        	ds = (HD_YADJM_167001_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
	
	}
	
//	2017연말정산파일업로드 DAO
	public HD_YADJM_177001_ADataSet hd_yadjm_177001_a(HD_YADJM_177001_ADM dm) throws AppException {
		HD_YADJM_177001_ADataSet  ds = null;
		System.out.println("&&&& hd_yadjm_177001_a DAO 호출 됐음!!! &&& " ); 
		System.out.println("2017년 add_file::::"+dm.add_file);
		
        // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	if(dm.add_file != null && !dm.getFlag().equals("D")){
    		System.out.println("dao 1-1.첨부파일 존재하고 삭제가 아닌경우 수행된다.");
    		/*String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		byte[] add_file;   	   // 첨부파일 내용(임시 )

    		
    		add_file = dm.add_file;
			*/
    		DBManager manager = null;
    		try {
          	
               	manager = new DBManager("MISHDL");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("dao 1-2.getSQL에 dm 파라미터 셋팅111");
               // 파라미터 설정
               	System.out.println("dao 1-2.00000000000000000000");
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);      		
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.adjm_rvrs_yy);
        		cstmt.setString(5, dm.emp_no);
        		cstmt.setString(6, dm.incmg_pers);
        		cstmt.setString(7, dm.incmg_pers_ip);
        		cstmt.setString(8, dm.add_file_nm1);
        		cstmt.setBytes(9, "0101".getBytes());
        		cstmt.setString(10, dm.doc_type);
        		cstmt.setString(11, dm.seq);
        		cstmt.setString(12, dm.att_year);
        		cstmt.setString(13, dm.form_cd);
        		cstmt.setString(14, dm.resid);
        		cstmt.setString(15, dm.name);
        		cstmt.setString(16, dm.dat_cd);
        		cstmt.setString(17, dm.busnid);
        		cstmt.setString(18, dm.trade_nm);
        		cstmt.setString(19, dm.acc_no);
        		cstmt.setString(20, dm.use_place_cd);
        		cstmt.setString(21, dm.donation_cd);
        		cstmt.setString(22, dm.course_cd);
        		cstmt.setString(23, dm.subject_nm);
        		cstmt.setString(24, dm.start_dt);
        		cstmt.setString(25, dm.end_dt);
        		System.out.println("dao 1-2.11111111111111111");
        		cstmt.setString(26, dm.com_cd);
        		cstmt.setString(27, dm.pension_cd);
        		cstmt.setString(28, dm.goods_nm);
        		cstmt.setString(29, dm.lend_dt);
        		cstmt.setString(30, dm.lend_kd);
        		cstmt.setString(31, dm.house_take_dt);
        		cstmt.setString(32, dm.mort_setup_dt);
        		cstmt.setString(33, dm.repay_years);
        		cstmt.setString(34, dm.lend_goods_nm);
        		cstmt.setString(35, dm.debt);
        		cstmt.setString(36, dm.fixed_rate_debt);
        		cstmt.setString(37, dm.not_defer_debt);
        		cstmt.setString(38, dm.this_year_rede_amt);
        		cstmt.setString(39, dm.saving_gubn);
        		cstmt.setString(40, dm.reg_dt);
        		cstmt.setString(41, dm.pay_method);
        		cstmt.setString(42, dm.insu1_resid);
        		cstmt.setString(43, dm.insu1_nm);
        		cstmt.setString(44, dm.insu2_resid1);
        		cstmt.setString(45, dm.insu2_nm1);
        		cstmt.setString(46, dm.insu2_resid2);
        		cstmt.setString(47, dm.insu2_nm2);
        		cstmt.setString(48, dm.insu2_resid3); 
        		cstmt.setString(49, dm.insu2_nm3); 
        		cstmt.setString(50, dm.amt);
        		cstmt.setString(51, dm.sum);
        		cstmt.setString(52, dm.mm);
        		cstmt.setString(53, dm.dd);
        		cstmt.setString(54, dm.fix_cd);
        		cstmt.setString(55, dm.date);
        		cstmt.setString(56, dm.annual);
        		cstmt.setString(57, dm.sum_y1);
        		cstmt.setString(58, dm.sum_y2);
        		cstmt.setString(59, dm.sum_y3);
        		cstmt.setString(60, dm.ddct);
        		cstmt.setString(61, dm.ann_tot_amt);
        		cstmt.setString(62, dm.tax_year_amt);
        		cstmt.setString(63, dm.ddct_bs_ass_amt);
        		cstmt.setString(64, dm.flag);
        		cstmt.setString(65, dm.pre_tot_amt);
        		cstmt.setString(66, dm.pre_market_tot_amt);
        		cstmt.setString(67, dm.pre_tmoney_tot_amt);
        		cstmt.setString(68, dm.edu_tp);
        		System.out.println("dao 1-2.2222222222222222222");
        		cstmt.setString(69, dm.edu_cl);                    // 2017 추가
        		cstmt.setString(70, dm.first_tot_amt);
        		cstmt.setString(71, dm.second_tot_amt);
        		cstmt.setString(72, dm.secu_no);
        		cstmt.setString(73, dm.fund_nm);        		
        		cstmt.setString(74, dm.att_frmmm);  					//2015 추가
        		cstmt.setString(75, dm.att_tomm);						//2015 추가
        		cstmt.setString(76, dm.att_inqrmm);					//2015 추가
        		cstmt.setString(77, dm.ftyr_tot_amt);					//2015 추가
        		cstmt.setString(78, dm.ftyr_market_tot_amt);		//2015 추가
        		cstmt.setString(79, dm.ftyr_tmoney_tot_amt);		//2015 추가
        		cstmt.setString(80, dm.first_year_tot_amt);					//2015 추가
        		cstmt.setString(81, dm.second_year_tot_amt);				//2015 추가
        		cstmt.setString(82, dm.inqr_strt_mm);					//2015 추가
        		cstmt.setString(83, dm.inqr_end_mm);					//2015 추가
        		cstmt.setString(84, dm.lend_loan_amt);				//2015 추가
        		System.out.println("dao 1-2.3333333333333");
        		//cstmt.setString(84, dm.hi_yrs);     //2016 추가
        		//cstmt.setString(85, dm.ltrm_yrs);	//2016 추가
        		//cstmt.setString(84, dm.hi_ntf );	//2016 추가
        		//cstmt.setString(85, dm.ltrm_ntf);	//2016 추가
        		//cstmt.setString(86, dm.hi_pmt);		//2016 추가
        		//cstmt.setString(87, dm.ltrm_pmt);	//2016 추가
        		//cstmt.setString(90, dm.spym);		//2016 추가
        		//cstmt.setString(91, dm.jlc);		//2016 추가
        		//cstmt.setString(92, dm.ntf);		//2016 추가
        		//cstmt.setString(93, dm.pmt);		//2016 추가
        		//cstmt.setString(84, dm.wrkp_ntf);	//2016 추가
        		//cstmt.setString(85, dm.rgn_pmt);	//2016 추가
        		//cstmt.setString(90, dm.apln);		//2016 추가
        		cstmt.setString(85, dm.sbdy_apln_sum);	//2016 추가
        		cstmt.setString(86, dm.conb_sum);	//2016 추가
        		System.out.println("dao 1-2.444444444");
               // 실행
	    		cstmt.execute();
	    		System.out.println("dao 1-3. 쿼리 수행");
               // 결과
	    		ds = (HD_YADJM_177001_ADataSet)dm.createDataSetObject();               
	    		System.out.println("dao 1-4. 결과값 ds 에 담기");
	    		ds.getValues(cstmt);
	    		
	    		System.out.println("dao 1-5. 에러코드 => "+ds.errcode+", 에러메시지 => "+ds.errmsg);

	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

	    		System.out.println("dao 1-6.BLOB 타입 파일 처리 시작!!!");
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               
               	System.out.println("BLOB 타입 add_file 값 ===>" + dm.add_file);
               	// 첨부파일
               	if(dm.add_file != null && dm.add_file.length != 0){
               		System.out.println("BLOB 파일이 존재하면 쿼리를 수행한다");
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAHDM_YEARADJMFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+ dm.cmpy_cd + "' " +
		               					"   AND 	EMP_NO      = '"+ dm.emp_no + "' " +
		               					"   AND 	ADJM_RVRS_YY 	= '2017' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);
	               	
	               	//BLOB blob;

	             //  	System.out.println(dm.add_file);
	              // 	System.out.println(dm.add_file.length);
	               	System.out.println("DB에서 읽어옴 ㅊ");

	               	if (rset1.next()) {  
	               	///////////////////////////////////////////////////////
	               	//ERP용시작
	               	/*
	                   weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	                   OutputStream os1 = oracle_blob1.getBinaryOutputStream();

	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   //for(int i=0; i<dm.add_file.length; i++){
	                       os1.write(dm.add_file[1]);
		                   System.out.println(dm.add_file);
	                   //}
	                   os1.close();
	               	*/
	                //ERP용끝
	               	////////////////////////////////////////////////////////////
	                   
	                   
	                ////////////////////////////////////////////////////////////   
	               	/*ESS용시작                                                                                                        */
	                
		               	BLOB blob = (oracle.sql.BLOB)rset1.getBlob(1);
	               		OutputStream os1 = blob.getBinaryOutputStream();
	               		System.out.println("os1 =======> "+os1);
	               		
	               		
	               		//BLOB blob = ((oracle.jdbc.driver.OracleResultSet)rset1).getBLOB(1);
	                    //OutputStream os1 = blob.getBinaryOutputStream();

	               		//BLOB blob = ((OracleResultSet)rset1).getBLOB(1);
	               		//BufferedOutputStream os1 = new BufferedOutputStream(blob.getBinaryOutputStream());

	               		//try{
	               	   //파일로부터 읽어서 BLOB 에 WRITE 한다.
		                   //for(int i=0; i<dm.add_file.length; i++){
	               		System.out.println("add_file 을 DB에 쓴다!!!");
		                       os1.write(dm.add_file);
			           //        System.out.println(dm.add_file);
		                   //}
	                   	   
	                   os1.close();
	                   
	                   //}
	                   //catch( IOException ie )
	                   //{
	                	//   System.out.println( "blob write error - " + ie );
	                   //}
	                   
	                   /*ESS용끝                                                                                                        */
	                   ///////////////////////////////////////////////////////////////
	                   
	                   
	               	}
               	}
               stmt.close();
               manager.m_conn.commit();
               manager.disConnection();
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   System.out.println("EXCEP-1");
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            System.out.println("EXCEP-2");
            System.out.println(e);
            throw new AppException(ds.errcode, ds.errmsg);
            //throw new SysException(e);
           }
        }else{   
        	DBManager manager = new DBManager("MISHDL");
            System.out.println("EXCEP-첨부파일이 없거나 정상flag가 아닌경우 탄다.");
        	ds = (HD_YADJM_177001_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
	
	}
	

//	2018연말정산파일업로드 DAO
	public HD_YADJM_187001_ADataSet hd_yadjm_187001_a(HD_YADJM_187001_ADM dm) throws AppException {
		HD_YADJM_187001_ADataSet  ds = null;
		System.out.println("&&&& hd_yadjm_187001_a DAO 호출 됐음!!! &&& " ); 
		System.out.println("2018년 add_file::::"+dm.add_file);
		
        // 첨부파일이 존재할 경우  and 삭제가 아닐 경우 and 첨부파일 삭제가 아닐 경우 => 첨부파일의 내용을 임시로 저장한다.
    	if(dm.add_file != null && !dm.getFlag().equals("D")){
    		System.out.println("dao 1-1.첨부파일 존재하고 삭제가 아닌경우 수행된다.");
    		/*String c_temp = "";     // 회사코드(임시)
    		String r_temp = "";     // 보고구분(임시)
    		String m_temp = "";     // 작성일자(임시)
    		String r_tempSeq  = "";    // 보고번호(임시)
    		String a_tempSeq1 = "";    // 첨부파일번호(임시)
    		String a_tempSeq2 = "";    // 첨부파일번호(임시)
    		String a_tempSeq3 = "";    // 첨부파일번호(임시)
    		String a_tempSeq4 = "";    // 첨부파일번호(임시)
    		String a_tempSeq5 = "";    // 첨부파일번호(임시)
    		byte[] add_file;   	   // 첨부파일 내용(임시 )

    		
    		add_file = dm.add_file;
			*/
    		DBManager manager = null;
    		try {
          	
               	manager = new DBManager("MISHDL");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
            
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	System.out.println("dao 1-2.getSQL에 dm 파라미터 셋팅111");
               // 파라미터 설정
               	System.out.println("dao 1-2.00000000000000000000");
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);      		
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.adjm_rvrs_yy);
        		cstmt.setString(5, dm.emp_no);
        		cstmt.setString(6, dm.incmg_pers);
        		cstmt.setString(7, dm.incmg_pers_ip);
        		cstmt.setString(8, dm.add_file_nm1);
        		cstmt.setBytes(9, "0101".getBytes());
        		cstmt.setString(10, dm.doc_type);
        		cstmt.setString(11, dm.seq);
        		cstmt.setString(12, dm.att_year);
        		cstmt.setString(13, dm.form_cd);
        		cstmt.setString(14, dm.resid);
        		cstmt.setString(15, dm.name);
        		cstmt.setString(16, dm.dat_cd);
        		cstmt.setString(17, dm.busnid);
        		cstmt.setString(18, dm.trade_nm);
        		cstmt.setString(19, dm.acc_no);
        		cstmt.setString(20, dm.use_place_cd);
        		cstmt.setString(21, dm.donation_cd);
        		cstmt.setString(22, dm.course_cd);
        		cstmt.setString(23, dm.subject_nm);
        		cstmt.setString(24, dm.start_dt);
        		cstmt.setString(25, dm.end_dt);
        		System.out.println("dao 1-2.11111111111111111");
        		cstmt.setString(26, dm.com_cd);
        		cstmt.setString(27, dm.pension_cd);
        		cstmt.setString(28, dm.goods_nm);
        		cstmt.setString(29, dm.lend_dt);
        		cstmt.setString(30, dm.lend_kd);
        		cstmt.setString(31, dm.house_take_dt);
        		cstmt.setString(32, dm.mort_setup_dt);
        		cstmt.setString(33, dm.repay_years);
        		cstmt.setString(34, dm.lend_goods_nm);
        		cstmt.setString(35, dm.debt);
        		cstmt.setString(36, dm.fixed_rate_debt);
        		cstmt.setString(37, dm.not_defer_debt);
        		cstmt.setString(38, dm.this_year_rede_amt);
        		cstmt.setString(39, dm.saving_gubn);
        		cstmt.setString(40, dm.reg_dt);
        		cstmt.setString(41, dm.pay_method);
        		cstmt.setString(42, dm.insu1_resid);
        		cstmt.setString(43, dm.insu1_nm);
        		cstmt.setString(44, dm.insu2_resid1);
        		cstmt.setString(45, dm.insu2_nm1);
        		cstmt.setString(46, dm.insu2_resid2);
        		cstmt.setString(47, dm.insu2_nm2);
        		cstmt.setString(48, dm.insu2_resid3); 
        		cstmt.setString(49, dm.insu2_nm3); 
        		cstmt.setString(50, dm.amt);
        		cstmt.setString(51, dm.sum);
        		cstmt.setString(52, dm.mm);
        		cstmt.setString(53, dm.dd);
        		cstmt.setString(54, dm.fix_cd);
        		cstmt.setString(55, dm.date);
        		cstmt.setString(56, dm.annual);
        		cstmt.setString(57, dm.sum_y1);
        		cstmt.setString(58, dm.sum_y2);
        		cstmt.setString(59, dm.sum_y3);
        		cstmt.setString(60, dm.ddct);
        		cstmt.setString(61, dm.ann_tot_amt);
        		cstmt.setString(62, dm.tax_year_amt);
        		cstmt.setString(63, dm.ddct_bs_ass_amt);
        		cstmt.setString(64, dm.flag);
        		cstmt.setString(65, dm.pre_tot_amt);
        		cstmt.setString(66, dm.pre_market_tot_amt);
        		cstmt.setString(67, dm.pre_tmoney_tot_amt);
        		cstmt.setString(68, dm.edu_tp);
        		System.out.println("dao 1-2.2222222222222222222");
        		cstmt.setString(69, dm.edu_cl);                    // 2017 추가
        		cstmt.setString(70, dm.first_tot_amt);
        		cstmt.setString(71, dm.second_tot_amt);
        		cstmt.setString(72, dm.secu_no);
        		cstmt.setString(73, dm.fund_nm);        		
        		cstmt.setString(74, dm.att_frmmm);  					//2015 추가
        		cstmt.setString(75, dm.att_tomm);						//2015 추가
        		cstmt.setString(76, dm.att_inqrmm);					//2015 추가
        		cstmt.setString(77, dm.ftyr_tot_amt);					//2015 추가
        		cstmt.setString(78, dm.ftyr_market_tot_amt);		//2015 추가
        		cstmt.setString(79, dm.ftyr_tmoney_tot_amt);		//2015 추가
        		cstmt.setString(80, dm.first_year_tot_amt);					//2015 추가
        		cstmt.setString(81, dm.second_year_tot_amt);				//2015 추가
        		cstmt.setString(82, dm.inqr_strt_mm);					//2015 추가
        		cstmt.setString(83, dm.inqr_end_mm);					//2015 추가
        		cstmt.setString(84, dm.lend_loan_amt);				//2015 추가
        		System.out.println("dao 1-2.3333333333333");
        		//cstmt.setString(84, dm.hi_yrs);     //2016 추가
        		//cstmt.setString(85, dm.ltrm_yrs);	//2016 추가
        		//cstmt.setString(84, dm.hi_ntf );	//2016 추가
        		//cstmt.setString(85, dm.ltrm_ntf);	//2016 추가
        		//cstmt.setString(86, dm.hi_pmt);		//2016 추가
        		//cstmt.setString(87, dm.ltrm_pmt);	//2016 추가
        		//cstmt.setString(90, dm.spym);		//2016 추가
        		//cstmt.setString(91, dm.jlc);		//2016 추가
        		//cstmt.setString(92, dm.ntf);		//2016 추가
        		//cstmt.setString(93, dm.pmt);		//2016 추가
        		//cstmt.setString(84, dm.wrkp_ntf);	//2016 추가
        		//cstmt.setString(85, dm.rgn_pmt);	//2016 추가
        		//cstmt.setString(90, dm.apln);		//2016 추가
        		cstmt.setString(85, dm.sbdy_apln_sum);	//2016 추가
        		cstmt.setString(86, dm.conb_sum);	//2016 추가
        		System.out.println("dao 1-2.444444444");
               // 실행
	    		cstmt.execute();
	    		System.out.println("dao 1-3. 쿼리 수행");
               // 결과
	    		ds = (HD_YADJM_187001_ADataSet)dm.createDataSetObject();               
	    		System.out.println("dao 1-4. 결과값 ds 에 담기");
	    		ds.getValues(cstmt);
	    		
	    		System.out.println("dao 1-5. 에러코드 => "+ds.errcode+", 에러메시지 => "+ds.errmsg);

	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}

	    		System.out.println("dao 1-6.BLOB 타입 파일 처리 시작!!!");
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               
               	System.out.println("BLOB 타입 add_file 값 ===>" + dm.add_file);
               	// 첨부파일
               	if(dm.add_file != null && dm.add_file.length != 0){
               		System.out.println("BLOB 파일이 존재하면 쿼리를 수행한다");
	               	String blobQuery1 =	"	SELECT 	ADD_FILE " +
		               					"  	FROM 	TAHDM_YEARADJMFILE " +
		               					" 	WHERE 	CMPY_CD     = '"+ dm.cmpy_cd + "' " +
		               					"   AND 	EMP_NO      = '"+ dm.emp_no + "' " +
		               					"   AND 	ADJM_RVRS_YY 	= '2017' " +
		               					"	FOR 	UPDATE";	
	               	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);
	               	
	               	//BLOB blob;

	             //  	System.out.println(dm.add_file);
	              // 	System.out.println(dm.add_file.length);
	               	System.out.println("DB에서 읽어옴 ㅊ");

	               	if (rset1.next()) {  
	               	///////////////////////////////////////////////////////
	               	//ERP용시작
	               	/*
	                   weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	                   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
	                   OutputStream os1 = oracle_blob1.getBinaryOutputStream();

	                   // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                   //for(int i=0; i<dm.add_file.length; i++){
	                       os1.write(dm.add_file[1]);
		                   System.out.println(dm.add_file);
	                   //}
	                   os1.close();
	               	*/
	                //ERP용끝
	               	////////////////////////////////////////////////////////////
	                   
	                   
	                ////////////////////////////////////////////////////////////   
	               	/*ESS용시작                                                                                                        */
	                
		               	BLOB blob = (oracle.sql.BLOB)rset1.getBlob(1);
	               		OutputStream os1 = blob.getBinaryOutputStream();
	               		System.out.println("os1 =======> "+os1);
	               		
	               		
	               		//BLOB blob = ((oracle.jdbc.driver.OracleResultSet)rset1).getBLOB(1);
	                    //OutputStream os1 = blob.getBinaryOutputStream();

	               		//BLOB blob = ((OracleResultSet)rset1).getBLOB(1);
	               		//BufferedOutputStream os1 = new BufferedOutputStream(blob.getBinaryOutputStream());

	               		//try{
	               	   //파일로부터 읽어서 BLOB 에 WRITE 한다.
		                   //for(int i=0; i<dm.add_file.length; i++){
	               		System.out.println("add_file 을 DB에 쓴다!!!");
		                       os1.write(dm.add_file);
			           //        System.out.println(dm.add_file);
		                   //}
	                   	   
	                   os1.close();
	                   
	                   //}
	                   //catch( IOException ie )
	                   //{
	                	//   System.out.println( "blob write error - " + ie );
	                   //}
	                   
	                   /*ESS용끝                                                                                                        */
	                   ///////////////////////////////////////////////////////////////
	                   
	                   
	               	}
               	}
               stmt.close();
               manager.m_conn.commit();
               manager.disConnection();
           } catch (Exception e) {
        	   try{
        		   manager.m_conn.rollback();
        	   }catch(SQLException se){
        		   System.out.println("EXCEP-1");
        		   throw new SysException(se);
        	   }
            manager.disConnection();
            System.out.println("EXCEP-2");
            System.out.println(e);
            throw new AppException(ds.errcode, ds.errmsg);
            //throw new SysException(e);
           }
        }else{   
        	DBManager manager = new DBManager("MISHDL");
            System.out.println("EXCEP-첨부파일이 없거나 정상flag가 아닌경우 탄다.");
        	ds = (HD_YADJM_187001_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
	
	}

}

