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


package chosun.ciis.ss.sls.common.rec;

import java.sql.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;

/**
 * 
 */


public class SL_L_GUGUNCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdynm;

	public SL_L_GUGUNCURCOMMLISTRecord(){}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}

/* 작성시간 : Fri Nov 29 07:18:25 GMT 2013 */