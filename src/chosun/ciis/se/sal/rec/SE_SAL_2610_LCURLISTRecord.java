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


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_2610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String area_cd;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String sum;
	public String bal;

	public SE_SAL_2610_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setSum(String sum){
		this.sum = sum;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getSum(){
		return this.sum;
	}

	public String getBal(){
		return this.bal;
	}
}

/* �ۼ��ð� : Wed Aug 01 15:19:08 KST 2012 */