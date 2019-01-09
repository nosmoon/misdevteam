/***************************************************************************************************
 * 파일명 : PL_RTN_1000DAO.java
 * 기능 : 반품관리-정간물거래처별반품
 * 작성일자 : 2009.03.30
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.rtn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.rtn.dm.*;
import chosun.ciis.pl.rtn.ds.*;

/**
 * 
 */
public class PL_RTN_1000DAO {
	
    /**
     * 메인
     * @param PL_RTN_1000_MDM
     * @return PL_RTN_1000_MDataSet
     */
    public PL_RTN_1000_MDataSet pl_rtn_1000_m(PL_RTN_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1000_MDataSet ds = (PL_RTN_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_RTN_1010_LDM
     * @return PL_RTN_1010_LDataSet
     */
    public PL_RTN_1010_LDataSet pl_rtn_1010_l(PL_RTN_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1010_LDataSet ds = (PL_RTN_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_RTN_1020_LDM
     * @return PL_RTN_1020_LDataSet
     */
    public PL_RTN_1020_LDataSet pl_rtn_1020_l(PL_RTN_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1020_LDataSet ds = (PL_RTN_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 대상조회
     * @param PL_RTN_1030_LDM
     * @return PL_RTN_1030_LDataSet
     */
    public PL_RTN_1030_LDataSet pl_rtn_1030_l(PL_RTN_1030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1030_LDataSet ds = (PL_RTN_1030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_RTN_1040_ADM
     * @return PL_RTN_1040_ADataSet
     */
    public PL_RTN_1040_ADataSet pl_rtn_1040_a(PL_RTN_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1040_ADataSet ds = (PL_RTN_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
