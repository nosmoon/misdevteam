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

/* �ۼ��ð� : Wed May 29 07:09:24 GMT 2013 */