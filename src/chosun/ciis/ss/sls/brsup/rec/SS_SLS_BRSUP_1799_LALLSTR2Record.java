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


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 
 */


public class SS_SLS_BRSUP_1799_LALLSTR2Record extends java.lang.Object implements java.io.Serializable{

	public String datastr;
	public String filler;
	public String recfilenm;

	public SS_SLS_BRSUP_1799_LALLSTR2Record(){}

	public void setDatastr(String datastr){
		this.datastr = datastr;
	}

	public void setFiller(String filler){
		this.filler = filler;
	}

	public void setRecfilenm(String recfilenm){
		this.recfilenm = recfilenm;
	}

	public String getDatastr(){
		return this.datastr;
	}

	public String getFiller(){
		return this.filler;
	}

	public String getRecfilenm(){
		return this.recfilenm;
	}
}

/* �ۼ��ð� : Wed Sep 28 18:36:48 KST 2016 */