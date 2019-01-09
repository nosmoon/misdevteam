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


public class HD_CRCL_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String row_seq;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String emp_nm;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String flnm;
	public String paty_crc_cd;
	public String frdt;
	public String todt;
	public String bank_cd;
	public String bank_acct_no;

	public HD_CRCL_1101_LCURLISTRecord(){}

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

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPaty_crc_cd(String paty_crc_cd){
		this.paty_crc_cd = paty_crc_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_acct_no(String bank_acct_no){
		this.bank_acct_no = bank_acct_no;
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

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPaty_crc_cd(){
		return this.paty_crc_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_acct_no(){
		return this.bank_acct_no;
	}
}

/* 작성시간 : Tue Feb 17 17:17:01 KST 2009 */