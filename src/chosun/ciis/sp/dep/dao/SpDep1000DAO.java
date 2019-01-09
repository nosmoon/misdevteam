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

package chosun.ciis.sp.dep.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.sp.dep.dm.*;
import chosun.ciis.sp.dep.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class SpDep1000DAO {
	
	/***************************************************************************************/
	public SP_DEP_1000_MDataSet sp_dep_1000_m(SP_DEP_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1000_MDataSet ds = (SP_DEP_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1010_SDataSet sp_dep_1010_s(SP_DEP_1010_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1010_SDataSet ds = (SP_DEP_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1011_LDataSet sp_dep_1011_l(SP_DEP_1011_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1011_LDataSet ds = (SP_DEP_1011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1012_LDataSet sp_dep_1012_l(SP_DEP_1012_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1012_LDataSet ds = (SP_DEP_1012_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1013_LDataSet sp_dep_1013_l(SP_DEP_1013_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1013_LDataSet ds = (SP_DEP_1013_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1014_LDataSet sp_dep_1014_l(SP_DEP_1014_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1014_LDataSet ds = (SP_DEP_1014_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1020_ADataSet sp_dep_1020_a(SP_DEP_1020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1020_ADataSet ds = (SP_DEP_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1030_ADataSet sp_dep_1030_a(SP_DEP_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1030_ADataSet ds = (SP_DEP_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1040_ADataSet sp_dep_1040_a(SP_DEP_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1040_ADataSet ds = (SP_DEP_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1051_LDataSet sp_dep_1051_l(SP_DEP_1051_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1051_LDataSet ds = (SP_DEP_1051_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1055_ADataSet sp_dep_1055_a(SP_DEP_1055_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1055_ADataSet ds = (SP_DEP_1055_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_DEP_1100_MDataSet sp_dep_1100_m(SP_DEP_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1100_MDataSet ds = (SP_DEP_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1101_MDataSet sp_dep_1101_m(SP_DEP_1101_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1101_MDataSet ds = (SP_DEP_1101_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1110_ADataSet sp_dep_1110_a(SP_DEP_1110_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1110_ADataSet ds = (SP_DEP_1110_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1111_ADataSet sp_dep_1111_a(SP_DEP_1111_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1111_ADataSet ds = (SP_DEP_1111_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1120_ADataSet sp_dep_1120_a(SP_DEP_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1120_ADataSet ds = (SP_DEP_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1121_ADataSet sp_dep_1121_a(SP_DEP_1121_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1121_ADataSet ds = (SP_DEP_1121_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_DEP_1300_MDataSet sp_dep_1300_m(SP_DEP_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1300_MDataSet ds = (SP_DEP_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1310_LDataSet sp_dep_1310_l(SP_DEP_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1310_LDataSet ds = (SP_DEP_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_DEP_1510_ADataSet sp_dep_1510_a(SP_DEP_1510_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1510_ADataSet ds = (SP_DEP_1510_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1520_LDataSet sp_dep_1520_l(SP_DEP_1520_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1520_LDataSet ds = (SP_DEP_1520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1530_ADataSet sp_dep_1530_a(SP_DEP_1530_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1530_ADataSet ds = (SP_DEP_1530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/***************************************************************************************/
	public SP_DEP_1750_MDataSet sp_dep_1750_m(SP_DEP_1750_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1750_MDataSet ds = (SP_DEP_1750_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public SP_DEP_1751_LDataSet sp_dep_1751_l(SP_DEP_1751_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_1751_LDataSet ds = (SP_DEP_1751_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	/********************************************************************************************/
	
	public SP_DEP_4600_MDataSet sp_dep_4600_m(SP_DEP_4600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_4600_MDataSet ds = (SP_DEP_4600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 	
	
	public SP_DEP_4610_LDataSet sp_dep_4610_l(SP_DEP_4610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_4610_LDataSet ds = (SP_DEP_4610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SP_DEP_4620_ADataSet sp_dep_4620_a(SP_DEP_4620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_4620_ADataSet ds = (SP_DEP_4620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    
	public SP_DEP_4630_ADataSet sp_dep_4630_a(SP_DEP_4630_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        SP_DEP_4630_ADataSet ds = (SP_DEP_4630_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }       
    
	
}
