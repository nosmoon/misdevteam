/***************************************************************************************************
* 파일명 : SE_BNS_2000DAO.java
* 기능 : 판매 - 판촉물관리 - 판촉물 세금계산서 정정
* 작성일자 : 2009-05-01
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.SE_BNS_2000_MDM;
import chosun.ciis.se.bns.dm.SE_BNS_2010_LDM;
import chosun.ciis.se.bns.dm.SE_BNS_2020_UDM;
import chosun.ciis.se.bns.dm.SE_BNS_2030_ADM;
import chosun.ciis.se.bns.ds.SE_BNS_2000_MDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2010_LDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2020_UDataSet;
import chosun.ciis.se.bns.ds.SE_BNS_2030_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_2000DAO {
	
    public SE_BNS_2000_MDataSet se_bns_2000_m(SE_BNS_2000_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_2000_MDataSet ds = (SE_BNS_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_2010_LDataSet se_bns_2010_l(SE_BNS_2010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_2010_LDataSet ds = (SE_BNS_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_2020_UDataSet se_bns_2020_u(SE_BNS_2020_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_2020_UDataSet ds = (SE_BNS_2020_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BNS_2030_ADataSet se_bns_2030_a(SE_BNS_2030_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BNS_2030_ADataSet ds = (SE_BNS_2030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
