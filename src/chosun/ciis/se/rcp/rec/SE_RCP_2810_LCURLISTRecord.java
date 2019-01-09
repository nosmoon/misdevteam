/***************************************************************************************************
* 파일명 : SE_RCP_2810_LCURLISTRecord.java
* 기능 : 판매 - 입금관리 - 지대입금관리 - 보증인채무통보
* 작성일자 : 2009-04-27
* 작성자 : 김대준
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


public class SE_RCP_2810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd				;
	public String yymm					;
	public String bo_cd					;
	public String bo_seq				;
	public String dept_cd				;
	public String dept_nm				;
	public String sub_dept_cd			;
	public String part_nm				;
	public String area_cd				;
	public String area_nm				;
	public String dlco_no				;
	public String bo_nm					;
	public String bo_head_nm			;
	public String cyov_bal				;
	public String net_sale_amt			;
	public String rcpm_amt				;
	public String uprcp_amt				;
	public String bal					;
	public String cntr_gurt_amt_stot	;
	public String jont_debtgurt_limt_amt;
	public String sum_excs_uprcp_amt	;
	public String excs_uprcp_amt		;
	public String gurt_pers_flnm		;
	public String zip					;
	public String addr					;
	public String dtls_addr				;
	public String tel					;
	public String rn					;

	public SE_RCP_2810_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
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

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setUprcp_amt(String uprcp_amt){
		this.uprcp_amt = uprcp_amt;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public void setCntr_gurt_amt_stot(String cntr_gurt_amt_stot){
		this.cntr_gurt_amt_stot = cntr_gurt_amt_stot;
	}

	public void setJont_debtgurt_limt_amt(String jont_debtgurt_limt_amt){
		this.jont_debtgurt_limt_amt = jont_debtgurt_limt_amt;
	}

	public void setSum_excs_uprcp_amt(String sum_excs_uprcp_amt){
		this.sum_excs_uprcp_amt = sum_excs_uprcp_amt;
	}

	public void setExcs_uprcp_amt(String excs_uprcp_amt){
		this.excs_uprcp_amt = excs_uprcp_amt;
	}

	public void setGurt_pers_flnm(String gurt_pers_flnm){
		this.gurt_pers_flnm = gurt_pers_flnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public void setRn(String rn){
		this.rn = rn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
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

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getUprcp_amt(){
		return this.uprcp_amt;
	}

	public String getBal(){
		return this.bal;
	}

	public String getCntr_gurt_amt_stot(){
		return this.cntr_gurt_amt_stot;
	}

	public String getJont_debtgurt_limt_amt(){
		return this.jont_debtgurt_limt_amt;
	}

	public String getSum_excs_uprcp_amt(){
		return this.sum_excs_uprcp_amt;
	}

	public String getExcs_uprcp_amt(){
		return this.excs_uprcp_amt;
	}

	public String getGurt_pers_flnm(){
		return this.gurt_pers_flnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel(){
		return this.tel;
	}

	public String getRn(){
		return this.rn;
	}
}

/* 작성시간 : Mon Apr 27 11:26:08 KST 2009 */