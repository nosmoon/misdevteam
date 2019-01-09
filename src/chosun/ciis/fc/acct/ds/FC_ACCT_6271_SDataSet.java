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


public class FC_ACCT_6271_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String erplace_cd;
	public long data_cnt;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public long v_secn_21_010;
	public long v_secn_21_020;
	public long v_secn_21_030;
	public long v_secn_21_040;
	public long v_secn_21_050;
	public long v_secn_22_010;
	public long v_secn_23_010;
	public long v_secn_23_020;
	public long v_secn_24_010;
	public long v_secn_24_020;
	public long v_secn_24_030;
	public long v_secn_24_040;
	public long v_secn_24_050;
	public long v_secn_24_060;
	public long v_secn_24_070;
	public long v_secn_24_080;
	public long v_secn_tot_amt;
	public long j_secn_105_1_1;
	public long j_secn_105_1_3;
	public long j_secn_105_1_32;
	public long j_secn_105_1_4;
	public long j_secn_105_1_5;
	public long j_secn_107;
	public long j_secn_121_13;
	public long j_secn_tot_amt;
	public long tot_amt;

	public FC_ACCT_6271_SDataSet(){}
	public FC_ACCT_6271_SDataSet(String errcode, String errmsg, String erplace_cd, long data_cnt, String vat_fr_yymm, String vat_to_yymm, long v_secn_21_010, long v_secn_21_020, long v_secn_21_030, long v_secn_21_040, long v_secn_21_050, long v_secn_22_010, long v_secn_23_010, long v_secn_23_020, long v_secn_24_010, long v_secn_24_020, long v_secn_24_030, long v_secn_24_040, long v_secn_24_050, long v_secn_24_060, long v_secn_24_070, long v_secn_24_080, long v_secn_tot_amt, long j_secn_105_1_1, long j_secn_105_1_3, long j_secn_105_1_32, long j_secn_105_1_4, long j_secn_105_1_5, long j_secn_107, long j_secn_121_13, long j_secn_tot_amt, long tot_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.erplace_cd = erplace_cd;
		this.data_cnt = data_cnt;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.v_secn_21_010 = v_secn_21_010;
		this.v_secn_21_020 = v_secn_21_020;
		this.v_secn_21_030 = v_secn_21_030;
		this.v_secn_21_040 = v_secn_21_040;
		this.v_secn_21_050 = v_secn_21_050;
		this.v_secn_22_010 = v_secn_22_010;
		this.v_secn_23_010 = v_secn_23_010;
		this.v_secn_23_020 = v_secn_23_020;
		this.v_secn_24_010 = v_secn_24_010;
		this.v_secn_24_020 = v_secn_24_020;
		this.v_secn_24_030 = v_secn_24_030;
		this.v_secn_24_040 = v_secn_24_040;
		this.v_secn_24_050 = v_secn_24_050;
		this.v_secn_24_060 = v_secn_24_060;
		this.v_secn_24_070 = v_secn_24_070;
		this.v_secn_24_080 = v_secn_24_080;
		this.v_secn_tot_amt = v_secn_tot_amt;
		this.j_secn_105_1_1 = j_secn_105_1_1;
		this.j_secn_105_1_3 = j_secn_105_1_3;
		this.j_secn_105_1_32 = j_secn_105_1_32;
		this.j_secn_105_1_4 = j_secn_105_1_4;
		this.j_secn_105_1_5 = j_secn_105_1_5;
		this.j_secn_107 = j_secn_107;
		this.j_secn_121_13 = j_secn_121_13;
		this.j_secn_tot_amt = j_secn_tot_amt;
		this.tot_amt = tot_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setData_cnt(long data_cnt){
		this.data_cnt = data_cnt;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setV_secn_21_010(long v_secn_21_010){
		this.v_secn_21_010 = v_secn_21_010;
	}

	public void setV_secn_21_020(long v_secn_21_020){
		this.v_secn_21_020 = v_secn_21_020;
	}

	public void setV_secn_21_030(long v_secn_21_030){
		this.v_secn_21_030 = v_secn_21_030;
	}

	public void setV_secn_21_040(long v_secn_21_040){
		this.v_secn_21_040 = v_secn_21_040;
	}

	public void setV_secn_21_050(long v_secn_21_050){
		this.v_secn_21_050 = v_secn_21_050;
	}

	public void setV_secn_22_010(long v_secn_22_010){
		this.v_secn_22_010 = v_secn_22_010;
	}

	public void setV_secn_23_010(long v_secn_23_010){
		this.v_secn_23_010 = v_secn_23_010;
	}

	public void setV_secn_23_020(long v_secn_23_020){
		this.v_secn_23_020 = v_secn_23_020;
	}

	public void setV_secn_24_010(long v_secn_24_010){
		this.v_secn_24_010 = v_secn_24_010;
	}

	public void setV_secn_24_020(long v_secn_24_020){
		this.v_secn_24_020 = v_secn_24_020;
	}

	public void setV_secn_24_030(long v_secn_24_030){
		this.v_secn_24_030 = v_secn_24_030;
	}

	public void setV_secn_24_040(long v_secn_24_040){
		this.v_secn_24_040 = v_secn_24_040;
	}

	public void setV_secn_24_050(long v_secn_24_050){
		this.v_secn_24_050 = v_secn_24_050;
	}

	public void setV_secn_24_060(long v_secn_24_060){
		this.v_secn_24_060 = v_secn_24_060;
	}

	public void setV_secn_24_070(long v_secn_24_070){
		this.v_secn_24_070 = v_secn_24_070;
	}

	public void setV_secn_24_080(long v_secn_24_080){
		this.v_secn_24_080 = v_secn_24_080;
	}

	public void setV_secn_tot_amt(long v_secn_tot_amt){
		this.v_secn_tot_amt = v_secn_tot_amt;
	}

	public void setJ_secn_105_1_1(long j_secn_105_1_1){
		this.j_secn_105_1_1 = j_secn_105_1_1;
	}

	public void setJ_secn_105_1_3(long j_secn_105_1_3){
		this.j_secn_105_1_3 = j_secn_105_1_3;
	}

	public void setJ_secn_105_1_32(long j_secn_105_1_32){
		this.j_secn_105_1_32 = j_secn_105_1_32;
	}

	public void setJ_secn_105_1_4(long j_secn_105_1_4){
		this.j_secn_105_1_4 = j_secn_105_1_4;
	}

	public void setJ_secn_105_1_5(long j_secn_105_1_5){
		this.j_secn_105_1_5 = j_secn_105_1_5;
	}

	public void setJ_secn_107(long j_secn_107){
		this.j_secn_107 = j_secn_107;
	}

	public void setJ_secn_121_13(long j_secn_121_13){
		this.j_secn_121_13 = j_secn_121_13;
	}

	public void setJ_secn_tot_amt(long j_secn_tot_amt){
		this.j_secn_tot_amt = j_secn_tot_amt;
	}

	public void setTot_amt(long tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public long getData_cnt(){
		return this.data_cnt;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public long getV_secn_21_010(){
		return this.v_secn_21_010;
	}

	public long getV_secn_21_020(){
		return this.v_secn_21_020;
	}

	public long getV_secn_21_030(){
		return this.v_secn_21_030;
	}

	public long getV_secn_21_040(){
		return this.v_secn_21_040;
	}

	public long getV_secn_21_050(){
		return this.v_secn_21_050;
	}

	public long getV_secn_22_010(){
		return this.v_secn_22_010;
	}

	public long getV_secn_23_010(){
		return this.v_secn_23_010;
	}

	public long getV_secn_23_020(){
		return this.v_secn_23_020;
	}

	public long getV_secn_24_010(){
		return this.v_secn_24_010;
	}

	public long getV_secn_24_020(){
		return this.v_secn_24_020;
	}

	public long getV_secn_24_030(){
		return this.v_secn_24_030;
	}

	public long getV_secn_24_040(){
		return this.v_secn_24_040;
	}

	public long getV_secn_24_050(){
		return this.v_secn_24_050;
	}

	public long getV_secn_24_060(){
		return this.v_secn_24_060;
	}

	public long getV_secn_24_070(){
		return this.v_secn_24_070;
	}

	public long getV_secn_24_080(){
		return this.v_secn_24_080;
	}

	public long getV_secn_tot_amt(){
		return this.v_secn_tot_amt;
	}

	public long getJ_secn_105_1_1(){
		return this.j_secn_105_1_1;
	}

	public long getJ_secn_105_1_3(){
		return this.j_secn_105_1_3;
	}

	public long getJ_secn_105_1_32(){
		return this.j_secn_105_1_32;
	}

	public long getJ_secn_105_1_4(){
		return this.j_secn_105_1_4;
	}

	public long getJ_secn_105_1_5(){
		return this.j_secn_105_1_5;
	}

	public long getJ_secn_107(){
		return this.j_secn_107;
	}

	public long getJ_secn_121_13(){
		return this.j_secn_121_13;
	}

	public long getJ_secn_tot_amt(){
		return this.j_secn_tot_amt;
	}

	public long getTot_amt(){
		return this.tot_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		System.out.println("최호정 errcode =>"+"["+errcode+"]");
		System.out.println("최호정 errmsg =>"+"["+errmsg+"]");
		if(!"".equals(this.errcode)){
			return;
		}

		this.erplace_cd = Util.checkString(cstmt.getString(9));
		this.data_cnt = cstmt.getLong(10);
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
		this.v_secn_21_010 = cstmt.getLong(13);
		this.v_secn_21_020 = cstmt.getLong(14);
		this.v_secn_21_030 = cstmt.getLong(15);
		this.v_secn_21_040 = cstmt.getLong(16);
		this.v_secn_21_050 = cstmt.getLong(17);
		this.v_secn_22_010 = cstmt.getLong(18);
		this.v_secn_23_010 = cstmt.getLong(19);
		this.v_secn_23_020 = cstmt.getLong(20);
		this.v_secn_24_010 = cstmt.getLong(21);
		this.v_secn_24_020 = cstmt.getLong(22);
		this.v_secn_24_030 = cstmt.getLong(23);
		this.v_secn_24_040 = cstmt.getLong(24);
		this.v_secn_24_050 = cstmt.getLong(25);
		this.v_secn_24_060 = cstmt.getLong(26);
		this.v_secn_24_070 = cstmt.getLong(27);
		this.v_secn_24_080 = cstmt.getLong(28);
		this.v_secn_tot_amt = cstmt.getLong(29);
		this.j_secn_105_1_1 = cstmt.getLong(30);
		this.j_secn_105_1_3 = cstmt.getLong(31);
		this.j_secn_105_1_32 = cstmt.getLong(32);
		this.j_secn_105_1_4 = cstmt.getLong(33);
		this.j_secn_105_1_5 = cstmt.getLong(34);
		this.j_secn_107 = cstmt.getLong(35);
		this.j_secn_121_13 = cstmt.getLong(36);
		this.j_secn_tot_amt = cstmt.getLong(37);
		this.tot_amt = cstmt.getLong(38);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6271_SDataSet ds = (FC_ACCT_6271_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getErplace_cd()%>
<%= ds.getData_cnt()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
<%= ds.getV_secn_21_010()%>
<%= ds.getV_secn_21_020()%>
<%= ds.getV_secn_21_030()%>
<%= ds.getV_secn_21_040()%>
<%= ds.getV_secn_21_050()%>
<%= ds.getV_secn_22_010()%>
<%= ds.getV_secn_23_010()%>
<%= ds.getV_secn_23_020()%>
<%= ds.getV_secn_24_010()%>
<%= ds.getV_secn_24_020()%>
<%= ds.getV_secn_24_030()%>
<%= ds.getV_secn_24_040()%>
<%= ds.getV_secn_24_050()%>
<%= ds.getV_secn_24_060()%>
<%= ds.getV_secn_24_070()%>
<%= ds.getV_secn_24_080()%>
<%= ds.getV_secn_tot_amt()%>
<%= ds.getJ_secn_105_1_1()%>
<%= ds.getJ_secn_105_1_3()%>
<%= ds.getJ_secn_105_1_32()%>
<%= ds.getJ_secn_105_1_4()%>
<%= ds.getJ_secn_105_1_5()%>
<%= ds.getJ_secn_107()%>
<%= ds.getJ_secn_121_13()%>
<%= ds.getJ_secn_tot_amt()%>
<%= ds.getTot_amt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 11 21:29:31 KST 2014 */