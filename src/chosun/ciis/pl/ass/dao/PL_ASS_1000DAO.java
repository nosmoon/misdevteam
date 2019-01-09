/***************************************************************************************************
 * 파일명 : PL_ASS_1000DAO.java
 * 기능 : 배정관리-정간물배정
 * 작성일자 : 2009.03.12
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.ass.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.ass.dm.*;
import chosun.ciis.pl.ass.ds.*;

/**
 * 
 */
public class PL_ASS_1000DAO {
	
    /**
     * 메인
     * @param PL_ASS_1000_MDM
     * @return PL_ASS_1000_MDataSet
     */
    public PL_ASS_1000_MDataSet pl_ass_1000_m(PL_ASS_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1000_MDataSet ds = (PL_ASS_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 배정계획
     * @param PL_ASS_1010_LDM
     * @return PL_ASS_1010_LDataSet
     */
    public PL_ASS_1010_LDataSet pl_ass_1010_l(PL_ASS_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1010_LDataSet ds = (PL_ASS_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 배정조회
     * @param PL_ASS_1020_LDM
     * @return PL_ASS_1020_LDataSet
     */
    public PL_ASS_1020_LDataSet pl_ass_1020_l(PL_ASS_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1020_LDataSet ds = (PL_ASS_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 등록/수정/삭제
     * @param PL_ASS_1030_ADM
     * @return PL_ASS_1030_ADataSet
     */
    public PL_ASS_1030_ADataSet pl_ass_1030_a(PL_ASS_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1030_ADataSet ds = (PL_ASS_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 호수Get
     * @param PL_ASS_1040_SDM
     * @return PL_ASS_1040_SDataSet
     */
    public PL_ASS_1040_SDataSet pl_ass_1040_s(PL_ASS_1040_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1040_SDataSet ds = (PL_ASS_1040_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
