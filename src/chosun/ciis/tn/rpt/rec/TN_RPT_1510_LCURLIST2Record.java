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


public class TN_RPT_1510_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String memberidx;
	public String membertype;
	public String membercategorycode;
	public String name;
	public String isanonymous;
	public String memo;
	public String promiseconfirmno;
	public String chgdt;
	public String memberidxinfo;
	public String isforeigner;
	public String regno;
	public String unknownregno;
	public String birthdayorigin;
	public String birthdaytype;
	public String birthday;
	public String businessno;
	public String president;
	public String partycode;
	public String memberidxaddr;
	public String useaddress;
	public String addressname;
	public String dept;
	public String title;
	public String phone1;
	public String cellphone;
	public String fax;
	public String email;
	public String zipcode1;
	public String address1;
	public String addressdetail1;
	public String zipcode2;
	public String address2;
	public String addressdetail2;
	public String postaddress;

	public TN_RPT_1510_LCURLIST2Record(){}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setMembercategorycode(String membercategorycode){
		this.membercategorycode = membercategorycode;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setIsanonymous(String isanonymous){
		this.isanonymous = isanonymous;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setPromiseconfirmno(String promiseconfirmno){
		this.promiseconfirmno = promiseconfirmno;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
	}

	public void setMemberidxinfo(String memberidxinfo){
		this.memberidxinfo = memberidxinfo;
	}

	public void setIsforeigner(String isforeigner){
		this.isforeigner = isforeigner;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setUnknownregno(String unknownregno){
		this.unknownregno = unknownregno;
	}

	public void setBirthdayorigin(String birthdayorigin){
		this.birthdayorigin = birthdayorigin;
	}

	public void setBirthdaytype(String birthdaytype){
		this.birthdaytype = birthdaytype;
	}

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public void setBusinessno(String businessno){
		this.businessno = businessno;
	}

	public void setPresident(String president){
		this.president = president;
	}

	public void setPartycode(String partycode){
		this.partycode = partycode;
	}

	public void setMemberidxaddr(String memberidxaddr){
		this.memberidxaddr = memberidxaddr;
	}

	public void setUseaddress(String useaddress){
		this.useaddress = useaddress;
	}

	public void setAddressname(String addressname){
		this.addressname = addressname;
	}

	public void setDept(String dept){
		this.dept = dept;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setPhone1(String phone1){
		this.phone1 = phone1;
	}

	public void setCellphone(String cellphone){
		this.cellphone = cellphone;
	}

	public void setFax(String fax){
		this.fax = fax;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setZipcode1(String zipcode1){
		this.zipcode1 = zipcode1;
	}

	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public void setAddressdetail1(String addressdetail1){
		this.addressdetail1 = addressdetail1;
	}

	public void setZipcode2(String zipcode2){
		this.zipcode2 = zipcode2;
	}

	public void setAddress2(String address2){
		this.address2 = address2;
	}

	public void setAddressdetail2(String addressdetail2){
		this.addressdetail2 = addressdetail2;
	}

	public void setPostaddress(String postaddress){
		this.postaddress = postaddress;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getMembertype(){
		return this.membertype;
	}

	public String getMembercategorycode(){
		return this.membercategorycode;
	}

	public String getName(){
		return this.name;
	}

	public String getIsanonymous(){
		return this.isanonymous;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getPromiseconfirmno(){
		return this.promiseconfirmno;
	}

	public String getChgdt(){
		return this.chgdt;
	}

	public String getMemberidxinfo(){
		return this.memberidxinfo;
	}

	public String getIsforeigner(){
		return this.isforeigner;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getUnknownregno(){
		return this.unknownregno;
	}

	public String getBirthdayorigin(){
		return this.birthdayorigin;
	}

	public String getBirthdaytype(){
		return this.birthdaytype;
	}

	public String getBirthday(){
		return this.birthday;
	}

	public String getBusinessno(){
		return this.businessno;
	}

	public String getPresident(){
		return this.president;
	}

	public String getPartycode(){
		return this.partycode;
	}

	public String getMemberidxaddr(){
		return this.memberidxaddr;
	}

	public String getUseaddress(){
		return this.useaddress;
	}

	public String getAddressname(){
		return this.addressname;
	}

	public String getDept(){
		return this.dept;
	}

	public String getTitle(){
		return this.title;
	}

	public String getPhone1(){
		return this.phone1;
	}

	public String getCellphone(){
		return this.cellphone;
	}

	public String getFax(){
		return this.fax;
	}

	public String getEmail(){
		return this.email;
	}

	public String getZipcode1(){
		return this.zipcode1;
	}

	public String getAddress1(){
		return this.address1;
	}

	public String getAddressdetail1(){
		return this.addressdetail1;
	}

	public String getZipcode2(){
		return this.zipcode2;
	}

	public String getAddress2(){
		return this.address2;
	}

	public String getAddressdetail2(){
		return this.addressdetail2;
	}

	public String getPostaddress(){
		return this.postaddress;
	}
}

/* 작성시간 : Thu Nov 10 15:56:00 KST 2016 */