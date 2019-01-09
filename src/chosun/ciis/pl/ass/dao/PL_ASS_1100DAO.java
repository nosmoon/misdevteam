/***************************************************************************************************
 * 파일명 : PL_ASS_1100DAO.java
 * 기능 : 배정관리-단행본배정
 * 작성일자 : 2009.03.17
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
public class PL_ASS_1100DAO {
	
    /**
     * 메인
     * @param PL_ASS_1100_MDM
     * @return PL_ASS_1100_MDataSet
     */
    public PL_ASS_1100_MDataSet pl_ass_1100_m(PL_ASS_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1100_MDataSet ds = (PL_ASS_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 배정계획
     * @param PL_ASS_1110_LDM
     * @return PL_ASS_1110_LDataSet
     */
    public PL_ASS_1110_LDataSet pl_ass_1110_l(PL_ASS_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1110_LDataSet ds = (PL_ASS_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 배정조회
     * @param PL_ASS_1120_LDM
     * @return PL_ASS_1120_LDataSet
     */
    public PL_ASS_1120_LDataSet pl_ass_1120_l(PL_ASS_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1120_LDataSet ds = (PL_ASS_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 등록/수정/삭제
     * @param PL_ASS_1130_ADM
     * @return PL_ASS_1130_ADataSet
     */
    public PL_ASS_1130_ADataSet pl_ass_1130_a(PL_ASS_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_ASS_1130_ADataSet ds = (PL_ASS_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
