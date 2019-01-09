/***************************************************************************************************
 * 파일명 : SSShare1200DAO.java
 * 기능 : 정보공유 실시간지국공지 처리를 위한 DAO
 * 작성일자 : 2003-12-18
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
 * 정보공유-실시간지국공지 위한 DAO
 */
public class SSShare1200DAO {

	/**
	* 정보공유 실시간 지국공지 초기화면
	* @param SS_L_ANNCBO_INITDM 객체
	* @return SS_L_ANNCBO_INITDataSet 객체
	* @throws AppException
	*/

	public SS_L_ANNCBO_INITDataSet selectInitList(SS_L_ANNCBO_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_ANNCBO_INITDataSet ds = (SS_L_ANNCBO_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
	/**
	* 정보공유 실시간 지국공지 리스트 조회
	* @param SS_L_ANNCBODM 객체
	* @return SS_L_ANNCBODataSet 객체
	* @throws AppException
	*/

	public SS_L_ANNCBODataSet selectSrchList(SS_L_ANNCBODM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_ANNCBODataSet ds = (SS_L_ANNCBODataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
	/**
	 * 정보공유 실시간 지국공지 등록
	 * @param SS_I_ANNCBODM
	 * @return boolean
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean insertAnncbo(SS_I_ANNCBODM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_I_ANNCBODataSet ds = (SS_I_ANNCBODataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
	
	/**
	 * 정보공유 실시간 지국공지 수정
	 * @param SS_U_ANNCBODM
	 * @return boolean
	 * @author CRM 출판국팀
	 * @since 2009.04.16       ver : 1.0
	 */

	public boolean updateAnncbo(SS_U_ANNCBODM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_ANNCBODataSet ds = (SS_U_ANNCBODataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
	
	/**
	 * 정보공유 실시간 지국공지 삭제
	 * @param SS_D_ANNCBODM
	 * @return boolean
	 * @author CRM 출판국팀
	 * @since 2009.04.16       ver : 1.0
	 */

	public boolean deleteAnncbo(SS_D_ANNCBODM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_ANNCBODataSet ds = (SS_D_ANNCBODataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
	
	/**
	* 정보공유 실시간 지국공지 상세조회
	* @param SS_L_ANNCBODM 객체
	* @return SS_L_ANNCBODataSet 객체
	* @throws AppException
	*/

	public SS_S_ANNCBODataSet selectSrchDtls(SS_S_ANNCBODM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_ANNCBODataSet ds = (SS_S_ANNCBODataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	
	/**
	 * 정보공유 실시간 판매국공지 등록
	 * @param SS_I_ANNCSLSDM
	 * @return boolean
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean insertAnncsls(SS_I_ANNCSLSDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_I_ANNCSLSDataSet ds = (SS_I_ANNCSLSDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}  

}
