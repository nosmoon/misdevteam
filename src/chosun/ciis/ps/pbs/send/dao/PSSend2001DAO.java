/***************************************************************************************************
 * 파일명   : PSSend2001DAO.java
 * 기능     : 발송-지로추가발송 화면의 모든 이벤트를 처리
 * 작성일자 : 2003-11-18
 * 작성자   : 장수환
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
import chosun.ciis.ps.pbs.send.dao.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-지로추가발송
 */
public class PSSend2001DAO {

    /**
     * 지로추가발송처리 코드관리 초기 Combo Box설정
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
     * 지로추가발송 리스트 조회
     * @param dm PS_L_SEND_GIROADDMDM
     * @return PS_L_SEND_GIROADDMDataSet
     * @throws AppException
     */
    public PS_L_SEND_GIROADDMDataSet selectList(PS_L_SEND_GIROADDMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_GIROADDMDataSet ds = (PS_L_SEND_GIROADDMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지로추가발송 상세정보 등록/수정
     * @param dm PS_A_SEND_GIROADDMDM
     * @return boolean
     * @throws AppException
     */
    public boolean aceessGiroaddmsend(PS_A_SEND_GIROADDMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_A_SEND_GIROADDMDataSet ds = (PS_A_SEND_GIROADDMDataSet) manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }else{
          return true;
        }
    }

    /**
     * 지로추가발송 삭제
     * @param dm PS_D_SEND_GIROADDMDM
     * @return boolean
     * @throws AppException
     */
    public boolean deleteList(PS_D_SEND_GIROADDMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_D_SEND_GIROADDMDataSet ds = (PS_D_SEND_GIROADDMDataSet) manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }else{
            return true;
        }
    }

}