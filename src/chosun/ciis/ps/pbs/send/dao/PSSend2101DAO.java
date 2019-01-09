/***************************************************************************************************
 * 파일명   : PSSend2101DAO.java
 * 기능     : 발송-반송관리 화면의 모든 이벤트를 처리
 * 작성일자 : 2004/03/18
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
 * 발송-반송관리
 */
public class PSSend2101DAO {

    /**
     * 반송관리 초기
     * @param PS_S_SEND_BNSBKDM
     * @return PS_S_SEND_BNSBKDataSet
     */
    public PS_S_SEND_RETNDataSet selectCodeList(PS_S_SEND_RETNDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_RETNDataSet ds = (PS_S_SEND_RETNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 반송내역 조회
     * @param PS_L_SEND_RETNDM
     * @return PS_L_SEND_RETNDataSet
     **/
    public PS_L_SEND_RETNDataSet selectRetnList(PS_L_SEND_RETNDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_SEND_RETNDataSet ds = (PS_L_SEND_RETNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 반송내역 상세조회
     * @param PS_S_SEND_RETN_DTLDM
     * @return PS_S_SEND_RETN_DTLDataSet
     **/
    public PS_S_SEND_RETN_DTLDataSet selectRetnDetail(PS_S_SEND_RETN_DTLDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_S_SEND_RETN_DTLDataSet ds = (PS_S_SEND_RETN_DTLDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 반송내역 저장처리
     * @param PS_A_RETN_PTCRDM
     * @return PS_A_RETN_PTCRDataSet
     **/
    public PS_A_RETN_PTCRDataSet accessRetn(PS_A_RETN_PTCRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_A_RETN_PTCRDataSet ds = (PS_A_RETN_PTCRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 반송관리 excel 입력
     * @param PS_I_RETN_PTCR_LUMPDM
     * @return PS_I_RETN_PTCR_LUMPDataSet
     **/
    public PS_I_RETN_PTCR_LUMPDataSet excelUpload(PS_I_RETN_PTCR_LUMPDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_I_RETN_PTCR_LUMPDataSet ds = (PS_I_RETN_PTCR_LUMPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 반송내역 삭제
     * @param PS_D_RETN_PTCR_DTLDM
     * @return PS_D_RETN_PTCR_DTLDataSet
     **/
    public PS_D_RETN_PTCR_DTLDataSet deleteRetn(PS_D_RETN_PTCR_DTLDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_D_RETN_PTCR_DTLDataSet ds = (PS_D_RETN_PTCR_DTLDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 보너스북 초기
     * @param PS_L_BNS_BOOK_CDDM
     * @return PS_L_BNS_BOOK_CDDataSet
     **/
    public PS_L_BNS_BOOK_CDDataSet selectBnsList(PS_L_BNS_BOOK_CDDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        PS_L_BNS_BOOK_CDDataSet ds = (PS_L_BNS_BOOK_CDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
