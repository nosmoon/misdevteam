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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_6000_LCURLIST14Record extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String prz_dt;
	public String prz_nm;
	public String prz_resn;
	public String prz_amt;
	public String prz_ptcr;

	public HD_INFO_6000_LCURLIST14Record(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setPrz_dt(String prz_dt){
		this.prz_dt = prz_dt;
	}

	public void setPrz_nm(String prz_nm){
		this.prz_nm = prz_nm;
	}

	public void setPrz_resn(String prz_resn){
		this.prz_resn = prz_resn;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public void setPrz_ptcr(String prz_ptcr){
		this.prz_ptcr = prz_ptcr;
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

	public String getPrz_dt(){
		return this.prz_dt;
	}

	public String getPrz_nm(){
		return this.prz_nm;
	}

	public String getPrz_resn(){
		return this.prz_resn;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}

	public String getPrz_ptcr(){
		return this.prz_ptcr;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */