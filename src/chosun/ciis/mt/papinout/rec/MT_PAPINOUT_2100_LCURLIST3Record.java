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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2100_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String descri;

	public MT_PAPINOUT_2100_LCURLIST3Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public String getCd(){
		return this.cd;
	}

	public String getDescri(){
		return this.descri;
	}
}

/* �ۼ��ð� : Mon Jun 22 19:00:22 KST 2009 */