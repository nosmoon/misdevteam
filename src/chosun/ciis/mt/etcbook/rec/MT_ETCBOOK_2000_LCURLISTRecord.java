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


public class MT_ETCBOOK_2000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String book_cd;
	public String book_nm;
	public String liv_clsi_clsf2;
	public String liv_clsi_clsf;

	public MT_ETCBOOK_2000_LCURLISTRecord(){}

	public void setBook_cd(String book_cd){
		this.book_cd = book_cd;
	}

	public void setBook_nm(String book_nm){
		this.book_nm = book_nm;
	}

	public void setLiv_clsi_clsf2(String liv_clsi_clsf2){
		this.liv_clsi_clsf2 = liv_clsi_clsf2;
	}

	public void setLiv_clsi_clsf(String liv_clsi_clsf){
		this.liv_clsi_clsf = liv_clsi_clsf;
	}

	public String getBook_cd(){
		return this.book_cd;
	}

	public String getBook_nm(){
		return this.book_nm;
	}

	public String getLiv_clsi_clsf2(){
		return this.liv_clsi_clsf2;
	}

	public String getLiv_clsi_clsf(){
		return this.liv_clsi_clsf;
	}
}

/* �ۼ��ð� : Tue Apr 07 17:14:09 KST 2009 */