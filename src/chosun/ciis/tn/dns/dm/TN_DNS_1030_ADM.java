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


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String incmg_pers;
	public String memberidx;
	public String membertype;
	public String membercode;
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

	public TN_DNS_1030_ADM(){}
	public TN_DNS_1030_ADM(String mode, String cmpy_cd, String incmg_pers, String memberidx, String membertype, String membercode, String mbr_name, String isanonymous, String mbr_regno, String isforeigner, String unknownregno, String president, String businessno, String birthdayorigin, String birthday, String birthdaytype, String membercategorycode, String partycode, String writedate, String memo, String adrs_name, String dept, String title, String email, String phone1, String cellphone, String fax, String zipcode1, String address1, String addressdetail1, String zipcode2, String address2, String addressdetail2, String postaddress, String useaddress, String password, String deptidx, String donatorcategory, String receiptcategory, String rcp_name, String rcp_regno, String relation, String zipcode, String address, String addressdetail, String receiptconfigmemo){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.memberidx = memberidx;
		this.membertype = membertype;
		this.membercode = membercode;
		this.mbr_name = mbr_name;
		this.isanonymous = isanonymous;
		this.mbr_regno = mbr_regno;
		this.isforeigner = isforeigner;
		this.unknownregno = unknownregno;
		this.president = president;
		this.businessno = businessno;
		this.birthdayorigin = birthdayorigin;
		this.birthday = birthday;
		this.birthdaytype = birthdaytype;
		this.membercategorycode = membercategorycode;
		this.partycode = partycode;
		this.writedate = writedate;
		this.memo = memo;
		this.adrs_name = adrs_name;
		this.dept = dept;
		this.title = title;
		this.email = email;
		this.phone1 = phone1;
		this.cellphone = cellphone;
		this.fax = fax;
		this.zipcode1 = zipcode1;
		this.address1 = address1;
		this.addressdetail1 = addressdetail1;
		this.zipcode2 = zipcode2;
		this.address2 = address2;
		this.addressdetail2 = addressdetail2;
		this.postaddress = postaddress;
		this.useaddress = useaddress;
		this.password = password;
		this.deptidx = deptidx;
		this.donatorcategory = donatorcategory;
		this.receiptcategory = receiptcategory;
		this.rcp_name = rcp_name;
		this.rcp_regno = rcp_regno;
		this.relation = relation;
		this.zipcode = zipcode;
		this.address = address;
		this.addressdetail = addressdetail;
		this.receiptconfigmemo = receiptconfigmemo;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setMembercode(String membercode){
		this.membercode = membercode;
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

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getMembertype(){
		return this.membertype;
	}

	public String getMembercode(){
		return this.membercode;
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

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_1030_ADM dm = (TN_DNS_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.memberidx);
		cstmt.setString(7, dm.membertype);
		cstmt.setString(8, dm.membercode);
		cstmt.setString(9, dm.mbr_name);
		cstmt.setString(10, dm.isanonymous);
		cstmt.setString(11, dm.mbr_regno);
		cstmt.setString(12, dm.isforeigner);
		cstmt.setString(13, dm.unknownregno);
		cstmt.setString(14, dm.president);
		cstmt.setString(15, dm.businessno);
		cstmt.setString(16, dm.birthdayorigin);
		cstmt.setString(17, dm.birthday);
		cstmt.setString(18, dm.birthdaytype);
		cstmt.setString(19, dm.membercategorycode);
		cstmt.setString(20, dm.partycode);
		cstmt.setString(21, dm.writedate);
		cstmt.setString(22, dm.memo);
		cstmt.setString(23, dm.adrs_name);
		cstmt.setString(24, dm.dept);
		cstmt.setString(25, dm.title);
		cstmt.setString(26, dm.email);
		cstmt.setString(27, dm.phone1);
		cstmt.setString(28, dm.cellphone);
		cstmt.setString(29, dm.fax);
		cstmt.setString(30, dm.zipcode1);
		cstmt.setString(31, dm.address1);
		cstmt.setString(32, dm.addressdetail1);
		cstmt.setString(33, dm.zipcode2);
		cstmt.setString(34, dm.address2);
		cstmt.setString(35, dm.addressdetail2);
		cstmt.setString(36, dm.postaddress);
		cstmt.setString(37, dm.useaddress);
		cstmt.setString(38, dm.password);
		cstmt.setString(39, dm.deptidx);
		cstmt.setString(40, dm.donatorcategory);
		cstmt.setString(41, dm.receiptcategory);
		cstmt.setString(42, dm.rcp_name);
		cstmt.setString(43, dm.rcp_regno);
		cstmt.setString(44, dm.relation);
		cstmt.setString(45, dm.zipcode);
		cstmt.setString(46, dm.address);
		cstmt.setString(47, dm.addressdetail);
		cstmt.setString(48, dm.receiptconfigmemo);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_1030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("membertype = [" + getMembertype() + "]");
		System.out.println("membercode = [" + getMembercode() + "]");
		System.out.println("mbr_name = [" + getMbr_name() + "]");
		System.out.println("isanonymous = [" + getIsanonymous() + "]");
		System.out.println("mbr_regno = [" + getMbr_regno() + "]");
		System.out.println("isforeigner = [" + getIsforeigner() + "]");
		System.out.println("unknownregno = [" + getUnknownregno() + "]");
		System.out.println("president = [" + getPresident() + "]");
		System.out.println("businessno = [" + getBusinessno() + "]");
		System.out.println("birthdayorigin = [" + getBirthdayorigin() + "]");
		System.out.println("birthday = [" + getBirthday() + "]");
		System.out.println("birthdaytype = [" + getBirthdaytype() + "]");
		System.out.println("membercategorycode = [" + getMembercategorycode() + "]");
		System.out.println("partycode = [" + getPartycode() + "]");
		System.out.println("writedate = [" + getWritedate() + "]");
		System.out.println("memo = [" + getMemo() + "]");
		System.out.println("adrs_name = [" + getAdrs_name() + "]");
		System.out.println("dept = [" + getDept() + "]");
		System.out.println("title = [" + getTitle() + "]");
		System.out.println("email = [" + getEmail() + "]");
		System.out.println("phone1 = [" + getPhone1() + "]");
		System.out.println("cellphone = [" + getCellphone() + "]");
		System.out.println("fax = [" + getFax() + "]");
		System.out.println("zipcode1 = [" + getZipcode1() + "]");
		System.out.println("address1 = [" + getAddress1() + "]");
		System.out.println("addressdetail1 = [" + getAddressdetail1() + "]");
		System.out.println("zipcode2 = [" + getZipcode2() + "]");
		System.out.println("address2 = [" + getAddress2() + "]");
		System.out.println("addressdetail2 = [" + getAddressdetail2() + "]");
		System.out.println("postaddress = [" + getPostaddress() + "]");
		System.out.println("useaddress = [" + getUseaddress() + "]");
		System.out.println("password = [" + getPassword() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("donatorcategory = [" + getDonatorcategory() + "]");
		System.out.println("receiptcategory = [" + getReceiptcategory() + "]");
		System.out.println("rcp_name = [" + getRcp_name() + "]");
		System.out.println("rcp_regno = [" + getRcp_regno() + "]");
		System.out.println("relation = [" + getRelation() + "]");
		System.out.println("zipcode = [" + getZipcode() + "]");
		System.out.println("address = [" + getAddress() + "]");
		System.out.println("addressdetail = [" + getAddressdetail() + "]");
		System.out.println("receiptconfigmemo = [" + getReceiptconfigmemo() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String memberidx = req.getParameter("memberidx");
if( memberidx == null){
	System.out.println(this.toString+" : memberidx is null" );
}else{
	System.out.println(this.toString+" : memberidx is "+memberidx );
}
String membertype = req.getParameter("membertype");
if( membertype == null){
	System.out.println(this.toString+" : membertype is null" );
}else{
	System.out.println(this.toString+" : membertype is "+membertype );
}
String membercode = req.getParameter("membercode");
if( membercode == null){
	System.out.println(this.toString+" : membercode is null" );
}else{
	System.out.println(this.toString+" : membercode is "+membercode );
}
String mbr_name = req.getParameter("mbr_name");
if( mbr_name == null){
	System.out.println(this.toString+" : mbr_name is null" );
}else{
	System.out.println(this.toString+" : mbr_name is "+mbr_name );
}
String isanonymous = req.getParameter("isanonymous");
if( isanonymous == null){
	System.out.println(this.toString+" : isanonymous is null" );
}else{
	System.out.println(this.toString+" : isanonymous is "+isanonymous );
}
String mbr_regno = req.getParameter("mbr_regno");
if( mbr_regno == null){
	System.out.println(this.toString+" : mbr_regno is null" );
}else{
	System.out.println(this.toString+" : mbr_regno is "+mbr_regno );
}
String isforeigner = req.getParameter("isforeigner");
if( isforeigner == null){
	System.out.println(this.toString+" : isforeigner is null" );
}else{
	System.out.println(this.toString+" : isforeigner is "+isforeigner );
}
String unknownregno = req.getParameter("unknownregno");
if( unknownregno == null){
	System.out.println(this.toString+" : unknownregno is null" );
}else{
	System.out.println(this.toString+" : unknownregno is "+unknownregno );
}
String president = req.getParameter("president");
if( president == null){
	System.out.println(this.toString+" : president is null" );
}else{
	System.out.println(this.toString+" : president is "+president );
}
String businessno = req.getParameter("businessno");
if( businessno == null){
	System.out.println(this.toString+" : businessno is null" );
}else{
	System.out.println(this.toString+" : businessno is "+businessno );
}
String birthdayorigin = req.getParameter("birthdayorigin");
if( birthdayorigin == null){
	System.out.println(this.toString+" : birthdayorigin is null" );
}else{
	System.out.println(this.toString+" : birthdayorigin is "+birthdayorigin );
}
String birthday = req.getParameter("birthday");
if( birthday == null){
	System.out.println(this.toString+" : birthday is null" );
}else{
	System.out.println(this.toString+" : birthday is "+birthday );
}
String birthdaytype = req.getParameter("birthdaytype");
if( birthdaytype == null){
	System.out.println(this.toString+" : birthdaytype is null" );
}else{
	System.out.println(this.toString+" : birthdaytype is "+birthdaytype );
}
String membercategorycode = req.getParameter("membercategorycode");
if( membercategorycode == null){
	System.out.println(this.toString+" : membercategorycode is null" );
}else{
	System.out.println(this.toString+" : membercategorycode is "+membercategorycode );
}
String partycode = req.getParameter("partycode");
if( partycode == null){
	System.out.println(this.toString+" : partycode is null" );
}else{
	System.out.println(this.toString+" : partycode is "+partycode );
}
String writedate = req.getParameter("writedate");
if( writedate == null){
	System.out.println(this.toString+" : writedate is null" );
}else{
	System.out.println(this.toString+" : writedate is "+writedate );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String adrs_name = req.getParameter("adrs_name");
if( adrs_name == null){
	System.out.println(this.toString+" : adrs_name is null" );
}else{
	System.out.println(this.toString+" : adrs_name is "+adrs_name );
}
String dept = req.getParameter("dept");
if( dept == null){
	System.out.println(this.toString+" : dept is null" );
}else{
	System.out.println(this.toString+" : dept is "+dept );
}
String title = req.getParameter("title");
if( title == null){
	System.out.println(this.toString+" : title is null" );
}else{
	System.out.println(this.toString+" : title is "+title );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String phone1 = req.getParameter("phone1");
if( phone1 == null){
	System.out.println(this.toString+" : phone1 is null" );
}else{
	System.out.println(this.toString+" : phone1 is "+phone1 );
}
String cellphone = req.getParameter("cellphone");
if( cellphone == null){
	System.out.println(this.toString+" : cellphone is null" );
}else{
	System.out.println(this.toString+" : cellphone is "+cellphone );
}
String fax = req.getParameter("fax");
if( fax == null){
	System.out.println(this.toString+" : fax is null" );
}else{
	System.out.println(this.toString+" : fax is "+fax );
}
String zipcode1 = req.getParameter("zipcode1");
if( zipcode1 == null){
	System.out.println(this.toString+" : zipcode1 is null" );
}else{
	System.out.println(this.toString+" : zipcode1 is "+zipcode1 );
}
String address1 = req.getParameter("address1");
if( address1 == null){
	System.out.println(this.toString+" : address1 is null" );
}else{
	System.out.println(this.toString+" : address1 is "+address1 );
}
String addressdetail1 = req.getParameter("addressdetail1");
if( addressdetail1 == null){
	System.out.println(this.toString+" : addressdetail1 is null" );
}else{
	System.out.println(this.toString+" : addressdetail1 is "+addressdetail1 );
}
String zipcode2 = req.getParameter("zipcode2");
if( zipcode2 == null){
	System.out.println(this.toString+" : zipcode2 is null" );
}else{
	System.out.println(this.toString+" : zipcode2 is "+zipcode2 );
}
String address2 = req.getParameter("address2");
if( address2 == null){
	System.out.println(this.toString+" : address2 is null" );
}else{
	System.out.println(this.toString+" : address2 is "+address2 );
}
String addressdetail2 = req.getParameter("addressdetail2");
if( addressdetail2 == null){
	System.out.println(this.toString+" : addressdetail2 is null" );
}else{
	System.out.println(this.toString+" : addressdetail2 is "+addressdetail2 );
}
String postaddress = req.getParameter("postaddress");
if( postaddress == null){
	System.out.println(this.toString+" : postaddress is null" );
}else{
	System.out.println(this.toString+" : postaddress is "+postaddress );
}
String useaddress = req.getParameter("useaddress");
if( useaddress == null){
	System.out.println(this.toString+" : useaddress is null" );
}else{
	System.out.println(this.toString+" : useaddress is "+useaddress );
}
String password = req.getParameter("password");
if( password == null){
	System.out.println(this.toString+" : password is null" );
}else{
	System.out.println(this.toString+" : password is "+password );
}
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
String donatorcategory = req.getParameter("donatorcategory");
if( donatorcategory == null){
	System.out.println(this.toString+" : donatorcategory is null" );
}else{
	System.out.println(this.toString+" : donatorcategory is "+donatorcategory );
}
String receiptcategory = req.getParameter("receiptcategory");
if( receiptcategory == null){
	System.out.println(this.toString+" : receiptcategory is null" );
}else{
	System.out.println(this.toString+" : receiptcategory is "+receiptcategory );
}
String rcp_name = req.getParameter("rcp_name");
if( rcp_name == null){
	System.out.println(this.toString+" : rcp_name is null" );
}else{
	System.out.println(this.toString+" : rcp_name is "+rcp_name );
}
String rcp_regno = req.getParameter("rcp_regno");
if( rcp_regno == null){
	System.out.println(this.toString+" : rcp_regno is null" );
}else{
	System.out.println(this.toString+" : rcp_regno is "+rcp_regno );
}
String relation = req.getParameter("relation");
if( relation == null){
	System.out.println(this.toString+" : relation is null" );
}else{
	System.out.println(this.toString+" : relation is "+relation );
}
String zipcode = req.getParameter("zipcode");
if( zipcode == null){
	System.out.println(this.toString+" : zipcode is null" );
}else{
	System.out.println(this.toString+" : zipcode is "+zipcode );
}
String address = req.getParameter("address");
if( address == null){
	System.out.println(this.toString+" : address is null" );
}else{
	System.out.println(this.toString+" : address is "+address );
}
String addressdetail = req.getParameter("addressdetail");
if( addressdetail == null){
	System.out.println(this.toString+" : addressdetail is null" );
}else{
	System.out.println(this.toString+" : addressdetail is "+addressdetail );
}
String receiptconfigmemo = req.getParameter("receiptconfigmemo");
if( receiptconfigmemo == null){
	System.out.println(this.toString+" : receiptconfigmemo is null" );
}else{
	System.out.println(this.toString+" : receiptconfigmemo is "+receiptconfigmemo );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String membertype = Util.checkString(req.getParameter("membertype"));
String membercode = Util.checkString(req.getParameter("membercode"));
String mbr_name = Util.checkString(req.getParameter("mbr_name"));
String isanonymous = Util.checkString(req.getParameter("isanonymous"));
String mbr_regno = Util.checkString(req.getParameter("mbr_regno"));
String isforeigner = Util.checkString(req.getParameter("isforeigner"));
String unknownregno = Util.checkString(req.getParameter("unknownregno"));
String president = Util.checkString(req.getParameter("president"));
String businessno = Util.checkString(req.getParameter("businessno"));
String birthdayorigin = Util.checkString(req.getParameter("birthdayorigin"));
String birthday = Util.checkString(req.getParameter("birthday"));
String birthdaytype = Util.checkString(req.getParameter("birthdaytype"));
String membercategorycode = Util.checkString(req.getParameter("membercategorycode"));
String partycode = Util.checkString(req.getParameter("partycode"));
String writedate = Util.checkString(req.getParameter("writedate"));
String memo = Util.checkString(req.getParameter("memo"));
String adrs_name = Util.checkString(req.getParameter("adrs_name"));
String dept = Util.checkString(req.getParameter("dept"));
String title = Util.checkString(req.getParameter("title"));
String email = Util.checkString(req.getParameter("email"));
String phone1 = Util.checkString(req.getParameter("phone1"));
String cellphone = Util.checkString(req.getParameter("cellphone"));
String fax = Util.checkString(req.getParameter("fax"));
String zipcode1 = Util.checkString(req.getParameter("zipcode1"));
String address1 = Util.checkString(req.getParameter("address1"));
String addressdetail1 = Util.checkString(req.getParameter("addressdetail1"));
String zipcode2 = Util.checkString(req.getParameter("zipcode2"));
String address2 = Util.checkString(req.getParameter("address2"));
String addressdetail2 = Util.checkString(req.getParameter("addressdetail2"));
String postaddress = Util.checkString(req.getParameter("postaddress"));
String useaddress = Util.checkString(req.getParameter("useaddress"));
String password = Util.checkString(req.getParameter("password"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
String donatorcategory = Util.checkString(req.getParameter("donatorcategory"));
String receiptcategory = Util.checkString(req.getParameter("receiptcategory"));
String rcp_name = Util.checkString(req.getParameter("rcp_name"));
String rcp_regno = Util.checkString(req.getParameter("rcp_regno"));
String relation = Util.checkString(req.getParameter("relation"));
String zipcode = Util.checkString(req.getParameter("zipcode"));
String address = Util.checkString(req.getParameter("address"));
String addressdetail = Util.checkString(req.getParameter("addressdetail"));
String receiptconfigmemo = Util.checkString(req.getParameter("receiptconfigmemo"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String membertype = Util.Uni2Ksc(Util.checkString(req.getParameter("membertype")));
String membercode = Util.Uni2Ksc(Util.checkString(req.getParameter("membercode")));
String mbr_name = Util.Uni2Ksc(Util.checkString(req.getParameter("mbr_name")));
String isanonymous = Util.Uni2Ksc(Util.checkString(req.getParameter("isanonymous")));
String mbr_regno = Util.Uni2Ksc(Util.checkString(req.getParameter("mbr_regno")));
String isforeigner = Util.Uni2Ksc(Util.checkString(req.getParameter("isforeigner")));
String unknownregno = Util.Uni2Ksc(Util.checkString(req.getParameter("unknownregno")));
String president = Util.Uni2Ksc(Util.checkString(req.getParameter("president")));
String businessno = Util.Uni2Ksc(Util.checkString(req.getParameter("businessno")));
String birthdayorigin = Util.Uni2Ksc(Util.checkString(req.getParameter("birthdayorigin")));
String birthday = Util.Uni2Ksc(Util.checkString(req.getParameter("birthday")));
String birthdaytype = Util.Uni2Ksc(Util.checkString(req.getParameter("birthdaytype")));
String membercategorycode = Util.Uni2Ksc(Util.checkString(req.getParameter("membercategorycode")));
String partycode = Util.Uni2Ksc(Util.checkString(req.getParameter("partycode")));
String writedate = Util.Uni2Ksc(Util.checkString(req.getParameter("writedate")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String adrs_name = Util.Uni2Ksc(Util.checkString(req.getParameter("adrs_name")));
String dept = Util.Uni2Ksc(Util.checkString(req.getParameter("dept")));
String title = Util.Uni2Ksc(Util.checkString(req.getParameter("title")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone1")));
String cellphone = Util.Uni2Ksc(Util.checkString(req.getParameter("cellphone")));
String fax = Util.Uni2Ksc(Util.checkString(req.getParameter("fax")));
String zipcode1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode1")));
String address1 = Util.Uni2Ksc(Util.checkString(req.getParameter("address1")));
String addressdetail1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addressdetail1")));
String zipcode2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode2")));
String address2 = Util.Uni2Ksc(Util.checkString(req.getParameter("address2")));
String addressdetail2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addressdetail2")));
String postaddress = Util.Uni2Ksc(Util.checkString(req.getParameter("postaddress")));
String useaddress = Util.Uni2Ksc(Util.checkString(req.getParameter("useaddress")));
String password = Util.Uni2Ksc(Util.checkString(req.getParameter("password")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
String donatorcategory = Util.Uni2Ksc(Util.checkString(req.getParameter("donatorcategory")));
String receiptcategory = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcategory")));
String rcp_name = Util.Uni2Ksc(Util.checkString(req.getParameter("rcp_name")));
String rcp_regno = Util.Uni2Ksc(Util.checkString(req.getParameter("rcp_regno")));
String relation = Util.Uni2Ksc(Util.checkString(req.getParameter("relation")));
String zipcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode")));
String address = Util.Uni2Ksc(Util.checkString(req.getParameter("address")));
String addressdetail = Util.Uni2Ksc(Util.checkString(req.getParameter("addressdetail")));
String receiptconfigmemo = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptconfigmemo")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMemberidx(memberidx);
dm.setMembertype(membertype);
dm.setMembercode(membercode);
dm.setMbr_name(mbr_name);
dm.setIsanonymous(isanonymous);
dm.setMbr_regno(mbr_regno);
dm.setIsforeigner(isforeigner);
dm.setUnknownregno(unknownregno);
dm.setPresident(president);
dm.setBusinessno(businessno);
dm.setBirthdayorigin(birthdayorigin);
dm.setBirthday(birthday);
dm.setBirthdaytype(birthdaytype);
dm.setMembercategorycode(membercategorycode);
dm.setPartycode(partycode);
dm.setWritedate(writedate);
dm.setMemo(memo);
dm.setAdrs_name(adrs_name);
dm.setDept(dept);
dm.setTitle(title);
dm.setEmail(email);
dm.setPhone1(phone1);
dm.setCellphone(cellphone);
dm.setFax(fax);
dm.setZipcode1(zipcode1);
dm.setAddress1(address1);
dm.setAddressdetail1(addressdetail1);
dm.setZipcode2(zipcode2);
dm.setAddress2(address2);
dm.setAddressdetail2(addressdetail2);
dm.setPostaddress(postaddress);
dm.setUseaddress(useaddress);
dm.setPassword(password);
dm.setDeptidx(deptidx);
dm.setDonatorcategory(donatorcategory);
dm.setReceiptcategory(receiptcategory);
dm.setRcp_name(rcp_name);
dm.setRcp_regno(rcp_regno);
dm.setRelation(relation);
dm.setZipcode(zipcode);
dm.setAddress(address);
dm.setAddressdetail(addressdetail);
dm.setReceiptconfigmemo(receiptconfigmemo);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 20 17:05:40 KST 2016 */