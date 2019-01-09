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


public class AD_PUB_1851_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String select_dt;
	public String frdt;
	public String todt;
	public String misu;
	public String jikgulae;
	public String hndl_clsf;
	public String dlco_no;
	public String slcrg_pers;
	public String mchrg_pers;
	public String indt_clsf;
	public String acct_cd;
	public String emp_no;
	public String pubc_clsf;
	public String rslt_dept;
	public String medialeb_yn;
	public String chcode;

	public AD_PUB_1851_LDM(){}
	public AD_PUB_1851_LDM(String cmpy_cd, String medi_cd, String select_dt, String frdt, String todt, String misu, String jikgulae, String hndl_clsf, String dlco_no, String slcrg_pers, String mchrg_pers, String indt_clsf, String acct_cd, String emp_no, String pubc_clsf, String rslt_dept, String medialeb_yn, String chcode){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.select_dt = select_dt;
		this.frdt = frdt;
		this.todt = todt;
		this.misu = misu;
		this.jikgulae = jikgulae;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.indt_clsf = indt_clsf;
		this.acct_cd = acct_cd;
		this.emp_no = emp_no;
		this.pubc_clsf = pubc_clsf;
		this.rslt_dept = rslt_dept;
		this.medialeb_yn = medialeb_yn;
		this.chcode = chcode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSelect_dt(String select_dt){
		this.select_dt = select_dt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setMisu(String misu){
		this.misu = misu;
	}

	public void setJikgulae(String jikgulae){
		this.jikgulae = jikgulae;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
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

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public void setRslt_dept(String rslt_dept){
		this.rslt_dept = rslt_dept;
	}

	public void setMedialeb_yn(String medialeb_yn){
		this.medialeb_yn = medialeb_yn;
	}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSelect_dt(){
		return this.select_dt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getMisu(){
		return this.misu;
	}

	public String getJikgulae(){
		return this.jikgulae;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
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

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}

	public String getRslt_dept(){
		return this.rslt_dept;
	}

	public String getMedialeb_yn(){
		return this.medialeb_yn;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_1851_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1851_LDM dm = (AD_PUB_1851_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.select_dt);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.misu);
		cstmt.setString(9, dm.jikgulae);
		cstmt.setString(10, dm.hndl_clsf);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.slcrg_pers);
		cstmt.setString(13, dm.mchrg_pers);
		cstmt.setString(14, dm.indt_clsf);
		cstmt.setString(15, dm.acct_cd);
		cstmt.setString(16, dm.emp_no);
		cstmt.setString(17, dm.pubc_clsf);
		cstmt.setString(18, dm.rslt_dept);
		cstmt.setString(19, dm.medialeb_yn);
		cstmt.setString(20, dm.chcode);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1851_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("select_dt = [" + getSelect_dt() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("misu = [" + getMisu() + "]");
		System.out.println("jikgulae = [" + getJikgulae() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("indt_clsf = [" + getIndt_clsf() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("pubc_clsf = [" + getPubc_clsf() + "]");
		System.out.println("rslt_dept = [" + getRslt_dept() + "]");
		System.out.println("medialeb_yn = [" + getMedialeb_yn() + "]");
		System.out.println("chcode = [" + getChcode() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String select_dt = req.getParameter("select_dt");
if( select_dt == null){
	System.out.println(this.toString+" : select_dt is null" );
}else{
	System.out.println(this.toString+" : select_dt is "+select_dt );
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
String misu = req.getParameter("misu");
if( misu == null){
	System.out.println(this.toString+" : misu is null" );
}else{
	System.out.println(this.toString+" : misu is "+misu );
}
String jikgulae = req.getParameter("jikgulae");
if( jikgulae == null){
	System.out.println(this.toString+" : jikgulae is null" );
}else{
	System.out.println(this.toString+" : jikgulae is "+jikgulae );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
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
String indt_clsf = req.getParameter("indt_clsf");
if( indt_clsf == null){
	System.out.println(this.toString+" : indt_clsf is null" );
}else{
	System.out.println(this.toString+" : indt_clsf is "+indt_clsf );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String pubc_clsf = req.getParameter("pubc_clsf");
if( pubc_clsf == null){
	System.out.println(this.toString+" : pubc_clsf is null" );
}else{
	System.out.println(this.toString+" : pubc_clsf is "+pubc_clsf );
}
String rslt_dept = req.getParameter("rslt_dept");
if( rslt_dept == null){
	System.out.println(this.toString+" : rslt_dept is null" );
}else{
	System.out.println(this.toString+" : rslt_dept is "+rslt_dept );
}
String medialeb_yn = req.getParameter("medialeb_yn");
if( medialeb_yn == null){
	System.out.println(this.toString+" : medialeb_yn is null" );
}else{
	System.out.println(this.toString+" : medialeb_yn is "+medialeb_yn );
}
String chcode = req.getParameter("chcode");
if( chcode == null){
	System.out.println(this.toString+" : chcode is null" );
}else{
	System.out.println(this.toString+" : chcode is "+chcode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String select_dt = Util.checkString(req.getParameter("select_dt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String misu = Util.checkString(req.getParameter("misu"));
String jikgulae = Util.checkString(req.getParameter("jikgulae"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
String rslt_dept = Util.checkString(req.getParameter("rslt_dept"));
String medialeb_yn = Util.checkString(req.getParameter("medialeb_yn"));
String chcode = Util.checkString(req.getParameter("chcode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String select_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("select_dt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String misu = Util.Uni2Ksc(Util.checkString(req.getParameter("misu")));
String jikgulae = Util.Uni2Ksc(Util.checkString(req.getParameter("jikgulae")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String pubc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_clsf")));
String rslt_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("rslt_dept")));
String medialeb_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("medialeb_yn")));
String chcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chcode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setSelect_dt(select_dt);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setMisu(misu);
dm.setJikgulae(jikgulae);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setIndt_clsf(indt_clsf);
dm.setAcct_cd(acct_cd);
dm.setEmp_no(emp_no);
dm.setPubc_clsf(pubc_clsf);
dm.setRslt_dept(rslt_dept);
dm.setMedialeb_yn(medialeb_yn);
dm.setChcode(chcode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 03 14:39:41 KST 2015 */