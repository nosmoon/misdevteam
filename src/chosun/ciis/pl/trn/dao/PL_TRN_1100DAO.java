/***************************************************************************************************
 * 파일명 : PL_TRN_1100DAO.java
 * 기능 : 회수관리-정간물매체별회수
 * 작성일자 : 2009.04.01
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.trn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.trn.dm.*;
import chosun.ciis.pl.trn.ds.*;

/**
 * 
 */
public class PL_TRN_1100DAO {
	
    /**
     * 메인
     * @param PL_TRN_1100_MDM
     * @return PL_TRN_1100_MDataSet
     */
    public PL_TRN_1100_MDataSet pl_trn_1100_m(PL_TRN_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1100_MDataSet ds = (PL_TRN_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_TRN_1110_LDM
     * @return PL_TRN_1110_LDataSet
     */
    public PL_TRN_1110_LDataSet pl_trn_1110_l(PL_TRN_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1110_LDataSet ds = (PL_TRN_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_TRN_1120_LDM
     * @return PL_TRN_1120_LDataSet
     */
    public PL_TRN_1120_LDataSet pl_trn_1120_l(PL_TRN_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1120_LDataSet ds = (PL_TRN_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_TRN_1130_ADM
     * @return PL_TRN_1130_ADataSet
     */
    public PL_TRN_1130_ADataSet pl_trn_1130_a(PL_TRN_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1130_ADataSet ds = (PL_TRN_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
