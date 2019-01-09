/***************************************************************************************************
 * 파일명 : SSShare1000DAO.java
 * 기능 : 정보공유 일정 처리를 위한 DAO
 * 작성일자 : 2003-10-30
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-일정 위한 DAO
 */
public class SSShare1000DAO {

	/**
	 * 정보공유 일정 초기화
	 * @param CO_L_SCHE_INITDM 객체
	 * @return CO_L_SCHE_INITDataSet 객체
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */
	public CO_L_SCHE_INITDataSet selectInitList(CO_L_SCHE_INITDM dm) throws AppException{
		 DBManager manager = new DBManager("Oracle");
		 CO_L_SCHE_INITDataSet ds = (CO_L_SCHE_INITDataSet)manager.executeCall(dm);
		 if(!"".equals(ds.errcode)){
				throw new AppException(ds.errcode, ds.errmsg);
		 }
		 return ds;
	}

	/**
	 * 정보공유 일정 리스트 조회
	 * @param CO_L_SCHEDM 객체
	 * @return CO_L_SCHEDataSet 객체
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public CO_L_SCHEDataSet selectTacomScheList(CO_L_SCHEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_L_SCHEDataSet ds = (CO_L_SCHEDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * 정보공유 일정 상세정보 조회
	 * @param CO_S_SCHEDM
	 * @return 정보공유 일정 상세정보 DataSet
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public CO_S_SCHEDataSet selectTacomScheDetail(CO_S_SCHEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		CO_S_SCHEDataSet ds = (CO_S_SCHEDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * 정보공유 일정 상세정보 등록, 수정, 삭제
	 * @param CO_A_SCHEDM
	 * @return boolean
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean accessTacomSche(CO_A_SCHEDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		CO_A_SCHEDataSet ds = (CO_A_SCHEDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}