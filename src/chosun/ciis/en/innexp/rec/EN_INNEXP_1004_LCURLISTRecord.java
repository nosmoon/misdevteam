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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_nm;
	public String evnt_seq;

	public EN_INNEXP_1004_LCURLISTRecord(){}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}
}

/* �ۼ��ð� : Mon Apr 06 19:35:33 KST 2009 */