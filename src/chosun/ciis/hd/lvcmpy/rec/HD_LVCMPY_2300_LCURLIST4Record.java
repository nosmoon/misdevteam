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


public class HD_LVCMPY_2300_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String non_tax_frnc;
	public String non_tax_jrnst;
	public String saly_no;

	public HD_LVCMPY_2300_LCURLIST4Record(){}

	public void setNon_tax_frnc(String non_tax_frnc){
		this.non_tax_frnc = non_tax_frnc;
	}

	public void setNon_tax_jrnst(String non_tax_jrnst){
		this.non_tax_jrnst = non_tax_jrnst;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public String getNon_tax_frnc(){
		return this.non_tax_frnc;
	}

	public String getNon_tax_jrnst(){
		return this.non_tax_jrnst;
	}

	public String getSaly_no(){
		return this.saly_no;
	}
}

/* �ۼ��ð� : Tue Aug 18 09:50:50 KST 2009 */