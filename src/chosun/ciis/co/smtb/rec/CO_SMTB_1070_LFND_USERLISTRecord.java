/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���� - ���ݰ�꼭 ����� ��ȸ
* �ۼ����� : 2011-05-16
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.smtb.rec;

import java.sql.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;

/**
 * ���� - ���ݰ�꼭 �������ȸ
 */


public class CO_SMTB_1070_LFND_USERLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fnd_user;
	public String fnd_regno;
	public String fnd_user_name;
	public String smart_id;
	public String smart_password;
	public String smart_email;

	public CO_SMTB_1070_LFND_USERLISTRecord(){}

	public void setFnd_user(String fnd_user){
		this.fnd_user = fnd_user;
	}

	public void setFnd_regno(String fnd_regno){
		this.fnd_regno = fnd_regno;
	}

	public void setFnd_user_name(String fnd_user_name){
		this.fnd_user_name = fnd_user_name;
	}

	public void setSmart_id(String smart_id){
		this.smart_id = smart_id;
	}
	
	public void setSmart_password(String smart_password){
		this.smart_password = smart_password;
	}

	public void setSmart_email(String smart_email){
		this.smart_email = smart_email;
	}

	public String getFnd_user(){
		return this.fnd_user;
	}

	public String getFnd_regno(){
		return this.fnd_regno;
	}

	public String getFnd_user_name(){
		return this.fnd_user_name;
	}

	public String getSmart_id(){
		return this.smart_id;
	}
	
	public String getSmart_password(){
		return this.smart_password;
	}

	public String getSmart_email(){
		return this.smart_email;
	}
}

/* �ۼ��ð� : Mon May 16 10:50:31 KST 2011 */