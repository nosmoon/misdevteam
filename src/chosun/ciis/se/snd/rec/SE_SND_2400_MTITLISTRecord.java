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


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2400_MTITLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;

	public SE_SND_2400_MTITLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}
}

/* �ۼ��ð� : Tue Jun 23 10:40:49 KST 2009 */