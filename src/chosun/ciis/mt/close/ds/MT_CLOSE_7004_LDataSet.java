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


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_7004_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_7004_LDataSet(){}
	public MT_CLOSE_7004_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_CLOSE_7004_LCURLIST1Record rec = new MT_CLOSE_7004_LCURLIST1Record();
			rec.irow = Util.checkString(rset0.getString("irow"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.so_irow = Util.checkString(rset0.getString("so_irow"));
			rec.sonm = Util.checkString(rset0.getString("sonm"));
			rec.irow2 = Util.checkString(rset0.getString("irow2"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_CLOSE_7004_LCURLIST2Record rec = new MT_CLOSE_7004_LCURLIST2Record();
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.dstb_rat_cd = Util.checkString(rset1.getString("dstb_rat_cd"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.be_qunt = Util.checkString(rset1.getString("be_qunt"));
			rec.be_amt = Util.checkString(rset1.getString("be_amt"));
			rec.qunt1 = Util.checkString(rset1.getString("qunt1"));
			rec.amt1 = Util.checkString(rset1.getString("amt1"));
			rec.qunt2 = Util.checkString(rset1.getString("qunt2"));
			rec.amt2 = Util.checkString(rset1.getString("amt2"));
			rec.qunt3 = Util.checkString(rset1.getString("qunt3"));
			rec.amt3 = Util.checkString(rset1.getString("amt3"));
			rec.qunt4 = Util.checkString(rset1.getString("qunt4"));
			rec.amt4 = Util.checkString(rset1.getString("amt4"));
			rec.qunt5 = Util.checkString(rset1.getString("qunt5"));
			rec.amt5 = Util.checkString(rset1.getString("amt5"));
			rec.qunt6 = Util.checkString(rset1.getString("qunt6"));
			rec.amt6 = Util.checkString(rset1.getString("amt6"));
			rec.qunt7 = Util.checkString(rset1.getString("qunt7"));
			rec.amt7 = Util.checkString(rset1.getString("amt7"));
			rec.qunt8 = Util.checkString(rset1.getString("qunt8"));
			rec.amt8 = Util.checkString(rset1.getString("amt8"));
			rec.qunt9 = Util.checkString(rset1.getString("qunt9"));
			rec.amt9 = Util.checkString(rset1.getString("amt9"));
			rec.qunt10 = Util.checkString(rset1.getString("qunt10"));
			rec.amt10 = Util.checkString(rset1.getString("amt10"));
			rec.qunt11 = Util.checkString(rset1.getString("qunt11"));
			rec.amt11 = Util.checkString(rset1.getString("amt11"));
			rec.qunt12 = Util.checkString(rset1.getString("qunt12"));
			rec.amt12 = Util.checkString(rset1.getString("amt12"));
			rec.qunt13 = Util.checkString(rset1.getString("qunt13"));
			rec.amt13 = Util.checkString(rset1.getString("amt13"));
			rec.qunt14 = Util.checkString(rset1.getString("qunt14"));
			rec.amt14 = Util.checkString(rset1.getString("amt14"));
			rec.qunt15 = Util.checkString(rset1.getString("qunt15"));
			rec.amt15 = Util.checkString(rset1.getString("amt15"));
			rec.qunt16 = Util.checkString(rset1.getString("qunt16"));
			rec.amt16 = Util.checkString(rset1.getString("amt16"));
			rec.qunt17 = Util.checkString(rset1.getString("qunt17"));
			rec.amt17 = Util.checkString(rset1.getString("amt17"));
			rec.qunt18 = Util.checkString(rset1.getString("qunt18"));
			rec.amt18 = Util.checkString(rset1.getString("amt18"));
			rec.qunt19 = Util.checkString(rset1.getString("qunt19"));
			rec.amt19 = Util.checkString(rset1.getString("amt19"));
			rec.qunt20 = Util.checkString(rset1.getString("qunt20"));
			rec.amt20 = Util.checkString(rset1.getString("amt20"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_7004_LDataSet ds = (MT_CLOSE_7004_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_CLOSE_7004_LCURLIST1Record curlist1Rec = (MT_CLOSE_7004_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_CLOSE_7004_LCURLIST2Record curlist2Rec = (MT_CLOSE_7004_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.irow%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.sect_nm%>
<%= curlist1Rec.so_irow%>
<%= curlist1Rec.sonm%>
<%= curlist1Rec.irow2%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.dstb_rat_cd%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist2Rec.be_qunt%>
<%= curlist2Rec.be_amt%>
<%= curlist2Rec.qunt1%>
<%= curlist2Rec.amt1%>
<%= curlist2Rec.qunt2%>
<%= curlist2Rec.amt2%>
<%= curlist2Rec.qunt3%>
<%= curlist2Rec.amt3%>
<%= curlist2Rec.qunt4%>
<%= curlist2Rec.amt4%>
<%= curlist2Rec.qunt5%>
<%= curlist2Rec.amt5%>
<%= curlist2Rec.qunt6%>
<%= curlist2Rec.amt6%>
<%= curlist2Rec.qunt7%>
<%= curlist2Rec.amt7%>
<%= curlist2Rec.qunt8%>
<%= curlist2Rec.amt8%>
<%= curlist2Rec.qunt9%>
<%= curlist2Rec.amt9%>
<%= curlist2Rec.qunt10%>
<%= curlist2Rec.amt10%>
<%= curlist2Rec.qunt11%>
<%= curlist2Rec.amt11%>
<%= curlist2Rec.qunt12%>
<%= curlist2Rec.amt12%>
<%= curlist2Rec.qunt13%>
<%= curlist2Rec.amt13%>
<%= curlist2Rec.qunt14%>
<%= curlist2Rec.amt14%>
<%= curlist2Rec.qunt15%>
<%= curlist2Rec.amt15%>
<%= curlist2Rec.qunt16%>
<%= curlist2Rec.amt16%>
<%= curlist2Rec.qunt17%>
<%= curlist2Rec.amt17%>
<%= curlist2Rec.qunt18%>
<%= curlist2Rec.amt18%>
<%= curlist2Rec.qunt19%>
<%= curlist2Rec.amt19%>
<%= curlist2Rec.qunt20%>
<%= curlist2Rec.amt20%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 15 13:52:30 KST 2009 */