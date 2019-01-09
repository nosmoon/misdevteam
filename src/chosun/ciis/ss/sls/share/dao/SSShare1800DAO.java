/***************************************************************************************************
* 파일명 : SSShare1800DAO.java
* 기능 : 정보공유 일일업무일지 처리를 위한 DAO
* 작성일자 : 2003-12-20
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
* 정보공유-일일업무일지 위한 DAO
*/
public class SSShare1800DAO {

	/**
	* 정보공유 일일업무일지 리스트 조회
	* @param SS_L_JOBREC_INITDM 객체
	* @return SS_L_JOBREC_INITDataSet 객체
	*/

	public SS_L_JOBREC_INITDataSet selectInitList(SS_L_JOBREC_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_JOBREC_INITDataSet ds = (SS_L_JOBREC_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* 정보공유 일일업무일지 검색리스트 조회
	* @param SS_L_JOBREC_SRCHDM 객체
	* @return SS_L_JOBREC_SRCHDataSet 객체
	*/

	public SS_L_JOBREC_SRCHDataSet selectSrchList(SS_L_JOBREC_SRCHDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_JOBREC_SRCHDataSet ds = (SS_L_JOBREC_SRCHDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	* 정보공유 일일업무일지 등록
	* @param SS_I_JOBRECDM
	* @return boolean
	*/
	public boolean insertJobrec(SS_I_JOBRECDM dm) throws AppException{

     boolean ret = false;
        // 첨부파일이 존재할 경우 첨부파일의 내용을 임시로 저장한다.
        if (dm.filecont != null && dm.filecont.length != 0) {
            String tempMakedt;      // 임시 작성일자
            String tempMakepersid;  // 임시 작성지ID
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
                cstmt.setString(8, dm.curddplan);
                cstmt.setString(9, dm.prvddproc);
                cstmt.setString(10, dm.etc);
                cstmt.setString(11, dm.filenm);
                cstmt.setString(12, dm.filesize);
                cstmt.setBytes(13, "1010".getBytes());  // 임시 바이트 배열
                cstmt.setString(14, dm.incmgpers);
                cstmt.setTimestamp(15, dm.incmgdt);

                // 실행
                cstmt.execute();
                // 결과
                SS_I_JOBRECDataSet ds = (SS_I_JOBRECDataSet)dm.createDataSetObject();
                ds.getValues(cstmt);

                if(!"".equals(ds.errcode)){
                    throw new AppException(ds.errcode, ds.errmsg);
                }
                // 첨부파일 내용을 제외한 데이터를 등록하고 작성일자,작성자ID 값을 얻는다.
                tempMakedt = dm.makedt;
                tempMakepersid = dm.makepersid;
                // BLOB 구하기
                Statement stmt = manager.m_conn.createStatement();
                String blobQuery = "SELECT FILECONT FROM TASLM_JOBREC WHERE MAKEDT = '"+tempMakedt+"' AND MAKEPERSID ='"+tempMakepersid+"' FOR UPDATE";
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
            SS_I_JOBRECDataSet ds = (SS_I_JOBRECDataSet) manager.executeCall(dm);
            if(!"".equals(ds.errcode)){
                throw new AppException(ds.errcode, ds.errmsg);
            }else{
                ret = true;
           }
        }
        return ret;

	}
	/**
	* 정보공유 일일업무일지 수정
	* @param SS_U_JOBRECDM
	* @return boolean
	* @author CRM 출판국팀
	* @since 2003.10.30    ver : 1.0
	*/
	public boolean updateJobrec(SS_U_JOBRECDM dm) throws AppException{
        boolean ret = false;
           // 첨부파일이 존재할 경우 첨부파일의 내용을 임시로 저장한다.
           if (dm.filecont != null && dm.filecont.length != 0) {
               String tempMakedt;      // 임시 작성일자
               String tempMakepersid;  // 임시 작성지ID
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
                   cstmt.setString(5, dm.curddplan);
                   cstmt.setString(6, dm.prvddproc);
                   cstmt.setString(7, dm.etc);
                   cstmt.setString(8, dm.filenm);
                   cstmt.setString(9, dm.filesize);
                   cstmt.setBytes(10, "1010".getBytes());  // 임시 바이트 배열
                   cstmt.setString(11, dm.chgpers);
                   cstmt.setTimestamp(12, dm.chgdt);

                   // 실행
                   cstmt.execute();
                   // 결과
                   SS_U_JOBRECDataSet ds = (SS_U_JOBRECDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // 첨부파일 내용을 제외한 데이터를 등록하고 작성일자,작성자ID 값을 얻는다.
                   tempMakedt = dm.makedt;
                   tempMakepersid = dm.makepersid;
                   // BLOB 구하기
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_JOBREC WHERE MAKEDT = '"+tempMakedt+"' AND MAKEPERSID ='"+tempMakepersid+"' FOR UPDATE";
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
               SS_U_JOBRECDataSet ds = (SS_U_JOBRECDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
	}
	/**
	* 정보공유 일일업무일지 삭제
	* @param SS_D_JOBRECDM
	* @return boolean
	* @author CRM 출판국팀
	* @since 2003.10.30    ver : 1.0
	*/

	public boolean deleteJobrec(SS_D_JOBRECDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_JOBRECDataSet ds = (SS_D_JOBRECDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

	/**
	* 정보공유 일일업무일지 상세정보 조회
	* @param SS_S_JOBRECDM
	* @return 정보공유 일일업무일지 상세정보 DataSet
	* @author CRM 출판국팀
	* @since 2003.10.30    ver : 1.0
	*/

	public SS_S_JOBRECDataSet selectJobrecDetail(SS_S_JOBRECDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_JOBRECDataSet ds = (SS_S_JOBRECDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* 정보공유 일일업무일지 다운로드
	* @param SS_S_JOBREC_DWLOADDM
	* @return 정보공유 일일업무일지 다운로드 DataSet
	* @author CRM 출판국팀
	* @since 2003.10.30    ver : 1.0
	*/

	public SS_S_JOBREC_DWLOADDataSet dwloadJobrec(SS_S_JOBREC_DWLOADDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_JOBREC_DWLOADDataSet ds = (SS_S_JOBREC_DWLOADDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

}
