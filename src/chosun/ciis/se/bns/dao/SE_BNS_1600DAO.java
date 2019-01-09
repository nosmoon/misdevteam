/***************************************************************************************************
* 파일명 : SE_BNS_1600DAO.java
* 기능 : 판매-판촉물관리 - 판촉물정정처리
* 작성일자 : 2009-04-29
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.SE_BNS_1600_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1610_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1620_SDM;
import chosun.ciis.se.bns.dm.SE_BNS_1630_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_1600_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1610_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1620_SDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1630_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_1600DAO {
	
    public SE_BNS_1600_MDataSet se_bns_1600_m(SE_BNS_1600_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1600_MDataSet ds = (SE_BNS_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1610_LDataSet se_bns_1610_l(SE_BNS_1610_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1610_LDataSet ds = (SE_BNS_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1620_SDataSet se_bns_1620_s(SE_BNS_1620_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1620_SDataSet ds = (SE_BNS_1620_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1630_ADataSet se_bns_1630_a(SE_BNS_1630_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1630_ADataSet ds = (SE_BNS_1630_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
