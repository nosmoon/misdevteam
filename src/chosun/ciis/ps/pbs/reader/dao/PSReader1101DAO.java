/***************************************************************************************************
 * 파일명   : PSReader1101DAO.java
 * 기능     : 독자-확장독자관리
 * 작성일자 : 2004-02-25
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.reader.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-확장독자관리
 */
public class PSReader1101DAO {
    public PSReader1101DAO() {
    }

    /**
     * 확장독자관리-초기,상세조회,RESET
     * @param PS_S_RDR_EXTNDM
     * @return PS_S_RDR_EXTNDataSet
     */
    public PS_S_RDR_EXTNDataSet selectRdr_ExtnINFO(PS_S_RDR_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_RDR_EXTNDataSet ds = (PS_S_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장독자관리-입력
     * @param PS_I_RDR_EXTNDM
     * @return PS_I_RDR_EXTNDataSet
     */
    public PS_I_RDR_EXTNDataSet insertRdr_ExtnINFO(PS_I_RDR_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_I_RDR_EXTNDataSet ds = (PS_I_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장독자관리-수정
     * @param PS_U_RDR_EXTNDM
     * @return PS_U_RDR_EXTNDataSet
     */
    public PS_U_RDR_EXTNDataSet updateRdr_ExtnINFO(PS_U_RDR_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_RDR_EXTNDataSet ds = (PS_U_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장독자관리-삭제
     * @param PS_D_RDR_EXTNDM
     * @return PS_D_RDR_EXTNDataSet
     */
    public PS_D_RDR_EXTNDataSet deleteRdr_ExtnINFO(PS_D_RDR_EXTNDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_RDR_EXTNDataSet ds = (PS_D_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
