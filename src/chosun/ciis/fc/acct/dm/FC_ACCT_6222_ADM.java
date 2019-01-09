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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6222_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String cmpy_cd;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String int_rate;
	public String sub_flag_ary;
	public String seq;
	public String flor_cnt;
	public String ser_no;
	public String cntr_size;
	public String intg_dlco_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String hire_firm_nm;
	public String hire_dlco_ern;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String cntr_gurt_amt;
	public String cntr_leas_amt;
	public String cntr_mang_amt;
	public String rent_impt_amt;
	public String rent_gurt_amt_int;
	public String rent_mms_rcpm_amt;
	public String mang_rcpm_amt;
	public String nwsp_dn_yn;
	public String leas_dlco_ern;
	public String dong;
	public String renw_dt;

	public FC_ACCT_6222_ADM(){}
	public FC_ACCT_6222_ADM(String flag, String incmg_pers, String incmg_pers_ipadd, String cmpy_cd, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String int_rate, String sub_flag_ary, String seq, String flor_cnt, String ser_no, String cntr_size, String intg_dlco_cd, String dlco_clsf_cd, String dlco_cd, String hire_firm_nm, String hire_dlco_ern, String leas_fr_dt, String leas_to_dt, String cntr_gurt_amt, String cntr_leas_amt, String cntr_mang_amt, String rent_impt_amt, String rent_gurt_amt_int, String rent_mms_rcpm_amt, String mang_rcpm_amt, String nwsp_dn_yn, String leas_dlco_ern, String dong, String renw_dt){
		this.flag = flag;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.int_rate = int_rate;
		this.sub_flag_ary = sub_flag_ary;
		this.seq = seq;
		this.flor_cnt = flor_cnt;
		this.ser_no = ser_no;
		this.cntr_size = cntr_size;
		this.intg_dlco_cd = intg_dlco_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.hire_firm_nm = hire_firm_nm;
		this.hire_dlco_ern = hire_dlco_ern;
		this.leas_fr_dt = leas_fr_dt;
		this.leas_to_dt = leas_to_dt;
		this.cntr_gurt_amt = cntr_gurt_amt;
		this.cntr_leas_amt = cntr_leas_amt;
		this.cntr_mang_amt = cntr_mang_amt;
		this.rent_impt_amt = rent_impt_amt;
		this.rent_gurt_amt_int = rent_gurt_amt_int;
		this.rent_mms_rcpm_amt = rent_mms_rcpm_amt;
		this.mang_rcpm_amt = mang_rcpm_amt;
		this.nwsp_dn_yn = nwsp_dn_yn;
		this.leas_dlco_ern = leas_dlco_ern;
		this.dong = dong;
		this.renw_dt = renw_dt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setSub_flag_ary(String sub_flag_ary){
		this.sub_flag_ary = sub_flag_ary;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlor_cnt(String flor_cnt){
		this.flor_cnt = flor_cnt;
	}

	public void setSer_no(String ser_no){
		this.ser_no = ser_no;
	}

	public void setCntr_size(String cntr_size){
		this.cntr_size = cntr_size;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setHire_firm_nm(String hire_firm_nm){
		this.hire_firm_nm = hire_firm_nm;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setCntr_gurt_amt(String cntr_gurt_amt){
		this.cntr_gurt_amt = cntr_gurt_amt;
	}

	public void setCntr_leas_amt(String cntr_leas_amt){
		this.cntr_leas_amt = cntr_leas_amt;
	}

	public void setCntr_mang_amt(String cntr_mang_amt){
		this.cntr_mang_amt = cntr_mang_amt;
	}

	public void setRent_impt_amt(String rent_impt_amt){
		this.rent_impt_amt = rent_impt_amt;
	}

	public void setRent_gurt_amt_int(String rent_gurt_amt_int){
		this.rent_gurt_amt_int = rent_gurt_amt_int;
	}

	public void setRent_mms_rcpm_amt(String rent_mms_rcpm_amt){
		this.rent_mms_rcpm_amt = rent_mms_rcpm_amt;
	}

	public void setMang_rcpm_amt(String mang_rcpm_amt){
		this.mang_rcpm_amt = mang_rcpm_amt;
	}

	public void setNwsp_dn_yn(String nwsp_dn_yn){
		this.nwsp_dn_yn = nwsp_dn_yn;
	}

	public void setLeas_dlco_ern(String leas_dlco_ern){
		this.leas_dlco_ern = leas_dlco_ern;
	}

	public void setDong(String dong){
		this.dong = dong;
	}

	public void setRenw_dt(String renw_dt){
		this.renw_dt = renw_dt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getSub_flag_ary(){
		return this.sub_flag_ary;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlor_cnt(){
		return this.flor_cnt;
	}

	public String getSer_no(){
		return this.ser_no;
	}

	public String getCntr_size(){
		return this.cntr_size;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getHire_firm_nm(){
		return this.hire_firm_nm;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getCntr_gurt_amt(){
		return this.cntr_gurt_amt;
	}

	public String getCntr_leas_amt(){
		return this.cntr_leas_amt;
	}

	public String getCntr_mang_amt(){
		return this.cntr_mang_amt;
	}

	public String getRent_impt_amt(){
		return this.rent_impt_amt;
	}

	public String getRent_gurt_amt_int(){
		return this.rent_gurt_amt_int;
	}

	public String getRent_mms_rcpm_amt(){
		return this.rent_mms_rcpm_amt;
	}

	public String getMang_rcpm_amt(){
		return this.mang_rcpm_amt;
	}

	public String getNwsp_dn_yn(){
		return this.nwsp_dn_yn;
	}

	public String getLeas_dlco_ern(){
		return this.leas_dlco_ern;
	}

	public String getDong(){
		return this.dong;
	}

	public String getRenw_dt(){
		return this.renw_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6222_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6222_ADM dm = (FC_ACCT_6222_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.erplace_cd);
		cstmt.setString(8, dm.vat_fr_yymm);
		cstmt.setString(9, dm.vat_to_yymm);
		cstmt.setString(10, dm.int_rate);
		cstmt.setString(11, dm.sub_flag_ary);
		cstmt.setString(12, dm.seq);
		cstmt.setString(13, dm.flor_cnt);
		cstmt.setString(14, dm.ser_no);
		cstmt.setString(15, dm.cntr_size);
		cstmt.setString(16, dm.intg_dlco_cd);
		cstmt.setString(17, dm.dlco_clsf_cd);
		cstmt.setString(18, dm.dlco_cd);
		cstmt.setString(19, dm.hire_firm_nm);
		cstmt.setString(20, dm.hire_dlco_ern);
		cstmt.setString(21, dm.leas_fr_dt);
		cstmt.setString(22, dm.leas_to_dt);
		cstmt.setString(23, dm.cntr_gurt_amt);
		cstmt.setString(24, dm.cntr_leas_amt);
		cstmt.setString(25, dm.cntr_mang_amt);
		cstmt.setString(26, dm.rent_impt_amt);
		cstmt.setString(27, dm.rent_gurt_amt_int);
		cstmt.setString(28, dm.rent_mms_rcpm_amt);
		cstmt.setString(29, dm.mang_rcpm_amt);
		cstmt.setString(30, dm.nwsp_dn_yn);
		cstmt.setString(31, dm.leas_dlco_ern);
		cstmt.setString(32, dm.dong);
		cstmt.setString(33, dm.renw_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6222_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("vat_fr_yymm = [" + getVat_fr_yymm() + "]");
		System.out.println("vat_to_yymm = [" + getVat_to_yymm() + "]");
		System.out.println("int_rate = [" + getInt_rate() + "]");
		System.out.println("sub_flag_ary = [" + getSub_flag_ary() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flor_cnt = [" + getFlor_cnt() + "]");
		System.out.println("ser_no = [" + getSer_no() + "]");
		System.out.println("cntr_size = [" + getCntr_size() + "]");
		System.out.println("intg_dlco_cd = [" + getIntg_dlco_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("hire_firm_nm = [" + getHire_firm_nm() + "]");
		System.out.println("hire_dlco_ern = [" + getHire_dlco_ern() + "]");
		System.out.println("leas_fr_dt = [" + getLeas_fr_dt() + "]");
		System.out.println("leas_to_dt = [" + getLeas_to_dt() + "]");
		System.out.println("cntr_gurt_amt = [" + getCntr_gurt_amt() + "]");
		System.out.println("cntr_leas_amt = [" + getCntr_leas_amt() + "]");
		System.out.println("cntr_mang_amt = [" + getCntr_mang_amt() + "]");
		System.out.println("rent_impt_amt = [" + getRent_impt_amt() + "]");
		System.out.println("rent_gurt_amt_int = [" + getRent_gurt_amt_int() + "]");
		System.out.println("rent_mms_rcpm_amt = [" + getRent_mms_rcpm_amt() + "]");
		System.out.println("mang_rcpm_amt = [" + getMang_rcpm_amt() + "]");
		System.out.println("nwsp_dn_yn = [" + getNwsp_dn_yn() + "]");
		System.out.println("leas_dlco_ern = [" + getLeas_dlco_ern() + "]");
		System.out.println("dong = [" + getDong() + "]");
		System.out.println("renw_dt = [" + getRenw_dt() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String vat_fr_yymm = req.getParameter("vat_fr_yymm");
if( vat_fr_yymm == null){
	System.out.println(this.toString+" : vat_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_fr_yymm is "+vat_fr_yymm );
}
String vat_to_yymm = req.getParameter("vat_to_yymm");
if( vat_to_yymm == null){
	System.out.println(this.toString+" : vat_to_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_to_yymm is "+vat_to_yymm );
}
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
}
String sub_flag_ary = req.getParameter("sub_flag_ary");
if( sub_flag_ary == null){
	System.out.println(this.toString+" : sub_flag_ary is null" );
}else{
	System.out.println(this.toString+" : sub_flag_ary is "+sub_flag_ary );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String flor_cnt = req.getParameter("flor_cnt");
if( flor_cnt == null){
	System.out.println(this.toString+" : flor_cnt is null" );
}else{
	System.out.println(this.toString+" : flor_cnt is "+flor_cnt );
}
String ser_no = req.getParameter("ser_no");
if( ser_no == null){
	System.out.println(this.toString+" : ser_no is null" );
}else{
	System.out.println(this.toString+" : ser_no is "+ser_no );
}
String cntr_size = req.getParameter("cntr_size");
if( cntr_size == null){
	System.out.println(this.toString+" : cntr_size is null" );
}else{
	System.out.println(this.toString+" : cntr_size is "+cntr_size );
}
String intg_dlco_cd = req.getParameter("intg_dlco_cd");
if( intg_dlco_cd == null){
	System.out.println(this.toString+" : intg_dlco_cd is null" );
}else{
	System.out.println(this.toString+" : intg_dlco_cd is "+intg_dlco_cd );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String hire_firm_nm = req.getParameter("hire_firm_nm");
if( hire_firm_nm == null){
	System.out.println(this.toString+" : hire_firm_nm is null" );
}else{
	System.out.println(this.toString+" : hire_firm_nm is "+hire_firm_nm );
}
String hire_dlco_ern = req.getParameter("hire_dlco_ern");
if( hire_dlco_ern == null){
	System.out.println(this.toString+" : hire_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : hire_dlco_ern is "+hire_dlco_ern );
}
String leas_fr_dt = req.getParameter("leas_fr_dt");
if( leas_fr_dt == null){
	System.out.println(this.toString+" : leas_fr_dt is null" );
}else{
	System.out.println(this.toString+" : leas_fr_dt is "+leas_fr_dt );
}
String leas_to_dt = req.getParameter("leas_to_dt");
if( leas_to_dt == null){
	System.out.println(this.toString+" : leas_to_dt is null" );
}else{
	System.out.println(this.toString+" : leas_to_dt is "+leas_to_dt );
}
String cntr_gurt_amt = req.getParameter("cntr_gurt_amt");
if( cntr_gurt_amt == null){
	System.out.println(this.toString+" : cntr_gurt_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_gurt_amt is "+cntr_gurt_amt );
}
String cntr_leas_amt = req.getParameter("cntr_leas_amt");
if( cntr_leas_amt == null){
	System.out.println(this.toString+" : cntr_leas_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_leas_amt is "+cntr_leas_amt );
}
String cntr_mang_amt = req.getParameter("cntr_mang_amt");
if( cntr_mang_amt == null){
	System.out.println(this.toString+" : cntr_mang_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_mang_amt is "+cntr_mang_amt );
}
String rent_impt_amt = req.getParameter("rent_impt_amt");
if( rent_impt_amt == null){
	System.out.println(this.toString+" : rent_impt_amt is null" );
}else{
	System.out.println(this.toString+" : rent_impt_amt is "+rent_impt_amt );
}
String rent_gurt_amt_int = req.getParameter("rent_gurt_amt_int");
if( rent_gurt_amt_int == null){
	System.out.println(this.toString+" : rent_gurt_amt_int is null" );
}else{
	System.out.println(this.toString+" : rent_gurt_amt_int is "+rent_gurt_amt_int );
}
String rent_mms_rcpm_amt = req.getParameter("rent_mms_rcpm_amt");
if( rent_mms_rcpm_amt == null){
	System.out.println(this.toString+" : rent_mms_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rent_mms_rcpm_amt is "+rent_mms_rcpm_amt );
}
String mang_rcpm_amt = req.getParameter("mang_rcpm_amt");
if( mang_rcpm_amt == null){
	System.out.println(this.toString+" : mang_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : mang_rcpm_amt is "+mang_rcpm_amt );
}
String nwsp_dn_yn = req.getParameter("nwsp_dn_yn");
if( nwsp_dn_yn == null){
	System.out.println(this.toString+" : nwsp_dn_yn is null" );
}else{
	System.out.println(this.toString+" : nwsp_dn_yn is "+nwsp_dn_yn );
}
String leas_dlco_ern = req.getParameter("leas_dlco_ern");
if( leas_dlco_ern == null){
	System.out.println(this.toString+" : leas_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : leas_dlco_ern is "+leas_dlco_ern );
}
String dong = req.getParameter("dong");
if( dong == null){
	System.out.println(this.toString+" : dong is null" );
}else{
	System.out.println(this.toString+" : dong is "+dong );
}
String renw_dt = req.getParameter("renw_dt");
if( renw_dt == null){
	System.out.println(this.toString+" : renw_dt is null" );
}else{
	System.out.println(this.toString+" : renw_dt is "+renw_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
String vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String sub_flag_ary = Util.checkString(req.getParameter("sub_flag_ary"));
String seq = Util.checkString(req.getParameter("seq"));
String flor_cnt = Util.checkString(req.getParameter("flor_cnt"));
String ser_no = Util.checkString(req.getParameter("ser_no"));
String cntr_size = Util.checkString(req.getParameter("cntr_size"));
String intg_dlco_cd = Util.checkString(req.getParameter("intg_dlco_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String hire_firm_nm = Util.checkString(req.getParameter("hire_firm_nm"));
String hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
String leas_fr_dt = Util.checkString(req.getParameter("leas_fr_dt"));
String leas_to_dt = Util.checkString(req.getParameter("leas_to_dt"));
String cntr_gurt_amt = Util.checkString(req.getParameter("cntr_gurt_amt"));
String cntr_leas_amt = Util.checkString(req.getParameter("cntr_leas_amt"));
String cntr_mang_amt = Util.checkString(req.getParameter("cntr_mang_amt"));
String rent_impt_amt = Util.checkString(req.getParameter("rent_impt_amt"));
String rent_gurt_amt_int = Util.checkString(req.getParameter("rent_gurt_amt_int"));
String rent_mms_rcpm_amt = Util.checkString(req.getParameter("rent_mms_rcpm_amt"));
String mang_rcpm_amt = Util.checkString(req.getParameter("mang_rcpm_amt"));
String nwsp_dn_yn = Util.checkString(req.getParameter("nwsp_dn_yn"));
String leas_dlco_ern = Util.checkString(req.getParameter("leas_dlco_ern"));
String dong = Util.checkString(req.getParameter("dong"));
String renw_dt = Util.checkString(req.getParameter("renw_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String vat_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_fr_yymm")));
String vat_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_to_yymm")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String sub_flag_ary = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_flag_ary")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flor_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("flor_cnt")));
String ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ser_no")));
String cntr_size = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_size")));
String intg_dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("intg_dlco_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String hire_firm_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("hire_firm_nm")));
String hire_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("hire_dlco_ern")));
String leas_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_fr_dt")));
String leas_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_to_dt")));
String cntr_gurt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_gurt_amt")));
String cntr_leas_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_leas_amt")));
String cntr_mang_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_mang_amt")));
String rent_impt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rent_impt_amt")));
String rent_gurt_amt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("rent_gurt_amt_int")));
String rent_mms_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rent_mms_rcpm_amt")));
String mang_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_rcpm_amt")));
String nwsp_dn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_dn_yn")));
String leas_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_dlco_ern")));
String dong = Util.Uni2Ksc(Util.checkString(req.getParameter("dong")));
String renw_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("renw_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setVat_fr_yymm(vat_fr_yymm);
dm.setVat_to_yymm(vat_to_yymm);
dm.setInt_rate(int_rate);
dm.setSub_flag_ary(sub_flag_ary);
dm.setSeq(seq);
dm.setFlor_cnt(flor_cnt);
dm.setSer_no(ser_no);
dm.setCntr_size(cntr_size);
dm.setIntg_dlco_cd(intg_dlco_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setHire_firm_nm(hire_firm_nm);
dm.setHire_dlco_ern(hire_dlco_ern);
dm.setLeas_fr_dt(leas_fr_dt);
dm.setLeas_to_dt(leas_to_dt);
dm.setCntr_gurt_amt(cntr_gurt_amt);
dm.setCntr_leas_amt(cntr_leas_amt);
dm.setCntr_mang_amt(cntr_mang_amt);
dm.setRent_impt_amt(rent_impt_amt);
dm.setRent_gurt_amt_int(rent_gurt_amt_int);
dm.setRent_mms_rcpm_amt(rent_mms_rcpm_amt);
dm.setMang_rcpm_amt(mang_rcpm_amt);
dm.setNwsp_dn_yn(nwsp_dn_yn);
dm.setLeas_dlco_ern(leas_dlco_ern);
dm.setDong(dong);
dm.setRenw_dt(renw_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 27 19:11:23 KST 2014 */