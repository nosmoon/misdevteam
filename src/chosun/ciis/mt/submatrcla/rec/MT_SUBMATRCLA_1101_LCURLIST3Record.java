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


package chosun.ciis.mt.submatrcla.rec;

import java.sql.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1101_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String doc_date;
	public String doc_time;

	public MT_SUBMATRCLA_1101_LCURLIST3Record(){}

	public void setDoc_date(String doc_date){
		this.doc_date = doc_date;
	}

	public void setDoc_time(String doc_time){
		this.doc_time = doc_time;
	}

	public String getDoc_date(){
		return this.doc_date;
	}

	public String getDoc_time(){
		return this.doc_time;
	}
}

/* �ۼ��ð� : Fri Jul 10 19:49:01 KST 2009 */