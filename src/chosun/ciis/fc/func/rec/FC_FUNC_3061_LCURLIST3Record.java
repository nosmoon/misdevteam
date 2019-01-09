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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_3061_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String newspap_sale;
	public String publis_sale;
	public String lent_amt;
	public String etc_amt;

	public FC_FUNC_3061_LCURLIST3Record(){}

	public void setNewspap_sale(String newspap_sale){
		this.newspap_sale = newspap_sale;
	}

	public void setPublis_sale(String publis_sale){
		this.publis_sale = publis_sale;
	}

	public void setLent_amt(String lent_amt){
		this.lent_amt = lent_amt;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public String getNewspap_sale(){
		return this.newspap_sale;
	}

	public String getPublis_sale(){
		return this.publis_sale;
	}

	public String getLent_amt(){
		return this.lent_amt;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}
}

/* 작성시간 : Tue Mar 31 14:44:45 KST 2009 */