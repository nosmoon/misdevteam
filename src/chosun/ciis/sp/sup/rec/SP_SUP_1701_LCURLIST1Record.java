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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1701_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public byte[] img;
	public String dlco_no;
	public String dlco_abrv_nm;
	public String ern;

	public SP_SUP_1701_LCURLIST1Record(){}

	public void setPhot(byte[] img){
		this.img = img;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public byte[] getImg(){
		return this.img;
	}


	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getErn(){
		return this.ern;
	}
}

/* �ۼ��ð� : Tue Aug 21 20:29:56 KST 2012 */