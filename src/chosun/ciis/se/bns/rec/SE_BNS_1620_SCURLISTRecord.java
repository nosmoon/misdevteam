/***************************************************************************************************
* ���ϸ� : SE_BNS_1620_SCURLISTRecord.java
* ��� : �Ǹ�-���˹����� - ���˹�����ó��
* �ۼ����� : 2009-04-30
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1620_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm	;
	public String part_nm	;
	public String area_nm	;
	public String area_cd	;
	public String bo_head_nm;
	
	public SE_BNS_1620_SCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
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

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getArea_cd() {
		return area_cd;
	}

	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}
}

/* �ۼ��ð� : Thu Apr 30 11:29:52 KST 2009 */