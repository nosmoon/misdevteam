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

package chosun.ciis.is.rpt.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class IsRpt1000DAO {
	
	public IS_RPT_1000_MDataSet is_rpt_1000_m(IS_RPT_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1000_MDataSet ds = (IS_RPT_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public IS_RPT_1010_LDataSet is_rpt_1010_l(IS_RPT_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1010_LDataSet ds = (IS_RPT_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
    public IS_RPT_1020_LDataSet is_rpt_1020_l(IS_RPT_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1020_LDataSet ds = (IS_RPT_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
    public IS_RPT_1030_LDataSet is_rpt_1030_l(IS_RPT_1030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1030_LDataSet ds = (IS_RPT_1030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_RPT_1040_LDataSet is_rpt_1040_l(IS_RPT_1040_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1040_LDataSet ds = (IS_RPT_1040_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1050_LDataSet is_rpt_1050_l(IS_RPT_1050_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1050_LDataSet ds = (IS_RPT_1050_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1060_LDataSet is_rpt_1060_l(IS_RPT_1060_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1060_LDataSet ds = (IS_RPT_1060_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1210_LDataSet is_rpt_1210_l(IS_RPT_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1210_LDataSet ds = (IS_RPT_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1220_LDataSet is_rpt_1220_l(IS_RPT_1220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1220_LDataSet ds = (IS_RPT_1220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1110_LDataSet is_rpt_1110_l(IS_RPT_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1110_LDataSet ds = (IS_RPT_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_RPT_1310_LDataSet is_rpt_1310_l(IS_RPT_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1310_LDataSet ds = (IS_RPT_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_RPT_1410_LDataSet is_rpt_1410_l(IS_RPT_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1410_LDataSet ds = (IS_RPT_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1420_LDataSet is_rpt_1420_l(IS_RPT_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1420_LDataSet ds = (IS_RPT_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1600_MDataSet is_rpt_1600_m(IS_RPT_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1600_MDataSet ds = (IS_RPT_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1610_LDataSet is_rpt_1610_l(IS_RPT_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1610_LDataSet ds = (IS_RPT_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1710_LDataSet is_rpt_1710_l(IS_RPT_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1710_LDataSet ds = (IS_RPT_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1720_LDataSet is_rpt_1720_l(IS_RPT_1720_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1720_LDataSet ds = (IS_RPT_1720_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1810_LDataSet is_rpt_1810_l(IS_RPT_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1810_LDataSet ds = (IS_RPT_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_1910_LDataSet is_rpt_1910_l(IS_RPT_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_1910_LDataSet ds = (IS_RPT_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_2010_LDataSet is_rpt_2010_l(IS_RPT_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_2010_LDataSet ds = (IS_RPT_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_2020_LDataSet is_rpt_2020_l(IS_RPT_2020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_2020_LDataSet ds = (IS_RPT_2020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_2310_LDataSet is_rpt_2310_l(IS_RPT_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_2310_LDataSet ds = (IS_RPT_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_2320_LDataSet is_rpt_2320_l(IS_RPT_2320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_2320_LDataSet ds = (IS_RPT_2320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_2410_LDataSet is_rpt_2410_l(IS_RPT_2410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_2410_LDataSet ds = (IS_RPT_2410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_2420_LDataSet is_rpt_2420_l(IS_RPT_2420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_2420_LDataSet ds = (IS_RPT_2420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_2500_MDataSet is_rpt_2500_m(IS_RPT_2500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_2500_MDataSet ds = (IS_RPT_2500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_RPT_2510_LDataSet is_rpt_2510_l(IS_RPT_2510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_RPT_2510_LDataSet ds = (IS_RPT_2510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
