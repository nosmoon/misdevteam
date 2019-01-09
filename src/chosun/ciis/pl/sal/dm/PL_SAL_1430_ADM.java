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


package chosun.ciis.pl.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.ds.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_1430_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String ordr_dt;
	public String ordr_grp_seq;
	public String deal_dt;
	public String deal_grp_seq;
	public String medi_clsf;
	public String basi_dt;
	public String dlco_cd;
	public String dlco_seq;
	public String send_plac_seq;
	public String send_plac_nm;
	public String send_plac_tel_no_1;
	public String send_plac_tel_no_2;
	public String send_plac_tel_no_3;
	public String send_plac_ptph_no_1;
	public String send_plac_ptph_no_2;
	public String send_plac_ptph_no_3;
	public String send_plac_fax_no_1;
	public String send_plac_fax_no_2;
	public String send_plac_fax_no_3;
	public String send_plac_zip_1;
	public String send_plac_zip_2;
	public String send_plac_addr;
	public String send_plac_dtls_addr;
	public String remk;
	public String mode_arr;
	public String ordr_seq_arr;
	public String deal_seq_arr;
	public String medi_cd_arr;
	public String medi_ser_no_arr;
	public String deal_qty_arr;
	public String deal_uprc_arr;
	public String dcrate_arr;
	public String deal_amt_arr;
	public String sale_clsf_arr;
	public String sendclsf_arr;
	public String wh_cd_arr;
	public String sell_type_arr;

	public PL_SAL_1430_ADM(){}
	public PL_SAL_1430_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String ordr_dt, String ordr_grp_seq, String deal_dt, String deal_grp_seq, String medi_clsf, String basi_dt, String dlco_cd, String dlco_seq, String send_plac_seq, String send_plac_nm, String send_plac_tel_no_1, String send_plac_tel_no_2, String send_plac_tel_no_3, String send_plac_ptph_no_1, String send_plac_ptph_no_2, String send_plac_ptph_no_3, String send_plac_fax_no_1, String send_plac_fax_no_2, String send_plac_fax_no_3, String send_plac_zip_1, String send_plac_zip_2, String send_plac_addr, String send_plac_dtls_addr, String remk, String mode_arr, String ordr_seq_arr, String deal_seq_arr, String medi_cd_arr, String medi_ser_no_arr, String deal_qty_arr, String deal_uprc_arr, String dcrate_arr, String deal_amt_arr, String sale_clsf_arr, String sendclsf_arr, String wh_cd_arr, String sell_type_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.ordr_dt = ordr_dt;
		this.ordr_grp_seq = ordr_grp_seq;
		this.deal_dt = deal_dt;
		this.deal_grp_seq = deal_grp_seq;
		this.medi_clsf = medi_clsf;
		this.basi_dt = basi_dt;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.send_plac_seq = send_plac_seq;
		this.send_plac_nm = send_plac_nm;
		this.send_plac_tel_no_1 = send_plac_tel_no_1;
		this.send_plac_tel_no_2 = send_plac_tel_no_2;
		this.send_plac_tel_no_3 = send_plac_tel_no_3;
		this.send_plac_ptph_no_1 = send_plac_ptph_no_1;
		this.send_plac_ptph_no_2 = send_plac_ptph_no_2;
		this.send_plac_ptph_no_3 = send_plac_ptph_no_3;
		this.send_plac_fax_no_1 = send_plac_fax_no_1;
		this.send_plac_fax_no_2 = send_plac_fax_no_2;
		this.send_plac_fax_no_3 = send_plac_fax_no_3;
		this.send_plac_zip_1 = send_plac_zip_1;
		this.send_plac_zip_2 = send_plac_zip_2;
		this.send_plac_addr = send_plac_addr;
		this.send_plac_dtls_addr = send_plac_dtls_addr;
		this.remk = remk;
		this.mode_arr = mode_arr;
		this.ordr_seq_arr = ordr_seq_arr;
		this.deal_seq_arr = deal_seq_arr;
		this.medi_cd_arr = medi_cd_arr;
		this.medi_ser_no_arr = medi_ser_no_arr;
		this.deal_qty_arr = deal_qty_arr;
		this.deal_uprc_arr = deal_uprc_arr;
		this.dcrate_arr = dcrate_arr;
		this.deal_amt_arr = deal_amt_arr;
		this.sale_clsf_arr = sale_clsf_arr;
		this.sendclsf_arr = sendclsf_arr;
		this.wh_cd_arr = wh_cd_arr;
		this.sell_type_arr = sell_type_arr;
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

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setOrdr_grp_seq(String ordr_grp_seq){
		this.ordr_grp_seq = ordr_grp_seq;
	}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setSend_plac_tel_no_1(String send_plac_tel_no_1){
		this.send_plac_tel_no_1 = send_plac_tel_no_1;
	}

	public void setSend_plac_tel_no_2(String send_plac_tel_no_2){
		this.send_plac_tel_no_2 = send_plac_tel_no_2;
	}

	public void setSend_plac_tel_no_3(String send_plac_tel_no_3){
		this.send_plac_tel_no_3 = send_plac_tel_no_3;
	}

	public void setSend_plac_ptph_no_1(String send_plac_ptph_no_1){
		this.send_plac_ptph_no_1 = send_plac_ptph_no_1;
	}

	public void setSend_plac_ptph_no_2(String send_plac_ptph_no_2){
		this.send_plac_ptph_no_2 = send_plac_ptph_no_2;
	}

	public void setSend_plac_ptph_no_3(String send_plac_ptph_no_3){
		this.send_plac_ptph_no_3 = send_plac_ptph_no_3;
	}

	public void setSend_plac_fax_no_1(String send_plac_fax_no_1){
		this.send_plac_fax_no_1 = send_plac_fax_no_1;
	}

	public void setSend_plac_fax_no_2(String send_plac_fax_no_2){
		this.send_plac_fax_no_2 = send_plac_fax_no_2;
	}

	public void setSend_plac_fax_no_3(String send_plac_fax_no_3){
		this.send_plac_fax_no_3 = send_plac_fax_no_3;
	}

	public void setSend_plac_zip_1(String send_plac_zip_1){
		this.send_plac_zip_1 = send_plac_zip_1;
	}

	public void setSend_plac_zip_2(String send_plac_zip_2){
		this.send_plac_zip_2 = send_plac_zip_2;
	}

	public void setSend_plac_addr(String send_plac_addr){
		this.send_plac_addr = send_plac_addr;
	}

	public void setSend_plac_dtls_addr(String send_plac_dtls_addr){
		this.send_plac_dtls_addr = send_plac_dtls_addr;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMode_arr(String mode_arr){
		this.mode_arr = mode_arr;
	}

	public void setOrdr_seq_arr(String ordr_seq_arr){
		this.ordr_seq_arr = ordr_seq_arr;
	}

	public void setDeal_seq_arr(String deal_seq_arr){
		this.deal_seq_arr = deal_seq_arr;
	}

	public void setMedi_cd_arr(String medi_cd_arr){
		this.medi_cd_arr = medi_cd_arr;
	}

	public void setMedi_ser_no_arr(String medi_ser_no_arr){
		this.medi_ser_no_arr = medi_ser_no_arr;
	}

	public void setDeal_qty_arr(String deal_qty_arr){
		this.deal_qty_arr = deal_qty_arr;
	}

	public void setDeal_uprc_arr(String deal_uprc_arr){
		this.deal_uprc_arr = deal_uprc_arr;
	}

	public void setDcrate_arr(String dcrate_arr){
		this.dcrate_arr = dcrate_arr;
	}

	public void setDeal_amt_arr(String deal_amt_arr){
		this.deal_amt_arr = deal_amt_arr;
	}

	public void setSale_clsf_arr(String sale_clsf_arr){
		this.sale_clsf_arr = sale_clsf_arr;
	}

	public void setSendclsf_arr(String sendclsf_arr){
		this.sendclsf_arr = sendclsf_arr;
	}

	public void setWh_cd_arr(String wh_cd_arr){
		this.wh_cd_arr = wh_cd_arr;
	}

	public void setSell_type_arr(String sell_type_arr){
		this.sell_type_arr = sell_type_arr;
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

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getOrdr_grp_seq(){
		return this.ordr_grp_seq;
	}

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getDeal_grp_seq(){
		return this.deal_grp_seq;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getSend_plac_tel_no_1(){
		return this.send_plac_tel_no_1;
	}

	public String getSend_plac_tel_no_2(){
		return this.send_plac_tel_no_2;
	}

	public String getSend_plac_tel_no_3(){
		return this.send_plac_tel_no_3;
	}

	public String getSend_plac_ptph_no_1(){
		return this.send_plac_ptph_no_1;
	}

	public String getSend_plac_ptph_no_2(){
		return this.send_plac_ptph_no_2;
	}

	public String getSend_plac_ptph_no_3(){
		return this.send_plac_ptph_no_3;
	}

	public String getSend_plac_fax_no_1(){
		return this.send_plac_fax_no_1;
	}

	public String getSend_plac_fax_no_2(){
		return this.send_plac_fax_no_2;
	}

	public String getSend_plac_fax_no_3(){
		return this.send_plac_fax_no_3;
	}

	public String getSend_plac_zip_1(){
		return this.send_plac_zip_1;
	}

	public String getSend_plac_zip_2(){
		return this.send_plac_zip_2;
	}

	public String getSend_plac_addr(){
		return this.send_plac_addr;
	}

	public String getSend_plac_dtls_addr(){
		return this.send_plac_dtls_addr;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMode_arr(){
		return this.mode_arr;
	}

	public String getOrdr_seq_arr(){
		return this.ordr_seq_arr;
	}

	public String getDeal_seq_arr(){
		return this.deal_seq_arr;
	}

	public String getMedi_cd_arr(){
		return this.medi_cd_arr;
	}

	public String getMedi_ser_no_arr(){
		return this.medi_ser_no_arr;
	}

	public String getDeal_qty_arr(){
		return this.deal_qty_arr;
	}

	public String getDeal_uprc_arr(){
		return this.deal_uprc_arr;
	}

	public String getDcrate_arr(){
		return this.dcrate_arr;
	}

	public String getDeal_amt_arr(){
		return this.deal_amt_arr;
	}

	public String getSale_clsf_arr(){
		return this.sale_clsf_arr;
	}

	public String getSendclsf_arr(){
		return this.sendclsf_arr;
	}

	public String getWh_cd_arr(){
		return this.wh_cd_arr;
	}

	public String getSell_type_arr(){
		return this.sell_type_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_SAL_1430_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_SAL_1430_ADM dm = (PL_SAL_1430_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.ordr_dt);
		cstmt.setString(8, dm.ordr_grp_seq);
		cstmt.setString(9, dm.deal_dt);
		cstmt.setString(10, dm.deal_grp_seq);
		cstmt.setString(11, dm.medi_clsf);
		cstmt.setString(12, dm.basi_dt);
		cstmt.setString(13, dm.dlco_cd);
		cstmt.setString(14, dm.dlco_seq);
		cstmt.setString(15, dm.send_plac_seq);
		cstmt.setString(16, dm.send_plac_nm);
		cstmt.setString(17, dm.send_plac_tel_no_1);
		cstmt.setString(18, dm.send_plac_tel_no_2);
		cstmt.setString(19, dm.send_plac_tel_no_3);
		cstmt.setString(20, dm.send_plac_ptph_no_1);
		cstmt.setString(21, dm.send_plac_ptph_no_2);
		cstmt.setString(22, dm.send_plac_ptph_no_3);
		cstmt.setString(23, dm.send_plac_fax_no_1);
		cstmt.setString(24, dm.send_plac_fax_no_2);
		cstmt.setString(25, dm.send_plac_fax_no_3);
		cstmt.setString(26, dm.send_plac_zip_1);
		cstmt.setString(27, dm.send_plac_zip_2);
		cstmt.setString(28, dm.send_plac_addr);
		cstmt.setString(29, dm.send_plac_dtls_addr);
		cstmt.setString(30, dm.remk);
		cstmt.setString(31, dm.mode_arr);
		cstmt.setString(32, dm.ordr_seq_arr);
		cstmt.setString(33, dm.deal_seq_arr);
		cstmt.setString(34, dm.medi_cd_arr);
		cstmt.setString(35, dm.medi_ser_no_arr);
		cstmt.setString(36, dm.deal_qty_arr);
		cstmt.setString(37, dm.deal_uprc_arr);
		cstmt.setString(38, dm.dcrate_arr);
		cstmt.setString(39, dm.deal_amt_arr);
		cstmt.setString(40, dm.sale_clsf_arr);
		cstmt.setString(41, dm.sendclsf_arr);
		cstmt.setString(42, dm.wh_cd_arr);
		cstmt.setString(43, dm.sell_type_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.sal.ds.PL_SAL_1430_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acc_flag = [" + getAcc_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("ordr_dt = [" + getOrdr_dt() + "]");
		System.out.println("ordr_grp_seq = [" + getOrdr_grp_seq() + "]");
		System.out.println("deal_dt = [" + getDeal_dt() + "]");
		System.out.println("deal_grp_seq = [" + getDeal_grp_seq() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
		System.out.println("send_plac_seq = [" + getSend_plac_seq() + "]");
		System.out.println("send_plac_nm = [" + getSend_plac_nm() + "]");
		System.out.println("send_plac_tel_no_1 = [" + getSend_plac_tel_no_1() + "]");
		System.out.println("send_plac_tel_no_2 = [" + getSend_plac_tel_no_2() + "]");
		System.out.println("send_plac_tel_no_3 = [" + getSend_plac_tel_no_3() + "]");
		System.out.println("send_plac_ptph_no_1 = [" + getSend_plac_ptph_no_1() + "]");
		System.out.println("send_plac_ptph_no_2 = [" + getSend_plac_ptph_no_2() + "]");
		System.out.println("send_plac_ptph_no_3 = [" + getSend_plac_ptph_no_3() + "]");
		System.out.println("send_plac_fax_no_1 = [" + getSend_plac_fax_no_1() + "]");
		System.out.println("send_plac_fax_no_2 = [" + getSend_plac_fax_no_2() + "]");
		System.out.println("send_plac_fax_no_3 = [" + getSend_plac_fax_no_3() + "]");
		System.out.println("send_plac_zip_1 = [" + getSend_plac_zip_1() + "]");
		System.out.println("send_plac_zip_2 = [" + getSend_plac_zip_2() + "]");
		System.out.println("send_plac_addr = [" + getSend_plac_addr() + "]");
		System.out.println("send_plac_dtls_addr = [" + getSend_plac_dtls_addr() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("mode_arr = [" + getMode_arr() + "]");
		System.out.println("ordr_seq_arr = [" + getOrdr_seq_arr() + "]");
		System.out.println("deal_seq_arr = [" + getDeal_seq_arr() + "]");
		System.out.println("medi_cd_arr = [" + getMedi_cd_arr() + "]");
		System.out.println("medi_ser_no_arr = [" + getMedi_ser_no_arr() + "]");
		System.out.println("deal_qty_arr = [" + getDeal_qty_arr() + "]");
		System.out.println("deal_uprc_arr = [" + getDeal_uprc_arr() + "]");
		System.out.println("dcrate_arr = [" + getDcrate_arr() + "]");
		System.out.println("deal_amt_arr = [" + getDeal_amt_arr() + "]");
		System.out.println("sale_clsf_arr = [" + getSale_clsf_arr() + "]");
		System.out.println("sendclsf_arr = [" + getSendclsf_arr() + "]");
		System.out.println("wh_cd_arr = [" + getWh_cd_arr() + "]");
		System.out.println("sell_type_arr = [" + getSell_type_arr() + "]");
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
String ordr_dt = req.getParameter("ordr_dt");
if( ordr_dt == null){
	System.out.println(this.toString+" : ordr_dt is null" );
}else{
	System.out.println(this.toString+" : ordr_dt is "+ordr_dt );
}
String ordr_grp_seq = req.getParameter("ordr_grp_seq");
if( ordr_grp_seq == null){
	System.out.println(this.toString+" : ordr_grp_seq is null" );
}else{
	System.out.println(this.toString+" : ordr_grp_seq is "+ordr_grp_seq );
}
String deal_dt = req.getParameter("deal_dt");
if( deal_dt == null){
	System.out.println(this.toString+" : deal_dt is null" );
}else{
	System.out.println(this.toString+" : deal_dt is "+deal_dt );
}
String deal_grp_seq = req.getParameter("deal_grp_seq");
if( deal_grp_seq == null){
	System.out.println(this.toString+" : deal_grp_seq is null" );
}else{
	System.out.println(this.toString+" : deal_grp_seq is "+deal_grp_seq );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
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
String send_plac_seq = req.getParameter("send_plac_seq");
if( send_plac_seq == null){
	System.out.println(this.toString+" : send_plac_seq is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq is "+send_plac_seq );
}
String send_plac_nm = req.getParameter("send_plac_nm");
if( send_plac_nm == null){
	System.out.println(this.toString+" : send_plac_nm is null" );
}else{
	System.out.println(this.toString+" : send_plac_nm is "+send_plac_nm );
}
String send_plac_tel_no_1 = req.getParameter("send_plac_tel_no_1");
if( send_plac_tel_no_1 == null){
	System.out.println(this.toString+" : send_plac_tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : send_plac_tel_no_1 is "+send_plac_tel_no_1 );
}
String send_plac_tel_no_2 = req.getParameter("send_plac_tel_no_2");
if( send_plac_tel_no_2 == null){
	System.out.println(this.toString+" : send_plac_tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : send_plac_tel_no_2 is "+send_plac_tel_no_2 );
}
String send_plac_tel_no_3 = req.getParameter("send_plac_tel_no_3");
if( send_plac_tel_no_3 == null){
	System.out.println(this.toString+" : send_plac_tel_no_3 is null" );
}else{
	System.out.println(this.toString+" : send_plac_tel_no_3 is "+send_plac_tel_no_3 );
}
String send_plac_ptph_no_1 = req.getParameter("send_plac_ptph_no_1");
if( send_plac_ptph_no_1 == null){
	System.out.println(this.toString+" : send_plac_ptph_no_1 is null" );
}else{
	System.out.println(this.toString+" : send_plac_ptph_no_1 is "+send_plac_ptph_no_1 );
}
String send_plac_ptph_no_2 = req.getParameter("send_plac_ptph_no_2");
if( send_plac_ptph_no_2 == null){
	System.out.println(this.toString+" : send_plac_ptph_no_2 is null" );
}else{
	System.out.println(this.toString+" : send_plac_ptph_no_2 is "+send_plac_ptph_no_2 );
}
String send_plac_ptph_no_3 = req.getParameter("send_plac_ptph_no_3");
if( send_plac_ptph_no_3 == null){
	System.out.println(this.toString+" : send_plac_ptph_no_3 is null" );
}else{
	System.out.println(this.toString+" : send_plac_ptph_no_3 is "+send_plac_ptph_no_3 );
}
String send_plac_fax_no_1 = req.getParameter("send_plac_fax_no_1");
if( send_plac_fax_no_1 == null){
	System.out.println(this.toString+" : send_plac_fax_no_1 is null" );
}else{
	System.out.println(this.toString+" : send_plac_fax_no_1 is "+send_plac_fax_no_1 );
}
String send_plac_fax_no_2 = req.getParameter("send_plac_fax_no_2");
if( send_plac_fax_no_2 == null){
	System.out.println(this.toString+" : send_plac_fax_no_2 is null" );
}else{
	System.out.println(this.toString+" : send_plac_fax_no_2 is "+send_plac_fax_no_2 );
}
String send_plac_fax_no_3 = req.getParameter("send_plac_fax_no_3");
if( send_plac_fax_no_3 == null){
	System.out.println(this.toString+" : send_plac_fax_no_3 is null" );
}else{
	System.out.println(this.toString+" : send_plac_fax_no_3 is "+send_plac_fax_no_3 );
}
String send_plac_zip_1 = req.getParameter("send_plac_zip_1");
if( send_plac_zip_1 == null){
	System.out.println(this.toString+" : send_plac_zip_1 is null" );
}else{
	System.out.println(this.toString+" : send_plac_zip_1 is "+send_plac_zip_1 );
}
String send_plac_zip_2 = req.getParameter("send_plac_zip_2");
if( send_plac_zip_2 == null){
	System.out.println(this.toString+" : send_plac_zip_2 is null" );
}else{
	System.out.println(this.toString+" : send_plac_zip_2 is "+send_plac_zip_2 );
}
String send_plac_addr = req.getParameter("send_plac_addr");
if( send_plac_addr == null){
	System.out.println(this.toString+" : send_plac_addr is null" );
}else{
	System.out.println(this.toString+" : send_plac_addr is "+send_plac_addr );
}
String send_plac_dtls_addr = req.getParameter("send_plac_dtls_addr");
if( send_plac_dtls_addr == null){
	System.out.println(this.toString+" : send_plac_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : send_plac_dtls_addr is "+send_plac_dtls_addr );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String mode_arr = req.getParameter("mode_arr");
if( mode_arr == null){
	System.out.println(this.toString+" : mode_arr is null" );
}else{
	System.out.println(this.toString+" : mode_arr is "+mode_arr );
}
String ordr_seq_arr = req.getParameter("ordr_seq_arr");
if( ordr_seq_arr == null){
	System.out.println(this.toString+" : ordr_seq_arr is null" );
}else{
	System.out.println(this.toString+" : ordr_seq_arr is "+ordr_seq_arr );
}
String deal_seq_arr = req.getParameter("deal_seq_arr");
if( deal_seq_arr == null){
	System.out.println(this.toString+" : deal_seq_arr is null" );
}else{
	System.out.println(this.toString+" : deal_seq_arr is "+deal_seq_arr );
}
String medi_cd_arr = req.getParameter("medi_cd_arr");
if( medi_cd_arr == null){
	System.out.println(this.toString+" : medi_cd_arr is null" );
}else{
	System.out.println(this.toString+" : medi_cd_arr is "+medi_cd_arr );
}
String medi_ser_no_arr = req.getParameter("medi_ser_no_arr");
if( medi_ser_no_arr == null){
	System.out.println(this.toString+" : medi_ser_no_arr is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no_arr is "+medi_ser_no_arr );
}
String deal_qty_arr = req.getParameter("deal_qty_arr");
if( deal_qty_arr == null){
	System.out.println(this.toString+" : deal_qty_arr is null" );
}else{
	System.out.println(this.toString+" : deal_qty_arr is "+deal_qty_arr );
}
String deal_uprc_arr = req.getParameter("deal_uprc_arr");
if( deal_uprc_arr == null){
	System.out.println(this.toString+" : deal_uprc_arr is null" );
}else{
	System.out.println(this.toString+" : deal_uprc_arr is "+deal_uprc_arr );
}
String dcrate_arr = req.getParameter("dcrate_arr");
if( dcrate_arr == null){
	System.out.println(this.toString+" : dcrate_arr is null" );
}else{
	System.out.println(this.toString+" : dcrate_arr is "+dcrate_arr );
}
String deal_amt_arr = req.getParameter("deal_amt_arr");
if( deal_amt_arr == null){
	System.out.println(this.toString+" : deal_amt_arr is null" );
}else{
	System.out.println(this.toString+" : deal_amt_arr is "+deal_amt_arr );
}
String sale_clsf_arr = req.getParameter("sale_clsf_arr");
if( sale_clsf_arr == null){
	System.out.println(this.toString+" : sale_clsf_arr is null" );
}else{
	System.out.println(this.toString+" : sale_clsf_arr is "+sale_clsf_arr );
}
String sendclsf_arr = req.getParameter("sendclsf_arr");
if( sendclsf_arr == null){
	System.out.println(this.toString+" : sendclsf_arr is null" );
}else{
	System.out.println(this.toString+" : sendclsf_arr is "+sendclsf_arr );
}
String wh_cd_arr = req.getParameter("wh_cd_arr");
if( wh_cd_arr == null){
	System.out.println(this.toString+" : wh_cd_arr is null" );
}else{
	System.out.println(this.toString+" : wh_cd_arr is "+wh_cd_arr );
}
String sell_type_arr = req.getParameter("sell_type_arr");
if( sell_type_arr == null){
	System.out.println(this.toString+" : sell_type_arr is null" );
}else{
	System.out.println(this.toString+" : sell_type_arr is "+sell_type_arr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));
String ordr_grp_seq = Util.checkString(req.getParameter("ordr_grp_seq"));
String deal_dt = Util.checkString(req.getParameter("deal_dt"));
String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));
String send_plac_nm = Util.checkString(req.getParameter("send_plac_nm"));
String send_plac_tel_no_1 = Util.checkString(req.getParameter("send_plac_tel_no_1"));
String send_plac_tel_no_2 = Util.checkString(req.getParameter("send_plac_tel_no_2"));
String send_plac_tel_no_3 = Util.checkString(req.getParameter("send_plac_tel_no_3"));
String send_plac_ptph_no_1 = Util.checkString(req.getParameter("send_plac_ptph_no_1"));
String send_plac_ptph_no_2 = Util.checkString(req.getParameter("send_plac_ptph_no_2"));
String send_plac_ptph_no_3 = Util.checkString(req.getParameter("send_plac_ptph_no_3"));
String send_plac_fax_no_1 = Util.checkString(req.getParameter("send_plac_fax_no_1"));
String send_plac_fax_no_2 = Util.checkString(req.getParameter("send_plac_fax_no_2"));
String send_plac_fax_no_3 = Util.checkString(req.getParameter("send_plac_fax_no_3"));
String send_plac_zip_1 = Util.checkString(req.getParameter("send_plac_zip_1"));
String send_plac_zip_2 = Util.checkString(req.getParameter("send_plac_zip_2"));
String send_plac_addr = Util.checkString(req.getParameter("send_plac_addr"));
String send_plac_dtls_addr = Util.checkString(req.getParameter("send_plac_dtls_addr"));
String remk = Util.checkString(req.getParameter("remk"));
String mode_arr = Util.checkString(req.getParameter("mode_arr"));
String ordr_seq_arr = Util.checkString(req.getParameter("ordr_seq_arr"));
String deal_seq_arr = Util.checkString(req.getParameter("deal_seq_arr"));
String medi_cd_arr = Util.checkString(req.getParameter("medi_cd_arr"));
String medi_ser_no_arr = Util.checkString(req.getParameter("medi_ser_no_arr"));
String deal_qty_arr = Util.checkString(req.getParameter("deal_qty_arr"));
String deal_uprc_arr = Util.checkString(req.getParameter("deal_uprc_arr"));
String dcrate_arr = Util.checkString(req.getParameter("dcrate_arr"));
String deal_amt_arr = Util.checkString(req.getParameter("deal_amt_arr"));
String sale_clsf_arr = Util.checkString(req.getParameter("sale_clsf_arr"));
String sendclsf_arr = Util.checkString(req.getParameter("sendclsf_arr"));
String wh_cd_arr = Util.checkString(req.getParameter("wh_cd_arr"));
String sell_type_arr = Util.checkString(req.getParameter("sell_type_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String ordr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_dt")));
String ordr_grp_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_grp_seq")));
String deal_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_dt")));
String deal_grp_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_grp_seq")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
String send_plac_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq")));
String send_plac_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_nm")));
String send_plac_tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_tel_no_1")));
String send_plac_tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_tel_no_2")));
String send_plac_tel_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_tel_no_3")));
String send_plac_ptph_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_ptph_no_1")));
String send_plac_ptph_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_ptph_no_2")));
String send_plac_ptph_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_ptph_no_3")));
String send_plac_fax_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_fax_no_1")));
String send_plac_fax_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_fax_no_2")));
String send_plac_fax_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_fax_no_3")));
String send_plac_zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_zip_1")));
String send_plac_zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_zip_2")));
String send_plac_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_addr")));
String send_plac_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_dtls_addr")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String mode_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_arr")));
String ordr_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_seq_arr")));
String deal_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_seq_arr")));
String medi_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_arr")));
String medi_ser_no_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no_arr")));
String deal_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_qty_arr")));
String deal_uprc_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_uprc_arr")));
String dcrate_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate_arr")));
String deal_amt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_amt_arr")));
String sale_clsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf_arr")));
String sendclsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf_arr")));
String wh_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd_arr")));
String sell_type_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_type_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setOrdr_dt(ordr_dt);
dm.setOrdr_grp_seq(ordr_grp_seq);
dm.setDeal_dt(deal_dt);
dm.setDeal_grp_seq(deal_grp_seq);
dm.setMedi_clsf(medi_clsf);
dm.setBasi_dt(basi_dt);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
dm.setSend_plac_seq(send_plac_seq);
dm.setSend_plac_nm(send_plac_nm);
dm.setSend_plac_tel_no_1(send_plac_tel_no_1);
dm.setSend_plac_tel_no_2(send_plac_tel_no_2);
dm.setSend_plac_tel_no_3(send_plac_tel_no_3);
dm.setSend_plac_ptph_no_1(send_plac_ptph_no_1);
dm.setSend_plac_ptph_no_2(send_plac_ptph_no_2);
dm.setSend_plac_ptph_no_3(send_plac_ptph_no_3);
dm.setSend_plac_fax_no_1(send_plac_fax_no_1);
dm.setSend_plac_fax_no_2(send_plac_fax_no_2);
dm.setSend_plac_fax_no_3(send_plac_fax_no_3);
dm.setSend_plac_zip_1(send_plac_zip_1);
dm.setSend_plac_zip_2(send_plac_zip_2);
dm.setSend_plac_addr(send_plac_addr);
dm.setSend_plac_dtls_addr(send_plac_dtls_addr);
dm.setRemk(remk);
dm.setMode_arr(mode_arr);
dm.setOrdr_seq_arr(ordr_seq_arr);
dm.setDeal_seq_arr(deal_seq_arr);
dm.setMedi_cd_arr(medi_cd_arr);
dm.setMedi_ser_no_arr(medi_ser_no_arr);
dm.setDeal_qty_arr(deal_qty_arr);
dm.setDeal_uprc_arr(deal_uprc_arr);
dm.setDcrate_arr(dcrate_arr);
dm.setDeal_amt_arr(deal_amt_arr);
dm.setSale_clsf_arr(sale_clsf_arr);
dm.setSendclsf_arr(sendclsf_arr);
dm.setWh_cd_arr(wh_cd_arr);
dm.setSell_type_arr(sell_type_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 20:57:50 KST 2009 */