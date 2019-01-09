/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
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


public class SE_COMM_2310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_item_cd;
	public String bns_item_nm;

	public SE_COMM_2310_LCURLISTRecord(){}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}
}

/* 작성시간 : Fri Aug 25 10:27:04 KST 2017 */