/***************************************************************************************************
 * 파일명 : SE_QTY_1000DAO.java
 * 기능 : 일계표이월
 * 작성일자 : 2009-02-16
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.qty.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */
public class SE_QTY_1000DAO {
	
    public SE_QTY_1000_MDataSet se_qty_1000_m(SE_QTY_1000_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_QTY_1000_MDataSet ds = (SE_QTY_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_QTY_1010_LDataSet se_qty_1010_l(SE_QTY_1010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_QTY_1010_LDataSet ds = (SE_QTY_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_QTY_1020_ADataSet se_qty_1020_a(SE_QTY_1020_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_QTY_1020_ADataSet ds = (SE_QTY_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    
}
