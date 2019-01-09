/***************************************************************************************************
 * 파일명   : SSReader1700DAO.java
 * 기능     : 독자현황-독자정보조회 DAO
 * 작성일자 : 2005-04-14
 * 작성자   : 이혁
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 *
 */
public class SSReader1700DAO {
    public SSReader1700DAO() {
    }

    /**
     * 독자등급관리-등급신청내역 검색
     * @param SS_L_READER_BOINFO_INITDM
     * @return SS_L_READER_BOINFO_INITDataSet
     */
    public SS_L_READER_BOINFO_INITDataSet selectInitList(SS_L_READER_BOINFO_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-비독자관리 초기화면
     * @param SS_L_RDR_MNGMEMB_INITDM
     * @return SS_L_RDR_MNGMEMB_INITDataSet
     */
    public SS_L_RDR_MNGMEMB_INITDataSet initList(SS_L_RDR_MNGMEMB_INITDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_MNGMEMB_INITDataSet ds = (SS_L_RDR_MNGMEMB_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-비독자관리 조회
     * @param SS_L_RDR_MNGMEMBDM
     * @return SS_L_RDR_MNGMEMBDataSet
     */
    public SS_L_RDR_MNGMEMBDataSet selectList(SS_L_RDR_MNGMEMBDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_MNGMEMBDataSet ds = (SS_L_RDR_MNGMEMBDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-비독자관리 조회(모플)
     * @param SS_L_RDR_MNGMEMB_MODM
     * @return SS_L_RDR_MNGMEMB_MODataSet
     */
    public SS_L_RDR_MNGMEMB_MODataSet selectList_mo(SS_L_RDR_MNGMEMB_MODM dm) throws AppException {    	
        DBManager manager = new DBManager("MEMBER");
        SS_L_RDR_MNGMEMB_MODataSet ds = (SS_L_RDR_MNGMEMB_MODataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-비독자관리 상세조회
     * @param SS_S_RDR_MNGMEMBDM
     * @return SS_S_RDR_MNGMEMBDataSet
     */
    public SS_S_RDR_MNGMEMBDataSet detailList(SS_S_RDR_MNGMEMBDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_MNGMEMBDataSet ds = (SS_S_RDR_MNGMEMBDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-비독자관리 일괄등록
     * @param SS_I_RDR_MNGMEMBDM
     * @return SS_I_RDR_MNGMEMBDataSet
     */
    public SS_I_RDR_MNGMEMBDataSet insertList(SS_I_RDR_MNGMEMBDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_I_RDR_MNGMEMBDataSet ds = (SS_I_RDR_MNGMEMBDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-비독자관리 수정
     * @param SS_U_RDR_MNGMEMBDM
     * @return SS_U_RDR_MNGMEMBDataSet
     */
    public SS_U_RDR_MNGMEMBDataSet updateList(SS_U_RDR_MNGMEMBDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_U_RDR_MNGMEMBDataSet ds = (SS_U_RDR_MNGMEMBDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 독자현황-비독자관리 삭제
     * @param SS_D_RDR_MNGMEMBDM
     * @return SS_D_RDR_MNGMEMBDataSet
     */
    public SS_D_RDR_MNGMEMBDataSet deleteList(SS_D_RDR_MNGMEMBDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_D_RDR_MNGMEMBDataSet ds = (SS_D_RDR_MNGMEMBDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
