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


package chosun.ciis.tn.bas.rec;

import java.sql.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.ds.*;

/**
 * 
 */


public class TN_BAS_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String organidx;
	public String organname;
	public String businessno;
	public String address;
	public String law;
	public String recipientname;
	public String stampimagepath;
	public String phot;

	public TN_BAS_1001_LCURLISTRecord(){}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public void setOrganname(String organname){
		this.organname = organname;
	}

	public void setBusinessno(String businessno){
		this.businessno = businessno;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setLaw(String law){
		this.law = law;
	}

	public void setRecipientname(String recipientname){
		this.recipientname = recipientname;
	}

	public void setStampimagepath(String stampimagepath){
		this.stampimagepath = stampimagepath;
	}

	public void setPhot(String phot){
		this.phot = phot;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getOrganname(){
		return this.organname;
	}

	public String getBusinessno(){
		return this.businessno;
	}

	public String getAddress(){
		return this.address;
	}

	public String getLaw(){
		return this.law;
	}

	public String getRecipientname(){
		return this.recipientname;
	}

	public String getStampimagepath(){
		return this.stampimagepath;
	}

	public String getPhot(){
		return this.phot;
	}
	
}

/* 작성시간 : Tue Jul 26 14:59:59 KST 2016 */