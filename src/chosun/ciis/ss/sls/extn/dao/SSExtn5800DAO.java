/***************************************************************************************************
 * 파일명 : SSExtn5800DAO.java
 * 기능 : 확장관리-글쓰기 노트
 * 작성일자 : 2018-02-09
 * 작성자 : 민기홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * DAO
 */
public class SSExtn5800DAO {
 
	public SS_SLS_EXTN_5800_ADataSet SS_SLS_EXTN_5800_A(SS_SLS_EXTN_5800_ADM dm) throws AppException {
		// TODO Auto-generated method stub
		DBManager manager = new DBManager("Oracle");
		SS_SLS_EXTN_5800_ADataSet ds = (SS_SLS_EXTN_5800_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}

	public SS_SLS_EXTN_5820_UDataSet updateBuyerInfo(SS_SLS_EXTN_5820_UDM dm) throws AppException {
		// TODO Auto-generated method stub
		DBManager manager = new DBManager("Oracle");
		SS_SLS_EXTN_5820_UDataSet ds = (SS_SLS_EXTN_5820_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}

	public SS_SLS_EXTN_5830_UDataSet dlvComplete(SS_SLS_EXTN_5830_UDM dm) throws AppException {
		// TODO Auto-generated method stub
		DBManager manager = new DBManager("Oracle");
		SS_SLS_EXTN_5830_UDataSet ds = (SS_SLS_EXTN_5830_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}

	public SS_SLS_EXTN_5810_LDataSet SS_SLS_EXTN_5810_L(SS_SLS_EXTN_5810_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5810_LDataSet ds = (SS_SLS_EXTN_5810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}

	public SS_SLS_EXTN_5840_UDataSet isDlvChg(SS_SLS_EXTN_5840_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5840_UDataSet ds = (SS_SLS_EXTN_5840_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}
	
	public SS_SLS_EXTN_5850_UDataSet isPayCanc(SS_SLS_EXTN_5850_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_5850_UDataSet ds = (SS_SLS_EXTN_5850_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
	}

	
	
}    