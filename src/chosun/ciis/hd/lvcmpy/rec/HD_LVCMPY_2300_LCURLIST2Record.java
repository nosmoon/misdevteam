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


public class HD_LVCMPY_2300_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String tot_pay_saly;
	public String non_tax_stot;

	public HD_LVCMPY_2300_LCURLIST2Record(){}

	public void setTot_pay_saly(String tot_pay_saly){
		this.tot_pay_saly = tot_pay_saly;
	}

	public void setNon_tax_stot(String non_tax_stot){
		this.non_tax_stot = non_tax_stot;
	}

	public String getTot_pay_saly(){
		return this.tot_pay_saly;
	}

	public String getNon_tax_stot(){
		return this.non_tax_stot;
	}
}

/* �ۼ��ð� : Tue Aug 18 09:50:50 KST 2009 */