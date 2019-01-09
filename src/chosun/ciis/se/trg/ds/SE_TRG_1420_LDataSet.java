/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String evlu_seq;
	public String rfl_ratio1;
	public String rfl_ratio2;
	public String colcnt;
	public String title;
	public String bo_grp;

	public SE_TRG_1420_LDataSet(){}
	public SE_TRG_1420_LDataSet(String errcode, String errmsg, String evlu_seq, String rfl_ratio1, String rfl_ratio2, String colcnt, String title, String bo_grp){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.evlu_seq = evlu_seq;
		this.rfl_ratio1 = rfl_ratio1;
		this.rfl_ratio2 = rfl_ratio2;
		this.colcnt = colcnt;
		this.title = title;
		this.bo_grp = bo_grp;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setEvlu_seq(String evlu_seq){
		this.evlu_seq = evlu_seq;
	}

	public void setRfl_ratio1(String rfl_ratio1){
		this.rfl_ratio1 = rfl_ratio1;
	}

	public void setRfl_ratio2(String rfl_ratio2){
		this.rfl_ratio2 = rfl_ratio2;
	}

	public void setColcnt(String colcnt){
		this.colcnt = colcnt;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setBo_grp(String bo_grp){
		this.bo_grp = bo_grp;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getEvlu_seq(){
		return this.evlu_seq;
	}

	public String getRfl_ratio1(){
		return this.rfl_ratio1;
	}

	public String getRfl_ratio2(){
		return this.rfl_ratio2;
	}

	public String getColcnt(){
		return this.colcnt;
	}

	public String getTitle(){
		return this.title;
	}

	public String getBo_grp(){
		return this.bo_grp;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.evlu_seq = Util.checkString(cstmt.getString(8));
		this.rfl_ratio1 = Util.checkString(cstmt.getString(9));
		this.rfl_ratio2 = Util.checkString(cstmt.getString(10));
		this.colcnt = Util.checkString(cstmt.getString(11));
		this.title = Util.checkString(cstmt.getString(12));
		this.bo_grp = Util.checkString(cstmt.getString(13));
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SE_TRG_1420_LCURLIST1Record rec = new SE_TRG_1420_LCURLIST1Record();
			rec.rank = Util.checkString(rset0.getString("rank"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(15);
		while(rset1.next()){
			SE_TRG_1420_LCURLIST2Record rec = new SE_TRG_1420_LCURLIST2Record();
			rec.rank = Util.checkString(rset1.getString("rank"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TRG_1420_LDataSet ds = (SE_TRG_1420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SE_TRG_1420_LCURLIST1Record curlist1Rec = (SE_TRG_1420_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		SE_TRG_1420_LCURLIST2Record curlist2Rec = (SE_TRG_1420_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEvlu_seq()%>
<%= ds.getRfl_ratio1()%>
<%= ds.getRfl_ratio2()%>
<%= ds.getColcnt()%>
<%= ds.getTitle()%>
<%= ds.getBo_grp()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.rank%>
<%= curlist1Rec.amt%>
<%= curlist2Rec.rank%>
<%= curlist2Rec.amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 10:17:56 KST 2009 */