/***************************************************************************************************
 * 파일명 : PSShare1101DAO.java
 * 기능 : 정보공유 일정 처리를 위한 DAO
 * 작성일자 : 2004-02-20
 * 작성자 : 전현표
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ps.pbs.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * 정보공유-일정 위한 DAO
 */
public class PSShare1101DAO {

	/**
	 * 정보공유 일정 리스트 조회
	 * @param PS_L_TACOM_SCHEDM 객체
	 * @return PS_L_TACOM_SCHEDataSet 객체
	 * @author CRM 출판국팀
	 */

	public PS_L_TACOM_SCHEDataSet selectTacomScheList(PS_L_TACOM_SCHEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		PS_L_TACOM_SCHEDataSet ds = (PS_L_TACOM_SCHEDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * 정보공유 일정 상세정보 조회
	 * @param PS_S_TACOM_SCHEDM
	 * @return PS_S_TACOM_SCHEDataSet
	 * @author CRM 출판국팀
	 */

	public PS_S_TACOM_SCHEDataSet selectTacomScheDetail(PS_S_TACOM_SCHEDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		PS_S_TACOM_SCHEDataSet ds = (PS_S_TACOM_SCHEDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * 정보공유 일정 상세정보 등록, 수정, 삭제
	 * @param PS_A_TACOM_SCHEDM
	 * @return boolean
	 * @author CRM 출판국팀
	 */

	public boolean accessTacomSche(PS_A_TACOM_SCHEDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		PS_A_TACOM_SCHEDataSet ds = (PS_A_TACOM_SCHEDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}