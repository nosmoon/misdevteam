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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_6076_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String jpbscymd;
	public String jpgbcd;
	public String jpseq;

	public FC_FUNC_6076_LCURLISTRecord(){}

	public void setJpbscymd(String jpbscymd){
		this.jpbscymd = jpbscymd;
	}

	public void setJpgbcd(String jpgbcd){
		this.jpgbcd = jpgbcd;
	}

	public void setJpseq(String jpseq){
		this.jpseq = jpseq;
	}

	public String getJpbscymd(){
		return this.jpbscymd;
	}

	public String getJpgbcd(){
		return this.jpgbcd;
	}

	public String getJpseq(){
		return this.jpseq;
	}
}

/* �ۼ��ð� : Fri Mar 20 15:00:56 KST 2009 */