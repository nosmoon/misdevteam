/***************************************************************************************************
* 파일명 : SS_L_DSCTSTAT_TMDataSet.java
* 기능 : 상담원-불편통계를 위한 DataSet
* 작성일자 : 2004-07-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.rec.*;

/**
 * 상담원-불편통계를 위한 DataSet
 */


public class SS_L_DSCTSTAT_TMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dsctlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long count;

	public SS_L_DSCTSTAT_TMDataSet(){}
	public SS_L_DSCTSTAT_TMDataSet(String errcode, String errmsg, long count){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.count = count;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCount(long count){
		this.count = count;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getCount(){
		return this.count;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_L_DSCTSTAT_TMDSCTLISTRecord rec = new SS_L_DSCTSTAT_TMDSCTLISTRecord();
			rec.dscttypecd = Util.checkString(rset0.getString("dscttypecd"));
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.dscttypenm = Util.checkString(rset0.getString("dscttypenm"));
			rec.col1 = rset0.getInt("col1");
			rec.col2 = rset0.getInt("col2");
			rec.col3 = rset0.getInt("col3");
			rec.col4 = rset0.getInt("col4");
			rec.col5 = rset0.getInt("col5");
			rec.col6 = rset0.getInt("col6");
			rec.col7 = rset0.getInt("col7");
			rec.col8 = rset0.getInt("col8");
			rec.col9 = rset0.getInt("col9");
			rec.col10 = rset0.getInt("col10");
			rec.col11 = rset0.getInt("col11");
			this.dsctlist.add(rec);
		}
		this.count = cstmt.getLong(6);
	}

	public String dsctlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord rec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)dsctlist.get(i);
			
			
			String code = rec.dscttypecd;
			String name = rec.gubun;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String dsctlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord rec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)dsctlist.get(i);
			
			
			String code = rec.dscttypecd;
			String name = rec.gubun;
			
			sb.append("<input name=\"");
			sb.append("dscttypecd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dsctlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord rec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)dsctlist.get(i);
			
			
			String code = rec.dscttypecd;
			String name = rec.gubun;
			
			sb.append("<input name=\"");
			sb.append("dscttypecd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_DSCTSTAT_TMDataSet ds = (SS_L_DSCTSTAT_TMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dsctlist.size(); i++){
		SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDsctlist()%>
<%= ds.getCount()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dsctlistRec.dscttypecd%>
<%= dsctlistRec.gubun%>
<%= dsctlistRec.dscttypenm%>
<%= dsctlistRec.col1%>
<%= dsctlistRec.col2%>
<%= dsctlistRec.col3%>
<%= dsctlistRec.col4%>
<%= dsctlistRec.col5%>
<%= dsctlistRec.col6%>
<%= dsctlistRec.col7%>
<%= dsctlistRec.col8%>
<%= dsctlistRec.col9%>
<%= dsctlistRec.col10%>
<%= dsctlistRec.col11%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 23 20:54:08 KST 2004 */