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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_1200_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String modl_mang_no;
	public String seq;
	public String cmps_item;
	public String spec_clsf;
	public String brand_sw;
	public String spec;

	public MT_ETCPC_1200_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCmps_item(String cmps_item){
		this.cmps_item = cmps_item;
	}

	public void setSpec_clsf(String spec_clsf){
		this.spec_clsf = spec_clsf;
	}

	public void setBrand_sw(String brand_sw){
		this.brand_sw = brand_sw;
	}

	public void setSpec(String spec){
		this.spec = spec;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCmps_item(){
		return this.cmps_item;
	}

	public String getSpec_clsf(){
		return this.spec_clsf;
	}

	public String getBrand_sw(){
		return this.brand_sw;
	}

	public String getSpec(){
		return this.spec;
	}
}

/* �ۼ��ð� : Thu Mar 12 15:41:22 KST 2009 */