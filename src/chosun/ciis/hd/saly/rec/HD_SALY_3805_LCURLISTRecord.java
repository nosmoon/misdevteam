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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3805_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String saly_yy;
	public String saly_no;
	public String salyvar_sum;
	public String hsty_sum;

	public HD_SALY_3805_LCURLISTRecord(){}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setSalyvar_sum(String salyvar_sum){
		this.salyvar_sum = salyvar_sum;
	}

	public void setHsty_sum(String hsty_sum){
		this.hsty_sum = hsty_sum;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getSalyvar_sum(){
		return this.salyvar_sum;
	}

	public String getHsty_sum(){
		return this.hsty_sum;
	}
}

/* 작성시간 : Wed Mar 16 11:12:54 KST 2016 */