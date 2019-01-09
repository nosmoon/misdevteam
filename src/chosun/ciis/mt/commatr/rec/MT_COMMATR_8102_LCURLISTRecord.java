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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_8102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String somodat;
	public String bpwt;
	public String pchpwt_1;
	public String pchpwt;
	public String pcsim62cnt;
	public String pcsim31cnt;
	public String pcsim46cnt;
	public String pcseoljiwt;
	public String hpdan;
	public String sim62dan;
	public String sim31dan;
	public String sim46dan;
	public String seoldan;
	public String pcgitapaji;
	public String gitadan;
	public String bpdan;
	public String amt;
	public String tot_amt;

	public MT_COMMATR_8102_LCURLISTRecord(){}

	public void setSomodat(String somodat){
		this.somodat = somodat;
	}

	public void setBpwt(String bpwt){
		this.bpwt = bpwt;
	}

	public void setPchpwt_1(String pchpwt_1){
		this.pchpwt_1 = pchpwt_1;
	}

	public void setPchpwt(String pchpwt){
		this.pchpwt = pchpwt;
	}

	public void setPcsim62cnt(String pcsim62cnt){
		this.pcsim62cnt = pcsim62cnt;
	}

	public void setPcsim31cnt(String pcsim31cnt){
		this.pcsim31cnt = pcsim31cnt;
	}

	public void setPcsim46cnt(String pcsim46cnt){
		this.pcsim46cnt = pcsim46cnt;
	}

	public void setPcseoljiwt(String pcseoljiwt){
		this.pcseoljiwt = pcseoljiwt;
	}

	public void setHpdan(String hpdan){
		this.hpdan = hpdan;
	}

	public void setSim62dan(String sim62dan){
		this.sim62dan = sim62dan;
	}

	public void setSim31dan(String sim31dan){
		this.sim31dan = sim31dan;
	}

	public void setSim46dan(String sim46dan){
		this.sim46dan = sim46dan;
	}

	public void setSeoldan(String seoldan){
		this.seoldan = seoldan;
	}

	public void setPcgitapaji(String pcgitapaji){
		this.pcgitapaji = pcgitapaji;
	}

	public void setGitadan(String gitadan){
		this.gitadan = gitadan;
	}

	public void setBpdan(String bpdan){
		this.bpdan = bpdan;
	}
	
	public void setAmt(String amt){
		this.amt = amt;
	}
	
	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}
	
	public String getSomodat(){
		return this.somodat;
	}

	public String getBpwt(){
		return this.bpwt;
	}

	public String getPchpwt_1(){
		return this.pchpwt_1;
	}

	public String getPchpwt(){
		return this.pchpwt;
	}

	public String getPcsim62cnt(){
		return this.pcsim62cnt;
	}

	public String getPcsim31cnt(){
		return this.pcsim31cnt;
	}

	public String getPcsim46cnt(){
		return this.pcsim46cnt;
	}

	public String getPcseoljiwt(){
		return this.pcseoljiwt;
	}

	public String getHpdan(){
		return this.hpdan;
	}

	public String getSim62dan(){
		return this.sim62dan;
	}

	public String getSim31dan(){
		return this.sim31dan;
	}

	public String getSim46dan(){
		return this.sim46dan;
	}

	public String getSeoldan(){
		return this.seoldan;
	}

	public String getPcgitapaji(){
		return this.pcgitapaji;
	}

	public String getGitadan(){
		return this.gitadan;
	}

	public String getBpdan(){
		return this.bpdan;
	}
	
	public String getAmt(){
		return this.amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Wed May 15 17:28:43 KST 2013 */