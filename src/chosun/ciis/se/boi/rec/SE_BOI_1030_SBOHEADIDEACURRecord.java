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


public class SE_BOI_1030_SBOHEADIDEACURRecord extends java.lang.Object implements java.io.Serializable{

	public String idea_seq;
	public String make_dt;
	public String make_pers_nm;
	public String idea;

	public SE_BOI_1030_SBOHEADIDEACURRecord(){}

	public void setIdea_seq(String idea_seq){
		this.idea_seq = idea_seq;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public void setIdea(String idea){
		this.idea = idea;
	}

	public String getIdea_seq(){
		return this.idea_seq;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public String getIdea(){
		return this.idea;
	}
}

/* �ۼ��ð� : Tue Jan 20 18:12:34 KST 2009 */