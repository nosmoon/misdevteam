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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1902_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String eis_aset_clsf;
	public String acqr_dt;
	public String aset_size;
	public String aset_usag;
	public String aset_qunt_cnt;
	public String basi_mrkt_pric;
	public String occr_dt;
	public String occr_seq;
	public String sub_seq;

	public AS_ASET_1902_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setEis_aset_clsf(String eis_aset_clsf){
		this.eis_aset_clsf = eis_aset_clsf;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setAset_size(String aset_size){
		this.aset_size = aset_size;
	}

	public void setAset_usag(String aset_usag){
		this.aset_usag = aset_usag;
	}

	public void setAset_qunt_cnt(String aset_qunt_cnt){
		this.aset_qunt_cnt = aset_qunt_cnt;
	}

	public void setBasi_mrkt_pric(String basi_mrkt_pric){
		this.basi_mrkt_pric = basi_mrkt_pric;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getEis_aset_clsf(){
		return this.eis_aset_clsf;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getAset_size(){
		return this.aset_size;
	}

	public String getAset_usag(){
		return this.aset_usag;
	}

	public String getAset_qunt_cnt(){
		return this.aset_qunt_cnt;
	}

	public String getBasi_mrkt_pric(){
		return this.basi_mrkt_pric;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}
}

/* 작성시간 : Tue Aug 11 09:25:33 KST 2009 */