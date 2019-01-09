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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2111_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_yymm;
	public String budg_cd;
	public String dept_cd;
	public String work_no;
	public String seq;
	public String use_dept_cd;
	public String job_clsf;
	public String dtls_clsf;

	public MC_BUDG_2111_LDM(){}
	public MC_BUDG_2111_LDM(String cmpy_cd, String budg_yymm, String budg_cd, String dept_cd, String work_no, String seq, String use_dept_cd, String job_clsf, String dtls_clsf){
		this.cmpy_cd = cmpy_cd;
		this.budg_yymm = budg_yymm;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.work_no = work_no;
		this.seq = seq;
		this.use_dept_cd = use_dept_cd;
		this.job_clsf = job_clsf;
		this.dtls_clsf = dtls_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setDtls_clsf(String dtls_clsf){
		this.dtls_clsf = dtls_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getDtls_clsf(){
		return this.dtls_clsf;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2111_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2111_LDM dm = (MC_BUDG_2111_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_yymm);
		cstmt.setString(5, dm.budg_cd);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.work_no);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.use_dept_cd);
		cstmt.setString(10, dm.job_clsf);
		cstmt.setString(11, dm.dtls_clsf);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2111_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("work_no = [" + getWork_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("dtls_clsf = [" + getDtls_clsf() + "]");
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
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String work_no = req.getParameter("work_no");
if( work_no == null){
	System.out.println(this.toString+" : work_no is null" );
}else{
	System.out.println(this.toString+" : work_no is "+work_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String dtls_clsf = req.getParameter("dtls_clsf");
if( dtls_clsf == null){
	System.out.println(this.toString+" : dtls_clsf is null" );
}else{
	System.out.println(this.toString+" : dtls_clsf is "+dtls_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String work_no = Util.checkString(req.getParameter("work_no"));
String seq = Util.checkString(req.getParameter("seq"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String dtls_clsf = Util.checkString(req.getParameter("dtls_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String dtls_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_yymm(budg_yymm);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setWork_no(work_no);
dm.setSeq(seq);
dm.setUse_dept_cd(use_dept_cd);
dm.setJob_clsf(job_clsf);
dm.setDtls_clsf(dtls_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 20:17:27 KST 2009 */