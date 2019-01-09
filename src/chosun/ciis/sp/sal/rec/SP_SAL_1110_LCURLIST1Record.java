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


public class SP_SAL_1110_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String sale_yymm;
	public String dlco_no;
	public String dlco_nm;
	public String sale_item;
	public String sale_cost;
	public String qunt;
	public String clamt_mthd;
	public String suply_amt;
	public String vat_amt;
	public String ordr_amt;
	public String ipln_amt;
	public String ipln_meda_amt;
	public String ordr_dt;
	public String suply_pers_ern;
	public String gds_no;
	public String gds_nm;

	public SP_SAL_1110_LCURLIST1Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSale_item(String sale_item){
		this.sale_item = sale_item;
	}

	public void setSale_cost(String sale_cost){
		this.sale_cost = sale_cost;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setClamt_mthd(String clamt_mthd){
		this.clamt_mthd = clamt_mthd;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setOrdr_amt(String ordr_amt){
		this.ordr_amt = ordr_amt;
	}

	public void setIpln_amt(String ipln_amt){
		this.ipln_amt = ipln_amt;
	}

	public void setIpln_meda_amt(String ipln_meda_amt){
		this.ipln_meda_amt = ipln_meda_amt;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setSuply_pers_ern(String suply_pers_ern){
		this.suply_pers_ern = suply_pers_ern;
	}

	public void setGds_no(String gds_no){
		this.gds_no = gds_no;
	}

	public void setGds_nm(String gds_nm){
		this.gds_nm = gds_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSale_item(){
		return this.sale_item;
	}

	public String getSale_cost(){
		return this.sale_cost;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getClamt_mthd(){
		return this.clamt_mthd;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getOrdr_amt(){
		return this.ordr_amt;
	}

	public String getIpln_amt(){
		return this.ipln_amt;
	}

	public String getIpln_meda_amt(){
		return this.ipln_meda_amt;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getSuply_pers_ern(){
		return this.suply_pers_ern;
	}

	public String getGds_no(){
		return this.gds_no;
	}

	public String getGds_nm(){
		return this.gds_nm;
	}
}

/* 작성시간 : Fri Aug 10 20:30:19 KST 2012 */