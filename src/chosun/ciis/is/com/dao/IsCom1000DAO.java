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

package chosun.ciis.is.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.ds.*;

import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class IsCom1000DAO {
	
    public IS_COM_1000_MDataSet is_com_1000_m(IS_COM_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1000_MDataSet ds = (IS_COM_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_COM_1010_LDataSet is_com_1010_l(IS_COM_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1010_LDataSet ds = (IS_COM_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1100_MDataSet is_com_1100_m(IS_COM_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1100_MDataSet ds = (IS_COM_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_COM_1110_LDataSet is_com_1110_l(IS_COM_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1110_LDataSet ds = (IS_COM_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1111_LDataSet is_com_1111_l(IS_COM_1111_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1111_LDataSet ds = (IS_COM_1111_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1200_SDataSet is_com_1200_s(IS_COM_1200_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1200_SDataSet ds = (IS_COM_1200_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1201_SDataSet is_com_1201_s(IS_COM_1201_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1201_SDataSet ds = (IS_COM_1201_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1202_SDataSet is_com_1202_s(IS_COM_1202_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1202_SDataSet ds = (IS_COM_1202_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1300_MDataSet is_com_1300_m(IS_COM_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1300_MDataSet ds = (IS_COM_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1310_LDataSet is_com_1310_l(IS_COM_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1310_LDataSet ds = (IS_COM_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1400_MDataSet is_com_1400_m(IS_COM_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1400_MDataSet ds = (IS_COM_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1410_LDataSet is_com_1410_l(IS_COM_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1410_LDataSet ds = (IS_COM_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public IS_COM_1600_MDataSet is_com_1600_m(IS_COM_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1600_MDataSet ds = (IS_COM_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_COM_1610_LDataSet is_com_1610_l(IS_COM_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1610_LDataSet ds = (IS_COM_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
    public IS_COM_1710_LDataSet is_com_1710_l(IS_COM_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1710_LDataSet ds = (IS_COM_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_COM_1810_LDataSet is_com_1810_l(IS_COM_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_COM_1810_LDataSet ds = (IS_COM_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
