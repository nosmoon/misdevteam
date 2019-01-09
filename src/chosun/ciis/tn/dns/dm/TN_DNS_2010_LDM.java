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


public class TN_DNS_2010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String membertype;
	public String name;
	public String isanonymous;
	public String isforeigner;
	public String membercode_to;
	public String membercode_fr;
	public String regno1;
	public String regno2;
	public String telno;
	public String businessno;
	public String promisecode_fr;
	public String promisecode_to;
	public String promiseprice_fr;
	public String promiseprice_to;
	public String payprice_fr;
	public String payprice_to;
	public String fundtype;
	public String paymethodcode;
	public String paymentcode_fr;
	public String paymentcode_to;
	public String bankaccountowner;
	public String memo;

	public TN_DNS_2010_LDM(){}
	public TN_DNS_2010_LDM(String cmpy_cd, String membertype, String name, String isanonymous, String isforeigner, String membercode_to, String membercode_fr, String regno1, String regno2, String telno, String businessno, String promisecode_fr, String promisecode_to, String promiseprice_fr, String promiseprice_to, String payprice_fr, String payprice_to, String fundtype, String paymethodcode, String paymentcode_fr, String paymentcode_to, String bankaccountowner, String memo){
		this.cmpy_cd = cmpy_cd;
		this.membertype = membertype;
		this.name = name;
		this.isanonymous = isanonymous;
		this.isforeigner = isforeigner;
		this.membercode_to = membercode_to;
		this.membercode_fr = membercode_fr;
		this.regno1 = regno1;
		this.regno2 = regno2;
		this.telno = telno;
		this.businessno = businessno;
		this.promisecode_fr = promisecode_fr;
		this.promisecode_to = promisecode_to;
		this.promiseprice_fr = promiseprice_fr;
		this.promiseprice_to = promiseprice_to;
		this.payprice_fr = payprice_fr;
		this.payprice_to = payprice_to;
		this.fundtype = fundtype;
		this.paymethodcode = paymethodcode;
		this.paymentcode_fr = paymentcode_fr;
		this.paymentcode_to = paymentcode_to;
		this.bankaccountowner = bankaccountowner;
		this.memo = memo;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setIsanonymous(String isanonymous){
		this.isanonymous = isanonymous;
	}

	public void setIsforeigner(String isforeigner){
		this.isforeigner = isforeigner;
	}

	public void setMembercode_to(String membercode_to){
		this.membercode_to = membercode_to;
	}

	public void setMembercode_fr(String membercode_fr){
		this.membercode_fr = membercode_fr;
	}

	public void setRegno1(String regno1){
		this.regno1 = regno1;
	}

	public void setRegno2(String regno2){
		this.regno2 = regno2;
	}

	public void setTelno(String telno){
		this.telno = telno;
	}

	public void setBusinessno(String businessno){
		this.businessno = businessno;
	}

	public void setPromisecode_fr(String promisecode_fr){
		this.promisecode_fr = promisecode_fr;
	}

	public void setPromisecode_to(String promisecode_to){
		this.promisecode_to = promisecode_to;
	}

	public void setPromiseprice_fr(String promiseprice_fr){
		this.promiseprice_fr = promiseprice_fr;
	}

	public void setPromiseprice_to(String promiseprice_to){
		this.promiseprice_to = promiseprice_to;
	}

	public void setPayprice_fr(String payprice_fr){
		this.payprice_fr = payprice_fr;
	}

	public void setPayprice_to(String payprice_to){
		this.payprice_to = payprice_to;
	}

	public void setFundtype(String fundtype){
		this.fundtype = fundtype;
	}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setPaymentcode_fr(String paymentcode_fr){
		this.paymentcode_fr = paymentcode_fr;
	}

	public void setPaymentcode_to(String paymentcode_to){
		this.paymentcode_to = paymentcode_to;
	}

	public void setBankaccountowner(String bankaccountowner){
		this.bankaccountowner = bankaccountowner;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMembertype(){
		return this.membertype;
	}

	public String getName(){
		return this.name;
	}

	public String getIsanonymous(){
		return this.isanonymous;
	}

	public String getIsforeigner(){
		return this.isforeigner;
	}

	public String getMembercode_to(){
		return this.membercode_to;
	}

	public String getMembercode_fr(){
		return this.membercode_fr;
	}

	public String getRegno1(){
		return this.regno1;
	}

	public String getRegno2(){
		return this.regno2;
	}

	public String getTelno(){
		return this.telno;
	}

	public String getBusinessno(){
		return this.businessno;
	}

	public String getPromisecode_fr(){
		return this.promisecode_fr;
	}

	public String getPromisecode_to(){
		return this.promisecode_to;
	}

	public String getPromiseprice_fr(){
		return this.promiseprice_fr;
	}

	public String getPromiseprice_to(){
		return this.promiseprice_to;
	}

	public String getPayprice_fr(){
		return this.payprice_fr;
	}

	public String getPayprice_to(){
		return this.payprice_to;
	}

	public String getFundtype(){
		return this.fundtype;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getPaymentcode_fr(){
		return this.paymentcode_fr;
	}

	public String getPaymentcode_to(){
		return this.paymentcode_to;
	}

	public String getBankaccountowner(){
		return this.bankaccountowner;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_2010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_2010_LDM dm = (TN_DNS_2010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.membertype);
		cstmt.setString(5, dm.name);
		cstmt.setString(6, dm.isanonymous);
		cstmt.setString(7, dm.isforeigner);
		cstmt.setString(8, dm.membercode_to);
		cstmt.setString(9, dm.membercode_fr);
		cstmt.setString(10, dm.regno1);
		cstmt.setString(11, dm.regno2);
		cstmt.setString(12, dm.telno);
		cstmt.setString(13, dm.businessno);
		cstmt.setString(14, dm.promisecode_fr);
		cstmt.setString(15, dm.promisecode_to);
		cstmt.setString(16, dm.promiseprice_fr);
		cstmt.setString(17, dm.promiseprice_to);
		cstmt.setString(18, dm.payprice_fr);
		cstmt.setString(19, dm.payprice_to);
		cstmt.setString(20, dm.fundtype);
		cstmt.setString(21, dm.paymethodcode);
		cstmt.setString(22, dm.paymentcode_fr);
		cstmt.setString(23, dm.paymentcode_to);
		cstmt.setString(24, dm.bankaccountowner);
		cstmt.setString(25, dm.memo);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_2010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("membertype = [" + getMembertype() + "]");
		System.out.println("name = [" + getName() + "]");
		System.out.println("isanonymous = [" + getIsanonymous() + "]");
		System.out.println("isforeigner = [" + getIsforeigner() + "]");
		System.out.println("membercode_to = [" + getMembercode_to() + "]");
		System.out.println("membercode_fr = [" + getMembercode_fr() + "]");
		System.out.println("regno1 = [" + getRegno1() + "]");
		System.out.println("regno2 = [" + getRegno2() + "]");
		System.out.println("telno = [" + getTelno() + "]");
		System.out.println("businessno = [" + getBusinessno() + "]");
		System.out.println("promisecode_fr = [" + getPromisecode_fr() + "]");
		System.out.println("promisecode_to = [" + getPromisecode_to() + "]");
		System.out.println("promiseprice_fr = [" + getPromiseprice_fr() + "]");
		System.out.println("promiseprice_to = [" + getPromiseprice_to() + "]");
		System.out.println("payprice_fr = [" + getPayprice_fr() + "]");
		System.out.println("payprice_to = [" + getPayprice_to() + "]");
		System.out.println("fundtype = [" + getFundtype() + "]");
		System.out.println("paymethodcode = [" + getPaymethodcode() + "]");
		System.out.println("paymentcode_fr = [" + getPaymentcode_fr() + "]");
		System.out.println("paymentcode_to = [" + getPaymentcode_to() + "]");
		System.out.println("bankaccountowner = [" + getBankaccountowner() + "]");
		System.out.println("memo = [" + getMemo() + "]");
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
String membertype = req.getParameter("membertype");
if( membertype == null){
	System.out.println(this.toString+" : membertype is null" );
}else{
	System.out.println(this.toString+" : membertype is "+membertype );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
String isanonymous = req.getParameter("isanonymous");
if( isanonymous == null){
	System.out.println(this.toString+" : isanonymous is null" );
}else{
	System.out.println(this.toString+" : isanonymous is "+isanonymous );
}
String isforeigner = req.getParameter("isforeigner");
if( isforeigner == null){
	System.out.println(this.toString+" : isforeigner is null" );
}else{
	System.out.println(this.toString+" : isforeigner is "+isforeigner );
}
String membercode_to = req.getParameter("membercode_to");
if( membercode_to == null){
	System.out.println(this.toString+" : membercode_to is null" );
}else{
	System.out.println(this.toString+" : membercode_to is "+membercode_to );
}
String membercode_fr = req.getParameter("membercode_fr");
if( membercode_fr == null){
	System.out.println(this.toString+" : membercode_fr is null" );
}else{
	System.out.println(this.toString+" : membercode_fr is "+membercode_fr );
}
String regno1 = req.getParameter("regno1");
if( regno1 == null){
	System.out.println(this.toString+" : regno1 is null" );
}else{
	System.out.println(this.toString+" : regno1 is "+regno1 );
}
String regno2 = req.getParameter("regno2");
if( regno2 == null){
	System.out.println(this.toString+" : regno2 is null" );
}else{
	System.out.println(this.toString+" : regno2 is "+regno2 );
}
String telno = req.getParameter("telno");
if( telno == null){
	System.out.println(this.toString+" : telno is null" );
}else{
	System.out.println(this.toString+" : telno is "+telno );
}
String businessno = req.getParameter("businessno");
if( businessno == null){
	System.out.println(this.toString+" : businessno is null" );
}else{
	System.out.println(this.toString+" : businessno is "+businessno );
}
String promisecode_fr = req.getParameter("promisecode_fr");
if( promisecode_fr == null){
	System.out.println(this.toString+" : promisecode_fr is null" );
}else{
	System.out.println(this.toString+" : promisecode_fr is "+promisecode_fr );
}
String promisecode_to = req.getParameter("promisecode_to");
if( promisecode_to == null){
	System.out.println(this.toString+" : promisecode_to is null" );
}else{
	System.out.println(this.toString+" : promisecode_to is "+promisecode_to );
}
String promiseprice_fr = req.getParameter("promiseprice_fr");
if( promiseprice_fr == null){
	System.out.println(this.toString+" : promiseprice_fr is null" );
}else{
	System.out.println(this.toString+" : promiseprice_fr is "+promiseprice_fr );
}
String promiseprice_to = req.getParameter("promiseprice_to");
if( promiseprice_to == null){
	System.out.println(this.toString+" : promiseprice_to is null" );
}else{
	System.out.println(this.toString+" : promiseprice_to is "+promiseprice_to );
}
String payprice_fr = req.getParameter("payprice_fr");
if( payprice_fr == null){
	System.out.println(this.toString+" : payprice_fr is null" );
}else{
	System.out.println(this.toString+" : payprice_fr is "+payprice_fr );
}
String payprice_to = req.getParameter("payprice_to");
if( payprice_to == null){
	System.out.println(this.toString+" : payprice_to is null" );
}else{
	System.out.println(this.toString+" : payprice_to is "+payprice_to );
}
String fundtype = req.getParameter("fundtype");
if( fundtype == null){
	System.out.println(this.toString+" : fundtype is null" );
}else{
	System.out.println(this.toString+" : fundtype is "+fundtype );
}
String paymethodcode = req.getParameter("paymethodcode");
if( paymethodcode == null){
	System.out.println(this.toString+" : paymethodcode is null" );
}else{
	System.out.println(this.toString+" : paymethodcode is "+paymethodcode );
}
String paymentcode_fr = req.getParameter("paymentcode_fr");
if( paymentcode_fr == null){
	System.out.println(this.toString+" : paymentcode_fr is null" );
}else{
	System.out.println(this.toString+" : paymentcode_fr is "+paymentcode_fr );
}
String paymentcode_to = req.getParameter("paymentcode_to");
if( paymentcode_to == null){
	System.out.println(this.toString+" : paymentcode_to is null" );
}else{
	System.out.println(this.toString+" : paymentcode_to is "+paymentcode_to );
}
String bankaccountowner = req.getParameter("bankaccountowner");
if( bankaccountowner == null){
	System.out.println(this.toString+" : bankaccountowner is null" );
}else{
	System.out.println(this.toString+" : bankaccountowner is "+bankaccountowner );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String membertype = Util.checkString(req.getParameter("membertype"));
String name = Util.checkString(req.getParameter("name"));
String isanonymous = Util.checkString(req.getParameter("isanonymous"));
String isforeigner = Util.checkString(req.getParameter("isforeigner"));
String membercode_to = Util.checkString(req.getParameter("membercode_to"));
String membercode_fr = Util.checkString(req.getParameter("membercode_fr"));
String regno1 = Util.checkString(req.getParameter("regno1"));
String regno2 = Util.checkString(req.getParameter("regno2"));
String telno = Util.checkString(req.getParameter("telno"));
String businessno = Util.checkString(req.getParameter("businessno"));
String promisecode_fr = Util.checkString(req.getParameter("promisecode_fr"));
String promisecode_to = Util.checkString(req.getParameter("promisecode_to"));
String promiseprice_fr = Util.checkString(req.getParameter("promiseprice_fr"));
String promiseprice_to = Util.checkString(req.getParameter("promiseprice_to"));
String payprice_fr = Util.checkString(req.getParameter("payprice_fr"));
String payprice_to = Util.checkString(req.getParameter("payprice_to"));
String fundtype = Util.checkString(req.getParameter("fundtype"));
String paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
String paymentcode_fr = Util.checkString(req.getParameter("paymentcode_fr"));
String paymentcode_to = Util.checkString(req.getParameter("paymentcode_to"));
String bankaccountowner = Util.checkString(req.getParameter("bankaccountowner"));
String memo = Util.checkString(req.getParameter("memo"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String membertype = Util.Uni2Ksc(Util.checkString(req.getParameter("membertype")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
String isanonymous = Util.Uni2Ksc(Util.checkString(req.getParameter("isanonymous")));
String isforeigner = Util.Uni2Ksc(Util.checkString(req.getParameter("isforeigner")));
String membercode_to = Util.Uni2Ksc(Util.checkString(req.getParameter("membercode_to")));
String membercode_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("membercode_fr")));
String regno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("regno1")));
String regno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("regno2")));
String telno = Util.Uni2Ksc(Util.checkString(req.getParameter("telno")));
String businessno = Util.Uni2Ksc(Util.checkString(req.getParameter("businessno")));
String promisecode_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("promisecode_fr")));
String promisecode_to = Util.Uni2Ksc(Util.checkString(req.getParameter("promisecode_to")));
String promiseprice_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseprice_fr")));
String promiseprice_to = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseprice_to")));
String payprice_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("payprice_fr")));
String payprice_to = Util.Uni2Ksc(Util.checkString(req.getParameter("payprice_to")));
String fundtype = Util.Uni2Ksc(Util.checkString(req.getParameter("fundtype")));
String paymethodcode = Util.Uni2Ksc(Util.checkString(req.getParameter("paymethodcode")));
String paymentcode_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("paymentcode_fr")));
String paymentcode_to = Util.Uni2Ksc(Util.checkString(req.getParameter("paymentcode_to")));
String bankaccountowner = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccountowner")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMembertype(membertype);
dm.setName(name);
dm.setIsanonymous(isanonymous);
dm.setIsforeigner(isforeigner);
dm.setMembercode_to(membercode_to);
dm.setMembercode_fr(membercode_fr);
dm.setRegno1(regno1);
dm.setRegno2(regno2);
dm.setTelno(telno);
dm.setBusinessno(businessno);
dm.setPromisecode_fr(promisecode_fr);
dm.setPromisecode_to(promisecode_to);
dm.setPromiseprice_fr(promiseprice_fr);
dm.setPromiseprice_to(promiseprice_to);
dm.setPayprice_fr(payprice_fr);
dm.setPayprice_to(payprice_to);
dm.setFundtype(fundtype);
dm.setPaymethodcode(paymethodcode);
dm.setPaymentcode_fr(paymentcode_fr);
dm.setPaymentcode_to(paymentcode_to);
dm.setBankaccountowner(bankaccountowner);
dm.setMemo(memo);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 11 15:15:06 KST 2017 */