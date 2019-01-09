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


public class MT_PAPORD_8101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_8101_LDataSet(){}
	public MT_PAPORD_8101_LDataSet(String errcode, String errmsg){
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
			MT_PAPORD_8101_LCURLISTRecord rec = new MT_PAPORD_8101_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.papcmpy_clsf = Util.checkString(rset0.getString("papcmpy_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.papcmpy_nm = Util.checkString(rset0.getString("papcmpy_nm"));
			rec.d1 = Util.checkString(rset0.getString("d1"));
			rec.d2 = Util.checkString(rset0.getString("d2"));
			rec.d3 = Util.checkString(rset0.getString("d3"));
			rec.d4 = Util.checkString(rset0.getString("d4"));
			rec.d5 = Util.checkString(rset0.getString("d5"));
			rec.d6 = Util.checkString(rset0.getString("d6"));
			rec.d7 = Util.checkString(rset0.getString("d7"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPORD_8101_LDataSet ds = (MT_PAPORD_8101_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPORD_8101_LCURLISTRecord curlistRec = (MT_PAPORD_8101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.fac_clsf%>
<%= curlistRec.papcmpy_cd%>
<%= curlistRec.papcmpy_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.papcmpy_nm%>
<%= curlistRec.d1%>
<%= curlistRec.d2%>
<%= curlistRec.d3%>
<%= curlistRec.d4%>
<%= curlistRec.d5%>
<%= curlistRec.d6%>
<%= curlistRec.d7%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 30 17:24:33 KST 2016 */