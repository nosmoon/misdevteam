/***************************************************************************************************
* 파일명 : SSCommon11100DAO.java
* 기능 : 부서,지역 등 공통 DAO
* 작성일자 : 2016-12-14
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 판매국 공통 업무를 위한 DAO
 */
public class SSCommon11100DAO {


    /**
     * 공통-지역커서리스트
     * @param dm SL_MO_L_AREALISTDM
     * @return SL_MO_L_AREALISTDataSet
     * @throws AppException
     */
    public SL_MO_L_AREALISTDataSet mo_selectAreaList(SL_MO_L_AREALISTDM dm) throws AppException{ //모바일용
       DBManager manager = new DBManager("Oracle");
       SL_MO_L_AREALISTDataSet ds = (SL_MO_L_AREALISTDataSet)manager.executeCall(dm);
/*       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
*/
       return ds;
    }


    /**
     * 공통-센터리스트
     * @param dm SL_MO_L_BOLISTDM
     * @return SL_MO_L_BOLISTDataSet
     * @throws AppException
     */
    public SL_MO_L_BOLISTDataSet mo_selectBoList(SL_MO_L_BOLISTDM dm) throws AppException{ //모바일용
       DBManager manager = new DBManager("Oracle");
       SL_MO_L_BOLISTDataSet ds = (SL_MO_L_BOLISTDataSet)manager.executeCall(dm);
/*       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
*/
       return ds;
    }

}
