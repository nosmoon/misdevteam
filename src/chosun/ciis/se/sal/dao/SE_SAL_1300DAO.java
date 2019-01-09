/***************************************************************************************************
* 파일명 : SE_SAL_1300DAO.java
* 기능 : 판매 - 지대관리 - 매출관리 - 지국별 순매출액 조정
* 작성일자 : 2009-03-31
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.sal.dm.SE_SAL_1300_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1310_SDM;
import chosun.ciis.se.sal.dm.SE_SAL_1320_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1330_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1340_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1300_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1310_SDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1320_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1330_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1340_ADataSet;

/**
 * 
 */
public class SE_SAL_1300DAO {
	
    public SE_SAL_1300_MDataSet se_sal_1300_m(SE_SAL_1300_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1300_MDataSet ds = (SE_SAL_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1310_SDataSet se_sal_1310_s(SE_SAL_1310_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1310_SDataSet ds = (SE_SAL_1310_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1320_LDataSet se_sal_1320_l(SE_SAL_1320_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1320_LDataSet ds = (SE_SAL_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1330_ADataSet se_sal_1330_a(SE_SAL_1330_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1330_ADataSet ds = (SE_SAL_1330_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1340_ADataSet se_sal_1340_a(SE_SAL_1340_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1340_ADataSet ds = (SE_SAL_1340_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
