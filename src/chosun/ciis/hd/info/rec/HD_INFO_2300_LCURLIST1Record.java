

package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_2300_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String rownum;
	public String emp_no;
	public String nm_korn;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String rptv_posi_cd;
	public String emp_srt_seq;
	public String emp_album_clsf;

	public HD_INFO_2300_LCURLIST1Record(){}

	public void setRownum(String rownum){
		this.rownum = rownum;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setRptv_posi_cd(String rptv_posi_cd){
		this.rptv_posi_cd = rptv_posi_cd;
	}

	public void setEmp_srt_seq(String emp_srt_seq){
		this.emp_srt_seq = emp_srt_seq;
	}

	public void setEmp_album_clsf(String emp_album_clsf){
		this.emp_album_clsf = emp_album_clsf;
	}

	public String getRownum(){
		return this.rownum;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getRptv_posi_cd(){
		return this.rptv_posi_cd;
	}

	public String getEmp_srt_seq(){
		return this.emp_srt_seq;
	}

	public String getEmp_album_clsf(){
		return this.emp_album_clsf;
	}
}

/* 작성시간 : Wed May 12 14:50:11 KST 2010 */