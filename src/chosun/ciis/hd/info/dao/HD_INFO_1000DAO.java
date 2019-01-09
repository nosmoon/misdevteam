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

package chosun.ciis.hd.info.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */
public class HD_INFO_1000DAO {
	
	public HD_INFO_1000_LDataSet getHd_info_1000(HD_INFO_1000_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_INFO_1000_LDataSet ds = (HD_INFO_1000_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	  
    public HD_INFO_1001_LDataSet getHd_info_1001(HD_INFO_1001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1001_LDataSet ds = (HD_INFO_1001_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_INFO_1002_SDataSet getHd_info_1002(HD_INFO_1002_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1002_SDataSet ds = (HD_INFO_1002_SDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public HD_INFO_1003_ADataSet hd_info_1003_a(HD_INFO_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1003_ADataSet ds = (HD_INFO_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_1004_SDataSet hd_info_1004_s(HD_INFO_1004_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1004_SDataSet ds = (HD_INFO_1004_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_1005_LDataSet hd_info_1005_l(HD_INFO_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1005_LDataSet ds = (HD_INFO_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_1008_LDataSet hd_info_1008_l(HD_INFO_1008_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1008_LDataSet ds = (HD_INFO_1008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_1009_ADataSet hd_info_1009_A(HD_INFO_1009_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1009_ADataSet ds = (HD_INFO_1009_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    public HD_INFO_1010_LDataSet getHd_info_1010(HD_INFO_1010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1010_LDataSet ds = (HD_INFO_1010_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_INFO_1011_LDataSet getHd_info_1011(HD_INFO_1011_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1011_LDataSet ds = (HD_INFO_1011_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	public HD_INFO_1012_ADataSet hd_info_1012_a(HD_INFO_1012_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1012_ADataSet ds = (HD_INFO_1012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    public HD_INFO_1013_LDataSet getHd_info_1013(HD_INFO_1013_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1013_LDataSet ds = (HD_INFO_1013_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_INFO_1014_LDataSet hd_info_1014_l(HD_INFO_1014_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1014_LDataSet ds = (HD_INFO_1014_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public HD_INFO_1020_LDataSet getHd_info_1020(HD_INFO_1020_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1020_LDataSet ds = (HD_INFO_1020_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_INFO_1021_LDataSet getHd_info_1021(HD_INFO_1021_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1021_LDataSet ds = (HD_INFO_1021_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_INFO_1022_LDataSet getHd_info_1022(HD_INFO_1022_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1022_LDataSet ds = (HD_INFO_1022_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_INFO_1023_LDataSet getHd_info_1023(HD_INFO_1023_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1023_LDataSet ds = (HD_INFO_1023_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	public HD_INFO_1024_ADataSet hd_info_1024_a(HD_INFO_1024_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1024_ADataSet ds = (HD_INFO_1024_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_INFO_1025_UDataSet hd_info_1025_u(HD_INFO_1025_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1025_UDataSet ds = (HD_INFO_1025_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_1026_LDataSet hd_info_1026_l(HD_INFO_1026_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1026_LDataSet ds = (HD_INFO_1026_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    public HD_INFO_1031_LDataSet getHd_info_1031(HD_INFO_1031_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1031_LDataSet ds = (HD_INFO_1031_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_INFO_1032_LDataSet getHd_info_1032(HD_INFO_1032_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1032_LDataSet ds = (HD_INFO_1032_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public HD_INFO_1033_ADataSet hd_info_1033_a(HD_INFO_1033_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1033_ADataSet ds = (HD_INFO_1033_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
    }

    public HD_INFO_1041_LDataSet getHd_info_1041(HD_INFO_1041_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1041_LDataSet ds = (HD_INFO_1041_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_INFO_1042_LDataSet getHd_info_1042(HD_INFO_1042_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1042_LDataSet ds = (HD_INFO_1042_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public HD_INFO_1043_ADataSet hd_info_1043_a(HD_INFO_1043_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1043_ADataSet ds = (HD_INFO_1043_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public HD_INFO_1051_LDataSet getHd_info_1051(HD_INFO_1051_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1051_LDataSet ds = (HD_INFO_1051_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_INFO_1052_LDataSet getHd_info_1052(HD_INFO_1052_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1052_LDataSet ds = (HD_INFO_1052_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
//    public BaseDataSet getHd_info_1053(HD_INFO_1053_ADM dm) throws AppException {
//
//        DBManager manager = new DBManager("MISHDL");
//        BaseDataSet ds = (BaseDataSet) manager.executeCall(dm);
//
//        if (!"".equals(ds.getErrcode())) {
//        	System.out.println("DAO..error.");
//            throw new AppException(ds.getErrcode(), ds.getErrmsg());
//        }
//        return ds;
//    }

	public HD_INFO_1053_ADataSet hd_info_1053_a(HD_INFO_1053_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1053_ADataSet ds = (HD_INFO_1053_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_1060_LDataSet hd_info_1060_l(HD_INFO_1060_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1060_LDataSet ds = (HD_INFO_1060_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
//    public HD_INFO_1061_LDataSet getHd_info_1061(HD_INFO_1061_LDM dm) throws AppException {
//
//        DBManager manager = new DBManager("MISHDL");
//        HD_INFO_1061_LDataSet ds = (HD_INFO_1061_LDataSet) manager.executeCall(dm);
//
//        if (!"".equals(ds.errcode)) {
//        	System.out.println("DAO..error.");
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }

	public HD_INFO_1061_LDataSet hd_info_1061_l(HD_INFO_1061_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1061_LDataSet ds = (HD_INFO_1061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
	public HD_INFO_1062_ADataSet hd_info_1062_a(HD_INFO_1062_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1062_ADataSet ds = (HD_INFO_1062_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public HD_INFO_1071_LDataSet getHd_info_1071(HD_INFO_1071_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1071_LDataSet ds = (HD_INFO_1071_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public HD_INFO_1072_ADataSet hd_info_1072_a(HD_INFO_1072_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1072_ADataSet ds = (HD_INFO_1072_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_1080_LDataSet hd_info_1080_l(HD_INFO_1080_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1080_LDataSet ds = (HD_INFO_1080_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_INFO_1081_LDataSet hd_info_1081_l(HD_INFO_1081_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1081_LDataSet ds = (HD_INFO_1081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_INFO_1082_ADataSet hd_info_1082_a(HD_INFO_1082_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1082_ADataSet ds = (HD_INFO_1082_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_1083_LDataSet hd_info_1083_l(HD_INFO_1083_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1083_LDataSet ds = (HD_INFO_1083_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public HD_INFO_1091_LDataSet getHd_info_1091(HD_INFO_1091_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INFO_1091_LDataSet ds = (HD_INFO_1091_LDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public HD_INFO_1092_LDataSet hd_info_1092_l(HD_INFO_1092_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1092_LDataSet ds = (HD_INFO_1092_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_INFO_1093_ADataSet hd_info_1093_a(HD_INFO_1093_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1093_ADataSet ds = (HD_INFO_1093_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_1110_LDataSet hd_info_1110_l(HD_INFO_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1110_LDataSet ds = (HD_INFO_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	

	public HD_INFO_1120_LDataSet hd_info_1120_l(HD_INFO_1120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_1120_LDataSet ds = (HD_INFO_1120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
