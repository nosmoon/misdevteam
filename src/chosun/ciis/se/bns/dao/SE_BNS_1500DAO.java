/***************************************************************************************************
* 파일명 : SE_BNS_1500DAO.java
* 기능 : 판매 - 판촉물관리 - 판촉물배분처리
* 작성일자 : 2009-05-06
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.SE_BNS_1510_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1520_SDM;
import chosun.ciis.se.bns.dm.SE_BNS_1530_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_1510_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1520_SDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1530_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_1500DAO {
	
	public SE_BNS_1510_LDataSet se_bns_1510_l(SE_BNS_1510_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1510_LDataSet ds = (SE_BNS_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SE_BNS_1520_SDataSet se_bns_1520_s(SE_BNS_1520_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1520_SDataSet ds = (SE_BNS_1520_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1530_ADataSet se_bns_1530_a(SE_BNS_1530_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1530_ADataSet ds = (SE_BNS_1530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
