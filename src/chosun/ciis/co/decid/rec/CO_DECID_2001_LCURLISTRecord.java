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


package chosun.ciis.co.decid.rec;

import java.sql.*;
import chosun.ciis.co.decid.dm.*;
import chosun.ciis.co.decid.ds.*;

/**
 * 
 */


public class CO_DECID_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] add_file;
	public String add_file_size;
	public String add_file_nm;

	public CO_DECID_2001_LCURLISTRecord(){}

	public void setAdd_file(byte[] add_file){
		this.add_file = add_file;
	}

	public void setAdd_file_size(String add_file_size){
		this.add_file_size = add_file_size;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public byte[] getAdd_file(){
		return this.add_file;
	}

	public String getAdd_file_size(){
		return this.add_file_size;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}
}

/* �ۼ��ð� : Tue Mar 17 13:34:41 KST 2009 */