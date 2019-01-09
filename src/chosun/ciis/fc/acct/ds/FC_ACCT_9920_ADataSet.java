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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_9920_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String seq;
	public String add_file_no1;
	public String add_file_no2;
	public String add_file_no3;
	public String add_file_no4;
	public String add_file_no5;
	public String add_file_no6;
	public String add_file_no7;
	public String add_file_no8;
	public String add_file_no9;
	public String add_file_no10;

	public FC_ACCT_9920_ADataSet(){}
	public FC_ACCT_9920_ADataSet(String errcode, String errmsg, String seq, String add_file_no1, String add_file_no2, String add_file_no3, String add_file_no4, String add_file_no5, String add_file_no6, String add_file_no7, String add_file_no8, String add_file_no9, String add_file_no10){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.add_file_no1 = add_file_no1;
		this.add_file_no2 = add_file_no2;
		this.add_file_no3 = add_file_no3;
		this.add_file_no4 = add_file_no4;
		this.add_file_no5 = add_file_no5;
		this.add_file_no6 = add_file_no6;
		this.add_file_no7 = add_file_no7;
		this.add_file_no8 = add_file_no8;
		this.add_file_no9 = add_file_no9;
		this.add_file_no10 = add_file_no10;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAdd_file_no1(String add_file_no1){
		this.add_file_no1 = add_file_no1;
	}

	public void setAdd_file_no2(String add_file_no2){
		this.add_file_no2 = add_file_no2;
	}

	public void setAdd_file_no3(String add_file_no3){
		this.add_file_no3 = add_file_no3;
	}

	public void setAdd_file_no4(String add_file_no4){
		this.add_file_no4 = add_file_no4;
	}

	public void setAdd_file_no5(String add_file_no5){
		this.add_file_no5 = add_file_no5;
	}

	public void setAdd_file_no6(String add_file_no6){
		this.add_file_no6 = add_file_no6;
	}

	public void setAdd_file_no7(String add_file_no7){
		this.add_file_no7 = add_file_no7;
	}

	public void setAdd_file_no8(String add_file_no8){
		this.add_file_no8 = add_file_no8;
	}

	public void setAdd_file_no9(String add_file_no9){
		this.add_file_no9 = add_file_no9;
	}

	public void setAdd_file_no10(String add_file_no10){
		this.add_file_no10 = add_file_no10;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAdd_file_no1(){
		return this.add_file_no1;
	}

	public String getAdd_file_no2(){
		return this.add_file_no2;
	}

	public String getAdd_file_no3(){
		return this.add_file_no3;
	}

	public String getAdd_file_no4(){
		return this.add_file_no4;
	}

	public String getAdd_file_no5(){
		return this.add_file_no5;
	}

	public String getAdd_file_no6(){
		return this.add_file_no6;
	}

	public String getAdd_file_no7(){
		return this.add_file_no7;
	}

	public String getAdd_file_no8(){
		return this.add_file_no8;
	}

	public String getAdd_file_no9(){
		return this.add_file_no9;
	}

	public String getAdd_file_no10(){
		return this.add_file_no10;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.seq = Util.checkString(cstmt.getString(58));
		this.add_file_no1 = Util.checkString(cstmt.getString(59));
		this.add_file_no2 = Util.checkString(cstmt.getString(60));
		this.add_file_no3 = Util.checkString(cstmt.getString(61));
		this.add_file_no4 = Util.checkString(cstmt.getString(62));
		this.add_file_no5 = Util.checkString(cstmt.getString(63));
		this.add_file_no6 = Util.checkString(cstmt.getString(64));
		this.add_file_no7 = Util.checkString(cstmt.getString(65));
		this.add_file_no8 = Util.checkString(cstmt.getString(66));
		this.add_file_no9 = Util.checkString(cstmt.getString(67));
		this.add_file_no10 = Util.checkString(cstmt.getString(68));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_9920_ADataSet ds = (FC_ACCT_9920_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getAdd_file_no1()%>
<%= ds.getAdd_file_no2()%>
<%= ds.getAdd_file_no3()%>
<%= ds.getAdd_file_no4()%>
<%= ds.getAdd_file_no5()%>
<%= ds.getAdd_file_no6()%>
<%= ds.getAdd_file_no7()%>
<%= ds.getAdd_file_no8()%>
<%= ds.getAdd_file_no9()%>
<%= ds.getAdd_file_no10()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 14 15:32:22 KST 2014 */