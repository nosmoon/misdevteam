/***************************************************************************************************
 * 파일명 : PL_RTN_1200DAO.java
 * 기능 : 반품관리-단행본거래처별반품
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
public class PL_RTN_1200DAO {
	
    /**
     * 메인
     * @param PL_RTN_1200_MDM
     * @return PL_RTN_1200_MDataSet
     */
    public PL_RTN_1200_MDataSet pl_rtn_1200_m(PL_RTN_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1200_MDataSet ds = (PL_RTN_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_RTN_1210_LDM
     * @return PL_RTN_1210_LDataSet
     */
    public PL_RTN_1210_LDataSet pl_rtn_1210_l(PL_RTN_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1210_LDataSet ds = (PL_RTN_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_RTN_1220_LDM
     * @return PL_RTN_1220_LDataSet
     */
    public PL_RTN_1220_LDataSet pl_rtn_1220_l(PL_RTN_1220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1220_LDataSet ds = (PL_RTN_1220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_RTN_1230_ADM
     * @return PL_RTN_1230_ADataSet
     */
    public PL_RTN_1230_ADataSet pl_rtn_1230_a(PL_RTN_1230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1230_ADataSet ds = (PL_RTN_1230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 대상조회
     * @param PL_RTN_1240_LDM
     * @return PL_RTN_1240_LDataSet
     */
    public PL_RTN_1240_LDataSet pl_rtn_1240_l(PL_RTN_1240_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RTN_1240_LDataSet ds = (PL_RTN_1240_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
