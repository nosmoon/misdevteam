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


public class FC_ACCT_2082_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String dlco_abrv_nm;
	public String dlco_no;
	public String dlco_nm;
	public String presi_nm;
	public String bizcond;
	public String item;
	public String zip_1;
	public String zip_2;
	public String jujuso1;
	public String jujuso2;
	public String jujuso3;
	public String jujuso4;

	public FC_ACCT_2082_SDataSet(){}
	public FC_ACCT_2082_SDataSet(String errcode, String errmsg, String dlco_abrv_nm, String dlco_no, String dlco_nm, String presi_nm, String bizcond, String item, String zip_1, String zip_2, String jujuso1, String jujuso2, String jujuso3, String jujuso4){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.presi_nm = presi_nm;
		this.bizcond = bizcond;
		this.item = item;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.jujuso1 = jujuso1;
		this.jujuso2 = jujuso2;
		this.jujuso3 = jujuso3;
		this.jujuso4 = jujuso4;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setJujuso1(String jujuso1){
		this.jujuso1 = jujuso1;
	}

	public void setJujuso2(String jujuso2){
		this.jujuso2 = jujuso2;
	}

	public void setJujuso3(String jujuso3){
		this.jujuso3 = jujuso3;
	}

	public void setJujuso4(String jujuso4){
		this.jujuso4 = jujuso4;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getJujuso1(){
		return this.jujuso1;
	}

	public String getJujuso2(){
		return this.jujuso2;
	}

	public String getJujuso3(){
		return this.jujuso3;
	}

	public String getJujuso4(){
		return this.jujuso4;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.dlco_abrv_nm = Util.checkString(cstmt.getString(3));
		this.dlco_no = Util.checkString(cstmt.getString(4));
		this.dlco_nm = Util.checkString(cstmt.getString(5));
		this.presi_nm = Util.checkString(cstmt.getString(6));
		this.bizcond = Util.checkString(cstmt.getString(7));
		this.item = Util.checkString(cstmt.getString(8));
		this.zip_1 = Util.checkString(cstmt.getString(9));
		this.zip_2 = Util.checkString(cstmt.getString(10));
		this.jujuso1 = Util.checkString(cstmt.getString(11));
		this.jujuso2 = Util.checkString(cstmt.getString(12));
		this.jujuso3 = Util.checkString(cstmt.getString(13));
		this.jujuso4 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2082_SDataSet ds = (FC_ACCT_2082_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_abrv_nm()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getPresi_nm()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getZip_1()%>
<%= ds.getZip_2()%>
<%= ds.getJujuso1()%>
<%= ds.getJujuso2()%>
<%= ds.getJujuso3()%>
<%= ds.getJujuso4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 10:45:41 KST 2009 */