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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4451_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String emp_no;
	public String medi_cd;
	public String date_clsf;
	public String frdt;
	public String todt;
	public String rcpm_plac_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String rcpm_clsf;
	public String note_clsf;
	public String mchrg_pers;
	public String mchrg_pers_nm;

	public AD_NMD_4451_LDM(){}
	public AD_NMD_4451_LDM(String cmpy_cd, String medi_clsf, String emp_no, String medi_cd, String date_clsf, String frdt, String todt, String rcpm_plac_clsf, String dlco_no, String dlco_nm, String rcpm_clsf, String note_clsf, String mchrg_pers, String mchrg_pers_nm){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.emp_no = emp_no;
		this.medi_cd = medi_cd;
		this.date_clsf = date_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.rcpm_plac_clsf = rcpm_plac_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.rcpm_clsf = rcpm_clsf;
		this.note_clsf = note_clsf;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDate_clsf(String date_clsf){
		this.date_clsf = date_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRcpm_plac_clsf(String rcpm_plac_clsf){
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setNote_clsf(String note_clsf){
		this.note_clsf = note_clsf;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDate_clsf(){
		return this.date_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRcpm_plac_clsf(){
		return this.rcpm_plac_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getNote_clsf(){
		return this.note_clsf;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_4451_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_4451_LDM dm = (AD_NMD_4451_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.date_clsf);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.rcpm_plac_clsf);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.dlco_nm);
		cstmt.setString(13, dm.rcpm_clsf);
		cstmt.setString(14, dm.note_clsf);
		cstmt.setString(15, dm.mchrg_pers);
		cstmt.setString(16, dm.mchrg_pers_nm);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_4451_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("date_clsf = [" + getDate_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("rcpm_plac_clsf = [" + getRcpm_plac_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("rcpm_clsf = [" + getRcpm_clsf() + "]");
		System.out.println("note_clsf = [" + getNote_clsf() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("mchrg_pers_nm = [" + getMchrg_pers_nm() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String date_clsf = req.getParameter("date_clsf");
if( date_clsf == null){
	System.out.println(this.toString+" : date_clsf is null" );
}else{
	System.out.println(this.toString+" : date_clsf is "+date_clsf );
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
String rcpm_plac_clsf = req.getParameter("rcpm_plac_clsf");
if( rcpm_plac_clsf == null){
	System.out.println(this.toString+" : rcpm_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_plac_clsf is "+rcpm_plac_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String rcpm_clsf = req.getParameter("rcpm_clsf");
if( rcpm_clsf == null){
	System.out.println(this.toString+" : rcpm_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_clsf is "+rcpm_clsf );
}
String note_clsf = req.getParameter("note_clsf");
if( note_clsf == null){
	System.out.println(this.toString+" : note_clsf is null" );
}else{
	System.out.println(this.toString+" : note_clsf is "+note_clsf );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String mchrg_pers_nm = req.getParameter("mchrg_pers_nm");
if( mchrg_pers_nm == null){
	System.out.println(this.toString+" : mchrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers_nm is "+mchrg_pers_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String date_clsf = Util.checkString(req.getParameter("date_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String rcpm_plac_clsf = Util.checkString(req.getParameter("rcpm_plac_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
String note_clsf = Util.checkString(req.getParameter("note_clsf"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String mchrg_pers_nm = Util.checkString(req.getParameter("mchrg_pers_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String date_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("date_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String rcpm_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_plac_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String rcpm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_clsf")));
String note_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String mchrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setEmp_no(emp_no);
dm.setMedi_cd(medi_cd);
dm.setDate_clsf(date_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setRcpm_plac_clsf(rcpm_plac_clsf);
dm.setDlco_no(dlco_no);
dm.setDlco_nm(dlco_nm);
dm.setRcpm_clsf(rcpm_clsf);
dm.setNote_clsf(note_clsf);
dm.setMchrg_pers(mchrg_pers);
dm.setMchrg_pers_nm(mchrg_pers_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 05 10:55:11 KST 2014 */