/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 *
 */


public class SL_MO_S_RDR_INFOBRFCURRecord extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String clamtynm;

	public SL_MO_S_RDR_INFOBRFCURRecord(){}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setClamtynm(String clamtynm){
		this.clamtynm = clamtynm;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getClamtynm(){
		return this.clamtynm;
	}
}

/* 작성시간 : Mon Dec 05 11:41:10 KST 2016 */