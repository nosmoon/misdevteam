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


package chosun.ciis.hd.crcl.rec;

import java.sql.*;
import chosun.ciis.hd.crcl.dm.*;
import chosun.ciis.hd.crcl.ds.*;

/**
 * 
 */


public class HD_CRCL_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String row_seq;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String paty_crc_cd;
	public String paty_crc_nm;
	public String fix_fix_rate_clsf;	
	public String paty_crc_dus;
	public String entr_dt;
	public String lve_dt;
	public String entr_yn_nm;
	public String entr_yn;

	public HD_CRCL_1201_LCURLISTRecord(){}

	public void setRow_seq(String row_seq){
		this.row_seq = row_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPaty_crc_cd(String paty_crc_cd){
		this.paty_crc_cd = paty_crc_cd;
	}

	public void setPaty_crc_nm(String paty_crc_nm){
		this.paty_crc_nm = paty_crc_nm;
	}

	public void setFix_fix_rate_clsf(String fix_fix_rate_clsf){
		this.fix_fix_rate_clsf = fix_fix_rate_clsf;
	}
	
	public void setPaty_crc_dus(String paty_crc_dus){
		this.paty_crc_dus = paty_crc_dus;
	}

	public void setEntr_dt(String entr_dt){
		this.entr_dt = entr_dt;
	}

	public void setLve_dt(String lve_dt){
		this.lve_dt = lve_dt;
	}

	public void setEntr_yn_nm(String entr_yn_nm){
		this.entr_yn_nm = entr_yn_nm;
	}
	
	public void setEntr_yn(String entr_yn){
		this.entr_yn = entr_yn;
	}

	public String getRow_seq(){
		return this.row_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPaty_crc_cd(){
		return this.paty_crc_cd;
	}

	public String getPaty_crc_nm(){
		return this.paty_crc_nm;
	}

	public String getFix_fix_rate_clsf(){
		return this.fix_fix_rate_clsf;
	}
	
	public String getPaty_crc_dus(){
		return this.paty_crc_dus;
	}

	public String getEntr_dt(){
		return this.entr_dt;
	}

	public String getLve_dt(){
		return this.lve_dt;
	}

	public String getEntr_yn_nm(){
		return this.entr_yn_nm;
	}
	
	public String getEntr_yn(){
		return this.entr_yn;
	}
}

/* 작성시간 : Wed Feb 18 20:33:06 KST 2009 */