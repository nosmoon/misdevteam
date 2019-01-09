/***************************************************************************************************
 * 파일명 : EN_INNEXP_1000DAO.java
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

package chosun.ciis.en.innexp.dao; 

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */
public class EN_INNEXP_1000DAO {
	
	public EN_INNEXP_1000_MDataSet en_innexp_1000_m(EN_INNEXP_1000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1000_MDataSet ds = (EN_INNEXP_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1001_LDataSet en_innexp_1001_l(EN_INNEXP_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1001_LDataSet ds = (EN_INNEXP_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1002_SDataSet en_innexp_1002_s(EN_INNEXP_1002_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1002_SDataSet ds = (EN_INNEXP_1002_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1003_LDataSet en_innexp_1003_l(EN_INNEXP_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1003_LDataSet ds = (EN_INNEXP_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1004_LDataSet en_innexp_1004_l(EN_INNEXP_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1004_LDataSet ds = (EN_INNEXP_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1005_LDataSet en_innexp_1005_l(EN_INNEXP_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1005_LDataSet ds = (EN_INNEXP_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1006_LDataSet en_innexp_1006_l(EN_INNEXP_1006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1006_LDataSet ds = (EN_INNEXP_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1007_LDataSet en_innexp_1007_l(EN_INNEXP_1007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1007_LDataSet ds = (EN_INNEXP_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1008_LDataSet en_innexp_1008_l(EN_INNEXP_1008_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1008_LDataSet ds = (EN_INNEXP_1008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1009_LDataSet en_innexp_1009_l(EN_INNEXP_1009_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1009_LDataSet ds = (EN_INNEXP_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1010_ADataSet en_innexp_1010_a(EN_INNEXP_1010_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1010_ADataSet ds = (EN_INNEXP_1010_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public EN_INNEXP_1020_ADataSet en_innexp_1020_a(EN_INNEXP_1020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1020_ADataSet ds = (EN_INNEXP_1020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public EN_INNEXP_1011_LDataSet en_innexp_1011_l(EN_INNEXP_1011_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1011_LDataSet ds = (EN_INNEXP_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1012_LDataSet en_innexp_1012_l(EN_INNEXP_1012_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1012_LDataSet ds = (EN_INNEXP_1012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1013_LDataSet en_innexp_1013_l(EN_INNEXP_1013_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1013_LDataSet ds = (EN_INNEXP_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1014_LDataSet en_innexp_1014_l(EN_INNEXP_1014_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1014_LDataSet ds = (EN_INNEXP_1014_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1015_LDataSet en_innexp_1015_l(EN_INNEXP_1015_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1015_LDataSet ds = (EN_INNEXP_1015_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public EN_INNEXP_1016_LDataSet en_innexp_1016_l(EN_INNEXP_1016_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1016_LDataSet ds = (EN_INNEXP_1016_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1017_MDataSet en_innexp_1017_m(EN_INNEXP_1017_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1017_MDataSet ds = (EN_INNEXP_1017_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1019_MDataSet en_innexp_1019_m(EN_INNEXP_1019_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1019_MDataSet ds = (EN_INNEXP_1019_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1100_MDataSet en_innexp_1100_m(EN_INNEXP_1100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1100_MDataSet ds = (EN_INNEXP_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1101_LDataSet en_innexp_1101_l(EN_INNEXP_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1101_LDataSet ds = (EN_INNEXP_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1102_LDataSet en_innexp_1102_l(EN_INNEXP_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1102_LDataSet ds = (EN_INNEXP_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1103_ADataSet en_innexp_1103_a(EN_INNEXP_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1103_ADataSet ds = (EN_INNEXP_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1301_LDataSet en_innexp_1301_l(EN_INNEXP_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1301_LDataSet ds = (EN_INNEXP_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1302_IDataSet en_innexp_1302_i(EN_INNEXP_1302_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1302_IDataSet ds = (EN_INNEXP_1302_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public EN_INNEXP_1303_UDataSet en_innexp_1303_u(EN_INNEXP_1303_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1303_UDataSet ds = (EN_INNEXP_1303_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
    public EN_INNEXP_1305_LDataSet en_innexp_1305_l(EN_INNEXP_1305_LDM dm) throws AppException {
		 DBManager manager = new DBManager("MISENP");
	  	 EN_INNEXP_1305_LDataSet ds = (EN_INNEXP_1305_LDataSet)manager.executeCall(dm);

	 	 if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		 }

		 return ds;
	}
    
    public EN_INNEXP_1306_IDataSet en_innexp_1306_i(EN_INNEXP_1306_IDM dm) throws AppException {
		 DBManager manager = new DBManager("MISENP");
		 EN_INNEXP_1306_IDataSet ds = (EN_INNEXP_1306_IDataSet)manager.executeCall(dm);

	 	 if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		 }

		 return ds;
	}

    public EN_INNEXP_1307_IDataSet en_innexp_1307_i(EN_INNEXP_1307_IDM dm) throws AppException {
		 DBManager manager = new DBManager("MISENP");
		 EN_INNEXP_1307_IDataSet ds = (EN_INNEXP_1307_IDataSet)manager.executeCall(dm);

	 	 if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		 }

		 return ds;
	}
    
    public EN_INNEXP_1308_UDataSet en_innexp_1308_u(EN_INNEXP_1308_UDM dm) throws AppException {
		 DBManager manager = new DBManager("MISENP");
		 EN_INNEXP_1308_UDataSet ds = (EN_INNEXP_1308_UDataSet)manager.executeCall(dm);

	 	 if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		 }

		 return ds;
	}
    
    public EN_INNEXP_1309_UDataSet en_innexp_1309_u(EN_INNEXP_1309_UDM dm) throws AppException {
		 DBManager manager = new DBManager("MISENP");
		 EN_INNEXP_1309_UDataSet ds = (EN_INNEXP_1309_UDataSet)manager.executeCall(dm);

	 	 if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		 }

		 return ds;
	}
    
	public EN_INNEXP_1401_MDataSet en_innexp_1401_m(EN_INNEXP_1401_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1401_MDataSet ds = (EN_INNEXP_1401_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1402_LDataSet en_innexp_1402_l(EN_INNEXP_1402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1402_LDataSet ds = (EN_INNEXP_1402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public EN_INNEXP_1501_LDataSet en_innexp_1501_l(EN_INNEXP_1501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1501_LDataSet ds = (EN_INNEXP_1501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public EN_INNEXP_1502_LDataSet en_innexp_1502_l(EN_INNEXP_1502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1502_LDataSet ds = (EN_INNEXP_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public EN_INNEXP_1503_LDataSet en_innexp_1503_l(EN_INNEXP_1503_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1503_LDataSet ds = (EN_INNEXP_1503_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public EN_INNEXP_1504_LDataSet en_innexp_1504_l(EN_INNEXP_1504_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1504_LDataSet ds = (EN_INNEXP_1504_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public EN_INNEXP_1505_LDataSet en_innexp_1505_l(EN_INNEXP_1505_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1505_LDataSet ds = (EN_INNEXP_1505_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}
