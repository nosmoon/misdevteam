/***************************************************************************************************
* 파일명 : SE_SAL_1000_MDM.java
* 기능 : 판매 - 지대관리 - 매출관리 - 월지역담당정보관리
* 작성일자 : 2009-04-08
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.SE_SAL_1000_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1010_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1020_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1030_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1040_DDM;
import chosun.ciis.se.sal.dm.SE_SAL_1050_LDM;
import chosun.ciis.se.sal.ds.SE_SAL_1000_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1010_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1020_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1030_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1040_DDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1050_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SAL_1000DAO {
	
    public SE_SAL_1000_MDataSet se_sal_1000_m(SE_SAL_1000_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1000_MDataSet ds = (SE_SAL_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1010_LDataSet se_sal_1010_l(SE_SAL_1010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1010_LDataSet ds = (SE_SAL_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1020_LDataSet se_sal_1020_l(SE_SAL_1020_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1020_LDataSet ds = (SE_SAL_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1030_ADataSet se_sal_1030_a(SE_SAL_1030_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1030_ADataSet ds = (SE_SAL_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1040_DDataSet se_sal_1040_d(SE_SAL_1040_DDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1040_DDataSet ds = (SE_SAL_1040_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_SAL_1050_LDataSet se_sal_1050_l(SE_SAL_1050_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1050_LDataSet ds = (SE_SAL_1050_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
