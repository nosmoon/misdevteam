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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6111_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cd1;
	public String cd2;

	public MC_BUDG_6111_LCURLIST1Record(){}

	public void setCd1(String cd1){
		this.cd1 = cd1;
	}

	public void setCd2(String cd2){
		this.cd2 = cd2;
	}

	public String getCd1(){
		return this.cd1;
	}

	public String getCd2(){
		return this.cd2;
	}
}

/* �ۼ��ð� : Mon Apr 06 15:18:52 KST 2009 */