/***************************************************************************************************
* 파일명 : SE_SAL_1200DAO.java
* 기능 : 판매 - 지대관리 - 매출관리 - 매출생성
* 작성일자 : 2009-04-10
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.SE_SAL_1200_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1210_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1220_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1200_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1210_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1220_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SAL_1200DAO {
    public SE_SAL_1200_MDataSet se_sal_1200_m(SE_SAL_1200_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1200_MDataSet ds = (SE_SAL_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SE_SAL_1210_LDataSet se_sal_1210_l(SE_SAL_1210_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1210_LDataSet ds = (SE_SAL_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_SAL_1220_ADataSet se_sal_1220_a(SE_SAL_1220_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_1220_ADataSet ds = (SE_SAL_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
