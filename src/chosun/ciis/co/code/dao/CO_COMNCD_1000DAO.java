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

package chosun.ciis.co.code.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.co.code.dm.*;
import chosun.ciis.co.code.ds.*;

/**
 * 
 */
public class CO_COMNCD_1000DAO {

    public CO_COMNCD_SDataSet getCo_Comncd_1000(CO_COMNCD_SDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");
        CO_COMNCD_SDataSet ds = (CO_COMNCD_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public CO_COCD_1130_LDataSet getCo_Cocd_1130(CO_COCD_1130_LDM dm) throws AppException, SQLException {

        DBManager manager = new DBManager("MISCOM");
        CO_COCD_1130_LDataSet ds = (CO_COCD_1130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
