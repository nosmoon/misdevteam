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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1430_SBOHEADFAMCURRecord extends java.lang.Object implements java.io.Serializable{

	public String flnm;
	public String faml_rshp_cd;
	public String bidt;
	public String luso_clsf;

	public SE_BOI_1430_SBOHEADFAMCURRecord(){}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setLuso_clsf(String luso_clsf){
		this.luso_clsf = luso_clsf;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getBidt(){
		return this.bidt;
	}

	public String getLuso_clsf(){
		return this.luso_clsf;
	}
}

/* �ۼ��ð� : Wed Feb 04 21:28:13 KST 2009 */