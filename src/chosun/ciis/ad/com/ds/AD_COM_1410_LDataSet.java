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


package chosun.ciis.ad.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.com.dm.*;
import chosun.ciis.ad.com.rec.*;

/**
 * 
 */


public class AD_COM_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist_k1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt1;
	public long totalcnt2;

	public AD_COM_1410_LDataSet(){}
	public AD_COM_1410_LDataSet(String errcode, String errmsg, long totalcnt1, long totalcnt2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt1 = totalcnt1;
		this.totalcnt2 = totalcnt2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt1(long totalcnt1){
		this.totalcnt1 = totalcnt1;
	}

	public void setTotalcnt2(long totalcnt2){
		this.totalcnt2 = totalcnt2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt1(){
		return this.totalcnt1;
	}

	public long getTotalcnt2(){
		return this.totalcnt2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totalcnt1 = cstmt.getLong(5);
		this.totalcnt2 = cstmt.getLong(6);
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_COM_1410_LCURLIST1Record rec = new AD_COM_1410_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.srch_dt = Util.checkString(rset0.getString("srch_dt"));
			rec.seq = rset0.getInt("seq");
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.advt_size = Util.checkString(rset0.getString("advt_size"));
			rec.chro_clsf = Util.checkString(rset0.getString("chro_clsf"));
			rec.srch_plac = Util.checkString(rset0.getString("srch_plac"));
			rec.cntc_plac = Util.checkString(rset0.getString("cntc_plac"));
			rec.tm = Util.checkString(rset0.getString("tm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.sect_clsf = Util.checkString(rset0.getString("sect_clsf"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AD_COM_1410_LCURLIST2Record rec = new AD_COM_1410_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.cnfm_dt = Util.checkString(rset1.getString("cnfm_dt"));
			rec.seq = rset1.getInt("seq");
			rec.pubc_side = Util.checkString(rset1.getString("pubc_side"));
			rec.advcs = Util.checkString(rset1.getString("advcs"));
			rec.std = Util.checkString(rset1.getString("std"));
			rec.slcrg = Util.checkString(rset1.getString("slcrg"));
			rec.cnfm_matt = Util.checkString(rset1.getString("cnfm_matt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			AD_COM_1410_LCURLIST_K1Record rec = new AD_COM_1410_LCURLIST_K1Record();
			rec.kjp_0 = Util.checkString(rset2.getString("kjp_0"));
			rec.kjp_1 = Util.checkString(rset2.getString("kjp_1"));
			rec.kjp_2 = Util.checkString(rset2.getString("kjp_2"));
			rec.kjp_3 = Util.checkString(rset2.getString("kjp_3"));
			rec.kjp_4 = Util.checkString(rset2.getString("kjp_4"));
			rec.kjp_5 = Util.checkString(rset2.getString("kjp_5"));
			rec.kjp_cnt = Util.checkString(rset2.getString("kjp_cnt"));
			this.curlist_k1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_COM_1410_LDataSet ds = (AD_COM_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_COM_1410_LCURLIST1Record curlist1Rec = (AD_COM_1410_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_COM_1410_LCURLIST2Record curlist2Rec = (AD_COM_1410_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_k1.size(); i++){
		AD_COM_1410_LCURLIST_K1Record curlist_k1Rec = (AD_COM_1410_LCURLIST_K1Record)ds.curlist_k1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt1()%>
<%= ds.getTotalcnt2()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist_k1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.srch_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.chrg_pers%>
<%= curlist1Rec.advt_cont%>
<%= curlist1Rec.advt_size%>
<%= curlist1Rec.chro_clsf%>
<%= curlist1Rec.srch_plac%>
<%= curlist1Rec.cntc_plac%>
<%= curlist1Rec.tm%>
<%= curlist1Rec.agn%>
<%= curlist1Rec.sect_clsf%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.cnfm_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.pubc_side%>
<%= curlist2Rec.advcs%>
<%= curlist2Rec.std%>
<%= curlist2Rec.slcrg%>
<%= curlist2Rec.cnfm_matt%>
<%= curlist_k1Rec.kjp_0%>
<%= curlist_k1Rec.kjp_1%>
<%= curlist_k1Rec.kjp_2%>
<%= curlist_k1Rec.kjp_3%>
<%= curlist_k1Rec.kjp_4%>
<%= curlist_k1Rec.kjp_5%>
<%= curlist_k1Rec.kjp_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 27 17:31:31 KST 2012 */