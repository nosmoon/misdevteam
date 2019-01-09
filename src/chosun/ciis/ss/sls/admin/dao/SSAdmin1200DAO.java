/***************************************************************************************************
* 파일명 : SSAdmin1200DAO.java
* 기능 : 관리자-작업-마이그레이션을 위한 DAO
* 작성일자 : 2004-02-13
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-작업-마이그레이션을 위한 DAO
 */
public class SSAdmin1200DAO {
    /**
     * 관리자-마이그레이션-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet init(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마이그레이션-목록
     * @param dm SS_L_MIGRWORKCHKDM
     * @return SS_L_MIGRWORKCHKDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKCHKDataSet selectMigBOCDList(SS_L_MIGRWORKCHKDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKCHKDataSet ds = (SS_L_MIGRWORKCHKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마이그레이션-TEMP테이블 지명별현황
     * @param dm SS_L_MIGRTMPMECDDM
     * @return SS_L_MIGRTMPMECDDataSet
     * @throws AppException
     */
    public SS_L_MIGRMECDDataSet selectMIGRMECD(SS_L_MIGRMECDDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRMECDDataSet ds = (SS_L_MIGRMECDDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마이그레이션-TEMP테이블 구역별현황
     * @param dm SS_L_MIGRGUYUKDM
     * @return SS_L_MIGRGUYUKDataSet
     * @throws AppException
     */
    public SS_L_MIGRGUYUKDataSet selectMIGRGUYUK(SS_L_MIGRGUYUKDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRGUYUKDataSet ds = (SS_L_MIGRGUYUKDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마이그레이션-TEMP테이블 수금방법별현황
     * @param dm SS_L_MIGRSGBANGDM
     * @return SS_L_MIGRSGBANGDataSet
     * @throws AppException
     */
    public SS_L_MIGRSGBANGDataSet selectMIGRSGBANG(SS_L_MIGRSGBANGDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRSGBANGDataSet ds = (SS_L_MIGRSGBANGDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마이그레이션-오류독자 조회
     * @param dm SS_L_MIGRERRDM
     * @return SS_L_MIGRERRDataSet
     * @throws AppException
     */
    public SS_L_MIGRERRDataSet selectMIGRERR(SS_L_MIGRERRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRERRDataSet ds = (SS_L_MIGRERRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
