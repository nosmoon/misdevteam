/***************************************************************************************************
 * 파일명 : PilotDAO.java
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

package chosun.ciis.co.dlco.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.ds.*;
/**
 * 
 */
public class CO_DLCO_1000DAO {
	
    public CO_DLCO_1000_LDataSet getCo_Dlco_1000(CO_DLCO_1000_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1000_LDataSet ds = (CO_DLCO_1000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public CO_DLCO_1001_LDataSet getCo_Dlco_1001(CO_DLCO_1001_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1001_LDataSet ds = (CO_DLCO_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } 
        return ds;
    }
   
    public CO_DLCO_1002_ADataSet getCo_Dlco_1002(CO_DLCO_1002_ADM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1002_ADataSet ds = (CO_DLCO_1002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public CO_DLCO_1003_LDataSet getCo_Dlco_1003(CO_DLCO_1003_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1003_LDataSet ds = (CO_DLCO_1003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public CO_DLCO_1004_LDataSet getCo_Dlco_1004(CO_DLCO_1004_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1004_LDataSet ds = (CO_DLCO_1004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public CO_DLCO_1005_LDataSet getCo_Dlco_1005(CO_DLCO_1005_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1005_LDataSet ds = (CO_DLCO_1005_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public CO_DLCO_1006_LDataSet getCo_Dlco_1006(CO_DLCO_1006_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1006_LDataSet ds = (CO_DLCO_1006_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public CO_DLCO_1100_LDataSet getCo_Dlco_1100(CO_DLCO_1100_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1100_LDataSet ds = (CO_DLCO_1100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public CO_DLCO_1008_ADataSet getCo_Dlco_1008(CO_DLCO_1008_ADM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1008_ADataSet ds = (CO_DLCO_1008_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public CO_DLCO_1009_ADataSet getCo_Dlco_1009(CO_DLCO_1009_ADM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1009_ADataSet ds = (CO_DLCO_1009_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public CO_DLCO_1010_SDataSet getCo_Dlco_1010(CO_DLCO_1010_SDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1010_SDataSet ds = (CO_DLCO_1010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public CO_DLCO_1011_LDataSet getCo_Dlco_1011(CO_DLCO_1011_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1011_LDataSet ds = (CO_DLCO_1011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public CO_DLCO_1012_ADataSet getCo_Dlco_1012(CO_DLCO_1012_ADM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1012_ADataSet ds = (CO_DLCO_1012_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public CO_DLCO_1013_ADataSet getCo_Dlco_1013(CO_DLCO_1013_ADM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1013_ADataSet ds = (CO_DLCO_1013_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public CO_DLCO_1015_LDataSet getCo_Dlco_1015(CO_DLCO_1015_LDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_DLCO_1015_LDataSet ds = (CO_DLCO_1015_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
