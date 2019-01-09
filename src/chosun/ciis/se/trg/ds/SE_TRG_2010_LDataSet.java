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


public class SE_TRG_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String gridtitle;

	public SE_TRG_2010_LDataSet(){}
	public SE_TRG_2010_LDataSet(String errcode, String errmsg, String gridtitle){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.gridtitle = gridtitle;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setGridtitle(String gridtitle){
		this.gridtitle = gridtitle;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getGridtitle(){
		return this.gridtitle;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.gridtitle = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_TRG_2010_LCURLISTRecord rec = new SE_TRG_2010_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.evlu_grp = Util.checkString(rset0.getString("evlu_grp"));
			rec.base_val = Util.checkString(rset0.getString("base_val"));
			rec.trgt1 = Util.checkString(rset0.getString("trgt1"));
			rec.rslt1 = Util.checkString(rset0.getString("rslt1"));
			rec.attain_rate1 = Util.checkString(rset0.getString("attain_rate1"));
			rec.meda_rank1 = Util.checkString(rset0.getString("meda_rank1"));
			rec.trgt2 = Util.checkString(rset0.getString("trgt2"));
			rec.rslt2 = Util.checkString(rset0.getString("rslt2"));
			rec.attain_rate2 = Util.checkString(rset0.getString("attain_rate2"));
			rec.meda_rank2 = Util.checkString(rset0.getString("meda_rank2"));
			rec.trgt3 = Util.checkString(rset0.getString("trgt3"));
			rec.rslt3 = Util.checkString(rset0.getString("rslt3"));
			rec.attain_rate3 = Util.checkString(rset0.getString("attain_rate3"));
			rec.meda_rank3 = Util.checkString(rset0.getString("meda_rank3"));
			rec.trgt4 = Util.checkString(rset0.getString("trgt4"));
			rec.rslt4 = Util.checkString(rset0.getString("rslt4"));
			rec.attain_rate4 = Util.checkString(rset0.getString("attain_rate4"));
			rec.meda_rank4 = Util.checkString(rset0.getString("meda_rank4"));
			rec.trgt5 = Util.checkString(rset0.getString("trgt5"));
			rec.rslt5 = Util.checkString(rset0.getString("rslt5"));
			rec.attain_rate5 = Util.checkString(rset0.getString("attain_rate5"));
			rec.meda_rank5 = Util.checkString(rset0.getString("meda_rank5"));
			rec.trgt6 = Util.checkString(rset0.getString("trgt6"));
			rec.rslt6 = Util.checkString(rset0.getString("rslt6"));
			rec.attain_rate6 = Util.checkString(rset0.getString("attain_rate6"));
			rec.meda_rank6 = Util.checkString(rset0.getString("meda_rank6"));
			rec.rank_scor = Util.checkString(rset0.getString("rank_scor"));
			rec.rslt_scor = Util.checkString(rset0.getString("rslt_scor"));
			rec.rvis_scor = Util.checkString(rset0.getString("rvis_scor"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TRG_2010_LDataSet ds = (SE_TRG_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_2010_LCURLISTRecord curlistRec = (SE_TRG_2010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getGridtitle()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.area_cd%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.evlu_grp%>
<%= curlistRec.base_val%>
<%= curlistRec.trgt1%>
<%= curlistRec.rslt1%>
<%= curlistRec.attain_rate1%>
<%= curlistRec.meda_rank1%>
<%= curlistRec.trgt2%>
<%= curlistRec.rslt2%>
<%= curlistRec.attain_rate2%>
<%= curlistRec.meda_rank2%>
<%= curlistRec.trgt3%>
<%= curlistRec.rslt3%>
<%= curlistRec.attain_rate3%>
<%= curlistRec.meda_rank3%>
<%= curlistRec.trgt4%>
<%= curlistRec.rslt4%>
<%= curlistRec.attain_rate4%>
<%= curlistRec.meda_rank4%>
<%= curlistRec.trgt5%>
<%= curlistRec.rslt5%>
<%= curlistRec.attain_rate5%>
<%= curlistRec.meda_rank5%>
<%= curlistRec.trgt6%>
<%= curlistRec.rslt6%>
<%= curlistRec.attain_rate6%>
<%= curlistRec.meda_rank6%>
<%= curlistRec.rank_scor%>
<%= curlistRec.rslt_scor%>
<%= curlistRec.rvis_scor%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 16:23:39 KST 2009 */