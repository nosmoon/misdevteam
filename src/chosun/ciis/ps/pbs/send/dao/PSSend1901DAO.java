/***************************************************************************************************
 * 파일명   : PSSend1901DAO.java
 * 기능     : 발송-지로정상발송 화면의 모든 이벤트를 처리
 * 작성일자 : 2004/03/11
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.send.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-지로정상발송
 */
public class PSSend1901DAO {

    /**
     * 지로정상발송처리 코드관리 초기 Combo Box설정
     * @param dm PS_S_SEND_LUMP_PROCDM
     * @return PS_S_SEND_LUMP_PROCDataSet
     * @throws AppException
     */
    public PS_S_SEND_LUMP_PROCDataSet selectCombolist(PS_S_SEND_LUMP_PROCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    /**
     * 지로정상발송 목록 조회
     * @param dm PS_L_SEND_GIRONORMDM
     * @return PS_L_SEND_GIRONORMDataSet
     * @throws AppException
     */
    public PS_L_SEND_GIRONORMDataSet selectNormsendList(PS_L_SEND_GIRONORMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_GIRONORMDataSet ds = (PS_L_SEND_GIRONORMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode,ds.errmsg);
        }
        return ds;
    }
}