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


public class TN_DNS_3010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fundtype;
	public String issuedate_fr;
	public String issuedate_to;
	public String name;
	public String receiptcode_fr;
	public String receiptcode_to;
	public String isdeleted;

	public TN_DNS_3010_LDM(){}
	public TN_DNS_3010_LDM(String cmpy_cd, String fundtype, String issuedate_fr, String issuedate_to, String name, String receiptcode_fr,String receiptcode_to, String isdeleted ){
		this.cmpy_cd = cmpy_cd;
		this.fundtype = fundtype;
		this.issuedate_fr = issuedate_fr;
		this.issuedate_to = issuedate_to;
		this.name = name;
		this.receiptcode_fr = receiptcode_fr;
		this.receiptcode_to = receiptcode_to;
		this.isdeleted = isdeleted;
	}
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFundtype(String fundtype){
		this.fundtype = fundtype;
	}

	public void setIssuedate_fr(String issuedate_fr){
		this.issuedate_fr = issuedate_fr;
	}

	public void setIssuedate_to(String issuedate_to){
		this.issuedate_to = issuedate_to;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setReceiptcode_fr(String receiptcode_fr){
		this.receiptcode_fr = receiptcode_fr;
	}

	public void setReceiptcode_to(String receiptcode_to){
		this.receiptcode_to = receiptcode_to;
	}

	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFundtype(){
		return this.fundtype;
	}

	public String getIssuedate_fr(){
		return this.issuedate_fr;
	}

	public String getIssuedate_to(){
		return this.issuedate_to;
	}

	public String getName(){
		return this.name;
	}

	public String getReceiptcode_fr(){
		return this.receiptcode_fr;
	}
	
	public String getReceiptcode_to(){
		return this.receiptcode_to;
	}

	public String getIsdeleted() {
		return isdeleted;
	}
	
	
	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_3010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_3010_LDM dm = (TN_DNS_3010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fundtype);
		cstmt.setString(5, dm.issuedate_fr);
		cstmt.setString(6, dm.issuedate_to);
		cstmt.setString(7, dm.name);
		cstmt.setString(8, dm.receiptcode_fr);
		cstmt.setString(9, dm.receiptcode_to);
		cstmt.setString(10, dm.isdeleted);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_3010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fundtype = [" + getFundtype() + "]");
		System.out.println("issuedate_fr = [" + getIssuedate_fr() + "]");
		System.out.println("issuedate_to = [" + getIssuedate_to() + "]");
		System.out.println("name = [" + getName() + "]");
		System.out.println("receiptcode_fr = [" + getReceiptcode_fr() + "]");
		System.out.println("receiptcode_to = [" + getReceiptcode_to() + "]");
		System.out.println("isdeleted = [" + getIsdeleted() + "]");
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
String fundtype = req.getParameter("fundtype");
if( fundtype == null){
	System.out.println(this.toString+" : fundtype is null" );
}else{
	System.out.println(this.toString+" : fundtype is "+fundtype );
}
String issuedate_fr = req.getParameter("issuedate_fr");
if( issuedate_fr == null){
	System.out.println(this.toString+" : issuedate_fr is null" );
}else{
	System.out.println(this.toString+" : issuedate_fr is "+issuedate_fr );
}
String issuedate_to = req.getParameter("issuedate_to");
if( issuedate_to == null){
	System.out.println(this.toString+" : issuedate_to is null" );
}else{
	System.out.println(this.toString+" : issuedate_to is "+issuedate_to );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
String receiptcode = req.getParameter("receiptcode");
if( receiptcode == null){
	System.out.println(this.toString+" : receiptcode is null" );
}else{
	System.out.println(this.toString+" : receiptcode is "+receiptcode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fundtype = Util.checkString(req.getParameter("fundtype"));
String issuedate_fr = Util.checkString(req.getParameter("issuedate_fr"));
String issuedate_to = Util.checkString(req.getParameter("issuedate_to"));
String name = Util.checkString(req.getParameter("name"));
String receiptcode = Util.checkString(req.getParameter("receiptcode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fundtype = Util.Uni2Ksc(Util.checkString(req.getParameter("fundtype")));
String issuedate_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("issuedate_fr")));
String issuedate_to = Util.Uni2Ksc(Util.checkString(req.getParameter("issuedate_to")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
String receiptcode = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFundtype(fundtype);
dm.setIssuedate_fr(issuedate_fr);
dm.setIssuedate_to(issuedate_to);
dm.setName(name);
dm.setReceiptcode(receiptcode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 21 19:16:21 KST 2016 */