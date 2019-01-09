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


public class MT_OUTSDELMT_3001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_OUTSDELMT_3001_LDataSet(){}
	public MT_OUTSDELMT_3001_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_OUTSDELMT_3001_LCURLISTRecord rec = new MT_OUTSDELMT_3001_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.outsd_elmt_clsf = Util.checkString(rset0.getString("outsd_elmt_clsf"));
			rec.outsd_elmt_clsf_nm = Util.checkString(rset0.getString("outsd_elmt_clsf_nm"));
			rec.outsd_elmt_cd = Util.checkString(rset0.getString("outsd_elmt_cd"));
			rec.outsd_elmt_cd_nm = Util.checkString(rset0.getString("outsd_elmt_cd_nm"));
			rec.outsd_elmt_amt = Util.checkString(rset0.getString("outsd_elmt_amt"));
			rec.cmps_cost = Util.checkString(rset0.getString("cmps_cost"));
			rec.cmps_ratio = Util.checkString(rset0.getString("cmps_ratio"));
			rec.cmps_calc = Util.checkString(rset0.getString("cmps_calc"));
			rec.chg_ratio_yn = Util.checkString(rset0.getString("chg_ratio_yn"));
			rec.chg_cost = Util.checkString(rset0.getString("chg_cost"));
			rec.chg_ratio = Util.checkString(rset0.getString("chg_ratio"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_OUTSDELMT_3001_LDataSet ds = (MT_OUTSDELMT_3001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_OUTSDELMT_3001_LCURLISTRecord curlistRec = (MT_OUTSDELMT_3001_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.sub_seq%>
<%= curlistRec.outsd_elmt_clsf%>
<%= curlistRec.outsd_elmt_clsf_nm%>
<%= curlistRec.outsd_elmt_cd%>
<%= curlistRec.outsd_elmt_cd_nm%>
<%= curlistRec.outsd_elmt_amt%>
<%= curlistRec.cmps_cost%>
<%= curlistRec.cmps_ratio%>
<%= curlistRec.cmps_calc%>
<%= curlistRec.chg_ratio_yn%>
<%= curlistRec.chg_cost%>
<%= curlistRec.chg_ratio%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 21:02:40 KST 2009 */