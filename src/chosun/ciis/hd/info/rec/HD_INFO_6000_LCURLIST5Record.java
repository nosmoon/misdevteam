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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_6000_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String zip_1_01;
	public String zip_2_01;
	public String addr_01;
	public String dtls_addr_01;
	public String tel_no_01;
	public String fax_no_01;
	public String ptph_no_01;
	public String email_id_01;
	public String forn_zip_01;
	public String forn_addr_01;
	public String zip_1_02;
	public String zip_2_02;
	public String addr_02;
	public String dtls_addr_02;
	public String tel_no_02;
	public String fax_no_02;
	public String ptph_no_02;
	public String email_id_02;
	public String forn_zip_02;
	public String forn_addr_02;
	public String zip_1_03;
	public String zip_2_03;
	public String addr_03;
	public String dtls_addr_03;
	public String tel_no_03;
	public String fax_no_03;
	public String ptph_no_03;
	public String email_id_03;
	public String forn_zip_03;
	public String forn_addr_03;
	public String zip_1_04;
	public String zip_2_04;
	public String addr_04;
	public String dtls_addr_04;
	public String tel_no_04;
	public String fax_no_04;
	public String ptph_no_04;
	public String email_id_04;
	public String forn_zip_04;
	public String forn_addr_04;
	public String tel_no_05;
	public String cntc_rshp;

	public HD_INFO_6000_LCURLIST5Record(){}

	public void setZip_1_01(String zip_1_01){
		this.zip_1_01 = zip_1_01;
	}

	public void setZip_2_01(String zip_2_01){
		this.zip_2_01 = zip_2_01;
	}

	public void setAddr_01(String addr_01){
		this.addr_01 = addr_01;
	}

	public void setDtls_addr_01(String dtls_addr_01){
		this.dtls_addr_01 = dtls_addr_01;
	}

	public void setTel_no_01(String tel_no_01){
		this.tel_no_01 = tel_no_01;
	}

	public void setFax_no_01(String fax_no_01){
		this.fax_no_01 = fax_no_01;
	}

	public void setPtph_no_01(String ptph_no_01){
		this.ptph_no_01 = ptph_no_01;
	}

	public void setEmail_id_01(String email_id_01){
		this.email_id_01 = email_id_01;
	}

	public void setForn_zip_01(String forn_zip_01){
		this.forn_zip_01 = forn_zip_01;
	}

	public void setForn_addr_01(String forn_addr_01){
		this.forn_addr_01 = forn_addr_01;
	}

	public void setZip_1_02(String zip_1_02){
		this.zip_1_02 = zip_1_02;
	}

	public void setZip_2_02(String zip_2_02){
		this.zip_2_02 = zip_2_02;
	}

	public void setAddr_02(String addr_02){
		this.addr_02 = addr_02;
	}

	public void setDtls_addr_02(String dtls_addr_02){
		this.dtls_addr_02 = dtls_addr_02;
	}

	public void setTel_no_02(String tel_no_02){
		this.tel_no_02 = tel_no_02;
	}

	public void setFax_no_02(String fax_no_02){
		this.fax_no_02 = fax_no_02;
	}

	public void setPtph_no_02(String ptph_no_02){
		this.ptph_no_02 = ptph_no_02;
	}

	public void setEmail_id_02(String email_id_02){
		this.email_id_02 = email_id_02;
	}

	public void setForn_zip_02(String forn_zip_02){
		this.forn_zip_02 = forn_zip_02;
	}

	public void setForn_addr_02(String forn_addr_02){
		this.forn_addr_02 = forn_addr_02;
	}

	public void setZip_1_03(String zip_1_03){
		this.zip_1_03 = zip_1_03;
	}

	public void setZip_2_03(String zip_2_03){
		this.zip_2_03 = zip_2_03;
	}

	public void setAddr_03(String addr_03){
		this.addr_03 = addr_03;
	}

	public void setDtls_addr_03(String dtls_addr_03){
		this.dtls_addr_03 = dtls_addr_03;
	}

	public void setTel_no_03(String tel_no_03){
		this.tel_no_03 = tel_no_03;
	}

	public void setFax_no_03(String fax_no_03){
		this.fax_no_03 = fax_no_03;
	}

	public void setPtph_no_03(String ptph_no_03){
		this.ptph_no_03 = ptph_no_03;
	}

	public void setEmail_id_03(String email_id_03){
		this.email_id_03 = email_id_03;
	}

	public void setForn_zip_03(String forn_zip_03){
		this.forn_zip_03 = forn_zip_03;
	}

	public void setForn_addr_03(String forn_addr_03){
		this.forn_addr_03 = forn_addr_03;
	}

	public void setZip_1_04(String zip_1_04){
		this.zip_1_04 = zip_1_04;
	}

	public void setZip_2_04(String zip_2_04){
		this.zip_2_04 = zip_2_04;
	}

	public void setAddr_04(String addr_04){
		this.addr_04 = addr_04;
	}

	public void setDtls_addr_04(String dtls_addr_04){
		this.dtls_addr_04 = dtls_addr_04;
	}

	public void setTel_no_04(String tel_no_04){
		this.tel_no_04 = tel_no_04;
	}

	public void setFax_no_04(String fax_no_04){
		this.fax_no_04 = fax_no_04;
	}

	public void setPtph_no_04(String ptph_no_04){
		this.ptph_no_04 = ptph_no_04;
	}

	public void setEmail_id_04(String email_id_04){
		this.email_id_04 = email_id_04;
	}

	public void setForn_zip_04(String forn_zip_04){
		this.forn_zip_04 = forn_zip_04;
	}

	public void setForn_addr_04(String forn_addr_04){
		this.forn_addr_04 = forn_addr_04;
	}

	public void setTel_no_05(String tel_no_05){
		this.tel_no_05 = tel_no_05;
	}

	public void setCntc_rshp(String cntc_rshp){
		this.cntc_rshp = cntc_rshp;
	}

	public String getZip_1_01(){
		return this.zip_1_01;
	}

	public String getZip_2_01(){
		return this.zip_2_01;
	}

	public String getAddr_01(){
		return this.addr_01;
	}

	public String getDtls_addr_01(){
		return this.dtls_addr_01;
	}

	public String getTel_no_01(){
		return this.tel_no_01;
	}

	public String getFax_no_01(){
		return this.fax_no_01;
	}

	public String getPtph_no_01(){
		return this.ptph_no_01;
	}

	public String getEmail_id_01(){
		return this.email_id_01;
	}

	public String getForn_zip_01(){
		return this.forn_zip_01;
	}

	public String getForn_addr_01(){
		return this.forn_addr_01;
	}

	public String getZip_1_02(){
		return this.zip_1_02;
	}

	public String getZip_2_02(){
		return this.zip_2_02;
	}

	public String getAddr_02(){
		return this.addr_02;
	}

	public String getDtls_addr_02(){
		return this.dtls_addr_02;
	}

	public String getTel_no_02(){
		return this.tel_no_02;
	}

	public String getFax_no_02(){
		return this.fax_no_02;
	}

	public String getPtph_no_02(){
		return this.ptph_no_02;
	}

	public String getEmail_id_02(){
		return this.email_id_02;
	}

	public String getForn_zip_02(){
		return this.forn_zip_02;
	}

	public String getForn_addr_02(){
		return this.forn_addr_02;
	}

	public String getZip_1_03(){
		return this.zip_1_03;
	}

	public String getZip_2_03(){
		return this.zip_2_03;
	}

	public String getAddr_03(){
		return this.addr_03;
	}

	public String getDtls_addr_03(){
		return this.dtls_addr_03;
	}

	public String getTel_no_03(){
		return this.tel_no_03;
	}

	public String getFax_no_03(){
		return this.fax_no_03;
	}

	public String getPtph_no_03(){
		return this.ptph_no_03;
	}

	public String getEmail_id_03(){
		return this.email_id_03;
	}

	public String getForn_zip_03(){
		return this.forn_zip_03;
	}

	public String getForn_addr_03(){
		return this.forn_addr_03;
	}

	public String getZip_1_04(){
		return this.zip_1_04;
	}

	public String getZip_2_04(){
		return this.zip_2_04;
	}

	public String getAddr_04(){
		return this.addr_04;
	}

	public String getDtls_addr_04(){
		return this.dtls_addr_04;
	}

	public String getTel_no_04(){
		return this.tel_no_04;
	}

	public String getFax_no_04(){
		return this.fax_no_04;
	}

	public String getPtph_no_04(){
		return this.ptph_no_04;
	}

	public String getEmail_id_04(){
		return this.email_id_04;
	}

	public String getForn_zip_04(){
		return this.forn_zip_04;
	}

	public String getForn_addr_04(){
		return this.forn_addr_04;
	}

	public String getTel_no_05(){
		return this.tel_no_05;
	}

	public String getCntc_rshp(){
		return this.cntc_rshp;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */