/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


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


public class HD_SALY_8012_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String pens_aply_mm;
	public String pens_clsf;
	public String prsn_pens_amt;
	public String proc_stat;

	public HD_SALY_8012_LDM(){}
	public HD_SALY_8012_LDM(String cmpy_cd, String emp_no, String pens_aply_mm, String pens_clsf, String prsn_pens_amt, String proc_stat){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.pens_aply_mm = pens_aply_mm;
		this.pens_clsf = pens_clsf;
		this.prsn_pens_amt = prsn_pens_amt;
		this.proc_stat = proc_stat;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPens_aply_mm(String pens_aply_mm){
		this.pens_aply_mm = pens_aply_mm;
	}

	public void setPens_clsf(String pens_clsf){
		this.pens_clsf = pens_clsf;
	}

	public void setPrsn_pens_amt(String prsn_pens_amt){
		this.prsn_pens_amt = prsn_pens_amt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPens_aply_mm(){
		return this.pens_aply_mm;
	}

	public String getPens_clsf(){
		return this.pens_clsf;
	}

	public String getPrsn_pens_amt(){
		return this.prsn_pens_amt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_8012_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_8012_LDM dm = (HD_SALY_8012_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.pens_aply_mm);
		cstmt.setString(7, dm.pens_clsf);
		cstmt.setString(8, dm.prsn_pens_amt);
		cstmt.setString(9, dm.proc_stat);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_8012_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("pens_aply_mm = [" + getPens_aply_mm() + "]");
		System.out.println("pens_clsf = [" + getPens_clsf() + "]");
		System.out.println("prsn_pens_amt = [" + getPrsn_pens_amt() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String pens_aply_mm = req.getParameter("pens_aply_mm");
if( pens_aply_mm == null){
	System.out.println(this.toString+" : pens_aply_mm is null" );
}else{
	System.out.println(this.toString+" : pens_aply_mm is "+pens_aply_mm );
}
String pens_clsf = req.getParameter("pens_clsf");
if( pens_clsf == null){
	System.out.println(this.toString+" : pens_clsf is null" );
}else{
	System.out.println(this.toString+" : pens_clsf is "+pens_clsf );
}
String prsn_pens_amt = req.getParameter("prsn_pens_amt");
if( prsn_pens_amt == null){
	System.out.println(this.toString+" : prsn_pens_amt is null" );
}else{
	System.out.println(this.toString+" : prsn_pens_amt is "+prsn_pens_amt );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String pens_aply_mm = Util.checkString(req.getParameter("pens_aply_mm"));
String pens_clsf = Util.checkString(req.getParameter("pens_clsf"));
String prsn_pens_amt = Util.checkString(req.getParameter("prsn_pens_amt"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String pens_aply_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_aply_mm")));
String pens_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_clsf")));
String prsn_pens_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_pens_amt")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setPens_aply_mm(pens_aply_mm);
dm.setPens_clsf(pens_clsf);
dm.setPrsn_pens_amt(prsn_pens_amt);
dm.setProc_stat(proc_stat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 17 11:47:28 KST 2015 */