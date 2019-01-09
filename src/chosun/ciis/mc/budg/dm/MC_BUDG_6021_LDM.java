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


public class MC_BUDG_6021_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_frym;
	public String budg_toym;
	public String job_clsf_cd;
	public String dtls_clsf_cd;
	public String medi_cd;
	public String dept_frcd;
	public String dept_tocd;
	public String tms;
	public String sort;

	public MC_BUDG_6021_LDM(){}
	public MC_BUDG_6021_LDM(String cmpy_cd, String budg_frym, String budg_toym, String job_clsf_cd, String dtls_clsf_cd, String medi_cd, String dept_frcd, String dept_tocd, String tms, String sort){
		this.cmpy_cd = cmpy_cd;
		this.budg_frym = budg_frym;
		this.budg_toym = budg_toym;
		this.job_clsf_cd = job_clsf_cd;
		this.dtls_clsf_cd = dtls_clsf_cd;
		this.medi_cd = medi_cd;
		this.dept_frcd = dept_frcd;
		this.dept_tocd = dept_tocd;
		this.tms = tms;
		this.sort = sort;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_frym(String budg_frym){
		this.budg_frym = budg_frym;
	}

	public void setBudg_toym(String budg_toym){
		this.budg_toym = budg_toym;
	}

	public void setJob_clsf_cd(String job_clsf_cd){
		this.job_clsf_cd = job_clsf_cd;
	}

	public void setDtls_clsf_cd(String dtls_clsf_cd){
		this.dtls_clsf_cd = dtls_clsf_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDept_frcd(String dept_frcd){
		this.dept_frcd = dept_frcd;
	}

	public void setDept_tocd(String dept_tocd){
		this.dept_tocd = dept_tocd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setSort(String sort){
		this.sort = sort;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_frym(){
		return this.budg_frym;
	}

	public String getBudg_toym(){
		return this.budg_toym;
	}

	public String getJob_clsf_cd(){
		return this.job_clsf_cd;
	}

	public String getDtls_clsf_cd(){
		return this.dtls_clsf_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDept_frcd(){
		return this.dept_frcd;
	}

	public String getDept_tocd(){
		return this.dept_tocd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getSort(){
		return this.sort;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6021_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6021_LDM dm = (MC_BUDG_6021_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_frym);
		cstmt.setString(5, dm.budg_toym);
		cstmt.setString(6, dm.job_clsf_cd);
		cstmt.setString(7, dm.dtls_clsf_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.dept_frcd);
		cstmt.setString(10, dm.dept_tocd);
		cstmt.setString(11, dm.tms);
		cstmt.setString(12, dm.sort);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6021_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_frym = [" + getBudg_frym() + "]");
		System.out.println("budg_toym = [" + getBudg_toym() + "]");
		System.out.println("job_clsf_cd = [" + getJob_clsf_cd() + "]");
		System.out.println("dtls_clsf_cd = [" + getDtls_clsf_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dept_frcd = [" + getDept_frcd() + "]");
		System.out.println("dept_tocd = [" + getDept_tocd() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("sort = [" + getSort() + "]");
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
String budg_frym = req.getParameter("budg_frym");
if( budg_frym == null){
	System.out.println(this.toString+" : budg_frym is null" );
}else{
	System.out.println(this.toString+" : budg_frym is "+budg_frym );
}
String budg_toym = req.getParameter("budg_toym");
if( budg_toym == null){
	System.out.println(this.toString+" : budg_toym is null" );
}else{
	System.out.println(this.toString+" : budg_toym is "+budg_toym );
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dept_frcd = req.getParameter("dept_frcd");
if( dept_frcd == null){
	System.out.println(this.toString+" : dept_frcd is null" );
}else{
	System.out.println(this.toString+" : dept_frcd is "+dept_frcd );
}
String dept_tocd = req.getParameter("dept_tocd");
if( dept_tocd == null){
	System.out.println(this.toString+" : dept_tocd is null" );
}else{
	System.out.println(this.toString+" : dept_tocd is "+dept_tocd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String sort = req.getParameter("sort");
if( sort == null){
	System.out.println(this.toString+" : sort is null" );
}else{
	System.out.println(this.toString+" : sort is "+sort );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_frym = Util.checkString(req.getParameter("budg_frym"));
String budg_toym = Util.checkString(req.getParameter("budg_toym"));
String job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
String dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dept_frcd = Util.checkString(req.getParameter("dept_frcd"));
String dept_tocd = Util.checkString(req.getParameter("dept_tocd"));
String tms = Util.checkString(req.getParameter("tms"));
String sort = Util.checkString(req.getParameter("sort"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_frym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_frym")));
String budg_toym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_toym")));
String job_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf_cd")));
String dtls_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_clsf_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dept_frcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_frcd")));
String dept_tocd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_tocd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String sort = Util.Uni2Ksc(Util.checkString(req.getParameter("sort")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_frym(budg_frym);
dm.setBudg_toym(budg_toym);
dm.setJob_clsf_cd(job_clsf_cd);
dm.setDtls_clsf_cd(dtls_clsf_cd);
dm.setMedi_cd(medi_cd);
dm.setDept_frcd(dept_frcd);
dm.setDept_tocd(dept_tocd);
dm.setTms(tms);
dm.setSort(sort);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 10:53:56 KST 2009 */