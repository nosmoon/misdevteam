/**************************************************************************************************
* 파일명    : .java
* 기능      : 판매국-지국지원-컴퓨터AS
* 작성일자  : 2004-03-12
* 작성자    : 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 
 */

public class SS_L_ASREQCURCOMPLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String eqpno;
	public String computernm;

	public SS_L_ASREQCURCOMPLISTRecord(){}

	public void setEqpno(String eqpno){
		this.eqpno = eqpno;
	}

	public void setComputernm(String computernm){
		this.computernm = computernm;
	}

	public String getEqpno(){
		return this.eqpno;
	}

	public String getComputernm(){
		return this.computernm;
	}
}

/* 작성시간 : Fri Mar 12 16:24:16 KST 2004 */