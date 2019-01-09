/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_2200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_2200_LDataSet(){}
	public MT_SUBMATROUT_2200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_SUBMATROUT_2200_LCURLISTRecord rec = new MT_SUBMATROUT_2200_LCURLISTRecord();
			rec.gb = Util.checkString(rset0.getString("gb"));
			rec.bjcidat = Util.checkString(rset0.getString("bjcidat"));
			rec.jcjjcdnm = Util.checkString(rset0.getString("jcjjcdnm"));
			rec.factcdnm = Util.checkString(rset0.getString("factcdnm"));
			rec.mov_qunt = Util.checkString(rset0.getString("mov_qunt"));
			rec.mov_unit = Util.checkString(rset0.getString("mov_unit"));
			rec.mov_uprc = Util.checkString(rset0.getString("mov_uprc"));
			rec.mov_amt = Util.checkString(rset0.getString("mov_amt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATROUT_2200_LDataSet ds = (MT_SUBMATROUT_2200_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_2200_LCURLISTRecord curlistRec = (MT_SUBMATROUT_2200_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.gb%>
<%= curlistRec.bjcidat%>
<%= curlistRec.jcjjcdnm%>
<%= curlistRec.factcdnm%>
<%= curlistRec.mov_qunt%>
<%= curlistRec.mov_unit%>
<%= curlistRec.mov_uprc%>
<%= curlistRec.mov_amt%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Mar 28 16:50:30 KST 2009 */