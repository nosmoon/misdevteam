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


package chosun.ciis.tn.dns.rec;

import java.sql.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

/**
 * 
 */


public class TN_DNS_1020_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String membertype;
	public String membercode;
	public String memberidx;
	public String mbr_name;
	public String isanonymous;
	public String mbr_regno;
	public String isforeigner;
	public String unknownregno;
	public String president;
	public String businessno;
	public String birthdayorigin;
	public String birthday;
	public String birthdaytype;
	public String membercategorycode;
	public String partycode;
	public String writedate;
	public String memo;
	public String adrs_name;
	public String dept;
	public String title;
	public String email;
	public String phone1;
	public String phone2;
	public String cellphone;
	public String fax;
	public String zipcode1;
	public String address1;
	public String addressdetail1;
	public String zipcode2;
	public String address2;
	public String addressdetail2;
	public String postaddress;
	public String useaddress;
	public String password;
	public String deptidx;
	public String donatorcategory;
	public String receiptcategory;
	public String rcp_name;
	public String rcp_regno;
	public String relation;
	public String zipcode;
	public String address;
	public String addressdetail;
	public String receiptconfigmemo;

	public TN_DNS_1020_LCURLIST1Record(){}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setMembercode(String membercode){
		this.membercode = membercode;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setMbr_name(String mbr_name){
		this.mbr_name = mbr_name;
	}

	public void setIsanonymous(String isanonymous){
		this.isanonymous = isanonymous;
	}

	public void setMbr_regno(String mbr_regno){
		this.mbr_regno = mbr_regno;
	}

	public void setIsforeigner(String isforeigner){
		this.isforeigner = isforeigner;
	}

	public void setUnknownregno(String unknownregno){
		this.unknownregno = unknownregno;
	}

	public void setPresident(String president){
		this.president = president;
	}

	public void setBusinessno(String businessno){
		this.businessno = businessno;
	}

	public void setBirthdayorigin(String birthdayorigin){
		this.birthdayorigin = birthdayorigin;
	}

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public void setBirthdaytype(String birthdaytype){
		this.birthdaytype = birthdaytype;
	}

	public void setMembercategorycode(String membercategorycode){
		this.membercategorycode = membercategorycode;
	}

	public void setPartycode(String partycode){
		this.partycode = partycode;
	}

	public void setWritedate(String writedate){
		this.writedate = writedate;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setAdrs_name(String adrs_name){
		this.adrs_name = adrs_name;
	}

	public void setDept(String dept){
		this.dept = dept;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPhone1(String phone1){
		this.phone1 = phone1;
	}

	public void setPhone2(String phone2){
		this.phone2 = phone2;
	}

	public void setCellphone(String cellphone){
		this.cellphone = cellphone;
	}

	public void setFax(String fax){
		this.fax = fax;
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

	public void setUseaddress(String useaddress){
		this.useaddress = useaddress;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setDonatorcategory(String donatorcategory){
		this.donatorcategory = donatorcategory;
	}

	public void setReceiptcategory(String receiptcategory){
		this.receiptcategory = receiptcategory;
	}

	public void setRcp_name(String rcp_name){
		this.rcp_name = rcp_name;
	}

	public void setRcp_regno(String rcp_regno){
		this.rcp_regno = rcp_regno;
	}

	public void setRelation(String relation){
		this.relation = relation;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setAddressdetail(String addressdetail){
		this.addressdetail = addressdetail;
	}

	public void setReceiptconfigmemo(String receiptconfigmemo){
		this.receiptconfigmemo = receiptconfigmemo;
	}

	public String getMembertype(){
		return this.membertype;
	}

	public String getMembercode(){
		return this.membercode;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getMbr_name(){
		return this.mbr_name;
	}

	public String getIsanonymous(){
		return this.isanonymous;
	}

	public String getMbr_regno(){
		return this.mbr_regno;
	}

	public String getIsforeigner(){
		return this.isforeigner;
	}

	public String getUnknownregno(){
		return this.unknownregno;
	}

	public String getPresident(){
		return this.president;
	}

	public String getBusinessno(){
		return this.businessno;
	}

	public String getBirthdayorigin(){
		return this.birthdayorigin;
	}

	public String getBirthday(){
		return this.birthday;
	}

	public String getBirthdaytype(){
		return this.birthdaytype;
	}

	public String getMembercategorycode(){
		return this.membercategorycode;
	}

	public String getPartycode(){
		return this.partycode;
	}

	public String getWritedate(){
		return this.writedate;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getAdrs_name(){
		return this.adrs_name;
	}

	public String getDept(){
		return this.dept;
	}

	public String getTitle(){
		return this.title;
	}

	public String getEmail(){
		return this.email;
	}

	public String getPhone1(){
		return this.phone1;
	}

	public String getPhone2(){
		return this.phone2;
	}

	public String getCellphone(){
		return this.cellphone;
	}

	public String getFax(){
		return this.fax;
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

	public String getUseaddress(){
		return this.useaddress;
	}

	public String getPassword(){
		return this.password;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getDonatorcategory(){
		return this.donatorcategory;
	}

	public String getReceiptcategory(){
		return this.receiptcategory;
	}

	public String getRcp_name(){
		return this.rcp_name;
	}

	public String getRcp_regno(){
		return this.rcp_regno;
	}

	public String getRelation(){
		return this.relation;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAddress(){
		return this.address;
	}

	public String getAddressdetail(){
		return this.addressdetail;
	}

	public String getReceiptconfigmemo(){
		return this.receiptconfigmemo;
	}
}

/* 작성시간 : Mon Dec 12 18:09:25 KST 2016 */