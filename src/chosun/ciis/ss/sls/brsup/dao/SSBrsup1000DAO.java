/***************************************************************************************************
* 파일명 : SSBrsup1000DAO.java
* 기능 : 지국지원-신문지원물품-등록,입고,신청을 위한 DAO
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.share.ds.SS_U_INFOEXGDataSet;

/**
 * 지국지원-신문지원물품-등록,입고,신청을 위한 DAO
 */
public class SSBrsup1000DAO {
    /**
     * 지국지원-신문지원물품-등록-초기화면
     * @param dm SS_L_NWSPITEM_CDLSTDM
     * @return SS_L_NWSPITEM_CDLSTDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEM_CDLSTDataSet initNwspItem(SS_L_NWSPITEM_CDLSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-물품-목록
     * @param dm SS_L_NWSPITEM_CLSFDM
     * @return SS_L_NWSPITEM_CLSFDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEM_CLSFDataSet selectNwspItemClsfList(SS_L_NWSPITEM_CLSFDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEM_CLSFDataSet ds = (SS_L_NWSPITEM_CLSFDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-등록-목록
     * @param dm SS_L_NWSPITEMDM
     * @return SS_L_NWSPITEMDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMDataSet selectNwspItemList(SS_L_NWSPITEMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMDataSet ds = (SS_L_NWSPITEMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-등록-상세
     * @param dm SS_S_NWSPITEMDM
     * @return SS_S_NWSPITEMDataSet
     * @throws AppException
     */
    public SS_S_NWSPITEMDataSet selectNwspItemDetail(SS_S_NWSPITEMDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_S_NWSPITEMDataSet ds = (SS_S_NWSPITEMDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    // 요기부터 수정
    /**
     * 지국Info-지국장정보 사진
     * @param prn String
     * @return byte[]
     * @throws AppException
     */
    public byte[] selectThunbnail(long itemcd) throws AppException {
        byte[] thumbnail = null;
        try{
            DBManager manager = new DBManager("Oracle");
            manager.getConnection();
            Statement stmt = manager.m_conn.createStatement();
            String blobQuery = "SELECT THUMBNAIL FROM TASLM_NWSPITEM WHERE ITEMCD = '" + itemcd + "' and THUMBNAIL is not null";

            	//"SELECT SAJGJSAJIN, SASIZE FROM ST_JGJSAJIN WHERE SAJUMINNO = '"+itemcd+"' FOR UPDATE";
            OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
            
            System.out.println("itemcd1::"+itemcd);
            if (rset.next()) {
                //int size = rset.getInt(2);//사진크기
                thumbnail = new byte[5*1024*1024];
                weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
      	   		//레진용(ep1)
      	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                
                InputStream is = oracle_blob.getBinaryStream();

                // 파일로부터 읽어서 BLOB 에 WRITE 한다.
                int b;
                int count = 0;
                while( (b = is.read()) != -1 ) {
                	thumbnail[count++] = (byte)b;
                }
                is.close();
            }
            stmt.close();
            manager.disConnection();
        }catch(SQLException sqle){
            throw new AppException("[SSBrsup1000DAO.selectThunbnail()]","[SSBrsup1000DAO.selectThunbnail()] 썸네일정보를 얻을 수 없습니다.");
        }catch(IOException ioe){
            throw new AppException("[SSBrsup1000DAO.selectThunbnail()]","[SSBrsup1000DAO.selectThunbnail()] 썸네일정보를 얻을 수 없습니다.");
        }catch(Exception e){
        e.printStackTrace();
        }

        return thumbnail;
    }
    /**
     * 지국Info-지국장정보 사진
     * @param prn String
     * @return byte[]
     * @throws AppException
     */
    public byte[] selectPopup(long itemcd) throws AppException {
        byte[] popup = null;
        try{
        	if(itemcd != 0){
	            DBManager manager = new DBManager("Oracle");
	            manager.getConnection();
	            Statement stmt = manager.m_conn.createStatement();
	            String blobQuery = "SELECT POPUP FROM TASLM_NWSPITEM WHERE ITEMCD = '" + itemcd + "' and POPUP is not null";
	
	            	//"SELECT SAJGJSAJIN, SASIZE FROM ST_JGJSAJIN WHERE SAJUMINNO = '"+itemcd+"' FOR UPDATE";
	            OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
	            
	            System.out.println("itemcd1::"+itemcd);
	            if (rset.next()) {
	                //int size = rset.getInt(2);//사진크기
	            	popup = new byte[5*1024*1024];
	                weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
	                BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	                InputStream is = oracle_blob.getBinaryStream();
	
	                // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	                int b;
	                int count = 0;
	                while( (b = is.read()) != -1 ) {
	                	popup[count++] = (byte)b;
	                }
	                is.close();
	            }
	            stmt.close();
	            manager.disConnection();
        	}
        	else
        	{
        		popup = null;
        	}

        }catch(SQLException sqle){
            throw new AppException("[SSBrsup1000DAO.selectThunbnail()]","[SSBrsup1000DAO.selectThunbnail()] 썸네일정보를 얻을 수 없습니다.");
        }catch(IOException ioe){
            throw new AppException("[SSBrsup1000DAO.selectThunbnail()]","[SSBrsup1000DAO.selectThunbnail()] 썸네일정보를 얻을 수 없습니다.");
        }catch(Exception e){
        e.printStackTrace();
        }

        return popup;
    }

    /**
     * 지국지원-신문지원물품-등록-저장
     * @param dm SS_U_NWSPITEMDM
     * @return SS_U_NWSPITEMDataSet
     * @throws AppException
     */
    public SS_U_NWSPITEMDataSet updateNwspItem(SS_U_NWSPITEMDM dm) throws AppException{
    	SS_U_NWSPITEMDataSet ds = null;
    	/* thumbnail 혹은 popup 파일이 있을 경우 */
    	if ((dm.thumbnail != null && dm.thumbnail.length != 0) || (dm.popup != null && dm.popup.length != 0)) {
	    	byte[] tempContthumbnail;    // 임시 첨부파일 내용
	    	tempContthumbnail = dm.thumbnail;
	    	
	    	byte[] tempContpopup;    // 임시 첨부파일 내용
	    	tempContpopup = dm.popup;
	           	
	    	DBManager manager = null;
	    	try {
	    		manager = new DBManager("Oracle");
	    		manager.getConnection();
	    		manager.m_conn.setAutoCommit(false);
	    		CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
	    		// 파라미터 설정               	
	    		cstmt.registerOutParameter(1, Types.VARCHAR);
	    		cstmt.registerOutParameter(2, Types.VARCHAR);
	    		cstmt.setString(3, dm.incmgpers);
	    		cstmt.setString(4, dm.itemcd);
	    		cstmt.setLong(5, dm.qunt);
	    		cstmt.setLong(6, dm.uprc);
	    		cstmt.setLong(7, dm.divnuprc);
	    		cstmt.setLong(8, dm.insddivnuprc);
	    		cstmt.setString(9, dm.rcpmchrgpersclsf);
	    		cstmt.setString(10, dm.unit);
	    		cstmt.setString(11, dm.clamchrgpersclsf);
	    		cstmt.setString(12, dm.itemclsf);
	    		cstmt.setString(13, dm.sendclsf);
	    		cstmt.setString(14, dm.costclsf);
	    		cstmt.setString(15, dm.aplcfrdt);
	    		cstmt.setString(16, dm.aplctodt);
	    		cstmt.setString(17, dm.aplcclostm);
	    		cstmt.setString(18, dm.remk);
	    		cstmt.setBytes(19, "1010".getBytes());	//이거추가함. 노상현
	    		cstmt.setBytes(20, "1020".getBytes());	//이거추가함. 노상현
	    		// 실행
	    		cstmt.execute();
	    		// 결과
	    		ds = (SS_U_NWSPITEMDataSet)dm.createDataSetObject();
	    		ds.getValues(cstmt);
	    		if(!"".equals(ds.errcode)){
	    			throw new AppException(ds.errcode, ds.errmsg);
	    		}
	    		// 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
	    		//tempSeq = ds.getSeq();
	    		
	    		// BLOB 구하기
	    		Statement stmt = manager.m_conn.createStatement();
	//               	String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
	    		if (dm.thumbnail != null) {
	    			String blobQuery = "SELECT THUMBNAIL FROM TASLM_NWSPITEM WHERE ITEMCD = '" + dm.itemcd + "'";
	               		
	    			OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
	
	    			if (rset.next()) {
	    				weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
	    				BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	    				OutputStream os = oracle_blob.getBinaryOutputStream();
	    				// 파일로부터 읽어서 BLOB 에 WRITE 한다.
	
	    				for(int i=0; i<tempContthumbnail.length; i++){
	    					os.write(tempContthumbnail[i]);
	    				}
	    				os.close();
	    			}
	    		}
	               	
	    		if (dm.popup != null) {
	    			String blobQuery = "SELECT POPUP FROM TASLM_NWSPITEM WHERE ITEMCD = '" + dm.itemcd + "'";
	
	    			OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
	    			
	    			if (rset.next()) {
	    				weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
	    				BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	    				OutputStream os = oracle_blob.getBinaryOutputStream();
	    				// 파일로부터 읽어서 BLOB 에 WRITE 한다.
	    				
	    				for(int i=0; i<tempContpopup.length; i++){
	    					os.write(tempContpopup[i]);
	    				}
	    				os.close();
	    			}
	    		}
	
	    		stmt.close();
	    		manager.disConnection();
	    	} catch (AppException e){
	    		manager.disConnection();
	    		throw e;
	    	} catch (Exception e) {
	    		try{
	    			manager.m_conn.rollback();
	    		}catch(SQLException se){
	    			throw new SysException(se);
	    		}
	    		manager.disConnection();
	    		throw new SysException(e);
	    	}
    	}
    	else {
	    	DBManager manager = new DBManager("Oracle");
	    	ds = (SS_U_NWSPITEMDataSet)manager.executeCall(dm);
	    	if(!"".equals(ds.errcode)){
	           throw new AppException(ds.errcode, ds.errmsg);
	        }
    	}
    	return ds;
    }


    /**
     * 지국지원-신문지원물품-입고-초기화면
     * @param dm SS_L_NWSPITEM_CDLSTDM
     * @return SS_L_NWSPITEM_CDLSTDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEM_CDLSTDataSet initNwspItemEwh(SS_L_NWSPITEM_CDLSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-입고-목록
     * @param dm SS_L_NWSPITEMEWHDM
     * @return SS_L_NWSPITEMEWHDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMEWHDataSet selectNwspItemEwhList(SS_L_NWSPITEMEWHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMEWHDataSet ds = (SS_L_NWSPITEMEWHDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-입고-상세
     * @param dm SS_S_NWSPITEMEWHDM
     * @return SS_S_NWSPITEMEWHDataSet
     * @throws AppException
     */
    public SS_S_NWSPITEMEWHDataSet selectNwspItemEwhDetail(SS_S_NWSPITEMEWHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_NWSPITEMEWHDataSet ds = (SS_S_NWSPITEMEWHDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-입고-등록
     * @param dm SS_A_NWSPITEMEWHDM
     * @return SS_A_NWSPITEMEWHDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMEWHDataSet insertNwspItemEwh(SS_A_NWSPITEMEWHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMEWHDataSet ds = (SS_A_NWSPITEMEWHDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-입고-수정
     * @param dm SS_A_NWSPITEMEWHDM
     * @return SS_A_NWSPITEMEWHDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMEWHDataSet updateNwspItemEwh(SS_A_NWSPITEMEWHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMEWHDataSet ds = (SS_A_NWSPITEMEWHDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-입고-삭제
     * @param dm SS_A_NWSPITEMEWHDM
     * @return SS_A_NWSPITEMEWHDataSet
     * @throws AppException
     */
    public SS_A_NWSPITEMEWHDataSet deleteNwspItemEwh(SS_A_NWSPITEMEWHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_NWSPITEMEWHDataSet ds = (SS_A_NWSPITEMEWHDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-신청-초기화면
     * @param dm SS_L_NWSPITEM_CDLSTDM
     * @return SS_L_NWSPITEM_CDLSTDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEM_CDLSTDataSet initNwspItemAplc(SS_L_NWSPITEM_CDLSTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-신청-목록
     * @param dm SS_L_NWSPITEMAPLCDM
     * @return SS_L_NWSPITEMAPLCDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMAPLCDataSet selectNwspItemAplcList(SS_L_NWSPITEMAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMAPLCDataSet ds = (SS_L_NWSPITEMAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-신청-저장
     * @param dm SS_A_NWSPITEMAPLCDM
     * @return SS_A_NWSPITEMAPLCDataSet
     * @throws AppException
     */
    public SS_U_NWSPITEMAPLCDataSet updateNwspItemAplc(SS_U_NWSPITEMAPLCDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_NWSPITEMAPLCDataSet ds = (SS_U_NWSPITEMAPLCDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-신문지원물품-신청-인쇄
     * @param dm SS_L_NWSPITEMSEND_PRINTDM
     * @return SS_L_NWSPITEMSEND_PRINTDataSet
     * @throws AppException
     */
    public SS_L_NWSPITEMSEND_PRINTDataSet printNwspItemList(SS_L_NWSPITEMSEND_PRINTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWSPITEMSEND_PRINTDataSet ds = (SS_L_NWSPITEMSEND_PRINTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국지원-신문지원물품-신청-출고등록 
     * @param dm SS_I_NWSPITEMSEND_BNSOUTDM
     * @return SS_I_NWSPITEMSEND_BNSOUTDataSet
     * @throws AppException
     */
    public SS_I_NWSPITEMSEND_BNSOUTDataSet outNwspItemList(SS_I_NWSPITEMSEND_BNSOUTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_NWSPITEMSEND_BNSOUTDataSet ds = (SS_I_NWSPITEMSEND_BNSOUTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
