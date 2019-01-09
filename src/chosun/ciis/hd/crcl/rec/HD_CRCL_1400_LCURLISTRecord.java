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


public class HD_CRCL_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String paty_crc_nm;
	public String fix_fix_rate_clsf;	
	public String paty_crc_dus;
	public String entr_dt;
	public String lve_dt;
	public String entr_yn;

	public HD_CRCL_1400_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
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

	public void setEntr_yn(String entr_yn){
		this.entr_yn = entr_yn;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
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

	public String getEntr_yn(){
		return this.entr_yn;
	}
}

/* 작성시간 : Wed Feb 18 14:32:07 KST 2009 */