/***************************************************************************************************
* 파일명 : SE_RCP_5100DAO.java
* 기능 : 판매- 입금관리 - 마감관리 - 전표생성
* 작성일자 : 2009-05-18
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import chosun.ciis.se.rcp.dm.SE_RCP_5100_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5110_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5120_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_5100_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5110_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5120_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_RCP_5100DAO {
	
    public SE_RCP_5100_MDataSet se_rcp_5100_m(SE_RCP_5100_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5100_MDataSet ds = (SE_RCP_5100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_RCP_5110_LDataSet se_rcp_5110_l(SE_RCP_5110_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5110_LDataSet ds = (SE_RCP_5110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_RCP_5120_ADataSet se_rcp_5120_a(SE_RCP_5120_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_RCP_5120_ADataSet ds = (SE_RCP_5120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
