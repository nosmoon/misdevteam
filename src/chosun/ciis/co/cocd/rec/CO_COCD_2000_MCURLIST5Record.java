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


package chosun.ciis.co.cocd.rec;

import java.sql.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;

/**
 * 
 */


public class CO_COCD_2000_MCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd1;
	public String cd2;

	public CO_COCD_2000_MCURLIST5Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd1(String cd1){
		this.cd1 = cd1;
	}

	public void setCd2(String cd2){
		this.cd2 = cd2;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd1(){
		return this.cd1;
	}

	public String getCd2(){
		return this.cd2;
	}
}

/* �ۼ��ð� : Tue Jan 31 11:13:39 KST 2012 */