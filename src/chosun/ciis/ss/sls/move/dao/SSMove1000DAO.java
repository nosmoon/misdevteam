/***************************************************************************************************
* 파일명 : SSMove1000DAO.java
* 기능 : 이사독자-신청현황을 위한 DAO
* 작성일자 : 2004-01-05
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.dm.*;

/**
 * 이사독자-신청현황 을 위한 DAO
 */
public class SSMove1000DAO {
    /**
     * 이사독자-신청현황 초기화면
     * @param dm SS_L_MOVM_RDR_INITDM
     * @return SS_L_MOVM_RDR_INITDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDR_INITDataSet init(SS_L_MOVM_RDR_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDR_INITDataSet ds = (SS_L_MOVM_RDR_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-신청현황 목록
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDRDataSet selectMoveList(SS_L_MOVM_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDRDataSet ds = (SS_L_MOVM_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-신청현황 상세
     * @param dm SS_S_MOVM_RDRDM
     * @return SS_S_MOVM_RDRDataSet
     * @throws AppException
     */
    public SS_S_MOVM_RDRDataSet selectMoveDetail(SS_S_MOVM_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_S_MOVM_RDRDataSet ds = (SS_S_MOVM_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 이사독자-신청현황 취소
     * @param dm SS_A_MOVM_RDR_CANCDM
     * @return SS_A_MOVM_RDR_CANCDataSet
     * @throws AppException
     */
    public SS_A_MOVM_RDR_CANCDataSet selectMoveCancel(SS_A_MOVM_RDR_CANCDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_A_MOVM_RDR_CANCDataSet ds = (SS_A_MOVM_RDR_CANCDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 이사독자-신청현황 저장
     * @param dm SS_U_MOVM_RDRDM
     * @return SS_U_MOVM_RDRDataSet
     * @throws AppException
     */
    public SS_U_MOVM_RDRDataSet updateMoveRdr(SS_U_MOVM_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_U_MOVM_RDRDataSet ds = (SS_U_MOVM_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 이사독자-신청현황 엑셀다운
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDRDataSet printMoveRdr(SS_L_MOVM_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDRDataSet ds = (SS_L_MOVM_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
