

package chosun.ciis.hd.orga.rec;

import java.sql.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.ds.*;

/**
 * 
 */


public class HD_ORGA_2000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String abrv_nm;
	public String supr_dept_cd;
	public String lvl;
	public String is_leaf;

	public HD_ORGA_2000_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setLvl(String lvl){
		this.lvl = lvl;
	}

	public void setIs_leaf(String is_leaf){
		this.is_leaf = is_leaf;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getLvl(){
		return this.lvl;
	}

	public String getIs_leaf(){
		return this.is_leaf;
	}
}

/* 작성시간 : Mon Jul 18 14:42:36 KST 2011 */