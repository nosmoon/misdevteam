/***************************************************************************************************
 * 파일명 : PL_RCP_1100DAO.java
 * 기능 : 입금관리-입금반환처리
 * 작성일자 : 2009.04.23
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
public class PL_RCP_1100DAO {
	
    /**
     * 메인
     * @param PL_RCP_1100_MDM
     * @return PL_RCP_1100_MDataSet
     */
    public PL_RCP_1100_MDataSet pl_rcp_1100_m(PL_RCP_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1100_MDataSet ds = (PL_RCP_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_RCP_1110_LDM
     * @return PL_RCP_1110_LDataSet
     */
    public PL_RCP_1110_LDataSet pl_rcp_1110_l(PL_RCP_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1110_LDataSet ds = (PL_RCP_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_RCP_1120_LDM
     * @return PL_RCP_1120_LDataSet
     */
    public PL_RCP_1120_LDataSet pl_rcp_1120_l(PL_RCP_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1120_LDataSet ds = (PL_RCP_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 보증금및마감정보조회
     * @param PL_RCP_1130_LDM
     * @return PL_RCP_1130_LDataSet
     */
    public PL_RCP_1130_LDataSet pl_rcp_1130_l(PL_RCP_1130_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1130_LDataSet ds = (PL_RCP_1130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_RCP_1140_ADM
     * @return PL_RCP_1140_ADataSet
     */
    public PL_RCP_1140_ADataSet pl_rcp_1140_a(PL_RCP_1140_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1140_ADataSet ds = (PL_RCP_1140_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
