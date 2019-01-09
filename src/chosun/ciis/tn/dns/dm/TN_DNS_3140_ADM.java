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


public class TN_DNS_3140_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String deptidx;
	public String startpaydate;
	public String endpaydate;
	public String issuedate;
	public String issuedeptidx;
	public String includeissued;
	public String receiptcode;
	public String price;
	public String memberidx;
	public String receiptidx;
	public String incmg_pers;
	
	public TN_DNS_3140_ADM(){}
	public TN_DNS_3140_ADM(String cmpy_cd, String accflag, String deptidx, String startpaydate, String endpaydate, String issuedate, String issuedeptidx, String includeissued, String receiptcode, String price, String memberidx, String receiptidx, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.deptidx = deptidx;
		this.startpaydate = startpaydate;
		this.endpaydate = endpaydate;
		this.issuedate = issuedate;
		this.issuedeptidx = issuedeptidx;
		this.includeissued = includeissued;
		this.receiptcode = receiptcode;
		this.price = price;
		this.memberidx = memberidx;
		this.receiptidx = receiptidx;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setStartpaydate(String startpaydate){
		this.startpaydate = startpaydate;
	}

	public void setEndpaydate(String endpaydate){
		this.endpaydate = endpaydate;
	}

	public void setIssuedate(String issuedate){
		this.issuedate = issuedate;
	}

	public void setIssuedeptidx(String issuedeptidx){
		this.issuedeptidx = issuedeptidx;
	}

	public void setIncludeissued(String includeissued){
		this.includeissued = includeissued;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setReceiptidx(String receiptidx) {
		this.receiptidx = receiptidx;
	}
	
	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getStartpaydate(){
		return this.startpaydate;
	}

	public String getEndpaydate(){
		return this.endpaydate;
	}

	public String getIssuedate(){
		return this.issuedate;
	}

	public String getIssuedeptidx(){
		return this.issuedeptidx;
	}

	public String getIncludeissued(){
		return this.includeissued;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}

	public String getPrice(){
		return this.price;
	}

	public String getMemberidx(){
		return this.memberidx;
	}
	
	public String getReceiptidx() {
		return receiptidx;
	}
	
	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_3140_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_3140_ADM dm = (TN_DNS_3140_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.deptidx);
		cstmt.setString(6, dm.startpaydate);
		cstmt.setString(7, dm.endpaydate);
		cstmt.setString(8, dm.issuedate);
		cstmt.setString(9, dm.issuedeptidx);
		cstmt.setString(10, dm.includeissued);
		cstmt.setString(11, dm.receiptcode);
		cstmt.setString(12, dm.price);
		cstmt.setString(13, dm.memberidx);
		cstmt.setString(14, dm.receiptidx);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_3140_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("startpaydate = [" + getStartpaydate() + "]");
		System.out.println("endpaydate = [" + getEndpaydate() + "]");
		System.out.println("issuedate = [" + getIssuedate() + "]");
		System.out.println("issuedeptidx = [" + getIssuedeptidx() + "]");
		System.out.println("includeissued = [" + getIncludeissued() + "]");
		System.out.println("check = [" + getReceiptcode() + "]");
		System.out.println("price = [" + getPrice() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("receiptidx = [" + getReceiptidx() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
String startpaydate = req.getParameter("startpaydate");
if( startpaydate == null){
	System.out.println(this.toString+" : startpaydate is null" );
}else{
	System.out.println(this.toString+" : startpaydate is "+startpaydate );
}
String endpaydate = req.getParameter("endpaydate");
if( endpaydate == null){
	System.out.println(this.toString+" : endpaydate is null" );
}else{
	System.out.println(this.toString+" : endpaydate is "+endpaydate );
}
String issuedate = req.getParameter("issuedate");
if( issuedate == null){
	System.out.println(this.toString+" : issuedate is null" );
}else{
	System.out.println(this.toString+" : issuedate is "+issuedate );
}
String issuedeptidx = req.getParameter("issuedeptidx");
if( issuedeptidx == null){
	System.out.println(this.toString+" : issuedeptidx is null" );
}else{
	System.out.println(this.toString+" : issuedeptidx is "+issuedeptidx );
}
String includeissued = req.getParameter("includeissued");
if( includeissued == null){
	System.out.println(this.toString+" : includeissued is null" );
}else{
	System.out.println(this.toString+" : includeissued is "+includeissued );
}
String check = req.getParameter("check");
if( check == null){
	System.out.println(this.toString+" : check is null" );
}else{
	System.out.println(this.toString+" : check is "+check );
}
String price = req.getParameter("price");
if( price == null){
	System.out.println(this.toString+" : price is null" );
}else{
	System.out.println(this.toString+" : price is "+price );
}
String memberidx = req.getParameter("memberidx");
if( memberidx == null){
	System.out.println(this.toString+" : memberidx is null" );
}else{
	System.out.println(this.toString+" : memberidx is "+memberidx );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String accflag = Util.checkString(req.getParameter("accflag"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
String startpaydate = Util.checkString(req.getParameter("startpaydate"));
String endpaydate = Util.checkString(req.getParameter("endpaydate"));
String issuedate = Util.checkString(req.getParameter("issuedate"));
String issuedeptidx = Util.checkString(req.getParameter("issuedeptidx"));
String includeissued = Util.checkString(req.getParameter("includeissued"));
String check = Util.checkString(req.getParameter("check"));
String price = Util.checkString(req.getParameter("price"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
String startpaydate = Util.Uni2Ksc(Util.checkString(req.getParameter("startpaydate")));
String endpaydate = Util.Uni2Ksc(Util.checkString(req.getParameter("endpaydate")));
String issuedate = Util.Uni2Ksc(Util.checkString(req.getParameter("issuedate")));
String issuedeptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("issuedeptidx")));
String includeissued = Util.Uni2Ksc(Util.checkString(req.getParameter("includeissued")));
String check = Util.Uni2Ksc(Util.checkString(req.getParameter("check")));
String price = Util.Uni2Ksc(Util.checkString(req.getParameter("price")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setDeptidx(deptidx);
dm.setStartpaydate(startpaydate);
dm.setEndpaydate(endpaydate);
dm.setIssuedate(issuedate);
dm.setIssuedeptidx(issuedeptidx);
dm.setIncludeissued(includeissued);
dm.setCheck(check);
dm.setPrice(price);
dm.setMemberidx(memberidx);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 17 19:51:34 KST 2016 */