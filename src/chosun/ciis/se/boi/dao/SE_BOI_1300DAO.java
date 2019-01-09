/***************************************************************************************************
 * 파일명 : SE_BOI_1300DAO.java
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

package chosun.ciis.se.boi.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */
public class SE_BOI_1300DAO {
	
    public SE_BOI_1300_MDataSet se_boi_1300_m(SE_BOI_1300_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1300_MDataSet ds = (SE_BOI_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1310_LDataSet se_boi_1310_l(SE_BOI_1310_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1310_LDataSet ds = (SE_BOI_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1320_LDataSet se_boi_1320_l(SE_BOI_1320_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1320_LDataSet ds = (SE_BOI_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1330_LDataSet se_boi_1330_l(SE_BOI_1330_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1330_LDataSet ds = (SE_BOI_1330_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1340_LDataSet se_boi_1340_l(SE_BOI_1340_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1340_LDataSet ds = (SE_BOI_1340_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
}
