/***************************************************************************************************
 * 함수명   : PSCommonDAO.java
 * 처리개요 : 공통으로 처리되는 이벤트를 처리
 * 작성일자 : 2004-02-19
 * 작성자   : 김건호
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.dao.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * 공통사용
 */
public class PSCommonDAO {

  /**
   * 우편번호 정보와 주소를 가져온다.
   * @param PB_L_TAOCC_PSTCDDM
   * @return PB_L_TAOCC_PSTCDDataSet
   */
 public PB_L_TAOCC_PSTCDDataSet selectZipAddr(PB_L_TAOCC_PSTCDDM dm) throws AppException {
     DBManager manager = new DBManager("Oracle");
     PB_L_TAOCC_PSTCDDataSet ds = (PB_L_TAOCC_PSTCDDataSet)manager.executeCall(dm);
     if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
     }
     return ds;
 }

 /**
  * 우편번호 정보와 주소,지국코드를 가져온다.
  * @param CO_L_ZIP_BRANCHDM
  * @return CO_L_ZIP_BRANCHDataSet
  */
public CO_L_ZIP_BRANCHDataSet selectZipAddr3(CO_L_ZIP_BRANCHDM dm) throws AppException {
    DBManager manager = new DBManager("Oracle");
    CO_L_ZIP_BRANCHDataSet ds = (CO_L_ZIP_BRANCHDataSet)manager.executeCall(dm);
    if(!"".equals(ds.errcode)){
        throw new AppException(ds.errcode, ds.errmsg);
    }
    return ds;
}

    /**
   * 독자조회의 사원정보를 가져온다.
   * @param PB_S_CORBOEMPDM
   * @return PB_S_CORBOEMPDataSet
   */
 public PB_S_CORBOEMPDataSet selectEmpDetail(PB_S_CORBOEMPDM dm) throws AppException {
     DBManager manager = new DBManager("Oracle");
     PB_S_CORBOEMPDataSet ds = (PB_S_CORBOEMPDataSet)manager.executeCall(dm);
     if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
     }
     return ds;
 }

    /**
     * 지사별 부서정보를 검색한다.
     * @param PB_L_BOCDDEPTDM
     * @return PB_L_BOCDDEPTDataSet
     */
    public PB_L_BOCDDEPTDataSet selectBoDept(PB_L_BOCDDEPTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PB_L_BOCDDEPTDataSet ds = (PB_L_BOCDDEPTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

  /**
     * 기존독자검색을 한다..
     * @param PB_L_EXST_RDR_SEARCHDM
     * @return PB_L_EXST_RDR_SEARCHDataSet
     */
    public PB_L_EXST_RDR_SEARCHDataSet selectExstRdr(PB_L_EXST_RDR_SEARCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PB_L_EXST_RDR_SEARCHDataSet ds = (PB_L_EXST_RDR_SEARCHDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

  /**
   * 독자조회 조회조건별 조회정보를 가져온다.
   * @param PS_S_RDRINFODM
   * @return PS_S_RDRINFODataSet
   */
  public PS_S_RDRINFODataSet selectReaderDetail(PS_S_RDRINFODM dm) throws AppException {
    DBManager manager = new DBManager("Oracle");
    PS_S_RDRINFODataSet ds = (PS_S_RDRINFODataSet)manager.executeCall(dm);
    if(!"".equals(ds.errcode)){
       throw new AppException(ds.errcode, ds.errmsg);
    }
    return ds;
  }

  /**
   * 독자조회 조회조건별 조회정보(BOCD포함)를 가져온다.
   * @param PS_S_RDRINFODM
   * @return PS_S_RDRINFODataSet
   */
  public PS_S_RDRINFODataSet selectReaderDetailBocd(PS_S_RDRINFODM dm) throws AppException {
    DBManager manager = new DBManager("Oracle");
    PS_S_RDRINFODataSet ds = (PS_S_RDRINFODataSet)manager.executeCall(dm);
    if(!"".equals(ds.errcode)){
       throw new AppException(ds.errcode, ds.errmsg);
    }
    return ds;
  }

  /**
   * 지국검색
   * @param dm PS_L_BO_SRCHDM
   * @return PS_L_BO_SRCHDataSet
   * @throws AppException
   */
  public PS_L_BO_SRCHDataSet selectBranchOfficeList(PS_L_BO_SRCHDM dm) throws AppException{
      DBManager manager = new DBManager("Oracle");
      PS_L_BO_SRCHDataSet ds = (PS_L_BO_SRCHDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }
}
