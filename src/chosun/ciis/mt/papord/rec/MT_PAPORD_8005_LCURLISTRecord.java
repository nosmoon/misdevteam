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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_8005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String use_a;
	public String use_c;
	public String use_b;

	public MT_PAPORD_8005_LCURLISTRecord(){}

	public void setUse_a(String use_a){
		this.use_a = use_a;
	}

	public void setUse_c(String use_c){
		this.use_c = use_c;
	}

	public void setUse_b(String use_b){
		this.use_b = use_b;
	}

	public String getUse_a(){
		return this.use_a;
	}

	public String getUse_c(){
		return this.use_c;
	}

	public String getUse_b(){
		return this.use_b;
	}
}

/* 작성시간 : Thu Sep 08 17:55:17 KST 2016 */