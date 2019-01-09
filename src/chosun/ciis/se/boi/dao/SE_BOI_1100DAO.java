/***************************************************************************************************
 * 파일명 : SE_BOI_1100DAO.java
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
public class SE_BOI_1100DAO {
	
    public SE_BOI_1100_MDataSet se_boi_1100_m(SE_BOI_1100_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1100_MDataSet ds = (SE_BOI_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1110_LDataSet se_boi_1110_l(SE_BOI_1110_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1110_LDataSet ds = (SE_BOI_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1120_UDataSet se_boi_1120_u(SE_BOI_1120_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1120_UDataSet ds = (SE_BOI_1120_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    
}
