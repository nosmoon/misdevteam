/***************************************************************************************************
* 파일명 : .java
* 기능 :  자산 - 임대사업 - 임대계약관리
* 작성일자 : 2010-08-13
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 임대인 연락처  및 미수정보 추가 
* 수정자 : 노상현
* 수정일자 : 2011-03-29
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
 * 재무회계 - 부가세관리 - 세금계산서 조회
 */


public class AS_LEAS_1102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_star;
	public String bldg_cd;
	public String cntr_no;
	public String hire_dlco_nm;
	public String hire_dlco_ern;
	public String leas_fr_dt_1;
	public String leas_fr_dt_2;
	public String leas_to_dt_1;
	public String leas_to_dt_2;
	public String cntr_yy;
	public String cntr_seq;

	public AS_LEAS_1102_LDM(){}
	public AS_LEAS_1102_LDM(String cmpy_cd, String cntr_star, String bldg_cd, String cntr_no, String hire_dlco_nm, String hire_dlco_ern, String leas_fr_dt_1, String leas_fr_dt_2, String leas_to_dt_1, String leas_to_dt_2, String cntr_yy, String cntr_seq){
		this.cmpy_cd = cmpy_cd;
		this.cntr_star = cntr_star;
		this.bldg_cd = bldg_cd;
		this.cntr_no = cntr_no;
		this.hire_dlco_nm = hire_dlco_nm;
		this.hire_dlco_ern = hire_dlco_ern;
		this.leas_fr_dt_1 = leas_fr_dt_1;
		this.leas_fr_dt_2 = leas_fr_dt_2;
		this.leas_to_dt_1 = leas_to_dt_1;
		this.leas_to_dt_2 = leas_to_dt_2;
		this.cntr_yy = cntr_yy;
		this.cntr_seq = cntr_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCntr_star(String cntr_star){
		this.cntr_star = cntr_star;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setLeas_fr_dt_1(String leas_fr_dt_1){
		this.leas_fr_dt_1 = leas_fr_dt_1;
	}

	public void setLeas_fr_dt_2(String leas_fr_dt_2){
		this.leas_fr_dt_2 = leas_fr_dt_2;
	}

	public void setLeas_to_dt_1(String leas_to_dt_1){
		this.leas_to_dt_1 = leas_to_dt_1;
	}

	public void setLeas_to_dt_2(String leas_to_dt_2){
		this.leas_to_dt_2 = leas_to_dt_2;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCntr_star(){
		return this.cntr_star;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getLeas_fr_dt_1(){
		return this.leas_fr_dt_1;
	}

	public String getLeas_fr_dt_2(){
		return this.leas_fr_dt_2;
	}

	public String getLeas_to_dt_1(){
		return this.leas_to_dt_1;
	}

	public String getLeas_to_dt_2(){
		return this.leas_to_dt_2;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1102_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1102_LDM dm = (AS_LEAS_1102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cntr_star);
		cstmt.setString(5, dm.bldg_cd);
		cstmt.setString(6, dm.cntr_no);
		cstmt.setString(7, dm.hire_dlco_nm);
		cstmt.setString(8, dm.hire_dlco_ern);
		cstmt.setString(9, dm.leas_fr_dt_1);
		cstmt.setString(10, dm.leas_fr_dt_2);
		cstmt.setString(11, dm.leas_to_dt_1);
		cstmt.setString(12, dm.leas_to_dt_2);
		cstmt.setString(13, dm.cntr_yy);
		cstmt.setString(14, dm.cntr_seq);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1102_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cntr_star = [" + getCntr_star() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("cntr_no = [" + getCntr_no() + "]");
		System.out.println("hire_dlco_nm = [" + getHire_dlco_nm() + "]");
		System.out.println("hire_dlco_ern = [" + getHire_dlco_ern() + "]");
		System.out.println("leas_fr_dt_1 = [" + getLeas_fr_dt_1() + "]");
		System.out.println("leas_fr_dt_2 = [" + getLeas_fr_dt_2() + "]");
		System.out.println("leas_to_dt_1 = [" + getLeas_to_dt_1() + "]");
		System.out.println("leas_to_dt_2 = [" + getLeas_to_dt_2() + "]");
		System.out.println("cntr_yy = [" + getCntr_yy() + "]");
		System.out.println("cntr_seq = [" + getCntr_seq() + "]");
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
String cntr_star = req.getParameter("cntr_star");
if( cntr_star == null){
	System.out.println(this.toString+" : cntr_star is null" );
}else{
	System.out.println(this.toString+" : cntr_star is "+cntr_star );
}
String bldg_cd = req.getParameter("bldg_cd");
if( bldg_cd == null){
	System.out.println(this.toString+" : bldg_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_cd is "+bldg_cd );
}
String cntr_no = req.getParameter("cntr_no");
if( cntr_no == null){
	System.out.println(this.toString+" : cntr_no is null" );
}else{
	System.out.println(this.toString+" : cntr_no is "+cntr_no );
}
String hire_dlco_nm = req.getParameter("hire_dlco_nm");
if( hire_dlco_nm == null){
	System.out.println(this.toString+" : hire_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : hire_dlco_nm is "+hire_dlco_nm );
}
String hire_dlco_ern = req.getParameter("hire_dlco_ern");
if( hire_dlco_ern == null){
	System.out.println(this.toString+" : hire_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : hire_dlco_ern is "+hire_dlco_ern );
}
String leas_fr_dt_1 = req.getParameter("leas_fr_dt_1");
if( leas_fr_dt_1 == null){
	System.out.println(this.toString+" : leas_fr_dt_1 is null" );
}else{
	System.out.println(this.toString+" : leas_fr_dt_1 is "+leas_fr_dt_1 );
}
String leas_fr_dt_2 = req.getParameter("leas_fr_dt_2");
if( leas_fr_dt_2 == null){
	System.out.println(this.toString+" : leas_fr_dt_2 is null" );
}else{
	System.out.println(this.toString+" : leas_fr_dt_2 is "+leas_fr_dt_2 );
}
String leas_to_dt_1 = req.getParameter("leas_to_dt_1");
if( leas_to_dt_1 == null){
	System.out.println(this.toString+" : leas_to_dt_1 is null" );
}else{
	System.out.println(this.toString+" : leas_to_dt_1 is "+leas_to_dt_1 );
}
String leas_to_dt_2 = req.getParameter("leas_to_dt_2");
if( leas_to_dt_2 == null){
	System.out.println(this.toString+" : leas_to_dt_2 is null" );
}else{
	System.out.println(this.toString+" : leas_to_dt_2 is "+leas_to_dt_2 );
}
String cntr_yy = req.getParameter("cntr_yy");
if( cntr_yy == null){
	System.out.println(this.toString+" : cntr_yy is null" );
}else{
	System.out.println(this.toString+" : cntr_yy is "+cntr_yy );
}
String cntr_seq = req.getParameter("cntr_seq");
if( cntr_seq == null){
	System.out.println(this.toString+" : cntr_seq is null" );
}else{
	System.out.println(this.toString+" : cntr_seq is "+cntr_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cntr_star = Util.checkString(req.getParameter("cntr_star"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String cntr_no = Util.checkString(req.getParameter("cntr_no"));
String hire_dlco_nm = Util.checkString(req.getParameter("hire_dlco_nm"));
String hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
String leas_fr_dt_1 = Util.checkString(req.getParameter("leas_fr_dt_1"));
String leas_fr_dt_2 = Util.checkString(req.getParameter("leas_fr_dt_2"));
String leas_to_dt_1 = Util.checkString(req.getParameter("leas_to_dt_1"));
String leas_to_dt_2 = Util.checkString(req.getParameter("leas_to_dt_2"));
String cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
String cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cntr_star = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_star")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String cntr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_no")));
String hire_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("hire_dlco_nm")));
String hire_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("hire_dlco_ern")));
String leas_fr_dt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_fr_dt_1")));
String leas_fr_dt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_fr_dt_2")));
String leas_to_dt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_to_dt_1")));
String leas_to_dt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_to_dt_2")));
String cntr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_yy")));
String cntr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCntr_star(cntr_star);
dm.setBldg_cd(bldg_cd);
dm.setCntr_no(cntr_no);
dm.setHire_dlco_nm(hire_dlco_nm);
dm.setHire_dlco_ern(hire_dlco_ern);
dm.setLeas_fr_dt_1(leas_fr_dt_1);
dm.setLeas_fr_dt_2(leas_fr_dt_2);
dm.setLeas_to_dt_1(leas_to_dt_1);
dm.setLeas_to_dt_2(leas_to_dt_2);
dm.setCntr_yy(cntr_yy);
dm.setCntr_seq(cntr_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 29 11:38:47 KST 2011 */