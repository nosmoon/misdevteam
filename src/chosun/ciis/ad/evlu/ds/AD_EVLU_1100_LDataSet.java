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


public class AD_EVLU_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String cnt;

	public AD_EVLU_1100_LDataSet(){}
	public AD_EVLU_1100_LDataSet(String errcode, String errmsg, String cnt){
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
			AD_EVLU_1100_LCURLIST2Record rec = new AD_EVLU_1100_LCURLIST2Record();
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
	AD_EVLU_1100_LDataSet ds = (AD_EVLU_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EVLU_1100_LCURLISTRecord curlistRec = (AD_EVLU_1100_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_EVLU_1100_LCURLIST2Record curlist2Rec = (AD_EVLU_1100_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlistRec.pubc_dd%>
<%= curlistRec.pubc_yyyymmdd%>
<%= curlistRec.emp_no_t1%>
<%= curlistRec.paper_scor_t1%>
<%= curlistRec.pubsh_scor_t1%>
<%= curlistRec.pric_scor_t1%>
<%= curlistRec.spcl_scor_t1%>
<%= curlistRec.adj_evlu_scor_t1%>
<%= curlistRec.emp_no_t2%>
<%= curlistRec.paper_scor_t2%>
<%= curlistRec.pubsh_scor_t2%>
<%= curlistRec.pric_scor_t2%>
<%= curlistRec.spcl_scor_t2%>
<%= curlistRec.adj_evlu_scor_t2%>
<%= curlistRec.emp_no_t3%>
<%= curlistRec.paper_scor_t3%>
<%= curlistRec.pubsh_scor_t3%>
<%= curlistRec.pric_scor_t3%>
<%= curlistRec.spcl_scor_t3%>
<%= curlistRec.adj_evlu_scor_t3%>
<%= curlistRec.emp_no_t4%>
<%= curlistRec.paper_scor_t4%>
<%= curlistRec.pubsh_scor_t4%>
<%= curlistRec.pric_scor_t4%>
<%= curlistRec.spcl_scor_t4%>
<%= curlistRec.adj_evlu_scor_t4%>
<%= curlistRec.emp_no_t5%>
<%= curlistRec.paper_scor_t5%>
<%= curlistRec.pubsh_scor_t5%>
<%= curlistRec.pric_scor_t5%>
<%= curlistRec.spcl_scor_t5%>
<%= curlistRec.adj_evlu_scor_t5%>
<%= curlistRec.emp_no_t6%>
<%= curlistRec.paper_scor_t6%>
<%= curlistRec.pubsh_scor_t6%>
<%= curlistRec.pric_scor_t6%>
<%= curlistRec.spcl_scor_t6%>
<%= curlistRec.adj_evlu_scor_t6%>
<%= curlistRec.emp_no_t7%>
<%= curlistRec.paper_scor_t7%>
<%= curlistRec.pubsh_scor_t7%>
<%= curlistRec.pric_scor_t7%>
<%= curlistRec.spcl_scor_t7%>
<%= curlistRec.adj_evlu_scor_t7%>
<%= curlistRec.emp_no_t8%>
<%= curlistRec.paper_scor_t8%>
<%= curlistRec.pubsh_scor_t8%>
<%= curlistRec.pric_scor_t8%>
<%= curlistRec.spcl_scor_t8%>
<%= curlistRec.adj_evlu_scor_t8%>
<%= curlistRec.emp_no_t9%>
<%= curlistRec.paper_scor_t9%>
<%= curlistRec.pubsh_scor_t9%>
<%= curlistRec.pric_scor_t9%>
<%= curlistRec.spcl_scor_t9%>
<%= curlistRec.adj_evlu_scor_t9%>
<%= curlistRec.emp_no_t10%>
<%= curlistRec.paper_scor_t10%>
<%= curlistRec.pubsh_scor_t10%>
<%= curlistRec.pric_scor_t10%>
<%= curlistRec.spcl_scor_t10%>
<%= curlistRec.adj_evlu_scor_t10%>
<%= curlistRec.emp_no_t11%>
<%= curlistRec.paper_scor_t11%>
<%= curlistRec.pubsh_scor_t11%>
<%= curlistRec.pric_scor_t11%>
<%= curlistRec.spcl_scor_t11%>
<%= curlistRec.adj_evlu_scor_t11%>
<%= curlistRec.emp_no_t12%>
<%= curlistRec.paper_scor_t12%>
<%= curlistRec.pubsh_scor_t12%>
<%= curlistRec.pric_scor_t12%>
<%= curlistRec.spcl_scor_t12%>
<%= curlistRec.adj_evlu_scor_t12%>
<%= curlistRec.emp_no_t13%>
<%= curlistRec.paper_scor_t13%>
<%= curlistRec.pubsh_scor_t13%>
<%= curlistRec.pric_scor_t13%>
<%= curlistRec.spcl_scor_t13%>
<%= curlistRec.adj_evlu_scor_t13%>
<%= curlistRec.emp_no_t14%>
<%= curlistRec.paper_scor_t14%>
<%= curlistRec.pubsh_scor_t14%>
<%= curlistRec.pric_scor_t14%>
<%= curlistRec.spcl_scor_t14%>
<%= curlistRec.adj_evlu_scor_t14%>
<%= curlistRec.emp_no_t15%>
<%= curlistRec.paper_scor_t15%>
<%= curlistRec.pubsh_scor_t15%>
<%= curlistRec.pric_scor_t15%>
<%= curlistRec.spcl_scor_t15%>
<%= curlistRec.adj_evlu_scor_t15%>
<%= curlistRec.emp_no_t16%>
<%= curlistRec.paper_scor_t16%>
<%= curlistRec.pubsh_scor_t16%>
<%= curlistRec.pric_scor_t16%>
<%= curlistRec.spcl_scor_t16%>
<%= curlistRec.adj_evlu_scor_t16%>
<%= curlistRec.emp_no_t17%>
<%= curlistRec.paper_scor_t17%>
<%= curlistRec.pubsh_scor_t17%>
<%= curlistRec.pric_scor_t17%>
<%= curlistRec.spcl_scor_t17%>
<%= curlistRec.adj_evlu_scor_t17%>
<%= curlistRec.emp_no_t18%>
<%= curlistRec.paper_scor_t18%>
<%= curlistRec.pubsh_scor_t18%>
<%= curlistRec.pric_scor_t18%>
<%= curlistRec.spcl_scor_t18%>
<%= curlistRec.adj_evlu_scor_t18%>
<%= curlistRec.emp_no_t19%>
<%= curlistRec.paper_scor_t19%>
<%= curlistRec.pubsh_scor_t19%>
<%= curlistRec.pric_scor_t19%>
<%= curlistRec.spcl_scor_t19%>
<%= curlistRec.adj_evlu_scor_t19%>
<%= curlistRec.emp_no_t20%>
<%= curlistRec.paper_scor_t20%>
<%= curlistRec.pubsh_scor_t20%>
<%= curlistRec.pric_scor_t20%>
<%= curlistRec.spcl_scor_t20%>
<%= curlistRec.adj_evlu_scor_t20%>
<%= curlistRec.emp_no_t21%>
<%= curlistRec.paper_scor_t21%>
<%= curlistRec.pubsh_scor_t21%>
<%= curlistRec.pric_scor_t21%>
<%= curlistRec.spcl_scor_t21%>
<%= curlistRec.adj_evlu_scor_t21%>
<%= curlistRec.emp_no_t22%>
<%= curlistRec.paper_scor_t22%>
<%= curlistRec.pubsh_scor_t22%>
<%= curlistRec.pric_scor_t22%>
<%= curlistRec.spcl_scor_t22%>
<%= curlistRec.adj_evlu_scor_t22%>
<%= curlistRec.emp_no_t23%>
<%= curlistRec.paper_scor_t23%>
<%= curlistRec.pubsh_scor_t23%>
<%= curlistRec.pric_scor_t23%>
<%= curlistRec.spcl_scor_t23%>
<%= curlistRec.adj_evlu_scor_t23%>
<%= curlistRec.emp_no_t24%>
<%= curlistRec.paper_scor_t24%>
<%= curlistRec.pubsh_scor_t24%>
<%= curlistRec.pric_scor_t24%>
<%= curlistRec.spcl_scor_t24%>
<%= curlistRec.adj_evlu_scor_t24%>
<%= curlistRec.emp_no_t25%>
<%= curlistRec.paper_scor_t25%>
<%= curlistRec.pubsh_scor_t25%>
<%= curlistRec.pric_scor_t25%>
<%= curlistRec.spcl_scor_t25%>
<%= curlistRec.adj_evlu_scor_t25%>
<%= curlistRec.emp_no_t26%>
<%= curlistRec.paper_scor_t26%>
<%= curlistRec.pubsh_scor_t26%>
<%= curlistRec.pric_scor_t26%>
<%= curlistRec.spcl_scor_t26%>
<%= curlistRec.adj_evlu_scor_t26%>
<%= curlistRec.emp_no_t27%>
<%= curlistRec.paper_scor_t27%>
<%= curlistRec.pubsh_scor_t27%>
<%= curlistRec.pric_scor_t27%>
<%= curlistRec.spcl_scor_t27%>
<%= curlistRec.adj_evlu_scor_t27%>
<%= curlistRec.emp_no_t28%>
<%= curlistRec.paper_scor_t28%>
<%= curlistRec.pubsh_scor_t28%>
<%= curlistRec.pric_scor_t28%>
<%= curlistRec.spcl_scor_t28%>
<%= curlistRec.adj_evlu_scor_t28%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.nm_korn%>
<%= curlist2Rec.scortl%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 17 16:26:16 KST 2010 */