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

package chosun.ciis.is.bus.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class IsBus1000DAO {
	
    public IS_BUS_1000_MDataSet is_bus_1000_m(IS_BUS_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1000_MDataSet ds = (IS_BUS_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_1010_LDataSet is_bus_1010_l(IS_BUS_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1010_LDataSet ds = (IS_BUS_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

    public IS_BUS_1020_SDataSet is_bus_1020_s(IS_BUS_1020_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1020_SDataSet ds = (IS_BUS_1020_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public IS_BUS_1030_ADataSet is_bus_1030_a(IS_BUS_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1030_ADataSet ds = (IS_BUS_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**********************************************************************************/
    
    public IS_BUS_1100_MDataSet is_bus_1100_m(IS_BUS_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1100_MDataSet ds = (IS_BUS_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_1110_LDataSet is_bus_1110_l(IS_BUS_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1110_LDataSet ds = (IS_BUS_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

    /**********************************************************************************/
    
    public IS_BUS_1210_LDataSet is_bus_1210_l(IS_BUS_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1210_LDataSet ds = (IS_BUS_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1220_ADataSet is_bus_1220_a(IS_BUS_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1220_ADataSet ds = (IS_BUS_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**********************************************************************************/
    
    public IS_BUS_1300_MDataSet is_bus_1300_m(IS_BUS_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1300_MDataSet ds = (IS_BUS_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1310_LDataSet is_bus_1310_l(IS_BUS_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1310_LDataSet ds = (IS_BUS_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1320_ADataSet is_bus_1320_a(IS_BUS_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1320_ADataSet ds = (IS_BUS_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1330_LDataSet is_bus_1330_l(IS_BUS_1330_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1330_LDataSet ds = (IS_BUS_1330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**********************************************************************************/
    
    public IS_BUS_1410_LDataSet is_bus_1410_l(IS_BUS_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1410_LDataSet ds = (IS_BUS_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 

    public IS_BUS_1420_LDataSet is_bus_1420_l(IS_BUS_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1420_LDataSet ds = (IS_BUS_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1430_LDataSet is_bus_1430_l(IS_BUS_1430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1430_LDataSet ds = (IS_BUS_1430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1440_LDataSet is_bus_1440_l(IS_BUS_1440_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1440_LDataSet ds = (IS_BUS_1440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1450_LDataSet is_bus_1450_l(IS_BUS_1450_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1450_LDataSet ds = (IS_BUS_1450_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1460_LDataSet is_bus_1460_l(IS_BUS_1460_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1460_LDataSet ds = (IS_BUS_1460_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**********************************************************************************/    
    
    public IS_BUS_1510_LDataSet is_bus_1510_l(IS_BUS_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1510_LDataSet ds = (IS_BUS_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
    public IS_BUS_1520_LDataSet is_bus_1520_l(IS_BUS_1520_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1520_LDataSet ds = (IS_BUS_1520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_1530_LDataSet is_bus_1530_l(IS_BUS_1530_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1530_LDataSet ds = (IS_BUS_1530_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1540_LDataSet is_bus_1540_l(IS_BUS_1540_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1540_LDataSet ds = (IS_BUS_1540_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1550_LDataSet is_bus_1550_l(IS_BUS_1550_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1550_LDataSet ds = (IS_BUS_1550_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
   
    public IS_BUS_1560_LDataSet is_bus_1560_l(IS_BUS_1560_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1560_LDataSet ds = (IS_BUS_1560_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1570_LDataSet is_bus_1570_l(IS_BUS_1570_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1570_LDataSet ds = (IS_BUS_1570_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**********************************************************************************/
    
    public IS_BUS_1600_MDataSet is_bus_1600_m(IS_BUS_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1600_MDataSet ds = (IS_BUS_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_1610_SDataSet is_bus_1610_s(IS_BUS_1610_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1610_SDataSet ds = (IS_BUS_1610_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_1620_ADataSet is_bus_1620_a(IS_BUS_1620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1620_ADataSet ds = (IS_BUS_1620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**********************************************************************************/
    
    public IS_BUS_1710_LDataSet is_bus_1710_l(IS_BUS_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1710_LDataSet ds = (IS_BUS_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_1720_LDataSet is_bus_1720_l(IS_BUS_1720_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1720_LDataSet ds = (IS_BUS_1720_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1730_LDataSet is_bus_1730_l(IS_BUS_1730_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1730_LDataSet ds = (IS_BUS_1730_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1740_LDataSet is_bus_1740_l(IS_BUS_1740_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1740_LDataSet ds = (IS_BUS_1740_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1750_LDataSet is_bus_1750_l(IS_BUS_1750_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1750_LDataSet ds = (IS_BUS_1750_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**********************************************************************************/
    
    public IS_BUS_1800_MDataSet is_bus_1800_m(IS_BUS_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1800_MDataSet ds = (IS_BUS_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_1810_SDataSet is_bus_1810_s(IS_BUS_1810_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1810_SDataSet ds = (IS_BUS_1810_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1820_ADataSet is_bus_1820_a(IS_BUS_1820_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1820_ADataSet ds = (IS_BUS_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**********************************************************************************/
    
    public IS_BUS_1900_MDataSet is_bus_1900_m(IS_BUS_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1900_MDataSet ds = (IS_BUS_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_1910_LDataSet is_bus_1910_l(IS_BUS_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1910_LDataSet ds = (IS_BUS_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_1920_ADataSet is_bus_1920_a(IS_BUS_1920_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_1920_ADataSet ds = (IS_BUS_1920_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**********************************************************************************/    
    
    public IS_BUS_2000_MDataSet is_bus_2000_m(IS_BUS_2000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2000_MDataSet ds = (IS_BUS_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_BUS_2010_LDataSet is_bus_2010_l(IS_BUS_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2010_LDataSet ds = (IS_BUS_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**********************************************************************************/ 
    
    public IS_BUS_2110_LDataSet is_bus_2110_l(IS_BUS_2110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2110_LDataSet ds = (IS_BUS_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_2120_LDataSet is_bus_2120_l(IS_BUS_2120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2120_LDataSet ds = (IS_BUS_2120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_2130_LDataSet is_bus_2130_l(IS_BUS_2130_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2130_LDataSet ds = (IS_BUS_2130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_2135_LDataSet is_bus_2135_l(IS_BUS_2135_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2135_LDataSet ds = (IS_BUS_2135_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_2140_LDataSet is_bus_2140_l(IS_BUS_2140_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2140_LDataSet ds = (IS_BUS_2140_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_2145_LDataSet is_bus_2145_l(IS_BUS_2145_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2145_LDataSet ds = (IS_BUS_2145_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**********************************************************************************/ 
    
    public IS_BUS_2210_LDataSet is_bus_2210_l(IS_BUS_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2210_LDataSet ds = (IS_BUS_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_BUS_2220_LDataSet is_bus_2220_l(IS_BUS_2220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2220_LDataSet ds = (IS_BUS_2220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**********************************************************************************/ 
    
    public IS_BUS_2310_LDataSet is_bus_2310_l(IS_BUS_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_BUS_2310_LDataSet ds = (IS_BUS_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**********************************************************************************/ 
    
    
    
    
    
}
