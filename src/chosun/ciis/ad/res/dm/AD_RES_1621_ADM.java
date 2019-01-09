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


package chosun.ciis.ad.res.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.ds.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1621_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String medi_cd;
	public String tax_clsf;
	public String preng_occr_dt;
	public String advt_clsf;
	public String dlco_nm;
	public String advt_fee;
	public String agn;
	public String fee;
	public String slcrg_pers;
	public String advt_cont;
	public String remk;
	public String patr_chrg_info;
	public String tax_email;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_RES_1621_ADM(){}
	public AD_RES_1621_ADM(String cmpy_cd, String mode, String medi_cd, String tax_clsf, String preng_occr_dt, String advt_clsf, String dlco_nm, String advt_fee, String agn, String fee, String slcrg_pers, String advt_cont, String remk, String patr_chrg_info, String tax_email, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.medi_cd = medi_cd;
		this.tax_clsf = tax_clsf;
		this.preng_occr_dt = preng_occr_dt;
		this.advt_clsf = advt_clsf;
		this.dlco_nm = dlco_nm;
		this.advt_fee = advt_fee;
		this.agn = agn;
		this.fee = fee;
		this.slcrg_pers = slcrg_pers;
		this.advt_cont = advt_cont;
		this.remk = remk;
		this.patr_chrg_info = patr_chrg_info;
		this.tax_email = tax_email;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setAdvt_clsf(String advt_clsf){
		this.advt_clsf = advt_clsf;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPatr_chrg_info(String patr_chrg_info){
		this.patr_chrg_info = patr_chrg_info;
	}

	public void setTax_email(String tax_email){
		this.tax_email = tax_email;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getAdvt_clsf(){
		return this.advt_clsf;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getFee(){
		return this.fee;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPatr_chrg_info(){
		return this.patr_chrg_info;
	}

	public String getTax_email(){
		return this.tax_email;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1621_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1621_ADM dm = (AD_RES_1621_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.tax_clsf);
		cstmt.setString(7, dm.preng_occr_dt);
		cstmt.setString(8, dm.advt_clsf);
		cstmt.setString(9, dm.dlco_nm);
		cstmt.setString(10, dm.advt_fee);
		cstmt.setString(11, dm.agn);
		cstmt.setString(12, dm.fee);
		cstmt.setString(13, dm.slcrg_pers);
		cstmt.setString(14, dm.advt_cont);
		cstmt.setString(15, dm.remk);
		cstmt.setString(16, dm.patr_chrg_info);
		cstmt.setString(17, dm.tax_email);
		cstmt.setString(18, dm.incmg_pers_ip);
		cstmt.setString(19, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1621_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("tax_clsf = [" + getTax_clsf() + "]");
		System.out.println("preng_occr_dt = [" + getPreng_occr_dt() + "]");
		System.out.println("advt_clsf = [" + getAdvt_clsf() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("advt_fee = [" + getAdvt_fee() + "]");
		System.out.println("agn = [" + getAgn() + "]");
		System.out.println("fee = [" + getFee() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("patr_chrg_info = [" + getPatr_chrg_info() + "]");
		System.out.println("tax_email = [" + getTax_email() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String tax_clsf = req.getParameter("tax_clsf");
if( tax_clsf == null){
	System.out.println(this.toString+" : tax_clsf is null" );
}else{
	System.out.println(this.toString+" : tax_clsf is "+tax_clsf );
}
String preng_occr_dt = req.getParameter("preng_occr_dt");
if( preng_occr_dt == null){
	System.out.println(this.toString+" : preng_occr_dt is null" );
}else{
	System.out.println(this.toString+" : preng_occr_dt is "+preng_occr_dt );
}
String advt_clsf = req.getParameter("advt_clsf");
if( advt_clsf == null){
	System.out.println(this.toString+" : advt_clsf is null" );
}else{
	System.out.println(this.toString+" : advt_clsf is "+advt_clsf );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String advt_fee = req.getParameter("advt_fee");
if( advt_fee == null){
	System.out.println(this.toString+" : advt_fee is null" );
}else{
	System.out.println(this.toString+" : advt_fee is "+advt_fee );
}
String agn = req.getParameter("agn");
if( agn == null){
	System.out.println(this.toString+" : agn is null" );
}else{
	System.out.println(this.toString+" : agn is "+agn );
}
String fee = req.getParameter("fee");
if( fee == null){
	System.out.println(this.toString+" : fee is null" );
}else{
	System.out.println(this.toString+" : fee is "+fee );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String patr_chrg_info = req.getParameter("patr_chrg_info");
if( patr_chrg_info == null){
	System.out.println(this.toString+" : patr_chrg_info is null" );
}else{
	System.out.println(this.toString+" : patr_chrg_info is "+patr_chrg_info );
}
String tax_email = req.getParameter("tax_email");
if( tax_email == null){
	System.out.println(this.toString+" : tax_email is null" );
}else{
	System.out.println(this.toString+" : tax_email is "+tax_email );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String tax_clsf = Util.checkString(req.getParameter("tax_clsf"));
String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
String advt_clsf = Util.checkString(req.getParameter("advt_clsf"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String agn = Util.checkString(req.getParameter("agn"));
String fee = Util.checkString(req.getParameter("fee"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String remk = Util.checkString(req.getParameter("remk"));
String patr_chrg_info = Util.checkString(req.getParameter("patr_chrg_info"));
String tax_email = Util.checkString(req.getParameter("tax_email"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String tax_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_clsf")));
String preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_dt")));
String advt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clsf")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String agn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn")));
String fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fee")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String patr_chrg_info = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_chrg_info")));
String tax_email = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_email")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setMedi_cd(medi_cd);
dm.setTax_clsf(tax_clsf);
dm.setPreng_occr_dt(preng_occr_dt);
dm.setAdvt_clsf(advt_clsf);
dm.setDlco_nm(dlco_nm);
dm.setAdvt_fee(advt_fee);
dm.setAgn(agn);
dm.setFee(fee);
dm.setSlcrg_pers(slcrg_pers);
dm.setAdvt_cont(advt_cont);
dm.setRemk(remk);
dm.setPatr_chrg_info(patr_chrg_info);
dm.setTax_email(tax_email);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 22 17:23:13 KST 2014 */