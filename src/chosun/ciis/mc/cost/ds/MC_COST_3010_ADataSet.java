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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_3010_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_09 = new ArrayList();
	public ArrayList curlist_08 = new ArrayList();
	public ArrayList curlist_07 = new ArrayList();
	public ArrayList curlist_06 = new ArrayList();
	public ArrayList curlist_05 = new ArrayList();
	public ArrayList curlist_04 = new ArrayList();
	public ArrayList curlist_03 = new ArrayList();
	public ArrayList curlist_02 = new ArrayList();
	public ArrayList curlist_01 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_clos_clsf_010;
	public String xx_clos_clsf_020;
	public String xx_clos_clsf_030;

	public MC_COST_3010_ADataSet(){}
	public MC_COST_3010_ADataSet(String errcode, String errmsg, String xx_clos_clsf_010, String xx_clos_clsf_020, String xx_clos_clsf_030){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_clos_clsf_010 = xx_clos_clsf_010;
		this.xx_clos_clsf_020 = xx_clos_clsf_020;
		this.xx_clos_clsf_030 = xx_clos_clsf_030;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_clos_clsf_010(String xx_clos_clsf_010){
		this.xx_clos_clsf_010 = xx_clos_clsf_010;
	}

	public void setXx_clos_clsf_020(String xx_clos_clsf_020){
		this.xx_clos_clsf_020 = xx_clos_clsf_020;
	}

	public void setXx_clos_clsf_030(String xx_clos_clsf_030){
		this.xx_clos_clsf_030 = xx_clos_clsf_030;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_clos_clsf_010(){
		return this.xx_clos_clsf_010;
	}

	public String getXx_clos_clsf_020(){
		return this.xx_clos_clsf_020;
	}

	public String getXx_clos_clsf_030(){
		return this.xx_clos_clsf_030;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MC_COST_3010_ACURLIST_01Record rec = new MC_COST_3010_ACURLIST_01Record();
			rec.col1 = Util.checkString(rset0.getString("col1"));
			this.curlist_01.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MC_COST_3010_ACURLIST_02Record rec = new MC_COST_3010_ACURLIST_02Record();
			rec.col1 = Util.checkString(rset1.getString("col1"));
			this.curlist_02.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			MC_COST_3010_ACURLIST_03Record rec = new MC_COST_3010_ACURLIST_03Record();
			rec.col1 = Util.checkString(rset2.getString("col1"));
			this.curlist_03.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			MC_COST_3010_ACURLIST_04Record rec = new MC_COST_3010_ACURLIST_04Record();
			rec.budg_cdnm = Util.checkString(rset3.getString("budg_cdnm"));
			this.curlist_04.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			MC_COST_3010_ACURLIST_05Record rec = new MC_COST_3010_ACURLIST_05Record();
			rec.ndstb_cd = Util.checkString(rset4.getString("ndstb_cd"));
			this.curlist_05.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			MC_COST_3010_ACURLIST_06Record rec = new MC_COST_3010_ACURLIST_06Record();
			rec.dstb_nm = Util.checkString(rset5.getString("dstb_nm"));
			this.curlist_06.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(14);
		while(rset6.next()){
			MC_COST_3010_ACURLIST_07Record rec = new MC_COST_3010_ACURLIST_07Record();
			rec.bscd_no_entry = Util.checkString(rset6.getString("bscd_no_entry"));
			rec.bscd_err = Util.checkString(rset6.getString("bscd_err"));
			this.curlist_07.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(15);
		while(rset7.next()){
			MC_COST_3010_ACURLIST_08Record rec = new MC_COST_3010_ACURLIST_08Record();
			rec.bsbbcd_no_entry = Util.checkString(rset7.getString("bsbbcd_no_entry"));
			rec.bsbbcd_err = Util.checkString(rset7.getString("bsbbcd_err"));
			this.curlist_08.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(16);
		while(rset8.next()){
			MC_COST_3010_ACURLIST_09Record rec = new MC_COST_3010_ACURLIST_09Record();
			rec.excp_dstb_cd = Util.checkString(rset8.getString("excp_dstb_cd"));
			this.curlist_09.add(rec);
		}
		this.xx_clos_clsf_010 = Util.checkString(cstmt.getString(17));
		this.xx_clos_clsf_020 = Util.checkString(cstmt.getString(18));
		this.xx_clos_clsf_030 = Util.checkString(cstmt.getString(19));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3010_ADataSet ds = (MC_COST_3010_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_01.size(); i++){
		MC_COST_3010_ACURLIST_01Record curlist_01Rec = (MC_COST_3010_ACURLIST_01Record)ds.curlist_01.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_02.size(); i++){
		MC_COST_3010_ACURLIST_02Record curlist_02Rec = (MC_COST_3010_ACURLIST_02Record)ds.curlist_02.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_03.size(); i++){
		MC_COST_3010_ACURLIST_03Record curlist_03Rec = (MC_COST_3010_ACURLIST_03Record)ds.curlist_03.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_04.size(); i++){
		MC_COST_3010_ACURLIST_04Record curlist_04Rec = (MC_COST_3010_ACURLIST_04Record)ds.curlist_04.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_05.size(); i++){
		MC_COST_3010_ACURLIST_05Record curlist_05Rec = (MC_COST_3010_ACURLIST_05Record)ds.curlist_05.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_06.size(); i++){
		MC_COST_3010_ACURLIST_06Record curlist_06Rec = (MC_COST_3010_ACURLIST_06Record)ds.curlist_06.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_07.size(); i++){
		MC_COST_3010_ACURLIST_07Record curlist_07Rec = (MC_COST_3010_ACURLIST_07Record)ds.curlist_07.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_08.size(); i++){
		MC_COST_3010_ACURLIST_08Record curlist_08Rec = (MC_COST_3010_ACURLIST_08Record)ds.curlist_08.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_09.size(); i++){
		MC_COST_3010_ACURLIST_09Record curlist_09Rec = (MC_COST_3010_ACURLIST_09Record)ds.curlist_09.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_01()%>
<%= ds.getCurlist_02()%>
<%= ds.getCurlist_03()%>
<%= ds.getCurlist_04()%>
<%= ds.getCurlist_05()%>
<%= ds.getCurlist_06()%>
<%= ds.getCurlist_07()%>
<%= ds.getCurlist_08()%>
<%= ds.getCurlist_09()%>
<%= ds.getXx_clos_clsf_010()%>
<%= ds.getXx_clos_clsf_020()%>
<%= ds.getXx_clos_clsf_030()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_01Rec.col1%>
<%= curlist_02Rec.col1%>
<%= curlist_03Rec.col1%>
<%= curlist_04Rec.budg_cdnm%>
<%= curlist_05Rec.ndstb_cd%>
<%= curlist_06Rec.dstb_nm%>
<%= curlist_07Rec.bscd_no_entry%>
<%= curlist_07Rec.bscd_err%>
<%= curlist_08Rec.bsbbcd_no_entry%>
<%= curlist_08Rec.bsbbcd_err%>
<%= curlist_09Rec.excp_dstb_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 12 14:14:03 KST 2012 */