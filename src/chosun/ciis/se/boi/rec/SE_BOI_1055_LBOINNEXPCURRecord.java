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


public class SE_BOI_1055_LBOINNEXPCURRecord extends java.lang.Object implements java.io.Serializable{

	public String innexp_clsf;
	public String innexp_ptcr_clsf;
	public int innexp_amt;

	public SE_BOI_1055_LBOINNEXPCURRecord(){}

	public void setInnexp_clsf(String innexp_clsf){
		this.innexp_clsf = innexp_clsf;
	}

	public void setInnexp_ptcr_clsf(String innexp_ptcr_clsf){
		this.innexp_ptcr_clsf = innexp_ptcr_clsf;
	}

	public void setInnexp_amt(int innexp_amt){
		this.innexp_amt = innexp_amt;
	}

	public String getInnexp_clsf(){
		return this.innexp_clsf;
	}

	public String getInnexp_ptcr_clsf(){
		return this.innexp_ptcr_clsf;
	}

	public int getInnexp_amt(){
		return this.innexp_amt;
	}
}

/* �ۼ��ð� : Wed Jan 28 13:14:29 KST 2009 */