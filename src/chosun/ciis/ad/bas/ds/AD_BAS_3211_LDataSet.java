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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_3211_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_3211_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3211_LDataSet(){}
	public AD_BAS_3211_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_BAS_3211_LCURLISTRecord rec = new AD_BAS_3211_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.tot_pcnt = Util.checkString(rset0.getString("tot_pcnt"));
			rec.tot_cell = Util.checkString(rset0.getString("tot_cell"));
			rec.clr_cell = Util.checkString(rset0.getString("clr_cell"));
			rec.asum_pubc_amt = Util.checkString(rset0.getString("asum_pubc_amt"));
			rec.advt_ocpy_rate = Util.checkString(rset0.getString("advt_ocpy_rate"));
			rec.c0101_pcnt = Util.checkString(rset0.getString("c0101_pcnt"));
			rec.c0102_pcnt = Util.checkString(rset0.getString("c0102_pcnt"));
			rec.c0103_pcnt = Util.checkString(rset0.getString("c0103_pcnt"));
			rec.c0104_pcnt = Util.checkString(rset0.getString("c0104_pcnt"));
			rec.c0105_pcnt = Util.checkString(rset0.getString("c0105_pcnt"));
			rec.c0106_pcnt = Util.checkString(rset0.getString("c0106_pcnt"));
			rec.c0107_pcnt = Util.checkString(rset0.getString("c0107_pcnt"));
			rec.c0108_sect_nm = Util.checkString(rset0.getString("c0108_sect_nm"));
			rec.c0108_pcnt = Util.checkString(rset0.getString("c0108_pcnt"));
			rec.c0109_sect_nm = Util.checkString(rset0.getString("c0109_sect_nm"));
			rec.c0109_pcnt = Util.checkString(rset0.getString("c0109_pcnt"));
			rec.c0110_sect_nm = Util.checkString(rset0.getString("c0110_sect_nm"));
			rec.c0110_out_clsf = Util.checkString(rset0.getString("c0110_out_clsf"));
			rec.c0111_sect_nm = Util.checkString(rset0.getString("c0111_sect_nm"));
			rec.c0111_out_clsf = Util.checkString(rset0.getString("c0111_out_clsf"));
			rec.c0112_sect_nm = Util.checkString(rset0.getString("c0112_sect_nm"));
			rec.c0112_out_clsf = Util.checkString(rset0.getString("c0112_out_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3211_LDataSet ds = (AD_BAS_3211_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3211_LCURLISTRecord curlistRec = (AD_BAS_3211_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.tot_pcnt%>
<%= curlistRec.tot_cell%>
<%= curlistRec.clr_cell%>
<%= curlistRec.asum_pubc_amt%>
<%= curlistRec.advt_ocpy_rate%>
<%= curlistRec.c0101_pcnt%>
<%= curlistRec.c0102_pcnt%>
<%= curlistRec.c0103_pcnt%>
<%= curlistRec.c0104_pcnt%>
<%= curlistRec.c0105_pcnt%>
<%= curlistRec.c0106_pcnt%>
<%= curlistRec.c0107_pcnt%>
<%= curlistRec.c0108_sect_nm%>
<%= curlistRec.c0108_pcnt%>
<%= curlistRec.c0109_sect_nm%>
<%= curlistRec.c0109_pcnt%>
<%= curlistRec.c0110_sect_nm%>
<%= curlistRec.c0110_out_clsf%>
<%= curlistRec.c0111_sect_nm%>
<%= curlistRec.c0111_out_clsf%>
<%= curlistRec.c0112_sect_nm%>
<%= curlistRec.c0112_out_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 16:24:24 KST 2009 */