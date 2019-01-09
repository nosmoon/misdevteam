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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_7002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_7002_LDataSet(){}
	public MT_PAPORD_7002_LDataSet(String errcode, String errmsg){
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
			MT_PAPORD_7002_LCURLISTRecord rec = new MT_PAPORD_7002_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.roll_wgt = Util.checkString(rset0.getString("roll_wgt"));
			rec.ordr_roll_cnt_1 = Util.checkString(rset0.getString("ordr_roll_cnt_1"));
			rec.ordr_wgt_1 = Util.checkString(rset0.getString("ordr_wgt_1"));
			rec.ordr_roll_cnt_2 = Util.checkString(rset0.getString("ordr_roll_cnt_2"));
			rec.ordr_wgt_2 = Util.checkString(rset0.getString("ordr_wgt_2"));
			rec.ordr_roll_cnt_3 = Util.checkString(rset0.getString("ordr_roll_cnt_3"));
			rec.ordr_wgt_3 = Util.checkString(rset0.getString("ordr_wgt_3"));
			rec.ordr_roll_cnt_4 = Util.checkString(rset0.getString("ordr_roll_cnt_4"));
			rec.ordr_wgt_4 = Util.checkString(rset0.getString("ordr_wgt_4"));
			rec.ordr_roll_cnt_5 = Util.checkString(rset0.getString("ordr_roll_cnt_5"));
			rec.ordr_wgt_5 = Util.checkString(rset0.getString("ordr_wgt_5"));
			rec.ordr_roll_cnt_6 = Util.checkString(rset0.getString("ordr_roll_cnt_6"));
			rec.ordr_wgt_6 = Util.checkString(rset0.getString("ordr_wgt_6"));
			rec.ordr_roll_cnt_7 = Util.checkString(rset0.getString("ordr_roll_cnt_7"));
			rec.ordr_wgt_7 = Util.checkString(rset0.getString("ordr_wgt_7"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPORD_7002_LDataSet ds = (MT_PAPORD_7002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPORD_7002_LCURLISTRecord curlistRec = (MT_PAPORD_7002_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.roll_wgt%>
<%= curlistRec.ordr_roll_cnt_1%>
<%= curlistRec.ordr_wgt_1%>
<%= curlistRec.ordr_roll_cnt_2%>
<%= curlistRec.ordr_wgt_2%>
<%= curlistRec.ordr_roll_cnt_3%>
<%= curlistRec.ordr_wgt_3%>
<%= curlistRec.ordr_roll_cnt_4%>
<%= curlistRec.ordr_wgt_4%>
<%= curlistRec.ordr_roll_cnt_5%>
<%= curlistRec.ordr_wgt_5%>
<%= curlistRec.ordr_roll_cnt_6%>
<%= curlistRec.ordr_wgt_6%>
<%= curlistRec.ordr_roll_cnt_7%>
<%= curlistRec.ordr_wgt_7%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 04 15:32:01 KST 2009 */