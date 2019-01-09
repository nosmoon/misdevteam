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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2510_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String sale_yymm;
	public String clam;
	public String clam_amt;
	public String qunt;
	public String amt;
	public String card_qunt;
	public String card_coms;
	public String card_amt;

	public SP_SAL_2510_LCURLIST1Record(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setClam(String clam){
		this.clam = clam;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setCard_qunt(String card_qunt){
		this.card_qunt = card_qunt;
	}

	public void setCard_coms(String card_coms){
		this.card_coms = card_coms;
	}

	public void setCard_amt(String card_amt){
		this.card_amt = card_amt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getClam(){
		return this.clam;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getCard_qunt(){
		return this.card_qunt;
	}

	public String getCard_coms(){
		return this.card_coms;
	}

	public String getCard_amt(){
		return this.card_amt;
	}
}

/* 작성시간 : Mon Jul 16 16:37:48 KST 2012 */