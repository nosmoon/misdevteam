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


public class MC_BUDG_2092_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String dept_cd;
	public String budg_cd;
	public String work_no;
	public String seq;
	public String medi_cd;
	public String use_dept_cd;
	public String crte_clsf;
	public String job_clsf_cd;
	public String dtls_clsf_cd;

	public MC_BUDG_2092_LDM(){}
	public MC_BUDG_2092_LDM(String cmpy_cd, String yymm, String dept_cd, String budg_cd, String work_no, String seq, String medi_cd, String use_dept_cd, String crte_clsf, String job_clsf_cd, String dtls_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.dept_cd = dept_cd;
		this.budg_cd = budg_cd;
		this.work_no = work_no;
		this.seq = seq;
		this.medi_cd = medi_cd;
		this.use_dept_cd = use_dept_cd;
		this.crte_clsf = crte_clsf;
		this.job_clsf_cd = job_clsf_cd;
		this.dtls_clsf_cd = dtls_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setCrte_clsf(String crte_clsf){
		this.crte_clsf = crte_clsf;
	}

	public void setJob_clsf_cd(String job_clsf_cd){
		this.job_clsf_cd = job_clsf_cd;
	}

	public void setDtls_clsf_cd(String dtls_clsf_cd){
		this.dtls_clsf_cd = dtls_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getCrte_clsf(){
		return this.crte_clsf;
	}

	public String getJob_clsf_cd(){
		return this.job_clsf_cd;
	}

	public String getDtls_clsf_cd(){
		return this.dtls_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2092_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2092_LDM dm = (MC_BUDG_2092_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.budg_cd);
		cstmt.setString(7, dm.work_no);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.use_dept_cd);
		cstmt.setString(11, dm.crte_clsf);
		cstmt.setString(12, dm.job_clsf_cd);
		cstmt.setString(13, dm.dtls_clsf_cd);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2092_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("work_no = [" + getWork_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("crte_clsf = [" + getCrte_clsf() + "]");
		System.out.println("job_clsf_cd = [" + getJob_clsf_cd() + "]");
		System.out.println("dtls_clsf_cd = [" + getDtls_clsf_cd() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String crte_clsf = req.getParameter("crte_clsf");
if( crte_clsf == null){
	System.out.println(this.toString+" : crte_clsf is null" );
}else{
	System.out.println(this.toString+" : crte_clsf is "+crte_clsf );
}
String job_clsf_cd = req.getParameter("job_clsf_cd");
if( job_clsf_cd == null){
	System.out.println(this.toString+" : job_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : job_clsf_cd is "+job_clsf_cd );
}
String dtls_clsf_cd = req.getParameter("dtls_clsf_cd");
if( dtls_clsf_cd == null){
	System.out.println(this.toString+" : dtls_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_clsf_cd is "+dtls_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String work_no = Util.checkString(req.getParameter("work_no"));
String seq = Util.checkString(req.getParameter("seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
String job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
String dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String crte_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("crte_clsf")));
String job_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf_cd")));
String dtls_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setDept_cd(dept_cd);
dm.setBudg_cd(budg_cd);
dm.setWork_no(work_no);
dm.setSeq(seq);
dm.setMedi_cd(medi_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setCrte_clsf(crte_clsf);
dm.setJob_clsf_cd(job_clsf_cd);
dm.setDtls_clsf_cd(dtls_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 10:54:09 KST 2009 */