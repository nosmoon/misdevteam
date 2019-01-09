/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.job.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.ds.*;
import chosun.ciis.co.job.rec.*;

/**
 * 
 */


public class CO_JOB_3040_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sys_clsf;
	public String seq;
	public String eis_fix;
	public String emp_no;

	public CO_JOB_3040_UDM(){}
	public CO_JOB_3040_UDM(String cmpy_cd, String sys_clsf, String seq, String eis_fix, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.sys_clsf = sys_clsf;
		this.seq = seq;
		this.eis_fix = eis_fix;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSys_clsf(String sys_clsf){
		this.sys_clsf = sys_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEis_fix(String eis_fix){
		this.eis_fix = eis_fix;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSys_clsf(){
		return this.sys_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEis_fix(){
		return this.eis_fix;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_JOB_3040_U(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_JOB_3040_UDM dm = (CO_JOB_3040_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sys_clsf);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.setString(5, dm.seq);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.eis_fix);
		cstmt.setString(7, dm.emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.job.ds.CO_JOB_3040_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sys_clsf = [" + getSys_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("eis_fix = [" + getEis_fix() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String sys_clsf = req.getParameter("sys_clsf");
if( sys_clsf == null){
	System.out.println(this.toString+" : sys_clsf is null" );
}else{
	System.out.println(this.toString+" : sys_clsf is "+sys_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String eis_fix = req.getParameter("eis_fix");
if( eis_fix == null){
	System.out.println(this.toString+" : eis_fix is null" );
}else{
	System.out.println(this.toString+" : eis_fix is "+eis_fix );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sys_clsf = Util.checkString(req.getParameter("sys_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String eis_fix = Util.checkString(req.getParameter("eis_fix"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sys_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sys_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String eis_fix = Util.Uni2Ksc(Util.checkString(req.getParameter("eis_fix")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSys_clsf(sys_clsf);
dm.setSeq(seq);
dm.setEis_fix(eis_fix);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 12:52:36 KST 2009 */