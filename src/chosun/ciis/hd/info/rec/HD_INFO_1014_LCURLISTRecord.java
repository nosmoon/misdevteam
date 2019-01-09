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


public class HD_INFO_1014_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String entr_dt;
	public String lve_dt;

	public HD_INFO_1014_LCURLISTRecord(){}

	public void setEntr_dt(String entr_dt){
		this.entr_dt = entr_dt;
	}

	public void setLve_dt(String lve_dt){
		this.lve_dt = lve_dt;
	}

	public String getEntr_dt(){
		return this.entr_dt;
	}

	public String getLve_dt(){
		return this.lve_dt;
	}
}

/* 작성시간 : Thu Sep 17 21:42:39 KST 2009 */