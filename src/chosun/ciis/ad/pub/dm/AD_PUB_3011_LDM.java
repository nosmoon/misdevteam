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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String line_advt_yn;
	public String nwsp_advt_yn;
	public String self_advt_yn;
	public String grp_cmpy;
	public String indt_clsf_1;
	public String indt_clsf_2;
	public String type_clsf_1;
	public String type_clsf_2;
	public String dlco_clsf;
	public String dlco_no;
	public String slcrg_pers;
	public String mchrg_pers;
	public String emp_no;
	public String ilbo_total;

	public AD_PUB_3011_LDM(){}
	public AD_PUB_3011_LDM(String cmpy_cd, String medi_clsf, String medi_cd, String frdt, String todt, String line_advt_yn, String nwsp_advt_yn, String self_advt_yn, String grp_cmpy, String indt_clsf_1, String indt_clsf_2, String type_clsf_1, String type_clsf_2, String dlco_clsf, String dlco_no, String slcrg_pers, String mchrg_pers, String emp_no, String ilbo_total){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.line_advt_yn = line_advt_yn;
		this.nwsp_advt_yn = nwsp_advt_yn;
		this.self_advt_yn = self_advt_yn;
		this.grp_cmpy = grp_cmpy;
		this.indt_clsf_1 = indt_clsf_1;
		this.indt_clsf_2 = indt_clsf_2;
		this.type_clsf_1 = type_clsf_1;
		this.type_clsf_2 = type_clsf_2;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.emp_no = emp_no;
		this.ilbo_total = ilbo_total;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setLine_advt_yn(String line_advt_yn){
		this.line_advt_yn = line_advt_yn;
	}

	public void setNwsp_advt_yn(String nwsp_advt_yn){
		this.nwsp_advt_yn = nwsp_advt_yn;
	}

	public void setSelf_advt_yn(String self_advt_yn){
		this.self_advt_yn = self_advt_yn;
	}

	public void setGrp_cmpy(String grp_cmpy){
		this.grp_cmpy = grp_cmpy;
	}

	public void setIndt_clsf_1(String indt_clsf_1){
		this.indt_clsf_1 = indt_clsf_1;
	}

	public void setIndt_clsf_2(String indt_clsf_2){
		this.indt_clsf_2 = indt_clsf_2;
	}

	public void setType_clsf_1(String type_clsf_1){
		this.type_clsf_1 = type_clsf_1;
	}

	public void setType_clsf_2(String type_clsf_2){
		this.type_clsf_2 = type_clsf_2;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIlbo_total(String ilbo_total){
		this.ilbo_total = ilbo_total;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getLine_advt_yn(){
		return this.line_advt_yn;
	}

	public String getNwsp_advt_yn(){
		return this.nwsp_advt_yn;
	}

	public String getSelf_advt_yn(){
		return this.self_advt_yn;
	}

	public String getGrp_cmpy(){
		return this.grp_cmpy;
	}

	public String getIndt_clsf_1(){
		return this.indt_clsf_1;
	}

	public String getIndt_clsf_2(){
		return this.indt_clsf_2;
	}

	public String getType_clsf_1(){
		return this.type_clsf_1;
	}

	public String getType_clsf_2(){
		return this.type_clsf_2;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIlbo_total(){
		return this.ilbo_total;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3011_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3011_LDM dm = (AD_PUB_3011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.line_advt_yn);
		cstmt.setString(9, dm.nwsp_advt_yn);
		cstmt.setString(10, dm.self_advt_yn);
		cstmt.setString(11, dm.grp_cmpy);
		cstmt.setString(12, dm.indt_clsf_1);
		cstmt.setString(13, dm.indt_clsf_2);
		cstmt.setString(14, dm.type_clsf_1);
		cstmt.setString(15, dm.type_clsf_2);
		cstmt.setString(16, dm.dlco_clsf);
		cstmt.setString(17, dm.dlco_no);
		cstmt.setString(18, dm.slcrg_pers);
		cstmt.setString(19, dm.mchrg_pers);
		cstmt.setString(20, dm.emp_no);
		cstmt.setString(21, dm.ilbo_total);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3011_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("line_advt_yn = [" + getLine_advt_yn() + "]");
		System.out.println("nwsp_advt_yn = [" + getNwsp_advt_yn() + "]");
		System.out.println("self_advt_yn = [" + getSelf_advt_yn() + "]");
		System.out.println("grp_cmpy = [" + getGrp_cmpy() + "]");
		System.out.println("indt_clsf_1 = [" + getIndt_clsf_1() + "]");
		System.out.println("indt_clsf_2 = [" + getIndt_clsf_2() + "]");
		System.out.println("type_clsf_1 = [" + getType_clsf_1() + "]");
		System.out.println("type_clsf_2 = [" + getType_clsf_2() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("ilbo_total = [" + getIlbo_total() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
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
String line_advt_yn = req.getParameter("line_advt_yn");
if( line_advt_yn == null){
	System.out.println(this.toString+" : line_advt_yn is null" );
}else{
	System.out.println(this.toString+" : line_advt_yn is "+line_advt_yn );
}
String nwsp_advt_yn = req.getParameter("nwsp_advt_yn");
if( nwsp_advt_yn == null){
	System.out.println(this.toString+" : nwsp_advt_yn is null" );
}else{
	System.out.println(this.toString+" : nwsp_advt_yn is "+nwsp_advt_yn );
}
String self_advt_yn = req.getParameter("self_advt_yn");
if( self_advt_yn == null){
	System.out.println(this.toString+" : self_advt_yn is null" );
}else{
	System.out.println(this.toString+" : self_advt_yn is "+self_advt_yn );
}
String grp_cmpy = req.getParameter("grp_cmpy");
if( grp_cmpy == null){
	System.out.println(this.toString+" : grp_cmpy is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy is "+grp_cmpy );
}
String indt_clsf_1 = req.getParameter("indt_clsf_1");
if( indt_clsf_1 == null){
	System.out.println(this.toString+" : indt_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : indt_clsf_1 is "+indt_clsf_1 );
}
String indt_clsf_2 = req.getParameter("indt_clsf_2");
if( indt_clsf_2 == null){
	System.out.println(this.toString+" : indt_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : indt_clsf_2 is "+indt_clsf_2 );
}
String type_clsf_1 = req.getParameter("type_clsf_1");
if( type_clsf_1 == null){
	System.out.println(this.toString+" : type_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : type_clsf_1 is "+type_clsf_1 );
}
String type_clsf_2 = req.getParameter("type_clsf_2");
if( type_clsf_2 == null){
	System.out.println(this.toString+" : type_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : type_clsf_2 is "+type_clsf_2 );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String ilbo_total = req.getParameter("ilbo_total");
if( ilbo_total == null){
	System.out.println(this.toString+" : ilbo_total is null" );
}else{
	System.out.println(this.toString+" : ilbo_total is "+ilbo_total );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String line_advt_yn = Util.checkString(req.getParameter("line_advt_yn"));
String nwsp_advt_yn = Util.checkString(req.getParameter("nwsp_advt_yn"));
String self_advt_yn = Util.checkString(req.getParameter("self_advt_yn"));
String grp_cmpy = Util.checkString(req.getParameter("grp_cmpy"));
String indt_clsf_1 = Util.checkString(req.getParameter("indt_clsf_1"));
String indt_clsf_2 = Util.checkString(req.getParameter("indt_clsf_2"));
String type_clsf_1 = Util.checkString(req.getParameter("type_clsf_1"));
String type_clsf_2 = Util.checkString(req.getParameter("type_clsf_2"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String ilbo_total = Util.checkString(req.getParameter("ilbo_total"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String line_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("line_advt_yn")));
String nwsp_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_advt_yn")));
String self_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("self_advt_yn")));
String grp_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy")));
String indt_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf_1")));
String indt_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf_2")));
String type_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf_1")));
String type_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf_2")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String ilbo_total = Util.Uni2Ksc(Util.checkString(req.getParameter("ilbo_total")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setLine_advt_yn(line_advt_yn);
dm.setNwsp_advt_yn(nwsp_advt_yn);
dm.setSelf_advt_yn(self_advt_yn);
dm.setGrp_cmpy(grp_cmpy);
dm.setIndt_clsf_1(indt_clsf_1);
dm.setIndt_clsf_2(indt_clsf_2);
dm.setType_clsf_1(type_clsf_1);
dm.setType_clsf_2(type_clsf_2);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_no(dlco_no);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setEmp_no(emp_no);
dm.setIlbo_total(ilbo_total);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 22 17:48:42 KST 2012 */