/***************************************************************************************************
 * 파일명   : AdCom1400DAO.java
 * 기능     : 업무연락-광고원고수배장 / 중점확인광고리스트 화면의 모든 이벤트를 처리
 * 작성일자 : 
 * 작성자   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 ***************************************************************************************************/

package chosun.ciis.ad.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.com.dm.AD_COM_1410_LDM;
import chosun.ciis.ad.com.dm.AD_COM_1420_ADM;
import chosun.ciis.ad.com.dm.AD_COM_1430_ADM;
import chosun.ciis.ad.com.ds.AD_COM_1410_LDataSet;
import chosun.ciis.ad.com.ds.AD_COM_1420_ADataSet;
import chosun.ciis.ad.com.ds.AD_COM_1430_ADataSet;


/**
 * 업무연락-광고원고수배장 / 중점확인광고리스트
 */
 
public class AdCom1400DAO {
	
	/**
     * 업무연락-광고원고수배장 / 중점확인광고리스트 조회
     * @param dm AD_COM_1410_LDM
     * @return AD_COM_1410_LDataSet
     * @throws AppException
     */
    public AD_COM_1410_LDataSet ad_com_1410_l(AD_COM_1410_LDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1410_LDataSet ds = (AD_COM_1410_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
    
    /**
     * 업무연락-광고원고수배장 등록, 수정, 삭제
     * @param dm AD_COM_1420_ADM
     * @return AD_COM_1420_ADataSet
     * @throws AppException
     */
    public AD_COM_1420_ADataSet ad_com_1420_a(AD_COM_1420_ADM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1420_ADataSet ds = (AD_COM_1420_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

    /**
     * 업무연락-중점확인광고리스트 등록, 수정, 삭제
     * @param dm AD_COM_1430_ADM
     * @return AD_COM_1430_ADataSet
     * @throws AppException
     */
    public AD_COM_1430_ADataSet ad_com_1430_a(AD_COM_1430_ADM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1430_ADataSet ds = (AD_COM_1430_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
}
