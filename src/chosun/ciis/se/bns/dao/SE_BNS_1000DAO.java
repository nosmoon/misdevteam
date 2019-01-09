/***************************************************************************************************
* 파일명 : SE_BNS_1000DAO.java
* 기능 : 판매-판촉물관리 - 판촉물미수금현황
* 작성일자 : 2009-04-28
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.SE_BNS_1000_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1010_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1020_LDM;
import chosun.ciis.se.bns.ds.SE_BNS_1000_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1010_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1020_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_1000DAO {
	
    public SE_BNS_1000_MDataSet se_bns_1000_m(SE_BNS_1000_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1000_MDataSet ds = (SE_BNS_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1010_LDataSet se_bns_1010_l(SE_BNS_1010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1010_LDataSet ds = (SE_BNS_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1020_LDataSet se_bns_1020_l(SE_BNS_1020_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1020_LDataSet ds = (SE_BNS_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
