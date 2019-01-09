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


package chosun.ciis.as.redm.rec;

import java.sql.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.ds.*;

/**
 * 
 */


public class AS_REDM_1301_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_dt;
	public String aply_dt_label;

	public AS_REDM_1301_MCURLISTRecord(){}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setAply_dt_label(String aply_dt_label){
		this.aply_dt_label = aply_dt_label;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getAply_dt_label(){
		return this.aply_dt_label;
	}
}

/* 작성시간 : Thu May 07 13:36:15 KST 2009 */