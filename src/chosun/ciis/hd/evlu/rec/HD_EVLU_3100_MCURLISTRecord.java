/***************************************************************************************************
* ���ϸ�		: 
* ���		:
* �ۼ�����	: 
* �ۼ���		: 
***************************************************************************************************/
/***************************************************************************************************
* ��������	: 
* ������		:   
* ��������	: 
* ���		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_3100_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grad_cd;
	public String evlu_grad_nm;

	public HD_EVLU_3100_MCURLISTRecord(){}

	public void setEvlu_grad_cd(String evlu_grad_cd){
		this.evlu_grad_cd = evlu_grad_cd;
	}

	public void setEvlu_grad_nm(String evlu_grad_nm){
		this.evlu_grad_nm = evlu_grad_nm;
	}

	public String getEvlu_grad_cd(){
		return this.evlu_grad_cd;
	}

	public String getEvlu_grad_nm(){
		return this.evlu_grad_nm;
	}
}

/* �ۼ��ð� : Wed May 27 15:44:16 KST 2009 */