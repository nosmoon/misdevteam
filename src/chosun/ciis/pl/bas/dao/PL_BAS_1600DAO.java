/***************************************************************************************************
 * 파일명 : PL_BAS_1600DAO.java
 * 기능 : 기초관리-매체코드관리
 * 작성일자 : 2009.05.18
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */
public class PL_BAS_1600DAO {
	
    /**
     * 메인
     * @param PL_BAS_1600_MDM
     * @return PL_BAS_1600_MDataSet
     */
    public PL_BAS_1600_MDataSet pl_bas_1600_m(PL_BAS_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1600_MDataSet ds = (PL_BAS_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_BAS_1610_LDM
     * @return PL_BAS_1610_LDataSet
     */
    public PL_BAS_1610_LDataSet pl_bas_1610_l(PL_BAS_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1610_LDataSet ds = (PL_BAS_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_BAS_1620_ADM
     * @return PL_BAS_1620_ADataSet
     */
    public PL_BAS_1620_ADataSet pl_bas_1620_a(PL_BAS_1620_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1620_ADataSet ds = (PL_BAS_1620_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
