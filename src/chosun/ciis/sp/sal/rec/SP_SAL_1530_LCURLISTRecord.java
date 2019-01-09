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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_1530_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sggssno;
	public String ern;
	public String dlco_nm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String make_dt;
	public String pch_konglan;
	public String suply_amt;
	public String vat_amt;
	public String remk;
	public String remk2;
	public String mmdd;
	public String item_2;
	public String std;
	public String qunt;
	public String uprc;
	public String suply_amt_2;
	public String vat_amt_2;
	public String vexc_cmpy_cd;
	public String tax_stmt_aprv_yn;
	public String ern2;
	public String dlco_nm2;
	public String presi_nm2;
	public String addr2;
	public String bizcond2;
	public String item2;
	public String erplace_cd;

	public SP_SAL_1530_LCURLISTRecord(){}

	public void setSggssno(String sggssno){
		this.sggssno = sggssno;
	}

	public void setErn(String ern){
		this.ern = ern;
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

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setPch_konglan(String pch_konglan){
		this.pch_konglan = pch_konglan;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRemk2(String remk2){
		this.remk2 = remk2;
	}

	public void setMmdd(String mmdd){
		this.mmdd = mmdd;
	}

	public void setItem_2(String item_2){
		this.item_2 = item_2;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSuply_amt_2(String suply_amt_2){
		this.suply_amt_2 = suply_amt_2;
	}

	public void setVat_amt_2(String vat_amt_2){
		this.vat_amt_2 = vat_amt_2;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setTax_stmt_aprv_yn(String tax_stmt_aprv_yn){
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
	}

	public void setErn2(String ern2){
		this.ern2 = ern2;
	}

	public void setDlco_nm2(String dlco_nm2){
		this.dlco_nm2 = dlco_nm2;
	}

	public void setPresi_nm2(String presi_nm2){
		this.presi_nm2 = presi_nm2;
	}

	public void setAddr2(String addr2){
		this.addr2 = addr2;
	}

	public void setBizcond2(String bizcond2){
		this.bizcond2 = bizcond2;
	}

	public void setItem2(String item2){
		this.item2 = item2;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getSggssno(){
		return this.sggssno;
	}

	public String getErn(){
		return this.ern;
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

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getPch_konglan(){
		return this.pch_konglan;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRemk2(){
		return this.remk2;
	}

	public String getMmdd(){
		return this.mmdd;
	}

	public String getItem_2(){
		return this.item_2;
	}

	public String getStd(){
		return this.std;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSuply_amt_2(){
		return this.suply_amt_2;
	}

	public String getVat_amt_2(){
		return this.vat_amt_2;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getTax_stmt_aprv_yn(){
		return this.tax_stmt_aprv_yn;
	}

	public String getErn2(){
		return this.ern2;
	}

	public String getDlco_nm2(){
		return this.dlco_nm2;
	}

	public String getPresi_nm2(){
		return this.presi_nm2;
	}

	public String getAddr2(){
		return this.addr2;
	}

	public String getBizcond2(){
		return this.bizcond2;
	}

	public String getItem2(){
		return this.item2;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}
}

/* 작성시간 : Sun Aug 12 14:53:31 KST 2012 */