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


package chosun.ciis.ad.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.ds.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_2410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_cd;
	public String medi_cd;
	public String note_clsf_cd;
	public String dlco_no;
	public String frdt;
	public String todt;
	public String note_no;
	public String issu_pers_nm;
	public String mtry_dt;

	public AD_DEP_2410_LDM(){}
	public AD_DEP_2410_LDM(String cmpy_cd, String rcpm_cd, String medi_cd, String note_clsf_cd, String dlco_no, String frdt, String todt, String note_no, String issu_pers_nm, String mtry_dt){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_cd = rcpm_cd;
		this.medi_cd = medi_cd;
		this.note_clsf_cd = note_clsf_cd;
		this.dlco_no = dlco_no;
		this.frdt = frdt;
		this.todt = todt;
		this.note_no = note_no;
		this.issu_pers_nm = issu_pers_nm;
		this.mtry_dt = mtry_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_cd(String rcpm_cd){
		this.rcpm_cd = rcpm_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_cd(){
		return this.rcpm_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_2410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_2410_LDM dm = (AD_DEP_2410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.note_clsf_cd);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.note_no);
		cstmt.setString(11, dm.issu_pers_nm);
		cstmt.setString(12, dm.mtry_dt);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_2410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpm_cd = [" + getRcpm_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("issu_pers_nm = [" + getIssu_pers_nm() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
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
String rcpm_cd = req.getParameter("rcpm_cd");
if( rcpm_cd == null){
	System.out.println(this.toString+" : rcpm_cd is null" );
}else{
	System.out.println(this.toString+" : rcpm_cd is "+rcpm_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String issu_pers_nm = req.getParameter("issu_pers_nm");
if( issu_pers_nm == null){
	System.out.println(this.toString+" : issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : issu_pers_nm is "+issu_pers_nm );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_cd = Util.checkString(req.getParameter("rcpm_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String note_no = Util.checkString(req.getParameter("note_no"));
String issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_nm")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_cd(rcpm_cd);
dm.setMedi_cd(medi_cd);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setDlco_no(dlco_no);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setNote_no(note_no);
dm.setIssu_pers_nm(issu_pers_nm);
dm.setMtry_dt(mtry_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 20 14:44:07 KST 2014 */