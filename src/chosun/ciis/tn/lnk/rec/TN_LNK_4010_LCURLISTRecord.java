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


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_4010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String memberidx;
	public String name;
	public String email;
	public String cellphone;

	public TN_LNK_4010_LCURLISTRecord(){}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setCellphone(String cellphone){
		this.cellphone = cellphone;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public String getCellphone(){
		return this.cellphone;
	}
}

/* �ۼ��ð� : Wed Aug 31 15:05:03 KST 2016 */