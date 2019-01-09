
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

package chosun.ciis.hd.edu.dao;

import java.io.StringReader;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import weblogic.jdbc.wrapper.Statement;

import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;
 
/**
 * 
 */
public class HD_EDU_1000DAO {
	
	public HD_EDU_1000_ADataSet getHd_edu_1000(HD_EDU_1000_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1000_ADataSet ds = (HD_EDU_1000_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_EDU_1001_LDataSet getHd_edu_1001(HD_EDU_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1001_LDataSet ds = (HD_EDU_1001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_EDU_1100_LDataSet getHd_edu_1100(HD_EDU_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1100_LDataSet ds = (HD_EDU_1100_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_EDU_2003_MDataSet getHd_edu_2003(HD_EDU_2003_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2003_MDataSet ds = (HD_EDU_2003_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_EDU_1101_LDataSet getHd_edu_1101(HD_EDU_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1101_LDataSet ds = (HD_EDU_1101_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		

	public HD_EDU_1102_LDataSet getHd_edu_1102(HD_EDU_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1102_LDataSet ds = (HD_EDU_1102_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_EDU_1103_ADataSet getHd_edu_1103(HD_EDU_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1103_ADataSet ds = (HD_EDU_1103_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		
	
	public void hd_edu_1110_a(HD_EDU_1110_ADM dm) throws AppException {
		DBManager manager = null;
       	try {
       		manager = new DBManager("MISHDL");
    		manager.getConnection();
			manager.m_conn.setAutoCommit(false);
			CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
	       	cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setString(3, dm.cmpy_cd);
			cstmt.setString(4, dm.emp_no);
			cstmt.setString(5, dm.occr_dt);
			cstmt.setString(6, dm.occr_seq);
			StringReader sr = new StringReader("1");//임시로 입력...
			cstmt.setCharacterStream(7, sr, dm.remk.toCharArray().length);
			cstmt.setString(8, dm.incmg_pers_ipadd);
			cstmt.setString(9, dm.incmg_pers);
			cstmt.setString(10, dm.chg_pers);
			cstmt.execute();
			cstmt.close();
			
			if(dm.remk.toCharArray().length>2000){
	           	OraclePreparedStatement opstmt = null;
	           	StringBuffer sql = new StringBuffer();
	           	sql.append(" UPDATE MISHDL.TAHDD_EDU_TRAIN_ACCT  ");
	           	sql.append(" SET CONT = ?  ");
	           	sql.append(" WHERE  CMPY_CD  = ? ");
	           	sql.append(" AND    EMP_NO   = ? ");
	           	sql.append(" AND    OCCR_DT  = ? ");
	           	sql.append(" AND    OCCR_SEQ = ? ");
	           	sql.append(" AND    REPT_CLSF = '1' ");
				opstmt = (OraclePreparedStatement)manager.m_conn.prepareStatement(sql.toString());
				StringReader sr1 = new StringReader(dm.remk);
				opstmt.setCharacterStream(1, sr1, dm.remk.toCharArray().length);
				opstmt.setString(2, dm.cmpy_cd);
				opstmt.setString(3, dm.emp_no);
				opstmt.setString(4, dm.occr_dt);
				opstmt.setString(5, dm.occr_seq);
				opstmt.executeUpdate();
				opstmt.close();
			}else{
	           	Statement opstmt = null;
	           	StringBuffer sql = new StringBuffer();
	           	sql.append(" UPDATE MISHDL.TAHDD_EDU_TRAIN_ACCT  ");
	           	sql.append(" SET CONT = '").append(dm.remk).append("'  \n");
	           	sql.append(" WHERE  CMPY_CD  = '").append(dm.cmpy_cd).append("'  \n");
	           	sql.append(" AND    EMP_NO   = '").append(dm.emp_no).append("'  \n");
	           	sql.append(" AND    OCCR_DT  = '").append(dm.occr_dt).append("'  \n");
	           	sql.append(" AND    OCCR_SEQ = '").append(dm.occr_seq).append("'  \n");
	           	sql.append(" AND    REPT_CLSF = '1' ");
				opstmt = (Statement) manager.m_conn.createStatement();
				opstmt.executeUpdate(sql.toString());
				opstmt.close();
			}
			
       		CallableStatement cstmt1 = null;
           	StringBuffer sql = new StringBuffer();
           	sql.append(" call MISHDL.SP_HD_EDU_1213_U(? ,? ,? ,? ,?)  ");//특수문자 업데이트
           	cstmt1 = manager.m_conn.prepareCall(sql.toString());
           	cstmt1.setString(1, dm.cmpy_cd);
           	cstmt1.setString(2, dm.emp_no);
           	cstmt1.setString(3, dm.occr_dt);
           	cstmt1.setString(4, dm.occr_seq);
           	cstmt1.setString(5, "1");
           	cstmt1.executeUpdate();
           	cstmt1.close();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		manager.disConnection();
	}
	
	public HD_EDU_1111_DDataSet hd_edu_1111_d(HD_EDU_1111_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1111_DDataSet ds = (HD_EDU_1111_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_EDU_1112_LDataSet hd_edu_1112_l(HD_EDU_1112_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1112_LDataSet ds = (HD_EDU_1112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_EDU_1200_LDataSet getHd_edu_1200(HD_EDU_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1200_LDataSet ds = (HD_EDU_1200_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_EDU_1201_LDataSet getHd_edu_1201(HD_EDU_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1201_LDataSet ds = (HD_EDU_1201_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	
	public HD_EDU_1202_ADataSet getHd_edu_1202(HD_EDU_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1202_ADataSet ds = (HD_EDU_1202_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		

	public HD_EDU_1203_LDataSet getHd_edu_1203(HD_EDU_1203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1203_LDataSet ds = (HD_EDU_1203_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public void hd_edu_1210_a(HD_EDU_1210_ADM dm) throws AppException {
		DBManager manager = null;
       	try {
       		manager = new DBManager("MISHDL");
    		manager.getConnection();
			manager.m_conn.setAutoCommit(false);
			CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
	       	cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setString(3, dm.cmpy_cd);
			cstmt.setString(4, dm.emp_no);
			cstmt.setString(5, dm.occr_dt);
			cstmt.setString(6, dm.occr_seq);
			StringReader sr = new StringReader("1");//임시로 입력...
			cstmt.setCharacterStream(7, sr, dm.remk.toCharArray().length);
			cstmt.setString(8, dm.incmg_pers_ipadd);
			cstmt.setString(9, dm.incmg_pers);
			cstmt.setString(10, dm.chg_pers);
			cstmt.execute();
			cstmt.close();
			
			if(dm.remk.toCharArray().length>2000){
	           	OraclePreparedStatement opstmt = null;
	           	StringBuffer sql = new StringBuffer();
	           	sql.append(" UPDATE MISHDL.TAHDD_EDU_TRAIN_ACCT  ");
	           	sql.append(" SET CONT = ?  ");
	           	sql.append(" WHERE  CMPY_CD  = ? ");
	           	sql.append(" AND    EMP_NO   = ? ");
	           	sql.append(" AND    OCCR_DT  = ? ");
	           	sql.append(" AND    OCCR_SEQ = ? ");
	           	sql.append(" AND    REPT_CLSF = '2' ");
				opstmt = (OraclePreparedStatement)manager.m_conn.prepareStatement(sql.toString());
				StringReader sr1 = new StringReader(dm.remk);
				opstmt.setCharacterStream(1, sr1, dm.remk.toCharArray().length);
				opstmt.setString(2, dm.cmpy_cd);
				opstmt.setString(3, dm.emp_no);
				opstmt.setString(4, dm.occr_dt);
				opstmt.setString(5, dm.occr_seq);
				opstmt.executeUpdate();
				opstmt.close();
			}else{
	           	Statement opstmt = null;
	           	StringBuffer sql = new StringBuffer();
	           	sql.append(" UPDATE MISHDL.TAHDD_EDU_TRAIN_ACCT  ");
	           	sql.append(" SET CONT = '").append(dm.remk).append("'  \n");
	           	sql.append(" WHERE  CMPY_CD  = '").append(dm.cmpy_cd).append("'  \n");
	           	sql.append(" AND    EMP_NO   = '").append(dm.emp_no).append("'  \n");
	           	sql.append(" AND    OCCR_DT  = '").append(dm.occr_dt).append("'  \n");
	           	sql.append(" AND    OCCR_SEQ = '").append(dm.occr_seq).append("'  \n");
	           	sql.append(" AND    REPT_CLSF = '2' ");
				opstmt = (Statement) manager.m_conn.createStatement();
				opstmt.executeUpdate(sql.toString());
				opstmt.close();
			}
			
       		CallableStatement cstmt1 = null;
           	StringBuffer sql = new StringBuffer();
           	sql.append(" call MISHDL.SP_HD_EDU_1213_U(? ,? ,? ,? ,?)  ");//특수문자 업데이트
           	cstmt1 = manager.m_conn.prepareCall(sql.toString());
           	cstmt1.setString(1, dm.cmpy_cd);
           	cstmt1.setString(2, dm.emp_no);
           	cstmt1.setString(3, dm.occr_dt);
           	cstmt1.setString(4, dm.occr_seq);
           	cstmt1.setString(5, "2");
           	cstmt1.executeUpdate();
           	cstmt1.close();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		manager.disConnection();
		
	}
	
	public HD_EDU_1211_DDataSet hd_edu_1211_d(HD_EDU_1211_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1211_DDataSet ds = (HD_EDU_1211_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_EDU_1212_LDataSet hd_edu_1212_l(HD_EDU_1212_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1212_LDataSet ds = (HD_EDU_1212_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_EDU_1500_LDataSet getHd_edu_1500(HD_EDU_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1500_LDataSet ds = (HD_EDU_1500_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_EDU_1501_LDataSet getHd_edu_1501(HD_EDU_1501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1501_LDataSet ds = (HD_EDU_1501_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	
	public HD_EDU_1502_ADataSet getHd_edu_1502(HD_EDU_1502_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1502_ADataSet ds = (HD_EDU_1502_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		

	public HD_EDU_1503_LDataSet getHd_edu_1503(HD_EDU_1503_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1503_LDataSet ds = (HD_EDU_1503_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_EDU_1600_LDataSet getHd_edu_1600(HD_EDU_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1600_LDataSet ds = (HD_EDU_1600_LDataSet)manager.executeCall(dm);
		System.out.println("ds.getErrcode() = "+ds.getErrcode());
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_EDU_1601_LDataSet getHd_edu_1601(HD_EDU_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1601_LDataSet ds = (HD_EDU_1601_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_EDU_1700_ADataSet getHd_edu_1700(HD_EDU_1700_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1700_ADataSet ds = (HD_EDU_1700_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_EDU_1701_LDataSet getHd_edu_1701(HD_EDU_1701_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1701_LDataSet ds = (HD_EDU_1701_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_EDU_1801_LDataSet getHd_edu_1801(HD_EDU_1801_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1801_LDataSet ds = (HD_EDU_1801_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	
	public HD_EDU_1803_ADataSet getHd_edu_1803(HD_EDU_1803_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1803_ADataSet ds = (HD_EDU_1803_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_EDU_1300_LDataSet getHd_edu_1300(HD_EDU_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1300_LDataSet ds = (HD_EDU_1300_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	


	public HD_EDU_1301_LDataSet getHd_edu_1301(HD_EDU_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1301_LDataSet ds = (HD_EDU_1301_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	


	public HD_EDU_1302_LDataSet getHd_edu_1302(HD_EDU_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1302_LDataSet ds = (HD_EDU_1302_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_EDU_1303_LDataSet getHd_edu_1303(HD_EDU_1303_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1303_LDataSet ds = (HD_EDU_1303_LDataSet)manager.executeCall(dm);
		System.out.println("ds.getErrcode() = "+ds.getErrcode());
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	


	public HD_EDU_1304_ADataSet getHd_edu_1304(HD_EDU_1304_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1304_ADataSet ds = (HD_EDU_1304_ADataSet)manager.executeCall(dm);
		System.out.println("ds.getErrcode() = "+ds.getErrcode());
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		


	public HD_EDU_1401_LDataSet getHd_edu_1401(HD_EDU_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1401_LDataSet ds = (HD_EDU_1401_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	


	public HD_EDU_1402_LDataSet getHd_edu_1402(HD_EDU_1402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1402_LDataSet ds = (HD_EDU_1402_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_EDU_1403_LDataSet getHd_edu_1403(HD_EDU_1403_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1403_LDataSet ds = (HD_EDU_1403_LDataSet)manager.executeCall(dm);
		System.out.println("ds.getErrcode() = "+ds.getErrcode());
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	


	public HD_EDU_1404_ADataSet getHd_edu_1404(HD_EDU_1404_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1404_ADataSet ds = (HD_EDU_1404_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		
	
	
}

