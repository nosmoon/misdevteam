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


public class EN_INNEXP_1017_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String evnt_nm;
	public String evnt_seq;

	public EN_INNEXP_1017_MCURLIST2Record(){}

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

/* �ۼ��ð� : Fri May 15 19:40:44 KST 2009 */