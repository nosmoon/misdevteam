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


public class MC_BUDG_2114_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tag;
	public String cnt;
	public String budg_yy;
	public String budg_yymm;
	public String budg_cd;
	public String dept_cd;
	public String evnt_cd;
	public String work_no;
	public String seq;
	public String incmg_pers;
	public String job_clsf;
	public String dtls_clsf_cd;
	public String medi_cd;
	public String use_dept_cd;

	public MC_BUDG_2114_DDM(){}
	public MC_BUDG_2114_DDM(String cmpy_cd, String tag, String cnt, String budg_yy, String budg_yymm, String budg_cd, String dept_cd, String evnt_cd, String work_no, String seq, String incmg_pers, String job_clsf, String dtls_clsf_cd, String medi_cd, String use_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.tag = tag;
		this.cnt = cnt;
		this.budg_yy = budg_yy;
		this.budg_yymm = budg_yymm;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.evnt_cd = evnt_cd;
		this.work_no = work_no;
		this.seq = seq;
		this.incmg_pers = incmg_pers;
		this.job_clsf = job_clsf;
		this.dtls_clsf_cd = dtls_clsf_cd;
		this.medi_cd = medi_cd;
		this.use_dept_cd = use_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setBudg_yy(String budg_yy){
		this.budg_yy = budg_yy;
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

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setDtls_clsf_cd(String dtls_clsf_cd){
		this.dtls_clsf_cd = dtls_clsf_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTag(){
		return this.tag;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getBudg_yy(){
		return this.budg_yy;
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

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getDtls_clsf_cd(){
		return this.dtls_clsf_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2114_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2114_DDM dm = (MC_BUDG_2114_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tag);
		cstmt.setString(5, dm.cnt);
		cstmt.setString(6, dm.budg_yy);
		cstmt.setString(7, dm.budg_yymm);
		cstmt.setString(8, dm.budg_cd);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.evnt_cd);
		cstmt.setString(11, dm.work_no);
		cstmt.setString(12, dm.seq);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.job_clsf);
		cstmt.setString(15, dm.dtls_clsf_cd);
		cstmt.setString(16, dm.medi_cd);
		cstmt.setString(17, dm.use_dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2114_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tag = [" + getTag() + "]");
		System.out.println("cnt = [" + getCnt() + "]");
		System.out.println("budg_yy = [" + getBudg_yy() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("work_no = [" + getWork_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("dtls_clsf_cd = [" + getDtls_clsf_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
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
String tag = req.getParameter("tag");
if( tag == null){
	System.out.println(this.toString+" : tag is null" );
}else{
	System.out.println(this.toString+" : tag is "+tag );
}
String cnt = req.getParameter("cnt");
if( cnt == null){
	System.out.println(this.toString+" : cnt is null" );
}else{
	System.out.println(this.toString+" : cnt is "+cnt );
}
String budg_yy = req.getParameter("budg_yy");
if( budg_yy == null){
	System.out.println(this.toString+" : budg_yy is null" );
}else{
	System.out.println(this.toString+" : budg_yy is "+budg_yy );
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
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String dtls_clsf_cd = req.getParameter("dtls_clsf_cd");
if( dtls_clsf_cd == null){
	System.out.println(this.toString+" : dtls_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_clsf_cd is "+dtls_clsf_cd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String tag = Util.checkString(req.getParameter("tag"));
String cnt = Util.checkString(req.getParameter("cnt"));
String budg_yy = Util.checkString(req.getParameter("budg_yy"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String work_no = Util.checkString(req.getParameter("work_no"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tag = Util.Uni2Ksc(Util.checkString(req.getParameter("tag")));
String cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnt")));
String budg_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yy")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String dtls_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_clsf_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTag(tag);
dm.setCnt(cnt);
dm.setBudg_yy(budg_yy);
dm.setBudg_yymm(budg_yymm);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setEvnt_cd(evnt_cd);
dm.setWork_no(work_no);
dm.setSeq(seq);
dm.setIncmg_pers(incmg_pers);
dm.setJob_clsf(job_clsf);
dm.setDtls_clsf_cd(dtls_clsf_cd);
dm.setMedi_cd(medi_cd);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 20:17:27 KST 2009 */