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


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1510_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String his_memberidx;
	public String his_membertype;
	public String his_membercategorycode;
	public String his_name;
	public String his_isanonymous;
	public String his_memo;
	public String his_promiseconfirmno;
	public String his_chgdt;
	public String his_memberidxinfo;
	public String his_isforeigner;
	public String his_regno;
	public String his_unknownregno;
	public String his_birthdayorigin;
	public String his_birthdaytype;
	public String his_birthday;
	public String his_businessno;
	public String his_president;
	public String his_partycode;
	public String his_memberidxaddr;
	public String his_useaddress;
	public String his_addressname;
	public String his_dept;
	public String his_title;
	public String his_phone1;
	public String his_cellphone;
	public String his_fax;
	public String his_email;
	public String his_zipcode1;
	public String his_address1;
	public String his_addressdetail1;
	public String his_zipcode2;
	public String his_address2;
	public String his_addressdetail2;
	public String his_postaddress;

	public TN_RPT_1510_LCURLIST1Record(){}

	public void setHis_memberidx(String his_memberidx){
		this.his_memberidx = his_memberidx;
	}

	public void setHis_membertype(String his_membertype){
		this.his_membertype = his_membertype;
	}

	public void setHis_membercategorycode(String his_membercategorycode){
		this.his_membercategorycode = his_membercategorycode;
	}

	public void setHis_name(String his_name){
		this.his_name = his_name;
	}

	public void setHis_isanonymous(String his_isanonymous){
		this.his_isanonymous = his_isanonymous;
	}

	public void setHis_memo(String his_memo){
		this.his_memo = his_memo;
	}

	public void setHis_promiseconfirmno(String his_promiseconfirmno){
		this.his_promiseconfirmno = his_promiseconfirmno;
	}

	public void setHis_chgdt(String his_chgdt){
		this.his_chgdt = his_chgdt;
	}

	public void setHis_memberidxinfo(String his_memberidxinfo){
		this.his_memberidxinfo = his_memberidxinfo;
	}

	public void setHis_isforeigner(String his_isforeigner){
		this.his_isforeigner = his_isforeigner;
	}

	public void setHis_regno(String his_regno){
		this.his_regno = his_regno;
	}

	public void setHis_unknownregno(String his_unknownregno){
		this.his_unknownregno = his_unknownregno;
	}

	public void setHis_birthdayorigin(String his_birthdayorigin){
		this.his_birthdayorigin = his_birthdayorigin;
	}

	public void setHis_birthdaytype(String his_birthdaytype){
		this.his_birthdaytype = his_birthdaytype;
	}

	public void setHis_birthday(String his_birthday){
		this.his_birthday = his_birthday;
	}

	public void setHis_businessno(String his_businessno){
		this.his_businessno = his_businessno;
	}

	public void setHis_president(String his_president){
		this.his_president = his_president;
	}

	public void setHis_partycode(String his_partycode){
		this.his_partycode = his_partycode;
	}

	public void setHis_memberidxaddr(String his_memberidxaddr){
		this.his_memberidxaddr = his_memberidxaddr;
	}

	public void setHis_useaddress(String his_useaddress){
		this.his_useaddress = his_useaddress;
	}

	public void setHis_addressname(String his_addressname){
		this.his_addressname = his_addressname;
	}

	public void setHis_dept(String his_dept){
		this.his_dept = his_dept;
	}

	public void setHis_title(String his_title){
		this.his_title = his_title;
	}

	public void setHis_phone1(String his_phone1){
		this.his_phone1 = his_phone1;
	}

	public void setHis_cellphone(String his_cellphone){
		this.his_cellphone = his_cellphone;
	}

	public void setHis_fax(String his_fax){
		this.his_fax = his_fax;
	}

	public void setHis_email(String his_email){
		this.his_email = his_email;
	}

	public void setHis_zipcode1(String his_zipcode1){
		this.his_zipcode1 = his_zipcode1;
	}

	public void setHis_address1(String his_address1){
		this.his_address1 = his_address1;
	}

	public void setHis_addressdetail1(String his_addressdetail1){
		this.his_addressdetail1 = his_addressdetail1;
	}

	public void setHis_zipcode2(String his_zipcode2){
		this.his_zipcode2 = his_zipcode2;
	}

	public void setHis_address2(String his_address2){
		this.his_address2 = his_address2;
	}

	public void setHis_addressdetail2(String his_addressdetail2){
		this.his_addressdetail2 = his_addressdetail2;
	}

	public void setHis_postaddress(String his_postaddress){
		this.his_postaddress = his_postaddress;
	}

	public String getHis_memberidx(){
		return this.his_memberidx;
	}

	public String getHis_membertype(){
		return this.his_membertype;
	}

	public String getHis_membercategorycode(){
		return this.his_membercategorycode;
	}

	public String getHis_name(){
		return this.his_name;
	}

	public String getHis_isanonymous(){
		return this.his_isanonymous;
	}

	public String getHis_memo(){
		return this.his_memo;
	}

	public String getHis_promiseconfirmno(){
		return this.his_promiseconfirmno;
	}

	public String getHis_chgdt(){
		return this.his_chgdt;
	}

	public String getHis_memberidxinfo(){
		return this.his_memberidxinfo;
	}

	public String getHis_isforeigner(){
		return this.his_isforeigner;
	}

	public String getHis_regno(){
		return this.his_regno;
	}

	public String getHis_unknownregno(){
		return this.his_unknownregno;
	}

	public String getHis_birthdayorigin(){
		return this.his_birthdayorigin;
	}

	public String getHis_birthdaytype(){
		return this.his_birthdaytype;
	}

	public String getHis_birthday(){
		return this.his_birthday;
	}

	public String getHis_businessno(){
		return this.his_businessno;
	}

	public String getHis_president(){
		return this.his_president;
	}

	public String getHis_partycode(){
		return this.his_partycode;
	}

	public String getHis_memberidxaddr(){
		return this.his_memberidxaddr;
	}

	public String getHis_useaddress(){
		return this.his_useaddress;
	}

	public String getHis_addressname(){
		return this.his_addressname;
	}

	public String getHis_dept(){
		return this.his_dept;
	}

	public String getHis_title(){
		return this.his_title;
	}

	public String getHis_phone1(){
		return this.his_phone1;
	}

	public String getHis_cellphone(){
		return this.his_cellphone;
	}

	public String getHis_fax(){
		return this.his_fax;
	}

	public String getHis_email(){
		return this.his_email;
	}

	public String getHis_zipcode1(){
		return this.his_zipcode1;
	}

	public String getHis_address1(){
		return this.his_address1;
	}

	public String getHis_addressdetail1(){
		return this.his_addressdetail1;
	}

	public String getHis_zipcode2(){
		return this.his_zipcode2;
	}

	public String getHis_address2(){
		return this.his_address2;
	}

	public String getHis_addressdetail2(){
		return this.his_addressdetail2;
	}

	public String getHis_postaddress(){
		return this.his_postaddress;
	}
}

/* 작성시간 : Thu Nov 10 15:56:00 KST 2016 */