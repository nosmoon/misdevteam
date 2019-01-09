/***************************************************************************************************
 * 파일명 : 
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

package chosun.ciis.is.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class IsBas1000DAO {
	
    public IS_BAS_1000_MDataSet is_bas_1000_m(IS_BAS_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1000_MDataSet ds = (IS_BAS_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BAS_1010_LDataSet is_bas_1010_l(IS_BAS_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1010_LDataSet ds = (IS_BAS_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BAS_1020_LDataSet is_bas_1020_l(IS_BAS_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1020_LDataSet ds = (IS_BAS_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BAS_1030_ADataSet is_bas_1030_a(IS_BAS_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1030_ADataSet ds = (IS_BAS_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BAS_1040_ADataSet is_bas_1040_a(IS_BAS_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1040_ADataSet ds = (IS_BAS_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BAS_1100_MDataSet is_bas_1100_m(IS_BAS_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1100_MDataSet ds = (IS_BAS_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1110_LDataSet is_bas_1110_l(IS_BAS_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1110_LDataSet ds = (IS_BAS_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1120_SDataSet is_bas_1120_s(IS_BAS_1120_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1120_SDataSet ds = (IS_BAS_1120_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1130_ADataSet is_bas_1130_a(IS_BAS_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1130_ADataSet ds = (IS_BAS_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1140_LDataSet is_bas_1140_l(IS_BAS_1140_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1140_LDataSet ds = (IS_BAS_1140_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1200_MDataSet is_bas_1200_m(IS_BAS_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1200_MDataSet ds = (IS_BAS_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1210_LDataSet is_bas_1210_l(IS_BAS_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1210_LDataSet ds = (IS_BAS_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1220_ADataSet is_bas_1220_a(IS_BAS_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1220_ADataSet ds = (IS_BAS_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1300_MDataSet is_bas_1300_m(IS_BAS_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1300_MDataSet ds = (IS_BAS_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public IS_BAS_1310_SDataSet is_bas_1310_s(IS_BAS_1310_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1310_SDataSet ds = (IS_BAS_1310_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BAS_1315_ADataSet is_bas_1315_a(IS_BAS_1315_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1315_ADataSet ds = (IS_BAS_1315_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

    public IS_BAS_1400_MDataSet is_bas_1400_m(IS_BAS_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1400_MDataSet ds = (IS_BAS_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1410_LDataSet is_bas_1410_l(IS_BAS_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1410_LDataSet ds = (IS_BAS_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1500_MDataSet is_bas_1500_m(IS_BAS_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1500_MDataSet ds = (IS_BAS_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1510_LDataSet is_bas_1510_l(IS_BAS_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1510_LDataSet ds = (IS_BAS_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1520_SDataSet is_bas_1520_s(IS_BAS_1520_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1520_SDataSet ds = (IS_BAS_1520_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1530_ADataSet is_bas_1530_a(IS_BAS_1530_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1530_ADataSet ds = (IS_BAS_1530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1600_MDataSet is_bas_1600_m(IS_BAS_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1600_MDataSet ds = (IS_BAS_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1610_LDataSet is_bas_1610_l(IS_BAS_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1610_LDataSet ds = (IS_BAS_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1700_MDataSet is_bas_1700_m(IS_BAS_1700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1700_MDataSet ds = (IS_BAS_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1710_LDataSet is_bas_1710_l(IS_BAS_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1710_LDataSet ds = (IS_BAS_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public IS_BAS_1800_MDataSet is_bas_1800_m(IS_BAS_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1800_MDataSet ds = (IS_BAS_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1810_LDataSet is_bas_1810_l(IS_BAS_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1810_LDataSet ds = (IS_BAS_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1820_LDataSet is_bas_1820_l(IS_BAS_1820_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1820_LDataSet ds = (IS_BAS_1820_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1830_ADataSet is_bas_1830_a(IS_BAS_1830_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1830_ADataSet ds = (IS_BAS_1830_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1900_MDataSet is_bas_1900_m(IS_BAS_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1900_MDataSet ds = (IS_BAS_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1910_LDataSet is_bas_1910_l(IS_BAS_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1910_LDataSet ds = (IS_BAS_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1920_ADataSet is_bas_1920_a(IS_BAS_1920_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1920_ADataSet ds = (IS_BAS_1920_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_1930_LDataSet is_bas_1930_l(IS_BAS_1930_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_1930_LDataSet ds = (IS_BAS_1930_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2000_MDataSet is_bas_2000_m(IS_BAS_2000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2000_MDataSet ds = (IS_BAS_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2010_LDataSet is_bas_2010_l(IS_BAS_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2010_LDataSet ds = (IS_BAS_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2020_ADataSet is_bas_2020_a(IS_BAS_2020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2020_ADataSet ds = (IS_BAS_2020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2030_LDataSet is_bas_2030_l(IS_BAS_2030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2030_LDataSet ds = (IS_BAS_2030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2040_LDataSet is_bas_2040_l(IS_BAS_2040_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2040_LDataSet ds = (IS_BAS_2040_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2050_ADataSet is_bas_2050_a(IS_BAS_2050_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2050_ADataSet ds = (IS_BAS_2050_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2100_MDataSet is_bas_2100_m(IS_BAS_2100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2100_MDataSet ds = (IS_BAS_2100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2110_LDataSet is_bas_2110_l(IS_BAS_2110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2110_LDataSet ds = (IS_BAS_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2120_ADataSet is_bas_2120_a(IS_BAS_2120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2120_ADataSet ds = (IS_BAS_2120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2200_MDataSet is_bas_2200_m(IS_BAS_2200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2200_MDataSet ds = (IS_BAS_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2210_LDataSet is_bas_2210_l(IS_BAS_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2210_LDataSet ds = (IS_BAS_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2220_ADataSet is_bas_2220_a(IS_BAS_2220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2220_ADataSet ds = (IS_BAS_2220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2300_MDataSet is_bas_2300_m(IS_BAS_2300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2300_MDataSet ds = (IS_BAS_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2310_LDataSet is_bas_2310_l(IS_BAS_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2310_LDataSet ds = (IS_BAS_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2320_ADataSet is_bas_2320_a(IS_BAS_2320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BAS_2320_ADataSet ds = (IS_BAS_2320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BAS_2400_MDataSet is_bas_2400_m(IS_BAS_2400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISISP");
		IS_BAS_2400_MDataSet ds = (IS_BAS_2400_MDataSet)manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
    
    public IS_BAS_2410_ADataSet is_bas_2410_a(IS_BAS_2410_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISISP");
		IS_BAS_2410_ADataSet ds = (IS_BAS_2410_ADataSet)manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}    
}
