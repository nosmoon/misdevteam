/***************************************************************************************************
 * 파일명 : SE_BOI_11000DAO.java_모바일용
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

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 *
 */
public class SE_BOI_11000DAO {

    public SE_BOI_1000_MDataSet mo_se_boi_1000_m(SE_BOI_1000_MDM dm) throws AppException { //모바일용

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1000_MDataSet ds = (SE_BOI_1000_MDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    public SE_MO_BOI_1010_LDataSet mo_se_boi_1010_l(SE_MO_BOI_1010_LDM dm) throws AppException {  //모바일용

        DBManager manager = new DBManager("MISSEL");
        SE_MO_BOI_1010_LDataSet ds = (SE_MO_BOI_1010_LDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    public SE_MO_BOI_1020_SDataSet mo_se_boi_1020_s(SE_MO_BOI_1020_SDM dm) throws AppException { //모바일용
        DBManager manager = new DBManager("MISSEL");
        SE_MO_BOI_1020_SDataSet ds = (SE_MO_BOI_1020_SDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    public SE_BOI_1030_SDataSet mo_se_boi_1030_s(SE_BOI_1030_SDM dm) throws AppException { //모바일용

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1030_SDataSet ds = (SE_BOI_1030_SDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    public SE_BOI_1040_SDataSet mo_se_boi_1040_s(SE_BOI_1040_SDM dm) throws AppException {  //모바일용

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1040_SDataSet ds = (SE_BOI_1040_SDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

}
