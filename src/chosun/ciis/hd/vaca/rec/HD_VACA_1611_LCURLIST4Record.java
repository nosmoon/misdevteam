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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1611_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String faml_flnm;
	public String faml_birth;

	public HD_VACA_1611_LCURLIST4Record(){}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setFaml_birth(String faml_birth){
		this.faml_birth = faml_birth;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getFaml_birth(){
		return this.faml_birth;
	}
}

/* �ۼ��ð� : Wed Oct 24 10:55:13 KST 2018 */