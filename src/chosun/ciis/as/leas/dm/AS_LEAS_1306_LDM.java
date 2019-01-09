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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1306_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String job_clsf;
	public String bldg_cd;
	public String hire_dlco_ern;
	public String cntr_no;
	public String cntr_star;

	public AS_LEAS_1306_LDM(){}
	public AS_LEAS_1306_LDM(String cmpy_cd, String job_clsf, String bldg_cd, String hire_dlco_ern, String cntr_no, String cntr_star){
		this.cmpy_cd = cmpy_cd;
		this.job_clsf = job_clsf;
		this.bldg_cd = bldg_cd;
		this.hire_dlco_ern = hire_dlco_ern;
		this.cntr_no = cntr_no;
		this.cntr_star = cntr_star;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setCntr_star(String cntr_star){
		this.cntr_star = cntr_star;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getCntr_star(){
		return this.cntr_star;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1306_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1306_LDM dm = (AS_LEAS_1306_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.job_clsf);
		cstmt.setString(5, dm.bldg_cd);
		cstmt.setString(6, dm.hire_dlco_ern);
		cstmt.setString(7, dm.cntr_no);
		cstmt.setString(8, dm.cntr_star);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1306_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("hire_dlco_ern = [" + getHire_dlco_ern() + "]");
		System.out.println("cntr_no = [" + getCntr_no() + "]");
		System.out.println("cntr_star = [" + getCntr_star() + "]");
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String bldg_cd = req.getParameter("bldg_cd");
if( bldg_cd == null){
	System.out.println(this.toString+" : bldg_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_cd is "+bldg_cd );
}
String hire_dlco_ern = req.getParameter("hire_dlco_ern");
if( hire_dlco_ern == null){
	System.out.println(this.toString+" : hire_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : hire_dlco_ern is "+hire_dlco_ern );
}
String cntr_no = req.getParameter("cntr_no");
if( cntr_no == null){
	System.out.println(this.toString+" : cntr_no is null" );
}else{
	System.out.println(this.toString+" : cntr_no is "+cntr_no );
}
String cntr_star = req.getParameter("cntr_star");
if( cntr_star == null){
	System.out.println(this.toString+" : cntr_star is null" );
}else{
	System.out.println(this.toString+" : cntr_star is "+cntr_star );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
String cntr_no = Util.checkString(req.getParameter("cntr_no"));
String cntr_star = Util.checkString(req.getParameter("cntr_star"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String hire_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("hire_dlco_ern")));
String cntr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_no")));
String cntr_star = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_star")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setBldg_cd(bldg_cd);
dm.setHire_dlco_ern(hire_dlco_ern);
dm.setCntr_no(cntr_no);
dm.setCntr_star(cntr_star);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 14:31:40 KST 2009 */