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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1618_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sun;
	public String mon;
	public String tue;
	public String wed;
	public String thr;
	public String fri;
	public String sat;

	public AD_BAS_1618_LCURLISTRecord(){}

	public void setSun(String sun){
		this.sun = sun;
	}

	public void setMon(String mon){
		this.mon = mon;
	}

	public void setTue(String tue){
		this.tue = tue;
	}

	public void setWed(String wed){
		this.wed = wed;
	}

	public void setThr(String thr){
		this.thr = thr;
	}

	public void setFri(String fri){
		this.fri = fri;
	}

	public void setSat(String sat){
		this.sat = sat;
	}

	public String getSun(){
		return this.sun;
	}

	public String getMon(){
		return this.mon;
	}

	public String getTue(){
		return this.tue;
	}

	public String getWed(){
		return this.wed;
	}

	public String getThr(){
		return this.thr;
	}

	public String getFri(){
		return this.fri;
	}

	public String getSat(){
		return this.sat;
	}
}

/* �ۼ��ð� : Wed Aug 26 14:27:28 KST 2009 */