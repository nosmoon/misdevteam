

package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2404_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public byte[] phot;

	public HD_INFO_2404_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPhot(byte[] phot){
		this.phot = phot;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public byte[] getPhot(){
		return this.phot;
	}
}

/* 작성시간 : Tue Aug 24 10:23:55 KST 2010 */