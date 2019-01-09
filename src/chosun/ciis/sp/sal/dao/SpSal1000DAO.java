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

package chosun.ciis.sp.sal.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class SpSal1000DAO {
	
	public SP_SAL_1010_LDataSet sp_sal_1010_l(SP_SAL_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1010_LDataSet ds = (SP_SAL_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1020_ADataSet sp_sal_1020_a(SP_SAL_1020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1020_ADataSet ds = (SP_SAL_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1030_ADataSet sp_sal_1030_a(SP_SAL_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1030_ADataSet ds = (SP_SAL_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_1110_LDataSet sp_sal_1110_l(SP_SAL_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1110_LDataSet ds = (SP_SAL_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1120_ADataSet sp_sal_1120_a(SP_SAL_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1120_ADataSet ds = (SP_SAL_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1130_DDataSet sp_sal_1130_d(SP_SAL_1130_DDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1130_DDataSet ds = (SP_SAL_1130_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_1200_MDataSet sp_sal_1200_m(SP_SAL_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1200_MDataSet ds = (SP_SAL_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1210_LDataSet sp_sal_1210_l(SP_SAL_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1210_LDataSet ds = (SP_SAL_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1220_ADataSet sp_sal_1220_a(SP_SAL_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1220_ADataSet ds = (SP_SAL_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1230_DDataSet sp_sal_1230_d(SP_SAL_1230_DDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1230_DDataSet ds = (SP_SAL_1230_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_1310_LDataSet sp_sal_1310_l(SP_SAL_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1310_LDataSet ds = (SP_SAL_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1320_ADataSet sp_sal_1320_a(SP_SAL_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1320_ADataSet ds = (SP_SAL_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1330_DDataSet sp_sal_1330_d(SP_SAL_1330_DDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1330_DDataSet ds = (SP_SAL_1330_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_1400_MDataSet sp_sal_1400_m(SP_SAL_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1400_MDataSet ds = (SP_SAL_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1410_LDataSet sp_sal_1410_l(SP_SAL_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1410_LDataSet ds = (SP_SAL_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1420_ADataSet sp_sal_1420_a(SP_SAL_1420_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1420_ADataSet ds = (SP_SAL_1420_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1430_DDataSet sp_sal_1430_d(SP_SAL_1430_DDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1430_DDataSet ds = (SP_SAL_1430_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_1500_MDataSet sp_sal_1500_m(SP_SAL_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1500_MDataSet ds = (SP_SAL_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1510_LDataSet sp_sal_1510_l(SP_SAL_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1510_LDataSet ds = (SP_SAL_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1520_ADataSet sp_sal_1520_a(SP_SAL_1520_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1520_ADataSet ds = (SP_SAL_1520_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1530_LDataSet sp_sal_1530_l(SP_SAL_1530_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1530_LDataSet ds = (SP_SAL_1530_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public SP_SAL_1540_ADataSet sp_sal_1540_a(SP_SAL_1540_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1540_ADataSet ds = (SP_SAL_1540_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public SP_SAL_1560_ADataSet sp_sal_1560_a(SP_SAL_1560_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1560_ADataSet ds = (SP_SAL_1560_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public SP_SAL_1570_ADataSet sp_sal_1570_a(SP_SAL_1570_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1570_ADataSet ds = (SP_SAL_1570_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	/***************************************************************************************/
	public SP_SAL_1600_MDataSet sp_sal_1600_m(SP_SAL_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1600_MDataSet ds = (SP_SAL_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1610_LDataSet sp_sal_1610_l(SP_SAL_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1610_LDataSet ds = (SP_SAL_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	public SP_SAL_1620_SDataSet sp_sal_1620_s(SP_SAL_1620_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1620_SDataSet ds = (SP_SAL_1620_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	public SP_SAL_1630_ADataSet sp_sal_1630_a(SP_SAL_1630_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1630_ADataSet ds = (SP_SAL_1630_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_1640_ADataSet sp_sal_1640_a(SP_SAL_1640_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1640_ADataSet ds = (SP_SAL_1640_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_1710_LDataSet sp_sal_1710_l(SP_SAL_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1710_LDataSet ds = (SP_SAL_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1720_ADataSet sp_sal_1720_a(SP_SAL_1720_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1720_ADataSet ds = (SP_SAL_1720_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1730_ADataSet sp_sal_1730_a(SP_SAL_1730_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1730_ADataSet ds = (SP_SAL_1730_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_1800_MDataSet sp_sal_1800_m(SP_SAL_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1800_MDataSet ds = (SP_SAL_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1810_LDataSet sp_sal_1810_l(SP_SAL_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1810_LDataSet ds = (SP_SAL_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1820_ADataSet sp_sal_1820_a(SP_SAL_1820_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1820_ADataSet ds = (SP_SAL_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1825_ADataSet sp_sal_1825_a(SP_SAL_1825_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1825_ADataSet ds = (SP_SAL_1825_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1830_ADataSet sp_sal_1830_a(SP_SAL_1830_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1830_ADataSet ds = (SP_SAL_1830_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1835_ADataSet sp_sal_1835_a(SP_SAL_1835_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1835_ADataSet ds = (SP_SAL_1835_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_1840_ADataSet sp_sal_1840_a(SP_SAL_1840_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_1840_ADataSet ds = (SP_SAL_1840_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
	/***************************************************************************************/
	
	
	/***************************************************************************************/
	public SP_SAL_2000_MDataSet sp_sal_2000_m(SP_SAL_2000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2000_MDataSet ds = (SP_SAL_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	
	public SP_SAL_2010_LDataSet sp_sal_2010_l(SP_SAL_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2010_LDataSet ds = (SP_SAL_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	
	public SP_SAL_2020_ADataSet sp_sal_2020_a(SP_SAL_2020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2020_ADataSet ds = (SP_SAL_2020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	public SP_SAL_2030_DDataSet sp_sal_2030_d(SP_SAL_2030_DDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2030_DDataSet ds = (SP_SAL_2030_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	/***************************************************************************************/
	public SP_SAL_2100_MDataSet sp_sal_2100_m(SP_SAL_2100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2100_MDataSet ds = (SP_SAL_2100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	public SP_SAL_2110_LDataSet sp_sal_2110_l(SP_SAL_2110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2110_LDataSet ds = (SP_SAL_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	public SP_SAL_2120_ADataSet sp_sal_2120_a(SP_SAL_2120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2120_ADataSet ds = (SP_SAL_2120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	public SP_SAL_2130_SDataSet sp_sal_2130_s(SP_SAL_2130_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2130_SDataSet ds = (SP_SAL_2130_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	} 
	/***************************************************************************************/
	public SP_SAL_2200_MDataSet sp_sal_2200_m(SP_SAL_2200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2200_MDataSet ds = (SP_SAL_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2210_LDataSet sp_sal_2210_l(SP_SAL_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2210_LDataSet ds = (SP_SAL_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2220_LDataSet sp_sal_2220_l(SP_SAL_2220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2220_LDataSet ds = (SP_SAL_2220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2230_ADataSet sp_sal_2230_a(SP_SAL_2230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2230_ADataSet ds = (SP_SAL_2230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2240_ADataSet sp_sal_2240_a(SP_SAL_2240_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2240_ADataSet ds = (SP_SAL_2240_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2250_ADataSet sp_sal_2250_a(SP_SAL_2250_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2250_ADataSet ds = (SP_SAL_2250_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2260_ADataSet sp_sal_2260_a(SP_SAL_2260_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2260_ADataSet ds = (SP_SAL_2260_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2270_ADataSet sp_sal_2270_a(SP_SAL_2270_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2270_ADataSet ds = (SP_SAL_2270_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_2300_MDataSet sp_sal_2300_m(SP_SAL_2300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2300_MDataSet ds = (SP_SAL_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2310_LDataSet sp_sal_2310_l(SP_SAL_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2310_LDataSet ds = (SP_SAL_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2320_LDataSet sp_sal_2320_l(SP_SAL_2320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2320_LDataSet ds = (SP_SAL_2320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2330_LDataSet sp_sal_2330_l(SP_SAL_2330_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2330_LDataSet ds = (SP_SAL_2330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2340_ADataSet sp_sal_2340_a(SP_SAL_2340_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2340_ADataSet ds = (SP_SAL_2340_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2350_ADataSet sp_sal_2350_a(SP_SAL_2350_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2350_ADataSet ds = (SP_SAL_2350_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_2400_MDataSet sp_sal_2400_m(SP_SAL_2400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2400_MDataSet ds = (SP_SAL_2400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2410_LDataSet sp_sal_2410_l(SP_SAL_2410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2410_LDataSet ds = (SP_SAL_2410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2420_LDataSet sp_sal_2420_l(SP_SAL_2420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2420_LDataSet ds = (SP_SAL_2420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2430_ADataSet sp_sal_2430_a(SP_SAL_2430_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2430_ADataSet ds = (SP_SAL_2430_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_2440_ADataSet sp_sal_2440_a(SP_SAL_2440_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2440_ADataSet ds = (SP_SAL_2440_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_2510_LDataSet sp_sal_2510_l(SP_SAL_2510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2510_LDataSet ds = (SP_SAL_2510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_2520_ADataSet sp_sal_2520_a(SP_SAL_2520_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2520_ADataSet ds = (SP_SAL_2520_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_2530_DDataSet sp_sal_2530_d(SP_SAL_2530_DDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2530_DDataSet ds = (SP_SAL_2530_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_2600_MDataSet sp_sal_2600_m(SP_SAL_2600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2600_MDataSet ds = (SP_SAL_2600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_2610_LDataSet sp_sal_2610_l(SP_SAL_2610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2610_LDataSet ds = (SP_SAL_2610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_2620_LDataSet sp_sal_2620_l(SP_SAL_2620_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2620_LDataSet ds = (SP_SAL_2620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_2630_LDataSet sp_sal_2630_l(SP_SAL_2630_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2630_LDataSet ds = (SP_SAL_2630_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_2710_LDataSet sp_sal_2710_l(SP_SAL_2710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2710_LDataSet ds = (SP_SAL_2710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_2720_LDataSet sp_sal_2720_l(SP_SAL_2720_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2720_LDataSet ds = (SP_SAL_2720_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_2800_MDataSet sp_sal_2800_m(SP_SAL_2800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2800_MDataSet ds = (SP_SAL_2800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_2810_LDataSet sp_sal_2810_l(SP_SAL_2810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2810_LDataSet ds = (SP_SAL_2810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_2900_MDataSet sp_sal_2900_m(SP_SAL_2900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2900_MDataSet ds = (SP_SAL_2900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_2910_LDataSet sp_sal_2910_l(SP_SAL_2910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_2910_LDataSet ds = (SP_SAL_2910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3110_LDataSet sp_sal_3110_l(SP_SAL_3110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3110_LDataSet ds = (SP_SAL_3110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3210_LDataSet sp_sal_3210_l(SP_SAL_3210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3210_LDataSet ds = (SP_SAL_3210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3310_LDataSet sp_sal_3310_l(SP_SAL_3310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3310_LDataSet ds = (SP_SAL_3310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3400_MDataSet sp_sal_3400_m(SP_SAL_3400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3400_MDataSet ds = (SP_SAL_3400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SAL_3410_LDataSet sp_sal_3410_l(SP_SAL_3410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3410_LDataSet ds = (SP_SAL_3410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3510_LDataSet sp_sal_3510_l(SP_SAL_3510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3510_LDataSet ds = (SP_SAL_3510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3520_LDataSet sp_sal_3520_l(SP_SAL_3520_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3520_LDataSet ds = (SP_SAL_3520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3600_MDataSet sp_sal_3600_m(SP_SAL_3600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3600_MDataSet ds = (SP_SAL_3600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3610_LDataSet sp_sal_3610_l(SP_SAL_3610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3610_LDataSet ds = (SP_SAL_3610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3620_LDataSet sp_sal_3620_l(SP_SAL_3620_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3620_LDataSet ds = (SP_SAL_3620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3630_ADataSet sp_sal_3630_a(SP_SAL_3630_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3630_ADataSet ds = (SP_SAL_3630_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3640_ADataSet sp_sal_3640_a(SP_SAL_3640_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3640_ADataSet ds = (SP_SAL_3640_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3650_ADataSet sp_sal_3650_a(SP_SAL_3650_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3650_ADataSet ds = (SP_SAL_3650_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3700_MDataSet sp_sal_3700_m(SP_SAL_3700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3700_MDataSet ds = (SP_SAL_3700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3710_LDataSet sp_sal_3710_l(SP_SAL_3710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3710_LDataSet ds = (SP_SAL_3710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3720_ADataSet sp_sal_3720_a(SP_SAL_3720_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3720_ADataSet ds = (SP_SAL_3720_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3730_DDataSet sp_sal_3730_d(SP_SAL_3730_DDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3730_DDataSet ds = (SP_SAL_3730_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3800_MDataSet sp_sal_3800_m(SP_SAL_3800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3800_MDataSet ds = (SP_SAL_3800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3810_LDataSet sp_sal_3810_l(SP_SAL_3810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3810_LDataSet ds = (SP_SAL_3810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3820_LDataSet sp_sal_3820_l(SP_SAL_3820_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3820_LDataSet ds = (SP_SAL_3820_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3825_SDataSet sp_sal_3825_s(SP_SAL_3825_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3825_SDataSet ds = (SP_SAL_3825_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3830_SDataSet sp_sal_3830_s(SP_SAL_3830_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3830_SDataSet ds = (SP_SAL_3830_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3840_ADataSet sp_sal_3840_a(SP_SAL_3840_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3840_ADataSet ds = (SP_SAL_3840_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3850_ADataSet sp_sal_3850_a(SP_SAL_3850_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3850_ADataSet ds = (SP_SAL_3850_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3860_ADataSet sp_sal_3860_a(SP_SAL_3860_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3860_ADataSet ds = (SP_SAL_3860_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_SAL_3900_MDataSet sp_sal_3900_m(SP_SAL_3900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3900_MDataSet ds = (SP_SAL_3900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_3910_LDataSet sp_sal_3910_l(SP_SAL_3910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_3910_LDataSet ds = (SP_SAL_3910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	/***************************************************************************************/
	public SP_SAL_4000_MDataSet sp_sal_4000_m(SP_SAL_4000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_4000_MDataSet ds = (SP_SAL_4000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	public SP_SAL_4010_LDataSet sp_sal_4010_l(SP_SAL_4010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_4010_LDataSet ds = (SP_SAL_4010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_SAL_4020_ADataSet sp_sal_4020_a(SP_SAL_4020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SAL_4020_ADataSet ds = (SP_SAL_4020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
	
}
