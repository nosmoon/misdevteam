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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_2015_1220_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String upload_dt;
	public String add_file_nm;
	public String add_file;

	public HD_YADJM_2015_1220_LCURLIST6Record(){}

	public void setUpload_dt(String upload_dt){
		this.upload_dt = upload_dt;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setAdd_file(String add_file){
		this.add_file = add_file;
	}

	public String getUpload_dt(){
		return this.upload_dt;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public String getAdd_file(){
		return this.add_file;
	}
}

/* 작성시간 : Fri Jan 15 10:37:28 KST 2016 */