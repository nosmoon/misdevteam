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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;
import java.io.*;

/**
 * 
 */


public class HD_INFO_7150_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] phot;

	public HD_INFO_7150_SCURLISTRecord(){}

	public void setPhot(byte[] phot){
		this.phot = phot;
	}

	public byte[] getPhot(){
		return this.phot;
	}
}

/* �ۼ��ð� : Tue Apr 02 11:29:01 KST 2013 */