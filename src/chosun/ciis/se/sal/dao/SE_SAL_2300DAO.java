/***************************************************************************************************
* 파일명 : SE_SAL_2300DAO.java
* 기능 : 판매 - 지대관리 - 매출관리 - 출장전자료조회
* 작성일자 : 2009-04-07
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.SE_SAL_2300_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_2310_SDM;
import chosun.ciis.se.sal.dm.SE_SAL_2320_LDM;
import chosun.ciis.se.sal.ds.SE_SAL_2300_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2310_SDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2320_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SAL_2300DAO {
	
    public SE_SAL_2300_MDataSet se_sal_2300_m(SE_SAL_2300_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2300_MDataSet ds = (SE_SAL_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_2310_SDataSet se_sal_2310_s(SE_SAL_2310_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2310_SDataSet ds = (SE_SAL_2310_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_2320_LDataSet se_sal_2320_l(SE_SAL_2320_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2320_LDataSet ds = (SE_SAL_2320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
