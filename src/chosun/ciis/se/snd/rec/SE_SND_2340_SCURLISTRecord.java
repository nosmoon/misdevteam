/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2340_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String zip;
	public String addr;
	public String dtls_addr;
	public String tel_no;
	public String natn_tel_no;
	public String corp_clsf;
	public String setl_bank;
	public String acct_no;

	public SE_SND_2340_SCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
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

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setNatn_tel_no(String natn_tel_no){
		this.natn_tel_no = natn_tel_no;
	}

	public void setCorp_clsf(String corp_clsf){
		this.corp_clsf = corp_clsf;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
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

	public String getTel_no(){
		return this.tel_no;
	}

	public String getNatn_tel_no(){
		return this.natn_tel_no;
	}

	public String getCorp_clsf(){
		return this.corp_clsf;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getAcct_no(){
		return this.acct_no;
	}
}

/* 작성시간 : Tue Aug 18 20:01:13 KST 2009 */