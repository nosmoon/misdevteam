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


public class MC_BUDG_6111_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String fr_to_1;
	public String fr_to_2;

	public MC_BUDG_6111_LCURLIST3Record(){}

	public void setFr_to_1(String fr_to_1){
		this.fr_to_1 = fr_to_1;
	}

	public void setFr_to_2(String fr_to_2){
		this.fr_to_2 = fr_to_2;
	}

	public String getFr_to_1(){
		return this.fr_to_1;
	}

	public String getFr_to_2(){
		return this.fr_to_2;
	}
}

/* �ۼ��ð� : Mon Apr 06 15:18:52 KST 2009 */