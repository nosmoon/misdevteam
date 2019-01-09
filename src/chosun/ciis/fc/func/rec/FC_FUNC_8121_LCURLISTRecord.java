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


public class FC_FUNC_8121_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String column_nm;
	public String leas_a;
	public String leas_b;
	public String leas_c;
	public String leas_d;

	public FC_FUNC_8121_LCURLISTRecord(){}

	public void setColumn_nm(String column_nm){
		this.column_nm = column_nm;
	}

	public void setLeas_a(String leas_a){
		this.leas_a = leas_a;
	}

	public void setLeas_b(String leas_b){
		this.leas_b = leas_b;
	}

	public void setLeas_c(String leas_c){
		this.leas_c = leas_c;
	}

	public void setLeas_d(String leas_d){
		this.leas_d = leas_d;
	}

	public String getColumn_nm(){
		return this.column_nm;
	}

	public String getLeas_a(){
		return this.leas_a;
	}

	public String getLeas_b(){
		return this.leas_b;
	}

	public String getLeas_c(){
		return this.leas_c;
	}

	public String getLeas_d(){
		return this.leas_d;
	}
}

/* 작성시간 : Wed Apr 22 16:48:37 KST 2009 */