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

package chosun.ciis.is.sal.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class IsSal1000DAO {
	
    public IS_SAL_1000_MDataSet is_sal_1000_m(IS_SAL_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1000_MDataSet ds = (IS_SAL_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1010_LDataSet is_sal_1010_l(IS_SAL_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1010_LDataSet ds = (IS_SAL_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1020_LDataSet is_sal_1020_l(IS_SAL_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1020_LDataSet ds = (IS_SAL_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1025_SDataSet is_sal_1025_s(IS_SAL_1025_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1025_SDataSet ds = (IS_SAL_1025_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1030_SDataSet is_sal_1030_s(IS_SAL_1030_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1030_SDataSet ds = (IS_SAL_1030_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1040_ADataSet is_sal_1040_a(IS_SAL_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1040_ADataSet ds = (IS_SAL_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1050_ADataSet is_sal_1050_a(IS_SAL_1050_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1050_ADataSet ds = (IS_SAL_1050_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1060_ADataSet is_sal_1060_a(IS_SAL_1060_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1060_ADataSet ds = (IS_SAL_1060_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1100_MDataSet is_sal_1100_m(IS_SAL_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1100_MDataSet ds = (IS_SAL_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1110_LDataSet is_sal_1110_l(IS_SAL_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1110_LDataSet ds = (IS_SAL_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1120_ADataSet is_sal_1120_a(IS_SAL_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1120_ADataSet ds = (IS_SAL_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 
    public IS_SAL_1122_ADataSet is_sal_1122_a(IS_SAL_1122_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1122_ADataSet ds = (IS_SAL_1122_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1130_SDataSet is_sal_1130_s(IS_SAL_1130_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1130_SDataSet ds = (IS_SAL_1130_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1200_MDataSet is_sal_1200_m(IS_SAL_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1200_MDataSet ds = (IS_SAL_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1201_MDataSet is_sal_1201_m(IS_SAL_1201_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1201_MDataSet ds = (IS_SAL_1201_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1210_ADataSet is_sal_1210_a(IS_SAL_1210_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1210_ADataSet ds = (IS_SAL_1210_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
 
    public IS_SAL_1211_ADataSet is_sal_1211_a(IS_SAL_1211_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1211_ADataSet ds = (IS_SAL_1211_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1300_MDataSet is_sal_1300_m(IS_SAL_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1300_MDataSet ds = (IS_SAL_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1310_LDataSet is_sal_1310_l(IS_SAL_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1310_LDataSet ds = (IS_SAL_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1320_LDataSet is_sal_1320_l(IS_SAL_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1320_LDataSet ds = (IS_SAL_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1330_LDataSet is_sal_1330_l(IS_SAL_1330_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1330_LDataSet ds = (IS_SAL_1330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1340_ADataSet is_sal_1340_a(IS_SAL_1340_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1340_ADataSet ds = (IS_SAL_1340_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1400_MDataSet is_sal_1400_m(IS_SAL_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1400_MDataSet ds = (IS_SAL_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1410_LDataSet is_sal_1410_l(IS_SAL_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1410_LDataSet ds = (IS_SAL_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1420_LDataSet is_sal_1420_l(IS_SAL_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1420_LDataSet ds = (IS_SAL_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1430_LDataSet is_sal_1430_l(IS_SAL_1430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1430_LDataSet ds = (IS_SAL_1430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1440_ADataSet is_sal_1440_a(IS_SAL_1440_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1440_ADataSet ds = (IS_SAL_1440_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1600_MDataSet is_sal_1600_m(IS_SAL_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1600_MDataSet ds = (IS_SAL_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1610_LDataSet is_sal_1610_l(IS_SAL_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1610_LDataSet ds = (IS_SAL_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1620_ADataSet is_sal_1620_a(IS_SAL_1620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1620_ADataSet ds = (IS_SAL_1620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1630_ADataSet is_sal_1630_a(IS_SAL_1630_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1630_ADataSet ds = (IS_SAL_1630_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1640_ADataSet is_sal_1640_a(IS_SAL_1640_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1640_ADataSet ds = (IS_SAL_1640_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1650_ADataSet is_sal_1650_a(IS_SAL_1650_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1650_ADataSet ds = (IS_SAL_1650_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1660_ADataSet is_sal_1660_a(IS_SAL_1660_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1660_ADataSet ds = (IS_SAL_1660_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1800_MDataSet is_sal_1800_m(IS_SAL_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1800_MDataSet ds = (IS_SAL_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1810_LDataSet is_sal_1810_l(IS_SAL_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1810_LDataSet ds = (IS_SAL_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1900_MDataSet is_sal_1900_m(IS_SAL_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1900_MDataSet ds = (IS_SAL_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_1910_LDataSet is_sal_1910_l(IS_SAL_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1910_LDataSet ds = (IS_SAL_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_1920_LDataSet is_sal_1920_l(IS_SAL_1920_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_1920_LDataSet ds = (IS_SAL_1920_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_2100_MDataSet is_sal_2100_m(IS_SAL_2100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_2100_MDataSet ds = (IS_SAL_2100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_2110_LDataSet is_sal_2110_l(IS_SAL_2110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_2110_LDataSet ds = (IS_SAL_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SAL_2200_MDataSet is_sal_2200_m(IS_SAL_2200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_2200_MDataSet ds = (IS_SAL_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_2210_LDataSet is_sal_2210_l(IS_SAL_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_2210_LDataSet ds = (IS_SAL_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SAL_2500_MDataSet is_sal_2500_m(IS_SAL_2500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SAL_2500_MDataSet ds = (IS_SAL_2500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
