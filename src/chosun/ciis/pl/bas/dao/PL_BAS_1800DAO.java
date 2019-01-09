/***************************************************************************************************
 * 파일명 : PL_BAS_1800DAO.java
 * 기능 : 기초관리-발행사코드관리
 * 작성일자 : 2009.06.22
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */
public class PL_BAS_1800DAO {
	
    /**
     * 메인
     * @param PL_BAS_1800_MDM
     * @return PL_BAS_1800_MDataSet
     */
    public PL_BAS_1800_MDataSet pl_bas_1800_m(PL_BAS_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1800_MDataSet ds = (PL_BAS_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_BAS_1810_LDM
     * @return PL_BAS_1810_LDataSet
     */
    public PL_BAS_1810_LDataSet pl_bas_1810_l(PL_BAS_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1810_LDataSet ds = (PL_BAS_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_BAS_1820_ADM
     * @return PL_BAS_1820_ADataSet
     */
    public PL_BAS_1820_ADataSet pl_bas_1820_a(PL_BAS_1820_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1820_ADataSet ds = (PL_BAS_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
