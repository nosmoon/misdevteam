/**************************************************************************************************
* ���ϸ�    : .java
* ���      : �Ǹű�-��������-��ǻ��AS
* �ۼ�����  : 2004-03-12
* �ۼ���    : ��â��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
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

/* �ۼ��ð� : Fri Mar 12 16:24:16 KST 2004 */