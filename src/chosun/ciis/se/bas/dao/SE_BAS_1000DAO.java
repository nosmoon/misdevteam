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

package chosun.ciis.se.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

//import chosun.ciis.se.bas.dm.SE_BAS_1010_LDM;
//import chosun.ciis.se.bas.ds.SE_BAS_1010_LDataSet;

import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */
public class SE_BAS_1000DAO {
	
    public SE_BAS_1010_LDataSet getList(SE_BAS_1010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1010_LDataSet ds = (SE_BAS_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BAS_1020_SDataSet getDetail(SE_BAS_1020_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1020_SDataSet ds = (SE_BAS_1020_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BAS_1030_ADataSet multiUpdate(SE_BAS_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1030_ADataSet ds = (SE_BAS_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /*
    public SE_BAS_1020_SDataSet multiUpdate(SE_BAS_1020_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1020_SDataSet ds = (SE_BAS_1020_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    */
    public SE_BAS_1040_MDataSet se_bas_1040_m(SE_BAS_1040_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1040_MDataSet ds = (SE_BAS_1040_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
