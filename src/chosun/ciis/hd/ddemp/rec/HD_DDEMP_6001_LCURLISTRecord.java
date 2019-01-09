/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.ddemp.rec;

import java.sql.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */


public class HD_DDEMP_6001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;

	public HD_DDEMP_6001_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}
	
	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}
	
	public String getDlco_no(){
		return this.dlco_no;
	}
	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* 작성시간 : Mon Sep 04 16:48:48 KST 2017 */