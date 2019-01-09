/***************************************************************************************************
 * 파일명 : .java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_1410_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1420_IDM;
import chosun.ciis.ad.bas.ds.AD_BAS_1410_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1420_IDataSet;
/**
 * 
 */
public class AdBas1400DAO {
	
	//담당별 거래처 리스트
	public AD_BAS_1410_LDataSet ad_bas_1410_l(AD_BAS_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1410_LDataSet ds = (AD_BAS_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	//담당 지역 저장
	public AD_BAS_1420_IDataSet ad_bas_1420_i(AD_BAS_1420_IDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1420_IDataSet ds = (AD_BAS_1420_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
}
