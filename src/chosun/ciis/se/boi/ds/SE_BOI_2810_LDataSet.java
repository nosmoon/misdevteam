/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2810_LDataSet(){}
	public SE_BOI_2810_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SE_BOI_2810_LCURLISTRecord rec = new SE_BOI_2810_LCURLISTRecord();
			rec.cntr_stat_clsf = Util.checkString(rset0.getString("cntr_stat_clsf"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.bo_cntr_dt = Util.checkString(rset0.getString("bo_cntr_dt"));
			rec.bogurt_clsf = Util.checkString(rset0.getString("bogurt_clsf"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.jont_d = Util.checkString(rset0.getString("jont_d"));
			rec.add_bogurt_amt = Util.checkString(rset0.getString("add_bogurt_amt"));
			rec.mort_amt = Util.checkString(rset0.getString("mort_amt"));
			rec.gurt_amt_chk = Util.checkString(rset0.getString("gurt_amt_chk"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.cntr_gurt_amt_stot = Util.checkString(rset0.getString("cntr_gurt_amt_stot"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(16);
		while(rset1.next()){
			SE_BOI_2810_LCURLIST2Record rec = new SE_BOI_2810_LCURLIST2Record();
			rec.cntr_stat_clsf = Util.checkString(rset1.getString("cntr_stat_clsf"));
			rec.deptnm = Util.checkString(rset1.getString("deptnm"));
			rec.partnm = Util.checkString(rset1.getString("partnm"));
			rec.areanm = Util.checkString(rset1.getString("areanm"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.bo_cd = Util.checkString(rset1.getString("bo_cd"));
			rec.bo_head_nm = Util.checkString(rset1.getString("bo_head_nm"));
			rec.bo_cntr_dt = Util.checkString(rset1.getString("bo_cntr_dt"));
			rec.net_sale_amt = Util.checkString(rset1.getString("net_sale_amt"));
			rec.insr_cmpy = Util.checkString(rset1.getString("insr_cmpy"));
			rec.insr_no = Util.checkString(rset1.getString("insr_no"));
			rec.insr_amt = Util.checkString(rset1.getString("insr_amt"));
			rec.insr_fr_dt = Util.checkString(rset1.getString("insr_fr_dt"));
			rec.insr_to_dt = Util.checkString(rset1.getString("insr_to_dt"));
			rec.insr_prem = Util.checkString(rset1.getString("insr_prem"));
			rec.insr_clsf = Util.checkString(rset1.getString("insr_clsf"));
			rec.end_yn = Util.checkString(rset1.getString("end_yn"));
			rec.bo_seq = Util.checkString(rset1.getString("bo_seq"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2810_LDataSet ds = (SE_BOI_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2810_LCURLISTRecord curlistRec = (SE_BOI_2810_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		SE_BOI_2810_LCURLIST2Record curlist2Rec = (SE_BOI_2810_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cntr_stat_clsf%>
<%= curlistRec.deptnm%>
<%= curlistRec.partnm%>
<%= curlistRec.areanm%>
<%= curlistRec.bonm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.bo_cntr_dt%>
<%= curlistRec.bogurt_clsf%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.jont_d%>
<%= curlistRec.add_bogurt_amt%>
<%= curlistRec.mort_amt%>
<%= curlistRec.gurt_amt_chk%>
<%= curlistRec.bo_seq%>
<%= curlistRec.cntr_gurt_amt_stot%>
<%= curlist2Rec.cntr_stat_clsf%>
<%= curlist2Rec.deptnm%>
<%= curlist2Rec.partnm%>
<%= curlist2Rec.areanm%>
<%= curlist2Rec.bonm%>
<%= curlist2Rec.bo_cd%>
<%= curlist2Rec.bo_head_nm%>
<%= curlist2Rec.bo_cntr_dt%>
<%= curlist2Rec.net_sale_amt%>
<%= curlist2Rec.insr_cmpy%>
<%= curlist2Rec.insr_no%>
<%= curlist2Rec.insr_amt%>
<%= curlist2Rec.insr_fr_dt%>
<%= curlist2Rec.insr_to_dt%>
<%= curlist2Rec.insr_prem%>
<%= curlist2Rec.insr_clsf%>
<%= curlist2Rec.end_yn%>
<%= curlist2Rec.bo_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 11 17:09:06 KST 2016 */