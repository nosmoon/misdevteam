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


public class TN_DNS_3040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String accflag;
	public String receiptidx;
	public String deptidx;
	public String receiptcode;
	public String donatorcategory;
	public String receiptcategory;
	public String issuecategory;
	public String receiptyear;
	public String issuedate;
	public String name;
	public String memberidx;
	public String regno;
	public String addresstype;
	public String zipcode;
	public String address;
	public String addressdetail;
	public String memo;
	public String adminidx;
	public String price;
	public String issuecount;
	public String issuedatecategory;
	public String receiptdocument;
	public String paymentidx;

	public TN_DNS_3040_ADM(){}
	public TN_DNS_3040_ADM(String cmpy_cd, String incmg_pers, String accflag, String receiptidx, String deptidx, String receiptcode, String donatorcategory, String receiptcategory, String issuecategory, String receiptyear, String issuedate, String name, String memberidx, String regno, String addresstype, String zipcode, String address, String addressdetail, String memo, String adminidx, String price, String issuecount, String issuedatecategory, String receiptdocument, String paymentidx){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.accflag = accflag;
		this.receiptidx = receiptidx;
		this.deptidx = deptidx;
		this.receiptcode = receiptcode;
		this.donatorcategory = donatorcategory;
		this.receiptcategory = receiptcategory;
		this.issuecategory = issuecategory;
		this.receiptyear = receiptyear;
		this.issuedate = issuedate;
		this.name = name;
		this.memberidx = memberidx;
		this.regno = regno;
		this.addresstype = addresstype;
		this.zipcode = zipcode;
		this.address = address;
		this.addressdetail = addressdetail;
		this.memo = memo;
		this.adminidx = adminidx;
		this.price = price;
		this.issuecount = issuecount;
		this.issuedatecategory = issuedatecategory;
		this.receiptdocument = receiptdocument;
		this.paymentidx = paymentidx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setReceiptidx(String receiptidx){
		this.receiptidx = receiptidx;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public void setDonatorcategory(String donatorcategory){
		this.donatorcategory = donatorcategory;
	}

	public void setReceiptcategory(String receiptcategory){
		this.receiptcategory = receiptcategory;
	}

	public void setIssuecategory(String issuecategory){
		this.issuecategory = issuecategory;
	}

	public void setReceiptyear(String receiptyear){
		this.receiptyear = receiptyear;
	}

	public void setIssuedate(String issuedate){
		this.issuedate = issuedate;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setAddresstype(String addresstype){
		this.addresstype = addresstype;
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

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setAdminidx(String adminidx){
		this.adminidx = adminidx;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public void setIssuecount(String issuecount){
		this.issuecount = issuecount;
	}

	public void setIssuedatecategory(String issuedatecategory){
		this.issuedatecategory = issuedatecategory;
	}

	public void setReceiptdocument(String receiptdocument){
		this.receiptdocument = receiptdocument;
	}

	public void setPaymentidx(String paymentidx){
		this.paymentidx = paymentidx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getReceiptidx(){
		return this.receiptidx;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}

	public String getDonatorcategory(){
		return this.donatorcategory;
	}

	public String getReceiptcategory(){
		return this.receiptcategory;
	}

	public String getIssuecategory(){
		return this.issuecategory;
	}

	public String getReceiptyear(){
		return this.receiptyear;
	}

	public String getIssuedate(){
		return this.issuedate;
	}

	public String getName(){
		return this.name;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getAddresstype(){
		return this.addresstype;
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

	public String getMemo(){
		return this.memo;
	}

	public String getAdminidx(){
		return this.adminidx;
	}

	public String getPrice(){
		return this.price;
	}

	public String getIssuecount(){
		return this.issuecount;
	}

	public String getIssuedatecategory(){
		return this.issuedatecategory;
	}

	public String getReceiptdocument(){
		return this.receiptdocument;
	}

	public String getPaymentidx(){
		return this.paymentidx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_3040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_3040_ADM dm = (TN_DNS_3040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.accflag);
		cstmt.setString(6, dm.receiptidx);
		cstmt.setString(7, dm.deptidx);
		cstmt.setString(8, dm.receiptcode);
		cstmt.setString(9, dm.donatorcategory);
		cstmt.setString(10, dm.receiptcategory);
		cstmt.setString(11, dm.issuecategory);
		cstmt.setString(12, dm.receiptyear);
		cstmt.setString(13, dm.issuedate);
		cstmt.setString(14, dm.name);
		cstmt.setString(15, dm.memberidx);
		cstmt.setString(16, dm.regno);
		cstmt.setString(17, dm.addresstype);
		cstmt.setString(18, dm.zipcode);
		cstmt.setString(19, dm.address);
		cstmt.setString(20, dm.addressdetail);
		cstmt.setString(21, dm.memo);
		cstmt.setString(22, dm.adminidx);
		cstmt.setString(23, dm.price);
		cstmt.setString(24, dm.issuecount);
		cstmt.setString(25, dm.issuedatecategory);
		cstmt.setString(26, dm.receiptdocument);
		cstmt.setString(27, dm.paymentidx);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_3040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("receiptidx = [" + getReceiptidx() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("receiptcode = [" + getReceiptcode() + "]");
		System.out.println("donatorcategory = [" + getDonatorcategory() + "]");
		System.out.println("receiptcategory = [" + getReceiptcategory() + "]");
		System.out.println("issuecategory = [" + getIssuecategory() + "]");
		System.out.println("receiptyear = [" + getReceiptyear() + "]");
		System.out.println("issuedate = [" + getIssuedate() + "]");
		System.out.println("name = [" + getName() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("regno = [" + getRegno() + "]");
		System.out.println("addresstype = [" + getAddresstype() + "]");
		System.out.println("zipcode = [" + getZipcode() + "]");
		System.out.println("address = [" + getAddress() + "]");
		System.out.println("addressdetail = [" + getAddressdetail() + "]");
		System.out.println("memo = [" + getMemo() + "]");
		System.out.println("adminidx = [" + getAdminidx() + "]");
		System.out.println("price = [" + getPrice() + "]");
		System.out.println("issuecount = [" + getIssuecount() + "]");
		System.out.println("issuedatecategory = [" + getIssuedatecategory() + "]");
		System.out.println("receiptdocument = [" + getReceiptdocument() + "]");
		System.out.println("paymentidx = [" + getPaymentidx() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String receiptidx = req.getParameter("receiptidx");
if( receiptidx == null){
	System.out.println(this.toString+" : receiptidx is null" );
}else{
	System.out.println(this.toString+" : receiptidx is "+receiptidx );
}
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
String receiptcode = req.getParameter("receiptcode");
if( receiptcode == null){
	System.out.println(this.toString+" : receiptcode is null" );
}else{
	System.out.println(this.toString+" : receiptcode is "+receiptcode );
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
String issuecategory = req.getParameter("issuecategory");
if( issuecategory == null){
	System.out.println(this.toString+" : issuecategory is null" );
}else{
	System.out.println(this.toString+" : issuecategory is "+issuecategory );
}
String receiptyear = req.getParameter("receiptyear");
if( receiptyear == null){
	System.out.println(this.toString+" : receiptyear is null" );
}else{
	System.out.println(this.toString+" : receiptyear is "+receiptyear );
}
String issuedate = req.getParameter("issuedate");
if( issuedate == null){
	System.out.println(this.toString+" : issuedate is null" );
}else{
	System.out.println(this.toString+" : issuedate is "+issuedate );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
String memberidx = req.getParameter("memberidx");
if( memberidx == null){
	System.out.println(this.toString+" : memberidx is null" );
}else{
	System.out.println(this.toString+" : memberidx is "+memberidx );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String addresstype = req.getParameter("addresstype");
if( addresstype == null){
	System.out.println(this.toString+" : addresstype is null" );
}else{
	System.out.println(this.toString+" : addresstype is "+addresstype );
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
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String adminidx = req.getParameter("adminidx");
if( adminidx == null){
	System.out.println(this.toString+" : adminidx is null" );
}else{
	System.out.println(this.toString+" : adminidx is "+adminidx );
}
String price = req.getParameter("price");
if( price == null){
	System.out.println(this.toString+" : price is null" );
}else{
	System.out.println(this.toString+" : price is "+price );
}
String issuecount = req.getParameter("issuecount");
if( issuecount == null){
	System.out.println(this.toString+" : issuecount is null" );
}else{
	System.out.println(this.toString+" : issuecount is "+issuecount );
}
String issuedatecategory = req.getParameter("issuedatecategory");
if( issuedatecategory == null){
	System.out.println(this.toString+" : issuedatecategory is null" );
}else{
	System.out.println(this.toString+" : issuedatecategory is "+issuedatecategory );
}
String receiptdocument = req.getParameter("receiptdocument");
if( receiptdocument == null){
	System.out.println(this.toString+" : receiptdocument is null" );
}else{
	System.out.println(this.toString+" : receiptdocument is "+receiptdocument );
}
String paymentidx = req.getParameter("paymentidx");
if( paymentidx == null){
	System.out.println(this.toString+" : paymentidx is null" );
}else{
	System.out.println(this.toString+" : paymentidx is "+paymentidx );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String receiptidx = Util.checkString(req.getParameter("receiptidx"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
String receiptcode = Util.checkString(req.getParameter("receiptcode"));
String donatorcategory = Util.checkString(req.getParameter("donatorcategory"));
String receiptcategory = Util.checkString(req.getParameter("receiptcategory"));
String issuecategory = Util.checkString(req.getParameter("issuecategory"));
String receiptyear = Util.checkString(req.getParameter("receiptyear"));
String issuedate = Util.checkString(req.getParameter("issuedate"));
String name = Util.checkString(req.getParameter("name"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String regno = Util.checkString(req.getParameter("regno"));
String addresstype = Util.checkString(req.getParameter("addresstype"));
String zipcode = Util.checkString(req.getParameter("zipcode"));
String address = Util.checkString(req.getParameter("address"));
String addressdetail = Util.checkString(req.getParameter("addressdetail"));
String memo = Util.checkString(req.getParameter("memo"));
String adminidx = Util.checkString(req.getParameter("adminidx"));
String price = Util.checkString(req.getParameter("price"));
String issuecount = Util.checkString(req.getParameter("issuecount"));
String issuedatecategory = Util.checkString(req.getParameter("issuedatecategory"));
String receiptdocument = Util.checkString(req.getParameter("receiptdocument"));
String paymentidx = Util.checkString(req.getParameter("paymentidx"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String receiptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptidx")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
String receiptcode = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcode")));
String donatorcategory = Util.Uni2Ksc(Util.checkString(req.getParameter("donatorcategory")));
String receiptcategory = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcategory")));
String issuecategory = Util.Uni2Ksc(Util.checkString(req.getParameter("issuecategory")));
String receiptyear = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptyear")));
String issuedate = Util.Uni2Ksc(Util.checkString(req.getParameter("issuedate")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String addresstype = Util.Uni2Ksc(Util.checkString(req.getParameter("addresstype")));
String zipcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode")));
String address = Util.Uni2Ksc(Util.checkString(req.getParameter("address")));
String addressdetail = Util.Uni2Ksc(Util.checkString(req.getParameter("addressdetail")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String adminidx = Util.Uni2Ksc(Util.checkString(req.getParameter("adminidx")));
String price = Util.Uni2Ksc(Util.checkString(req.getParameter("price")));
String issuecount = Util.Uni2Ksc(Util.checkString(req.getParameter("issuecount")));
String issuedatecategory = Util.Uni2Ksc(Util.checkString(req.getParameter("issuedatecategory")));
String receiptdocument = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptdocument")));
String paymentidx = Util.Uni2Ksc(Util.checkString(req.getParameter("paymentidx")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setAccflag(accflag);
dm.setReceiptidx(receiptidx);
dm.setDeptidx(deptidx);
dm.setReceiptcode(receiptcode);
dm.setDonatorcategory(donatorcategory);
dm.setReceiptcategory(receiptcategory);
dm.setIssuecategory(issuecategory);
dm.setReceiptyear(receiptyear);
dm.setIssuedate(issuedate);
dm.setName(name);
dm.setMemberidx(memberidx);
dm.setRegno(regno);
dm.setAddresstype(addresstype);
dm.setZipcode(zipcode);
dm.setAddress(address);
dm.setAddressdetail(addressdetail);
dm.setMemo(memo);
dm.setAdminidx(adminidx);
dm.setPrice(price);
dm.setIssuecount(issuecount);
dm.setIssuedatecategory(issuedatecategory);
dm.setReceiptdocument(receiptdocument);
dm.setPaymentidx(paymentidx);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 24 18:34:27 KST 2016 */