/***************************************************************************************************
* 파일명 : SS_L_MO_SVYLISTMOSVYLISTRecord.java
* 기능 :
* 작성일자 : 2016.02.29
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


public class SS_L_MO_SVYLISTMOSVYLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String svyid;
	public String svynm;

	public SS_L_MO_SVYLISTMOSVYLISTRecord(){}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public void setSvynm(String svynm){
		this.svynm = svynm;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getSvynm(){
		return this.svynm;
	}
}

/* 작성시간 : Mon Feb 29 18:14:36 KST 2016 */