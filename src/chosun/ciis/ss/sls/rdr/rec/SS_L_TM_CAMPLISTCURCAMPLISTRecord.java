/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 
 */


public class SS_L_TM_CAMPLISTCURCAMPLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String campid;
	public String campnm;

	public SS_L_TM_CAMPLISTCURCAMPLISTRecord(){}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getCampnm(){
		return this.campnm;
	}
}

/* 작성시간 : Wed May 29 07:09:24 GMT 2013 */