/***************************************************************************************************
 * 파일명 : PL_RCP_1000DAO.java
 * 기능 : 입금관리-입금등록관리
 * 작성일자 : 2009.04.15
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.rcp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.ds.*;

/**
 * 
 */
public class PL_RCP_1000DAO {
	
    /**
     * 메인
     * @param PL_RCP_1000_MDM
     * @return PL_RCP_1000_MDataSet
     */
    public PL_RCP_1000_MDataSet pl_rcp_1000_m(PL_RCP_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1000_MDataSet ds = (PL_RCP_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_RCP_1010_LDM
     * @return PL_RCP_1010_LDataSet
     */
    public PL_RCP_1010_LDataSet pl_rcp_1010_l(PL_RCP_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1010_LDataSet ds = (PL_RCP_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_RCP_1020_LDM
     * @return PL_RCP_1020_LDataSet
     */
    public PL_RCP_1020_LDataSet pl_rcp_1020_l(PL_RCP_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1020_LDataSet ds = (PL_RCP_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 보증금및마감정보조회
     * @param PL_RCP_1030_LDM
     * @return PL_RCP_1030_LDataSet
     */
    public PL_RCP_1030_LDataSet pl_rcp_1030_l(PL_RCP_1030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1030_LDataSet ds = (PL_RCP_1030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_RCP_1040_ADM
     * @return PL_RCP_1040_ADataSet
     */
    public PL_RCP_1040_ADataSet pl_rcp_1040_a(PL_RCP_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1040_ADataSet ds = (PL_RCP_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
