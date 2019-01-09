/***************************************************************************************************
* 파일명 : SE_BNS_1900DAO.java
* 기능 : 판매-판촉물관리 - 판촉물(세금)계산서
* 작성일자 : 2009-04-30
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.SE_BNS_1910_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1920_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_1910_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1920_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_1900DAO {
	
    public SE_BNS_1910_LDataSet se_bns_1910_l(SE_BNS_1910_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1910_LDataSet ds = (SE_BNS_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BNS_1920_ADataSet se_bns_1920_a(SE_BNS_1920_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1920_ADataSet ds = (SE_BNS_1920_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
