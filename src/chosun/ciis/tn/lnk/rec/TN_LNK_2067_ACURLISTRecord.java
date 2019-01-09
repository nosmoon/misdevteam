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


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_2067_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmsidx;
	public String form_nm;
	public String form_seq;
	public String file_data;

	public TN_LNK_2067_ACURLISTRecord(){}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public void setForm_nm(String form_nm){
		this.form_nm = form_nm;
	}

	public void setForm_seq(String form_seq){
		this.form_seq = form_seq;
	}

	public void setFile_data(String file_data){
		this.file_data = file_data;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}

	public String getForm_nm(){
		return this.form_nm;
	}

	public String getForm_seq(){
		return this.form_seq;
	}

	public String getFile_data(){
		return this.file_data;
	}
}

/* 작성시간 : Fri Aug 12 14:04:55 KST 2016 */