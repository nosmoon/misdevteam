/***************************************************************************************************
 * 파일명 : PL_BAS_1100DAO.java
 * 기능 : 기초관리-단행본매체관리
 * 작성일자 : 2009.02.11
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
public class PL_BAS_1100DAO {
	
    /**
     * 메인
     * @param PL_BAS_1100_MDM
     * @return PL_BAS_1100_MDataSet
     */
    public PL_BAS_1100_MDataSet pl_bas_1100_m(PL_BAS_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1100_MDataSet ds = (PL_BAS_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_BAS_1110_LDM
     * @return PL_BAS_1110_LDataSet
     */
    public PL_BAS_1110_LDataSet pl_bas_1110_l(PL_BAS_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1110_LDataSet ds = (PL_BAS_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_BAS_1120_LDM
     * @return PL_BAS_1120_LDataSet
     */
    public PL_BAS_1120_LDataSet pl_bas_1120_l(PL_BAS_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1120_LDataSet ds = (PL_BAS_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 등록/수정/삭제
     * @param PL_BAS_1130_ADM
     * @return PL_BAS_1130_ADataSet
     */
    public PL_BAS_1130_ADataSet pl_bas_1130_a(PL_BAS_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1130_ADataSet ds = (PL_BAS_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 발행내역
     * @param PL_BAS_1140_ADM
     * @return PL_BAS_1140_ADataSet
     */
    public PL_BAS_1140_ADataSet pl_bas_1140_a(PL_BAS_1140_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1140_ADataSet ds = (PL_BAS_1140_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 판수내역
     * @param PL_BAS_1150_ADM
     * @return PL_BAS_1150_ADataSet
     */
    public PL_BAS_1150_ADataSet pl_bas_1150_a(PL_BAS_1150_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1150_ADataSet ds = (PL_BAS_1150_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 부록내역
     * @param PL_BAS_1160_ADM
     * @return PL_BAS_1160_ADataSet
     */
    public PL_BAS_1160_ADataSet pl_bas_1160_a(PL_BAS_1160_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1160_ADataSet ds = (PL_BAS_1160_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
