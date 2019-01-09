/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.rec;


/**
 * 
 */


public class AD_BAS_2120_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cust_mang_item;
	public String flnm;
	public String send_dt;
	public String remk;

	public AD_BAS_2120_LCURLISTRecord(){}

	public void setCust_mang_item(String cust_mang_item){
		this.cust_mang_item = cust_mang_item;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSend_dt(String send_dt){
		this.send_dt = send_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCust_mang_item(){
		return this.cust_mang_item;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSend_dt(){
		return this.send_dt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Jan 21 15:19:14 KST 2009 */