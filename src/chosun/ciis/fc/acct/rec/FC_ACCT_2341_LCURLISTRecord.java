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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2341_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String titl;
	public String reso_amt;
	public String impt_expn_clsf;
	public String expn_hope_dt;
	public String expn_clsf;

	public FC_ACCT_2341_LCURLISTRecord(){}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setImpt_expn_clsf(String impt_expn_clsf){
		this.impt_expn_clsf = impt_expn_clsf;
	}

	public void setExpn_hope_dt(String expn_hope_dt){
		this.expn_hope_dt = expn_hope_dt;
	}

	public void setExpn_clsf(String expn_clsf){
		this.expn_clsf = expn_clsf;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getImpt_expn_clsf(){
		return this.impt_expn_clsf;
	}

	public String getExpn_hope_dt(){
		return this.expn_hope_dt;
	}

	public String getExpn_clsf(){
		return this.expn_clsf;
	}
}

/* 작성시간 : Sat Apr 11 09:54:13 KST 2009 */