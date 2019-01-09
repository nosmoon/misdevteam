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
import chosun.ciis.ad.bas.dm.AD_BAS_2100_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2110_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2110_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2120_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2130_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_2140_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_2100_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2110_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2110_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2120_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2130_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2140_ADataSet;

/**
 * 
 */
public class AdBas2100DAO {
	
    //거래처인물정보 메인
	public AD_BAS_2100_MDataSet ad_bas_2100_m(AD_BAS_2100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2100_MDataSet ds = (AD_BAS_2100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	//거래처인물정보 리스트
	public AD_BAS_2110_LDataSet ad_bas_2100_l(AD_BAS_2110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2110_LDataSet ds = (AD_BAS_2110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	//거래처인물정보 고객정보 리스트
	public AD_BAS_2120_LDataSet ad_bas_2120_l(AD_BAS_2120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2120_LDataSet ds = (AD_BAS_2120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	//거래처인물정보 상세
	public AD_BAS_2110_SDataSet ad_bas_2110_s(AD_BAS_2110_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2110_SDataSet ds = (AD_BAS_2110_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println(ds.errcode + ", " + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
		
	//거래처인물정보 등록,수정,삭제
	public AD_BAS_2130_ADataSet ad_bas_2130_a(AD_BAS_2130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2130_ADataSet ds = (AD_BAS_2130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
	//거래처인물정보 고객관리내역 등록
	public AD_BAS_2140_ADataSet ad_bas_2140_a(AD_BAS_2140_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2140_ADataSet ds = (AD_BAS_2140_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
}
