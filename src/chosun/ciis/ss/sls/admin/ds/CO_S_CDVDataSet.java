/***************************************************************************************************
 * 파일명   : SP_CO_S_CDV
 * 기능     : 관리자-공통코드
 * 작성일자 : 2008/04/10
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
**  SP_CO_S_CDV
**/

public class CO_S_CDVDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String ciuse_yn;
	public String cimgtcd1;
	public String cimgtcd2;
	public String cimgtcd3;
	public String cimgtcd4;
	public String cimgtcd5;
	public String cimgtcd6;
	public String cimgtcd7;
	public String ciremarks;
	public String ciymgbnm;
	public String cicdgbnm;

	public CO_S_CDVDataSet(){}
	public CO_S_CDVDataSet(String errcode, String errmsg, String ciymgbcd, String cicdgb, String cicodeval, String cicdnm, String cicdynm, String ciuse_yn, String cimgtcd1, String cimgtcd2, String cimgtcd3, String cimgtcd4, String cimgtcd5, String cimgtcd6, String cimgtcd7, String ciremarks, String ciymgbnm, String cicdgbnm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.ciymgbcd = ciymgbcd;
		this.cicdgb = cicdgb;
		this.cicodeval = cicodeval;
		this.cicdnm = cicdnm;
		this.cicdynm = cicdynm;
		this.ciuse_yn = ciuse_yn;
		this.cimgtcd1 = cimgtcd1;
		this.cimgtcd2 = cimgtcd2;
		this.cimgtcd3 = cimgtcd3;
		this.cimgtcd4 = cimgtcd4;
		this.cimgtcd5 = cimgtcd5;
		this.cimgtcd6 = cimgtcd6;
		this.cimgtcd7 = cimgtcd7;
		this.ciremarks = ciremarks;
		this.ciymgbnm = ciymgbnm;
		this.cicdgbnm = cicdgbnm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public void setCiuse_yn(String ciuse_yn){
		this.ciuse_yn = ciuse_yn;
	}

	public void setCimgtcd1(String cimgtcd1){
		this.cimgtcd1 = cimgtcd1;
	}

	public void setCimgtcd2(String cimgtcd2){
		this.cimgtcd2 = cimgtcd2;
	}

	public void setCimgtcd3(String cimgtcd3){
		this.cimgtcd3 = cimgtcd3;
	}

	public void setCimgtcd4(String cimgtcd4){
		this.cimgtcd4 = cimgtcd4;
	}

	public void setCimgtcd5(String cimgtcd5){
		this.cimgtcd5 = cimgtcd5;
	}

	public void setCimgtcd6(String cimgtcd6){
		this.cimgtcd6 = cimgtcd6;
	}

	public void setCimgtcd7(String cimgtcd7){
		this.cimgtcd7 = cimgtcd7;
	}

	public void setCiremarks(String ciremarks){
		this.ciremarks = ciremarks;
	}

	public void setCiymgbnm(String ciymgbnm){
		this.ciymgbnm = ciymgbnm;
	}

	public void setCicdgbnm(String cicdgbnm){
		this.cicdgbnm = cicdgbnm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}

	public String getCiuse_yn(){
		return this.ciuse_yn;
	}

	public String getCimgtcd1(){
		return this.cimgtcd1;
	}

	public String getCimgtcd2(){
		return this.cimgtcd2;
	}

	public String getCimgtcd3(){
		return this.cimgtcd3;
	}

	public String getCimgtcd4(){
		return this.cimgtcd4;
	}

	public String getCimgtcd5(){
		return this.cimgtcd5;
	}

	public String getCimgtcd6(){
		return this.cimgtcd6;
	}

	public String getCimgtcd7(){
		return this.cimgtcd7;
	}

	public String getCiremarks(){
		return this.ciremarks;
	}

	public String getCiymgbnm(){
		return this.ciymgbnm;
	}

	public String getCicdgbnm(){
		return this.cicdgbnm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.ciymgbcd = Util.checkString(cstmt.getString(6));
		this.cicdgb = Util.checkString(cstmt.getString(7));
		this.cicodeval = Util.checkString(cstmt.getString(8));
		this.cicdnm = Util.checkString(cstmt.getString(9));
		this.cicdynm = Util.checkString(cstmt.getString(10));
		this.ciuse_yn = Util.checkString(cstmt.getString(11));
		this.cimgtcd1 = Util.checkString(cstmt.getString(12));
		this.cimgtcd2 = Util.checkString(cstmt.getString(13));
		this.cimgtcd3 = Util.checkString(cstmt.getString(14));
		this.cimgtcd4 = Util.checkString(cstmt.getString(15));
		this.cimgtcd5 = Util.checkString(cstmt.getString(16));
		this.cimgtcd6 = Util.checkString(cstmt.getString(17));
		this.cimgtcd7 = Util.checkString(cstmt.getString(18));
		this.ciremarks = Util.checkString(cstmt.getString(19));
		this.ciymgbnm = Util.checkString(cstmt.getString(20));
		this.cicdgbnm = Util.checkString(cstmt.getString(21));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_S_CDVDataSet ds = (CO_S_CDVDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCiymgbcd()%>
<%= ds.getCicdgb()%>
<%= ds.getCicodeval()%>
<%= ds.getCicdnm()%>
<%= ds.getCicdynm()%>
<%= ds.getCiuse_yn()%>
<%= ds.getCimgtcd1()%>
<%= ds.getCimgtcd2()%>
<%= ds.getCimgtcd3()%>
<%= ds.getCimgtcd4()%>
<%= ds.getCimgtcd5()%>
<%= ds.getCimgtcd6()%>
<%= ds.getCimgtcd7()%>
<%= ds.getCiremarks()%>
<%= ds.getCiymgbnm()%>
<%= ds.getCicdgbnm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 10 18:01:35 KST 2008 */