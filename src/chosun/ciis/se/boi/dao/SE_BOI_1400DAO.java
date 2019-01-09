/***************************************************************************************************
 * 파일명 : SE_BOI_1400DAO.java
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
public class SE_BOI_1400DAO {
	
    public SE_BOI_1400_MDataSet se_boi_1400_m(SE_BOI_1400_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1400_MDataSet ds = (SE_BOI_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1410_LDataSet se_boi_1410_l(SE_BOI_1410_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1410_LDataSet ds = (SE_BOI_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1420_SDataSet se_boi_1420_s(SE_BOI_1420_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1420_SDataSet ds = (SE_BOI_1420_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1430_SDataSet se_boi_1430_s(SE_BOI_1430_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1430_SDataSet ds = (SE_BOI_1430_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1440_LDataSet se_boi_1440_l(SE_BOI_1440_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1440_LDataSet ds = (SE_BOI_1440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1450_LDataSet se_boi_1450_l(SE_BOI_1450_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1450_LDataSet ds = (SE_BOI_1450_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BOI_1460_LDataSet se_boi_1460_l(SE_BOI_1460_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1460_LDataSet ds = (SE_BOI_1460_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
}
