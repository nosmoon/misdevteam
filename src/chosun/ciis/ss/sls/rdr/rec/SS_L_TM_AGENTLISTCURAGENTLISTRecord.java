/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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

/* �ۼ��ð� : Wed May 29 07:08:38 GMT 2013 */