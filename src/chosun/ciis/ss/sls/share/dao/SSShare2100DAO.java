/***************************************************************************************************
 * 파일명 : SSShare2100DAO.java
 * 기능 : 정보공유 타사동향보고 처리를 위한 DAO
 * 작성일자 : 2003-12-29
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.share.dao;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-타사동향보고 위한 DAO
 */
public class SSShare2100DAO {

	/**
	 * 정보공유 타사동향보고 리스트 조회
	 * @param SS_L_OTHRPT_INITDM 객체
	 * @return SS_L_OTHRPT_INITDataSet 객체
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_L_OTHRPT_INITDataSet selectInitList(SS_L_OTHRPT_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_OTHRPT_INITDataSet ds = (SS_L_OTHRPT_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	 * 정보공유 타사동향보고 검색리스트 조회
	 * @param SS_L_OTHRPT_SRCHDM 객체
	 * @return SS_L_OTHRPT_SRCHDataSet 객체
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_L_OTHRPT_SRCHDataSet selectSrchList(SS_L_OTHRPT_SRCHDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_OTHRPT_SRCHDataSet ds = (SS_L_OTHRPT_SRCHDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * 정보공유 타사동향보고 등록
	 * @param SS_I_OTHRPTDM
	 * @return boolean
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean insertOthrpt(SS_I_OTHRPTDM dm) throws AppException{
        boolean ret = false;
           // 첨부파일이 존재할 경우 첨부파일의 내용을 임시로 저장한다.
           if (dm.filecont != null && dm.filecont.length != 0) {
               String tempSeq;          // 임시 순번
               byte[] tempCont;    // 임시 첨부파일 내용
               tempCont = dm.filecont;
               DBManager manager = null;
               try {
                   manager = new DBManager("Oracle");
                   manager.getConnection();
                   manager.m_conn.setAutoCommit(false);
                   CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
                   // 파라미터 설정
                   cstmt.registerOutParameter(1, Types.VARCHAR);
                   cstmt.registerOutParameter(2, Types.VARCHAR);
                   cstmt.setString(3, dm.makedt);
                   cstmt.setString(4, dm.makepersid);
                   cstmt.setString(5, dm.makepersnm);
                   cstmt.setString(6, dm.deptcd);
                   cstmt.setString(7, dm.deptnm);
                   cstmt.setString(8, dm.jungpoly);
                   cstmt.setString(9, dm.jungmovmt);
                   cstmt.setString(10, dm.jungetc);
                   cstmt.setString(11, dm.dongpoly);
                   cstmt.setString(12, dm.dongmovmt);
                   cstmt.setString(13, dm.dongetc);
                   cstmt.setString(14, dm.etcpoly);
                   cstmt.setString(15, dm.etcmovmt);
                   cstmt.setString(16, dm.etcetc);
                   cstmt.setString(17, dm.filenm);
                   cstmt.setString(18, dm.filesize);
                   cstmt.setBytes(19, "1010".getBytes());  // 임시 바이트 배열
                   cstmt.setString(20, dm.incmgpers);
                   cstmt.setTimestamp(21, dm.incmgdt);
                   cstmt.registerOutParameter(22, Types.VARCHAR);

                   // 실행
                   cstmt.execute();
                   // 결과
                   SS_I_OTHRPTDataSet ds = (SS_I_OTHRPTDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // 첨부파일 내용을 제외한 데이터를 등록하고 순번 값을 얻는다.
                   tempSeq = ds.getSeq();

                   // BLOB 구하기
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_OTHRPT WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
                   OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

                   if (rset.next()) {
                       weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                       BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	          	   		//레진용(ep1)
	          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                       OutputStream os = oracle_blob.getBinaryOutputStream();
                       // 파일로부터 읽어서 BLOB 에 WRITE 한다.
                       int b;

                       for(int i=0; i<tempCont.length; i++){
                           os.write(tempCont[i]);
                       }
                       os.close();
                   }

                   stmt.close();
                   manager.disConnection();
               } catch (AppException e){
                   manager.disConnection();
                   throw e;
               } catch (Exception e) {
   e.printStackTrace();
                try{
                    manager.m_conn.rollback();
                }catch(SQLException se){
                    throw new SysException(se);
                }
                manager.disConnection();
                throw new SysException(e);
            }
        }else{
            DBManager manager = new DBManager("Oracle");
               SS_I_OTHRPTDataSet ds = (SS_I_OTHRPTDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
     }
	/**
	 * 정보공유 타사동향보고 수정
	 * @param SS_U_OTHRPTDM
	 * @return boolean
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean updateOthrpt(SS_U_OTHRPTDM dm) throws AppException{
        boolean ret = false;
           // 첨부파일이 존재할 경우 첨부파일의 내용을 임시로 저장한다.
           if (dm.filecont != null && dm.filecont.length != 0) {
               String tempSeq;          // 임시 순번
               byte[] tempCont;    // 임시 첨부파일 내용
               tempCont = dm.filecont;
               DBManager manager = null;
               try {
                   manager = new DBManager("Oracle");
                   manager.getConnection();
                   manager.m_conn.setAutoCommit(false);
                   CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
                   // 파라미터 설정
                   cstmt.registerOutParameter(1, Types.VARCHAR);
                   cstmt.registerOutParameter(2, Types.VARCHAR);
                   cstmt.setLong(3, dm.seq);
                   cstmt.setString(4, dm.makedt);
                   cstmt.setString(5, dm.jungpoly);
                   cstmt.setString(6, dm.jungmovmt);
                   cstmt.setString(7, dm.jungetc);
                   cstmt.setString(8, dm.dongpoly);
                   cstmt.setString(9, dm.dongmovmt);
                   cstmt.setString(10, dm.dongetc);
                   cstmt.setString(11, dm.etcpoly);
                   cstmt.setString(12, dm.etcmovmt);
                   cstmt.setString(13, dm.etcetc);
                   cstmt.setString(14, dm.filenm);
                   cstmt.setString(15, dm.filesize);
                   cstmt.setBytes(16, "1010".getBytes());  // 임시 바이트 배열
                   cstmt.setString(17, dm.chgpers);
                   cstmt.setTimestamp(18, dm.chgdt);

                   // 실행
                   cstmt.execute();
                   // 결과
                   SS_U_OTHRPTDataSet ds = (SS_U_OTHRPTDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // 첨부파일 내용을 제외한 데이터를 등록하고 순번을 얻는다.
                   tempSeq = ""+dm.seq;
                   // BLOB 구하기
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_OTHRPT WHERE MAKEDT = '"+tempSeq+"' FOR UPDATE";
                   OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

                   if (rset.next()) {
                       weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                       BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	          	   		//레진용(ep1)
	          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                       OutputStream os = oracle_blob.getBinaryOutputStream();
                       // 파일로부터 읽어서 BLOB 에 WRITE 한다.
                       int b;

                       for(int i=0; i<tempCont.length; i++){
                           os.write(tempCont[i]);
                       }
                       os.close();
                   }

                   stmt.close();
                   manager.disConnection();
               } catch (AppException e){
                   manager.disConnection();
                   throw e;
               } catch (Exception e) {
e.printStackTrace();
                try{
                    manager.m_conn.rollback();
                }catch(SQLException se){
                    throw new SysException(se);
                }
                manager.disConnection();
                throw new SysException(e);
            }
        }else{
                DBManager manager = new DBManager("Oracle");
               SS_U_OTHRPTDataSet ds = (SS_U_OTHRPTDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
	}
	/**
	 * 정보공유 타사동향보고 삭제
	 * @param SS_D_OTHRPTDM
	 * @return boolean
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean deleteOthrpt(SS_D_OTHRPTDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_OTHRPTDataSet ds = (SS_D_OTHRPTDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

	/**
	 * 정보공유 타사동향보고 상세정보 조회
	 * @param SS_S_OTHRPTDM
	 * @return 정보공유 타사동향보고 상세정보 DataSet
	 * @author CRM 출판국팀
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_S_OTHRPTDataSet selectOthrptDetail(SS_S_OTHRPTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_OTHRPTDataSet ds = (SS_S_OTHRPTDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* 정보공유 타사동향보고 다운로드
	* @param SS_S_OTHRPT_DWLOADDM
	* @return 정보공유 타사동향보고 다운로드 DataSet
	* @author CRM 출판국팀
	* @since 2003.10.30    ver : 1.0
	*/

	public SS_S_OTHRPT_DWLOADDataSet dwloadOthrpt(SS_S_OTHRPT_DWLOADDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_OTHRPT_DWLOADDataSet ds = (SS_S_OTHRPT_DWLOADDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
}
