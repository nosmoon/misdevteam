/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������������ - ��ǥ����
* �ۼ����� : 2010-04-12
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.as.test.rec;

import java.sql.*;
import chosun.ciis.as.test.dm.*;
import chosun.ciis.as.test.ds.*;

/**
 * 
 */


public class AS_TEST_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dev_src;
	public String real_src;

	public AS_TEST_1002_LCURLISTRecord(){}

	public void setDev_src(String dev_src){
		this.dev_src = dev_src;
	}

	public void setReal_src(String real_src){
		this.real_src = real_src;
	}

	public String getDev_src(){
		return this.dev_src;
	}

	public String getReal_src(){
		return this.real_src;
	}

}

/* �ۼ��ð� : Mon Apr 12 14:44:41 KST 2010 */