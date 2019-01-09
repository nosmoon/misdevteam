/***************************************************************************************************
* 파일명 : SS_L_MO_SVYCURCOMMLISTRecord.java
* 기능 : 
* 작성일자 : 2015.11.11
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_MO_SVYSVYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String svyid;
	public String svynm;
	public String sttdt;
	public String enddt;
	public int qstsnum;
	public String url;
	public String stat;
	public String camptype;
	public String basicdt;

	public SS_L_MO_SVYSVYCURRecord(){}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public void setSvynm(String svynm){
		this.svynm = svynm;
	}

	public void setSttdt(String sttdt){
		this.sttdt = sttdt;
	}

	public void setEnddt(String enddt){
		this.enddt = enddt;
	}

	public void setQstsnum(int qstsnum){
		this.qstsnum = qstsnum;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public void setStat(String stat){
		this.stat = stat;
	}

	public void setCamptype(String camptype){
		this.camptype = camptype;
	}

	public void setBasicdt(String basicdt){
		this.basicdt = basicdt;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getSvynm(){
		return this.svynm;
	}

	public String getSttdt(){
		return this.sttdt;
	}

	public String getEnddt(){
		return this.enddt;
	}

	public int getQstsnum(){
		return this.qstsnum;
	}

	public String getUrl(){
		return this.url;
	}

	public String getStat(){
		return this.stat;
	}

	public String getCamptype(){
		return this.camptype;
	}

	public String getBasicdt(){
		return this.basicdt;
	}
}

/* 작성시간 : Thu Nov 26 13:56:17 KST 2015 */