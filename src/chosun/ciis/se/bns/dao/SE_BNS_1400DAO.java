/***************************************************************************************************
* 파일명 : SE_BNS_1400_MDM.java
* 기능 : 판매-판촉물관리 - 판촉물발송일자관리
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

import chosun.ciis.se.bns.dm.SE_BNS_1400_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_1410_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_1420_ADM;
import chosun.ciis.se.bns.dm.SE_BNS_1430_DDM;
import chosun.ciis.se.bns.ds.SE_BNS_1400_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1410_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1420_ADataSet;
import chosun.ciis.se.bns.ds.SE_BNS_1430_DDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_1400DAO {
	
    public SE_BNS_1400_MDataSet se_bns_1400_m(SE_BNS_1400_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1400_MDataSet ds = (SE_BNS_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1410_LDataSet se_bns_1410_l(SE_BNS_1410_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1410_LDataSet ds = (SE_BNS_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1420_ADataSet se_bns_1420_a(SE_BNS_1420_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1420_ADataSet ds = (SE_BNS_1420_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_1430_DDataSet se_bns_1430_d(SE_BNS_1430_DDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_1430_DDataSet ds = (SE_BNS_1430_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
