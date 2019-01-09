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

package chosun.ciis.is.dep.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class IsDep1000DAO {
	
	public IS_DEP_1000_MDataSet is_dep_1000_m(IS_DEP_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1000_MDataSet ds = (IS_DEP_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1010_SDataSet is_dep_1010_s(IS_DEP_1010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1010_SDataSet ds = (IS_DEP_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1011_LDataSet is_dep_1011_l(IS_DEP_1011_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1011_LDataSet ds = (IS_DEP_1011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1012_LDataSet is_dep_1012_l(IS_DEP_1012_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1012_LDataSet ds = (IS_DEP_1012_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1013_LDataSet is_dep_1013_l(IS_DEP_1013_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1013_LDataSet ds = (IS_DEP_1013_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1014_LDataSet is_dep_1014_l(IS_DEP_1014_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1014_LDataSet ds = (IS_DEP_1014_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1020_ADataSet is_dep_1020_a(IS_DEP_1020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1020_ADataSet ds = (IS_DEP_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1030_ADataSet is_dep_1030_a(IS_DEP_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1030_ADataSet ds = (IS_DEP_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1040_ADataSet is_dep_1040_a(IS_DEP_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1040_ADataSet ds = (IS_DEP_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1051_LDataSet is_dep_1051_l(IS_DEP_1051_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1051_LDataSet ds = (IS_DEP_1051_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1055_ADataSet is_dep_1055_a(IS_DEP_1055_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1055_ADataSet ds = (IS_DEP_1055_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public IS_DEP_1100_MDataSet is_dep_1100_m(IS_DEP_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1100_MDataSet ds = (IS_DEP_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1101_MDataSet is_dep_1101_m(IS_DEP_1101_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1101_MDataSet ds = (IS_DEP_1101_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1110_ADataSet is_dep_1110_a(IS_DEP_1110_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1110_ADataSet ds = (IS_DEP_1110_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1111_ADataSet is_dep_1111_a(IS_DEP_1111_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1111_ADataSet ds = (IS_DEP_1111_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1120_ADataSet is_dep_1120_a(IS_DEP_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1120_ADataSet ds = (IS_DEP_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1121_ADataSet is_dep_1121_a(IS_DEP_1121_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1121_ADataSet ds = (IS_DEP_1121_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public IS_DEP_1200_MDataSet is_dep_1200_m(IS_DEP_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1200_MDataSet ds = (IS_DEP_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1210_LDataSet is_dep_1210_l(IS_DEP_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1210_LDataSet ds = (IS_DEP_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1220_ADataSet is_dep_1220_a(IS_DEP_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1220_ADataSet ds = (IS_DEP_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1230_ADataSet is_dep_1230_a(IS_DEP_1230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1230_ADataSet ds = (IS_DEP_1230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1310_LDataSet is_dep_1310_l(IS_DEP_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1310_LDataSet ds = (IS_DEP_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1320_ADataSet is_dep_1320_a(IS_DEP_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1320_ADataSet ds = (IS_DEP_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1400_MDataSet is_dep_1400_m(IS_DEP_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1400_MDataSet ds = (IS_DEP_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1410_ADataSet is_dep_1410_a(IS_DEP_1410_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1410_ADataSet ds = (IS_DEP_1410_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1420_ADataSet is_dep_1420_a(IS_DEP_1420_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1420_ADataSet ds = (IS_DEP_1420_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1500_MDataSet is_dep_1500_m(IS_DEP_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1500_MDataSet ds = (IS_DEP_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1510_LDataSet is_dep_1510_l(IS_DEP_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1510_LDataSet ds = (IS_DEP_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1520_SDataSet is_dep_1520_s(IS_DEP_1520_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1520_SDataSet ds = (IS_DEP_1520_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1525_SDataSet is_dep_1525_s(IS_DEP_1525_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1525_SDataSet ds = (IS_DEP_1525_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1530_ADataSet is_dep_1530_a(IS_DEP_1530_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1530_ADataSet ds = (IS_DEP_1530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1540_ADataSet is_dep_1540_a(IS_DEP_1540_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1540_ADataSet ds = (IS_DEP_1540_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1600_MDataSet is_dep_1600_m(IS_DEP_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1600_MDataSet ds = (IS_DEP_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1610_LDataSet is_dep_1610_l(IS_DEP_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1610_LDataSet ds = (IS_DEP_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1620_LDataSet is_dep_1620_l(IS_DEP_1620_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1620_LDataSet ds = (IS_DEP_1620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1750_MDataSet is_dep_1750_m(IS_DEP_1750_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1750_MDataSet ds = (IS_DEP_1750_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1751_LDataSet is_dep_1751_l(IS_DEP_1751_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1751_LDataSet ds = (IS_DEP_1751_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1800_MDataSet is_dep_1800_m(IS_DEP_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1800_MDataSet ds = (IS_DEP_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1810_LDataSet is_dep_1810_l(IS_DEP_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1810_LDataSet ds = (IS_DEP_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1820_ADataSet is_dep_1820_a(IS_DEP_1820_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1820_ADataSet ds = (IS_DEP_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1830_LDataSet is_dep_1830_l(IS_DEP_1830_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1830_LDataSet ds = (IS_DEP_1830_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1900_MDataSet is_dep_1900_m(IS_DEP_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1900_MDataSet ds = (IS_DEP_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1910_LDataSet is_dep_1910_l(IS_DEP_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1910_LDataSet ds = (IS_DEP_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1920_ADataSet is_dep_1920_a(IS_DEP_1920_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1920_ADataSet ds = (IS_DEP_1920_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_1930_LDataSet is_dep_1930_l(IS_DEP_1930_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_1930_LDataSet ds = (IS_DEP_1930_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	public IS_DEP_2600_MDataSet is_dep_2600_m(IS_DEP_2600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2600_MDataSet ds = (IS_DEP_2600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2610_LDataSet is_dep_2610_l(IS_DEP_2610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2610_LDataSet ds = (IS_DEP_2610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2620_LDataSet is_dep_2620_l(IS_DEP_2620_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2620_LDataSet ds = (IS_DEP_2620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	
	
	
	
	public IS_DEP_2700_MDataSet is_dep_2700_m(IS_DEP_2700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2700_MDataSet ds = (IS_DEP_2700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2710_LDataSet is_dep_2710_l(IS_DEP_2710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2710_LDataSet ds = (IS_DEP_2710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2720_LDataSet is_dep_2720_l(IS_DEP_2720_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2720_LDataSet ds = (IS_DEP_2720_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2800_MDataSet is_dep_2800_m(IS_DEP_2800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2800_MDataSet ds = (IS_DEP_2800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2810_LDataSet is_dep_2810_l(IS_DEP_2810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2810_LDataSet ds = (IS_DEP_2810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2900_MDataSet is_dep_2900_m(IS_DEP_2900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2900_MDataSet ds = (IS_DEP_2900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2910_LDataSet is_dep_2910_l(IS_DEP_2910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2910_LDataSet ds = (IS_DEP_2910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	
	
	
	
	
	public IS_DEP_2400_MDataSet is_dep_2400_m(IS_DEP_2400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2400_MDataSet ds = (IS_DEP_2400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2410_LDataSet is_dep_2410_l(IS_DEP_2410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2410_LDataSet ds = (IS_DEP_2410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2420_LDataSet is_dep_2420_l(IS_DEP_2420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2420_LDataSet ds = (IS_DEP_2420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2430_LDataSet is_dep_2430_l(IS_DEP_2430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2430_LDataSet ds = (IS_DEP_2430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2440_LDataSet is_dep_2440_l(IS_DEP_2440_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2440_LDataSet ds = (IS_DEP_2440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	
	
	public IS_DEP_2500_MDataSet is_dep_2500_m(IS_DEP_2500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2500_MDataSet ds = (IS_DEP_2500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_2510_LDataSet is_dep_2510_l(IS_DEP_2510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_2510_LDataSet ds = (IS_DEP_2510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	
	
	
	
	
	
	
	
	
	public IS_DEP_3500_MDataSet is_dep_3500_m(IS_DEP_3500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3500_MDataSet ds = (IS_DEP_3500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3510_LDataSet is_dep_3510_l(IS_DEP_3510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3510_LDataSet ds = (IS_DEP_3510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3520_LDataSet is_dep_3520_l(IS_DEP_3520_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3520_LDataSet ds = (IS_DEP_3520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3530_ADataSet is_dep_3530_a(IS_DEP_3530_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3530_ADataSet ds = (IS_DEP_3530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3540_ADataSet is_dep_3540_a(IS_DEP_3540_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3540_ADataSet ds = (IS_DEP_3540_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	
	
	
	public IS_DEP_3700_MDataSet is_dep_3700_m(IS_DEP_3700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3700_MDataSet ds = (IS_DEP_3700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3710_LDataSet is_dep_3710_l(IS_DEP_3710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3710_LDataSet ds = (IS_DEP_3710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3715_UDataSet is_dep_3715_u(IS_DEP_3715_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3715_UDataSet ds = (IS_DEP_3715_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	public IS_DEP_3720_SDataSet is_dep_3720_s(IS_DEP_3720_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3720_SDataSet ds = (IS_DEP_3720_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3730_ADataSet is_dep_3730_a(IS_DEP_3730_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3730_ADataSet ds = (IS_DEP_3730_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3810_LDataSet is_dep_3810_l(IS_DEP_3810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3810_LDataSet ds = (IS_DEP_3810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_3820_ADataSet is_dep_3820_a(IS_DEP_3820_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_3820_ADataSet ds = (IS_DEP_3820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	/********************************************************************************************/
	
	public IS_DEP_4000_MDataSet is_dep_4000_m(IS_DEP_4000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4000_MDataSet ds = (IS_DEP_4000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 	
	
	public IS_DEP_4010_LDataSet is_dep_4010_l(IS_DEP_4010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4010_LDataSet ds = (IS_DEP_4010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_4020_ADataSet is_dep_4020_a(IS_DEP_4020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4020_ADataSet ds = (IS_DEP_4020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	public IS_DEP_4025_ADataSet is_dep_4025_a(IS_DEP_4025_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4025_ADataSet ds = (IS_DEP_4025_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	public IS_DEP_4030_ADataSet is_dep_4030_a(IS_DEP_4030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4030_ADataSet ds = (IS_DEP_4030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	public IS_DEP_4040_ADataSet is_dep_4040_a(IS_DEP_4040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4040_ADataSet ds = (IS_DEP_4040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public IS_DEP_4045_ADataSet is_dep_4045_a(IS_DEP_4045_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4045_ADataSet ds = (IS_DEP_4045_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public IS_DEP_4051_LDataSet is_dep_4051_l(IS_DEP_4051_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        System.out.println("bong.dao");
        IS_DEP_4051_LDataSet ds = (IS_DEP_4051_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public IS_DEP_4055_ADataSet is_dep_4055_a(IS_DEP_4055_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4055_ADataSet ds = (IS_DEP_4055_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/********************************************************************************************/
    public IS_DEP_4300_MDataSet is_dep_4300_m(IS_DEP_4300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4300_MDataSet ds = (IS_DEP_4300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_DEP_4310_LDataSet is_dep_4310_l(IS_DEP_4310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4310_LDataSet ds = (IS_DEP_4310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_DEP_4350_ADataSet is_dep_4350_a(IS_DEP_4350_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4350_ADataSet ds = (IS_DEP_4350_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    /********************************************************************************************/
    public IS_DEP_4500_MDataSet is_dep_4500_m(IS_DEP_4500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4500_MDataSet ds = (IS_DEP_4500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    
	/********************************************************************************************/
	
	public IS_DEP_4600_MDataSet is_dep_4600_m(IS_DEP_4600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4600_MDataSet ds = (IS_DEP_4600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 	
	
	public IS_DEP_4610_LDataSet is_dep_4610_l(IS_DEP_4610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4610_LDataSet ds = (IS_DEP_4610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public IS_DEP_4620_ADataSet is_dep_4620_a(IS_DEP_4620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4620_ADataSet ds = (IS_DEP_4620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    
	public IS_DEP_4630_ADataSet is_dep_4630_a(IS_DEP_4630_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_DEP_4630_ADataSet ds = (IS_DEP_4630_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    
    
    
    
    
    
    
}
