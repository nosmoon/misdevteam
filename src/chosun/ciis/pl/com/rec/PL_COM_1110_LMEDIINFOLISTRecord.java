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


package chosun.ciis.pl.com.rec;

import java.sql.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.ds.*;

/**
 * 
 */


public class PL_COM_1110_LMEDIINFOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_cdnm;
	public String medi_ser_no;
	public String medi_nm;
	public String issu_cmpy;
	public String issu_cmpynm;
	public String medi_clsf;
	public String medi_clsfnm;
	public String basi_yymm;
	public String reg_dt;
	public String uprc;
	public String dcrate;
	public String type;
	public String typenm;
	public String absence_clsf;
	public String absence_clsfnm;
	public String absence_dt;
	public String ser_no_basi;
	public String issu_clsf;
	public String end_ser_no;

	public PL_COM_1110_LMEDIINFOLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cdnm(String medi_cdnm){
		this.medi_cdnm = medi_cdnm;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setIssu_cmpy(String issu_cmpy){
		this.issu_cmpy = issu_cmpy;
	}

	public void setIssu_cmpynm(String issu_cmpynm){
		this.issu_cmpynm = issu_cmpynm;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMedi_clsfnm(String medi_clsfnm){
		this.medi_clsfnm = medi_clsfnm;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setTypenm(String typenm){
		this.typenm = typenm;
	}

	public void setAbsence_clsf(String absence_clsf){
		this.absence_clsf = absence_clsf;
	}

	public void setAbsence_clsfnm(String absence_clsfnm){
		this.absence_clsfnm = absence_clsfnm;
	}

	public void setAbsence_dt(String absence_dt){
		this.absence_dt = absence_dt;
	}

	public void setSer_no_basi(String ser_no_basi){
		this.ser_no_basi = ser_no_basi;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setEnd_ser_no(String end_ser_no){
		this.end_ser_no = end_ser_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cdnm(){
		return this.medi_cdnm;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getIssu_cmpy(){
		return this.issu_cmpy;
	}

	public String getIssu_cmpynm(){
		return this.issu_cmpynm;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMedi_clsfnm(){
		return this.medi_clsfnm;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDcrate(){
		return this.dcrate;
	}

	public String getType(){
		return this.type;
	}

	public String getTypenm(){
		return this.typenm;
	}

	public String getAbsence_clsf(){
		return this.absence_clsf;
	}

	public String getAbsence_clsfnm(){
		return this.absence_clsfnm;
	}

	public String getAbsence_dt(){
		return this.absence_dt;
	}

	public String getSer_no_basi(){
		return this.ser_no_basi;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getEnd_ser_no(){
		return this.end_ser_no;
	}
}

/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */