/***************************************************************************************************
 * 파일명 : AdCommonDAO.java
 * 기능 : SMS Service
 * 작성일자 : 2010.08.27
 * 작성자 : KBS
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import somo.framework.util.Util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.text.*;

import chosun.ciis.ad.common.dm.AD_CO_8000_ADM;
import chosun.ciis.ad.common.ds.AD_CO_8000_ADataSet;

/**
 * 
 */
public class AdCommon8000DAO {
	public AD_CO_8000_ADataSet ad_co_8000_a(AD_CO_8000_ADM dm) throws AppException {
        DBManager manager = new DBManager("Bsns");
        AD_CO_8000_ADataSet ds = new AD_CO_8000_ADataSet();
        
        PreparedStatement pstmt = null;
		ResultSet rs 			= null;
		ResultSetMetaData rsmd 	= null;
		String strSql 			= null;
		
		String RcvTelNo			= null;
		String[] astrVal		= null;
		String[] astrRcvTelNo	= null;
		
		ArrayList arrList		= null;
		
		boolean bSuccess		= false;
		int nCnt				= 0;
		int i					= 0;
		int nLen				= -1;
		
		ds.errcode 	= "";
		ds.errmsg 	= "";
		
		try{
			manager.getConnection();
			strSql = "INSERT SMS(SM_INDATE, SM_RVMBNO, SM_SDMBNO, SM_MSG, SM_CODE2) VALUES ";
			strSql = strSql + "(getdate(), ?, ?, ?, ?)";
			
			pstmt = manager.m_conn.prepareStatement(strSql);
			
			// Parse RcvTelNo
			RcvTelNo = dm.RcvTelNo;
			astrRcvTelNo = RcvTelNo.split("#");
			nLen = astrRcvTelNo.length;
			for( i=0; i<nLen; i++)
			{
				if(astrRcvTelNo[i] != "#" )
				{
//					pstmt.setString(1, dm.InDate);
					pstmt.setString(1, dm.SndTelNo);
					pstmt.setString(2, astrRcvTelNo[i]);
System.out.println(astrRcvTelNo[i]);
					pstmt.setString(3, dm.SndMsg);
					pstmt.setString(4, dm.SysKey);
					
					nCnt = pstmt.executeUpdate();
				}
			}
		    // Parse RcvTelNo end.
			
			pstmt.close();
		}
		catch (SQLException se){
			se.printStackTrace();
			throw new SysException(se);
		}
		finally {
			try {
				if (rs != null)		rs.close();
				if (pstmt != null)	pstmt.close();
			}
			catch (SQLException se) {
			}
			manager.disConnection();
		}
		
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
