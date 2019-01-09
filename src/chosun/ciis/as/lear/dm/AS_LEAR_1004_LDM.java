/***************************************************************************************************
* 파일명 : .java
* 기능 : 자산-임대사업-임대사업조회
* 작성일자 : 2009-10-09
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.lear.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.ds.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 자산-임대사업-임대사업조회
 */


public class AS_LEAR_1004_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_f;
	public String occr_dt_t;
	public String cntr_no;
	public String bldg_cd;
	public String hire_dlco_ern;

	public AS_LEAR_1004_LDM(){}
	public AS_LEAR_1004_LDM(String cmpy_cd, String occr_dt_f, String occr_dt_t, String cntr_no, String bldg_cd, String hire_dlco_ern){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_f = occr_dt_f;
		this.occr_dt_t = occr_dt_t;
		this.cntr_no = cntr_no;
		this.bldg_cd = bldg_cd;
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt_f(String occr_dt_f){
		this.occr_dt_f = occr_dt_f;
	}

	public void setOccr_dt_t(String occr_dt_t){
		this.occr_dt_t = occr_dt_t;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt_f(){
		return this.occr_dt_f;
	}

	public String getOccr_dt_t(){
		return this.occr_dt_t;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAR_1004_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAR_1004_LDM dm = (AS_LEAR_1004_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_f);
		cstmt.setString(5, dm.occr_dt_t);
		cstmt.setString(6, dm.cntr_no);
		cstmt.setString(7, dm.bldg_cd);
		cstmt.setString(8, dm.hire_dlco_ern);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.lear.ds.AS_LEAR_1004_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt_f = [" + getOccr_dt_f() + "]");
		System.out.println("occr_dt_t = [" + getOccr_dt_t() + "]");
		System.out.println("cntr_no = [" + getCntr_no() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("hire_dlco_ern = [" + getHire_dlco_ern() + "]");
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
String occr_dt_f = req.getParameter("occr_dt_f");
if( occr_dt_f == null){
	System.out.println(this.toString+" : occr_dt_f is null" );
}else{
	System.out.println(this.toString+" : occr_dt_f is "+occr_dt_f );
}
String occr_dt_t = req.getParameter("occr_dt_t");
if( occr_dt_t == null){
	System.out.println(this.toString+" : occr_dt_t is null" );
}else{
	System.out.println(this.toString+" : occr_dt_t is "+occr_dt_t );
}
String cntr_no = req.getParameter("cntr_no");
if( cntr_no == null){
	System.out.println(this.toString+" : cntr_no is null" );
}else{
	System.out.println(this.toString+" : cntr_no is "+cntr_no );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt_f = Util.checkString(req.getParameter("occr_dt_f"));
String occr_dt_t = Util.checkString(req.getParameter("occr_dt_t"));
String cntr_no = Util.checkString(req.getParameter("cntr_no"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_f = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_f")));
String occr_dt_t = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_t")));
String cntr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_no")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String hire_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("hire_dlco_ern")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_f(occr_dt_f);
dm.setOccr_dt_t(occr_dt_t);
dm.setCntr_no(cntr_no);
dm.setBldg_cd(bldg_cd);
dm.setHire_dlco_ern(hire_dlco_ern);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 09 11:56:50 KST 2009 */