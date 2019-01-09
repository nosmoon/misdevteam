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
import chosun.ciis.ad.bas.rec.AD_BAS_3210_LCURLIST1Record;
import chosun.ciis.ad.bas.rec.AD_BAS_3210_LCURLIST2Record;
import chosun.ciis.ad.bas.rec.AD_BAS_3210_LCURLIST3Record;
import chosun.ciis.ad.bas.rec.AD_BAS_3210_LCURLIST4Record;

/**
 * 
 */


public class AD_BAS_3210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3210_LDataSet(){}
	public AD_BAS_3210_LDataSet(String errcode, String errmsg){
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
			AD_BAS_3210_LCURLIST1Record rec = new AD_BAS_3210_LCURLIST1Record();
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
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AD_BAS_3210_LCURLIST2Record rec = new AD_BAS_3210_LCURLIST2Record();
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.tot_pcnt = Util.checkString(rset1.getString("tot_pcnt"));
			rec.tot_clas = Util.checkString(rset1.getString("tot_clas"));
			rec.clr_clas = Util.checkString(rset1.getString("clr_clas"));
			rec.asum_pubc_amt = Util.checkString(rset1.getString("asum_pubc_amt"));
			rec.advt_ocpy_rate = Util.checkString(rset1.getString("advt_ocpy_rate"));
			rec.c0201_pcnt = Util.checkString(rset1.getString("c0201_pcnt"));
			rec.c0202_pcnt = Util.checkString(rset1.getString("c0202_pcnt"));
			rec.c0203_pcnt = Util.checkString(rset1.getString("c0203_pcnt"));
			rec.c0204_pcnt = Util.checkString(rset1.getString("c0204_pcnt"));
			rec.c0205_pcnt = Util.checkString(rset1.getString("c0205_pcnt"));
			rec.c0206_pcnt = Util.checkString(rset1.getString("c0206_pcnt"));
			rec.c0207_sect_nm = Util.checkString(rset1.getString("c0207_sect_nm"));
			rec.c0207_pcnt = Util.checkString(rset1.getString("c0207_pcnt"));
			rec.c0208_sect_nm = Util.checkString(rset1.getString("c0208_sect_nm"));
			rec.c0208_pcnt = Util.checkString(rset1.getString("c0208_pcnt"));
			rec.c0209_sect_nm = Util.checkString(rset1.getString("c0209_sect_nm"));
			rec.c0209_out_clsf = Util.checkString(rset1.getString("c0209_out_clsf"));
			rec.c0210_sect_nm = Util.checkString(rset1.getString("c0210_sect_nm"));
			rec.c0210_out_clsf = Util.checkString(rset1.getString("c0210_out_clsf"));
			rec.c0211_sect_nm = Util.checkString(rset1.getString("c0211_sect_nm"));
			rec.c0211_out_clsf = Util.checkString(rset1.getString("c0211_out_clsf"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			AD_BAS_3210_LCURLIST3Record rec = new AD_BAS_3210_LCURLIST3Record();
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.tot_pcnt = Util.checkString(rset2.getString("tot_pcnt"));
			rec.tot_cell = Util.checkString(rset2.getString("tot_cell"));
			rec.clr_cell = Util.checkString(rset2.getString("clr_cell"));
			rec.asum_pubc_amt = Util.checkString(rset2.getString("asum_pubc_amt"));
			rec.advt_ocpy_rate = Util.checkString(rset2.getString("advt_ocpy_rate"));
			rec.c0301_pcnt = Util.checkString(rset2.getString("c0301_pcnt"));
			rec.c0302_pcnt = Util.checkString(rset2.getString("c0302_pcnt"));
			rec.c0303_sect_nm = Util.checkString(rset2.getString("c0303_sect_nm"));
			rec.c0303_pcnt = Util.checkString(rset2.getString("c0303_pcnt"));
			rec.c0304_sect_nm = Util.checkString(rset2.getString("c0304_sect_nm"));
			rec.c0304_pcnt = Util.checkString(rset2.getString("c0304_pcnt"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			AD_BAS_3210_LCURLIST4Record rec = new AD_BAS_3210_LCURLIST4Record();
			rec.seq = Util.checkString(rset3.getString("seq"));
			rec.tot_pcnt = Util.checkString(rset3.getString("tot_pcnt"));
			rec.tot_clas = Util.checkString(rset3.getString("tot_clas"));
			rec.asum_pubc_amt = Util.checkString(rset3.getString("asum_pubc_amt"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3210_LDataSet ds = (AD_BAS_3210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_3210_LCURLIST1Record curlist1Rec = (AD_BAS_3210_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_3210_LCURLIST2Record curlist2Rec = (AD_BAS_3210_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_3210_LCURLIST3Record curlist3Rec = (AD_BAS_3210_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_3210_LCURLIST4Record curlist4Rec = (AD_BAS_3210_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.seq%>
<%= curlist1Rec.tot_pcnt%>
<%= curlist1Rec.tot_cell%>
<%= curlist1Rec.clr_cell%>
<%= curlist1Rec.asum_pubc_amt%>
<%= curlist1Rec.advt_ocpy_rate%>
<%= curlist1Rec.c0101_pcnt%>
<%= curlist1Rec.c0102_pcnt%>
<%= curlist1Rec.c0103_pcnt%>
<%= curlist1Rec.c0104_pcnt%>
<%= curlist1Rec.c0105_pcnt%>
<%= curlist1Rec.c0106_pcnt%>
<%= curlist1Rec.c0107_pcnt%>
<%= curlist1Rec.c0108_sect_nm%>
<%= curlist1Rec.c0108_pcnt%>
<%= curlist1Rec.c0109_sect_nm%>
<%= curlist1Rec.c0109_pcnt%>
<%= curlist1Rec.c0110_sect_nm%>
<%= curlist1Rec.c0110_out_clsf%>
<%= curlist1Rec.c0111_sect_nm%>
<%= curlist1Rec.c0111_out_clsf%>
<%= curlist1Rec.c0112_sect_nm%>
<%= curlist1Rec.c0112_out_clsf%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.tot_pcnt%>
<%= curlist2Rec.tot_clas%>
<%= curlist2Rec.clr_clas%>
<%= curlist2Rec.asum_pubc_amt%>
<%= curlist2Rec.advt_ocpy_rate%>
<%= curlist2Rec.c0201_pcnt%>
<%= curlist2Rec.c0202_pcnt%>
<%= curlist2Rec.c0203_pcnt%>
<%= curlist2Rec.c0204_pcnt%>
<%= curlist2Rec.c0205_pcnt%>
<%= curlist2Rec.c0206_pcnt%>
<%= curlist2Rec.c0207_sect_nm%>
<%= curlist2Rec.c0207_pcnt%>
<%= curlist2Rec.c0208_sect_nm%>
<%= curlist2Rec.c0208_pcnt%>
<%= curlist2Rec.c0209_sect_nm%>
<%= curlist2Rec.c0209_out_clsf%>
<%= curlist2Rec.c0210_sect_nm%>
<%= curlist2Rec.c0210_out_clsf%>
<%= curlist2Rec.c0211_sect_nm%>
<%= curlist2Rec.c0211_out_clsf%>
<%= curlist3Rec.seq%>
<%= curlist3Rec.tot_pcnt%>
<%= curlist3Rec.tot_cell%>
<%= curlist3Rec.clr_cell%>
<%= curlist3Rec.asum_pubc_amt%>
<%= curlist3Rec.advt_ocpy_rate%>
<%= curlist3Rec.c0301_pcnt%>
<%= curlist3Rec.c0302_pcnt%>
<%= curlist3Rec.c0303_sect_nm%>
<%= curlist3Rec.c0303_pcnt%>
<%= curlist3Rec.c0304_sect_nm%>
<%= curlist3Rec.c0304_pcnt%>
<%= curlist4Rec.seq%>
<%= curlist4Rec.tot_pcnt%>
<%= curlist4Rec.tot_clas%>
<%= curlist4Rec.asum_pubc_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 14:11:18 KST 2009 */