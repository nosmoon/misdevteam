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


public class TN_LNK_3051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmsidx;
	public String deptidx;
	public String filename;
	public String filepath;

	public TN_LNK_3051_LCURLISTRecord(){}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setFilename(String filename){
		this.filename = filename;
	}

	public void setFilepath(String filepath){
		this.filepath = filepath;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getFilename(){
		return this.filename;
	}

	public String getFilepath(){
		return this.filepath;
	}
}

/* 작성시간 : Mon Aug 22 19:24:28 KST 2016 */