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


public class SS_L_TM_AGENTLISTCURAGENTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String agentid;
	public String agentnm;

	public SS_L_TM_AGENTLISTCURAGENTLISTRecord(){}

	public void setAgentid(String agentid){
		this.agentid = agentid;
	}

	public void setAgentnm(String agentnm){
		this.agentnm = agentnm;
	}

	public String getAgentid(){
		return this.agentid;
	}

	public String getAgentnm(){
		return this.agentnm;
	}
}

/* 작성시간 : Wed May 29 07:08:38 GMT 2013 */