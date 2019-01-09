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


package chosun.ciis.co.dlco.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.ds.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String dlco_no;
	public String ern;
	public String sys_clsf_cd;
	public String dlco_abrv_nm;
	public String dlco_nm;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String natn_cd;
	public String frnc_addr;
	public String natn_tel_no;
	public String tel_no;
	public String fax_no;
	public String presi_nm;
	public String presi_prn;
	public String presi_zip_1;
	public String presi_zip_2;
	public String presi_addr;
	public String presi_dtls_addr;
	public String presi_tel_no;
	public String bizcond;
	public String item;
	public String setl_bank;
	public String acct_no;
	public String rcpm_main_nm;
	public String email;
	public String elec_tax_stmt_yn;
	public String corp_clsf;
	public String frnc_pers_yn;
	public String err_eps_no_aprv_yn;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_pers_cmpy_cd;
	public String chg_pers;
	public String chg_pers_cmpy_cd;
	public String txn_clsf;

	public CO_DLCO_1002_ADM(){}
	public CO_DLCO_1002_ADM(String mode, String dlco_no, String ern, String sys_clsf_cd, String dlco_abrv_nm, String dlco_nm, String zip_1, String zip_2, String addr, String dtls_addr, String natn_cd, String frnc_addr, String natn_tel_no, String tel_no, String fax_no, String presi_nm, String presi_prn, String presi_zip_1, String presi_zip_2, String presi_addr, String presi_dtls_addr, String presi_tel_no, String bizcond, String item, String setl_bank, String acct_no, String rcpm_main_nm, String email, String elec_tax_stmt_yn, String corp_clsf, String frnc_pers_yn, String err_eps_no_aprv_yn, String incmg_pers_ipadd, String incmg_pers, String incmg_pers_cmpy_cd, String chg_pers, String chg_pers_cmpy_cd, String txn_clsf){
		this.mode = mode;
		this.dlco_no = dlco_no;
		this.ern = ern;
		this.sys_clsf_cd = sys_clsf_cd;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.dlco_nm = dlco_nm;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.natn_cd = natn_cd;
		this.frnc_addr = frnc_addr;
		this.natn_tel_no = natn_tel_no;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.presi_nm = presi_nm;
		this.presi_prn = presi_prn;
		this.presi_zip_1 = presi_zip_1;
		this.presi_zip_2 = presi_zip_2;
		this.presi_addr = presi_addr;
		this.presi_dtls_addr = presi_dtls_addr;
		this.presi_tel_no = presi_tel_no;
		this.bizcond = bizcond;
		this.item = item;
		this.setl_bank = setl_bank;
		this.acct_no = acct_no;
		this.rcpm_main_nm = rcpm_main_nm;
		this.email = email;
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
		this.corp_clsf = corp_clsf;
		this.frnc_pers_yn = frnc_pers_yn;
		this.err_eps_no_aprv_yn = err_eps_no_aprv_yn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_cmpy_cd = incmg_pers_cmpy_cd;
		this.chg_pers = chg_pers;
		this.chg_pers_cmpy_cd = chg_pers_cmpy_cd;
		this.txn_clsf = txn_clsf;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSys_clsf_cd(String sys_clsf_cd){
		this.sys_clsf_cd = sys_clsf_cd;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setFrnc_addr(String frnc_addr){
		this.frnc_addr = frnc_addr;
	}

	public void setNatn_tel_no(String natn_tel_no){
		this.natn_tel_no = natn_tel_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setPresi_prn(String presi_prn){
		this.presi_prn = presi_prn;
	}

	public void setPresi_zip_1(String presi_zip_1){
		this.presi_zip_1 = presi_zip_1;
	}

	public void setPresi_zip_2(String presi_zip_2){
		this.presi_zip_2 = presi_zip_2;
	}

	public void setPresi_addr(String presi_addr){
		this.presi_addr = presi_addr;
	}

	public void setPresi_dtls_addr(String presi_dtls_addr){
		this.presi_dtls_addr = presi_dtls_addr;
	}

	public void setPresi_tel_no(String presi_tel_no){
		this.presi_tel_no = presi_tel_no;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setCorp_clsf(String corp_clsf){
		this.corp_clsf = corp_clsf;
	}

	public void setFrnc_pers_yn(String frnc_pers_yn){
		this.frnc_pers_yn = frnc_pers_yn;
	}

	public void setErr_eps_no_aprv_yn(String err_eps_no_aprv_yn){
		this.err_eps_no_aprv_yn = err_eps_no_aprv_yn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_cmpy_cd(String incmg_pers_cmpy_cd){
		this.incmg_pers_cmpy_cd = incmg_pers_cmpy_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_pers_cmpy_cd(String chg_pers_cmpy_cd){
		this.chg_pers_cmpy_cd = chg_pers_cmpy_cd;
	}

	public void setTxn_clsf(String txn_clsf){
		this.txn_clsf = txn_clsf;
	}

	public String getMode(){
		return this.mode;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSys_clsf_cd(){
		return this.sys_clsf_cd;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getFrnc_addr(){
		return this.frnc_addr;
	}

	public String getNatn_tel_no(){
		return this.natn_tel_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getPresi_prn(){
		return this.presi_prn;
	}

	public String getPresi_zip_1(){
		return this.presi_zip_1;
	}

	public String getPresi_zip_2(){
		return this.presi_zip_2;
	}

	public String getPresi_addr(){
		return this.presi_addr;
	}

	public String getPresi_dtls_addr(){
		return this.presi_dtls_addr;
	}

	public String getPresi_tel_no(){
		return this.presi_tel_no;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getEmail(){
		return this.email;
	}

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
	}

	public String getCorp_clsf(){
		return this.corp_clsf;
	}

	public String getFrnc_pers_yn(){
		return this.frnc_pers_yn;
	}

	public String getErr_eps_no_aprv_yn(){
		return this.err_eps_no_aprv_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_cmpy_cd(){
		return this.incmg_pers_cmpy_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_pers_cmpy_cd(){
		return this.chg_pers_cmpy_cd;
	}

	public String getTxn_clsf(){
		return this.txn_clsf;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_DLCO_1002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DLCO_1002_ADM dm = (CO_DLCO_1002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.dlco_no);
		cstmt.setString(5, dm.ern);
		cstmt.setString(6, dm.sys_clsf_cd);
		cstmt.setString(7, dm.dlco_abrv_nm);
		cstmt.setString(8, dm.dlco_nm);
		cstmt.setString(9, dm.zip_1);
		cstmt.setString(10, dm.zip_2);
		cstmt.setString(11, dm.addr);
		cstmt.setString(12, dm.dtls_addr);
		cstmt.setString(13, dm.natn_cd);
		cstmt.setString(14, dm.frnc_addr);
		cstmt.setString(15, dm.natn_tel_no);
		cstmt.setString(16, dm.tel_no);
		cstmt.setString(17, dm.fax_no);
		cstmt.setString(18, dm.presi_nm);
		cstmt.setString(19, dm.presi_prn);
		cstmt.setString(20, dm.presi_zip_1);
		cstmt.setString(21, dm.presi_zip_2);
		cstmt.setString(22, dm.presi_addr);
		cstmt.setString(23, dm.presi_dtls_addr);
		cstmt.setString(24, dm.presi_tel_no);
		cstmt.setString(25, dm.bizcond);
		cstmt.setString(26, dm.item);
		cstmt.setString(27, dm.setl_bank);
		cstmt.setString(28, dm.acct_no);
		cstmt.setString(29, dm.rcpm_main_nm);
		cstmt.setString(30, dm.email);
		cstmt.setString(31, dm.elec_tax_stmt_yn);
		cstmt.setString(32, dm.corp_clsf);
		cstmt.setString(33, dm.frnc_pers_yn);
		cstmt.setString(34, dm.err_eps_no_aprv_yn);
		cstmt.setString(35, dm.incmg_pers_ipadd);
		cstmt.setString(36, dm.incmg_pers);
		cstmt.setString(37, dm.incmg_pers_cmpy_cd);
		cstmt.setString(38, dm.chg_pers);
		cstmt.setString(39, dm.chg_pers_cmpy_cd);
		cstmt.setString(40, dm.txn_clsf);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.dlco.ds.CO_DLCO_1002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("sys_clsf_cd = [" + getSys_clsf_cd() + "]");
		System.out.println("dlco_abrv_nm = [" + getDlco_abrv_nm() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("zip_1 = [" + getZip_1() + "]");
		System.out.println("zip_2 = [" + getZip_2() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("natn_cd = [" + getNatn_cd() + "]");
		System.out.println("frnc_addr = [" + getFrnc_addr() + "]");
		System.out.println("natn_tel_no = [" + getNatn_tel_no() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("fax_no = [" + getFax_no() + "]");
		System.out.println("presi_nm = [" + getPresi_nm() + "]");
		System.out.println("presi_prn = [" + getPresi_prn() + "]");
		System.out.println("presi_zip_1 = [" + getPresi_zip_1() + "]");
		System.out.println("presi_zip_2 = [" + getPresi_zip_2() + "]");
		System.out.println("presi_addr = [" + getPresi_addr() + "]");
		System.out.println("presi_dtls_addr = [" + getPresi_dtls_addr() + "]");
		System.out.println("presi_tel_no = [" + getPresi_tel_no() + "]");
		System.out.println("bizcond = [" + getBizcond() + "]");
		System.out.println("item = [" + getItem() + "]");
		System.out.println("setl_bank = [" + getSetl_bank() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("rcpm_main_nm = [" + getRcpm_main_nm() + "]");
		System.out.println("email = [" + getEmail() + "]");
		System.out.println("elec_tax_stmt_yn = [" + getElec_tax_stmt_yn() + "]");
		System.out.println("corp_clsf = [" + getCorp_clsf() + "]");
		System.out.println("frnc_pers_yn = [" + getFrnc_pers_yn() + "]");
		System.out.println("err_eps_no_aprv_yn = [" + getErr_eps_no_aprv_yn() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_cmpy_cd = [" + getIncmg_pers_cmpy_cd() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("chg_pers_cmpy_cd = [" + getChg_pers_cmpy_cd() + "]");
		System.out.println("txn_clsf = [" + getTxn_clsf() + "]");
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String sys_clsf_cd = req.getParameter("sys_clsf_cd");
if( sys_clsf_cd == null){
	System.out.println(this.toString+" : sys_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : sys_clsf_cd is "+sys_clsf_cd );
}
String dlco_abrv_nm = req.getParameter("dlco_abrv_nm");
if( dlco_abrv_nm == null){
	System.out.println(this.toString+" : dlco_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_abrv_nm is "+dlco_abrv_nm );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String zip_1 = req.getParameter("zip_1");
if( zip_1 == null){
	System.out.println(this.toString+" : zip_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1 is "+zip_1 );
}
String zip_2 = req.getParameter("zip_2");
if( zip_2 == null){
	System.out.println(this.toString+" : zip_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2 is "+zip_2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String natn_cd = req.getParameter("natn_cd");
if( natn_cd == null){
	System.out.println(this.toString+" : natn_cd is null" );
}else{
	System.out.println(this.toString+" : natn_cd is "+natn_cd );
}
String frnc_addr = req.getParameter("frnc_addr");
if( frnc_addr == null){
	System.out.println(this.toString+" : frnc_addr is null" );
}else{
	System.out.println(this.toString+" : frnc_addr is "+frnc_addr );
}
String natn_tel_no = req.getParameter("natn_tel_no");
if( natn_tel_no == null){
	System.out.println(this.toString+" : natn_tel_no is null" );
}else{
	System.out.println(this.toString+" : natn_tel_no is "+natn_tel_no );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String fax_no = req.getParameter("fax_no");
if( fax_no == null){
	System.out.println(this.toString+" : fax_no is null" );
}else{
	System.out.println(this.toString+" : fax_no is "+fax_no );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String presi_prn = req.getParameter("presi_prn");
if( presi_prn == null){
	System.out.println(this.toString+" : presi_prn is null" );
}else{
	System.out.println(this.toString+" : presi_prn is "+presi_prn );
}
String presi_zip_1 = req.getParameter("presi_zip_1");
if( presi_zip_1 == null){
	System.out.println(this.toString+" : presi_zip_1 is null" );
}else{
	System.out.println(this.toString+" : presi_zip_1 is "+presi_zip_1 );
}
String presi_zip_2 = req.getParameter("presi_zip_2");
if( presi_zip_2 == null){
	System.out.println(this.toString+" : presi_zip_2 is null" );
}else{
	System.out.println(this.toString+" : presi_zip_2 is "+presi_zip_2 );
}
String presi_addr = req.getParameter("presi_addr");
if( presi_addr == null){
	System.out.println(this.toString+" : presi_addr is null" );
}else{
	System.out.println(this.toString+" : presi_addr is "+presi_addr );
}
String presi_dtls_addr = req.getParameter("presi_dtls_addr");
if( presi_dtls_addr == null){
	System.out.println(this.toString+" : presi_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : presi_dtls_addr is "+presi_dtls_addr );
}
String presi_tel_no = req.getParameter("presi_tel_no");
if( presi_tel_no == null){
	System.out.println(this.toString+" : presi_tel_no is null" );
}else{
	System.out.println(this.toString+" : presi_tel_no is "+presi_tel_no );
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
String setl_bank = req.getParameter("setl_bank");
if( setl_bank == null){
	System.out.println(this.toString+" : setl_bank is null" );
}else{
	System.out.println(this.toString+" : setl_bank is "+setl_bank );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String rcpm_main_nm = req.getParameter("rcpm_main_nm");
if( rcpm_main_nm == null){
	System.out.println(this.toString+" : rcpm_main_nm is null" );
}else{
	System.out.println(this.toString+" : rcpm_main_nm is "+rcpm_main_nm );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String elec_tax_stmt_yn = req.getParameter("elec_tax_stmt_yn");
if( elec_tax_stmt_yn == null){
	System.out.println(this.toString+" : elec_tax_stmt_yn is null" );
}else{
	System.out.println(this.toString+" : elec_tax_stmt_yn is "+elec_tax_stmt_yn );
}
String corp_clsf = req.getParameter("corp_clsf");
if( corp_clsf == null){
	System.out.println(this.toString+" : corp_clsf is null" );
}else{
	System.out.println(this.toString+" : corp_clsf is "+corp_clsf );
}
String frnc_pers_yn = req.getParameter("frnc_pers_yn");
if( frnc_pers_yn == null){
	System.out.println(this.toString+" : frnc_pers_yn is null" );
}else{
	System.out.println(this.toString+" : frnc_pers_yn is "+frnc_pers_yn );
}
String err_eps_no_aprv_yn = req.getParameter("err_eps_no_aprv_yn");
if( err_eps_no_aprv_yn == null){
	System.out.println(this.toString+" : err_eps_no_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : err_eps_no_aprv_yn is "+err_eps_no_aprv_yn );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_cmpy_cd = req.getParameter("incmg_pers_cmpy_cd");
if( incmg_pers_cmpy_cd == null){
	System.out.println(this.toString+" : incmg_pers_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_cmpy_cd is "+incmg_pers_cmpy_cd );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String chg_pers_cmpy_cd = req.getParameter("chg_pers_cmpy_cd");
if( chg_pers_cmpy_cd == null){
	System.out.println(this.toString+" : chg_pers_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : chg_pers_cmpy_cd is "+chg_pers_cmpy_cd );
}
String txn_clsf = req.getParameter("txn_clsf");
if( txn_clsf == null){
	System.out.println(this.toString+" : txn_clsf is null" );
}else{
	System.out.println(this.toString+" : txn_clsf is "+txn_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String ern = Util.checkString(req.getParameter("ern"));
String sys_clsf_cd = Util.checkString(req.getParameter("sys_clsf_cd"));
String dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String natn_cd = Util.checkString(req.getParameter("natn_cd"));
String frnc_addr = Util.checkString(req.getParameter("frnc_addr"));
String natn_tel_no = Util.checkString(req.getParameter("natn_tel_no"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String fax_no = Util.checkString(req.getParameter("fax_no"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String presi_prn = Util.checkString(req.getParameter("presi_prn"));
String presi_zip_1 = Util.checkString(req.getParameter("presi_zip_1"));
String presi_zip_2 = Util.checkString(req.getParameter("presi_zip_2"));
String presi_addr = Util.checkString(req.getParameter("presi_addr"));
String presi_dtls_addr = Util.checkString(req.getParameter("presi_dtls_addr"));
String presi_tel_no = Util.checkString(req.getParameter("presi_tel_no"));
String bizcond = Util.checkString(req.getParameter("bizcond"));
String item = Util.checkString(req.getParameter("item"));
String setl_bank = Util.checkString(req.getParameter("setl_bank"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String rcpm_main_nm = Util.checkString(req.getParameter("rcpm_main_nm"));
String email = Util.checkString(req.getParameter("email"));
String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));
String corp_clsf = Util.checkString(req.getParameter("corp_clsf"));
String frnc_pers_yn = Util.checkString(req.getParameter("frnc_pers_yn"));
String err_eps_no_aprv_yn = Util.checkString(req.getParameter("err_eps_no_aprv_yn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_cmpy_cd = Util.checkString(req.getParameter("incmg_pers_cmpy_cd"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_pers_cmpy_cd = Util.checkString(req.getParameter("chg_pers_cmpy_cd"));
String txn_clsf = Util.checkString(req.getParameter("txn_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String sys_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sys_clsf_cd")));
String dlco_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_abrv_nm")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_cd")));
String frnc_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("frnc_addr")));
String natn_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_tel_no")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String fax_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String presi_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_prn")));
String presi_zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_zip_1")));
String presi_zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_zip_2")));
String presi_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_addr")));
String presi_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_dtls_addr")));
String presi_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_tel_no")));
String bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("bizcond")));
String item = Util.Uni2Ksc(Util.checkString(req.getParameter("item")));
String setl_bank = Util.Uni2Ksc(Util.checkString(req.getParameter("setl_bank")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String rcpm_main_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_main_nm")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String elec_tax_stmt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_stmt_yn")));
String corp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_clsf")));
String frnc_pers_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("frnc_pers_yn")));
String err_eps_no_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("err_eps_no_aprv_yn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_cmpy_cd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_pers_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers_cmpy_cd")));
String txn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("txn_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setDlco_no(dlco_no);
dm.setErn(ern);
dm.setSys_clsf_cd(sys_clsf_cd);
dm.setDlco_abrv_nm(dlco_abrv_nm);
dm.setDlco_nm(dlco_nm);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setNatn_cd(natn_cd);
dm.setFrnc_addr(frnc_addr);
dm.setNatn_tel_no(natn_tel_no);
dm.setTel_no(tel_no);
dm.setFax_no(fax_no);
dm.setPresi_nm(presi_nm);
dm.setPresi_prn(presi_prn);
dm.setPresi_zip_1(presi_zip_1);
dm.setPresi_zip_2(presi_zip_2);
dm.setPresi_addr(presi_addr);
dm.setPresi_dtls_addr(presi_dtls_addr);
dm.setPresi_tel_no(presi_tel_no);
dm.setBizcond(bizcond);
dm.setItem(item);
dm.setSetl_bank(setl_bank);
dm.setAcct_no(acct_no);
dm.setRcpm_main_nm(rcpm_main_nm);
dm.setEmail(email);
dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
dm.setCorp_clsf(corp_clsf);
dm.setFrnc_pers_yn(frnc_pers_yn);
dm.setErr_eps_no_aprv_yn(err_eps_no_aprv_yn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_cmpy_cd(incmg_pers_cmpy_cd);
dm.setChg_pers(chg_pers);
dm.setChg_pers_cmpy_cd(chg_pers_cmpy_cd);
dm.setTxn_clsf(txn_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 17 16:52:28 KST 2012 */