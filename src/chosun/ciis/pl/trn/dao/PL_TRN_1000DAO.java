/***************************************************************************************************
 * 파일명 : PL_TRN_1000DAO.java
 * 기능 : 회수관리-정간물거래처별회수
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
public class PL_TRN_1000DAO {
	
    /**
     * 메인
     * @param PL_TRN_1000_MDM
     * @return PL_TRN_1000_MDataSet
     */
    public PL_TRN_1000_MDataSet pl_trn_1000_m(PL_TRN_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1000_MDataSet ds = (PL_TRN_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_TRN_1010_LDM
     * @return PL_TRN_1010_LDataSet
     */
    public PL_TRN_1010_LDataSet pl_trn_1010_l(PL_TRN_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1010_LDataSet ds = (PL_TRN_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_TRN_1020_LDM
     * @return PL_TRN_1020_LDataSet
     */
    public PL_TRN_1020_LDataSet pl_trn_1020_l(PL_TRN_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1020_LDataSet ds = (PL_TRN_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_TRN_1030_ADM
     * @return PL_TRN_1030_ADataSet
     */
    public PL_TRN_1030_ADataSet pl_trn_1030_a(PL_TRN_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_TRN_1030_ADataSet ds = (PL_TRN_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
