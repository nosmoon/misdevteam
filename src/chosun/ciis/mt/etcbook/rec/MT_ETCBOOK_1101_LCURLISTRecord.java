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


package chosun.ciis.mt.etcbook.rec;

import java.sql.*;
import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.ds.*;

/**
 * 
 */


public class MT_ETCBOOK_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String book_cd;
	public String book_nm;

	public MT_ETCBOOK_1101_LCURLISTRecord(){}

	public void setBook_cd(String book_cd){
		this.book_cd = book_cd;
	}

	public void setBook_nm(String book_nm){
		this.book_nm = book_nm;
	}

	public String getBook_cd(){
		return this.book_cd;
	}

	public String getBook_nm(){
		return this.book_nm;
	}
}

/* �ۼ��ð� : Tue Mar 10 15:09:49 KST 2009 */