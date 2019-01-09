/***************************************************************************************************
 * 파일명 : SSReader1500DAO.java
 * 기  능 : 독자현황-VacationStop-코드를 위한 DAO
 * 작성일자 : 2004-03-29
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-VacationStop-코드를 위한 DAO
 */

public class SSReader1500DAO {

    /**
     * 독자현황-VacationStop-코드-초기화면
     * @param dm SS_L_VSCD_INITDM 객체
     * @return SS_L_VSCD_INITDataSet
     * @throws AppException
     */
    public SS_L_VSCD_INITDataSet initVsCode(SS_L_VSCD_INITDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_L_VSCD_INITDataSet ds = (SS_L_VSCD_INITDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * 독자현황-VacationStop-코드-목록
     * @param dm SS_L_VSCDDM 객체
     * @return SS_L_VSCDDataSet
     * @throws AppException
     * @throws RemoteException
     */
    public SS_L_VSCDDataSet selectVsCodeList(SS_L_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_L_VSCDDataSet ds = (SS_L_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * 독자현황-VacationStop-코드-상세
     * @param dm SS_S_VSCDDM 객체
     * @return SS_S_VSCDDataSet
     * @throws AppException
     */
    public SS_S_VSCDDataSet selectVsCodeDetail(SS_S_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_S_VSCDDataSet ds = (SS_S_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * 독자현황-VacationStop-코드-등록
     * @param dm SS_A_VSCDDM 객체
     * @return SS_A_VSCDDataSet
     * @throws AppException
     */
    public SS_A_VSCDDataSet insertVsCode(SS_A_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_A_VSCDDataSet ds = (SS_A_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * 독자현황-VacationStop-코드-수정
     * @param dm SS_A_VSCDDM 객체
     * @return SS_A_VSCDDataSet
     * @throws AppException
     */
    public SS_A_VSCDDataSet updateVsCode(SS_A_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_A_VSCDDataSet ds = (SS_A_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

    /**
     * 독자현황-VacationStop-코드-삭제
     * @param dm SS_A_VSCDDM 객체
     * @return SS_A_VSCDDataSet
     * @throws AppException
     */
    public SS_A_VSCDDataSet deleteVsCode(SS_A_VSCDDM dm) throws AppException {
      DBManager manager = new DBManager("Oracle");
      SS_A_VSCDDataSet ds = (SS_A_VSCDDataSet)manager.executeCall(dm);
      if(!"".equals(ds.errcode)){
         throw new AppException(ds.errcode, ds.errmsg);
      }
      return ds;
    }

}