/***************************************************************************************************
 * 파일명 : PilotDAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.hd.info.dao;

import java.io.StringReader;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.OraclePreparedStatement;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import weblogic.jdbc.wrapper.Statement;

import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;


/**
 * 
 */
public class HD_INFO_3000DAO {
	
	public HD_INFO_3000_LDataSet hd_info_3000_l(HD_INFO_3000_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_INFO_3000_LDataSet ds = (HD_INFO_3000_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	  
	public HD_INFO_3010_SDataSet hd_info_3010_s(HD_INFO_3010_SDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_INFO_3010_SDataSet ds = (HD_INFO_3010_SDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
    
	public void hd_info_3020_a(HD_INFO_3020_ADM dm) throws AppException {

	    DBManager manager = null;
	    try{
		    manager = new DBManager("MISHDL");
			manager.getConnection();
			manager.m_conn.setAutoCommit(false);
			CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setString(3, dm.mode);
			cstmt.setString(4, dm.cmpy_cd);
			cstmt.setString(5, dm.emp_no);
			cstmt.setString(6, dm.info_clsf);
			StringReader sr = new StringReader("1");//임시로 입력...
			cstmt.setCharacterStream(7, sr, dm.cont.toCharArray().length);
			cstmt.setString(8, dm.incmg_pers_ipadd);
			cstmt.setString(9, dm.incmg_pers);
			cstmt.execute();
			cstmt.close();
		    //insert,update
		    if("I".equals(dm.getMode()) || "U".equals(dm.getMode())){
		    	//프로시져에서 cont값을 null로 처리하고 insert하고 난뒤, cont값을 update하여 수정한다.
		        HD_INFO_3020_ADataSet dsClob = (HD_INFO_3020_ADataSet)dm.createDataSetObject();
		       	OraclePreparedStatement opstmt = null;
		       	StringBuffer sql = new StringBuffer();
		
		       	sql.append(" UPDATE  TAHDD_PER_INFO  ");
		        sql.append(" SET     CONT        = ? ");
		       	sql.append(" WHERE   CMPY_CD     = ? ");
		       	sql.append(" AND     EMP_NO      = ? ");
		       	sql.append(" AND     INFO_CLSF   = ? ");
	
				opstmt = (OraclePreparedStatement)manager.m_conn.prepareStatement(sql.toString());
				StringReader sr1 = new StringReader(dm.cont);
				opstmt.setCharacterStream(1, sr1, dm.cont.toCharArray().length);
				opstmt.setString(2, dm.cmpy_cd);
				opstmt.setString(3, dm.emp_no);
				opstmt.setString(4, dm.info_clsf);
				opstmt.executeUpdate();
				opstmt.close();
		    }
		    
       		CallableStatement cstmt1 = null;
           	StringBuffer sql = new StringBuffer();
           	sql.append(" call MISHDL.SP_HD_INFO_3030_U(? ,? ,?)  ");//특수문자 업데이트
           	cstmt1 = manager.m_conn.prepareCall(sql.toString());
           	cstmt1.setString(1, dm.cmpy_cd);
           	cstmt1.setString(2, dm.emp_no);
           	cstmt1.setString(3, dm.info_clsf);
           	cstmt1.executeUpdate();
           	cstmt1.close();
           	
	    } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		manager.disConnection();
	}
	
	
}
