/***************************************************************************************************
 * 파일명 : PL_CLS_1100DAO.java
 * 기능 : 마감관리-사내판매일마감
 * 작성일자 : 2009.05.11
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.cls.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */
public class PL_CLS_1100DAO {
	
    /**
     * 메인
     * @param PL_CLS_1100_MDM
     * @return PL_CLS_1100_MDataSet
     */
    public PL_CLS_1100_MDataSet pl_cls_1100_m(PL_CLS_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1100_MDataSet ds = (PL_CLS_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_CLS_1110_LDM
     * @return PL_CLS_1110_LDataSet
     */
    public PL_CLS_1110_LDataSet pl_cls_1110_l(PL_CLS_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1110_LDataSet ds = (PL_CLS_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 마감/마감취소
     * @param PL_CLS_1120_ADM
     * @return PL_CLS_1120_ADataSet
     */
    public PL_CLS_1120_ADataSet pl_cls_1120_a(PL_CLS_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1120_ADataSet ds = (PL_CLS_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
