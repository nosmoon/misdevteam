/***************************************************************************************************
* 파일명 : SE_COMM_2000_MCURLISTRecord.java
* 기능 :   발송처 팝업
* 작성일자 : 2009.01.23
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_2000_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;

	public SE_COMM_2000_MCURLISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}
}

/* 작성시간 : Fri Jan 23 09:27:17 KST 2009 */