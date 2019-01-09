/***************************************************************************************************
 * 파일명 : PL_CLS_1500DAO.java
 * 기능 : 마감관리-입금월가마감
 * 작성일자 : 2009.08.26
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
public class PL_CLS_1500DAO {
	
    /**
     * 메인
     * @param PL_CLS_1500_MDM
     * @return PL_CLS_1500_MDataSet
     */
    public PL_CLS_1500_MDataSet pl_cls_1500_m(PL_CLS_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1500_MDataSet ds = (PL_CLS_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_CLS_1510_LDM
     * @return PL_CLS_1510_LDataSet
     */
    public PL_CLS_1510_LDataSet pl_cls_1510_l(PL_CLS_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1510_LDataSet ds = (PL_CLS_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 마감/마감취소
     * @param PL_CLS_1520_ADM
     * @return PL_CLS_1520_ADataSet
     */
    public PL_CLS_1520_ADataSet pl_cls_1520_a(PL_CLS_1520_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1520_ADataSet ds = (PL_CLS_1520_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
