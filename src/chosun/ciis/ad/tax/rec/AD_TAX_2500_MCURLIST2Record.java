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


package chosun.ciis.ad.tax.rec;

import java.sql.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.ds.*;

/**
 * 
 */


public class AD_TAX_2500_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_abrv_nm;

	public AD_TAX_2500_MCURLIST2Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}
}

/* 작성시간 : Thu Jan 26 11:23:32 KST 2012 */