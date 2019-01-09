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


public class AD_PUB_1810_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String select_dt;
	public String frdt;
	public String todt;
	public String misu;
	public String jikgulae;
	public String hndl_clsf;
	public String dlco_no;
	public String sect_clsf_cd;
	public String sect_nm_cd;
	public String slcrg_pers;
	public String mchrg_pers;
	public String cslcrg_pers;
	public String indt_clsf;
	public String acct_cd;
	public String emp_no;
	public String pragn_yn;
	public String pre_issu_yn;

	public AD_PUB_1810_LDM(){}
	public AD_PUB_1810_LDM(String cmpy_cd, String medi_cd, String select_dt, String frdt, String todt, String misu, String jikgulae, String hndl_clsf, String dlco_no, String sect_clsf_cd, String sect_nm_cd, String slcrg_pers, String mchrg_pers, String cslcrg_pers, String indt_clsf, String acct_cd, String emp_no, String pragn_yn, String pre_issu_yn){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.select_dt = select_dt;
		this.frdt = frdt;
		this.todt = todt;
		this.misu = misu;
		this.jikgulae = jikgulae;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.sect_clsf_cd = sect_clsf_cd;
		this.sect_nm_cd = sect_nm_cd;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.cslcrg_pers = cslcrg_pers;
		this.indt_clsf = indt_clsf;
		this.acct_cd = acct_cd;
		this.emp_no = emp_no;
		this.pragn_yn = pragn_yn;
		this.pre_issu_yn = pre_issu_yn;
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

	public void setSect_clsf_cd(String sect_clsf_cd){
		this.sect_clsf_cd = sect_clsf_cd;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setCslcrg_pers(String cslcrg_pers){
		this.cslcrg_pers = cslcrg_pers;
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

	public void setPragn_yn(String pragn_yn){
		this.pragn_yn = pragn_yn;
	}

	public void setPre_issu_yn(String pre_issu_yn){
		this.pre_issu_yn = pre_issu_yn;
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

	public String getSect_clsf_cd(){
		return this.sect_clsf_cd;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getCslcrg_pers(){
		return this.cslcrg_pers;
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

	public String getPragn_yn(){
		return this.pragn_yn;
	}

	public String getPre_issu_yn(){
		return this.pre_issu_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_1810_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1810_LDM dm = (AD_PUB_1810_LDM)bdm;
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
		cstmt.setString(12, dm.sect_clsf_cd);
		cstmt.setString(13, dm.sect_nm_cd);
		cstmt.setString(14, dm.slcrg_pers);
		cstmt.setString(15, dm.mchrg_pers);
		cstmt.setString(16, dm.cslcrg_pers);
		cstmt.setString(17, dm.indt_clsf);
		cstmt.setString(18, dm.acct_cd);
		cstmt.setString(19, dm.emp_no);
		cstmt.setString(20, dm.pragn_yn);
		cstmt.setString(21, dm.pre_issu_yn);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1810_LDataSet();
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
		System.out.println("sect_clsf_cd = [" + getSect_clsf_cd() + "]");
		System.out.println("sect_nm_cd = [" + getSect_nm_cd() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("cslcrg_pers = [" + getCslcrg_pers() + "]");
		System.out.println("indt_clsf = [" + getIndt_clsf() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("pragn_yn = [" + getPragn_yn() + "]");
		System.out.println("pre_issu_yn = [" + getPre_issu_yn() + "]");
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
String sect_clsf_cd = req.getParameter("sect_clsf_cd");
if( sect_clsf_cd == null){
	System.out.println(this.toString+" : sect_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : sect_clsf_cd is "+sect_clsf_cd );
}
String sect_nm_cd = req.getParameter("sect_nm_cd");
if( sect_nm_cd == null){
	System.out.println(this.toString+" : sect_nm_cd is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd is "+sect_nm_cd );
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
String cslcrg_pers = req.getParameter("cslcrg_pers");
if( cslcrg_pers == null){
	System.out.println(this.toString+" : cslcrg_pers is null" );
}else{
	System.out.println(this.toString+" : cslcrg_pers is "+cslcrg_pers );
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
String pragn_yn = req.getParameter("pragn_yn");
if( pragn_yn == null){
	System.out.println(this.toString+" : pragn_yn is null" );
}else{
	System.out.println(this.toString+" : pragn_yn is "+pragn_yn );
}
String pre_issu_yn = req.getParameter("pre_issu_yn");
if( pre_issu_yn == null){
	System.out.println(this.toString+" : pre_issu_yn is null" );
}else{
	System.out.println(this.toString+" : pre_issu_yn is "+pre_issu_yn );
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
String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String cslcrg_pers = Util.checkString(req.getParameter("cslcrg_pers"));
String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String pragn_yn = Util.checkString(req.getParameter("pragn_yn"));
String pre_issu_yn = Util.checkString(req.getParameter("pre_issu_yn"));
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
String sect_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clsf_cd")));
String sect_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String cslcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("cslcrg_pers")));
String indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String pragn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pragn_yn")));
String pre_issu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_issu_yn")));
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
dm.setSect_clsf_cd(sect_clsf_cd);
dm.setSect_nm_cd(sect_nm_cd);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setCslcrg_pers(cslcrg_pers);
dm.setIndt_clsf(indt_clsf);
dm.setAcct_cd(acct_cd);
dm.setEmp_no(emp_no);
dm.setPragn_yn(pragn_yn);
dm.setPre_issu_yn(pre_issu_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 16 10:12:32 KST 2017 */