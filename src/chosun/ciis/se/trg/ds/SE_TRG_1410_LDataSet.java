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


public class SE_TRG_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String evlu_seq;
	public String schgb;
	public long colcnt;
	public String title;
	public String bo_grp;
	public String bo_cnt;
	public long bo_cnt_sum;
	public long real_bocnt;

	public SE_TRG_1410_LDataSet(){}
	public SE_TRG_1410_LDataSet(String errcode, String errmsg, String evlu_seq, String schgb, long colcnt, String title, String bo_grp, String bo_cnt, long bo_cnt_sum, long real_bocnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.evlu_seq = evlu_seq;
		this.schgb = schgb;
		this.colcnt = colcnt;
		this.title = title;
		this.bo_grp = bo_grp;
		this.bo_cnt = bo_cnt;
		this.bo_cnt_sum = bo_cnt_sum;
		this.real_bocnt = real_bocnt;
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

	public void setSchgb(String schgb){
		this.schgb = schgb;
	}

	public void setColcnt(long colcnt){
		this.colcnt = colcnt;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setBo_grp(String bo_grp){
		this.bo_grp = bo_grp;
	}

	public void setBo_cnt(String bo_cnt){
		this.bo_cnt = bo_cnt;
	}

	public void setBo_cnt_sum(long bo_cnt_sum){
		this.bo_cnt_sum = bo_cnt_sum;
	}

	public void setReal_bocnt(long real_bocnt){
		this.real_bocnt = real_bocnt;
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

	public String getSchgb(){
		return this.schgb;
	}

	public long getColcnt(){
		return this.colcnt;
	}

	public String getTitle(){
		return this.title;
	}

	public String getBo_grp(){
		return this.bo_grp;
	}

	public String getBo_cnt(){
		return this.bo_cnt;
	}

	public long getBo_cnt_sum(){
		return this.bo_cnt_sum;
	}

	public long getReal_bocnt(){
		return this.real_bocnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.evlu_seq = Util.checkString(cstmt.getString(9));
		this.schgb = Util.checkString(cstmt.getString(10));
		this.colcnt = cstmt.getLong(11);
		this.title = Util.checkString(cstmt.getString(12));
		this.bo_grp = Util.checkString(cstmt.getString(13));
		this.bo_cnt = Util.checkString(cstmt.getString(14));
		this.bo_cnt_sum = cstmt.getLong(15);
		this.real_bocnt = cstmt.getLong(16);
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			SE_TRG_1410_LCURLISTRecord rec = new SE_TRG_1410_LCURLISTRecord();
			rec.evlu_grp = Util.checkString(rset0.getString("evlu_grp"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.thmmsendqty = Util.checkString(rset0.getString("thmmsendqty"));
			rec.chrg_flnm = Util.checkString(rset0.getString("chrg_flnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TRG_1410_LDataSet ds = (SE_TRG_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1410_LCURLISTRecord curlistRec = (SE_TRG_1410_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEvlu_seq()%>
<%= ds.getSchgb()%>
<%= ds.getColcnt()%>
<%= ds.getTitle()%>
<%= ds.getBo_grp()%>
<%= ds.getBo_cnt()%>
<%= ds.getBo_cnt_sum()%>
<%= ds.getReal_bocnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.evlu_grp%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.thmmsendqty%>
<%= curlistRec.chrg_flnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 10:17:32 KST 2009 */