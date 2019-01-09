/***************************************************************************************************
 * 파일명 : PL_RTN_1300DAO.java
 * 기능 : 반품관리-단행본매체별반품
 * 작성일자 : 2009.03.31
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
public class PL_RTN_1300DAO {
	
    /**
     * 메인
     * @param PL_RTN_1300_MDM
     * @return PL_RTN_1300_MDataSet
     */
    public PL_RTN_1300_MDataSet pl_rtn_1300_m(PL_RTN_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1300_MDataSet ds = (PL_RTN_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_RTN_1310_LDM
     * @return PL_RTN_1310_LDataSet
     */
    public PL_RTN_1310_LDataSet pl_rtn_1310_l(PL_RTN_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1310_LDataSet ds = (PL_RTN_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_RTN_1320_LDM
     * @return PL_RTN_1320_LDataSet
     */
    public PL_RTN_1320_LDataSet pl_rtn_1320_l(PL_RTN_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1320_LDataSet ds = (PL_RTN_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_RTN_1330_ADM
     * @return PL_RTN_1330_ADataSet
     */
    public PL_RTN_1330_ADataSet pl_rtn_1330_a(PL_RTN_1330_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1330_ADataSet ds = (PL_RTN_1330_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
