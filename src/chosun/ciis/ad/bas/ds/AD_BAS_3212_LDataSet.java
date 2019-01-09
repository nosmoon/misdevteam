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
import chosun.ciis.ad.bas.rec.AD_BAS_3212_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_3212_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3212_LDataSet(){}
	public AD_BAS_3212_LDataSet(String errcode, String errmsg){
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
			AD_BAS_3212_LCURLISTRecord rec = new AD_BAS_3212_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.tot_pcnt = Util.checkString(rset0.getString("tot_pcnt"));
			rec.tot_clas = Util.checkString(rset0.getString("tot_clas"));
			rec.clr_clas = Util.checkString(rset0.getString("clr_clas"));
			rec.asum_pubc_amt = Util.checkString(rset0.getString("asum_pubc_amt"));
			rec.advt_ocpy_rate = Util.checkString(rset0.getString("advt_ocpy_rate"));
			rec.c0201_pcnt = Util.checkString(rset0.getString("c0201_pcnt"));
			rec.c0202_pcnt = Util.checkString(rset0.getString("c0202_pcnt"));
			rec.c0203_pcnt = Util.checkString(rset0.getString("c0203_pcnt"));
			rec.c0204_pcnt = Util.checkString(rset0.getString("c0204_pcnt"));
			rec.c0205_pcnt = Util.checkString(rset0.getString("c0205_pcnt"));
			rec.c0206_pcnt = Util.checkString(rset0.getString("c0206_pcnt"));
			rec.c0207_sect_nm = Util.checkString(rset0.getString("c0207_sect_nm"));
			rec.c0207_pcnt = Util.checkString(rset0.getString("c0207_pcnt"));
			rec.c0208_sect_nm = Util.checkString(rset0.getString("c0208_sect_nm"));
			rec.c0208_pcnt = Util.checkString(rset0.getString("c0208_pcnt"));
			rec.c0209_sect_nm = Util.checkString(rset0.getString("c0209_sect_nm"));
			rec.c0209_out_clsf = Util.checkString(rset0.getString("c0209_out_clsf"));
			rec.c0210_sect_nm = Util.checkString(rset0.getString("c0210_sect_nm"));
			rec.c0210_out_clsf = Util.checkString(rset0.getString("c0210_out_clsf"));
			rec.c0211_sect_nm = Util.checkString(rset0.getString("c0211_sect_nm"));
			rec.c0211_out_clsf = Util.checkString(rset0.getString("c0211_out_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3212_LDataSet ds = (AD_BAS_3212_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3212_LCURLISTRecord curlistRec = (AD_BAS_3212_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.tot_clas%>
<%= curlistRec.clr_clas%>
<%= curlistRec.asum_pubc_amt%>
<%= curlistRec.advt_ocpy_rate%>
<%= curlistRec.c0201_pcnt%>
<%= curlistRec.c0202_pcnt%>
<%= curlistRec.c0203_pcnt%>
<%= curlistRec.c0204_pcnt%>
<%= curlistRec.c0205_pcnt%>
<%= curlistRec.c0206_pcnt%>
<%= curlistRec.c0207_sect_nm%>
<%= curlistRec.c0207_pcnt%>
<%= curlistRec.c0208_sect_nm%>
<%= curlistRec.c0208_pcnt%>
<%= curlistRec.c0209_sect_nm%>
<%= curlistRec.c0209_out_clsf%>
<%= curlistRec.c0210_sect_nm%>
<%= curlistRec.c0210_out_clsf%>
<%= curlistRec.c0211_sect_nm%>
<%= curlistRec.c0211_out_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 17:45:39 KST 2009 */