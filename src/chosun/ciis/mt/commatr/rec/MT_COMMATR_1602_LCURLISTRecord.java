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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_1602_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String part_cd;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String bf_stok;
	public String nw_stok;

	public MT_COMMATR_1602_LCURLISTRecord(){}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setBf_stok(String bf_stok){
		this.bf_stok = bf_stok;
	}

	public void setNw_stok(String nw_stok){
		this.nw_stok = nw_stok;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getBf_stok(){
		return this.bf_stok;
	}

	public String getNw_stok(){
		return this.nw_stok;
	}
}

/* �ۼ��ð� : Mon Feb 02 19:43:27 KST 2015 */