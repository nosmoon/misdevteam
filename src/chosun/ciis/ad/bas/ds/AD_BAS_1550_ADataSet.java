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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_BAS_1550_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rept_no;
	public String add_file_no1;
	public String add_file_no2;
	public String add_file_no3;
	public String add_file_no4;
	public String add_file_no5;

	public AD_BAS_1550_ADataSet(){}
	public AD_BAS_1550_ADataSet(String errcode, String errmsg, String rept_no, String add_file_no1, String add_file_no2, String add_file_no3, String add_file_no4, String add_file_no5){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rept_no = rept_no;
		this.add_file_no1 = add_file_no1;
		this.add_file_no2 = add_file_no2;
		this.add_file_no3 = add_file_no3;
		this.add_file_no4 = add_file_no4;
		this.add_file_no5 = add_file_no5;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRept_no(){
		return this.rept_no;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.rept_no = Util.checkString(cstmt.getString(38));
		this.add_file_no1 = Util.checkString(cstmt.getString(39));
		this.add_file_no2 = Util.checkString(cstmt.getString(40));
		this.add_file_no3 = Util.checkString(cstmt.getString(41));
		this.add_file_no4 = Util.checkString(cstmt.getString(42));
		this.add_file_no5 = Util.checkString(cstmt.getString(43));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1550_ADataSet ds = (AD_BAS_1550_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRept_no()%>
<%= ds.getAdd_file_no1()%>
<%= ds.getAdd_file_no2()%>
<%= ds.getAdd_file_no3()%>
<%= ds.getAdd_file_no4()%>
<%= ds.getAdd_file_no5()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 09:27:32 KST 2009 */