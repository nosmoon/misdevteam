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


public class MT_PAPINOUT_3017_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String title;

	public MT_PAPINOUT_3017_LCURLIST3Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getCd(){
		return this.cd;
	}

	public String getTitle(){
		return this.title;
	}
}

/* �ۼ��ð� : Mon Aug 24 18:26:11 KST 2009 */