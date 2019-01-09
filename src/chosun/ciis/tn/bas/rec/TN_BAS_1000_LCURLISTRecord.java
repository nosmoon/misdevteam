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


public class TN_BAS_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String organidx;
	public String organname;
	public String businessno;

	public TN_BAS_1000_LCURLISTRecord(){}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public void setOrganname(String organname){
		this.organname = organname;
	}

	public void setBusinessno(String businessno){
		this.businessno = businessno;
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
}

/* 작성시간 : Wed Jun 22 18:08:39 KST 2016 */