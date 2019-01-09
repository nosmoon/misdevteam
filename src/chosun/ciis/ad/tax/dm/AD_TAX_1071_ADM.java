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


package chosun.ciis.ad.tax.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.tax.ds.*;
import chosun.ciis.ad.tax.rec.*;

/**
 * 
 */


public class AD_TAX_1071_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String prof_type_cd;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String ern;
	public String dlco_clsf_cd;
	public String dlco_no;
	public String dlco_nm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String medi_cd;
	public String re_issu_resn_cd;
	public String issu_tms;
	public String tax_item;
	public String checked;
	public String pubc_slip_no;
	public String pubc_dt;
	public String trust_dlco_no;
	public String email_id;
	public String elec_tax_comp_cd;
	public String semuro_no;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_TAX_1071_ADM(){}
	public AD_TAX_1071_ADM(String cmpy_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String prof_type_cd, String make_dt, String suply_amt, String vat_amt, String ern, String dlco_clsf_cd, String dlco_no, String dlco_nm, String presi_nm, String addr, String bizcond, String item, String medi_cd, String re_issu_resn_cd, String issu_tms, String tax_item, String checked, String pubc_slip_no, String pubc_dt, String trust_dlco_no, String email_id, String elec_tax_comp_cd, String semuro_no, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.prof_type_cd = prof_type_cd;
		this.make_dt = make_dt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.ern = ern;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.presi_nm = presi_nm;
		this.addr = addr;
		this.bizcond = bizcond;
		this.item = item;
		this.medi_cd = medi_cd;
		this.re_issu_resn_cd = re_issu_resn_cd;
		this.issu_tms = issu_tms;
		this.tax_item = tax_item;
		this.checked = checked;
		this.pubc_slip_no = pubc_slip_no;
		this.pubc_dt = pubc_dt;
		this.trust_dlco_no = trust_dlco_no;
		this.email_id = email_id;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.semuro_no = semuro_no;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRe_issu_resn_cd(String re_issu_resn_cd){
		this.re_issu_resn_cd = re_issu_resn_cd;
	}

	public void setIssu_tms(String issu_tms){
		this.issu_tms = issu_tms;
	}

	public void setTax_item(String tax_item){
		this.tax_item = tax_item;
	}

	public void setChecked(String checked){
		this.checked = checked;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setTrust_dlco_no(String trust_dlco_no){
		this.trust_dlco_no = trust_dlco_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
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

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRe_issu_resn_cd(){
		return this.re_issu_resn_cd;
	}

	public String getIssu_tms(){
		return this.issu_tms;
	}

	public String getTax_item(){
		return this.tax_item;
	}

	public String getChecked(){
		return this.checked;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getTrust_dlco_no(){
		return this.trust_dlco_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_TAX_1071_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_1071_ADM dm = (AD_TAX_1071_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.slip_seq);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.prof_type_cd);
		cstmt.setString(8, dm.make_dt);
		cstmt.setString(9, dm.suply_amt);
		cstmt.setString(10, dm.vat_amt);
		cstmt.setString(11, dm.ern);
		cstmt.setString(12, dm.dlco_clsf_cd);
		cstmt.setString(13, dm.dlco_no);
		cstmt.setString(14, dm.dlco_nm);
		cstmt.setString(15, dm.presi_nm);
		cstmt.setString(16, dm.addr);
		cstmt.setString(17, dm.bizcond);
		cstmt.setString(18, dm.item);
		cstmt.setString(19, dm.medi_cd);
		cstmt.setString(20, dm.re_issu_resn_cd);
		cstmt.setString(21, dm.issu_tms);
		cstmt.setString(22, dm.tax_item);
		cstmt.setString(23, dm.checked);
		cstmt.setString(24, dm.pubc_slip_no);
		cstmt.setString(25, dm.pubc_dt);
		cstmt.setString(26, dm.trust_dlco_no);
		cstmt.setString(27, dm.email_id);
		cstmt.setString(28, dm.elec_tax_comp_cd);
		cstmt.setString(29, dm.semuro_no);
		cstmt.setString(30, dm.incmg_pers_ip);
		cstmt.setString(31, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_1071_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("presi_nm = [" + getPresi_nm() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("bizcond = [" + getBizcond() + "]");
		System.out.println("item = [" + getItem() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("re_issu_resn_cd = [" + getRe_issu_resn_cd() + "]");
		System.out.println("issu_tms = [" + getIssu_tms() + "]");
		System.out.println("tax_item = [" + getTax_item() + "]");
		System.out.println("checked = [" + getChecked() + "]");
		System.out.println("pubc_slip_no = [" + getPubc_slip_no() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("trust_dlco_no = [" + getTrust_dlco_no() + "]");
		System.out.println("email_id = [" + getEmail_id() + "]");
		System.out.println("elec_tax_comp_cd = [" + getElec_tax_comp_cd() + "]");
		System.out.println("semuro_no = [" + getSemuro_no() + "]");
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
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
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
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String bizcond = req.getParameter("bizcond");
if( bizcond == null){
	System.out.println(this.toString+" : bizcond is null" );
}else{
	System.out.println(this.toString+" : bizcond is "+bizcond );
}
String item = req.getParameter("item");
if( item == null){
	System.out.println(this.toString+" : item is null" );
}else{
	System.out.println(this.toString+" : item is "+item );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String re_issu_resn_cd = req.getParameter("re_issu_resn_cd");
if( re_issu_resn_cd == null){
	System.out.println(this.toString+" : re_issu_resn_cd is null" );
}else{
	System.out.println(this.toString+" : re_issu_resn_cd is "+re_issu_resn_cd );
}
String issu_tms = req.getParameter("issu_tms");
if( issu_tms == null){
	System.out.println(this.toString+" : issu_tms is null" );
}else{
	System.out.println(this.toString+" : issu_tms is "+issu_tms );
}
String tax_item = req.getParameter("tax_item");
if( tax_item == null){
	System.out.println(this.toString+" : tax_item is null" );
}else{
	System.out.println(this.toString+" : tax_item is "+tax_item );
}
String checked = req.getParameter("checked");
if( checked == null){
	System.out.println(this.toString+" : checked is null" );
}else{
	System.out.println(this.toString+" : checked is "+checked );
}
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String trust_dlco_no = req.getParameter("trust_dlco_no");
if( trust_dlco_no == null){
	System.out.println(this.toString+" : trust_dlco_no is null" );
}else{
	System.out.println(this.toString+" : trust_dlco_no is "+trust_dlco_no );
}
String email_id = req.getParameter("email_id");
if( email_id == null){
	System.out.println(this.toString+" : email_id is null" );
}else{
	System.out.println(this.toString+" : email_id is "+email_id );
}
String elec_tax_comp_cd = req.getParameter("elec_tax_comp_cd");
if( elec_tax_comp_cd == null){
	System.out.println(this.toString+" : elec_tax_comp_cd is null" );
}else{
	System.out.println(this.toString+" : elec_tax_comp_cd is "+elec_tax_comp_cd );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
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
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String ern = Util.checkString(req.getParameter("ern"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String addr = Util.checkString(req.getParameter("addr"));
String bizcond = Util.checkString(req.getParameter("bizcond"));
String item = Util.checkString(req.getParameter("item"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String re_issu_resn_cd = Util.checkString(req.getParameter("re_issu_resn_cd"));
String issu_tms = Util.checkString(req.getParameter("issu_tms"));
String tax_item = Util.checkString(req.getParameter("tax_item"));
String checked = Util.checkString(req.getParameter("checked"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String trust_dlco_no = Util.checkString(req.getParameter("trust_dlco_no"));
String email_id = Util.checkString(req.getParameter("email_id"));
String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("bizcond")));
String item = Util.Uni2Ksc(Util.checkString(req.getParameter("item")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String re_issu_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("re_issu_resn_cd")));
String issu_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_tms")));
String tax_item = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_item")));
String checked = Util.Uni2Ksc(Util.checkString(req.getParameter("checked")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String trust_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("trust_dlco_no")));
String email_id = Util.Uni2Ksc(Util.checkString(req.getParameter("email_id")));
String elec_tax_comp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_comp_cd")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setProf_type_cd(prof_type_cd);
dm.setMake_dt(make_dt);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setErn(ern);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_no(dlco_no);
dm.setDlco_nm(dlco_nm);
dm.setPresi_nm(presi_nm);
dm.setAddr(addr);
dm.setBizcond(bizcond);
dm.setItem(item);
dm.setMedi_cd(medi_cd);
dm.setRe_issu_resn_cd(re_issu_resn_cd);
dm.setIssu_tms(issu_tms);
dm.setTax_item(tax_item);
dm.setChecked(checked);
dm.setPubc_slip_no(pubc_slip_no);
dm.setPubc_dt(pubc_dt);
dm.setTrust_dlco_no(trust_dlco_no);
dm.setEmail_id(email_id);
dm.setElec_tax_comp_cd(elec_tax_comp_cd);
dm.setSemuro_no(semuro_no);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 02 11:35:31 KST 2012 */