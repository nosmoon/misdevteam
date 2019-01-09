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


public class MT_CLOSE_2002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String matr_cd;
	public String medi_cd;
	public String sect_cd;
	public String cdnm;
	public String rqunt;
	public String qunt;
	public String amt;
	public String bi_avg;

	public MT_CLOSE_2002_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setRqunt(String rqunt){
		this.rqunt = rqunt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setBi_avg(String bi_avg){
		this.bi_avg = bi_avg;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getRqunt(){
		return this.rqunt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getBi_avg(){
		return this.bi_avg;
	}
}

/* 작성시간 : Tue Jul 21 11:36:29 KST 2009 */