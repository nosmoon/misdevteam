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

import java.io.*;
import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2402_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public byte[] phot;
	public InputStream in;
	public Blob blob_phot;

	public HD_INFO_2402_LCURLISTRecord(){}

	public void setIn(InputStream in){
		this.in = in;
	}

	public InputStream getIn(){
		return this.in;
	}
	
	
	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}
	
	public void setBlob_phot(Blob blob_phot){
		this.blob_phot = blob_phot;
	}

	public Blob getBlob_phot(){
		return this.blob_phot;
	}
	
	public void setPhot(byte[] sjsajin){
		this.phot = sjsajin;
	}

	public byte[] getPhot(){
		return this.phot;
	}
	
}

/* �ۼ��ð� : Mon Jun 08 11:58:47 KST 2009 */