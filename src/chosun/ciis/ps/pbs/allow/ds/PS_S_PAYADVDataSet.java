/***************************************************************************************************
* 파일명 :PS_S_PAYADV.java
* 기능 : 가지급금 상세 조회
* 작성일자 : 2004-04-10
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 출판국 - 가지급금 상세 조회
 *
 */

public class PS_S_PAYADVDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String boemp_no;
	public String flnm;
	public String yymm;
	public String tel1;
	public String tel2;
	public String tel3;
	public long tel_charge;
	public long resp_subs;
	public long subs_susp;
	public long pay_adv;
	public long mutu_aid;
	public long loan;
	public long loan_interest;
	public long subs_sum;
	public String remk;
	public long etc1;
	public long etc2;
	public long etc3;
	public long etc4;

	public PS_S_PAYADVDataSet(){}
	public PS_S_PAYADVDataSet(String errcode, String errmsg, String boemp_no, String flnm, String yymm, String tel1, String tel2, String tel3, long tel_charge, long resp_subs, long subs_susp, long pay_adv, long mutu_aid, long loan, long loan_interest, long subs_sum, String remk, long etc1, long etc2, long etc3, long etc4){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.boemp_no = boemp_no;
		this.flnm = flnm;
		this.yymm = yymm;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.tel3 = tel3;
		this.tel_charge = tel_charge;
		this.resp_subs = resp_subs;
		this.subs_susp = subs_susp;
		this.pay_adv = pay_adv;
		this.mutu_aid = mutu_aid;
		this.loan = loan;
		this.loan_interest = loan_interest;
		this.subs_sum = subs_sum;
		this.remk = remk;
		this.etc1 = etc1;
		this.etc2 = etc2;
		this.etc3 = etc3;
		this.etc4 = etc4;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setTel1(String tel1){
		this.tel1 = tel1;
	}

	public void setTel2(String tel2){
		this.tel2 = tel2;
	}

	public void setTel3(String tel3){
		this.tel3 = tel3;
	}

	public void setTel_charge(long tel_charge){
		this.tel_charge = tel_charge;
	}

	public void setResp_subs(long resp_subs){
		this.resp_subs = resp_subs;
	}

	public void setSubs_susp(long subs_susp){
		this.subs_susp = subs_susp;
	}

	public void setPay_adv(long pay_adv){
		this.pay_adv = pay_adv;
	}

	public void setMutu_aid(long mutu_aid){
		this.mutu_aid = mutu_aid;
	}

	public void setLoan(long loan){
		this.loan = loan;
	}

	public void setLoan_interest(long loan_interest){
		this.loan_interest = loan_interest;
	}

	public void setSubs_sum(long subs_sum){
		this.subs_sum = subs_sum;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEtc1(long etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(long etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(long etc3){
		this.etc3 = etc3;
	}

	public void setEtc4(long etc4){
		this.etc4 = etc4;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getTel1(){
		return this.tel1;
	}

	public String getTel2(){
		return this.tel2;
	}

	public String getTel3(){
		return this.tel3;
	}

	public long getTel_charge(){
		return this.tel_charge;
	}

	public long getResp_subs(){
		return this.resp_subs;
	}

	public long getSubs_susp(){
		return this.subs_susp;
	}

	public long getPay_adv(){
		return this.pay_adv;
	}

	public long getMutu_aid(){
		return this.mutu_aid;
	}

	public long getLoan(){
		return this.loan;
	}

	public long getLoan_interest(){
		return this.loan_interest;
	}

	public long getSubs_sum(){
		return this.subs_sum;
	}

	public String getRemk(){
		return this.remk;
	}

	public long getEtc1(){
		return this.etc1;
	}

	public long getEtc2(){
		return this.etc2;
	}

	public long getEtc3(){
		return this.etc3;
	}

	public long getEtc4(){
		return this.etc4;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.boemp_no = Util.checkString(cstmt.getString(7));
		this.flnm = Util.checkString(cstmt.getString(8));
		this.yymm = Util.checkString(cstmt.getString(9));
		this.tel1 = Util.checkString(cstmt.getString(10));
		this.tel2 = Util.checkString(cstmt.getString(11));
		this.tel3 = Util.checkString(cstmt.getString(12));
		this.tel_charge = cstmt.getLong(13);
		this.resp_subs = cstmt.getLong(14);
		this.subs_susp = cstmt.getLong(15);
		this.pay_adv = cstmt.getLong(16);
		this.mutu_aid = cstmt.getLong(17);
		this.loan = cstmt.getLong(18);
		this.loan_interest = cstmt.getLong(19);
		this.subs_sum = cstmt.getLong(20);
		this.remk = Util.checkString(cstmt.getString(21));
		this.etc1 = cstmt.getLong(22);
		this.etc2 = cstmt.getLong(23);
		this.etc3 = cstmt.getLong(24);
		this.etc4 = cstmt.getLong(25);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_PAYADVDataSet ds = (PS_S_PAYADVDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBoemp_no()%>
<%= ds.getFlnm()%>
<%= ds.getYymm()%>
<%= ds.getTel1()%>
<%= ds.getTel2()%>
<%= ds.getTel3()%>
<%= ds.getTel_charge()%>
<%= ds.getResp_subs()%>
<%= ds.getSubs_susp()%>
<%= ds.getPay_adv()%>
<%= ds.getMutu_aid()%>
<%= ds.getLoan()%>
<%= ds.getLoan_interest()%>
<%= ds.getSubs_sum()%>
<%= ds.getRemk()%>
<%= ds.getEtc1()%>
<%= ds.getEtc2()%>
<%= ds.getEtc3()%>
<%= ds.getEtc4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jan 13 12:02:02 KST 2007 */