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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_2023_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_yn;
	public String workdate;

	public MC_COST_2023_LCURLISTRecord(){}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setWorkdate(String workdate){
		this.workdate = workdate;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getWorkdate(){
		return this.workdate;
	}
}

/* �ۼ��ð� : Thu Jul 16 14:39:16 KST 2009 */