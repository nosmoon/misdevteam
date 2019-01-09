/***************************************************************************************************
* 파일명 : SE_RCP_5000DAO.java
* 기능 : 판매- 입금관리 - 마감관리 - 일입금마감
* 작성일자 : 2009-05-20
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import chosun.ciis.se.rcp.dm.SE_RCP_5000_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5010_SDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5020_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5030_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_5000_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5010_SDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5020_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5030_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_RCP_5000DAO {
	
    public SE_RCP_5000_MDataSet se_rcp_5000_m(SE_RCP_5000_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5000_MDataSet ds = (SE_RCP_5000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_RCP_5010_SDataSet se_rcp_5010_s(SE_RCP_5010_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5010_SDataSet ds = (SE_RCP_5010_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_RCP_5020_LDataSet se_rcp_5020_l(SE_RCP_5020_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5020_LDataSet ds = (SE_RCP_5020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_RCP_5030_ADataSet se_rcp_5030_a(SE_RCP_5030_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5030_ADataSet ds = (SE_RCP_5030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
