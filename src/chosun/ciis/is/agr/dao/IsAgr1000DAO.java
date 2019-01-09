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

package chosun.ciis.is.agr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class IsAgr1000DAO {
	
    public IS_AGR_1000_MDataSet is_agr_1000_m(IS_AGR_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1000_MDataSet ds = (IS_AGR_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_AGR_1010_SDataSet is_agr_1010_s(IS_AGR_1010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1010_SDataSet ds = (IS_AGR_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_AGR_1015_ADataSet is_agr_1015_a(IS_AGR_1015_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1015_ADataSet ds = (IS_AGR_1015_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_AGR_1030_LDataSet is_agr_1030_l(IS_AGR_1030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1030_LDataSet ds = (IS_AGR_1030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_AGR_1031_SDataSet is_agr_1031_s(IS_AGR_1031_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1031_SDataSet ds = (IS_AGR_1031_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

    public IS_AGR_1032_SDataSet is_agr_1032_s(IS_AGR_1032_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1032_SDataSet ds = (IS_AGR_1032_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1040_LDataSet is_agr_1040_l(IS_AGR_1040_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1040_LDataSet ds = (IS_AGR_1040_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_1100_MDataSet is_agr_1100_m(IS_AGR_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1100_MDataSet ds = (IS_AGR_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_AGR_1110_LDataSet is_agr_1110_l(IS_AGR_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1110_LDataSet ds = (IS_AGR_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_1200_MDataSet is_agr_1200_m(IS_AGR_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1200_MDataSet ds = (IS_AGR_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_1310_LDataSet is_agr_1310_l(IS_AGR_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1310_LDataSet ds = (IS_AGR_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_AGR_1320_LDataSet is_agr_1320_l(IS_AGR_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1320_LDataSet ds = (IS_AGR_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    
    /**********************************************************************************/    
    
    
    public IS_AGR_1400_MDataSet is_agr_1400_m(IS_AGR_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1400_MDataSet ds = (IS_AGR_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1410_LDataSet is_agr_1410_l(IS_AGR_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1410_LDataSet ds = (IS_AGR_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1420_LDataSet is_agr_1420_l(IS_AGR_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1420_LDataSet ds = (IS_AGR_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_1510_LDataSet is_agr_1510_l(IS_AGR_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1510_LDataSet ds = (IS_AGR_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_1600_MDataSet is_agr_1600_m(IS_AGR_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1600_MDataSet ds = (IS_AGR_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1610_LDataSet is_agr_1610_l(IS_AGR_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1610_LDataSet ds = (IS_AGR_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1620_LDataSet is_agr_1620_l(IS_AGR_1620_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1620_LDataSet ds = (IS_AGR_1620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_1700_MDataSet is_agr_1700_m(IS_AGR_1700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1700_MDataSet ds = (IS_AGR_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1710_LDataSet is_agr_1710_l(IS_AGR_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1710_LDataSet ds = (IS_AGR_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_1800_MDataSet is_agr_1800_m(IS_AGR_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1800_MDataSet ds = (IS_AGR_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1810_LDataSet is_agr_1810_l(IS_AGR_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1810_LDataSet ds = (IS_AGR_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1820_LDataSet is_agr_1820_l(IS_AGR_1820_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1820_LDataSet ds = (IS_AGR_1820_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1830_LDataSet is_agr_1830_l(IS_AGR_1830_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1830_LDataSet ds = (IS_AGR_1830_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1840_LDataSet is_agr_1840_l(IS_AGR_1840_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1840_LDataSet ds = (IS_AGR_1840_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_1900_MDataSet is_agr_1900_m(IS_AGR_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1900_MDataSet ds = (IS_AGR_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1910_LDataSet is_agr_1910_l(IS_AGR_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1910_LDataSet ds = (IS_AGR_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1920_LDataSet is_agr_1920_l(IS_AGR_1920_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1920_LDataSet ds = (IS_AGR_1920_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1930_LDataSet is_agr_1930_l(IS_AGR_1930_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1930_LDataSet ds = (IS_AGR_1930_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_1940_LDataSet is_agr_1940_l(IS_AGR_1940_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_1940_LDataSet ds = (IS_AGR_1940_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    
    public IS_AGR_2000_MDataSet is_agr_2000_m(IS_AGR_2000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2000_MDataSet ds = (IS_AGR_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2010_LDataSet is_agr_2010_l(IS_AGR_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2010_LDataSet ds = (IS_AGR_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_2100_MDataSet is_agr_2100_m(IS_AGR_2100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2100_MDataSet ds = (IS_AGR_2100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2110_LDataSet is_agr_2110_l(IS_AGR_2110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2110_LDataSet ds = (IS_AGR_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2120_LDataSet is_agr_2120_l(IS_AGR_2120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2120_LDataSet ds = (IS_AGR_2120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_2200_MDataSet is_agr_2200_m(IS_AGR_2200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2200_MDataSet ds = (IS_AGR_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_AGR_2210_LDataSet is_agr_2210_l(IS_AGR_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2210_LDataSet ds = (IS_AGR_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2220_LDataSet is_agr_2220_l(IS_AGR_2220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2220_LDataSet ds = (IS_AGR_2220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_2300_MDataSet is_agr_2300_m(IS_AGR_2300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2300_MDataSet ds = (IS_AGR_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_AGR_2310_LDataSet is_agr_2310_l(IS_AGR_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2310_LDataSet ds = (IS_AGR_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2320_LDataSet is_agr_2320_l(IS_AGR_2320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2320_LDataSet ds = (IS_AGR_2320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2330_LDataSet is_agr_2330_l(IS_AGR_2330_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2330_LDataSet ds = (IS_AGR_2330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_2400_MDataSet is_agr_2400_m(IS_AGR_2400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2400_MDataSet ds = (IS_AGR_2400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2410_LDataSet is_agr_2410_l(IS_AGR_2410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2410_LDataSet ds = (IS_AGR_2410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2420_LDataSet is_agr_2420_l(IS_AGR_2420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2420_LDataSet ds = (IS_AGR_2420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2430_LDataSet is_agr_2430_l(IS_AGR_2430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2430_LDataSet ds = (IS_AGR_2430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2440_LDataSet is_agr_2440_l(IS_AGR_2440_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2440_LDataSet ds = (IS_AGR_2440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_2610_LDataSet is_agr_2610_l(IS_AGR_2610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2610_LDataSet ds = (IS_AGR_2610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_2700_MDataSet is_agr_2700_m(IS_AGR_2700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2700_MDataSet ds = (IS_AGR_2700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2710_SDataSet is_agr_2710_s(IS_AGR_2710_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2710_SDataSet ds = (IS_AGR_2710_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public IS_AGR_2715_ADataSet is_agr_2715_a(IS_AGR_2715_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2715_ADataSet ds = (IS_AGR_2715_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_2800_MDataSet is_agr_2800_m(IS_AGR_2800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2800_MDataSet ds = (IS_AGR_2800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2810_LDataSet is_agr_2810_l(IS_AGR_2810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2810_LDataSet ds = (IS_AGR_2810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_2900_MDataSet is_agr_2900_m(IS_AGR_2900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2900_MDataSet ds = (IS_AGR_2900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2910_LDataSet is_agr_2910_l(IS_AGR_2910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2910_LDataSet ds = (IS_AGR_2910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_2920_ADataSet is_agr_2920_a(IS_AGR_2920_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_2920_ADataSet ds = (IS_AGR_2920_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_3100_MDataSet is_agr_3100_m(IS_AGR_3100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_3100_MDataSet ds = (IS_AGR_3100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_3110_SDataSet is_agr_3110_s(IS_AGR_3110_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_3110_SDataSet ds = (IS_AGR_3110_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_3115_ADataSet is_agr_3115_a(IS_AGR_3115_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_3115_ADataSet ds = (IS_AGR_3115_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    /**********************************************************************************/
    
    
    public IS_AGR_3200_MDataSet is_agr_3200_m(IS_AGR_3200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_3200_MDataSet ds = (IS_AGR_3200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_3210_LDataSet is_agr_3210_l(IS_AGR_3210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_3210_LDataSet ds = (IS_AGR_3210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**********************************************************************************/
    
    
    public IS_AGR_3300_MDataSet is_agr_3300_m(IS_AGR_3300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_3300_MDataSet ds = (IS_AGR_3300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_AGR_3310_LDataSet is_agr_3310_l(IS_AGR_3310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_AGR_3310_LDataSet ds = (IS_AGR_3310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
