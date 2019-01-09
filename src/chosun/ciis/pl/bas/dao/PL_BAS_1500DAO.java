/***************************************************************************************************
 * 파일명 : PL_BAS_1500DAO.java
 * 기능 : 기초관리-목표관리
 * 작성일자 : 2009.04.30
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
public class PL_BAS_1500DAO {
	
    /**
     * 메인
     * @param PL_BAS_1500_MDM
     * @return PL_BAS_1500_MDataSet
     */
    public PL_BAS_1500_MDataSet pl_bas_1500_m(PL_BAS_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1500_MDataSet ds = (PL_BAS_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 대상조회
     * @param PL_BAS_1510_LDM
     * @return PL_BAS_1510_LDataSet
     */
    public PL_BAS_1510_LDataSet pl_bas_1510_l(PL_BAS_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1510_LDataSet ds = (PL_BAS_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_BAS_1520_LDM
     * @return PL_BAS_1520_LDataSet
     */
    public PL_BAS_1520_LDataSet pl_bas_1520_l(PL_BAS_1520_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1520_LDataSet ds = (PL_BAS_1520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_BAS_1530_ADM
     * @return PL_BAS_1530_ADataSet
     */
    public PL_BAS_1530_ADataSet pl_bas_1530_a(PL_BAS_1530_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1530_ADataSet ds = (PL_BAS_1530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
