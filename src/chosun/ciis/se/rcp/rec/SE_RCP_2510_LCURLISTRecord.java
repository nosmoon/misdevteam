/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_2510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String cyov_bal;
	public String net_sale_amt;
	public String today_amt;
	public String acml_amt;
	public String bal_amt;
	public String rcpm_rate;
	public String pdlv_altn_amt;

	public SE_RCP_2510_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
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

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setToday_amt(String today_amt){
		this.today_amt = today_amt;
	}

	public void setAcml_amt(String acml_amt){
		this.acml_amt = acml_amt;
	}

	public void setBal_amt(String bal_amt){
		this.bal_amt = bal_amt;
	}

	public void setRcpm_rate(String rcpm_rate){
		this.rcpm_rate = rcpm_rate;
	}

	public void setPdlv_altn_amt(String pdlv_altn_amt){
		this.pdlv_altn_amt = pdlv_altn_amt;
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

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getToday_amt(){
		return this.today_amt;
	}

	public String getAcml_amt(){
		return this.acml_amt;
	}

	public String getBal_amt(){
		return this.bal_amt;
	}

	public String getRcpm_rate(){
		return this.rcpm_rate;
	}

	public String getPdlv_altn_amt(){
		return this.pdlv_altn_amt;
	}
}

/* 작성시간 : Tue Mar 18 17:13:41 KST 2014 */