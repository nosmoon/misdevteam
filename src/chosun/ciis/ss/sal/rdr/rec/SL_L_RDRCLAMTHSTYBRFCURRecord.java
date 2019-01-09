/***************************************************************************************************
* 파일명 : SL_L_RDRCLAMTHSTYRSLTCURRecord.java
* 기능 : 독자정보관리-입금내역-이전년도 수금요약
* 작성일자 : 2003-12-26
* 작성자 : 김영윤
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
 * 독자정보관리-입금내역-이전년도 수금요약
 *
 */


public class SL_L_RDRCLAMTHSTYBRFCURRecord extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String clamtynm;

	public SL_L_RDRCLAMTHSTYBRFCURRecord(){}

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

/* 작성시간 : Mon Dec 22 14:24:57 KST 2003 */