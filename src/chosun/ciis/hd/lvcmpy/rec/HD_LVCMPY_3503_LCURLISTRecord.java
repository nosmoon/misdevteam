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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_3503_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acml_cnt;
	public String acml_prev_cnt;
	public String estm_cnt;

	public HD_LVCMPY_3503_LCURLISTRecord(){}

	public void setAcml_cnt(String acml_cnt){
		this.acml_cnt = acml_cnt;
	}

	public void setAcml_prev_cnt(String acml_prev_cnt){
		this.acml_prev_cnt = acml_prev_cnt;
	}

	public void setEstm_cnt(String estm_cnt){
		this.estm_cnt = estm_cnt;
	}

	public String getAcml_cnt(){
		return this.acml_cnt;
	}

	public String getAcml_prev_cnt(){
		return this.acml_prev_cnt;
	}

	public String getEstm_cnt(){
		return this.estm_cnt;
	}
}

/* �ۼ��ð� : Sat Jun 13 17:35:34 KST 2009 */