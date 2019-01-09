/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 *
 */

public class HD_EVLU_2700_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String prev_evlu_cd;
	public String rfl_ratio_10;
	public String rfl_ratio_20;
	public String slf_achv_desc1;
	public String slf_achv_desc2;

	public HD_EVLU_2700_SDataSet(){}
	public HD_EVLU_2700_SDataSet(String errcode, String errmsg, String prev_evlu_cd, String rfl_ratio_10, String rfl_ratio_20, String slf_achv_desc1, String slf_achv_desc2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.prev_evlu_cd = prev_evlu_cd;
		this.rfl_ratio_10 = rfl_ratio_10;
		this.rfl_ratio_20 = rfl_ratio_20;
		this.slf_achv_desc1 = slf_achv_desc1;
		this.slf_achv_desc2 = slf_achv_desc2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPrev_evlu_cd(String prev_evlu_cd){
		this.prev_evlu_cd = prev_evlu_cd;
	}

	public void setRfl_ratio_10(String rfl_ratio_10){
		this.rfl_ratio_10 = rfl_ratio_10;
	}

	public void setRfl_ratio_20(String rfl_ratio_20){
		this.rfl_ratio_20 = rfl_ratio_20;
	}

	public void setSlf_achv_desc1(String slf_achv_desc1){
		this.slf_achv_desc1 = slf_achv_desc1;
	}

	public void setSlf_achv_desc2(String slf_achv_desc2){
		this.slf_achv_desc2 = slf_achv_desc2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPrev_evlu_cd(){
		return this.prev_evlu_cd;
	}

	public String getRfl_ratio_10(){
		return this.rfl_ratio_10;
	}

	public String getRfl_ratio_20(){
		return this.rfl_ratio_20;
	}

	public String getSlf_achv_desc1(){
		return this.slf_achv_desc1;
	}

	public String getSlf_achv_desc2(){
		return this.slf_achv_desc2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.prev_evlu_cd = Util.checkString(cstmt.getString(7));
		this.rfl_ratio_10 = Util.checkString(cstmt.getString(8));
		this.rfl_ratio_20 = Util.checkString(cstmt.getString(9));
		this.slf_achv_desc1 = Util.checkString(cstmt.getString(10));
		this.slf_achv_desc2 = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			HD_EVLU_2700_SCURLIST1Record rec = new HD_EVLU_2700_SCURLIST1Record();
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset0.getString("act_indx_def"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			HD_EVLU_2700_SCURLIST2Record rec = new HD_EVLU_2700_SCURLIST2Record();
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.act_indx_def = Util.checkString(rset1.getString("act_indx_def"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_2700_SDataSet ds = (HD_EVLU_2700_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_EVLU_2700_SCURLIST1Record curlist1Rec = (HD_EVLU_2700_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_EVLU_2700_SCURLIST2Record curlist2Rec = (HD_EVLU_2700_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPrev_evlu_cd()%>
<%= ds.getRfl_ratio_10()%>
<%= ds.getRfl_ratio_20()%>
<%= ds.getSlf_achv_desc1()%>
<%= ds.getSlf_achv_desc2()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cdnm%>
<%= curlist1Rec.act_indx_def%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.act_indx_def%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 27 11:29:30 KST 2009 */