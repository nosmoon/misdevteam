/***************************************************************************************************
* 파일명 : .java
* 기능 : 위수탁세금계산서 업로드
* 작성일자 : 2011.02.07
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.tax.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_TAX_2750_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String elec_tax_comp_cd;
	public String make_dt;
	public String byr_dlco_nm;
	public String byr_ern;
	public String byr_email;
	public String broker_dlco_nm;
	public String broker_ern;
	public String broker_email;
	public String suply_amt;
	public String vat_amt;	
	public String approve_id;
	public String remk;
	
	public String incmg_pers_ip;
	public String incmg_pers;
	
	public String mode; 
	public String flag;

	public AD_TAX_2750_ADM(){}
	
	public AD_TAX_2750_ADM(String cmpy_cd, String elec_tax_comp_cd, String make_dt, String byr_dlco_nm, String byr_ern, String byr_email, String broker_dlco_nm, String broker_ern, String broker_email, String suply_amt, String vat_amt, String approve_id, String remk, String incmg_pers_ip, String incmg_pers, String mode, String flag) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.make_dt = make_dt;
		this.byr_dlco_nm = byr_dlco_nm;
		this.byr_ern = byr_ern;
		this.byr_email = byr_email;
		this.broker_dlco_nm = broker_dlco_nm;
		this.broker_ern = broker_ern;
		this.broker_email = broker_email;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.approve_id = approve_id;
		this.remk = remk;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.flag = flag;
	}


	public String getApprove_id() {
		return approve_id;
	}

	public void setApprove_id(String approve_id) {
		this.approve_id = approve_id;
	}

	public String getBroker_dlco_nm() {
		return broker_dlco_nm;
	}

	public void setBroker_dlco_nm(String broker_dlco_nm) {
		this.broker_dlco_nm = broker_dlco_nm;
	}

	public String getBroker_email() {
		return broker_email;
	}

	public void setBroker_email(String broker_email) {
		this.broker_email = broker_email;
	}

	public String getBroker_ern() {
		return broker_ern;
	}

	public void setBroker_ern(String broker_ern) {
		this.broker_ern = broker_ern;
	}

	public String getByr_dlco_nm() {
		return byr_dlco_nm;
	}

	public void setByr_dlco_nm(String byr_dlco_nm) {
		this.byr_dlco_nm = byr_dlco_nm;
	}

	public String getByr_email() {
		return byr_email;
	}

	public void setByr_email(String byr_email) {
		this.byr_email = byr_email;
	}

	public String getByr_ern() {
		return byr_ern;
	}

	public void setByr_ern(String byr_ern) {
		this.byr_ern = byr_ern;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getElec_tax_comp_cd() {
		return elec_tax_comp_cd;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd) {
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getIncmg_pers() {
		return incmg_pers;
	}

	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}

	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getMake_dt() {
		return make_dt;
	}

	public void setMake_dt(String make_dt) {
		this.make_dt = make_dt;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getRemk() {
		return remk;
	}

	public void setRemk(String remk) {
		this.remk = remk;
	}

	public String getSuply_amt() {
		return suply_amt;
	}

	public void setSuply_amt(String suply_amt) {
		this.suply_amt = suply_amt;
	}

	public String getVat_amt() {
		return vat_amt;
	}

	public void setVat_amt(String vat_amt) {
		this.vat_amt = vat_amt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_TAX_2750_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_2750_ADM dm = (AD_TAX_2750_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.elec_tax_comp_cd);
		cstmt.setString(5, dm.make_dt);
		cstmt.setString(6, dm.byr_dlco_nm);
		cstmt.setString(7, dm.byr_ern);
		cstmt.setString(8, dm.broker_dlco_nm);
		cstmt.setString(9, dm.broker_ern);
		cstmt.setString(10, dm.suply_amt);
		cstmt.setString(11, dm.vat_amt);
		cstmt.setString(12, dm.approve_id);
		cstmt.setString(13, dm.byr_email);
		cstmt.setString(14, dm.remk);
		cstmt.setString(15, dm.incmg_pers_ip);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.mode);
		cstmt.setString(18, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_2750_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String notaxrate_clsf = req.getParameter("notaxrate_clsf");
if( notaxrate_clsf == null){
	System.out.println(this.toString+" : notaxrate_clsf is null" );
}else{
	System.out.println(this.toString+" : notaxrate_clsf is "+notaxrate_clsf );
}
String notaxrate_dt = req.getParameter("notaxrate_dt");
if( notaxrate_dt == null){
	System.out.println(this.toString+" : notaxrate_dt is null" );
}else{
	System.out.println(this.toString+" : notaxrate_dt is "+notaxrate_dt );
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

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String notaxrate_clsf = Util.checkString(req.getParameter("notaxrate_clsf"));
String notaxrate_dt = Util.checkString(req.getParameter("notaxrate_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String notaxrate_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("notaxrate_clsf")));
String notaxrate_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("notaxrate_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setPubc_slip_no(pubc_slip_no);
dm.setNotaxrate_clsf(notaxrate_clsf);
dm.setNotaxrate_dt(notaxrate_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 14:53:38 KST 2009 */