/***************************************************************************************************
 * 파일명 : PL_CLS_1300DAO.java
 * 기능 : 마감관리-입금월마감
 * 작성일자 : 2009.05.15
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
public class PL_CLS_1300DAO {
	
    /**
     * 메인
     * @param PL_CLS_1300_MDM
     * @return PL_CLS_1300_MDataSet
     */
    public PL_CLS_1300_MDataSet pl_cls_1300_m(PL_CLS_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1300_MDataSet ds = (PL_CLS_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_CLS_1310_LDM
     * @return PL_CLS_1310_LDataSet
     */
    public PL_CLS_1310_LDataSet pl_cls_1310_l(PL_CLS_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1310_LDataSet ds = (PL_CLS_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 마감/마감취소
     * @param PL_CLS_1320_ADM
     * @return PL_CLS_1320_ADataSet
     */
    public PL_CLS_1320_ADataSet pl_cls_1320_a(PL_CLS_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1320_ADataSet ds = (PL_CLS_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
