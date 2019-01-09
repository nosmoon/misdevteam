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

package chosun.ciis.sp.sup.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class SpSup1000DAO {
	
	public SP_SUP_1000_MDataSet sp_sup_1000_m(SP_SUP_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1000_MDataSet ds = (SP_SUP_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SUP_1010_LDataSet sp_sup_1010_l(SP_SUP_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1010_LDataSet ds = (SP_SUP_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SUP_1015_LDataSet sp_sup_1015_l(SP_SUP_1015_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1015_LDataSet ds = (SP_SUP_1015_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SUP_1020_SDataSet sp_sup_1020_s(SP_SUP_1020_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1020_SDataSet ds = (SP_SUP_1020_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SUP_1030_ADataSet sp_sup_1030_a(SP_SUP_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1030_ADataSet ds = (SP_SUP_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/*********************************************************************************/
	public SP_SUP_1110_LDataSet sp_sup_1110_l(SP_SUP_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1110_LDataSet ds = (SP_SUP_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SUP_1120_LDataSet sp_sup_1120_l(SP_SUP_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1120_LDataSet ds = (SP_SUP_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_SUP_1130_LDataSet sp_sup_1130_l(SP_SUP_1130_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1130_LDataSet ds = (SP_SUP_1130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/*********************************************************************************/
	 public SP_SUP_1200_MDataSet sp_sup_1200_m(SP_SUP_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1200_MDataSet ds = (SP_SUP_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
     }
	 
	 public SP_SUP_1210_LDataSet sp_sup_1210_l(SP_SUP_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1210_LDataSet ds = (SP_SUP_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
     }
	 
	 public SP_SUP_1220_LDataSet sp_sup_1220_l(SP_SUP_1220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1220_LDataSet ds = (SP_SUP_1220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
     }
	 
	 public SP_SUP_1230_LDataSet sp_sup_1230_l(SP_SUP_1230_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1230_LDataSet ds = (SP_SUP_1230_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
     }
	 
	 public SP_SUP_1240_ADataSet sp_sup_1240_a(SP_SUP_1240_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1240_ADataSet ds = (SP_SUP_1240_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
     }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/*********************************************************************************/
    public SP_SUP_1300_MDataSet sp_sup_1300_m(SP_SUP_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1300_MDataSet ds = (SP_SUP_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public SP_SUP_1310_LDataSet sp_sup_1310_l(SP_SUP_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1310_LDataSet ds = (SP_SUP_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1320_ADataSet sp_sup_1320_a(SP_SUP_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1320_ADataSet ds = (SP_SUP_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /*********************************************************************************/
    
    public SP_SUP_1400_MDataSet sp_sup_1400_m(SP_SUP_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1400_MDataSet ds = (SP_SUP_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1410_LDataSet sp_sup_1410_l(SP_SUP_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1410_LDataSet ds = (SP_SUP_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1420_SDataSet sp_sup_1420_s(SP_SUP_1420_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1420_SDataSet ds = (SP_SUP_1420_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1430_SDataSet sp_sup_1430_s(SP_SUP_1430_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1430_SDataSet ds = (SP_SUP_1430_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1440_ADataSet sp_sup_1440_a(SP_SUP_1440_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1440_ADataSet ds = (SP_SUP_1440_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /*********************************************************************************/
    
    public SP_SUP_1510_LDataSet sp_sup_1510_l(SP_SUP_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1510_LDataSet ds = (SP_SUP_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /*********************************************************************************/
    
    public SP_SUP_1600_MDataSet sp_sup_1600_m(SP_SUP_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1600_MDataSet ds = (SP_SUP_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1610_LDataSet sp_sup_1610_l(SP_SUP_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1610_LDataSet ds = (SP_SUP_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1620_SDataSet sp_sup_1620_s(SP_SUP_1620_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1620_SDataSet ds = (SP_SUP_1620_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1630_ADataSet sp_sup_1630_a(SP_SUP_1630_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1630_ADataSet ds = (SP_SUP_1630_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1700_ADataSet sp_sup_1700_a(SP_SUP_1700_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1700_ADataSet ds = (SP_SUP_1700_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1701_LDataSet sp_sup_1701_l(SP_SUP_1701_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1701_LDataSet ds = (SP_SUP_1701_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SP_SUP_1702_LDataSet sp_sup_1702_l(SP_SUP_1702_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_SUP_1702_LDataSet ds = (SP_SUP_1702_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
