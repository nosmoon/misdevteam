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


public class HD_CRCL_1300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String row_num;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String paty_crc_cd;
	public String fix_fix_rate_clsf;	
	public String paty_crc_dus;
	public String entr_dt;
	public String lve_dt;
	public String entr_yn_nm;
	public String entr_yn;

	public HD_CRCL_1300_LCURLISTRecord(){}

	public void setRow_num(String row_num){
		this.row_num = row_num;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setPaty_crc_cd(String paty_crc_cd){
		this.paty_crc_cd = paty_crc_cd;
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
	
	public String getRow_num(){
		return this.row_num;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getPaty_crc_cd(){
		return this.paty_crc_cd;
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

/* 작성시간 : Thu Feb 19 10:56:44 KST 2009 */