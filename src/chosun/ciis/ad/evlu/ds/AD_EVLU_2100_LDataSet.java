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


package chosun.ciis.ad.evlu.ds;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.rec.*;

/**
 * 
 */


public class AD_EVLU_2100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String cnt;

	public AD_EVLU_2100_LDataSet(){}
	public AD_EVLU_2100_LDataSet(String errcode, String errmsg, String cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cnt = cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCnt(){
		return this.cnt;
	}
	
	public String defaultString(String str, String defaultString)
    {
        if (str == null || str.equals(""))
            return defaultString;
        else
            return str;
    }

	public void getValues(CallableStatement cstmt) throws SQLException{
		//동적으로 컬럼 데이터를 가지고 온다
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		
		Map map = new LinkedHashMap();
		ResultSetMetaData rsmd = rset0.getMetaData();
		int columnCount = rsmd.getColumnCount();
		String[] columnNames = new String[columnCount + 1];
		for ( int i = 1; i <= columnCount; i++ ) {
			columnNames[i] = rsmd.getColumnName(i);
		}
		while(rset0.next()){
			map = new LinkedHashMap();
			for(int i = 1; i <= columnCount; i++){
				map.put( columnNames[i], defaultString((rset0.getString(i))," ") );
			}
			this.curlist.add(map);
		}
		System.out.println(curlist);
	
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AD_EVLU_2100_LCURLIST2Record rec = new AD_EVLU_2100_LCURLIST2Record();
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset1.getString("nm_korn"));
			rec.scortl = Util.checkString(rset1.getString("scortl"));
			this.curlist2.add(rec);
		}
		this.cnt = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_EVLU_2100_LDataSet ds = (AD_EVLU_2100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EVLU_2100_LCURLISTRecord curlistRec = (AD_EVLU_2100_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_EVLU_2100_LCURLIST2Record curlist2Rec = (AD_EVLU_2100_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.ttttt%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.nm_korn%>
<%= curlist2Rec.scortl%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 19 19:05:14 KST 2010 */