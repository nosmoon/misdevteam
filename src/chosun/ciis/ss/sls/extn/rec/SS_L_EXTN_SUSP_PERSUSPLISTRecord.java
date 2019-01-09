/***************************************************************************************************
* 파일명 : .java
* 기능 : * 확장현황-중지현황-목록(중지건별)
* 작성일자 : 2010-01-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 *  확장현황-중지현황-목록(중지건별)
 */

public class SS_L_EXTN_SUSP_PERSUSPLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bonm;
	public String medinm;
	public String rdr_no;
	public String rdrnm;
	public String rdrtel_no;
	public String rdrptph_no;
	public String subsfr_dt;
	public String valmm;
	public String subsqty;
	public String clantmonth;
	public String totsubmonth;
	public String oprenvclsfcd;
	public String suspdt;
	public String suspnm;
	public String remk;

	public SS_L_EXTN_SUSP_PERSUSPLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setClantmonth(String clantmonth){
		this.clantmonth = clantmonth;
	}

	public void setTotsubmonth(String totsubmonth){
		this.totsubmonth = totsubmonth;
	}

	public void setOprenvclsfcd(String oprenvclsfcd){
		this.oprenvclsfcd = oprenvclsfcd;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspnm(String suspnm){
		this.suspnm = suspnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSubsqty(){
		return this.subsqty;
	}

	public String getClantmonth(){
		return this.clantmonth;
	}

	public String getTotsubmonth(){
		return this.totsubmonth;
	}

	public String getOprenvclsfcd(){
		return this.oprenvclsfcd;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspnm(){
		return this.suspnm;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Jan 06 14:45:44 KST 2010 */