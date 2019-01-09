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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_7000_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String dstb_rat_cd;
	public String medi_cd;
	public String sect_cd;
	public String amt;
	public String hap_amt;
	public String bi_amt;

	public MT_CLOSE_7000_LCURLIST3Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setHap_amt(String hap_amt){
		this.hap_amt = hap_amt;
	}

	public void setBi_amt(String bi_amt){
		this.bi_amt = bi_amt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getHap_amt(){
		return this.hap_amt;
	}

	public String getBi_amt(){
		return this.bi_amt;
	}
}

/* 작성시간 : Mon Jul 13 16:12:58 KST 2009 */