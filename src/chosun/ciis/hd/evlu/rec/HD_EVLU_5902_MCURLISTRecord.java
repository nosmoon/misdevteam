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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5902_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grad_cd;
	public String gradpoint;

	public HD_EVLU_5902_MCURLISTRecord(){}

	public void setEvlu_grad_cd(String evlu_grad_cd){
		this.evlu_grad_cd = evlu_grad_cd;
	}

	public void setGradpoint(String gradpoint){
		this.gradpoint = gradpoint;
	}

	public String getEvlu_grad_cd(){
		return this.evlu_grad_cd;
	}

	public String getGradpoint(){
		return this.gradpoint;
	}
}

/* �ۼ��ð� : Tue Jun 09 10:20:36 KST 2009 */