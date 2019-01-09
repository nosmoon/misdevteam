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


package chosun.ciis.mt.outsdelmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.outsdelmt.dm.*;
import chosun.ciis.mt.outsdelmt.rec.*;

/**
 * 
 */


public class MT_OUTSDELMT_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_OUTSDELMT_3000_LDataSet(){}
	public MT_OUTSDELMT_3000_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_OUTSDELMT_3000_LCURLISTRecord rec = new MT_OUTSDELMT_3000_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.outsd_elmt_aply_clsf = Util.checkString(rset0.getString("outsd_elmt_aply_clsf"));
			rec.outsd_elmt_aply_nm = Util.checkString(rset0.getString("outsd_elmt_aply_nm"));
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.aply_yymm = Util.checkString(rset0.getString("aply_yymm"));
			rec.matr_uprc = Util.checkString(rset0.getString("matr_uprc"));
			rec.ratio_yn = Util.checkString(rset0.getString("ratio_yn"));
			rec.ratio_nm = Util.checkString(rset0.getString("ratio_nm"));
			rec.fix_val = Util.checkString(rset0.getString("fix_val"));
			rec.fix_item_cost = Util.checkString(rset0.getString("fix_item_cost"));
			rec.fix_item_ratio = Util.checkString(rset0.getString("fix_item_ratio"));
			rec.marjn_val = Util.checkString(rset0.getString("marjn_val"));
			rec.marjn_cost = Util.checkString(rset0.getString("marjn_cost"));
			rec.marjn_ratio = Util.checkString(rset0.getString("marjn_ratio"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_OUTSDELMT_3000_LDataSet ds = (MT_OUTSDELMT_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_OUTSDELMT_3000_LCURLISTRecord curlistRec = (MT_OUTSDELMT_3000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.outsd_elmt_aply_clsf%>
<%= curlistRec.outsd_elmt_aply_nm%>
<%= curlistRec.aply_dt%>
<%= curlistRec.aply_yymm%>
<%= curlistRec.matr_uprc%>
<%= curlistRec.ratio_yn%>
<%= curlistRec.ratio_nm%>
<%= curlistRec.fix_val%>
<%= curlistRec.fix_item_cost%>
<%= curlistRec.fix_item_ratio%>
<%= curlistRec.marjn_val%>
<%= curlistRec.marjn_cost%>
<%= curlistRec.marjn_ratio%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 00:49:58 KST 2009 */