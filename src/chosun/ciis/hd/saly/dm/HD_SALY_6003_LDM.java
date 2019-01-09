

package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_6003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String start_mm;
	public String term;

	public HD_SALY_6003_LDM(){}
	public HD_SALY_6003_LDM(String cmpy_cd, String emp_no, String start_mm, String term){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.start_mm = start_mm;
		this.term = term;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setStart_mm(String start_mm){
		this.start_mm = start_mm;
	}

	public void setTerm(String term){
		this.term = term;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getStart_mm(){
		return this.start_mm;
	}

	public String getTerm(){
		return this.term;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_6003_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_6003_LDM dm = (HD_SALY_6003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.start_mm);
		cstmt.setString(7, dm.term);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_SALY_6003_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("start_mm = [" + getStart_mm() + "]");
		System.out.println("term = [" + getTerm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String start_mm = req.getParameter("start_mm");
if( start_mm == null){
	System.out.println(this.toString+" : start_mm is null" );
}else{
	System.out.println(this.toString+" : start_mm is "+start_mm );
}
String term = req.getParameter("term");
if( term == null){
	System.out.println(this.toString+" : term is null" );
}else{
	System.out.println(this.toString+" : term is "+term );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String start_mm = Util.checkString(req.getParameter("start_mm"));
String term = Util.checkString(req.getParameter("term"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String start_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_mm")));
String term = Util.Uni2Ksc(Util.checkString(req.getParameter("term")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setStart_mm(start_mm);
dm.setTerm(term);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 17 16:16:20 KST 2010 */