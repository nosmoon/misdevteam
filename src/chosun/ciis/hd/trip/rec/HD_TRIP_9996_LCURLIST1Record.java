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


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_9996_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String aply_frdt;
	public String aply_todt;
	public String cnt;

	public HD_TRIP_9996_LCURLIST1Record(){}

	public void setAply_frdt(String aply_frdt){
		this.aply_frdt = aply_frdt;
	}

	public void setAply_todt(String aply_todt){
		this.aply_todt = aply_todt;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getAply_frdt(){
		return this.aply_frdt;
	}

	public String getAply_todt(){
		return this.aply_todt;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* �ۼ��ð� : Sun Aug 09 14:28:17 KST 2009 */