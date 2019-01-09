/***************************************************************************************************
* 파일명 : 
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

package chosun.ciis.hd.edu.wb;

import java.io.CharArrayReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.hd.edu.dao.HD_EDU_1000DAO;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.saly.dm.HD_SALY_1702_ADM;
import chosun.ciis.hd.saly.ds.HD_SALY_1702_ADataSet;
import chosun.ciis.hd.trip.dm.HD_TRIP_1011_ADM;
import chosun.ciis.hd.trip.ds.HD_TRIP_1011_ADataSet;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
 
public class HD_EDU_1000WB extends BaseWB {
 
    /**
     * 멀티레코드처리 row 구분자
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    //public final String COL_SEPARATOR = "#";
  
    /**
     * 발령관련된 코드
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */

	public void hd_edu_1000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1000_ADataSet ds = null;
		HD_EDU_1000_ADM dm = new HD_EDU_1000_ADM();
		
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.chrg_job = Util.checkString(req.getParameter("chrg_job"));
		dm.edu_nm = Util.checkString(req.getParameter("edu_nm"));
		dm.edu_instt = Util.checkString(req.getParameter("edu_instt"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.edu_dds = Util.checkString(req.getParameter("edu_dds"));
		dm.edu_tm = Util.checkString(req.getParameter("edu_tm"));
		dm.edu_cost = Util.checkString(req.getParameter("edu_cost"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.misno = Util.checkString(req.getParameter("misno"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.rfnd_yn = Util.checkString(req.getParameter("rfnd_yn"));
        dm.rfnd_cost = Util.checkString(req.getParameter("rfnd_cost")); 
        dm.print();
        
		ds = (HD_EDU_1000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1001_LDataSet ds = null;
		HD_EDU_1001_LDM dm = new HD_EDU_1001_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
      
        dm.print();
        
		ds = (HD_EDU_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	  public void hd_edu_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    	DBManager manager = new DBManager("MISHDL");
	    	HD_EDU_1010_LDataSet ds = null;
			HD_EDU_1010_LDM dm = new HD_EDU_1010_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));
			dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
			dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
			System.out.println("11111111111111");
			dm.print();
			System.out.println("22222222222222");
			ds = (HD_EDU_1010_LDataSet)manager.executeCall(dm);
			System.out.println("333333333333");
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error. 1005");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}
	  public void hd_edu_1011(HttpServletRequest req, HttpServletResponse res) throws AppException {
			DBManager manager = new DBManager("MISHDL");
			HD_EDU_1011_ADataSet ds = null;
			HD_EDU_1011_ADM dm = new HD_EDU_1011_ADM();

			System.out.println("dddd");

			String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			dm.cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));		
	        // 출장자
			dm.mode = ((String)hash.get("m")).toUpperCase(); 
			//dm.mode = (String)hash.get("send");
			//dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));		
			dm.proc_stat = (String)hash.get("proc_stat");
			dm.occr_dt = (String)hash.get("occr_dt");
			dm.seq = (String)hash.get("seq");
			
			dm.print();

			
			ds = (HD_EDU_1011_ADataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}	    
	public void hd_edu_1100(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1100_LDataSet ds = null;
		HD_EDU_1100_LDM dm = new HD_EDU_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_EDU_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1101(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1101_LDataSet ds = null;
		HD_EDU_1101_LDM dm = new HD_EDU_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.print();

		ds = (HD_EDU_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	
	public void hd_edu_1102(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1102_LDataSet ds = null;
		HD_EDU_1102_LDM dm = new HD_EDU_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_EDU_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	
	public void hd_edu_1103(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1103_ADataSet ds = null;
		HD_EDU_1103_ADM dm = new HD_EDU_1103_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
			System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			System.out.println(hash);
			System.out.println((String)hash.get("m"));
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.chrg_job = (String)hash.get("chrg_job");
		dm.edu_nm = (String)hash.get("edu_nm");
		dm.edu_instt = (String)hash.get("edu_instt");
		dm.edu_frdt = (String)hash.get("edu_frdt");
		dm.edu_todt = (String)hash.get("edu_todt");
		dm.edu_todt = (String)hash.get("edu_todt");
		dm.edu_dds = (String)hash.get("edu_dds");
		dm.edu_tm = (String)hash.get("edu_tm");
		dm.edu_cost = (String)hash.get("edu_cost");	
		dm.aprv_yn = (String)hash.get("aprv_yn");
		dm.complt_yn = (String)hash.get("complt_yn");		
		dm.remk = (String)hash.get("remk");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();
		
		ds = (HD_EDU_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_edu_1104_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1104_MDataSet ds = null;
		HD_EDU_1104_MDM dm = new HD_EDU_1104_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_EDU_1104_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public Hashtable getHashMultiUpdateData2(String multiUpdateData) throws AppException {
    	Hashtable 	hash	= new Hashtable();
    	try{
	    	String[][] temp_arr = null;
	    	StringTokenizer st = new StringTokenizer(multiUpdateData, "|");
	    	int rowCount  = 0;
	    	int colCount  = st.countTokens();
	    	int col = 0;
	    	int row = 0;
	    	while(st.hasMoreTokens()){
	    		row = 0;
	    		String token 	 	= st.nextToken();
	    		String[] token_arr 	= token.split("`");
	    		if(temp_arr == null){
	    			rowCount = token_arr.length;
	    			temp_arr = new String[rowCount][colCount];
	    		}
	    		for(int i=0; i<token_arr.length; i++){
	    			temp_arr[row++][col] = token_arr[i];
	    		}
	    		col++;
	    	}
	    	for(int i=0; i<temp_arr.length; i++){
	    		StringBuffer sb = new StringBuffer();
	    		String header   = temp_arr[i][0];
	    		for(int j=1; j<temp_arr[i].length; j++){
	    			sb.append(StringUtil.nvl(temp_arr[i][j]));
	    			if(j<temp_arr[i].length-1){
	    				sb.append("`");
	    			}
	    		}
	    		hash.put(header, sb.toString());
	    	}
    	}catch(Exception e){
    		throw new AppException("BaseWB.getHashMultiUpdateData", e.getLocalizedMessage());
    	}
    	return hash;
    }
	
	public void hd_edu_1110_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1110_ADataSet ds = null;
		HD_EDU_1110_ADM dm = new HD_EDU_1110_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.setRemk(req.getParameter("remk"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		// Clob 처리
		//////////////////////////////////////////////
//		HD_EDU_1000DAO  edudao = new HD_EDU_1000DAO(); 
//		edudao.hd_edu_1110_a(dm);
		///////////////////////////////////////////////

		//manager.getConnection();
		//manager.m_conn.setAutoCommit(false);
		
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement opstmt = null;
		
		String query = "select CONT from TAHDD_EDU_TRAIN_ACCT where cmpy_cd = ? and emp_no = ? and OCCR_DT = ? AND OCCR_SEQ = ? and REPT_CLSF = '1' for update";
	    try{
			    //manager = new DBManager("MISHDL");
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
				
		    	/*clob데이터 write 위한 for update*/
				opstmt = manager.m_conn.prepareStatement(query);
				opstmt.setString(1, dm.cmpy_cd);
				opstmt.setString(2, dm.emp_no);
				opstmt.setString(3, dm.occr_dt);
				opstmt.setString(4, dm.occr_seq);
				rs = opstmt.executeQuery();
	
		        if(rs.next()){ 
		        	  Clob clob= rs.getClob("cont"); //(oracle.sql.CLOB)(rs).getClob(1);
		              //CLOB clob=((OracleResultSet)rs).getCLOB("CONT");
		              //Writer writer = clob.getCharacterOutputStream();
		        	  Writer writer = ((weblogic.jdbc.common.OracleClob)clob).getCharacterOutputStream(); 
		              Reader src = new CharArrayReader(dm.remk.toCharArray());
		              char[] buffer = new char[1024];
		              int read = 0;
		              while ((read = src.read(buffer, 0, 1024)) != -1 ){
		            	  writer.write(buffer,0,read);
		              }
		              src.close();
		              writer.close();	
			    } 
		        rs.close();
		    	
		        manager.m_conn.commit();
		        manager.m_conn.setAutoCommit(true);
		        opstmt.close();
			    
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
	    	
	    } catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		manager.disConnection();
		
	}
	
	public void hd_edu_1111_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1111_DDataSet ds = null;
		HD_EDU_1111_DDM dm = new HD_EDU_1111_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));

		dm.print();

		ds = (HD_EDU_1111_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1112_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1112_LDataSet ds = null;
		HD_EDU_1112_LDM dm = new HD_EDU_1112_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));

		dm.print();

		ds = (HD_EDU_1112_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_edu_1200(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1200_LDataSet ds = null;
		HD_EDU_1200_LDM dm = new HD_EDU_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_EDU_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1201(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1201_LDataSet ds = null;
		HD_EDU_1201_LDM dm = new HD_EDU_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.train_flag = Util.checkString(req.getParameter("train_flag"));
		dm.nation_flag = Util.checkString(req.getParameter("nation_flag"));
		dm.print();

		ds = (HD_EDU_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1202(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1202_ADataSet ds = null;
		HD_EDU_1202_ADM dm = new HD_EDU_1202_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		//Hashtable hash = getHashMultiUpdateData2(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.stdy_yy = (String)hash.get("stdy_yy");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.ictry_excep_clsf = (String)hash.get("ictry_excep_clsf");
		dm.stdy_clsf = (String)hash.get("stdy_clsf");
		dm.invit_instt = (String)hash.get("invit_instt"); 
		dm.stdy_frdt = (String)hash.get("stdy_frdt");
		dm.stdy_todt = (String)hash.get("stdy_todt");
		dm.stdy_natn_cd = (String)hash.get("stdy_natn_cd");
		dm.stdy_instt = (String)hash.get("stdy_instt");
		dm.aviat_cost = (String)hash.get("aviat_cost");
		dm.stay_cost = (String)hash.get("stay_cost");
		dm.scl_exps = (String)hash.get("scl_exps");
		dm.etc_cost = (String)hash.get("etc_cost");
		dm.stdy_cost_stot = (String)hash.get("stdy_cost_stot"); 
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.remk = (String)hash.get("rep_cont");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_EDU_1202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1203(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1203_LDataSet ds = null;
		HD_EDU_1203_LDM dm = new HD_EDU_1203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_clsf_cd = Util.checkString(req.getParameter("emp_clsf_cd"));
		dm.print();

		ds = (HD_EDU_1203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1210_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1210_ADataSet ds = null;
		HD_EDU_1210_ADM dm = new HD_EDU_1210_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.remk = req.getParameter("remk");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		////////////////////////////////////////////
//		HD_EDU_1000DAO  edudao = new HD_EDU_1000DAO(); 
//		edudao.hd_edu_1210_a(dm);
		////////////////////////////////////////////
		

		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement opstmt = null;
		
		String query = "select CONT from TAHDD_EDU_TRAIN_ACCT where cmpy_cd = ? and emp_no = ? and OCCR_DT = ? AND OCCR_SEQ = ? and REPT_CLSF = '2' for update";
	    try{

			    //manager = new DBManager("MISHDL");
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
				
		    	/*clob데이터 write 위한 for update*/
				opstmt = manager.m_conn.prepareStatement(query);
				opstmt.setString(1, dm.cmpy_cd);
				opstmt.setString(2, dm.emp_no);
				opstmt.setString(3, dm.occr_dt);
				opstmt.setString(4, dm.occr_seq);
				rs = opstmt.executeQuery();
	
		        if(rs.next()){ 
		        	  //Clob clob= rs.getClob("cont"); //(oracle.sql.CLOB)(rs).getClob(1);
		              CLOB clob=((OracleResultSet)rs).getCLOB("CONT");
		              Writer writer = clob.getCharacterOutputStream();
		        	 // Writer writer = ((weblogic.jdbc.common.OracleClob)clob).getCharacterOutputStream(); 
		        	  
		              Reader src = new CharArrayReader(dm.remk.toCharArray());
		              char[] buffer = new char[1024];
		              int read = 0;
		              while ((read = src.read(buffer, 0, 1024)) != -1 ){
		            	  writer.write(buffer,0,read);
		              }
		              src.close();
		              writer.close();	
			    } 
		        rs.close();
		    	
		        manager.m_conn.commit();
		        manager.m_conn.setAutoCommit(true);
		        opstmt.close();		    
			    
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
		    	
	    } catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		manager.disConnection();
	    	
	}
	
	public void hd_edu_1211_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1211_DDataSet ds = null;
		HD_EDU_1211_DDM dm = new HD_EDU_1211_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));

		dm.print();

		ds = (HD_EDU_1211_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1212_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1212_LDataSet ds = null;
		HD_EDU_1212_LDM dm = new HD_EDU_1212_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));

		dm.print();

		ds = (HD_EDU_1212_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_edu_1300(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1300_LDataSet ds = null;
		HD_EDU_1300_LDM dm = new HD_EDU_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_EDU_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1301(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1301_LDataSet ds = null;
		HD_EDU_1301_LDM dm = new HD_EDU_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_EDU_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	
	public void hd_edu_1302(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1302_LDataSet ds = null;
		HD_EDU_1302_LDM dm = new HD_EDU_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_EDU_1302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_edu_1303(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1303_LDataSet ds = null;
		HD_EDU_1303_LDM dm = new HD_EDU_1303_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.complt_yn = Util.checkString(req.getParameter("complt_yn"));
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		
		ds = (HD_EDU_1303_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_edu_1304(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1304_ADataSet ds = null;
		HD_EDU_1304_ADM dm = new HD_EDU_1304_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.edu_clsf = (String)hash.get("edu_clsf");
		dm.lecture_nm = (String)hash.get("lecture_nm");
		dm.edu_frdt = (String)hash.get("edu_frdt");
		dm.edu_todt = (String)hash.get("edu_todt");
		dm.edu_tm = (String)hash.get("edu_tm");
		dm.edu_cost = (String)hash.get("edu_cost");
		dm.emp_yn = (String)hash.get("emp_yn");
		dm.edu_scor = (String)hash.get("edu_scor");
		dm.complt_yn = (String)hash.get("complt_yn");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.edu_dtls_clsf = (String)hash.get("edu_dtls_clsf"); //2018.07.17 교육세부항목 추가 
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.lang_cd = (String)hash.get("lang_cd");
        dm.remk = (String)hash.get("remk");
        dm.print();

		ds = (HD_EDU_1304_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1310_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1310_MDataSet ds = null;
		HD_EDU_1310_MDM dm = new HD_EDU_1310_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_EDU_1310_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1320_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1320_MDataSet ds = null;
		HD_EDU_1320_MDM dm = new HD_EDU_1320_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_EDU_1320_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1401(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1401_LDataSet ds = null;
		HD_EDU_1401_LDM dm = new HD_EDU_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_EDU_1401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	
	public void hd_edu_1402(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1402_LDataSet ds = null;
		HD_EDU_1402_LDM dm = new HD_EDU_1402_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_EDU_1402_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_edu_1403(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1403_LDataSet ds = null;
		HD_EDU_1403_LDM dm = new HD_EDU_1403_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.complt_yn = Util.checkString(req.getParameter("complt_yn"));
		dm.print();

		ds = (HD_EDU_1403_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1404(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1404_ADataSet ds = null;
		HD_EDU_1404_ADM dm = new HD_EDU_1404_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.edu_clsf = (String)hash.get("edu_clsf");
		dm.lecture_nm = (String)hash.get("lecture_nm");
		dm.edu_frdt = (String)hash.get("edu_frdt");
		dm.edu_todt = (String)hash.get("edu_todt");
		dm.edu_tm = (String)hash.get("edu_tm");
		dm.edu_cost = (String)hash.get("edu_cost");
		dm.emp_yn = (String)hash.get("emp_yn");
		dm.edu_scor = (String)hash.get("edu_scor");
		dm.complt_yn = (String)hash.get("complt_yn");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		ds = (HD_EDU_1404_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1500(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1500_LDataSet ds = null;
		HD_EDU_1500_LDM dm = new HD_EDU_1500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_EDU_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1501(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1501_LDataSet ds = null;
		HD_EDU_1501_LDM dm = new HD_EDU_1501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_nm = Util.checkString(req.getParameter("dept_nm"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.edu_clsf = Util.checkString(req.getParameter("edu_clsf"));
		dm.print();

		ds = (HD_EDU_1501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1502(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1502_ADataSet ds = null;
		HD_EDU_1502_ADM dm = new HD_EDU_1502_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.edu_clsf = (String)hash.get("edu_clsf");
		dm.edu_course_nm = (String)hash.get("edu_course_nm"); 	 
		dm.edu_frdt = (String)hash.get("edu_frdt");
		dm.edu_todt = (String)hash.get("edu_todt");
		dm.edu_instt = (String)hash.get("edu_instt");
		dm.edu_dds = (String)hash.get("edu_dds");
		dm.edu_tm = (String)hash.get("edu_tm");
		dm.edu_cost = (String)hash.get("edu_cost");
		dm.complt_yn = (String)hash.get("complt_yn");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

		ds = (HD_EDU_1502_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1503(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1503_LDataSet ds = null;
		HD_EDU_1503_LDM dm = new HD_EDU_1503_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_clsf_cd = Util.checkString(req.getParameter("emp_clsf_cd"));

		ds = (HD_EDU_1503_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_edu_1504_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1504_MDataSet ds = null;
		HD_EDU_1504_MDM dm = new HD_EDU_1504_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_EDU_1504_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_1600(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1600_LDataSet ds = null;
		HD_EDU_1600_LDM dm = new HD_EDU_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_EDU_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_edu_1601(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1601_LDataSet ds = null;
		HD_EDU_1601_LDM dm = new HD_EDU_1601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();
		
		ds = (HD_EDU_1601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	/* 테스트 용 삭제해도 됨 
	public void hd_edu_1610(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1610_LDataSet ds = null;
		HD_EDU_1610_LDM dm = new HD_EDU_1610_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();
		
		ds = (HD_EDU_1610_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1620_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1620_ADataSet ds = null;
		HD_EDU_1620_ADM dm = new HD_EDU_1620_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
	
		dm.dept_nm = (String)hash.get("dept_nm");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.posi_nm = (String)hash.get("posi_nm");
	

		dm.print();
		
		ds = (HD_EDU_1620_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_edu_1630_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1630_DDataSet ds = null;
		HD_EDU_1630_DDM dm = new HD_EDU_1630_DDM();

		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_EDU_1630_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	*/
	public void hd_edu_1700(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1700_ADataSet ds = null;
		HD_EDU_1700_ADM dm = new HD_EDU_1700_ADM();
		
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.chrg_job = Util.checkString(req.getParameter("chrg_job"));
		dm.edu_nm = Util.checkString(req.getParameter("edu_nm"));
		dm.edu_instt = Util.checkString(req.getParameter("edu_instt"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.edu_tm_clsf = Util.checkString(req.getParameter("edu_tm_clsf"));
		dm.edu_fr_tm = Util.checkString(req.getParameter("edu_fr_tm"));
		dm.edu_to_tm = Util.checkString(req.getParameter("edu_to_tm"));
		dm.edu_cost = Util.checkString(req.getParameter("edu_cost"));
		dm.edu_sply_cost = Util.checkString(req.getParameter("edu_sply_cost"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.misno = Util.checkString(req.getParameter("misno"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.lang_cd = Util.checkString(req.getParameter("lang_cd"));
		dm.course_cd = Util.checkString(req.getParameter("course_cd")); //20160229_추가
        dm.sply_fee_pay = Util.checkString(req.getParameter("sply_fee_pay"));
		
        dm.print();
        
		ds = (HD_EDU_1700_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1701(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1701_LDataSet ds = null;
		HD_EDU_1701_LDM dm = new HD_EDU_1701_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
      
        dm.print();
        
		ds = (HD_EDU_1701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	 public void hd_edu_1710_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    	DBManager manager = new DBManager("MISHDL");
	    	HD_EDU_1710_LDataSet ds = null;
			HD_EDU_1710_LDM dm = new HD_EDU_1710_LDM();

			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));
			dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
			dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
			System.out.println("11111111111111");
			dm.print();
			System.out.println("22222222222222");
			ds = (HD_EDU_1710_LDataSet)manager.executeCall(dm);
			System.out.println("333333333333");
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error. 1005");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}
	 
	 public void hd_edu_1711(HttpServletRequest req, HttpServletResponse res) throws AppException {
			DBManager manager = new DBManager("MISHDL");
			HD_EDU_1711_ADataSet ds = null;
			HD_EDU_1711_ADM dm = new HD_EDU_1711_ADM();

			System.out.println("dddd");

			String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);
			dm.cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));		
	        // 출장자
			dm.mode = ((String)hash.get("m")).toUpperCase(); 
			//dm.mode = (String)hash.get("send");
			//dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));		
			dm.proc_stat = (String)hash.get("proc_stat");
			dm.occr_dt = (String)hash.get("occr_dt");
			dm.seq = (String)hash.get("seq");
			
			dm.print();
			
			ds = (HD_EDU_1711_ADataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}	    
	 
	public void hd_edu_1801(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EDU_1801_LDataSet ds = null;
		HD_EDU_1801_LDM dm = new HD_EDU_1801_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.print();
		
		ds = (HD_EDU_1801_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_1803(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_1803_ADataSet ds = null;
		HD_EDU_1803_ADM dm = new HD_EDU_1803_ADM();
        String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println(multiUpdateData);
        Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        System.out.println(hash);
        System.out.println((String)hash.get("m"));
		dm.mode = ((String)hash.get("m")).toUpperCase();
		//dm.mode = (String)hash.get("mode");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm   = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dept_nm = (String)hash.get("dept_nm");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.dty_nm = (String)hash.get("dty_nm");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.posi_nm = (String)hash.get("posi_nm");
		dm.chrg_job = (String)hash.get("chrg_job");
		dm.edu_nm = (String)hash.get("edu_nm");
		dm.edu_instt = (String)hash.get("edu_instt");
		dm.edu_frdt = (String)hash.get("edu_frdt");
		dm.edu_todt = (String)hash.get("edu_todt");
		dm.edu_tm_clsf = (String)hash.get("edu_tm_clsf");
		dm.edu_fr_tm = (String)hash.get("edu_fr_tm");
		dm.edu_to_tm = (String)hash.get("edu_to_tm");
		dm.edu_cost = (String)hash.get("edu_cost");
		dm.edu_sply_cost = (String)hash.get("edu_sply_cost");
		dm.remk = (String)hash.get("remk");
		
		dm.aprv_yn = (String)hash.get("aprv_yn");
		dm.complt_yn = (String)hash.get("complt_yn");	
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("seq");
        dm.lang_cd	= (String)hash.get("lang_cd");
        dm.course_cd	= (String)hash.get("course_cd"); //20160229_추가
        dm.sply_fee_pay	=	(String)hash.get("sply_fee_pay");
        
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		ds = (HD_EDU_1803_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	
	public void hd_edu_2010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2010_LDataSet ds = null;
		HD_EDU_2010_LDM dm = new HD_EDU_2010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.fr_cour_yyyymm = Util.checkString(req.getParameter("fr_cour_yyyymm"));
		dm.to_cour_yyyymm = Util.checkString(req.getParameter("to_cour_yyyymm"));

		dm.print();

		ds = (HD_EDU_2010_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_edu_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL"); 
		HD_EDU_2000_MDataSet ds = null;
		HD_EDU_2000_MDM dm = new HD_EDU_2000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_EDU_2000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_edu_2002_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2002_MDataSet ds = null;
		HD_EDU_2002_MDM dm = new HD_EDU_2002_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cour_lng_cd = Util.checkString(req.getParameter("cour_lng_cd"));
		
		dm.print();

		ds = (HD_EDU_2002_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2003_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2003_MDataSet ds = null;
		HD_EDU_2003_MDM dm = new HD_EDU_2003_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cour_obj_cd = Util.checkString(req.getParameter("cour_obj_cd"));
		
		dm.print();

		ds = (HD_EDU_2003_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2020_ADataSet ds = null;
		HD_EDU_2020_ADM dm = new HD_EDU_2020_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cour_yyyymm = Util.checkString(req.getParameter("cour_yyyymm"));
		dm.cour_lng_cd = Util.checkString(req.getParameter("cour_lng_cd"));
		dm.cour_obj_cd = Util.checkString(req.getParameter("cour_obj_cd"));
		dm.cour_tm_cd = Util.checkString(req.getParameter("cour_tm_cd"));
		dm.lv_cd = Util.checkString(req.getParameter("lv_cd"));
		dm.lv_test_req_cd = Util.checkString(req.getParameter("lv_test_req_cd"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_2020_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_edu_2030_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2030_DDataSet ds = null;
		HD_EDU_2030_DDM dm = new HD_EDU_2030_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_2030_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2101_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2101_MDataSet ds = null;
		HD_EDU_2101_MDM dm = new HD_EDU_2101_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_EDU_2101_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2100_LDataSet ds = null;
		HD_EDU_2100_LDM dm = new HD_EDU_2100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_2100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_edu_2110_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2110_UDataSet ds = null;
		HD_EDU_2110_UDM dm = new HD_EDU_2110_UDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.send = (String)hash.get("send");
		dm.retu = (String)hash.get("retu");
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.emp_no_tm = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_2110_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	public void hd_edu_2001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2001_MDataSet ds = null;
		HD_EDU_2001_MDM dm = new HD_EDU_2001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_EDU_2001_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	public void hd_edu_2200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2200_LDataSet ds = null;
		HD_EDU_2200_LDM dm = new HD_EDU_2200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cour_yyyymm = Util.checkString(req.getParameter("cour_yyyymm"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));

		dm.print();

		ds = (HD_EDU_2200_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2201_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2201_MDataSet ds = null;
		HD_EDU_2201_MDM dm = new HD_EDU_2201_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		ds = (HD_EDU_2201_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2210_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2210_UDataSet ds = null;
		HD_EDU_2210_UDM dm = new HD_EDU_2210_UDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.check = (String)hash.get("check");
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_2210_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	public void hd_edu_2230_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2230_DDataSet ds = null;
		HD_EDU_2230_DDM dm = new HD_EDU_2230_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_2230_DDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);

	}
	public void hd_edu_2220_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2220_ADataSet ds = null;
		HD_EDU_2220_ADM dm = new HD_EDU_2220_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.cour_yyyymm = Util.checkString(req.getParameter("cour_yyyymm"));
		dm.cour_lng_cd = Util.checkString(req.getParameter("cour_lng_cd"));
		dm.cour_obj_cd = Util.checkString(req.getParameter("cour_obj_cd"));
		dm.cour_tm_cd = Util.checkString(req.getParameter("cour_tm_cd"));
		dm.lv_cd = Util.checkString(req.getParameter("lv_cd"));
		dm.lv_test_req_cd = Util.checkString(req.getParameter("lv_test_req_cd"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_2220_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);

	}
	public void hd_edu_2240_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2240_UDataSet ds = null;
		HD_EDU_2240_UDM dm = new HD_EDU_2240_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.cour_lng_cd = (String)hash.get("cour_lng_cd");
		dm.cour_obj_cd = (String)hash.get("cour_obj_cd");
		dm.cour_tm_cd = (String)hash.get("cour_tm_cd");
		dm.lv_cd = (String)hash.get("lv_cd");
		dm.lv_test_req_cd = (String)hash.get("lv_test_req_cd");
		dm.tel_no = (String)hash.get("tel_no");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_2240_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2300_LDataSet ds = null;
		HD_EDU_2300_LDM dm = new HD_EDU_2300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.print();

		ds = (HD_EDU_2300_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2301_LDataSet ds = null;
		HD_EDU_2301_LDM dm = new HD_EDU_2301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
		dm.edu_todt = Util.checkString(req.getParameter("edu_todt"));
		dm.print();

		ds = (HD_EDU_2301_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_2302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_2302_ADataSet ds = null;
		HD_EDU_2302_ADM dm = new HD_EDU_2302_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.lang_aprv_tms_chk = (String)hash.get("lang_aprv_tms_chk");
		dm.edu_clsf = (String)hash.get("edu_clsf");

		dm.print();

		ds = (HD_EDU_2302_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);

	}
	public void hd_edu_5000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_5000_MDataSet ds = null;
		HD_EDU_5000_MDM dm = new HD_EDU_5000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();
		

		ds = (HD_EDU_5000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_5001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_5001_LDataSet ds = null;
		HD_EDU_5001_LDM dm = new HD_EDU_5001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_EDU_5001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_edu_5002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_5002_ADataSet ds = null;
		HD_EDU_5002_ADM dm = new HD_EDU_5002_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.phon_num = Util.checkString(req.getParameter("phon_num"));
		dm.out_class_type = Util.checkString(req.getParameter("out_class_type"));
		dm.acty_type = Util.checkString(req.getParameter("acty_type"));
		dm.acty_etc = Util.checkString(req.getParameter("acty_etc"));
		dm.req_instt_nm = Util.checkString(req.getParameter("req_instt_nm"));
		dm.req_presi_nm = Util.checkString(req.getParameter("req_presi_nm"));
		dm.req_chrg_dept_nm = Util.checkString(req.getParameter("req_chrg_dept_nm"));
		dm.req_chrg_nm = Util.checkString(req.getParameter("req_chrg_nm"));
		dm.req_phon_nm = Util.checkString(req.getParameter("req_phon_nm"));
		dm.req_resn = Util.checkString(req.getParameter("req_resn"));
		dm.out_class_subj_nm = Util.checkString(req.getParameter("out_class_subj_nm"));
		dm.out_class_plac = Util.checkString(req.getParameter("out_class_plac"));
		dm.out_class_fr_dt = Util.checkString(req.getParameter("out_class_fr_dt"));
		dm.out_class_to_dt = Util.checkString(req.getParameter("out_class_to_dt"));
		dm.out_class_fr_tm = Util.checkString(req.getParameter("out_class_fr_tm"));
		dm.out_class_to_tm = Util.checkString(req.getParameter("out_class_to_tm"));
		dm.yy_avg_tms = Util.checkString(req.getParameter("yy_avg_tms"));
		dm.mm_avg_tms = Util.checkString(req.getParameter("mm_avg_tms"));
		dm.tms_avg_tm = Util.checkString(req.getParameter("tms_avg_tm"));
		dm.tot_amt = Util.checkString(req.getParameter("tot_amt"));
		dm.tms_avg_amt = Util.checkString(req.getParameter("tms_avg_amt"));
		dm.trff_stay_amt = Util.checkString(req.getParameter("trff_stay_amt"));
		dm.tms_avg_trff_stay_amt = Util.checkString(req.getParameter("tms_avg_trff_stay_amt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EDU_5002_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);

	}
	
	public void hd_edu_5004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_5004_LDataSet ds = null;
		HD_EDU_5004_LDM dm = new HD_EDU_5004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.occr_yy = Util.checkString(req.getParameter("occr_yy"));
		System.out.println("111111111111111111111111111111");

		dm.print();
		System.out.println("22222222222222222222");

		ds = (HD_EDU_5004_LDataSet)manager.executeCall(dm);
		System.out.println("33333333333333333333");
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_edu_5005(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_5005_ADataSet ds = null;
		HD_EDU_5005_ADM dm = new HD_EDU_5005_ADM();

		System.out.println("111111111111111111111111111111");

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));		
        // 출장자
		dm.mode = ((String)hash.get("m")).toUpperCase(); 
		//dm.mode = (String)hash.get("send");
		//dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));		
		dm.proc_stat = (String)hash.get("proc_stat");
		dm.acpn_no = (String)hash.get("acpn_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		System.out.println("222222222222222222222222222");
		dm.print();
		System.out.println("33333333333333333333333333");
		ds = (HD_EDU_5005_ADataSet)manager.executeCall(dm);
		System.out.println("444444444444444444444444");
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_edu_5100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_5100_MDataSet ds = null;
		HD_EDU_5100_MDM dm = new HD_EDU_5100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();
		

		ds = (HD_EDU_5100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_edu_5101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_5101_LDataSet ds = null;
		HD_EDU_5101_LDM dm = new HD_EDU_5101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
		dm.occr_todt = Util.checkString(req.getParameter("occr_todt"));

		dm.print();

		ds = (HD_EDU_5101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_edu_5102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EDU_5102_ADataSet ds = null;
		HD_EDU_5102_ADM dm = new HD_EDU_5102_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.acpn_no = (String)hash.get("acpn_no");

		dm.print();

		ds = (HD_EDU_5102_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}

		req.setAttribute("ds", ds);

	}
}