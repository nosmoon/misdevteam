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

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_2220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String setl_clsf;
	public String dlco_no;
	public String dlco_clsf;
	public String bank_clsf;
	public String rcpm_acct_no;
	public String chrg_pers;
	public String strt_dt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_DEP_2220_ADM(){}
	public AD_DEP_2220_ADM(String mode, String cmpy_cd, String setl_clsf, String dlco_no, String dlco_clsf, String bank_clsf, String rcpm_acct_no, String chrg_pers, String strt_dt, String incmg_pers_ip, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.setl_clsf = setl_clsf;
		this.dlco_no = dlco_no;
		this.dlco_clsf = dlco_clsf;
		this.bank_clsf = bank_clsf;
		this.rcpm_acct_no = rcpm_acct_no;
		this.chrg_pers = chrg_pers;
		this.strt_dt = strt_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSetl_clsf(String setl_clsf){
		this.setl_clsf = setl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setBank_clsf(String bank_clsf){
		this.bank_clsf = bank_clsf;
	}

	public void setRcpm_acct_no(String rcpm_acct_no){
		this.rcpm_acct_no = rcpm_acct_no;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setStrt_dt(String strt_dt){
		this.strt_dt = strt_dt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSetl_clsf(){
		return this.setl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getBank_clsf(){
		return this.bank_clsf;
	}

	public String getRcpm_acct_no(){
		return this.rcpm_acct_no;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getStrt_dt(){
		return this.strt_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_2220_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_2220_ADM dm = (AD_DEP_2220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.setl_clsf);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.dlco_clsf);
		cstmt.setString(8, dm.bank_clsf);
		cstmt.setString(9, dm.rcpm_acct_no);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.strt_dt);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_2220_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("setl_clsf = [" + getSetl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("bank_clsf = [" + getBank_clsf() + "]");
		System.out.println("rcpm_acct_no = [" + getRcpm_acct_no() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("strt_dt = [" + getStrt_dt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String setl_clsf = req.getParameter("setl_clsf");
if( setl_clsf == null){
	System.out.println(this.toString+" : setl_clsf is null" );
}else{
	System.out.println(this.toString+" : setl_clsf is "+setl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String bank_clsf = req.getParameter("bank_clsf");
if( bank_clsf == null){
	System.out.println(this.toString+" : bank_clsf is null" );
}else{
	System.out.println(this.toString+" : bank_clsf is "+bank_clsf );
}
String rcpm_acct_no = req.getParameter("rcpm_acct_no");
if( rcpm_acct_no == null){
	System.out.println(this.toString+" : rcpm_acct_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_acct_no is "+rcpm_acct_no );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String strt_dt = req.getParameter("strt_dt");
if( strt_dt == null){
	System.out.println(this.toString+" : strt_dt is null" );
}else{
	System.out.println(this.toString+" : strt_dt is "+strt_dt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String setl_clsf = Util.checkString(req.getParameter("setl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String bank_clsf = Util.checkString(req.getParameter("bank_clsf"));
String rcpm_acct_no = Util.checkString(req.getParameter("rcpm_acct_no"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String strt_dt = Util.checkString(req.getParameter("strt_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String setl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("setl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String bank_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_clsf")));
String rcpm_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_acct_no")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String strt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("strt_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setSetl_clsf(setl_clsf);
dm.setDlco_no(dlco_no);
dm.setDlco_clsf(dlco_clsf);
dm.setBank_clsf(bank_clsf);
dm.setRcpm_acct_no(rcpm_acct_no);
dm.setChrg_pers(chrg_pers);
dm.setStrt_dt(strt_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 12:49:11 KST 2009 */