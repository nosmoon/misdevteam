/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1004_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;
	public String lvcmpy_dt;

	public HD_INFO_1004_SCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}
}

/* �ۼ��ð� : Thu Jul 02 14:21:55 KST 2009 */