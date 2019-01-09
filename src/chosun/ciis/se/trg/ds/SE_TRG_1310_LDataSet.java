/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class SE_TRG_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_TRG_1310_LDataSet(){}
	public SE_TRG_1310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_TRG_1310_LCURLISTRecord rec = new SE_TRG_1310_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.feat_clsf = Util.checkString(rset0.getString("feat_clsf"));
			rec.col1 = Util.checkString(rset0.getString("col1"));
			rec.col2 = Util.checkString(rset0.getString("col2"));
			rec.col3 = Util.checkString(rset0.getString("col3"));
			rec.col4 = Util.checkString(rset0.getString("col4"));
			rec.col5 = Util.checkString(rset0.getString("col5"));
			rec.col6 = Util.checkString(rset0.getString("col6"));
			rec.col7 = Util.checkString(rset0.getString("col7"));
			rec.col8 = Util.checkString(rset0.getString("col8"));
			rec.col9 = Util.checkString(rset0.getString("col9"));
			rec.col10 = Util.checkString(rset0.getString("col10"));
			rec.col11 = Util.checkString(rset0.getString("col11"));
			rec.col12 = Util.checkString(rset0.getString("col12"));
			rec.col13 = Util.checkString(rset0.getString("col13"));
			rec.col14 = Util.checkString(rset0.getString("col14"));
			rec.col15 = Util.checkString(rset0.getString("col15"));
			rec.col16 = Util.checkString(rset0.getString("col16"));
			rec.col17 = Util.checkString(rset0.getString("col17"));
			rec.col18 = Util.checkString(rset0.getString("col18"));
			rec.col19 = Util.checkString(rset0.getString("col19"));
			rec.col20 = Util.checkString(rset0.getString("col20"));
			rec.col21 = Util.checkString(rset0.getString("col21"));
			rec.col22 = Util.checkString(rset0.getString("col22"));
			rec.col23 = Util.checkString(rset0.getString("col23"));
			rec.col24 = Util.checkString(rset0.getString("col24"));
			rec.col25 = Util.checkString(rset0.getString("col25"));
			rec.col26 = Util.checkString(rset0.getString("col26"));
			rec.col27 = Util.checkString(rset0.getString("col27"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TRG_1310_LDataSet ds = (SE_TRG_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1310_LCURLISTRecord curlistRec = (SE_TRG_1310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.feat_clsf%>
<%= curlistRec.col1%>
<%= curlistRec.col2%>
<%= curlistRec.col3%>
<%= curlistRec.col4%>
<%= curlistRec.col5%>
<%= curlistRec.col6%>
<%= curlistRec.col7%>
<%= curlistRec.col8%>
<%= curlistRec.col9%>
<%= curlistRec.col10%>
<%= curlistRec.col11%>
<%= curlistRec.col12%>
<%= curlistRec.col13%>
<%= curlistRec.col14%>
<%= curlistRec.col15%>
<%= curlistRec.col16%>
<%= curlistRec.col17%>
<%= curlistRec.col18%>
<%= curlistRec.col19%>
<%= curlistRec.col20%>
<%= curlistRec.col21%>
<%= curlistRec.col22%>
<%= curlistRec.col23%>
<%= curlistRec.col24%>
<%= curlistRec.col25%>
<%= curlistRec.col26%>
<%= curlistRec.col27%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 24 20:42:51 KST 2009 */