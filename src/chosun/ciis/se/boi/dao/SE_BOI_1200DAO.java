/***************************************************************************************************
 * 파일명 : SE_BOI_1200DAO.java
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
public class SE_BOI_1200DAO {
	
    public SE_BOI_1200_MDataSet se_boi_1200_m(SE_BOI_1200_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1200_MDataSet ds = (SE_BOI_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1210_LDataSet se_boi_1210_l(SE_BOI_1210_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1210_LDataSet ds = (SE_BOI_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1220_UDataSet se_boi_1220_u(SE_BOI_1220_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1220_UDataSet ds = (SE_BOI_1220_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    
}
