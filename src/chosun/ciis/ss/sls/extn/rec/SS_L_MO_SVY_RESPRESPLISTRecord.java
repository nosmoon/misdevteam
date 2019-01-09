/***************************************************************************************************
* 파일명 : SS_L_MO_SVY_RESPRESPLISTRecord.java
* 기능 : 
* 작성일자 : 2015.12.07
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


public class SS_L_MO_SVY_RESPRESPLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String qstnum;
	public String rdr_no;
	public String basicdt;
	public String cont;
	public String response;
	public String priority;
	public String qstid;

	public SS_L_MO_SVY_RESPRESPLISTRecord(){}

	public void setQstnum(String qstnum){
		this.qstnum = qstnum;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setBasicdt(String basicdt){
		this.basicdt = basicdt;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setResponse(String response){
		this.response = response;
	}

	public void setPriority(String priority){
		this.priority = priority;
	}

	public void setQstid(String qstid){
		this.qstid = qstid;
	}

	public String getQstnum(){
		return this.qstnum;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getBasicdt(){
		return this.basicdt;
	}

	public String getCont(){
		return this.cont;
	}

	public String getResponse(){
		return this.response;
	}

	public String getPriority(){
		return this.priority;
	}

	public String getQstid(){
		return this.qstid;
	}
}

/* 작성시간 : Mon Dec 07 10:23:11 KST 2015 */