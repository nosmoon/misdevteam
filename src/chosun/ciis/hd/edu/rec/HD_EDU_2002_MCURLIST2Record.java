/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� :
* �ۼ��� :
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.edu.rec;

import java.sql.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;

/**
 * 
 */


public class HD_EDU_2002_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String mang_cd_12;

	public HD_EDU_2002_MCURLIST2Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMang_cd_12(String mang_cd_12){
		this.mang_cd_12 = mang_cd_12;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMang_cd_12(){
		return this.mang_cd_12;
	}
}

/* �ۼ��ð� : Tue Oct 25 11:25:28 KST 2011 */