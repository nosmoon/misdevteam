/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.ds.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1230_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String comn_mang_no;
	public String rptv_flnm;
	public String dlco_clsf;
	public String area;
	public String bkst_cnt;
	public String tel_no_1;
	public String tel_no_2;
	public String tel_no_3;
	public String tel_no_etc;
	public String ptph_no_1;
	public String ptph_no_2;
	public String ptph_no_3;
	public String fax_no_1;
	public String fax_no_2;
	public String fax_no_3;
	public String email;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String magz_deal_yn;
	public String magz_deal_frdt;
	public String magz_deal_todt;
	public String sep_book_deal_yn;
	public String sep_book_deal_frdt;
	public String sep_book_deal_todt;
	public String remk;
	public String elec_tax_stmt_yn;

	public PL_BAS_1230_ADM(){}
	public PL_BAS_1230_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String dlco_cd, String dlco_seq, String dlco_nm, String dlco_abrv_nm, String comn_mang_no, String rptv_flnm, String dlco_clsf, String area, String bkst_cnt, String tel_no_1, String tel_no_2, String tel_no_3, String tel_no_etc, String ptph_no_1, String ptph_no_2, String ptph_no_3, String fax_no_1, String fax_no_2, String fax_no_3, String email, String zip_1, String zip_2, String addr, String dtls_addr, String magz_deal_yn, String magz_deal_frdt, String magz_deal_todt, String sep_book_deal_yn, String sep_book_deal_frdt, String sep_book_deal_todt, String remk, String elec_tax_stmt_yn){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.dlco_nm = dlco_nm;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.comn_mang_no = comn_mang_no;
		this.rptv_flnm = rptv_flnm;
		this.dlco_clsf = dlco_clsf;
		this.area = area;
		this.bkst_cnt = bkst_cnt;
		this.tel_no_1 = tel_no_1;
		this.tel_no_2 = tel_no_2;
		this.tel_no_3 = tel_no_3;
		this.tel_no_etc = tel_no_etc;
		this.ptph_no_1 = ptph_no_1;
		this.ptph_no_2 = ptph_no_2;
		this.ptph_no_3 = ptph_no_3;
		this.fax_no_1 = fax_no_1;
		this.fax_no_2 = fax_no_2;
		this.fax_no_3 = fax_no_3;
		this.email = email;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.magz_deal_yn = magz_deal_yn;
		this.magz_deal_frdt = magz_deal_frdt;
		this.magz_deal_todt = magz_deal_todt;
		this.sep_book_deal_yn = sep_book_deal_yn;
		this.sep_book_deal_frdt = sep_book_deal_frdt;
		this.sep_book_deal_todt = sep_book_deal_todt;
		this.remk = remk;
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setAcc_flag(String acc_flag){
		this.acc_flag = acc_flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setComn_mang_no(String comn_mang_no){
		this.comn_mang_no = comn_mang_no;
	}

	public void setRptv_flnm(String rptv_flnm){
		this.rptv_flnm = rptv_flnm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setBkst_cnt(String bkst_cnt){
		this.bkst_cnt = bkst_cnt;
	}

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setTel_no_2(String tel_no_2){
		this.tel_no_2 = tel_no_2;
	}

	public void setTel_no_3(String tel_no_3){
		this.tel_no_3 = tel_no_3;
	}

	public void setTel_no_etc(String tel_no_etc){
		this.tel_no_etc = tel_no_etc;
	}

	public void setPtph_no_1(String ptph_no_1){
		this.ptph_no_1 = ptph_no_1;
	}

	public void setPtph_no_2(String ptph_no_2){
		this.ptph_no_2 = ptph_no_2;
	}

	public void setPtph_no_3(String ptph_no_3){
		this.ptph_no_3 = ptph_no_3;
	}

	public void setFax_no_1(String fax_no_1){
		this.fax_no_1 = fax_no_1;
	}

	public void setFax_no_2(String fax_no_2){
		this.fax_no_2 = fax_no_2;
	}

	public void setFax_no_3(String fax_no_3){
		this.fax_no_3 = fax_no_3;
	}

	public void setEmail(String email){
		this.email = email;
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

	public void setMagz_deal_yn(String magz_deal_yn){
		this.magz_deal_yn = magz_deal_yn;
	}

	public void setMagz_deal_frdt(String magz_deal_frdt){
		this.magz_deal_frdt = magz_deal_frdt;
	}

	public void setMagz_deal_todt(String magz_deal_todt){
		this.magz_deal_todt = magz_deal_todt;
	}

	public void setSep_book_deal_yn(String sep_book_deal_yn){
		this.sep_book_deal_yn = sep_book_deal_yn;
	}

	public void setSep_book_deal_frdt(String sep_book_deal_frdt){
		this.sep_book_deal_frdt = sep_book_deal_frdt;
	}

	public void setSep_book_deal_todt(String sep_book_deal_todt){
		this.sep_book_deal_todt = sep_book_deal_todt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn) {
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}
	
	public String getAcc_flag(){
		return this.acc_flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getComn_mang_no(){
		return this.comn_mang_no;
	}

	public String getRptv_flnm(){
		return this.rptv_flnm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getArea(){
		return this.area;
	}

	public String getBkst_cnt(){
		return this.bkst_cnt;
	}

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getTel_no_2(){
		return this.tel_no_2;
	}

	public String getTel_no_3(){
		return this.tel_no_3;
	}

	public String getTel_no_etc(){
		return this.tel_no_etc;
	}

	public String getPtph_no_1(){
		return this.ptph_no_1;
	}

	public String getPtph_no_2(){
		return this.ptph_no_2;
	}

	public String getPtph_no_3(){
		return this.ptph_no_3;
	}

	public String getFax_no_1(){
		return this.fax_no_1;
	}

	public String getFax_no_2(){
		return this.fax_no_2;
	}

	public String getFax_no_3(){
		return this.fax_no_3;
	}

	public String getEmail(){
		return this.email;
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

	public String getMagz_deal_yn(){
		return this.magz_deal_yn;
	}

	public String getMagz_deal_frdt(){
		return this.magz_deal_frdt;
	}

	public String getMagz_deal_todt(){
		return this.magz_deal_todt;
	}

	public String getSep_book_deal_yn(){
		return this.sep_book_deal_yn;
	}

	public String getSep_book_deal_frdt(){
		return this.sep_book_deal_frdt;
	}

	public String getSep_book_deal_todt(){
		return this.sep_book_deal_todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getElec_tax_stmt_yn() {
		return elec_tax_stmt_yn;
	}
	
	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1230_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1230_ADM dm = (PL_BAS_1230_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.dlco_cd);
		cstmt.setString(8, dm.dlco_seq);
		cstmt.setString(9, dm.dlco_nm);
		cstmt.setString(10, dm.dlco_abrv_nm);
		cstmt.setString(11, dm.comn_mang_no);
		cstmt.setString(12, dm.rptv_flnm);
		cstmt.setString(13, dm.dlco_clsf);
		cstmt.setString(14, dm.area);
		cstmt.setString(15, dm.bkst_cnt);
		cstmt.setString(16, dm.tel_no_1);
		cstmt.setString(17, dm.tel_no_2);
		cstmt.setString(18, dm.tel_no_3);
		cstmt.setString(19, dm.tel_no_etc);
		cstmt.setString(20, dm.ptph_no_1);
		cstmt.setString(21, dm.ptph_no_2);
		cstmt.setString(22, dm.ptph_no_3);
		cstmt.setString(23, dm.fax_no_1);
		cstmt.setString(24, dm.fax_no_2);
		cstmt.setString(25, dm.fax_no_3);
		cstmt.setString(26, dm.email);
		cstmt.setString(27, dm.zip_1);
		cstmt.setString(28, dm.zip_2);
		cstmt.setString(29, dm.addr);
		cstmt.setString(30, dm.dtls_addr);
		cstmt.setString(31, dm.magz_deal_yn);
		cstmt.setString(32, dm.magz_deal_frdt);
		cstmt.setString(33, dm.magz_deal_todt);
		cstmt.setString(34, dm.sep_book_deal_yn);
		cstmt.setString(35, dm.sep_book_deal_frdt);
		cstmt.setString(36, dm.sep_book_deal_todt);
		cstmt.setString(37, dm.remk);
		cstmt.setString(38, dm.elec_tax_stmt_yn);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1230_ADataSet();
	}



    public void print(){
        System.out.println("acc_flag = " + getAcc_flag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("dlco_seq = " + getDlco_seq());
        System.out.println("dlco_nm = " + getDlco_nm());
        System.out.println("dlco_abrv_nm = " + getDlco_abrv_nm());
        System.out.println("comn_mang_no = " + getComn_mang_no());
        System.out.println("rptv_flnm = " + getRptv_flnm());
        System.out.println("dlco_clsf = " + getDlco_clsf());
        System.out.println("area = " + getArea());
        System.out.println("bkst_cnt = " + getBkst_cnt());
        System.out.println("tel_no_1 = " + getTel_no_1());
        System.out.println("tel_no_2 = " + getTel_no_2());
        System.out.println("tel_no_3 = " + getTel_no_3());
        System.out.println("tel_no_etc = " + getTel_no_etc());
        System.out.println("ptph_no_1 = " + getPtph_no_1());
        System.out.println("ptph_no_2 = " + getPtph_no_2());
        System.out.println("ptph_no_3 = " + getPtph_no_3());
        System.out.println("fax_no_1 = " + getFax_no_1());
        System.out.println("fax_no_2 = " + getFax_no_2());
        System.out.println("fax_no_3 = " + getFax_no_3());
        System.out.println("email = " + getEmail());
        System.out.println("zip_1 = " + getZip_1());
        System.out.println("zip_2 = " + getZip_2());
        System.out.println("addr = " + getAddr());
        System.out.println("dtls_addr = " + getDtls_addr());
        System.out.println("magz_deal_yn = " + getMagz_deal_yn());
        System.out.println("magz_deal_frdt = " + getMagz_deal_frdt());
        System.out.println("magz_deal_todt = " + getMagz_deal_todt());
        System.out.println("sep_book_deal_yn = " + getSep_book_deal_yn());
        System.out.println("sep_book_deal_frdt = " + getSep_book_deal_frdt());
        System.out.println("sep_book_deal_todt = " + getSep_book_deal_todt());
        System.out.println("remk = " + getRemk());
        System.out.println("v = " + getElec_tax_stmt_yn());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acc_flag = req.getParameter("acc_flag");
if( acc_flag == null){
	System.out.println(this.toString+" : acc_flag is null" );
}else{
	System.out.println(this.toString+" : acc_flag is "+acc_flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_seq = req.getParameter("dlco_seq");
if( dlco_seq == null){
	System.out.println(this.toString+" : dlco_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_seq is "+dlco_seq );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String dlco_abrv_nm = req.getParameter("dlco_abrv_nm");
if( dlco_abrv_nm == null){
	System.out.println(this.toString+" : dlco_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_abrv_nm is "+dlco_abrv_nm );
}
String comn_mang_no = req.getParameter("comn_mang_no");
if( comn_mang_no == null){
	System.out.println(this.toString+" : comn_mang_no is null" );
}else{
	System.out.println(this.toString+" : comn_mang_no is "+comn_mang_no );
}
String rptv_flnm = req.getParameter("rptv_flnm");
if( rptv_flnm == null){
	System.out.println(this.toString+" : rptv_flnm is null" );
}else{
	System.out.println(this.toString+" : rptv_flnm is "+rptv_flnm );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
}
String bkst_cnt = req.getParameter("bkst_cnt");
if( bkst_cnt == null){
	System.out.println(this.toString+" : bkst_cnt is null" );
}else{
	System.out.println(this.toString+" : bkst_cnt is "+bkst_cnt );
}
String tel_no_1 = req.getParameter("tel_no_1");
if( tel_no_1 == null){
	System.out.println(this.toString+" : tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : tel_no_1 is "+tel_no_1 );
}
String tel_no_2 = req.getParameter("tel_no_2");
if( tel_no_2 == null){
	System.out.println(this.toString+" : tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : tel_no_2 is "+tel_no_2 );
}
String tel_no_3 = req.getParameter("tel_no_3");
if( tel_no_3 == null){
	System.out.println(this.toString+" : tel_no_3 is null" );
}else{
	System.out.println(this.toString+" : tel_no_3 is "+tel_no_3 );
}
String tel_no_etc = req.getParameter("tel_no_etc");
if( tel_no_etc == null){
	System.out.println(this.toString+" : tel_no_etc is null" );
}else{
	System.out.println(this.toString+" : tel_no_etc is "+tel_no_etc );
}
String ptph_no_1 = req.getParameter("ptph_no_1");
if( ptph_no_1 == null){
	System.out.println(this.toString+" : ptph_no_1 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_1 is "+ptph_no_1 );
}
String ptph_no_2 = req.getParameter("ptph_no_2");
if( ptph_no_2 == null){
	System.out.println(this.toString+" : ptph_no_2 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_2 is "+ptph_no_2 );
}
String ptph_no_3 = req.getParameter("ptph_no_3");
if( ptph_no_3 == null){
	System.out.println(this.toString+" : ptph_no_3 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_3 is "+ptph_no_3 );
}
String fax_no_1 = req.getParameter("fax_no_1");
if( fax_no_1 == null){
	System.out.println(this.toString+" : fax_no_1 is null" );
}else{
	System.out.println(this.toString+" : fax_no_1 is "+fax_no_1 );
}
String fax_no_2 = req.getParameter("fax_no_2");
if( fax_no_2 == null){
	System.out.println(this.toString+" : fax_no_2 is null" );
}else{
	System.out.println(this.toString+" : fax_no_2 is "+fax_no_2 );
}
String fax_no_3 = req.getParameter("fax_no_3");
if( fax_no_3 == null){
	System.out.println(this.toString+" : fax_no_3 is null" );
}else{
	System.out.println(this.toString+" : fax_no_3 is "+fax_no_3 );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
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
String magz_deal_yn = req.getParameter("magz_deal_yn");
if( magz_deal_yn == null){
	System.out.println(this.toString+" : magz_deal_yn is null" );
}else{
	System.out.println(this.toString+" : magz_deal_yn is "+magz_deal_yn );
}
String magz_deal_frdt = req.getParameter("magz_deal_frdt");
if( magz_deal_frdt == null){
	System.out.println(this.toString+" : magz_deal_frdt is null" );
}else{
	System.out.println(this.toString+" : magz_deal_frdt is "+magz_deal_frdt );
}
String magz_deal_todt = req.getParameter("magz_deal_todt");
if( magz_deal_todt == null){
	System.out.println(this.toString+" : magz_deal_todt is null" );
}else{
	System.out.println(this.toString+" : magz_deal_todt is "+magz_deal_todt );
}
String sep_book_deal_yn = req.getParameter("sep_book_deal_yn");
if( sep_book_deal_yn == null){
	System.out.println(this.toString+" : sep_book_deal_yn is null" );
}else{
	System.out.println(this.toString+" : sep_book_deal_yn is "+sep_book_deal_yn );
}
String sep_book_deal_frdt = req.getParameter("sep_book_deal_frdt");
if( sep_book_deal_frdt == null){
	System.out.println(this.toString+" : sep_book_deal_frdt is null" );
}else{
	System.out.println(this.toString+" : sep_book_deal_frdt is "+sep_book_deal_frdt );
}
String sep_book_deal_todt = req.getParameter("sep_book_deal_todt");
if( sep_book_deal_todt == null){
	System.out.println(this.toString+" : sep_book_deal_todt is null" );
}else{
	System.out.println(this.toString+" : sep_book_deal_todt is "+sep_book_deal_todt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
String comn_mang_no = Util.checkString(req.getParameter("comn_mang_no"));
String rptv_flnm = Util.checkString(req.getParameter("rptv_flnm"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String area = Util.checkString(req.getParameter("area"));
String bkst_cnt = Util.checkString(req.getParameter("bkst_cnt"));
String tel_no_1 = Util.checkString(req.getParameter("tel_no_1"));
String tel_no_2 = Util.checkString(req.getParameter("tel_no_2"));
String tel_no_3 = Util.checkString(req.getParameter("tel_no_3"));
String tel_no_etc = Util.checkString(req.getParameter("tel_no_etc"));
String ptph_no_1 = Util.checkString(req.getParameter("ptph_no_1"));
String ptph_no_2 = Util.checkString(req.getParameter("ptph_no_2"));
String ptph_no_3 = Util.checkString(req.getParameter("ptph_no_3"));
String fax_no_1 = Util.checkString(req.getParameter("fax_no_1"));
String fax_no_2 = Util.checkString(req.getParameter("fax_no_2"));
String fax_no_3 = Util.checkString(req.getParameter("fax_no_3"));
String email = Util.checkString(req.getParameter("email"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String magz_deal_yn = Util.checkString(req.getParameter("magz_deal_yn"));
String magz_deal_frdt = Util.checkString(req.getParameter("magz_deal_frdt"));
String magz_deal_todt = Util.checkString(req.getParameter("magz_deal_todt"));
String sep_book_deal_yn = Util.checkString(req.getParameter("sep_book_deal_yn"));
String sep_book_deal_frdt = Util.checkString(req.getParameter("sep_book_deal_frdt"));
String sep_book_deal_todt = Util.checkString(req.getParameter("sep_book_deal_todt"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String dlco_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_abrv_nm")));
String comn_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("comn_mang_no")));
String rptv_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_flnm")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String bkst_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("bkst_cnt")));
String tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1")));
String tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2")));
String tel_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_3")));
String tel_no_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_etc")));
String ptph_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_1")));
String ptph_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_2")));
String ptph_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_3")));
String fax_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no_1")));
String fax_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no_2")));
String fax_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no_3")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String magz_deal_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("magz_deal_yn")));
String magz_deal_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("magz_deal_frdt")));
String magz_deal_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("magz_deal_todt")));
String sep_book_deal_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_book_deal_yn")));
String sep_book_deal_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_book_deal_frdt")));
String sep_book_deal_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_book_deal_todt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
dm.setDlco_nm(dlco_nm);
dm.setDlco_abrv_nm(dlco_abrv_nm);
dm.setComn_mang_no(comn_mang_no);
dm.setRptv_flnm(rptv_flnm);
dm.setDlco_clsf(dlco_clsf);
dm.setArea(area);
dm.setBkst_cnt(bkst_cnt);
dm.setTel_no_1(tel_no_1);
dm.setTel_no_2(tel_no_2);
dm.setTel_no_3(tel_no_3);
dm.setTel_no_etc(tel_no_etc);
dm.setPtph_no_1(ptph_no_1);
dm.setPtph_no_2(ptph_no_2);
dm.setPtph_no_3(ptph_no_3);
dm.setFax_no_1(fax_no_1);
dm.setFax_no_2(fax_no_2);
dm.setFax_no_3(fax_no_3);
dm.setEmail(email);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setMagz_deal_yn(magz_deal_yn);
dm.setMagz_deal_frdt(magz_deal_frdt);
dm.setMagz_deal_todt(magz_deal_todt);
dm.setSep_book_deal_yn(sep_book_deal_yn);
dm.setSep_book_deal_frdt(sep_book_deal_frdt);
dm.setSep_book_deal_todt(sep_book_deal_todt);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 20:13:04 KST 2009 */