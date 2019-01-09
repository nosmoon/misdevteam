/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6303_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6303_LDataSet(){}
	public MC_BUDG_6303_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			MC_BUDG_6303_LCURLIST1Record rec = new MC_BUDG_6303_LCURLIST1Record();
			rec.yymm = Util.checkString(rset3.getString("yymm"));
			rec.mt1 = Util.checkString(rset3.getString("mt1"));
			rec.mt2 = Util.checkString(rset3.getString("mt2"));
			rec.mt3 = Util.checkString(rset3.getString("mt3"));
			rec.mt4 = Util.checkString(rset3.getString("mt4"));
			rec.mt5 = Util.checkString(rset3.getString("mt5"));
			rec.mt6 = Util.checkString(rset3.getString("mt6"));
			rec.mt7 = Util.checkString(rset3.getString("mt7"));
			rec.mt8 = Util.checkString(rset3.getString("mt8"));
			rec.mt9 = Util.checkString(rset3.getString("mt9"));
			rec.mt10 = Util.checkString(rset3.getString("mt10"));
			rec.mt11 = Util.checkString(rset3.getString("mt11"));
			rec.mt12 = Util.checkString(rset3.getString("mt12"));
			this.curlist1.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			MC_BUDG_6303_LCURLIST2Record rec = new MC_BUDG_6303_LCURLIST2Record();
			rec.hdqt_aply_rate = Util.checkString(rset4.getString("hdqt_aply_rate"));
			rec.lcl_aply_rate = Util.checkString(rset4.getString("lcl_aply_rate"));
			this.curlist2.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(8);
		while(rset5.next()){
			MC_BUDG_6303_LCURLIST3Record rec = new MC_BUDG_6303_LCURLIST3Record();
			rec.su_cost_1 = Util.checkString(rset5.getString("su_cost_1"));
			rec.su_cost_2 = Util.checkString(rset5.getString("su_cost_2"));
			rec.su_cost_3 = Util.checkString(rset5.getString("su_cost_3"));
			rec.su_cost_4 = Util.checkString(rset5.getString("su_cost_4"));
			rec.j_cost_1 = Util.checkString(rset5.getString("j_cost_1"));
			rec.j_cost_2 = Util.checkString(rset5.getString("j_cost_2"));
			rec.j_cost_3 = Util.checkString(rset5.getString("j_cost_3"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_6303_LDataSet ds = (MC_BUDG_6303_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_6303_LCURLIST1Record curlist1Rec = (MC_BUDG_6303_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_6303_LCURLIST2Record curlist2Rec = (MC_BUDG_6303_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MC_BUDG_6303_LCURLIST3Record curlist3Rec = (MC_BUDG_6303_LCURLIST3Record)ds.curlist3.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.yymm%>
<%= curlist1Rec.mt1%>
<%= curlist1Rec.mt2%>
<%= curlist1Rec.mt3%>
<%= curlist1Rec.mt4%>
<%= curlist1Rec.mt5%>
<%= curlist1Rec.mt6%>
<%= curlist1Rec.mt7%>
<%= curlist1Rec.mt8%>
<%= curlist1Rec.mt9%>
<%= curlist1Rec.mt10%>
<%= curlist1Rec.mt11%>
<%= curlist1Rec.mt12%>
<%= curlist2Rec.hdqt_aply_rate%>
<%= curlist2Rec.lcl_aply_rate%>
<%= curlist3Rec.su_cost_1%>
<%= curlist3Rec.su_cost_2%>
<%= curlist3Rec.su_cost_3%>
<%= curlist3Rec.su_cost_4%>
<%= curlist3Rec.j_cost_1%>
<%= curlist3Rec.j_cost_2%>
<%= curlist3Rec.j_cost_3%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 22 13:40:29 KST 2009 */