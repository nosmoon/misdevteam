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


public class MC_COST_1045_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String cd;

	public MC_COST_1045_MCURLISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getCd(){
		return this.cd;
	}
}

/* �ۼ��ð� : Wed May 06 11:48:32 KST 2009 */